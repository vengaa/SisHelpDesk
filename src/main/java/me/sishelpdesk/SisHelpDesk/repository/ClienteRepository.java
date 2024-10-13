package me.sishelpdesk.SisHelpDesk.repository;

import me.sishelpdesk.SisHelpDesk.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
