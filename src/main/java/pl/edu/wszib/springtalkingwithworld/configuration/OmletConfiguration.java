package pl.edu.wszib.springtalkingwithworld.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pl.edu.wszib.springtalkingwithworld.configuration.omlet.*;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;
import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

@Configuration
public class OmletConfiguration {
    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Jajko jajko() {
        return new Jajko();
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Ser ser() {
        return new Ser();
    }

    @Bean
    @Scope(SCOPE_SINGLETON)
    public Tarka tarka() {
        return new Tarka();
    }

    @Bean
    @Scope(SCOPE_SINGLETON)
    public Patelnia patelnia() {
        return new Patelnia();
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Maslo maslo() {
        return new Maslo();
    }

    @Bean
    @Scope(SCOPE_SINGLETON)
    public Mieszadlo mieszadlo() {
        return new Mieszadlo();
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public TartySer tartySer(Ser ser, Tarka tarka) {
        return new TartySer(ser, tarka);
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Miska miska(Jajko jajko, TartySer tartySer, Mieszadlo mieszadlo) {
        return new Miska(jajko, tartySer, mieszadlo);
    }

    @Bean
    @Scope(SCOPE_PROTOTYPE)
    public Omlet omlet(Patelnia patelnia, Miska miska, Maslo maslo) {
        return new Omlet(patelnia, miska, maslo);
    }
}
