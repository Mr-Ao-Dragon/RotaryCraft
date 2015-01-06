/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 24/03/2013 6:26:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;
import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelVLamp extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape7;
	LODModelPart Shape8;
	LODModelPart Shape9;
	LODModelPart Shape10;
	LODModelPart Shape11;
	LODModelPart Shape12;
	LODModelPart Shape13;
	LODModelPart Shape14;
	LODModelPart Shape15;
	LODModelPart Shape16;
	LODModelPart Shape17;
	LODModelPart Shape17b;
	LODModelPart Shape18;
	LODModelPart Shape18b;
	LODModelPart Shape19;

	public ModelVLamp()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 67, 30);
		Shape2.addBox(0F, 0F, 0F, 14, 14, 5);
		Shape2.setRotationPoint(-7F, 16F, 7F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, -1.570796F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 58);
		Shape3.addBox(0F, 0F, 0F, 2, 12, 4);
		Shape3.setRotationPoint(-6F, 12F, 6F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, -1.570796F, 0F, 0F);
		Shape4 = new LODModelPart(this, 0, 58);
		Shape4.addBox(0F, 0F, 0F, 2, 12, 4);
		Shape4.setRotationPoint(4F, 12F, 6F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, -1.570796F, 0F, 0F);
		Shape5 = new LODModelPart(this, 0, 52);
		Shape5.addBox(0F, 0F, 0F, 8, 2, 4);
		Shape5.setRotationPoint(-4F, 12F, 6F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, -1.570796F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 52);
		Shape6.addBox(0F, 0F, 0F, 8, 2, 4);
		Shape6.setRotationPoint(-4F, 12.1F, -4F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, -1.570796F, 0F, 0F);
		Shape7 = new LODModelPart(this, 12, 58);
		Shape7.addBox(0F, 0F, 0F, 1, 10, 2);
		Shape7.setRotationPoint(4F, 10F, 5F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, -1.570796F, 0F, 0F);
		Shape8 = new LODModelPart(this, 12, 58);
		Shape8.addBox(0F, 0F, 0F, 1, 10, 2);
		Shape8.setRotationPoint(-5F, 10F, 5F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, -1.570796F, 0F, 0F);
		Shape9 = new LODModelPart(this, 32, 54);
		Shape9.addBox(0F, 0F, 0F, 8, 1, 2);
		Shape9.setRotationPoint(-4F, 10F, 5F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, -1.570796F, 0F, 0F);
		Shape10 = new LODModelPart(this, 32, 54);
		Shape10.addBox(0F, 0F, 0F, 8, 1, 2);
		Shape10.setRotationPoint(-4F, 10.1F, -4F);
		Shape10.setTextureSize(128, 128);
		Shape10.mirror = true;
		this.setRotation(Shape10, -1.570796F, 0F, 0F);
		Shape11 = new LODModelPart(this, 64, 49);
		Shape11.addBox(0F, 0F, 0F, 15, 15, 2);
		Shape11.setRotationPoint(-7.5F, 21F, 7.5F);
		Shape11.setTextureSize(128, 128);
		Shape11.mirror = true;
		this.setRotation(Shape11, -1.570796F, 0F, 0F);
		Shape12 = new LODModelPart(this, 32, 57);
		Shape12.addBox(0F, 0F, 0F, 8, 1, 2);
		Shape12.setRotationPoint(-4F, 10F, 4F);
		Shape12.setTextureSize(128, 128);
		Shape12.mirror = true;
		this.setRotation(Shape12, -1.570796F, 0F, 0F);
		Shape13 = new LODModelPart(this, 32, 57);
		Shape13.addBox(0F, 0F, 0F, 8, 1, 2);
		Shape13.setRotationPoint(-4F, 10.1F, -3F);
		Shape13.setTextureSize(128, 128);
		Shape13.mirror = true;
		this.setRotation(Shape13, -1.570796F, 0F, 0F);
		Shape14 = new LODModelPart(this, 20, 24);
		Shape14.addBox(0F, 0F, 0F, 1, 6, 2);
		Shape14.setRotationPoint(-4F, 10F, 3F);
		Shape14.setTextureSize(128, 128);
		Shape14.mirror = true;
		this.setRotation(Shape14, -1.56207F, 0F, -0.0174533F);
		Shape15 = new LODModelPart(this, 20, 24);
		Shape15.addBox(0F, 0F, 0F, 1, 6, 2);
		Shape15.setRotationPoint(3F, 10F, 3F);
		Shape15.setTextureSize(128, 128);
		Shape15.mirror = true;
		this.setRotation(Shape15, -1.56207F, 0F, 0F);
		Shape16 = new LODModelPart(this, -1, 45);
		Shape16.addBox(0F, 0F, 0F, 6, 6, 1);
		Shape16.setRotationPoint(-3F, 11F, 3F);
		Shape16.setTextureSize(128, 128);
		Shape16.mirror = true;
		this.setRotation(Shape16, -1.570796F, 0F, 0F);
		Shape17 = new LODModelPart(this, 0, 84);
		Shape17.addBox(0F, 0F, 0F, 4, 7, 1);
		Shape17.setRotationPoint(-2F, 10F, -6F);
		Shape17.setTextureSize(128, 128);
		Shape17.mirror = true;
		this.setRotation(Shape17, -0.1396263F, 0F, 0F);
		Shape17b = new LODModelPart(this, 0, 84);
		Shape17b.addBox(0F, 0F, 0F, 4, 7, 1);
		Shape17b.setRotationPoint(-2F, 10F, 5F);
		Shape17b.setTextureSize(128, 128);
		Shape17b.mirror = true;
		this.setRotation(Shape17b, 0.1396263F, 0F, 0F);
		Shape18 = new LODModelPart(this, 0, 84);
		Shape18.addBox(0F, 0F, 0F, 1, 7, 4);
		Shape18.setRotationPoint(5F, 10F, -2F);
		Shape18.setTextureSize(128, 128);
		Shape18.mirror = true;
		this.setRotation(Shape18, 0F, 0F, -0.1396263F);
		Shape18b = new LODModelPart(this, 0, 84);
		Shape18b.addBox(0F, 0F, 0F, 1, 7, 4);
		Shape18b.setRotationPoint(-6F, 10F, -2F);
		Shape18b.setTextureSize(128, 128);
		Shape18b.mirror = true;
		this.setRotation(Shape18b, 0F, 0F, 0.1396263F);
		Shape19 = new LODModelPart(this, 0, 96);
		Shape19.addBox(0F, 0F, 0F, 8, 2, 8);
		Shape19.setRotationPoint(-4F, 8F, -4F);
		Shape19.setTextureSize(128, 128);
		Shape19.mirror = true;
		this.setRotation(Shape19, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		boolean beam = (Boolean)li.get(0);
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape4.render(te, f5);
		Shape5.render(te, f5);
		Shape6.render(te, f5);
		Shape7.render(te, f5);
		Shape8.render(te, f5);
		Shape9.render(te, f5);
		Shape10.render(te, f5);
		Shape11.render(te, f5);
		Shape12.render(te, f5);
		Shape13.render(te, f5);
		Shape14.render(te, f5);
		Shape15.render(te, f5);
		Shape16.render(te, f5);
		if (beam) {
			Shape17.render(te, f5);
			Shape17b.render(te, f5);
			Shape18.render(te, f5);
			Shape18b.render(te, f5);
			Shape19.render(te, f5);
		}
	}
}
