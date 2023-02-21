package attornatus.teste.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.List;

public class PessoaDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("nome")
    private String nome;

    @JsonProperty("dataDeNascimento")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataDeNascimento;

    @JsonProperty("endereco")
    private List<EnderecoDto> endereco;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public List<EnderecoDto> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<EnderecoDto> enderecos) {
        this.endereco = enderecos;
    }
}