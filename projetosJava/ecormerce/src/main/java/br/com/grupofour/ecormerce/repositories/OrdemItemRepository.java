package br.com.grupofour.ecormerce.repositories;

import br.com.grupofour.ecormerce.models.OrdemItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemItemRepository extends JpaRepository<OrdemItems, Long> {
}
