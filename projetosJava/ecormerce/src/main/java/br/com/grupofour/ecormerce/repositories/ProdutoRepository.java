package br.com.grupofour.ecormerce.repositories;

import br.com.grupofour.ecormerce.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
