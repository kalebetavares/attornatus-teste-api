package attornatus.teste.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EnderecoDto {

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("numero")
    private String numero;
    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("pessoa")
    private PessoaDto pessoaDto;

    @JsonProperty("enderecoPrincipal")
    private Boolean enderecoPrincipal;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public PessoaDto getPessoaDto() {
        return pessoaDto;
    }

    public void setPessoaDto(PessoaDto pessoaDto) {
        this.pessoaDto = pessoaDto;
    }

    public Boolean getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

    public void setEnderecoPrincipal(Boolean enderecoPrincipal) {
        this.enderecoPrincipal = enderecoPrincipal;
    }
}