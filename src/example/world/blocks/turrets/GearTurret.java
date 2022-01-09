package example.world.blocks.turrets;

import arc.*;
import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import arc.struct.*;
import mindustry.gen.*;
import mindustry.world.meta.*;
import mindustry.world.blocks.defense.turrets.BaseTurret;
import mindustry.world.consumers.*;
import mindustry.type.*;
import mindustry.world.meta.*;
import mindustry.world.Block;

//Speed up reloadtime by each turret next to it.
public class GearTurret extends BaseTurret {
	public GearTurret(String name) {
		super(name);
	}
	/* WIP
  	@Override
	public void setStats() {
		super.setStats();
		stats.add("Speed increase/turret", 0.2f, "Reload speed");
} */
}
public class GearTurretBiuld extends BaseTurretBuild {
  		public float getProximityBlocks() {
			float mult = 0f;
			for (int i = 0; i < this.proximity.size; i++) {
				if (this.proximity.get(i) instanceof BaseTurret) {
					mult += 0.2f;
				}
			}
		}
      public float baseReloadSpeed() {
        return this.efficiency() * this.getProximityBlocks();
    }
}
