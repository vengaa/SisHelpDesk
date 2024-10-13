package me.sishelpdesk.SisHelpDesk;

import me.sishelpdesk.SisHelpDesk.domain.Chamado;
import me.sishelpdesk.SisHelpDesk.domain.Cliente;
import me.sishelpdesk.SisHelpDesk.domain.Tecnico;
import me.sishelpdesk.SisHelpDesk.domain.enums.Perfil;
import me.sishelpdesk.SisHelpDesk.domain.enums.Prioridade;
import me.sishelpdesk.SisHelpDesk.domain.enums.Status;
import me.sishelpdesk.SisHelpDesk.repository.ChamadoRepository;
import me.sishelpdesk.SisHelpDesk.repository.ClienteRepository;
import me.sishelpdesk.SisHelpDesk.repository.TecnicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SisHelpDeskApplication{

	public static void main(String[] args) {
		SpringApplication.run(SisHelpDeskApplication.class, args);
	}

}
