import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;

        assertEquals("Неправильный факт.результат для метода getKittens", expected, lion.getKittens());
    }

    @Test
    public void hasManeWithException() {
        Exception exception = assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Incorrect", feline);
        });
        String expected = "Используйте допустимые значения пола животного - самей или самка";

        assertEquals("Ошибка: недопустимые значения пола животного", expected, exception.getMessage());
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        assertEquals("Ошибка: ФР не соответствует ОР", expected, lion.getFood());
    }
}
