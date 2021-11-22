package example.world.blocks;

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
import arc.util.pooling.*;
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

public class ScatterSilo extends Block {
  //Inspirated by ScatterSilo. Founded in 'ExampleMod' from Anuken for Mindustry-Version 5
    public @Load("@-on") TextureRegion onRegion;
    public BulletType bullet = Bullets.standardCopper;
    
    public int shots = 10;

    public ScatterSilo(String name) {
        super(name);
        destructible = true;
        hasItems = true;
        update = true;
        solid = true;
        flags = EnumSet.of(BlockFlag.turret);
        sync = true;
        itemCapacity = 10;
        config(Boolean.class, (ScatterBlockBiuld entity, Boolean b) -> entity.enabled = b);
    }

    public class ScatterBlockBuild extends Building {
     @Override
        public boolean configTapped(){
            configure(!enabled);
            Sounds.click.at(this);
            return false;
        }
              @Override
        public void draw(){
            super.draw();

            if(enabled){
                Draw.rect(onRegion, x, y);
            }
        }
              @Override
        public Boolean config(){
            return enabled;
        }
              @Override
        public void drawSelect(){
            if(renderer.pixelator.enabled()) return;

            Font font = Fonts.outline;
            GlyphLayout l = Pools.obtain(GlyphLayout.class, GlyphLayout::new);
            boolean ints = font.usesIntegerPositions();
            font.getData().setScale(1 / 4f / Scl.scl(1f));
            font.setUseIntegerPositions(false);

            CharSequence text = enabled?"[lightgrey]"+Core.bundle.get("on"):"[lightgrey]"+Core.bundle.get("off");

            l.setText(font, text, Color.white, 90f, Align.left, true);
            float offset = 1f;

            Draw.color(0f, 0f, 0f, 0.2f);
            Fill.rect(x, y - tilesize/2f - l.height/2f - offset, l.width + offset*2f, l.height + offset*2f);
            Draw.color();
            font.setColor(Color.white);
            font.draw(text, x - l.width/2f, y - tilesize/2f - offset, 90f, Align.left, true);
            font.setUseIntegerPositions(ints);

            font.getData().setScale(1f);

            Pools.free(l);
        }
        @Override
        public void updateTile() {
            // check consume for shoot
          if(enabled){
            if (cons.valid()) {
                for (int i = 0; i <= shots; i++) {
                    bullet.create(this, this.team, x, y, Mathf.random() * 360f);
                }
            consume();
            }
            }
        }
    }
}
