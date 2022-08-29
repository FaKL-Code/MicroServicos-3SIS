package br.com.optimusprime.sprint1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.optimusprime.sprint1.models.CargoUsuario;

public interface CargoUsuarioRepository extends JpaRepository<CargoUsuario, Long> {}