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
public class SisHelpDeskApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(SisHelpDeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Felipe Lima", "12345678909", "mail@mail.com", "123");
		tec1.addPerfil(Perfil.TECNICO);

		Cliente cli1 = new Cliente(null, "Cliente 1", "16534567890", "clie@mail.com", "1234");
		cli1.addPerfil(Perfil.CLIENTE);

		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro chamado", tec1, cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));

	}
}
