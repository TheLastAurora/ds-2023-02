public class Main {
    public static void main(String[] args) {
        // Crie um objeto Interessado
        Interessado interessado = new Interessado();

        // Exemplo de criação e atualização de uma Escultura
        Escultura escultura = new Escultura("Escultura 1", "2023-10-26", "Escultor 1", 500.0f);
        escultura.addObserver(interessado);
        escultura.setPreço(600.0f); // Deve imprimir a mensagem de atualização do preço

        // Exemplo de criação e atualização de uma Pintura
        Pintura pintura = new Pintura("Pintura 1", "2023-10-26", "Artista 1", 1000.0f);
        pintura.addObserver(interessado);
        pintura.setPreço(1200.0f); // Deve imprimir a mensagem de atualização do preço
    }
}
