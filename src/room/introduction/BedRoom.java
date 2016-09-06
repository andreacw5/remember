package room.introduction;

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

            }else if(n==2){
                // 2. Osservare la stanza
                print("dialogroombed1");

                Player.bedroomcolorSet();
                System.out.println(MessageUtils.getLocalizedString( "dialogroombed2") +" "+ Player.bedroomcolor + MessageUtils.getLocalizedString( "dialogroombed3"));

                print("dialogroombed4");

            }else if(n==3){
                // 3. Guarda dalla finestra
                print("dialogwindowint1");

            }else if(n==4){
                // 4. Calendario
                print("dialogscageplayerint1");

                Player.ageplayerSet();

                System.out.println(MessageUtils.getLocalizedString( "dialogscageplayerint2") +" "+ Player.ageplayer + MessageUtils.getLocalizedString( "dialogscageplayerint3"));

            }else if(n==5){
                // 5. Specchio
                print("");
                print("");
                print("");
                Scanner eye = new Scanner(System.in);
                int g = eye.nextInt();
                if(g>1){
                    // esito 1
                    print("");
                }if(g<2){
                    // esito 2
                    print("");
                }
                print("");
                print("");
            }else if(n==6){
                // 6. Chiusura ciclo
                cicle1 = false;
            }else{
                print("notallowed");
            }

            // Stage successivo
            print( "playeractionsci1");
            Introduction.introStage2();
        }
    }
}
