package pl.sda.filmrepository;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/suggestins")
public class SuggestionController {

    SuggestionRepository suggestionRepository;
    public SuggestionController(SuggestionRepository suggestionRepository){
        this.suggestionRepository = suggestionRepository;
    }
    @GetMapping
    Iterable<Suggestions> getAllSuggestions(){
        return suggestionRepository.findAll();
    }
    @PostMapping
    Suggestions addSuggestion(@RequestBody Suggestions suggestions){
        return suggestionRepository.save(suggestions);
    }
    @GetMapping(params = "author")
    Iterable<Suggestions> findSuggestionByAuthor (@RequestParam(name="author",required = true)String author){
        return suggestionRepository.findByAuthor(author);
    }
    @GetMapping("/{id}")
        Optional<Suggestions> findById(@PathVariable Long id){
        return suggestionRepository.findById(id);
        }
        @DeleteMapping("/{id}")
    void deleteSuggestionById (@PathVariable Long id){
        suggestionRepository.deleteById(id);
        }
}
