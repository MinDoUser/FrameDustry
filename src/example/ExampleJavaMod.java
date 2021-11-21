package example;

import example.content.*;
import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded ExampleJavaMod constructor.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("Welcome!");
                dialog.cont.add("Welcome to my first JAR mods. \n I am sorry if there are any errors.").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                //dialog.cont.image(Core.atlas.find("example-java-mod-frog")).pad(20f).row();
                dialog.cont.button("Let's play!", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        new FDBlocks().load();
        new FDWeather().load();
        new FDItems().load();
    }

}
