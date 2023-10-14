import org.junit.jupiter.api.Test;
import org.planilha.*;

import static org.junit.jupiter.api.Assertions.*;

public class PlanilhaTest {

    @Test
    public void testNotificacaoDeObservadores() {

        Planilha planilha = new Planilha();

        Celula celulaA1 = new Celula();
        Celula celulaA2 = new Celula();
        Celula celulaA3 = new Celula();

        planilha.adicionarCelula(celulaA1);
        planilha.adicionarCelula(celulaA2);
        planilha.adicionarCelula(celulaA3);

        CelulaObservador observadorA1 = new CelulaObservador(celulaA1);
        CelulaObservador observadorA2 = new CelulaObservador(celulaA2);
        CelulaObservador observadorA3 = new CelulaObservador(celulaA3);
        
        celulaA1.adicionarObservador(observadorA2);
        celulaA1.adicionarObservador(observadorA3);
        
        celulaA1.setValor("10");

        assertEquals(true, observadorA1.getEstaAtualizado());
        assertEquals(true, observadorA2.getEstaAtualizado());
        assertEquals(true, observadorA3.getEstaAtualizado());
    }
}
