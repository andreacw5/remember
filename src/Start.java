public class Start {


    private Start(String country, String language) {
        MessageUtils.init( country, language );
    }

    // Log di sistema
    private static void log(String aMessage){
        System.out.println(aMessage);
    }

    private void initialize() throws InterruptedException {

        //log("PlayerIsALIVE");
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

