package attornatus.teste.api.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class EnderecoTest {

    @Mock
    private Pessoa pessoa;

    @InjectMocks
    private Endereco endereco;

    @BeforeEach
    public void testSetters() {
        endereco = Endereco.builder()
                .id(3L)
                .logradouro("Rua Marechal Peixoto")
                .cep("350500-300")
                .numero("777")
                .cidade("Belo Horizonte")
                .pessoa(pessoa)
                .build();
    }

    @Test
    public void testGetId() {
        Assertions.assertEquals(3L, endereco.getId());
    }

    @Test
    public void testGetLogradouro() {
        Assertions.assertEquals("Rua Marechal Peixoto", endereco.getLogradouro());
    }

    @Test
    public void testGetCep() {
        Assertions.assertEquals("350500-300", endereco.getCep());
    }

    @Test
    public void testGetNumero() {
        Assertions.assertEquals("777", endereco.getNumero());
    }

    @Test
    public void testGetCidade() {
        Assertions.assertEquals("Belo Horizonte", endereco.getCidade());
    }

    @Test
    public void testGetPessoa() {
        Assertions.assertEquals(pessoa, endereco.getPessoa());
    }
}
