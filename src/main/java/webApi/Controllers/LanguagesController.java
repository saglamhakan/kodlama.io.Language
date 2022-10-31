package webApi.Controllers;

import business.abstracts.LanguageService;
import entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class LanguagesController {

    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping
    public List<Language> getall() {
        return this.languageService.getAll();

    }

    @PostMapping
    public void add(Language language) {
        this.languageService.add(language);
    }

    @PostMapping
    public void delete(Language language) {
        this.languageService.delete(language);
    }

    @PostMapping
    public void update(Language language) {
        this.languageService.update(language, language.getId());
    }
    @PutMapping
    public void getLaunguageById(Language language) {
        this.languageService.getLanguageById(language.getId());
    }
}
