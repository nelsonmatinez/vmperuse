package nelson.nelson.com.br.vmperuse.dao;

import org.springframework.data.repository.CrudRepository;

import nelson.nelson.com.br.vmperuse.model.Software;

public interface SoftwareDAO extends CrudRepository<Software, Integer> {

}