package example.world.blocks;

import mindustry.content.*;
import import mindustry.world.blocks.environment.*;

public class EffectWall extends StaticWall{
  public Effect effect = Fx.smeltsmoke;
  public EffectWall(String name){
    super(name);
  }
  public void update(Tile tile){
    super.update();
    effect.at(tile.worldx(), tile.worldy());
  }
}
