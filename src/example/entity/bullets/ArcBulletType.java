package example.entity.bullets;

import mindustry.content.Fx;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.Bullet;
import mindustry.entities.bullet.BasicBulletType;

public class ArcBulletType extends BasicBulletType{
  public int lightingAmount = 10;
  public float lightningDamage = 60f;
		public ArcBulletType(float speed, float damage, String bulletSprite, int lightnings, float lightningD) {
		super(speed, damage, bulletSprite);
    this.lightningAmount = lightnings;
    this.lightningDamage = lightningD;
	}

	@Override public void draw(Bullet b){}
	@Override public void drawLight(Bullet b){}
  @Override
  public void update(Bullet b){
    for(int x; x<=lightningAmount; x++){
    Lightning.create(b.team, Color.valueOf("ffffff"), lightningDamage, b.x, b.y, 40f);
    }
    super.update(b);
  }
}
