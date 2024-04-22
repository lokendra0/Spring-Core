package spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml") ;
            HelloWorld helloworld = (HelloWorld) context.getBean("helloWorld", HelloWorld.class);
            helloworld.getMessage();
            
            HelloWorld helloworld2 = (HelloWorld) context.getBean("helloWorld", HelloWorld.class);
            helloworld.getMessage();
            System.out.println(helloworld == helloworld2);
            
            HelloWorld myBeanConstructor = (HelloWorld) context.getBean("myBeanConstructor");
            System.out.println("Constructor injection:");
            myBeanConstructor.displayMessage();
            System.out.println();

            // Setter injection
            HelloWorld myBeanSetter = (HelloWorld) context.getBean("myBeanSetter");
            System.out.println("Setter injection:");
            myBeanSetter.displayMessage();
            System.out.println();

            // Autowiring by type
            HelloWorld myBeanAutowired = (HelloWorld) context.getBean("myBeanAutowired");
            System.out.println("Autowiring by name:");
            myBeanAutowired.displayMessage();
        }
    
}
