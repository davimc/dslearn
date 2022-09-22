package com.devsuperior.dslearnbds.services;

import com.devsuperior.dslearnbds.DTO.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.entities.Deliver;
import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.repositories.DeliverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DeliverService {

    @Autowired
    private DeliverRepository repository;

    @Transactional
    @PreAuthorize("hasAnyRole('ADMIN', 'INSTRUCTOR')")
    public void saveRevision(Long id, DeliverRevisionDTO dto) {
        Deliver entity = repository.getOne(id);
        entity.setFeedback(dto.getFeedback());
        entity.setStatus(dto.getStatus());
        entity.setCorrectCount(dto.getCorrectCount());

        repository.save(entity);
    }
}
