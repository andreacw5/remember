package room.intro;

import setting.Player;
import util.MessageUtils;

import java.util.Scanner;

class StreetHome {

    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    public static void inizialize(){

        /**
         *  Terza stanza: "Strada fuori casa"
         */

        print("stage3");
        print("introdialog12");
        print("introdialog13");

        // Se il giocatore ha preso la torcia verrà avviata la scelta, altrimenti il programma continua
        if(Player.flashlight == null){
            //NULLA ACCADE!!!!
        }else{
            print( "playeractionsci12");
            print( "playeractionsci13");
            Scanner io = new Scanner(System.in);
            int f = io.nextInt();

            if(f==1){
                // Usa la torcia
                Player.flashlightON = "accendo la torcia";
                print( "dialogflash2");
                print( "dialogflash3");

            }if(f==2){
                // Non usare la torcia
                print( "dialogflash7");
                print( "dialogflash4");
                print( "dialogflash5");
                print( "dialogflash6");

            }if(f > 2){
                print( "notallowed");
            }
        }

        print( "introdialog14");
        print( "introdialog15");
        print( "introdialog16");
        print( "introdialog17");
        print( "introdialog18");
        print( "introdialog19");
        print( "introdialog20");

        boolean cicle3 = true;
        while(cicle3){

            /**
             *  Scelte del giocatore
             */

            print( "dialoginspection1");
            print( "dialoginspection3");
            print( "dialoginspection5");
            print( "dialoginspection9");

            print("scelta");

            Scanner iuo = new Scanner(System.in);
            int u = iuo.nextInt();

            if(u==1){
                print( "dialoginspection2");
            }if(u==2){
                print( "dialoginspection4");
            }if(u==3){
                print( "dialoginspection6");
                print( "dialoginspection7");
                print( "dialoginspection8");
            }if(u==4){
                //Chiusura ciclo
                cicle3 = false;
            }if(u > 4){
                print("notallowed");
            }
        }

        print( "introdialog21");
        print( "introdialog22");
        print( "introdialog23");
        print( "introdialog24");

        // Stage successivo
        Introduction.introStage4();
    }
}