/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2015
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 18/08/2013 11:52:31 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.RotaryCraft.ModInterface;

import java.util.ArrayList;

import net.minecraft.tileentity.TileEntity;

import org.lwjgl.opengl.GL11;

import Reika.DragonAPI.Instantiable.Rendering.LODModelPart;
import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelFuelConverter extends RotaryModelBase
{
	//fields
	LODModelPart Shape1;
	LODModelPart Shape1a;
	LODModelPart Shape1b;
	LODModelPart Shape1c;
	LODModelPart Shape1d;
	LODModelPart Shape1e;
	LODModelPart Shape1f;
	LODModelPart Shape1g;
	LODModelPart Shape1h;
	LODModelPart Shape1i;
	LODModelPart Shape2;
	LODModelPart Shape2a;
	LODModelPart Shape3;
	LODModelPart Shape3a;
	LODModelPart Shape3b;
	LODModelPart Shape3c;
	LODModelPart p;
	LODModelPart p1;
	LODModelPart p5;
	LODModelPart p3;
	LODModelPart p2;
	LODModelPart p8;
	LODModelPart p7;
	LODModelPart p6;

	public ModelFuelConverter()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new LODModelPart(this, 0, 36);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 17F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape1a = new LODModelPart(this, 0, 18);
		Shape1a.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1a.setRotationPoint(-8F, 14F, -8F);
		Shape1a.setTextureSize(128, 128);
		Shape1a.mirror = true;
		this.setRotation(Shape1a, 0F, 0F, 0F);
		Shape1b = new LODModelPart(this, 0, 0);
		Shape1b.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1b.setRotationPoint(-8F, 8F, -8F);
		Shape1b.setTextureSize(128, 128);
		Shape1b.mirror = true;
		this.setRotation(Shape1b, 0F, 0F, 0F);
		Shape1c = new LODModelPart(this, 0, 54);
		Shape1c.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1c.setRotationPoint(-8F, 23F, -8F);
		Shape1c.setTextureSize(128, 128);
		Shape1c.mirror = true;
		this.setRotation(Shape1c, 0F, 0F, 0F);
		Shape1d = new LODModelPart(this, 65, 0);
		Shape1d.addBox(-0.5F, 0F, -7F, 1, 2, 14);
		Shape1d.setRotationPoint(0F, 15F, 0F);
		Shape1d.setTextureSize(128, 128);
		Shape1d.mirror = true;
		this.setRotation(Shape1d, 0F, 1.047198F, 0F);
		Shape1e = new LODModelPart(this, 65, 0);
		Shape1e.addBox(-0.5F, 0F, -7F, 1, 2, 14);
		Shape1e.setRotationPoint(0F, 15F, 0F);
		Shape1e.setTextureSize(128, 128);
		Shape1e.mirror = true;
		this.setRotation(Shape1e, 0F, 0.5235988F, 0F);
		Shape1f = new LODModelPart(this, 65, 0);
		Shape1f.addBox(-0.5F, 0F, -7F, 1, 2, 14);
		Shape1f.setRotationPoint(0F, 15F, 0F);
		Shape1f.setTextureSize(128, 128);
		Shape1f.mirror = true;
		this.setRotation(Shape1f, 0F, -0.5235988F, 0F);
		Shape1g = new LODModelPart(this, 65, 0);
		Shape1g.addBox(-0.5F, 0F, -7F, 1, 2, 14);
		Shape1g.setRotationPoint(0F, 15F, 0F);
		Shape1g.setTextureSize(128, 128);
		Shape1g.mirror = true;
		this.setRotation(Shape1g, 0F, 1.570796F, 0F);
		Shape1h = new LODModelPart(this, 65, 0);
		Shape1h.addBox(-0.5F, 0F, -7F, 1, 2, 14);
		Shape1h.setRotationPoint(0F, 15F, 0F);
		Shape1h.setTextureSize(128, 128);
		Shape1h.mirror = true;
		this.setRotation(Shape1h, 0F, -1.047198F, 0F);
		Shape1i = new LODModelPart(this, 65, 0);
		Shape1i.addBox(-0.5F, 0F, -7F, 1, 2, 14);
		Shape1i.setRotationPoint(0F, 15F, 0F);
		Shape1i.setTextureSize(128, 128);
		Shape1i.mirror = true;
		this.setRotation(Shape1i, 0F, 0F, 0F);
		Shape2 = new LODModelPart(this, 96, 0);
		Shape2.addBox(-1F, 0F, -1F, 2, 5, 2);
		Shape2.setRotationPoint(0F, 18F, 0F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0.7853982F, 0F);
		Shape2a = new LODModelPart(this, 96, 0);
		Shape2a.addBox(-1F, 0F, -1F, 2, 5, 2);
		Shape2a.setRotationPoint(0F, 18F, 0F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new LODModelPart(this, 0, 75);
		Shape3.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape3.setRotationPoint(7F, 9F, 7F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new LODModelPart(this, 0, 75);
		Shape3a.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape3a.setRotationPoint(-8F, 9F, 7F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape3b = new LODModelPart(this, 0, 75);
		Shape3b.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape3b.setRotationPoint(7F, 9F, -8F);
		Shape3b.setTextureSize(128, 128);
		Shape3b.mirror = true;
		this.setRotation(Shape3b, 0F, 0F, 0F);
		Shape3c = new LODModelPart(this, 0, 75);
		Shape3c.addBox(0F, 0F, 0F, 1, 14, 1);
		Shape3c.setRotationPoint(-8F, 9F, -8F);
		Shape3c.setTextureSize(128, 128);
		Shape3c.mirror = true;
		this.setRotation(Shape3c, 0F, 0F, 0F);
		p = new LODModelPart(this, 0, 96);
		p.addBox(0F, 0F, 0F, 14, 5, 1);
		p.setRotationPoint(-7F, 18F, 7F);
		p.setTextureSize(128, 128);
		p.mirror = true;
		this.setRotation(p, 0F, 0F, 0F);
		p1 = new LODModelPart(this, 0, 96);
		p1.addBox(0F, 0F, 0F, 14, 5, 1);
		p1.setRotationPoint(-7F, 9F, 7F);
		p1.setTextureSize(128, 128);
		p1.mirror = true;
		this.setRotation(p1, 0F, 0F, 0F);
		p5 = new LODModelPart(this, 6, 75);
		p5.addBox(0F, 0F, 0F, 1, 5, 14);
		p5.setRotationPoint(7F, 18F, -7F);
		p5.setTextureSize(128, 128);
		p5.mirror = true;
		this.setRotation(p5, 0F, 0F, 0F);
		p3 = new LODModelPart(this, 0, 96);
		p3.addBox(0F, 0F, 0F, 14, 5, 1);
		p3.setRotationPoint(-7F, 18F, -8F);
		p3.setTextureSize(128, 128);
		p3.mirror = true;
		this.setRotation(p3, 0F, 0F, 0F);
		p2 = new LODModelPart(this, 0, 96);
		p2.addBox(0F, 0F, 0F, 14, 5, 1);
		p2.setRotationPoint(-7F, 9F, -8F);
		p2.setTextureSize(128, 128);
		p2.mirror = true;
		this.setRotation(p2, 0F, 0F, 0F);
		p8 = new LODModelPart(this, 6, 75);
		p8.addBox(0F, 0F, 0F, 1, 5, 14);
		p8.setRotationPoint(7F, 9F, -7F);
		p8.setTextureSize(128, 128);
		p8.mirror = true;
		this.setRotation(p8, 0F, 0F, 0F);
		p7 = new LODModelPart(this, 6, 75);
		p7.addBox(0F, 0F, 0F, 1, 5, 14);
		p7.setRotationPoint(-8F, 9F, -7F);
		p7.setTextureSize(128, 128);
		p7.mirror = true;
		this.setRotation(p7, 0F, 0F, 0F);
		p6 = new LODModelPart(this, 6, 75);
		p6.addBox(0F, 0F, 0F, 1, 5, 14);
		p6.setRotationPoint(-8F, 18F, -7F);
		p6.setTextureSize(128, 128);
		p6.mirror = true;
		this.setRotation(p6, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(TileEntity te, ArrayList li, float phi, float theta)
	{
		Shape1.render(te, f5);
		Shape1a.render(te, f5);
		Shape1b.render(te, f5);
		Shape1c.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);

		Shape2.render(te, f5);
		Shape2a.render(te, f5);

		Shape1f.render(te, f5);
		Shape1g.render(te, f5);
		Shape1h.render(te, f5);
		Shape1i.render(te, f5);
		Shape1e.render(te, f5);
		Shape1d.render(te, f5);

		GL11.glTranslated(0, 1, 0);
		GL11.glRotatef(-phi, 0, 1, 0);
		GL11.glTranslated(0, -1, 0);

		Shape3.render(te, f5);
		Shape3a.render(te, f5);
		Shape3b.render(te, f5);
		Shape3c.render(te, f5);

		p.render(te, f5);
		p1.render(te, f5);
		p5.render(te, f5);
		p3.render(te, f5);
		p2.render(te, f5);
		p8.render(te, f5);
		p7.render(te, f5);
		p6.render(te, f5);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
