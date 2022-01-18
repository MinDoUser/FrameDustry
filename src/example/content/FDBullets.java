package example.content;

import arc.graphics.*;
import mindustry.ctype.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.graphics.*;

public class FDBullets implements ContentList{
    public static BulletType
      //Big
      copperBig, leadBig, denseBig, homingBig, burningBig, titaniumBig;
      @Override
      public void load(){
          copperBig = new BasicBulletType(5f, 17){{
            width = 9f;
            height = 14f;
            lifetime = 70f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;
            ammoMultiplier = 3;
        }};
        leadBig = new BasicBulletType(5f, 19){{
            width = 9f;
            height = 14f;
            lifetime = 65f;
            shootEffect = Fx.shootSmall;
            smokeEffect = Fx.shootSmallSmoke;
            ammoMultiplier = 2;
        }};
        denseBig = new BasicBulletType(4f, 23){{
            width = 9f;
            height = 15f;
            reloadMultiplier = 1.2f;
            ammoMultiplier = 1;
            lifetime = 70f;
        }};
        homingBig = new BasicBulletType(6f, 13, "bullet"){{
            width = 8f;
            height = 11f;
            homingPower = 0.2f;
            reloadMultiplier = 1.5f;
            ammoMultiplier = 3;
            lifetime = 70f;
        }};
        burningBig = new BasicBulletType(5f, 22, "bullet"){{
            width = 10f;
            height = 14f;
            frontColor = Pal.lightishOrange;
            backColor = Pal.lightOrange;
            status = StatusEffects.burning;
            hitEffect = new MultiEffect(Fx.hitBulletSmall, Fx.fireHit);

            ammoMultiplier = 3;

            splashDamage = 10f;
            splashDamageRadius = 22f;

            makeFire = true;
            lifetime = 60f;
        }};
       titaniumBig = new BasicBulletType(4.25f, 17, "bullet"){{
            width = 10f;
            height = 14f;
            status = StatusEffects.freezing;
            hitEffect = Fx.hitBulletSmall;

            ammoMultiplier = 2;

            splashDamage = 13f;
            splashDamageRadius = 14f;

            makeFire = false;
            lifetime = 90f;
        }};
      }
  }
