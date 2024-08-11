package app.fitness.service;

import java.util.List;

import org.springframework.stereotype.Service;

import app.fitness.entity.Client;


@Service
public interface AppService {
	public Client addClient(Client client);

	public void updateClient(Client client, Integer id);

	public void deleteClient(Integer id);

	public Client fetchClientById(Integer id);

	public List<Client> fetchAllClients();
}
