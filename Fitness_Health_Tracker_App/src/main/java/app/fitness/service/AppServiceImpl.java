package app.fitness.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.fitness.entity.Client;
import app.fitness.repository.AppRepository;

@Service
public class AppServiceImpl implements AppService{

	@Autowired
	private AppRepository repository;
	
	@Override
	public Client addClient(Client client) {
		Client client2 = repository.save(client);
		return client2;
	}

	@Override
	public void updateClient(Client client, Integer id) {
		// need a find by id for client and then take params as c weight and finally update
		client.setcWeight(0);
		// double bmi = cweight/pow(height,2);
		client.setBmi(0);
		repository.save(client);
	}

	@Override
	public void deleteClient(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public Client fetchClientById(Integer id) {
		Optional<Client> optional = repository.findById(id);
		Client client = null;
		if(optional.isPresent()) {
			client = optional.get();
		}
		return client;
	}

	@Override
	public List<Client> fetchAllClients() {
		List<Client> clients = (List<Client>)repository.findAll();
		return clients;
	}

}
