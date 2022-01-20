package fst.if5.cloud.projetMicroServices.administration.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import fst.if5.cloud.projetMicroServices.administration.model.Administateur;

public interface AdministationRepository extends MongoRepository<Administateur, String> {

	public Administateur findById(String id);
}