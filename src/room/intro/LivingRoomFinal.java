package room.intro;

import util.MessageUtils;

import java.util.Scanner;

class LivingRoomFinal {
    private static String valuechannel;

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
    }
}