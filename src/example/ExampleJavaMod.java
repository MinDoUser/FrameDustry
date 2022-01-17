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

	public static void startScreen(){
		BaseDialog dialog = new BaseDialog("");
		dialog.closeOnBack();
		dialog.cont.pane(inner -> {
			inner.pane(table -> {
				table.pane(p -> {
					p.add("[white]<<< Loaded Framedustry >>>", Styles.techLabel).row();
				}).fillY().growX().row();
				table.add("").row();
			}).growX().center().row();
			
			inner.table(table -> {
				table.table(t -> {
					t.add("$FD-WelcomeText");
				}).grow();
			}).fill();
		}).grow();
		dialog.cont.button("< Ready >", dialog::hide).size(100f, 50f);
	dialog.show();
}
	
    public ExampleJavaMod(){
        Log.info("Loaded[stat] FrameDustry[] constructor.");
        Log.info("So, yeah, let's have fun together, hopefully... ?");
	Events.on(ClientLoadEvent.class, e -> {
		startScreen();
	});
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
