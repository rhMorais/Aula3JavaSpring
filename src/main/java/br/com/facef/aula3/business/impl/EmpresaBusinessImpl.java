package br.com.facef.aula3.business.impl;
import br.com.facef.aula3.model.Empresa;
import br.com.facef.aula3.business.EmpresaBusiness;
import br.com.facef.aula3.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaBusinessImpl implements EmpresaBusiness {

    private EmpresaRepository empresaRepository;

    @Autowired
    public EmpresaBusinessImpl(EmpresaRepository empresaRepository){
        this.empresaRepository = empresaRepository;
    }

    @Override
    public List<Empresa> findAll() {
        return empresaRepository.findAll();
    }

    @Override
    public List<Empresa> findByNome(String nome){
        return empresaRepository.findByNome(nome);
    }
}
