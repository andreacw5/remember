package room.intro;

import room.chapterone.ChapterOne;
import setting.Player;
import util.MessageUtils;

import java.util.Scanner;

class LivingRoom {
    private static String valuechannel;

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

    static void inizialize1(){

        /**
         *  Quarta stanza: "Soggiorno" (Ritorno)
         */

        print("stage4");
        print("introdialog25");
        print("introdialog26");
        print("introdialog27");
        print("introdialog28");
        print("introdialog29");
        print("introdialog30");
        print("introdialog31");

        boolean cicle4 = true;
        while(cicle4){

            Scanner iuoo = new Scanner(System.in);
            int w = iuoo.nextInt();

            if(w==1){
                print("introchannel1");
                //Chiusura ciclo
                cicle4 = false;
                valuechannel = "News <1>";
            }if(w==2){
                print("introchannel2");
            }if(w==3){
                print("introchannel3");
                //Chiusura ciclo
                cicle4 = false;
                valuechannel = "RazZza 3";
            }if(w==4){
                print("introchannel4");
            }if(w==5){
                print("introchannel5");
                //Chiusura ciclo
                cicle4 = false;
                valuechannel = "Channel 5";
            }if(w > 5){
                print("introchanneldefresp");
            }
        }

        print( "introdialog32");
        System.out.println(MessageUtils.getLocalizedString( "introdialog33") +" "+ valuechannel +" "+ MessageUtils.getLocalizedString( "introdialog34"));
        print( "introdialog35");
        print( "introdialog36");
        print( "introdialog37");
        print( "introdialog38");
        print( "introdialog39");
        print( "introdialog40");
        print( "introdialog41");
        print( "introdialog42");

        // Stage successivo
        ChapterOne.Stage1();

    }
}
