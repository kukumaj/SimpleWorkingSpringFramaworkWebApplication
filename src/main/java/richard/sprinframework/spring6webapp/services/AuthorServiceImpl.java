package richard.sprinframework.spring6webapp.services;

import org.springframework.stereotype.Service;
import richard.sprinframework.spring6webapp.domain.Author;
import richard.sprinframework.spring6webapp.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
    public final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
}
