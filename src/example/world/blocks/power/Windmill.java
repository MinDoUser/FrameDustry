package example.world.blocks.power;

import mindustry.world.meta.*;
import arc.util.Time;
import arc.*;
import arc.Core;
import arc.audio.*;
import arc.func.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import arc.struct.*;
import arc.util.*;
import arc.util.io.*;
import arc.scene.ui.*;
import arc.scene.ui.layout.*;
import mindustry.audio.*;
import mindustry.content.*;
import mindustry.graphics.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.world.meta.*;
import mindustry.world.*;
import mindustry.logic.*;
import mindustry.type.*;
import mindustry.world.draw.*;


import static mindustry.Vars.*;

public class Windmill extends PowerGenerator {
  public float rotorSpeed = 4;
  public TextureRegion rotorRegion, blockRegion, outlineRegion;
      public Windmill(String name){
        super(name);
        //Creates a low priority for units...
        flags = EnumSet.of();
        envEnabled = Env.any;
    }
  	public void load() {
		blockRegion = Core.atlas.find(name);
		rotorRegion = Core.atlas.find(name + "-rotor");
		outlineRegion = Core.atlas.find(name + "-rotor-outline");
	}
      @Override
    public void setStats(){
        super.setStats();
        stats.remove(generationType);
        stats.add(generationType, powerProduction * 60.0f, StatUnit.powerSecond);
    }
      public class WindmillBiuld extends GeneratorBuild{
      @Override
        public void updateTile(){
            productionEfficiency = 1f;//*wind; Need to create a map setting 'Wind' first...
        }
        public void draw(Block b) {
		Draw.rect(blockRegion, b.x, b.y);
          	Draw.rect(rotorRegion, b.x, b.y, Time.time * rotorSpeed);
		Draw.rect(outlineRegion, b.x, b.y, Time.time * rotorSpeed);
        }
      }
}
