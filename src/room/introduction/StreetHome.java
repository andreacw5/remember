package room.introduction;

import util.MessageUtils;

import java.util.Scanner;

class StreetHome {

    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    private static void message(String aMessage){
        MessageUtils.getLocalizedString(aMessage);
    }

    public static void inizialize(){

        /**
         *  Terza stanza: "Strada fuori casa"
         */

        print("");
        print( "");

        boolean cicle3 = true;
        while(cicle3){

            /**
             *  Scelte del giocatore
             */

            print( "");
            print( "");
            print( "");
            print( "");

            print("scelta");

            Scanner iuo = new Scanner(System.in);
            int u = iuo.nextInt();

            if(u==1){

            }if(u==2){

            }if(u==3){

            }if(u==4){
                //Chiusura ciclo
                cicle3 = false;
            }else{
                print("notallowed");
            }

            // Stage successivo
            print( "");
            Introduction.introStage4();

        }
    }
}