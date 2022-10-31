package business.entities;

import business.abstracts.LanguageService;
import dataAccess.abstracts.LanguageRepository;
import entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LanguageManager implements LanguageService {

    @Autowired
    LanguageRepository languageRepository;

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) {
        this.languageRepository.add(language);

    }

    @Override
    public void delete(Language language) {
        this.languageRepository.delete(language);

    }

    @Override
    public void update(Language language, int id) {
        this.languageRepository.update(language, id);

    }

    @Override
    public void getLanguageById(int id) {
        languageRepository.getLanguageById(id);
    }
}
