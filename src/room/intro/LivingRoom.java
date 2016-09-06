package room.intro;

import setting.Player;
import util.MessageUtils;

import java.util.Scanner;

class LivingRoom {

    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    public static void inizialize(){

        /**
         *  Seconda stanza: "Soggiorno"
         */

        print("stage2");
        print("introdialog5");

        // Differenzia in caso il giocatore non ha selezionato un vestito
        if (Player.outfits == null){
            System.out.println(MessageUtils.getLocalizedString( "introdialog6") +" " + MessageUtils.getLocalizedString( "introdialog7"));

        }else{
            System.out.println(MessageUtils.getLocalizedString( "introdialog6") +" "+ MessageUtils.getLocalizedString( "dialogoutfit5") +" "+ MessageUtils.getLocalizedString( "introdialog7"));
        }

        print( "introdialog8");

        boolean cicle2 = true;
        while(cicle2){

            /**
             *  Scelte del giocatore
             */

            print( "playeractionsci7");
            print( "playeractionsci8");
            print( "playeractionsci9");

            print("scelta");

            Scanner sog = new Scanner(System.in);
            int t = sog.nextInt();

            if(t==1){
                // 1. Guarda dalla finestra
                print("dialogwindowint1");

            }if(t==2){
                // 2. Prendo la torcia
                print("dialogflash1");
                Player.flashlight = "torcia";

            }if(t==3){
                // 3. Esco dalla porta
                cicle2 = false;

            }if(t > 3){
                print("notallowed");
            }

        }

        // Stage successivo
        print( "introdialog9");
        print( "introdialog10");
        print( "introdialog11");
        Introduction.introStage3();
    }
}
