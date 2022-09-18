package com.devsuperior.dslearnbds.DTO;

import com.devsuperior.dslearnbds.entities.User;
import com.devsuperior.dslearnbds.services.validation.UserInsertValid;

import javax.validation.constraints.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@UserInsertValid
public class UserInsertDTO extends UserDTO {
    private static final long serialVersionUID = 1L;

    @Size(min=7, max=18, message="Deve ter entre 7 e 18 caracteres")
    @NotBlank(message="Campo requerido")
    private String password;

    public UserInsertDTO(Long id, String firstName, String lastName, String email, String password) {
        super(id, firstName, lastName, email);
        this.password = password;
    }

    public UserInsertDTO(User entity) {
        super(entity);
        password = entity.getPassword();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
