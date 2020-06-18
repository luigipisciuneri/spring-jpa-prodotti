package it.dstech.formazione.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import it.dstech.formazione.model.Prodotto;
import it.dstech.formazione.repository.ProdottoRepository;

@Service
@Transactional
public class ProdottoService {
	@Autowired ProdottoRepository repo;
	
	public void save(Prodotto prodotto) {
		repo.save(prodotto);
	}
	
	public List<Prodotto> listAll() {
		return (List<Prodotto>) repo.findAll();
	}
	
	public Prodotto get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}
	
	public List<Prodotto> search(String keyword) {
		return repo.search(keyword);
	}
}
