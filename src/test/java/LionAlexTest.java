import com.example.Feline;
import com.example.LionAlex;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    private LionAlex lionAlex;
    @Mock
    private Feline feline;

    @Before
    public void createNewInstance() throws Exception {
        lionAlex = new LionAlex(feline);
    }

    @Test
    public void getKittens() {
        int expected = 0;

        assertEquals("Неправильный факт.результат для метода getKittens льва Алекса", expected, lionAlex.getKittens());
    }

    @Test
    public void getFriends() {
        List<String> expected = List.of("зебра Марти", "бегемотиха Глория", "жираф Мелман");

        assertEquals("Неправильный факт.результат для метода getKittens льва Алекса", expected, lionAlex.getFriends());
    }

    @Test
    public void getPlaceOfLiving() {
        String expected = "Нью-Йоркский зоопарк";

        assertEquals("Неправильный факт.результат для метода getKittens льва Алекса", expected, lionAlex.getPlaceOfLiving());
    }
}
