package org.learnspring.core.noxmlconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @ComponentScan anno is not needed when @Bean anno is used because it scans @Component classes
// but we're getting our objects through @Bean anno
//@ComponentScan(basePackages = "org.learnspringcore.noxmlconf")
public class Config
{
    // a name or list of names can also be given which can be used
    // to get the object through context object
    @Bean(name={"beanObj","myAnnoBean"}, initMethod = "myInit", destroyMethod = "myDestroy") // this annotation is equivalent to xml <bean /> tag
    public BeanAnnoClass getBeanAnnoClass()
    {
        return new BeanAnnoClass();
    }

    @Bean
    public Pakora getPakora()
    {
        return new Pakora();
    }

//    @Bean("myBean") // bean name given through it can be called from context object
//    public BeanAnnoClass getBeanAnnoClass()
//    {
////        injecting Pakora object through constructor
//        return new BeanAnnoClass(getPakora());
//    }
}
