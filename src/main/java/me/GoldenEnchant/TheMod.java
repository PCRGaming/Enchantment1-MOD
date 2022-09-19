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

    static Map<String, String> t6Enchants = new HashMap<String, String>();
    static Pattern pattern = Pattern.compile("");

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	FMLCommonHandler.instance().bus().register(this);
    	MinecraftForge.EVENT_BUS.register(this);

//Template t6Enchants.put(EnumChatFormatting.BLUE + "",EnumChatFormatting.GOLD + "");

//SHEEP Enchantments 
t6Enchants.put(EnumChatFormatting.BLUE + "Rainbow II",EnumChatFormatting.RED + "R" + EnumChatFormatting.GOLD + "A" + EnumChatFormatting.YELLOW + "I" + EnumChatFormatting.GREEN + "N" + EnumChatFormatting.BLUE + "B" + EnumChatFormatting.DARK_PURPLE + "O" + EnumChatFormatting.LIGHT_PURPLE + "W " + EnumChatFormatting.DARK_GRAY + "I" + EnumChatFormatting.WHITE + "I");
t6Enchants.put("Rainbow I",EnumChatFormatting.RED + "R" + EnumChatFormatting.GOLD + "A" + EnumChatFormatting.YELLOW + "I" + EnumChatFormatting.GREEN + "N" + EnumChatFormatting.BLUE + "B" + EnumChatFormatting.DARK_PURPLE + "O" + EnumChatFormatting.LIGHT_PURPLE + "W " + EnumChatFormatting.WHITE + "I");

//Sword Enchantments
	//T10
t6Enchants.put(EnumChatFormatting.BLUE + "Champion X",EnumChatFormatting.RED + "Champion" + EnumChatFormatting.BOLD + " X");
	//T9
t6Enchants.put(EnumChatFormatting.BLUE + "Champion IX",EnumChatFormatting.GOLD + "Champion" + EnumChatFormatting.BOLD + " IX");
	//T8
t6Enchants.put(EnumChatFormatting.BLUE + "Champion VIII",EnumChatFormatting.GOLD + "Champion VIII");
	//T7
t6Enchants.put(EnumChatFormatting.BLUE + "Bane of Arthropods VII",EnumChatFormatting.RED + "Bane of Arthropods VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Critical VII",EnumChatFormatting.RED + "Critical VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Ender Slayer VII",EnumChatFormatting.RED + "Ender Slayer VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Giant Killer VII",EnumChatFormatting.RED + "Giant Killer VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Luck VII",EnumChatFormatting.RED + "Luck VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Sharpness VII",EnumChatFormatting.RED + "Sharpness VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Smite VII",EnumChatFormatting.RED + "Smite VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Thunderlord VII",EnumChatFormatting.RED + "Thunderlord VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Titan Killer VII",EnumChatFormatting.RED + "Titan Killer VII");
	//T6
t6Enchants.put(EnumChatFormatting.BLUE + "Bane of Arthropods VI",EnumChatFormatting.GOLD + "Bane of Arthropods VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Cleave VI",EnumChatFormatting.GOLD + "Cleave VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Critical VI",EnumChatFormatting.GOLD + "Critical VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Cubism VI",EnumChatFormatting.GOLD + "Cubism VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Ender Slayer VI",EnumChatFormatting.GOLD + "Ender Slayer VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Execute VI",EnumChatFormatting.RED + "Execute VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Giant Killer VI",EnumChatFormatting.GOLD + "Giant Killer VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Lethality VI",EnumChatFormatting.GOLD + "Lethality VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Luck VI",EnumChatFormatting.GOLD + "Luck VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Prosecute VI",EnumChatFormatting.GOLD + "Prosecute VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Sharpness VI",EnumChatFormatting.GOLD + "Sharpness VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Smite VI",EnumChatFormatting.GOLD + "Smite VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Thunderbolt VI",EnumChatFormatting.GOLD + "Thunderbolt VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Thunderlord VI",EnumChatFormatting.GOLD + "Thunderlord VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Titan Killer VI",EnumChatFormatting.GOLD + "Titan Killer VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Vampirism VI",EnumChatFormatting.GOLD + "Vampirism VI");
t6Enchants.put(EnumChatFormatting.BLUE + "Venomous VI",EnumChatFormatting.GOLD + "Venomous VI");
	//T5
t6Enchants.put(EnumChatFormatting.BLUE + "Dragon Hunter V",EnumChatFormatting.RED + "Dragon Hunter V");
t6Enchants.put(EnumChatFormatting.BLUE + "First Strike V",EnumChatFormatting.RED + "First Strike V");
t6Enchants.put(EnumChatFormatting.BLUE + "Life Steal V",EnumChatFormatting.RED + "Life Steal V");
t6Enchants.put(EnumChatFormatting.BLUE + "Looting V",EnumChatFormatting.RED + "Looting V");
t6Enchants.put(EnumChatFormatting.BLUE + "Scavenger V",EnumChatFormatting.GOLD.toString() + EnumChatFormatting.BOLD + "Scavenger V");
t6Enchants.put(EnumChatFormatting.BLUE + "Syphon V",EnumChatFormatting.RED + "Syphon V");
t6Enchants.put(EnumChatFormatting.BLUE + "Smoldering V",EnumChatFormatting.GOLD + "Smoldering V");
t6Enchants.put(EnumChatFormatting.BLUE + "Triple-Strike V",EnumChatFormatting.GOLD + "Triple-Strike V");
t6Enchants.put(EnumChatFormatting.BLUE + "Vicious V",EnumChatFormatting.GOLD + "Vicious V");
	//T4
