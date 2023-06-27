package it.silviafabbri.tesi.Dao;

import it.silviafabbri.tesi.business.IncassoPostgresRepository;
import it.silviafabbri.tesi.model.Incasso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncassoDao {
    @Autowired
    private IncassoPostgresRepository repository;

    public void createPostgres(Incasso incasso){
        try{
            this.repository.save(incasso);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
