package udemy.example.rabbitmq.producer.producer;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class FixedRateRabbitProducerService {

    @Value("${self.rabbitmq.queue.fixedrate}")
    private String queueName;

    private final RabbitTemplate rabbitTemplate;
    private int i = 0;

    @Scheduled(fixedRate = 2000)
    public void sendMessage() {
        // System.out.println(STR."This is message number \{++i}}");
        log.info(STR."Message number \{++i} has been sent.");
        // log.info(queueName);
        rabbitTemplate.convertAndSend(queueName, STR."Fixed rate: \{i}");
    }
}
