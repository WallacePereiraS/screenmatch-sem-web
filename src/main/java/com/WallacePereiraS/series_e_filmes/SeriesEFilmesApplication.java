package com.WallacePereiraS.series_e_filmes;

import com.WallacePereiraS.series_e_filmes.model.DadosSerie;
import com.WallacePereiraS.series_e_filmes.service.ConsumoApi;
import com.WallacePereiraS.series_e_filmes.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeriesEFilmesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SeriesEFilmesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		String titulo = "barbie";
		var json = consumoApi.obterDados("http://www.omdbapi.com/?t=" + titulo + "&apikey=36bd57cb");
		System.out.println(json);

		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
