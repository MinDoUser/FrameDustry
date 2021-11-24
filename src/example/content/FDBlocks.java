package example.content;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.struct.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.entities.bullet.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.units.*;
import mindustry.world.meta.*;
import mindustry.world.draw.*;


import example.content.*;
import example.content.FDItems;
import example.world.blocks.*;

import static mindustry.type.ItemStack.with;

public class FDBlocks implements ContentList {
  public static Block 
	  //env
	  hotwall,
    	//walls
    	leadwall,
	//crafting
	exiteSmelter;
  	@Override
	public void load() {
	hotWall = new EffectWall("hot-wall"){{
            	variants = 2;
		effect = Fx.magmasmoke;
        }};
	exiteSmelter = new GenericCrafter("exite-smelter") {{
            requirements(Category.crafting, with(
                Items.copper, 120,
		Items.silicon, 78
            ));
            localizedName = "Exite Smelter";
            size = 2;
            health = 80 * size * size;
            hasItems = true;
            drawer = new DrawSmelter();
            craftTime = 59;
            craftEffect = Fx.smelt;
            consumes.items(
		    new ItemStack(Items.silicon, 3),
		    new ItemStack(Items.metaglass, 1)
	    );

            consumes.power(0.9f);
            outputItem = new ItemStack(FDItems.exite, 1);
        }};
  		leadwall = new Wall("lead-wall") {{
			requirements(Category.defense, with(Items.lead, 6));
			localizedName = "Lead Wall";
			health = 350;
			size = 1;
		}};
  }
}
