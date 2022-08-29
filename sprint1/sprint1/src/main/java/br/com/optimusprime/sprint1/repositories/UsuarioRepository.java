package br.com.optimusprime.sprint1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.optimusprime.sprint1.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {}