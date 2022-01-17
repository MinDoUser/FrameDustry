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
import mindustry.ui.dialogs.BaseDialog;
import mindustry.ui.Styles;
//Yep, it's not the best name, but everthing else just didn't work...
public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Log.info("Loaded[stat] FrameDustry[] constructor.");
        Log.info("So, yeah, let's have fun together, hopefully... ?");
    }
    public static void startLog(){
        	BaseDialog dialog = new BaseDialog("");

    dialog.buttons.defaults().size(210, 64);
   dialog.closeOnBack();
       dialog.cont.pane(inner -> {

        inner.pane(table -> {
        table.add("[white]<< Loaded Framedustry >>", Styles.techLabel).row();
        table.row();
	    table.add("This Mod is still in Development! \n It adds some intresting things and other senceless stuff. \n Have Fun!").left().growX().wrap().width(620).maxWidth(620).pad(4).labelAlign(Align.left);
	    table.row();
        table.add("[cyan]> By lol02 <", Styles.techLabel).row();
    })()).grow().center().maxWidth(620);
    dialog.show();
    }
    @Override
    public void loadContent(){
        new FDBlocks().load();
        new FDWeather().load();
        new FDItems().load();
        //new FDPlanets().load();
        //new FDSectors().load();
        Log.info("Loaded all Java files.");
    }

}
