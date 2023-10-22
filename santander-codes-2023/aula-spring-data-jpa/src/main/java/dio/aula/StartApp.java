package dio.aula;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();

        user.setName("Wanderson");
        user.setUsername("devwander");
        user.setPassword("12345678");

        repository.save(user);

        List<User> users = repository.findAll();

        for(User u: users) {
            System.out.println(u.toString());
        }
    }
}
