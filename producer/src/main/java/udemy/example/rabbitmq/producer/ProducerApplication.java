package udemy.example.rabbitmq.producer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import udemy.example.rabbitmq.producer.producer.RabbitProducerService;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
@RequiredArgsConstructor
public class ProducerApplication implements CommandLineRunner {

    private final RabbitProducerService rabbitProducerService;

    public static void main(String[] args) {
        SpringApplication.run(ProducerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        rabbitProducerService.sendHello(STR."Name \{ThreadLocalRandom.current().nextInt()}");
    }
}