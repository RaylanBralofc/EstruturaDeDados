pacote atividade1;



Atividade de Classe Pública1  {
    public static void main(String[] args) {
        String[] nomes = new String[10 ];
        Scanner  = novo Scanner(System.em);

        Preenche o vetor com os nomes das pessoas
        para (int i = 0; Eu < nomes. comprimento; eu++) {
            Sistema. fora. println("Digite o nome da pessoa " + (i + 1) + ":");
            nomes[i] = scanner. nextLine();
        }


        Sistema. fora. println("Digite um nome para buscar:");
        String nomeBuscado = scanner. nextLine();

        Verifica se o nome buscado está presente no vetor
        booleano encontrado = false;
        for (String nome : nomes) {
            se (nome.equalsIgnoreCase(nomeBuscado)) {
                encontrado = verdadeiro;
                quebrar;
            }
        }

        Exibe a mensagem de acordo com o resultado da busca
        if (encontrado) {
            Sistema. fora. println("ACHEI");
        } mais {
            Sistema. fora. println("NÃO ACHEI");
        }
    }
}