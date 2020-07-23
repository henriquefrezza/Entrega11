package br.com.frezza.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.frezza.model.bean.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Long>{
	
	public Cidade findByLatitudeAndLongitude(String latitude, String longitude);
	
	public Cidade findByNome(String nome);
	
	public Cidade findByNomeIgnoreCase(String nome);
}
