package br.com.grupofour.ecormerce;

import br.com.grupofour.ecormerce.enums.Status;
import br.com.grupofour.ecormerce.models.Cliente;
import br.com.grupofour.ecormerce.models.OrdemDeServico;
import br.com.grupofour.ecormerce.models.OrdemItems;
import br.com.grupofour.ecormerce.models.Produto;
import br.com.grupofour.ecormerce.repositories.ClienteRepository;
import br.com.grupofour.ecormerce.repositories.OrdemItemRepository;
import br.com.grupofour.ecormerce.repositories.OrdemRepository;
import br.com.grupofour.ecormerce.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
import java.util.Arrays;

@SpringBootApplication
public class EcormerceApplication implements CommandLineRunner {

	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private OrdemRepository ordemRepository;

	@Autowired
	private OrdemItemRepository ordemItemRepository;



	public static void main(String[] args) {
		SpringApplication.run(EcormerceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ok");

		/**/
		Cliente cliente = new Cliente(null, "James", "james@.com");
		clienteRepository.save(cliente);

		Produto produto = new Produto(null, "Computador", 3000.0);
		Produto produto2= new Produto(null, "mesa-gamer", 350.0);
		Produto produto3 = new Produto(null, "headset gamer", 380.0);
		produtoRepository.saveAll(Arrays.asList(produto,produto2,produto3));

		OrdemDeServico ordem1 = new OrdemDeServico(null,Instant.parse("2022-05-18T11:25:09z"),Status.APROVADO, cliente);

		OrdemDeServico orddem2 = new OrdemDeServico(null, Instant.parse("2022-02-18T11:25:09z"),
				Status.AGUARDANDO, cliente);

		ordemRepository.saveAll(Arrays.asList(ordem1,orddem2));



		OrdemItems items = new OrdemItems(null, 1,3000.0,produto,ordem1);
		ordemItemRepository.save(items);




	}
}
