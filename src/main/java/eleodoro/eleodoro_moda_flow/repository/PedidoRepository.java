package eleodoro.eleodoro_moda_flow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import eleodoro.eleodoro_moda_flow.modelo.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
    
}
