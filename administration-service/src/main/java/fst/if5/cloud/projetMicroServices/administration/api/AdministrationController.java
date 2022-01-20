package fst.if5.cloud.projetMicroServices.administration.api;

import java.util.List;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fst.if5.cloud.projetMicroServices.administration.model.Administateur;
import fst.if5.cloud.projetMicroServices.administration.repository.AdministationRepository;

@RestController
public class AdministrationController {

	@Autowired
	AdministationRepository repository;
	
	protected Logger logger = Logger.getLogger(AdministrationController.class.getName());
	
	@RequestMapping("/administrateurs")
	public List<Administateur> findAll() {
		logger.info("Administrateur.findAll()");
		return repository.findAll();
	}
	
	@RequestMapping("/administrateur/{id}")
	public Administateur findById(@PathVariable("id") String id) {
		logger.info(String.format("Administrateur.findById(%s)", id));
		Administateur administateur = repository.findById(id);
		return administateur;
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/administrateurs")
	public Administateur add(@RequestBody Administateur administrateur) {
		logger.info(String.format("Administrateur.add(%s)", administrateur));
		return repository.save(administrateur);
	}
	

	@RequestMapping(value = "/administrateur/{id}", method = RequestMethod.DELETE)
    public void  deleteAdministrator(@PathVariable String id) {
        repository.delete(id);
    }
}