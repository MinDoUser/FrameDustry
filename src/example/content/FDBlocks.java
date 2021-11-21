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
import example.world.blocks.power.*;

import static mindustry.type.ItemStack.with;

public class FDBlocks implements ContentList {
  public static Block 
    	//walls
    	leadwall;
  	@Override
  		leadwall = new Wall("lead-wall") {{
			requirements(Category.defense, with(Items.lead, 6));
			localizedName = "Lead Wall";
			health = 350;
			size = 1;
		}};
  }
}
