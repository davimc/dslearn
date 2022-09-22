package com.devsuperior.dslearnbds.resources;


import com.devsuperior.dslearnbds.DTO.DeliverRevisionDTO;
import com.devsuperior.dslearnbds.services.DeliverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/deliveries")
public class DeliverResource {

    @Autowired
    private DeliverService service;

    @PutMapping(value = "/{id}")
    public ResponseEntity update(@PathVariable Long id, @RequestBody DeliverRevisionDTO dto) {
        service.saveRevision(id, dto);

        return ResponseEntity.noContent().build();
    }
}