t6Enchants.put(EnumChatFormatting.BLUE + "Experience IV",EnumChatFormatting.GOLD + "Experience IV");
t6Enchants.put(EnumChatFormatting.BLUE + "Life Steal IV",EnumChatFormatting.GOLD + "Life Steal IV");
t6Enchants.put(EnumChatFormatting.BLUE + "Looting IV",EnumChatFormatting.GOLD + "Looting IV");
t6Enchants.put(EnumChatFormatting.BLUE + "Scavenger IV",EnumChatFormatting.GOLD + "Scavenger IV");
t6Enchants.put(EnumChatFormatting.BLUE + "Syphone IV",EnumChatFormatting.GOLD + "Syphon IV");
	//T3
t6Enchants.put(EnumChatFormatting.BLUE + "Fire Aspect III",EnumChatFormatting.RED + "Fire Aspect III");
t6Enchants.put(EnumChatFormatting.BLUE + "Impaling III",EnumChatFormatting.GOLD + "Impaling III");
t6Enchants.put(EnumChatFormatting.BLUE + "Mana Steal III",EnumChatFormatting.GOLD + "Mana Steal III");
	//T2
t6Enchants.put("9Knockback II","mKnockback");
	//T1
t6Enchants.put("9Knockback I","mKnockback");
//Bow Enchantments
t6Enchants.put(EnumChatFormatting.BLUE + "Chance V",EnumChatFormatting.RED + "Chance V");
t6Enchants.put(EnumChatFormatting.BLUE + "Chance IV",EnumChatFormatting.GOLD + "Chance IV");
t6Enchants.put(EnumChatFormatting.BLUE + "Dragon Tracer V",EnumChatFormatting.GOLD + "Dragon Tracer V");
t6Enchants.put(EnumChatFormatting.BLUE + "Flame II",EnumChatFormatting.GOLD + "Flame II");
t6Enchants.put(EnumChatFormatting.BLUE + "Infinite Quiver X",EnumChatFormatting.RED + "Infinite Quiver" + EnumChatFormatting.BOLD + "X");
t6Enchants.put(EnumChatFormatting.BLUE + "Infinite Quiver IX",EnumChatFormatting.GOLD + "Infinite Quiver" + EnumChatFormatting.BOLD + "IX");
t6Enchants.put(EnumChatFormatting.BLUE + "Infinite Quiver X",EnumChatFormatting.GOLD + "Infinite Quiver XIII");
t6Enchants.put(EnumChatFormatting.BLUE + "Overload V",EnumChatFormatting.GOLD + "Overload V");
t6Enchants.put(EnumChatFormatting.BLUE + "Piercing I",EnumChatFormatting.GOLD + "Piercing I");
t6Enchants.put(EnumChatFormatting.BLUE + "Power VII",EnumChatFormatting.RED + "Power VII");
t6Enchants.put(EnumChatFormatting.BLUE + "Power VI",EnumChatFormatting.GOLD + "Power VI");
t6Enchants.put("9Punch II","mPunch");
t6Enchants.put("9Punch I","mPunch");
t6Enchants.put(EnumChatFormatting.BLUE + "Snipe IV",EnumChatFormatting.GOLD + "Snipe IV");
//Universal Armour Enchantments

//Head Enchantments

//Chestplate Enchantments

//Leggings Enchantments

//Boots Enchantments

//Tools Enchantments

//Fishing Rod Enchantments

//Ultimate Enchantments
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Bank V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Bank" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Bobbin' Time V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Bobbin' Time" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Chimera V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Chimera" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Combo V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Combo" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Duplex V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Duplex" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Fatal Tempo V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Fatal Tempo" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Flash V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Flash" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Habanero Tactics V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Habanero Tactics" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Inferno V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Inferno" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Last Stand V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Last Stand" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Legion V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Legion" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "No Pain No Gain V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "No Pain No Gain" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "One For All I",EnumChatFormatting.RED.toString() + EnumChatFormatting.BOLD + "One For All");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Rend V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Rend" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Soul Eater V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Soul Eater" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Swarm V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Swarm" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Ultimate Jerry V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Ultimate Jerry" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Ultimate Wise V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Ultimate Wise" + EnumChatFormatting.RED + " V");
t6Enchants.put(EnumChatFormatting.LIGHT_PURPLE.toString() + EnumChatFormatting.BOLD + "Wisdom V",EnumChatFormatting.DARK_PURPLE.toString() + EnumChatFormatting.BOLD + "Wisdom" + EnumChatFormatting.RED + " V");

		String patternString = "(" + String.join("|", t6Enchants.keySet()) + ")";
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
    		matcher.appendReplacement(out, TheMod.t6Enchants.get(matcher.group(1)));
    	}
    	matcher.appendTail(out);

    	return out.toString();
    }

}
