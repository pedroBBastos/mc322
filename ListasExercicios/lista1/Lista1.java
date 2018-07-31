import java.util.Scanner;

public class Lista1 {

  /*
    Questao 1:

      Objeto -> baseando em objetos do mundo real, sao caracterizados por estado e comportamento. Tais estados e comportamentos, na programacao
      orientada a objetos, sao representados respectivamente por atributos (variaveis) e metodos (funcoes). Os metodos operam sobre o estado interno de cada obejto
      e estes estados internos podem ser omitidos do mundo externo (encapsulamento), o que ajuda na modularizacao e manutencao do codigo.

      Classe -> modelo (receita) para criacao (instanciacao) de um objeto.

      Estado e atributos -> o estado de um objeto eh representado pelos seus atributos

      Comportamento e metodos -> o comportamento de um objeto eh descrito pelos seus metodos (funcoes), capazes de alterar o estado de um objeto (seus atributos)

      Herança -> propriedade de um objeto poder extender seus atributos e metodos de um outro objeto, herdando caracteristicas que sao comuns a este dois objetos e
      poder especificar o objeto que herda sem precisar reescrever o que ja se tem em outra parte do codigo (objeto que serviu para ser herdado).
      Permite maior modularizacao do codigo e coisas mais (polimorfismo)

  */

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Print seu nome aqui:");
    String s = scanner.next();
    System.out.println("Seu nome aqui eh " + s);

    System.out.println("Digita uma frase ai meu consagrado");
    s = scanner.nextLine(); // le o meu enter pq ele nao foi lido no scanner.next() acima -> https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
    s = scanner.nextLine();

    System.out.println("Frase -> " + s);
    System.out.print("Frase ao contrario-> ");
    for(int i=s.length()-1; i>=0; i--)
      System.out.print(s.charAt(i));
    System.out.println();
  }
}
