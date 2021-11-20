package example.entities.bullet;

import arc.graphics.*;
import arc.graphics.g2d.*;
import arc.math.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.world.blocks.environment.*;
import mindustry.entities.Effect;

import static mindustry.Vars.tilesize;
import static arc.graphics.g2d.Draw.*;
import static arc.graphics.g2d.Lines.stroke;
import static arc.math.Angles.*;
import static mindustry.Vars.*;
//Bullet that shots arcs into any random direction
public class StormBullet extends BulletType {
  	public int lightningAmount = 10;
	  public float size = 1f;
  	public StormBullet(float speed, float damage) {
		super(speed, damage);
		layer = Layer.scorch;
        homingPower = 0.035f;
        homingRange = 20 * tilesize;
        keepVelocity = collidesAir = absorbable = hittable = reflectable = false;
        trailRotation = true;
        hitSoundVolume = 4f;
        hitSound = Sounds.explosionbig;
        trailEffect = new Effect(15f, e -> {
        	Floor floor = Vars.world.floorWorld(e.x, e.y);
			stroke(2 * e.fout());
			color(floor.mapColor);
			Lines.circle(e.x, e.y, 3 + e.finpow() * 8);
        });
        trailInterval = 0.2f;
	}
  	@Override
	public void update(Bullet b) {
    for(int x=0; x <= lightningAmount; x++){
		Lightning.create(b.team, Color.valueOf("bf92f9"), 16, b.x + Mathf.random(-40,40), b.y + Mathf.random(-40,40), Mathf.random(360), Mathf.random(8,20));
    }
		super.update(b);
	}
