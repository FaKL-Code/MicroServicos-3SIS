package br.com.optimusprime.sprint1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.optimusprime.sprint1.models.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {}