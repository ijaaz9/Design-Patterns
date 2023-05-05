import com.ijaaz.patterns.creational.factory.kit.concepts.AbstractFactory;
import com.ijaaz.patterns.creational.factory.kit.interfaces.Bank;
import com.ijaaz.patterns.creational.factory.kit.FactoryCreator;
import com.ijaaz.patterns.creational.factory.kit.concepts.Loan;
import com.ijaaz.patterns.creational.factory.Plan;
import com.ijaaz.patterns.creational.factory.PlanFactory;
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
            }
        }
    }
}
