package com.worklink.todosimple.cadastro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.worklink.todosimple.cadastro.models.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {
   Empresa findByEmail(String email);
   Empresa findByCnpj(String cnpj);
   Empresa findByTelefone(String telefone);
   Empresa findByNome(String nome);
}