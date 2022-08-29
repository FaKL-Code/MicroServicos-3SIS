package br.com.optimusprime.sprint2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.optimusprime.sprint2.models.Lembrete;

public interface LembreteRepository extends JpaRepository<Lembrete, Long> {}