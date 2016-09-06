package room.introduction;

import util.MessageUtils;

import java.util.Scanner;

class LivingRoomFinal {
    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    private static void message(String aMessage){
        MessageUtils.getLocalizedString(aMessage);
    }

    public static void inizialize(){

        /**
         *  Quarta stanza: "Soggiorno" (Ritorno)
         */

        print("");
        print( "");

        boolean cicle4 = true;
        while(cicle4){

            /**
             *  Scelte del giocatore
             */

            print( "");
            print( "");
            print( "");
            print( "");

            print("scelta");

            Scanner iuoo = new Scanner(System.in);
            int w = iuoo.nextInt();

            if(w==1){

            }if(w==2){

            }if(w==3){

            }if(w==4){
                //Chiusura ciclo
                cicle4 = false;
            }else{
                print("notallowed");
            }

            // Stage successivo
            print( "");
            System.exit(0);

        }
    }
}