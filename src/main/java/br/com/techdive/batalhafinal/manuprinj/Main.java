package br.com.techdive.batalhafinal.manuprinj;


import static br.com.techdive.batalhafinal.manuprinj.utils.EntradaUtils.getInt;
import static br.com.techdive.batalhafinal.manuprinj.utils.EntradaUtils.getString;

import br.com.techdive.batalhafinal.manuprinj.classesdecombate.Arqueiro;
import br.com.techdive.batalhafinal.manuprinj.classesdecombate.Guerreiro;
import br.com.techdive.batalhafinal.manuprinj.classesdecombate.Mago;
import br.com.techdive.batalhafinal.manuprinj.classesdecombate.Paladino;
import br.com.techdive.batalhafinal.manuprinj.inimigos.Alquimista;
import br.com.techdive.batalhafinal.manuprinj.inimigos.Armeiro;
import br.com.techdive.batalhafinal.manuprinj.inimigos.Lider;
import br.com.techdive.batalhafinal.manuprinj.types.Arma;
import br.com.techdive.batalhafinal.manuprinj.types.Motivacao;


public class Main {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo(a) à BATALHA FINAL!");
        String nomePersonagem = getString("Digite o nome do(a) personagem: ");

        System.out.println("Digite o gênero do(a) personagem: ");
        System.out.println("F - Feminino ");
        System.out.println("M - Masculino");
        String sexoPersonagem = getString("Digite o gênero do(a) personagem (F/M): ");
        if (!(sexoPersonagem.equals("M") || sexoPersonagem.equals("F"))) {
            System.out.println("Sexo inválido");
            return;
        }

        System.out.println("Digite que tipo de personagem você deseja criar: ");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Paladino");
        System.out.println("3 - Arqueiro");
        System.out.println("4 - Mago");
        int tipoPersonagem = getInt();

        Jogador personagem = null;

        Arma arma = getArma();

        if (tipoPersonagem == 1) {
            personagem = new Guerreiro(nomePersonagem, sexoPersonagem, arma);
        } else if (tipoPersonagem == 2) {
            personagem = new Paladino(nomePersonagem, sexoPersonagem, arma);
        } else if (tipoPersonagem == 3) {
            personagem = new Arqueiro(nomePersonagem, sexoPersonagem, arma);
        } else if (tipoPersonagem == 4) {
            personagem = new Mago(nomePersonagem, sexoPersonagem, arma);
        }

        if (tipoPersonagem < 1 || tipoPersonagem > 4) {
            System.out.println("Digite uma opção válida!!");
            return;
        }

