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

import example.world.blocks.logic.*;


import example.content.*;
import example.content.FDItems;

import static mindustry.type.ItemStack.with;

public class FDBlocks implements ContentList {
  public static Block 
	 //turret
	  bolt,
    	//walls
    	leadwall,
	//crafting
	//exiteSmelter;
	//Logic
	infoMessage;
  	@Override
	public void load() {
		/*
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
        }};*/
	bolt = new ItemTurret("Bolt"){{
			size = 2;
			health = 890;
			range = 140f;
			targetAir = true;
			inaccuracy = 5f;
			spread = 4f;
			velocityInaccuracy = 0.15f;
			shots = 2;
			reloadTime = 45f;
			coolantMultiplier = 0.6f;
			recoilAmount = 4f;
			shootShake = 2f;
			shootSound = Sounds.pew;
			ammo(
                		Items.copper, Bullets.standardCopper,
				Items.lead, Bullets.standardCopper,
                		Items.graphite, Bullets.standardDense,
                		Items.pyratite, Bullets.standardIncendiary,
                		Items.silicon, Bullets.standardHoming,
				Items.titanium, Bullets.standardDense
            		);
			requirements(Category.turret, with(Items.copper, 135, Items.silicon, 20, Items.graphite, 47, Items.lead, 125));
		}
		 leadwall = new Wall("lead-wall") {{
			requirements(Category.defense, with(Items.lead, 6));
			localizedName = "Lead Wall";
			health = 350;
			size = 1;
		}};
  		infoMessage = new WaveInfoMessage("info-message") {{
			requirements(Category.logic, with(Items.copper, 1));
			localizedName = "Wave Information Message";
			health = 40;
			size = 1;
		}};
  }
}
