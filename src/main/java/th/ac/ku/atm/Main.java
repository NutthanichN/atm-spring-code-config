package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import th.ac.ku.atm.config.ATMConfig;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
