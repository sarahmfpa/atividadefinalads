public class Arquitetura {

    public void definirArquitetura(String tipoArquitetura) {
        System.out.println("A arquitetura definida é: " + tipoArquitetura);
        // Lógica para definir a arquitetura
    }

    public int calcularCusto(int tamanho, int custoPorMetroQuadrado) {
        int custoTotal = tamanho * custoPorMetroQuadrado;
        System.out.println("O custo total da construção é: " + custoTotal);
        return custoTotal;
    }

    public static void main(String[] args) {
        Arquitetura arquitetura = new Arquitetura();
        arquitetura.definirArquitetura("Arquitetura moderna");
        int custo = arquitetura.calcularCusto(100, 1500);
    }
}