package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.DTO.NotificationDTO;
import com.devsuperior.dslearnbds.entities.Notification;
import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository repository;

    @Autowired
    private AuthService authService;

    public Page<NotificationDTO> findNotificationByCurrentUser(Boolean unreadOnly, Pageable pageable) {
        User user = authService.authenticated();
        Page<Notification> notifcations = repository.findByUser(user, unreadOnly, pageable);

        return notifcations.map(NotificationDTO::new);
    }
}
