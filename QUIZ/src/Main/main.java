
package Main;

import java.util.Scanner;


public class main {

    
    public static void main(String[] args) {
    Scanner grava = new Scanner(System.in);
    
    int nada;
    int res;
    int cont = 0;
    System.out.println("Bem vindo ao quiz sobre jogos!! aperte qualquer número pra começar:");
    nada = grava.nextInt();
    
    System.out.println("QUESTÃO 1 - No jogo League Of Legends, qual personagem é conhecido por usar sua voz para batalhar? \n 1 - Seraphine \n 2 - Lux \n 3 - Sona");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 1){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
    }System.out.println("QUESTÃO 2 - No jogo Super Mario World, uuqal o nome da princesa que o mario precisa salvar? \n 1 - Betty \n 2 - Luna \n 3 - Peach");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 3){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
    }System.out.println("QUESTÃO 3 - Em Dragon Ball BT3, qual o personagem mais forte? \n 1 - Baby Vegeta \n 2 - Omega sheeron \n 3 - Gogeta");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 3){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
    
    }System.out.println("QUESTÃO 4 - Qual jogo da franquia Assassin's Creed se passa na revolução Francesa? \n 1 - Valhalla \n 2 - Unity \n 3 - Origins");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 2){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
    
    }System.out.println("QUESTÃO 5 - Qual foi o primeiro jogo eletrônico? (dica: foi criado em um eletrocardiograma) \n 1 - Pong \n 2 - Jogo da Cobrinha \n 3 - Xadrez");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 1){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
        
    }System.out.println("QUESTÃO 6 - No universo de Five Nights Ats Freddys, quem foi a primeira vítima de Willian Afton \n 1 - Charlotte Emily \n 2 - Michael Afton \n 3 - Cassady");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 1){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
        
    }System.out.println("QUESTÃO 7 - Seguindo em FNAF, quem foi o responsavel pelo mordida de 83? \n 1 - Freddy \n 2 - Willian Afton \n 3 - Freddy Bear");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 3){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
        
    }System.out.println("QUESTÃO 8 - Quem é o vilão final de mortal kombat 11? \n 1 - Shao Kan \n 2 - Shang Sung \n 3 - Kronika");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 3){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
        
    }System.out.println("QUESTÃO 9 - Qual o primeiro Chefe de God Of War 3? \n 1 - Poseidon  \n 2 - Gaia \n 3 - Hercules");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 1){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
        
    }System.out.println("QUESTÃO 10 - Qual o nome da filha de Kratos \n 1 - Pandora \n 2 - Calliope \n 3 - Nix");
    System.out.println("digite uma das opções:");
    res = grava.nextInt();
    
    if(res == 2){
        cont ++;
        System.out.println("RESPOSTA CORRETA!");
        
    }
    
    if(cont <= 4){
        System.out.println("Não manja nada");
    } else if(cont <= 8){
        System.out.println("Bom, mais precisa melhorar");    
    } else if(cont <= 9){
        System.out.println("Foi quase!");
    } else if(cont == 10){
        System.out.println("Você é o cara");
    }
    System.out.println("Pontuação final");
    }
}