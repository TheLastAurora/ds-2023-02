import org.builder.Endereco;
import org.junit.jupiter.api.Test;

public class EnderecoTest {

    @Test
    public void deveCriarUmEnderecoValido() {
        Endereco endereco = Endereco.builder()
            .rua("Rua da Paz")
            .setor("Setor Sul")
            .cep("74800-000")
            .numero(123)
            .cidade("Goiânia")
            .estado("GO")
            .bloco("A")
            .quadra("10")
            .build();

        assertEquals("Rua da Paz", endereco.getRua());
        assertEquals("Setor Sul", endereco.getSetor());
        assertEquals("74800-000", endereco.getCep());
        assertEquals(123, endereco.getNumero());
        assertEquals("Goiânia", endereco.getCidade());
        assertEquals("GO", endereco.getEstado());
        assertEquals("A", endereco.getBloco());
        assertEquals("10", endereco.getQuadra());
    }

    @Test
    public void deveFalharAoCriarUmEnderecoSemRua() {
        assertThrows(IllegalStateException.class, () -> {
            Endereco endereco = Endereco.builder()
                .setor("Setor Sul")
                .cep("74800-000")
                .numero(123)
                .cidade("Goiânia")
                .estado("GO")
                .bloco("A")
                .quadra("10")
                .build();
        });
    }

    @Test
    public void deveFalharAoCriarUmEnderecoSemSetor() {
        assertThrows(IllegalStateException.class, () -> {
            Endereco endereco = Endereco.builder()
                .rua("Rua da Paz")
                .cep("74800-000")
                .numero(123)
                .cidade("Goiânia")
                .estado("GO")
                .bloco("A")
                .quadra("10")
                .build();
        });
    }

    @Test
    public void deveFalharAoCriarUmEnderecoSemCep() {
        assertThrows(IllegalStateException.class, () -> {
            Endereco endereco = Endereco.builder()
                .rua("Rua da Paz")
                .setor("Setor Sul")
                .numero(123)
                .cidade("Goiânia")
                .estado("GO")
                .bloco("A")
                .quadra("10")
                .build();
        });
    }

    @Test
    public void deveFalharAoCriarUmEnderecoSemNumero() {
        assertThrows(IllegalStateException.class, () -> {
            Endereco endereco = Endereco.builder()
                .rua("Rua da Paz")
                .setor("Setor Sul")
                .cep("74800-000")
                .cidade("Goiânia")
                .estado("GO")
                .bloco("A")
                .quadra("10")
                .build();
        });
    }

    @Test
    public void deveFalharAoCriarUmEnderecoSemCidade() {
        assertThrows(IllegalStateException.class, () -> {
            Endereco endereco = Endereco.builder()
                .rua("Rua da Paz")
                .setor("Setor Sul")
                .cep("74800-000")
                .numero(123)
                .estado("GO")
                .bloco("A")
                .quadra("10")
                .build();
        });
    }

    @Test
    public void deveFalharAoCriarUmEnderecoSemEstado() {
        assertThrows(IllegalStateException.class, () -> {
            Endereco endereco = Endereco.builder()
                .rua("Rua da Paz")
                .setor("Setor Sul")
                .cep("74800-000")
                .numero(123
