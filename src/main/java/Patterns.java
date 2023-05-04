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

            }
        }
    }
}
