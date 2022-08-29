package br.com.optimusprime.sprint1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.optimusprime.sprint1.models.Local;

public interface LocalRepository extends JpaRepository<Local, Long> {}