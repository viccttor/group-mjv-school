package br.com.grupofour.ecormerce.repositories;

import br.com.grupofour.ecormerce.models.OrdemDeServico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemRepository extends JpaRepository<OrdemDeServico, Long> {
}
