package business.abstracts;

import entities.concretes.Language;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public interface LanguageService {
    List<Language> getAll();
    void add(Language language);
    void delete(Language language);
    void update(Language language, int id);
    void getLanguageById(int id);
}
