package br.com.facef.aula3.business;
import br.com.facef.aula3.model.Empresa;

import java.util.List;

public interface EmpresaBusiness {
    List<Empresa> findAll();
    List<Empresa> findByNome(String nome);
}
