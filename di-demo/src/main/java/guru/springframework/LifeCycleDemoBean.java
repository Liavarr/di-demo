package guru.springframework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

// Esto es solo un test manin para ver el proceso de los beans
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean , BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifeCycleDemoBean() {
        System.out.println("## I'm in the lyfecycle bean constructor");
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("## The lifecycle has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("## The lifecycle has its properties set");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Beans factory has been set");
    }

    @Override
    public void setBeanName(String name){
        System.out.println("## My name is " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        System.out.println("## Application context factory has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## The post-construct anotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## The pre destroy anotated method has been called");
    }


    public void beforeInit(){
        System.out.println("##  Before init - Called by Bean Post processor");
    }

    public void afterInit(){
        System.out.println("##  After init - Called by Bean Post processor");
    }
}
