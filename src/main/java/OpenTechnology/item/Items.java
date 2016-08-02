package OpenTechnology.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

/**
 * Created by Avaja on 07.05.2016.
 */
public class Items {
    public static Item tesla, tesseract, radar;

    public static void init(){

        tesla = new ItemTeslaUpgrade();
        tesseract = new ItemTesseractUpgrade();
        radar = new ItemRadarUpgrade();

        GameRegistry.registerItem(tesla, "ot_teslaUpgrade");
        GameRegistry.registerItem(tesseract, "ot_teleportUpgrade");
        GameRegistry.registerItem(radar, "ot_radarUpgrade");
    }
}
