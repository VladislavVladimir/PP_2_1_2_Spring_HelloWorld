import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Random;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        Random random = new Random();
        String[] catNames = {"Мурзик", "Барсик", "Котя", "Снежок", "Том", "Луна", "Симба", "Милашка", "Пухляш", "Котик"};
        int maxAgeCat = 10;

        return new Cat()
                .setAge(random.nextInt(maxAgeCat))
                .setName(catNames[random.nextInt(catNames.length)]);
    }
}