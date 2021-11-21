package example.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class FDItems implements ContentList {
	public static Item 
	exite;
  
  	@Override
	public void load(){
		exite = new Item("exite", Color.valueOf("add8e6")) {{
			localizedName = "Exite";
			cost = 1.1f;
		}};
  }
}
