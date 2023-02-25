import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedAnimalTest {

    private final String animalKind;
    private final List<String> listOf;

    public ParameterizedAnimalTest(String animalKind, List<String> listOf) {
        this.animalKind = animalKind;
        this.listOf = listOf;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();

        assertEquals("Неверный результат для метода getFood класса Animal", listOf, animal.getFood(animalKind));
    }
}
