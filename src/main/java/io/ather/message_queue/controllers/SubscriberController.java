package io.ather.message_queue.controllers;

import io.ather.message_queue.models.Event;
import io.ather.message_queue.services.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SubscriberController {

    @Autowired
    SubscriberService subscriberService;

    @PostMapping("/subscribe/events")
    public ResponseEntity<String> subscribeEvent(@RequestBody Event event) {
        try {
            subscriberService.subscribeEvent(event);
            return new ResponseEntity<>("Event got subscribed successfully", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

}
