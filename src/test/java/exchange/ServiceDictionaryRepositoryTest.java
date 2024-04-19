package exchange;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;
/*
    Попробовать написать код используя TDD, как на примере сегодняшнего урока. Не нужно писать что-то сложное,
достаточно двух классов и индежкта одного в другой. Можно добавить тес с spy,
мне скинуть проект гита который вы расшарите на гит. ссылку на ваш репозиторй. не забудьт сделать его публичным
*/
public class ServiceDictionaryRepositoryTest {

    @Spy
    private DictionaryRepository dictionaryRepository;

    private ServiceDictionaryRepository serviceDictionaryRepository;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
        serviceDictionaryRepository = new ServiceDictionaryRepository(dictionaryRepository);
    }

    @Test
    void testWordService() {
        when(dictionaryRepository.getAllWords()).thenReturn(Map.of(1, "One", 2, "Two", 3, "Three"));

        String wordResult = serviceDictionaryRepository.digitToWords(2);

        assertEquals("Two", wordResult);
    }
}
