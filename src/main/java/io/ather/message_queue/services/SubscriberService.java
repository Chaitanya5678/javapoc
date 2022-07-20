package io.ather.message_queue.services;

import io.ather.message_queue.models.Event;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class SubscriberService {

    public void subscribeEvent(Event event) {
        log.info("Received event: " + event);
    }
}
