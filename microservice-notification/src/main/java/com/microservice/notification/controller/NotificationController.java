package com.microservice.notification.controller;

import com.microservice.notification.entities.Notification;
import com.microservice.notification.service.INotificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notification")
public class NotificationController {

    @Autowired
    private final INotificacionService notificationService;

    public NotificationController(INotificacionService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNotification(@RequestBody Notification notification) {
        notificationService.save(notification);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllNotifications() {
        return ResponseEntity.ok(notificationService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> getNotificationById(@PathVariable Long id) {
        Notification notification = notificationService.findById(id);
        return ResponseEntity.ok(notification);
    }



}
