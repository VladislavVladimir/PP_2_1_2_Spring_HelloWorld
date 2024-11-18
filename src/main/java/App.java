import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld beanHW1 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW1.getMessage());
        HelloWorld beanHW2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHW2.getMessage());

        Cat beanCat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat1);
        Cat beanCat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat2);

        System.out.println(beanHW1 == beanHW2);
        System.out.println(beanCat1 == beanCat2);

    }
}