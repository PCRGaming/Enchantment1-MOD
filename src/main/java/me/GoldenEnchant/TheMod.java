// Doctor Alexander Tran VII
package me.GoldenEnchant;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.minecraft.util.EnumChatFormatting;

import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = TheMod.MODID, version = TheMod.VERSION, clientSideOnly = true)
public class TheMod {
	public static final String MODID = "EnchantMent Mod";
    public static final String VERSION = "1.0";

    static Map<String, String> colouredEnchants = new HashMap<String, String>();
    static Pattern pattern = Pattern.compile("");

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	FMLCommonHandler.instance().bus().register(this);
    	MinecraftForge.EVENT_BUS.register(this);

//Template t6Enchants.put(EnumChatFormatting.BLUE + "",EnumChatFormatting.GOLD + "");
		String patternString = "(" + String.join("|", colouredEnchants.keySet()) + ")";
		pattern = Pattern.compile(patternString);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ClientCommandHandler.instance.registerCommand(new GoldenEnchantToggleCommand());
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onTooltip(ItemTooltipEvent event) {
    	if (event.toolTip == null || !GoldenEnchantToggleCommand.goldToggled) return;

    	ItemStack item = event.itemStack;
    	for (int i = 0; i < event.toolTip.size(); i++) {
    		event.toolTip.set(i, returnGoldenEnchants(event.toolTip.get(i)));
    	}
    }

    public String returnGoldenEnchants(String line) {
    	Matcher matcher = TheMod.pattern.matcher(line);
    	StringBuffer out = new StringBuffer();

    	while (matcher.find()) {
    		matcher.appendReplacement(out, TheMod.colouredEnchants.get(matcher.group(1)));
    	}
    	matcher.appendTail(out);

    	return out.toString();
    }

}
