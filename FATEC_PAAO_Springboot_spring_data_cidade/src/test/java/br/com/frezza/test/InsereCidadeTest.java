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
public class InsereCidadeTest {
	
	@Autowired
	private CidadeRepository cidadeRepo;
	
	@Test
	public void InsereAluno() {
		Cidade c = new Cidade ();
		c.setNome("Sao Bernardo");
		c.setLatitude("23º 41' 38\" S");
		c.setLongitude("46º 33' 54\" W");
		c = cidadeRepo.save(c);
		System.out.println(c.getId());
	}

}
