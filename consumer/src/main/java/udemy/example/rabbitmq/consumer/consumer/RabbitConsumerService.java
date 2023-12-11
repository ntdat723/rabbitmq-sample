package udemy.example.rabbitmq.consumer.consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RabbitConsumerService {

    // @RabbitListener(queues = "course.hello")
    public void listen(String message) {
        System.out.println(STR."Incoming message: \{message}");
    }
}