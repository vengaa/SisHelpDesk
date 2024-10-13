package me.sishelpdesk.SisHelpDesk.repository;

import me.sishelpdesk.SisHelpDesk.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
