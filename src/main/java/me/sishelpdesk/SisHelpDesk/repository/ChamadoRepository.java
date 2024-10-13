package me.sishelpdesk.SisHelpDesk.repository;

import me.sishelpdesk.SisHelpDesk.domain.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {
}
