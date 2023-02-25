import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class AnimalTest {

    @Test
    public void getFoodWithException() {
        Exception exception = assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Incorrect");
        });

        String expected = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        assertEquals("Ошибка: недопустимые значения для метода getFood", expected, exception.getMessage());
    }

    @Test
    public void getFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Animal animal = new Animal();

        assertEquals("Неверный текст для метода getFamily класса Animal", expected, animal.getFamily());
    }
}
