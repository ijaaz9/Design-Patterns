import com.ijaaz.patterns.creational.factory.kit.concepts.AbstractFactory;
import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;
import com.ijaaz.patterns.creational.factory.kit.FactoryCreator;
import com.ijaaz.patterns.creational.factory.kit.concepts.Loan;
import com.ijaaz.patterns.creational.factory.Plan;
import com.ijaaz.patterns.creational.factory.PlanFactory;
import com.ijaaz.patterns.creational.singleton.Singleton;
import com.ijaaz.patterns.creational.singleton.SingletonThreadsafe;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Patterns {

    public static void main(String[] args) {

        Logger logger = LogManager.getLogger(Patterns.class);

        if(args[0].equalsIgnoreCase("CREATE")){
            switch (args[1].toUpperCase()){
                case "FACTORY_PATTERN":

                    logger.info("Creational patterns: This will focus on " + args[1]);
                    PlanFactory factory = new PlanFactory();
                    Plan plan = factory.getPlan(args[2]);
                    plan.calculateBill();
                    break;

                case "ABSTRACT_FACTORY_PATTERN":

                    logger.info("Creational patterns: This will focus on " + args[1]);
                    AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
                    Bank bank = bankFactory.getBank(args[2]);

                    logger.info("You are taking a loan from: " + bank.getBankName());
                    AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
                    Loan loan = loanFactory.getLoan(args[3]);
                    loan.getInterestRate(12.0);
                    loan.calculateLoanPayment(Double.parseDouble(args[4]),Integer.parseInt(args[5]));
                    break;

                case "SINGLETON":
                    logger.info("Creational patterns: This will focus on " + args[1]);
                    Singleton singleton = Singleton.getInstance(args[2]);
                    Singleton anotersingleton = Singleton.getInstance(args[3]);
                    logger.info("If you see the same value, then singleton was reused (yay!)\n" +
                            "If you see different values, then 2 singletons were created (booo!!)");
                    logger.info(singleton.toString());
                    logger.info(anotersingleton.toString());
                    break;

                case "SINGLETON_MULTI_THREADED":
                    logger.info("Creational patterns: This will focus on " + args[1] +" \nThe same class behaves incorrectly in a multithreaded environment.\n" +
                            "Multiple threads can call the creation method simultaneously and get several instances of Singleton class.");
                    logger.info("If you see the same value, then singleton was reused (yay!)\n" +
                            "If you see different values, then 2 singletons were created (booo!!)");
                    Thread threadFoo = new Thread(new ThreadFoo());
                    Thread threadBar = new Thread(new ThreadBar());
                    threadFoo.start();
                    threadBar.start();
                    break;
                case "SINGLETON_THREAD_SAFE":
                    logger.info("Creational patterns: This will focus on " + args[1] + "\n To fix the problem above, you have to synchronize threads during first creation of the Singleton object.");
                    logger.info("If you see the same value, then singleton was reused (yay!)\n" +
                            "If you see different values, then 2 singletons were created (booo!!)");
                    Thread threadA = new Thread(new ThreadA());
                    Thread threadB = new Thread(new ThreadB());
                    threadA.start();
                    threadB.start();
                    break;

            }
        }
    }

    static class ThreadFoo implements Runnable{

        Logger logger = LogManager.getLogger(ThreadFoo.class);
        @Override
        public void run() {
            SingletonThreadsafe singleton = SingletonThreadsafe.getInstance("FOO");
            logger.info(singleton.toString());
        }
    }

    static class ThreadBar implements Runnable{

        Logger logger = LogManager.getLogger(ThreadBar.class);

        @Override
        public void run() {
            SingletonThreadsafe singleton = SingletonThreadsafe.getInstance("BAR");
            logger.info(singleton.toString());
        }
    }

    static class ThreadA implements Runnable{

        Logger logger = LogManager.getLogger(ThreadA.class);
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("A");
            logger.info(singleton.toString());
        }
    }

    static class ThreadB implements Runnable{

        Logger logger = LogManager.getLogger(ThreadB.class);
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("B");
            logger.info(singleton.toString());
        }
    }
}
