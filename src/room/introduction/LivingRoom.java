package room.introduction;

import util.MessageUtils;

import java.util.Scanner;

class LivingRoom {

    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    private static void message(String aMessage){
        MessageUtils.getLocalizedString(aMessage);
    }

    public static void inizialize(){

        /**
         *  Seconda stanza: "Soggiorno"
         */

        print("introdialog1");
        print( "introdialog2");

        boolean cicle2 = true;
        while(cicle2){

            /**
             *  Scelte del giocatore
             */

            print( "playeractionsci1");
            print( "playeractionsci2");
            print( "playeractionsci3");
            print( "playeractionsci4");

            print("scelta");

            Scanner sog = new Scanner(System.in);
            int t = sog.nextInt();

            if(t==1){

            }if(t==2){

            }if(t==3){

            }if(t==4){
                //Chiusura ciclo
                cicle2 = false;
            }else{
                print("notallowed");
            }

            // Stage successivo
            print( "playeractionsci1");
            Introduction.introStage3();

        }
    }
}
