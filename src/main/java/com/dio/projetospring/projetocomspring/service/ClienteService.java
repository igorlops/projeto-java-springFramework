package com.dio.projetospring.projetocomspring.service;

import com.dio.projetospring.projetocomspring.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();
    Cliente buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar (Long id);

}
