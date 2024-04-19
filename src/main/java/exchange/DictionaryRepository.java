package exchange;

import java.util.List;
import java.util.Map;

public interface DictionaryRepository {
    public Map<Integer,String> getAllWords();

    public String digitToWords(int digit);

}
