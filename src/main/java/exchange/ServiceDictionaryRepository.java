package exchange;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
public class ServiceDictionaryRepository {
    DictionaryRepository dictionaryRepository;

    public Map<Integer,String> getAllWords() {
        return dictionaryRepository.getAllWords();
    }

    public String digitToWords(int digit) {
        // Тут должны быть проверки
        Map<Integer,String> words = dictionaryRepository.getAllWords();
    return words.get(digit);

    }

}
