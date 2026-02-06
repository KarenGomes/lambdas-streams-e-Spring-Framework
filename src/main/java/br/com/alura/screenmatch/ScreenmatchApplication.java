package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String endereco = "https://www.omdbapi.com/?t=gilmore+girls&apikey=bd6caec0";
		ConsumoAPI consumoApi = new ConsumoAPI();
		var json = consumoApi.obterDados(endereco);
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		conversor.obterDados(json, DadosSerie.class);
	}
}
