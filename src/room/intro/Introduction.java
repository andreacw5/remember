package room.intro;

import util.MessageUtils;

public class Introduction {

    private static void print(String aMessage){
        System.out.println(MessageUtils.getLocalizedString(aMessage));
    }

    public static void introStage1(){

        // Messaggi di benvenuto
        print("w1");
        print("w2");
        print("w3");
        print("w4");
        print("w5");

        print("introSTART");
        BedRoom epic1 = new BedRoom();
        epic1.inizialize();

    }

    public static void introStage2(){

        LivingRoom epic2 = new LivingRoom();
        epic2.inizialize();

    }

    public static void introStage3(){

        StreetHome epic3 = new StreetHome();
        epic3.inizialize();

    }

    public static void introStage4(){

        LivingRoom.inizialize1();

    }

}
