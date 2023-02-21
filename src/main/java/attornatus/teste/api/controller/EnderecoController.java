package attornatus.teste.api.controller;

import attornatus.teste.api.dto.EnderecoDto;
import attornatus.teste.api.entity.Endereco;
import attornatus.teste.api.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/criar")
    public ResponseEntity<Endereco> criar(@RequestBody EnderecoDto enderecoDto){
        return enderecoService.criar(enderecoDto);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<List<Endereco>> listar(@PathVariable("nome") String nome){
        return enderecoService.listar(nome);
    }

    @PutMapping("/principal/{id}")
    public ResponseEntity<List<Endereco>> definirEnderecoPrincipal(@PathVariable("id") Long id){
        return enderecoService.definirEnderecoPrincipal(id);
    }
}
