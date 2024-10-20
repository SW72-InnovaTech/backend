package com.microservice.notification.service;

import com.microservice.notification.entities.Notification;

import java.util.List;

public interface INotificacionService {
    List<Notification> findAll();

    Notification findById(Long id);

    void save(Notification notification);

    List<Notification> findByIdUser(Long idUser);
}
