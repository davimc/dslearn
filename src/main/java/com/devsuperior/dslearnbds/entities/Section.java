package com.devsuperior.dslearnbds.entities;

import com.devsuperior.dslearnbds.entities.enums.ResourceType;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_section")
public class Section implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;

    @ManyToOne// FIXME: 28/08/2022 deveria ser um OneToOne?
    @JoinColumn(name = "prerequisite_id")
    private Section prerequisite;

    @ManyToOne
    @JoinColumn(name = "resource_id")
    private Offer resource;

    public Section() {
    }

    public Section(Long id, String title, String description, Integer position, String imgUri, Section prerequisite, Offer resource) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.position = position;
        this.imgUri = imgUri;
        this.prerequisite = prerequisite;
        this.resource = resource;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public Section getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(Section prerequisite) {
        this.prerequisite = prerequisite;
    }

    public Offer getResource() {
        return resource;
    }

    public void setResource(Offer resource) {
        this.resource = resource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Section resource = (Section) o;
        return id.equals(resource.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
