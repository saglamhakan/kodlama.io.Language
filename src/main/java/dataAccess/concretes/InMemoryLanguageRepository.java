package dataAccess.concretes;


import dataAccess.abstracts.LanguageRepository;
import entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

    List<Language> languages = Arrays.asList(
            new Language(1, "C#"),
            new Language(2,"Java"),
            new Language(3,"C")
    );

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public void add(Language language) {
        this.languages.add(language);

    }

    @Override
    public void delete(Language language) {
        this.languages.remove(language);
    }

    @Override
    public void update(Language language, int id) {
        //daha sonra eklenecek
    }

    @Override
    public void getLanguageById(int id) {
        for (Language language: languages){
            if (language.getId()==id){
                return;
            }
        }

    }
}
