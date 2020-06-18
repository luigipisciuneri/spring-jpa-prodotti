package it.dstech.formazione.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import it.dstech.formazione.model.Prodotto;

public interface ProdottoRepository extends CrudRepository<Prodotto, Integer> {
	
	@Query(value = "SELECT c FROM Prodotto c WHERE c.name LIKE '%' || :keyword || '%'"
			+ " OR c.quantita LIKE '%' || :keyword || '%'"
			+ " OR c.categoria LIKE '%' || :keyword || '%'")
	public List<Prodotto> search(@Param("keyword") String keyword);
}
