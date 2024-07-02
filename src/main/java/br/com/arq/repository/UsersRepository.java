package br.com.arq.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.arq.model.Users;
                                                   //Classe que irá fazer collecao, Tipo da Chave
public interface UsersRepository extends MongoRepository<Users, String>{

}
