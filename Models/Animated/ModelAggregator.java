/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 30/10/2013 6:13:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.Models.Animated;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelAggregator extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape2;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart Shape3d;
	LODModelPart Shape3e;
	LODModelPart Shape3f;
	LODModelPart Shape3g;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape2a;
	LODModelPart Shape4;
	LODModelPart Shape5;
	LODModelPart Shape6;
	LODModelPart Shape6a;
	LODModelPart Shape7;
	LODModelPart Shape7a;
	LODModelPart Shape5a;
	LODModelPart Shape5b;
	LODModelPart Shape5c;
	LODModelPart Shape5d;
	LODModelPart Shape5e;

	public ModelAggregator()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 0);
		Shape1.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1.setRotationPoint(0F, 10F, 0F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 1.570796F, 0F);
		Shape2 = new LODModelPart(this, 44, 0);
		Shape2.addBox(-1F, 0F, -1F, 2, 16, 2);
		Shape2.setRotationPoint(0F, 8.5F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0.7853982F, 0F);
		Shape3 = new LODModelPart(this, 0, 0);
		Shape3.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3.setRotationPoint(0F, 10F, 0F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, -2.356194F, 0F);
		Shape3a = new LODModelPart(this, 0, 0);
		Shape3a.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3a.setRotationPoint(0F, 10F, 0F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 0, 0);
		Shape3b.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3b.setRotationPoint(0F, 10F, 0F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0.7853982F, 0F);
		Shape3c = new LODModelPart(this, 0, 0);
		Shape3c.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3c.setRotationPoint(0F, 10F, 0F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 1.570796F, 0F);
		Shape3d = new LODModelPart(this, 0, 0);
		Shape3d.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3d.setRotationPoint(0F, 10F, 0F);
		Shape3d.setTextureSize(128, 128);
		Shape3d.mirror = true;
		this.setRotation(Shape3d, 0F, 2.356194F, 0F);
		Shape3e = new LODModelPart(this, 0, 0);
		Shape3e.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3e.setRotationPoint(0F, 10F, 0F);
		Shape3e.setTextureSize(128, 128);
		Shape3e.mirror = true;
		this.setRotation(Shape3e, 0F, 3.141593F, 0F);
		Shape3f = new LODModelPart(this, 0, 0);
		Shape3f.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3f.setRotationPoint(0F, 10F, 0F);
		Shape3f.setTextureSize(128, 128);
		Shape3f.mirror = true;
		this.setRotation(Shape3f, 0F, -0.7853982F, 0F);
		Shape3g = new LODModelPart(this, 0, 0);
		Shape3g.addBox(1F, 0F, -0.5F, 3, 12, 1);
		Shape3g.setRotationPoint(0F, 10F, 0F);
		Shape3g.setTextureSize(128, 128);
		Shape3g.mirror = true;
		this.setRotation(Shape3g, 0F, -1.570796F, 0F);
		Shape1a = new LODModelPart(this, 0, 0);
		Shape1a.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1a.setRotationPoint(0F, 10F, 0F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0.7853982F, 0F);
		Shape1b = new LODModelPart(this, 0, 0);
		Shape1b.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1b.setRotationPoint(0F, 10F, 0F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 0, 0);
		Shape1c.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1c.setRotationPoint(0F, 10F, 0F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, -0.7853982F, 0F);
		Shape1d = new LODModelPart(this, 0, 0);
		Shape1d.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1d.setRotationPoint(0F, 10F, 0F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, -1.570796F, 0F);
		Shape1e = new LODModelPart(this, 0, 0);
		Shape1e.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1e.setRotationPoint(0F, 10F, 0F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, -2.356194F, 0F);
		Shape1f = new LODModelPart(this, 0, 0);
		Shape1f.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1f.setRotationPoint(0F, 10F, 0F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, 3.141593F, 0F);
		Shape1g = new LODModelPart(this, 0, 0);
		Shape1g.addBox(2.5F, 0F, -3.2F, 3, 12, 1);
		Shape1g.setRotationPoint(0F, 10F, 0F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 2.356194F, 0F);
		Shape2a = new LODModelPart(this, 44, 0);
		Shape2a.addBox(-1F, 0F, -1F, 2, 16, 2);
		Shape2a.setRotationPoint(0F, 8.5F, 0F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape4 = new LODModelPart(this, 59, 19);
		Shape4.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape4.setRotationPoint(-8F, 23F, -8F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new LODModelPart(this, 59, 0);
		Shape5.addBox(-1F, 0F, -8F, 2, 1, 16);
		Shape5.setRotationPoint(6F, 8F, 0F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new LODModelPart(this, 0, 47);
		Shape6.addBox(0F, 0F, 0F, 16, 14, 1);
		Shape6.setRotationPoint(-8F, 9F, 7F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new LODModelPart(this, 0, 30);
		Shape6a.addBox(0F, 0F, 0F, 16, 14, 1);
		Shape6a.setRotationPoint(-8F, 9F, -8F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape7 = new LODModelPart(this, 0, 64);
		Shape7.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape7.setRotationPoint(7F, 9F, -7F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new LODModelPart(this, 10, 0);
		Shape7a.addBox(0F, 0F, 0F, 1, 14, 14);
		Shape7a.setRotationPoint(-8F, 9F, -7F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape5a = new LODModelPart(this, 59, 91);
		Shape5a.addBox(-1F, 0F, -8F, 2, 1, 16);
		Shape5a.setRotationPoint(-6F, 8F, 0F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new LODModelPart(this, 59, 37);
		Shape5b.addBox(-1F, 0F, -8F, 2, 1, 16);
		Shape5b.setRotationPoint(3F, 8F, 0F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0F);
		Shape5c = new LODModelPart(this, 59, 109);
		Shape5c.addBox(-7.5F, 0F, -1F, 15, 1, 2);
		Shape5c.setRotationPoint(0F, 8.4F, 0F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 0F);
		Shape5d = new LODModelPart(this, 59, 73);
		Shape5d.addBox(-1F, 0F, -8F, 2, 1, 16);
		Shape5d.setRotationPoint(-3F, 8F, 0F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape5e = new LODModelPart(this, 59, 55);
		Shape5e.addBox(-1F, 0F, -8F, 2, 1, 16);
		Shape5e.setRotationPoint(0F, 8F, 0F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		GL11.glRotatef(phi, 0, 1, 0);
		Shape1.render(te, f5);
		Shape2.render(te, f5);
		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);
		Shape3d.render(te, f5);
		Shape3e.render(te, f5);
		Shape3f.render(te, f5);
		Shape3g.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);
		Shape1d.render(te, f5);
		Shape1e.render(te, f5);
		Shape1f.render(te, f5);
		Shape1g.render(te, f5);
		Shape2a.render(te, f5);
		GL11.glRotatef(-phi, 0, 1, 0);

		Shape4.render(te, f5);
		Shape5.render(te, f5);
		Shape6.render(te, f5);
		Shape6a.render(te, f5);
		Shape7.render(te, f5);
		Shape7a.render(te, f5);
		Shape5a.render(te, f5);
		Shape5b.render(te, f5);
		Shape5c.render(te, f5);
		Shape5d.render(te, f5);
		Shape5e.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
