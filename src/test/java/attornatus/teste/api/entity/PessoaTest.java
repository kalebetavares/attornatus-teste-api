package attornatus.teste.api.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;


@ExtendWith(MockitoExtension.class)
class PessoaTest {

    @Mock
    private Endereco endereco;

    @InjectMocks
    private Pessoa pessoa;

    private List<Endereco> enderecos;

    @BeforeEach
    public void testSetters() {
        pessoa = Pessoa.builder()
                .id(1L)
                .nome("Kalebe Tavares")
                .dataDeNascimento(LocalDate.of(1999, 7, 22))
                .build();

        endereco = Endereco.builder()
                .id(1L)
                .logradouro("Rua das Neves")
                .numero("1050")
                .cidade("Alaska")
                .pessoa(pessoa)
                .build();

        enderecos = Collections.singletonList(endereco);
        pessoa.setEndereco(enderecos);
    }

    @Test
    void testGetId() {
        Assertions.assertEquals(1L, pessoa.getId());
    }

    @Test
    void testGetNome() {
        Assertions.assertEquals("Kalebe Tavares", pessoa.getNome());
    }

    @Test
    void testGetDataDeNascimento() {
        Assertions.assertEquals(LocalDate.of(1999, 7, 22), pessoa.getDataDeNascimento());
    }

    @Test
    void testGetEndereco() {
        Assertions.assertEquals(enderecos, pessoa.getEndereco());
    }
}