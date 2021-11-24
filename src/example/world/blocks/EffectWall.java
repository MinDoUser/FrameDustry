package example.world.blocks;

import mindustry.content.*;
import arc.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.math.geom.*;
import mindustry.annotations.Annotations.*;
import mindustry.graphics.*;
import mindustry.world.*;

public class EffectWall extends StaticWall{
  public Effect effect = Fx.smeltsmoke;
  public EffectWall(String name){
    super(name);
  }
  public void updateTile(Tile tile){
    //super.update();
    effect.at(tile.worldx(), tile.worldy());
  }
}
