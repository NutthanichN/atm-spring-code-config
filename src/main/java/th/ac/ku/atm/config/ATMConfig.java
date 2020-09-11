package th.ac.ku.atm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import th.ac.ku.atm.*;


@Configuration
public class ATMConfig {

    @Bean
    public DataSource dataSource() {
        return new DataSourceFile("customers.txt");
    }

    @Bean
    public Bank bank() {
        return new Bank("My BanK", dataSource());
    }

    @Bean
    public ATM atm() {
        return new ATM(bank());
    }

    @Bean
    public AtmUI atmUI() {
        return new AtmUI(atm());
    }
}
