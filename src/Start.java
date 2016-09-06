import room.introduction.Introduction;
import setting.Player;
import setting.ProcessInput;
import setting.Room;
import setting.Scans;
import util.MessageUtils;

/******************************

      Remember Your Life

*******************************/

public class Start {


    private Start(String country, String language) {
        MessageUtils.init( country, language );
    }

    public static void log(String aMessage){
        System.out.println(aMessage);
    }

    public static void message(String aMessage){
        MessageUtils.getLocalizedString(aMessage);
    }

    private void initialize() throws InterruptedException {

        Introduction.introStage1();

        Room.enter();


        while(Player.life)
         {
         ProcessInput.input();
         }

         Scans.inputer.close();


    }

    public static void main(String[] args) throws InterruptedException {
        String language;
        String country;

        if (args.length != 2) {
            language = "it";
            country = "IT";
        } else {
            language = args[0];
            country = args[1];
        }
        Start main = new Start(language, country);
        main.initialize();
    }

}