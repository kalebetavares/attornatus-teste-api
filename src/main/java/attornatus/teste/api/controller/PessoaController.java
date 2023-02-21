package attornatus.teste.api.controller;

import attornatus.teste.api.dto.PessoaDto;
import attornatus.teste.api.entity.Pessoa;
import attornatus.teste.api.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public ResponseEntity<Pessoa> cadastrar(@RequestBody PessoaDto pessoaDto){
        return pessoaService.criar(pessoaDto);
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Pessoa> atualizar(@RequestBody PessoaDto pessoaDto){
        return pessoaService.atualizar(pessoaDto);
    }

    @GetMapping("/{nome}")
    public ResponseEntity<Pessoa> consultar(@PathVariable("nome") String nome){
        return pessoaService.consultar(nome);
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Pessoa>> listar(){
        return pessoaService.listarPessoas();
    }
}
