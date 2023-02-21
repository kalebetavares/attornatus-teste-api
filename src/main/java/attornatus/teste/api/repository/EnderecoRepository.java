package attornatus.teste.api.repository;

import attornatus.teste.api.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    @Query("SELECT e FROM Endereco e JOIN e.pessoa p WHERE p.nome = :nome")
    List<Endereco> findbyPessoa(@Param("nome") String nome);
}
