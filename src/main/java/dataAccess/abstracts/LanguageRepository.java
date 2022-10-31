package dataAccess.abstracts;


import entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface LanguageRepository {
    List<Language> getAll();

    void add(Language language);

    void delete(Language language);

    void update(Language language, int id);

    void getLanguageById(int id);



}
