package com.microservice.notification.service;

import com.microservice.notification.entities.Notification;
import com.microservice.notification.persistence.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements INotificacionService {

    @Autowired
    private NotificationRepository notificationRepository;

@Override
    public List<Notification> findAll() {
        return (List<Notification>) notificationRepository.findAll();
    }

    @Override
    public Notification findById(Long id) {
        return notificationRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Notification notification) {
        notificationRepository.save(notification);
    }

    @Override
    public List<Notification> findByIdUser(Long idUser) {
        //return notificationRepository.findByIdUser(idUser);
        return null;
    }
}
