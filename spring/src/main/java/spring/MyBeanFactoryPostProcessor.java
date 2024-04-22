package spring;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("Inside BeanFactoryPostProcessor");

        // Let's modify the bean definition
        if (beanFactory.containsBean("helloWorld")) {
            beanFactory.getBeanDefinition("helloWorld").setScope("prototype");
        }
    }
}