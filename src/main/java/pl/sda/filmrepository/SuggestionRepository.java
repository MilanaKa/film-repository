package pl.sda.filmrepository;

import java.util.Optional;

public interface SuggestionRepository {
    Iterable<Suggestions> findAll();

    Suggestions save(Suggestions suggestions);

    Iterable<Suggestions> findByAuthor(String author);

    Optional<Suggestions> findById(Long id);

    void deleteById(Long id);
}
