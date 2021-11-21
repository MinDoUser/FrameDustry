package example.content;

import mindustry.type.StatusEffect;
import arc.util.Time;
import mindustry.ctype.ContentList;
import mindustry.type.Weather;
import mindustry.type.weather.ParticleWeather;
import mindustry.world.meta.Attribute;
import arc.graphics.Color;
import arc.graphics.Colors;
import mindustry.graphics.Pal;
import mindustry.content.StatusEffects;

public class FDWeather implements ContentList{
	public static Weather iceStorm;
	@Override
	public void load(){
		iceStorm = new ParticleWeather("ice-storm"){{
			duration = 5 * Time.toMinutes;
			noiseLayers = 3;
			noiseLayerSclM = 0.8f;
			noiseLayerAlphaM = 0.7f;
			noiseLayerSpeedM = 2f;
			noiseLayerSclM = 0.6f;
			baseSpeed = 0.1f;
			noiseColor = Color.valueOf("#add8e6");
			color = Color.valueOf("#d8f1f9cc");
			noiseScale = 1100f;
			noisePath = "fog";
			drawParticles = false;
			drawNoise = true;
			useWindVector = true;
			xspeed = 1f;
			yspeed = 0.01f;
			
			statusAir = statusGround = true;
			status = StatusEffects.freezing;
			statusDuration = 60f;
			attrs.set(Attribute.light, -0.3f);
			opacityMultiplier = 0.47f;
		}};
	}
}
