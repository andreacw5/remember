package room.introduction;

public class Introduction {

    public static void log(String aMessage){
        System.out.println(aMessage);
    }

    public static void message(String aMessage){
        MessageUtils.getLocalizedString(aMessage);
    }

    public static void introductions(){

        BedRoom epic1 = new BedRoom();
        epic1.inizialize();

        LivingRoom epic2 = new LivingRoom();
        epic2.inizialize();

        StreetHome epic3 = new StreetHome();
        epic3.inizialize();

        LivingRoomFinal epic4 = new LivingRoomFinal();
        epic4.inizialize();

    }

}
