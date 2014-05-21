package net.kay.Mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid =Stringssss.MODID , name = Stringssss.NAME, version = Stringssss.VeRsion)
public class Main {

	
	
	@Instance(Stringssss.MODID)
	public static Main instance;
	@SidedProxy(serverSide = "net.kay.Mod.CommonProxy", clientSide = "net.kay.Mod.ClientProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs TabMod = new CreativeTabs("TabMod") {
		
		@Override
		public Item getTabIconItem() {
			
			return Item.getItemFromBlock(FrostOre);
		}
	};
	
	
	
	//Items
	public static Item FrostIngot = new FrostIngot().setUnlocalizedName("FrostIngot").setCreativeTab(TabMod).setTextureName(Stringssss.MODID + ":DiamondIngot");
	
	
 	//Blocks
	public static Block FrostOre = new FrostOre(Material.rock).setBlockName("ForstOre");
	
	
	public void load(FMLInitializationEvent event){
		proxy.registerRenders();
		
		
		
		
		
		
	}
	
	public Main(){
		GameRegistry.registerItem(FrostIngot, "DiamondIngot");
		
		GameRegistry.registerBlock(FrostOre, "ForstOre");
	}

}
