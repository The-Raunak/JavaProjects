package app.fitness.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import app.fitness.entity.Client;

@Repository
public interface AppRepository extends CrudRepository<Client, Integer>{

}
