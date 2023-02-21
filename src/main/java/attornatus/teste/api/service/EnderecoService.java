package attornatus.teste.api.service;

import attornatus.teste.api.dto.EnderecoDto;
import attornatus.teste.api.entity.Endereco;
import attornatus.teste.api.repository.EnderecoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<Endereco> criar(EnderecoDto enderecoDto) {
        if (enderecoDto != null) {
            Endereco endereco = modelMapper.map(enderecoDto, Endereco.class);
            enderecoRepository.save(endereco);

            return ResponseEntity.ok().body(endereco);
        }
        return ResponseEntity.badRequest().build();
    }


    public ResponseEntity<List<Endereco>> listar(String nome) {
        List<Endereco> listaDeEnderecos = enderecoRepository.findbyPessoa(nome);

        if (listaDeEnderecos.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok().body(listaDeEnderecos);
    }

    @Transactional
    public ResponseEntity<List<Endereco>> definirEnderecoPrincipal(Long id) {
        Optional<Endereco> enderecoOptional = enderecoRepository.findById(id);

        if (enderecoOptional.isPresent()) {
            Endereco enderecoPrincipal = enderecoOptional.get();
            List<Endereco> listaDeEnderecos = enderecoRepository.findAll();

            for (Endereco endereco : listaDeEnderecos) {
                endereco.setEnderecoPrincipal(endereco.equals(enderecoPrincipal));
            }

            return ResponseEntity.ok().body(enderecoRepository.saveAll(listaDeEnderecos));
        }

        return ResponseEntity.notFound().build();
    }

}
