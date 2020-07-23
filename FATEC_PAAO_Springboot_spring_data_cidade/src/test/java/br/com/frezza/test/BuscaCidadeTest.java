package br.com.frezza.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.frezza.model.bean.Cidade;
import br.com.frezza.model.repository.CidadeRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BuscaCidadeTest {

	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void FindCidadeLongitudeLatitude() {
		System.out.println(cidadeRepo.findByLatitudeAndLongitude("23º 41' 38\" S","46º 33' 54\" W"));
	}
	
	@Test
	public void FindCidadeNome() {
		System.out.println(cidadeRepo.findByNome("Sao Bernardo"));
	}
	
	@Test
	public void FindCidadeNomeIgnoreCase() {
		System.out.println(cidadeRepo.findByNomeIgnoreCase("sao bernardo"));
	}
}
