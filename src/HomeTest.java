import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {

    @Test
    void div() {
        int a = 10, b = 3;
        assertEquals(3, Home.div(a,b));
        System.out.println("Teste deu certo");
    }

    @Test
    void divErrado() {
        int a = 10, b = 3;
        assertEquals(5, Home.div(a,b));
        System.out.println("Teste deu errado");
    }
}
