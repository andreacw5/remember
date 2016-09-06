package room.intro;

import setting.Player;
import util.MessageUtils;

import java.util.Scanner;

class BedRoom {

    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    private static void message(String aMessage){
        MessageUtils.getLocalizedString(aMessage);
    }

    static void inizialize(){

        /**
         *  Prima stanza: "Camera da letto"
         */

        print("stage1");
        print("introdialog1");
        print( "introdialog2");

        // Scelta del nome del giocatore
        Player.nameSet();
        System.out.println(MessageUtils.getLocalizedString( "introdialogname1") +" "+ Player.name +" "+ MessageUtils.getLocalizedString( "introdialogname2"));

        print( "introdialog4");

        boolean cicle1 = true;

        while(cicle1){

            /**
             *  Scelte del giocatore
             */

            print( "playeractionsci1");
            print( "playeractionsci2");
            print( "playeractionsci3");
            print( "playeractionsci4");
            print( "playeractionsci5");
            print( "playeractionsci6");
            print("scelta");

            Scanner reader = new Scanner(System.in);
            int n = reader.nextInt();

            if(n==1){
                // 1. Vestirsi

                print("dialogoutfits1");
                print("dialogoutfits2");

                Player.outfitsSet();
                System.out.println(MessageUtils.getLocalizedString( "dialogoutfits3") +" "+ Player.outfits + MessageUtils.getLocalizedString( "dialogoutfits4"));

            }if(n==2){
                // 2. Osservare la stanza
                print("dialogroombed1");

                Player.bedroomcolorSet();
                System.out.println(MessageUtils.getLocalizedString( "dialogroombed2") +" "+ Player.bedroomcolor + MessageUtils.getLocalizedString( "dialogroombed3"));
                print("dialogroombed4");
                print("dialogroombed5");
                print("dialogroombed6");

            }if(n==3){
                // 3. Guarda dalla finestra
                print("dialogwindowint1");

            }if(n==4){
                // 4. Calendario
                print("dialogscageplayerint1");
                print("dialogscageplayerint2");

                Player.ageplayerSet();
                System.out.println(MessageUtils.getLocalizedString( "dialogscageplayerint3") +" "+ Player.ageplayer + MessageUtils.getLocalizedString( "dialogscageplayerint4"));

            }if(n==5){
                // 5. Specchio
                print("dialogaspectint1");

                Player.eyemirrorrSet();
                System.out.println(MessageUtils.getLocalizedString( "dialogaspectint2") +" "+ Player.eye + MessageUtils.getLocalizedString( "dialogaspectint3"));
                print("dialogaspectint4");
            }if(n==6){
                // 6. Chiusura ciclo
                cicle1 = false;
            }if(n > 6){
                print("notallowed");
            }
        }

        // Stage successivo
        Introduction.introStage2();
    }
}

