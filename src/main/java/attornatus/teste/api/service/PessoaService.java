package attornatus.teste.api.service;

import attornatus.teste.api.dto.PessoaDto;
import attornatus.teste.api.entity.Pessoa;
import attornatus.teste.api.repository.PessoaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
public class PessoaService {

    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private PessoaRepository pessoaRepository;

    public ResponseEntity<Pessoa> criar(PessoaDto pessoaDto) {
        if (pessoaDto != null) {
            Pessoa pessoa = modelMapper.map(pessoaDto, Pessoa.class);
            pessoaRepository.save(pessoa);

            return ResponseEntity.ok().body(pessoa);
        }

        return ResponseEntity.badRequest().build();
    }

    public ResponseEntity<Pessoa> atualizar(PessoaDto pessoaDto) {
        if (pessoaRepository.existsById(pessoaDto.getId())){
            Pessoa pessoa = modelMapper.map(pessoaDto, Pessoa.class);
            pessoaRepository.save(pessoa);

            return ResponseEntity.ok().body(pessoa);
        }

        return ResponseEntity.notFound().build();
    }

    public ResponseEntity<Pessoa> consultar(String nome) {
            Pessoa pessoa = pessoaRepository.getByNome(nome);

            if (pessoa != null) {
                return ResponseEntity.ok().body(pessoa);
            }

            return ResponseEntity.notFound().build();
    }

    public ResponseEntity<List<Pessoa>> listarPessoas() {
        List<Pessoa> listaDePessoas = pessoaRepository.findAll();

        if (listaDePessoas.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(listaDePessoas);
    }
}
