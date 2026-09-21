package com.plazoletaucc.Plazoleta.repository;

import com.plazoletaucc.Plazoleta.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    boolean existsByCorreo(String correo);
}
