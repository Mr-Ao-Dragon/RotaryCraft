/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 14/11/2013 4:02:15 PM
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

public class ModelBelt extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shaape1;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape2b;
	LODModelPart Shape2c;
	LODModelPart s1;
	LODModelPart s2;
	LODModelPart w;
	LODModelPart w4;
	LODModelPart w1;
	LODModelPart w2;
	LODModelPart w3;
	LODModelPart w5;
	LODModelPart w6;
	LODModelPart w7;
	LODModelPart c;
	LODModelPart w8;
	LODModelPart w9;
	LODModelPart w10;
	LODModelPart w11;
	LODModelPart w12;
	LODModelPart w13;
	LODModelPart w14;
	LODModelPart w15;
	LODModelPart c1;
	LODModelPart c2;
	LODModelPart c3;

	public ModelBelt()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 8);
		Shape1.addBox(0F, 0F, 0F, 16, 14, 5);
		Shape1.setRotationPoint(-8F, 9F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shaape1 = new LODModelPart(this, 0, 8);
		Shaape1.addBox(0F, 0F, 0F, 16, 14, 5);
		Shaape1.setRotationPoint(-8F, 9F, 3F);
		Shaape1.setTextureSize(128, 128);
		Shaape1.mirror = true;
		this.setRotation(Shaape1, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 0, 0);
		Shape2.addBox(0F, 0F, 0F, 14, 1, 5);
		Shape2.setRotationPoint(-7F, 8F, 3F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new LODModelPart(this, 0, 0);
		Shape2a.addBox(0F, 0F, 0F, 14, 1, 5);
		Shape2a.setRotationPoint(-7F, 8F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape2b = new LODModelPart(this, 0, 0);
		Shape2b.addBox(0F, 0F, 0F, 14, 1, 5);
		Shape2b.setRotationPoint(-7F, 23F, -8F);
		Shape2b.setTextureSize(128, 128);
		Shape2b.mirror = true;
		this.setRotation(Shape2b, 0F, 0F, 0F);
		Shape2c = new LODModelPart(this, 0, 0);
		Shape2c.addBox(0F, 0F, 0F, 14, 1, 5);
		Shape2c.setRotationPoint(-7F, 23F, 3F);
		Shape2c.setTextureSize(128, 128);
		Shape2c.mirror = true;
		this.setRotation(Shape2c, 0F, 0F, 0F);
		s1 = new LODModelPart(this, 43, 0);
		s1.addBox(-1F, -1F, 0F, 2, 2, 17);
		s1.setRotationPoint(0F, 16F, -8.5F);
		s1.setTextureSize(128, 128);
		s1.mirror = true;
		this.setRotation(s1, 0F, 0F, 0.7853982F);
		s2 = new LODModelPart(this, 43, 0);
		s2.addBox(-1F, -1F, 0F, 2, 2, 17);
		s2.setRotationPoint(0F, 16F, -8.5F);
		s2.setTextureSize(128, 128);
		s2.mirror = true;
		this.setRotation(s2, 0F, 0F, 0F);
		w = new LODModelPart(this, 0, 28);
		w.addBox(-6F, -6F, 0F, 12, 12, 1);
		w.setRotationPoint(0F, 16F, 2F);
		w.setTextureSize(128, 128);
		w.mirror = true;
		this.setRotation(w, 0F, 0F, 0F);
		w4 = new LODModelPart(this, 0, 28);
		w4.addBox(-6F, -6F, 0F, 12, 12, 1);
		w4.setRotationPoint(0F, 16F, 2F);
		w4.setTextureSize(128, 128);
		w4.mirror = true;
		this.setRotation(w4, 0F, 0F, 0.7853982F);
		w1 = new LODModelPart(this, 0, 28);
		w1.addBox(-6F, -6F, 0F, 12, 12, 1);
		w1.setRotationPoint(0F, 16F, 2F);
		w1.setTextureSize(128, 128);
		w1.mirror = true;
		this.setRotation(w1, 0F, 0F, 1.178097F);
		w2 = new LODModelPart(this, 0, 28);
		w2.addBox(-6F, -6F, 0F, 12, 12, 1);
		w2.setRotationPoint(0F, 16F, 2F);
		w2.setTextureSize(128, 128);
		w2.mirror = true;
		this.setRotation(w2, 0F, 0F, 1.374447F);
		w3 = new LODModelPart(this, 0, 28);
		w3.addBox(-6F, -6F, 0F, 12, 12, 1);
		w3.setRotationPoint(0F, 16F, 2F);
		w3.setTextureSize(128, 128);
		w3.mirror = true;
		this.setRotation(w3, 0F, 0F, 0.3926991F);
		w5 = new LODModelPart(this, 0, 28);
		w5.addBox(-6F, -6F, 0F, 12, 12, 1);
		w5.setRotationPoint(0F, 16F, 2F);
		w5.setTextureSize(128, 128);
		w5.mirror = true;
		this.setRotation(w5, 0F, 0F, 0.1963495F);
		w6 = new LODModelPart(this, 0, 28);
		w6.addBox(-6F, -6F, 0F, 12, 12, 1);
		w6.setRotationPoint(0F, 16F, 2F);
		w6.setTextureSize(128, 128);
		w6.mirror = true;
		this.setRotation(w6, 0F, 0F, 0.5890486F);
		w7 = new LODModelPart(this, 0, 28);
		w7.addBox(-6F, -6F, 0F, 12, 12, 1);
		w7.setRotationPoint(0F, 16F, 2F);
		w7.setTextureSize(128, 128);
		w7.mirror = true;
		this.setRotation(w7, 0F, 0F, 0.9817477F);
		c = new LODModelPart(this, 0, 43);
		c.addBox(-4F, -4F, 0F, 8, 8, 4);
		c.setRotationPoint(0F, 16F, -2F);
		c.setTextureSize(128, 128);
		c.mirror = true;
		this.setRotation(c, 0F, 0F, 0.7853982F);
		w8 = new LODModelPart(this, 0, 28);
		w8.addBox(-6F, -6F, 0F, 12, 12, 1);
		w8.setRotationPoint(0F, 16F, -3F);
		w8.setTextureSize(128, 128);
		w8.mirror = true;
		this.setRotation(w8, 0F, 0F, 1.374447F);
		w9 = new LODModelPart(this, 0, 28);
		w9.addBox(-6F, -6F, 0F, 12, 12, 1);
		w9.setRotationPoint(0F, 16F, -3F);
		w9.setTextureSize(128, 128);
		w9.mirror = true;
		this.setRotation(w9, 0F, 0F, 1.178097F);
		w10 = new LODModelPart(this, 0, 28);
		w10.addBox(-6F, -6F, 0F, 12, 12, 1);
		w10.setRotationPoint(0F, 16F, -3F);
		w10.setTextureSize(128, 128);
		w10.mirror = true;
		this.setRotation(w10, 0F, 0F, 0.9817477F);
		w11 = new LODModelPart(this, 0, 28);
		w11.addBox(-6F, -6F, 0F, 12, 12, 1);
		w11.setRotationPoint(0F, 16F, -3F);
		w11.setTextureSize(128, 128);
		w11.mirror = true;
		this.setRotation(w11, 0F, 0F, 0.7853982F);
		w12 = new LODModelPart(this, 0, 28);
		w12.addBox(-6F, -6F, 0F, 12, 12, 1);
		w12.setRotationPoint(0F, 16F, -3F);
		w12.setTextureSize(128, 128);
		w12.mirror = true;
		this.setRotation(w12, 0F, 0F, 0.5890486F);
		w13 = new LODModelPart(this, 0, 28);
		w13.addBox(-6F, -6F, 0F, 12, 12, 1);
		w13.setRotationPoint(0F, 16F, -3F);
		w13.setTextureSize(128, 128);
		w13.mirror = true;
		this.setRotation(w13, 0F, 0F, 0.3926991F);
		w14 = new LODModelPart(this, 0, 28);
		w14.addBox(-6F, -6F, 0F, 12, 12, 1);
		w14.setRotationPoint(0F, 16F, -3F);
		w14.setTextureSize(128, 128);
		w14.mirror = true;
		this.setRotation(w14, 0F, 0F, 0.1963495F);
		w15 = new LODModelPart(this, 0, 28);
		w15.addBox(-6F, -6F, 0F, 12, 12, 1);
		w15.setRotationPoint(0F, 16F, -3F);
		w15.setTextureSize(128, 128);
		w15.mirror = true;
		this.setRotation(w15, 0F, 0F, 0F);
		c1 = new LODModelPart(this, 0, 43);
		c1.addBox(-4F, -4F, 0F, 8, 8, 4);
		c1.setRotationPoint(0F, 16F, -2F);
		c1.setTextureSize(128, 128);
		c1.mirror = true;
		this.setRotation(c1, 0F, 0F, 0F);
		c2 = new LODModelPart(this, 0, 43);
		c2.addBox(-4F, -4F, 0F, 8, 8, 4);
		c2.setRotationPoint(0F, 16F, -2F);
		c2.setTextureSize(128, 128);
		c2.mirror = true;
		this.setRotation(c2, 0F, 0F, 0.3926991F);
		c3 = new LODModelPart(this, 0, 43);
		c3.addBox(-4F, -4F, 0F, 8, 8, 4);
		c3.setRotationPoint(0F, 16F, -2F);
		c3.setTextureSize(128, 128);
		c3.mirror = true;
		this.setRotation(c3, 0F, 0F, 1.178097F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shaape1.render(te, f5);
		Shape2.render(te, f5);
		Shape2a.render(te, f5);
		Shape2b.render(te, f5);
		Shape2c.render(te, f5);

		double d = 1;
		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);

		s1.render(te, f5);
		s2.render(te, f5);
		w.render(te, f5);
		w4.render(te, f5);
		w1.render(te, f5);
		w2.render(te, f5);
		w3.render(te, f5);
		w5.render(te, f5);
		w6.render(te, f5);
		w7.render(te, f5);
		c.render(te, f5);
		w8.render(te, f5);
		w9.render(te, f5);
		w10.render(te, f5);
		w11.render(te, f5);
		w12.render(te, f5);
		w13.render(te, f5);
		w14.render(te, f5);
		w15.render(te, f5);
		c1.render(te, f5);
		c2.render(te, f5);
		c3.render(te, f5);

		GL11.glTranslated(0, d, 0);
		GL11.glRotatef(-phi, 0, 0, 1);
		GL11.glTranslated(0, -d, 0);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
