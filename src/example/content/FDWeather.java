package example.content;

import arc.util.Time;
import mindustry.ctype.ContentList;
import mindustry.type.Weather;
import mindustry.type.weather.ParticleWeather;
import mindustry.world.meta.Attribute;

public class FDWeather implements ContentList{
	public static Weather quantumField;
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
			status = Status.freezing;
			statusDuration = 60f;
			attrs.set(Attribute.light, -0.3f);
			opacityMultiplier = 0.47f;
		}};
	}
}