        System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo,\n"
                + "e sob a luz do crepúsculo você está prestes a entrar na fase final da sua missão.\n"
                + "Você olha para o portal à sua frente, e sabe que a partir desse ponto, sua vida mudará para sempre.");

        System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente.\n"
                + "Você se lembra de todos os inimigos já derrotados para alcançar o covil do líder maligno.\n"
                + "Olha para seu equipamento de combate, já danificado e desgastado depois de tantas lutas.\n"
                + "Você está a um passo de encerrar para sempre esse mal.");

        System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");

        System.out.println("Digite qual o tipo de motivação do seu personagem: ");
        System.out.println("1 - Vingança");
        System.out.println("2 - Glória");
        int tipoMotivacao = getInt();

        if(tipoMotivacao==1) {
            personagem.setMotivacao(Motivacao.VINGANCA);
            System.out.println("Imagens daquela noite trágica invadem sua mente.\n"
                    + "Você nem precisa se esforçar para lembrar, pois essas memórias estão sempre presentes,\n"
                    + "mesmo que de pano de fundo, quando você tem outros pensamentos em foco, elas nunca o deixaram.\n"
                    + "Elas são o combustível que te fizeram chegar até aqui.\n"
                    + "E você sabe que não irá desistir até ter vingado a morte\n"
                    + "daqueles que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo.\n"
                    + "O maldito líder finalmente pagará por tanto mal causado na vida de tantos\n"
                    + "(e principalmente na sua).");
        } else {
            personagem.setMotivacao(Motivacao.GLORIA);
            System.out.println(
                    "Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços abertos,\n" + "bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e diversas riquezas,\n"
                            + "taberneiros se recusando a cobrar por suas bebedeiras e comilanças.\n" + "Desde já, você sente o amor do público, te louvando a cada passo que dá pelas ruas,\n"
                            + "depois de destruir o vilão que tanto assombrou a paz de todos.\n" + "Porém, você sabe que ainda falta o último ato dessa história.\n"
                            + "Você se concentra na missão.\n" + "A glória o aguarda, mas não antes da última batalha.");

            System.out.println(
                    "Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas,\n" + "suas mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado.\n"
                            + "Você avança pelo portal.");

            System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas.\n"
                    + "À sua frente, só é possível perceber que você se encontra em um corredor extenso.\n" + "Você só pode ir à frente, ou desistir.");
        }

        System.out.println("Você deseja:");
        System.out.println("1 - Seguir em frente");
        System.out.println("2 - Desistir");
        int tipoOperacao = getInt();

        if (tipoOperacao == 2) {
            System.out.println("O medo invade o seu coração e você sente que ainda não está à altura do desafio.\n"
                    + "Você se volta para a noite lá fora, e corre em direção à segurança.");
            System.exit(0);
        }

        System.out.println("Você caminha, atento a todos os seus sentidos, por vários metros,\n"
                + "até visualizar a frente uma fonte de luz, que você imagina ser a chama de uma tocha,\n"
                + "vindo de dentro de uma porta aberta.");

        System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha,\n"
                + "e pondera sobre como passar pela porta.");

        System.out.println("Você deseja passar pela porta:");
        System.out.println("1 - Andando Cuidadosamente");
        System.out.println("2 - Correndo");
        System.out.println("3 - Saltando");
        tipoOperacao = getInt();

        if (tipoOperacao == 1) {
            System.out.println("Você se concentra e pula em direção à luz, saltando de antes da porta até o interior da sala.");
        } else if (tipoOperacao == 2){
            System.out.println("Você respira fundo e desata a correr em direção à sala.\n"
                    + "Quando passa pela porta, sente que pisou em uma pedra solta,\n"
                    + "mas não dá muita importância e segue para dentro da sala, olhando ao redor à procura de inimigos.\n"
                    + "Não tem ninguém, mas você ouve sons de flechas batendo na pedra atrás de você,\n"
                    + "e quando se vira, vê várias flechas no chão.\n"
                    + "Espiando pela porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no teto,\n"
                    + "mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.");
        } else {
            System.out.println("Você toma cuidado e vai caminhando vagarosamente em direção à luz.\n" + "Quando você pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado em uma pedra solta.\n"
                    + "Você ouve um ruído de mecanismos se movimentando, e uma escotilha se abre no teto atrás de você, no corredor.\n"
                    + "Flechas voam da escotilha em sua direção, e você salta para dentro da sala, porém uma delas te acerta na perna.");
            Armadilha armadilha  = new Armadilha();
            armadilha.atacar(personagem);
        }

        System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede.\n"
                + "Uma delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas.\n"
                + "A porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você não sabe ler,\n"
                + "mas reconhece como sendo a língua antiga utilizada pelo inimigo.\n"
                + "Você se aproxima da porta e percebe que ela está trancada por duas fechaduras douradas,\n"
                + "e você entende que precisará primeiro derrotar o que estiver nas outras duas portas laterais,\n"
                + "antes de conseguir enfrentar o líder.");

        System.out.println("Você se dirige para a porta à direita.");

        System.out.println("Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
                + "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
                + "Ao entrar, você se depara com uma sala espaçosa,\n"
                + "com vários equipamentos de batalha pendurados nas paredes e dispostos em armários e mesas.\n"
                + "Você imagina que este seja o arsenal do inimigo, onde estão guardados os equipamentos que seus soldados\n"
                + "utilizam quando saem para espalhar o terror nas cidades e vilas da região.\n"
                + "Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar para trás.\n"
                + "Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um dos capitães do inimigo.\n"
                + "Um orque horrendo, de armadura, capacete e espada em punho, em posição de combate.\n"
                + "Ele avança em sua direção.");

        Armeiro armeiro = new Armeiro();
        combate(personagem, armeiro);

        System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados.\n"
                + "Olha em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");

        System.out.println("Você deseja pegar as armaduras nova?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        tipoOperacao = getInt();

        if (tipoOperacao == 1) {
            System.out.println("Você resolve usar os equipamentos do inimigo contra ele, e trocar algumas peças suas,\n"
                    + "que estavam danificadas, pelas peças de armaduras existentes na sala.\n" + "De armadura nova, você se sente mais protegido para os desafios à sua frente.");
            personagem.setPontosDefesa(personagem.getPontosDefesa() + 5);
        } else {
            System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
        }

        System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das fechaduras da porta do líder inimigo.\n"
                + "Você pega a chave e guarda numa pequena bolsa que leva presa ao cinto.");

        System.out.println("Você retorna à sala anterior e se dirige à porta da esquerda.\n"
                + "Você se aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada.\n"
                + "Segura com mais força sua arma com uma mão, enquanto empurra a porta com a outra.\n"
                + "Ao entrar, você se depara com uma sala parecida com a do arsenal, mas em vez de armaduras,\n"
                + "existem vários potes e garrafas de vidro com conteúdos misteriosos e de cores diversas,\n"
                + "e você entende que o capitão que vive ali, realiza experimentos com diversos ingredientes,\n"
                + "criando poções utilizadas pelos soldados para aterrorizar a região.");
        System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo.\n"
                + "Um orque horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.");

        Alquimista alquimista = new Alquimista();
        combate(personagem, alquimista);

        System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque do inimigo.\n"
                + "Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido levemente rosado,\n"
                + "pega a garrafa e pondera se deve beber um gole.");
        System.out.println("Você deseja beber?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        tipoOperacao = getInt();

        if (tipoOperacao == 1) {
            System.out.println("Você se sente revigorado para seguir adiante!");
            personagem.setPontosSaude(Jogador.SAUDE_MAXIMA);
        } else {
            System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
        }

        System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa,\n"
                + "e sabe que aquela chave abre a outra fechadura da porta do líder inimigo.\n"
                + "Você pega a chave e guarda na pequena bolsa que leva presa ao cinto.");

        System.out.println("De volta à sala das portas, você se dirige à porta final.\n"
                + "Coloca as chaves nas fechaduras, e a porta se abre.\n"
                + "Seu coração acelera, memórias de toda a sua vida passam pela sua mente,\n"
                + "e você percebe que está muito próximo do seu objetivo final.\n"
                + "Segura sua arma com mais firmeza, foca no combate que você sabe que irá se seguir, e adentra a porta.");

        System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e prisioneiros acorrentados às paredes.");

        System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de lâmina dupla.");

        System.out.println("Você deseja:");
        System.out.println("1 - Atacar");
        System.out.println("2 - Esperar");
        tipoOperacao = getInt();

        Lider lider = new Lider();
        if (tipoOperacao == 1) {
            personagem.atacar(lider);
        }
        combate(personagem, lider);

        System.out.println("Você conseguiu!");

        if (personagem.getMotivacao().equals(Motivacao.VINGANCA)) {

            System.out.println("Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma sensação de alívio e felicidade. "
                    + "Você se vingou, tudo que sempre quis, está feito. Agora você pode seguir sua vida.");
        }
        if (personagem.getMotivacao().equals(Motivacao.GLORIA)) {
            System.out.println("O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de alegria. "
                    + "A glória o aguarda, você a conquistou.");
        }

        System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta,\n"
                + "e todos vocês saem em direção à noite, retornando à cidade.\n"
                + "Seu dever está cumprido.");
    }

    private static void combate(Jogador personagem, Inimigo inimigo) {
        int tipoOperacao;
        while (inimigo.getPontosSaude() > 0) {
            inimigo.atacar(personagem);

            if (personagem.getPontosSaude() <= 0) {
                System.out.println("Você não estava preparado para a força do inimigo.");
                if (personagem.getMotivacao().equals(Motivacao.VINGANCA)) {
                    System.out.println("Não foi possível concluir sua vingança, e agora resta saber se alguém se vingará por você.");
                } else if (personagem.getMotivacao().equals(Motivacao.GLORIA)) {
                    if (personagem.getSexo().equals("F")) {
                        System.out.println("A glória que buscavas não será sua, e a cidade aguarda por sua próxima heroína");
                    } else {
                        System.out.println("A glória que buscavas não será sua, e a cidade aguarda por seu próximo herói");
                    }
                }
                System.exit(0);
            }

            System.out.println("1 - Atacar");
            System.out.println("2 - Fugir");
            tipoOperacao = getInt();

            if (tipoOperacao == 2) {
                System.out.println("Você não estava preparado para a força do inimigo, e decide fugir para que possa tentar novamente em uma próxima vez");
                System.exit(0);
            }
            personagem.atacar(inimigo);
        }
        System.out.println("O inimigo não é páreo para o seu heroísmo, e jaz imóvel aos seus pés.");
    }

    private static Arma getArma() {
        System.out.println("Selecione a arma do personagem:");
        for (Arma value : Arma.values()) {
            System.out.println(value.ordinal() + 1 + " - " + value.getNome());
        }
        int opcaoArma = getInt() - 1;
        return Arma.values()[opcaoArma];
    }

}
