import room.intro.Introduction;
import setting.Player;
import setting.ProcessInput;
import setting.Scans;
import util.MessageUtils;

/******************************

      Remember Your Life

*******************************/

public class Start {


    private Start(String country, String language) {
        MessageUtils.init( country, language );
    }

    private void initialize() throws InterruptedException {

        Introduction.introStage1();

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