package net.kay.Mod;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;

public class FrostOre extends Block {

	protected FrostOre(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setResistance(15F);
		this.setBlockTextureName(Stringssss.MODID + ":FrostOre");
		this.setHardness(10F);
		this.setCreativeTab(Main.TabMod);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	
	
	 public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        return Main.FrostIngot;
	    }

	    /**
	     * Returns the quantity of items to drop on block destruction.
	     */
	    public int quantityDropped(Random p_149745_1_)
	    {
	        return p_149745_1_.nextInt(5);
	    }
		
	
    public int getExpDrop(IBlockAccess p_149690_1_, int p_149690_5_, int p_149690_7_)
    {
        
        return 70;
    }

		

}
