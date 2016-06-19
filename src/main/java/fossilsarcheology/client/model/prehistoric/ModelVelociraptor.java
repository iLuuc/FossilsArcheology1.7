package fossilsarcheology.client.model.prehistoric;

import fossilsarcheology.client.model.prehistoric.test.ModelNewPrehistoric;
import fossilsarcheology.server.entity.mob.EntityDeinonychus;
import fossilsarcheology.server.entity.mob.EntityVelociraptor;
import fossilsarcheology.server.entity.mob.test.EntityNewPrehistoric;
import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelVelociraptor extends ModelNewPrehistoric {
    public AdvancedModelRenderer lowerBody;
    public AdvancedModelRenderer leftThigh;
    public AdvancedModelRenderer rightThigh;
    public AdvancedModelRenderer upperBody;
    public AdvancedModelRenderer tail1;
    public AdvancedModelRenderer neck;
    public AdvancedModelRenderer leftUpperArm;
    public AdvancedModelRenderer rightUpperArm;
    public AdvancedModelRenderer headPivot;
    public AdvancedModelRenderer head;
    public AdvancedModelRenderer upperJaw;
    public AdvancedModelRenderer lowerJaw;
    public AdvancedModelRenderer upperCrest;
    public AdvancedModelRenderer lowerCrest;
    public AdvancedModelRenderer leftUpperArmFeather;
    public AdvancedModelRenderer leftLowerArm;
    public AdvancedModelRenderer leftLowerArmFeather;
    public AdvancedModelRenderer rightUpperArmFeather;
    public AdvancedModelRenderer rightLowerArm;
    public AdvancedModelRenderer rightLowerArmFeather;
    public AdvancedModelRenderer tail2;
    public AdvancedModelRenderer tailFeather4;
    public AdvancedModelRenderer tail3;
    public AdvancedModelRenderer rightToeClaw2;
    public AdvancedModelRenderer tailFeather3;
    public AdvancedModelRenderer tailFeather1;
    public AdvancedModelRenderer tailFeather2;
    public AdvancedModelRenderer leftLeg;
    public AdvancedModelRenderer leftFoot;
    public AdvancedModelRenderer leftToeClaw1;
    public AdvancedModelRenderer leftToeClaw2;
    public AdvancedModelRenderer rightLeg;
    public AdvancedModelRenderer rightFoot;
    public AdvancedModelRenderer rightToeClaw1;
    public ModelAnimator animator;

    public ModelVelociraptor() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.leftUpperArm = new AdvancedModelRenderer(this, 20, 13);
        this.leftUpperArm.mirror = true;
        this.leftUpperArm.setRotationPoint(3.0F, 1.9F, -4.0F);
        this.leftUpperArm.addBox(0.0F, -1.0F, -1.0F, 2, 4, 3, 0.0F);
        ModelUtils.setRotateAngle(leftUpperArm, -0.06981317007977318F, -0.0F, 0.0F);
        this.tailFeather2 = new AdvancedModelRenderer(this, 44, 49);
        this.tailFeather2.setRotationPoint(0.0F, -0.2F, -1.3F);
        this.tailFeather2.addBox(-3.0F, 0.5F, 1.1F, 6, 1, 8, 0.0F);
        ModelUtils.setRotateAngle(tailFeather2, -0.004886921905584123F, -0.0F, 0.0F);
        this.tailFeather4 = new AdvancedModelRenderer(this, 46, 41);
        this.tailFeather4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailFeather4.addBox(-3.5F, 1.1F, 0.0F, 7, 1, 6, 0.0F);
        this.rightUpperArmFeather = new AdvancedModelRenderer(this, 34, 34);
        this.rightUpperArmFeather.setRotationPoint(-1.0F, 0.1F, 0.9F);
        this.rightUpperArmFeather.addBox(-0.6F, -0.1F, -4.7F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(rightUpperArmFeather, 1.4493214108560915F, -0.0F, 0.0F);
        this.tail2 = new AdvancedModelRenderer(this, 90, 13);
        this.tail2.setRotationPoint(0.0F, 0.2F, 6.7F);
        this.tail2.addBox(-1.5F, 0.0F, 0.0F, 3, 3, 5, 0.0F);
        this.lowerCrest = new AdvancedModelRenderer(this, 38, 15);
        this.lowerCrest.setRotationPoint(-0.5F, -0.7F, -1.03F);
        this.lowerCrest.addBox(-0.5F, -1.5F, 0.6F, 1, 4, 5, 0.0F);
        ModelUtils.setRotateAngle(lowerCrest, 0.13578661580515886F, 0.0F, 0.0F);
        this.rightToeClaw2 = new AdvancedModelRenderer(this, 0, 40);
        this.rightToeClaw2.setRotationPoint(0.0F, 0.2F, -2.5F);
        this.rightToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        ModelUtils.setRotateAngle(rightToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.lowerJaw = new AdvancedModelRenderer(this, 49, 0);
        this.lowerJaw.setRotationPoint(0.0F, 0.0F, -4.53F);
        this.lowerJaw.addBox(-2.0F, -0.5F, -6.9F, 3, 1, 7, 0.0F);
        ModelUtils.setRotateAngle(lowerJaw, -0.06924167156799095F, 0.0F, 0.0F);
        this.lowerBody = new AdvancedModelRenderer(this, 65, 12);
        this.lowerBody.setRotationPoint(0.0F, 9.9F, -2.5F);
        this.lowerBody.addBox(-4.0F, -1.0F, 0.0F, 8, 7, 9, 0.0F);
        ModelUtils.setRotateAngle(lowerBody, -0.15554018104602801F, 0.0F, 0.0F);
        this.rightToeClaw1 = new AdvancedModelRenderer(this, 0, 40);
        this.rightToeClaw1.setRotationPoint(0.9F, 0.2F, -1.2F);
        this.rightToeClaw1.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        ModelUtils.setRotateAngle(rightToeClaw1, -0.8726646259971648F, -0.0F, 0.0F);
        this.upperCrest = new AdvancedModelRenderer(this, 38, 15);
        this.upperCrest.mirror = true;
        this.upperCrest.setRotationPoint(-0.51F, -2.5F, -2.03F);
        this.upperCrest.addBox(-0.5F, -1.5F, 0.6F, 1, 4, 5, 0.0F);
        ModelUtils.setRotateAngle(upperCrest, 0.4961971063419879F, -0.0F, 0.0F);
        this.rightLowerArmFeather = new AdvancedModelRenderer(this, 34, 34);
        this.rightLowerArmFeather.setRotationPoint(0.0F, -0.2F, 1.6F);
        this.rightLowerArmFeather.addBox(-0.5F, 1.7F, -8.1F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(rightLowerArmFeather, 6.981317007977319E-4F, -0.0F, 0.0F);
        this.headPivot = new AdvancedModelRenderer(this, 0, 0);
        this.headPivot.setRotationPoint(0.5F, 0.8F, -6.03F);
        this.headPivot.addBox(0F, 0, 0, 0, 0, 0, 0.0F);
        ModelUtils.setRotateAngle(headPivot, 0.9955358053375656F, 0.0F, 0.0F);
        this.head = new AdvancedModelRenderer(this, 0, 0);
        this.head.setRotationPoint(0, 0, 0);
        this.head.addBox(-3.0F, -4.0F, -5.0F, 5, 5, 6, 0.0F);
        ModelUtils.setRotateAngle(head, 0F, 0.0F, 0.0F);
        this.leftFoot = new AdvancedModelRenderer(this, 0, 34);
        this.leftFoot.setRotationPoint(0.2F, 0.9F, -6.3F);
        this.leftFoot.addBox(-1.5F, 0.0F, -3.1F, 3, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(leftFoot, -0.9948376736367678F, -0.0F, 0.0F);
        this.leftToeClaw1 = new AdvancedModelRenderer(this, 0, 40);
        this.leftToeClaw1.setRotationPoint(-0.9F, 0.2F, -1.2F);
        this.leftToeClaw1.addBox(-0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
        ModelUtils.setRotateAngle(leftToeClaw1, -0.8726646259971648F, -0.0F, 0.0F);
        this.rightUpperArm = new AdvancedModelRenderer(this, 20, 13);
        this.rightUpperArm.setRotationPoint(-3.0F, 1.9F, -4.0F);
        this.rightUpperArm.addBox(-2.0F, -1.0F, -1.0F, 2, 4, 3, 0.0F);
        ModelUtils.setRotateAngle(rightUpperArm, -0.06981317007977318F, -0.0F, 0.0F);
        this.leftLowerArmFeather = new AdvancedModelRenderer(this, 34, 34);
        this.leftLowerArmFeather.mirror = true;
        this.leftLowerArmFeather.setRotationPoint(0.0F, -0.2F, 1.6F);
        this.leftLowerArmFeather.addBox(-0.5F, 1.7F, -8.1F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(leftLowerArmFeather, 6.981317007977319E-4F, -0.0F, 0.0F);
        this.tail3 = new AdvancedModelRenderer(this, 49, 16);
        this.tail3.setRotationPoint(0.0F, 0.6F, 4.3F);
        this.tail3.addBox(-1.0F, 0.0F, 0.0F, 2, 2, 12, 0.0F);
        ModelUtils.setRotateAngle(tail3, -0.05253441048502932F, -0.0F, 0.0F);
        this.rightThigh = new AdvancedModelRenderer(this, 14, 35);
        this.rightThigh.setRotationPoint(-3.0F, 14.0F, 3.0F);
        this.rightThigh.addBox(-3.0F, -2.5F, -2.0F, 3, 7, 5, 0.0F);
        this.leftUpperArmFeather = new AdvancedModelRenderer(this, 34, 34);
        this.leftUpperArmFeather.mirror = true;
        this.leftUpperArmFeather.setRotationPoint(1.0F, 0.1F, 0.9F);
        this.leftUpperArmFeather.addBox(-0.4F, -0.1F, -4.7F, 1, 4, 6, 0.0F);
        ModelUtils.setRotateAngle(leftUpperArmFeather, 1.4493214108560915F, -0.0F, 0.0F);
        this.tailFeather1 = new AdvancedModelRenderer(this, 69, 40);
        this.tailFeather1.setRotationPoint(0.0F, -0.2F, -2.5F);
        this.tailFeather1.addBox(-2.5F, 0.5F, 10.1F, 5, 1, 12, 0.0F);
        ModelUtils.setRotateAngle(tailFeather1, -0.004886921905584123F, -0.0F, 0.0F);
        this.leftToeClaw2 = new AdvancedModelRenderer(this, 0, 40);
        this.leftToeClaw2.setRotationPoint(0.0F, 0.2F, -2.5F);
        this.leftToeClaw2.addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
        ModelUtils.setRotateAngle(leftToeClaw2, -1.7627825445142729F, -0.0F, 0.0F);
        this.tail1 = new AdvancedModelRenderer(this, 91, 0);
        this.tail1.setRotationPoint(0.0F, -1.0F, 8.5F);
        this.tail1.addBox(-2.0F, 0.0F, 0.0F, 4, 4, 7, 0.0F);
        ModelUtils.setRotateAngle(tail1, 0.11903145498601327F, -0.0F, 0.0F);
        this.rightFoot = new AdvancedModelRenderer(this, 0, 34);
        this.rightFoot.setRotationPoint(-0.2F, 0.9F, -6.3F);
        this.rightFoot.addBox(-1.5F, 0.0F, -3.0F, 3, 2, 4, 0.0F);
        ModelUtils.setRotateAngle(rightFoot, -0.9948376736367678F, -0.0F, 0.0F);
        this.rightLowerArm = new AdvancedModelRenderer(this, 20, 21);
        this.rightLowerArm.mirror = true;
        this.rightLowerArm.setRotationPoint(-1.01F, 1.2F, 0.5F);
        this.rightLowerArm.addBox(-1.0F, 0.0F, -6.2F, 2, 2, 5, 0.0F);
        ModelUtils.setRotateAngle(rightLowerArm, 0.8726646259971648F, 0.0F, 0.0F);
        this.leftLeg = new AdvancedModelRenderer(this, 2, 25);
        this.leftLeg.mirror = true;
        this.leftLeg.setRotationPoint(1.2F, 2.2F, 2.2F);
        this.leftLeg.addBox(-1.0F, 0.4F, -6.7F, 2, 2, 7, 0.0F);
        ModelUtils.setRotateAngle(leftLeg, 0.9948376736367678F, -0.0F, 0.0F);
        this.upperBody = new AdvancedModelRenderer(this, 67, 0);
        this.upperBody.setRotationPoint(0.0F, 1.1F, -0.5F);
        this.upperBody.addBox(-3.0F, -2.0F, -5.0F, 6, 6, 6, 0.0F);
        ModelUtils.setRotateAngle(upperBody, 0.19338248112097173F, -0.0F, 0.0F);
        this.leftLowerArm = new AdvancedModelRenderer(this, 20, 21);
        this.leftLowerArm.setRotationPoint(1.01F, 1.2F, 0.5F);
        this.leftLowerArm.addBox(-1.0F, 0.0F, -6.2F, 2, 2, 5, 0.0F);
        ModelUtils.setRotateAngle(leftLowerArm, 0.8726646259971648F, -0.0F, 0.0F);
        this.tailFeather3 = new AdvancedModelRenderer(this, 47, 42);
        this.tailFeather3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.tailFeather3.addBox(-3.5F, 1.0F, -0.9F, 7, 1, 5, 0.0F);
        ModelUtils.setRotateAngle(tailFeather3, -0.004886921905584123F, -0.0F, 0.0F);
        this.leftThigh = new AdvancedModelRenderer(this, 14, 35);
        this.leftThigh.mirror = true;
        this.leftThigh.setRotationPoint(3.0F, 14.0F, 3.0F);
        this.leftThigh.addBox(0.0F, -2.5F, -2.0F, 3, 7, 5, 0.0F);
        this.neck = new AdvancedModelRenderer(this, 0, 13);
        this.neck.setRotationPoint(0.0F, 0.8F, -3.5F);
        this.neck.addBox(-2.0F, -2.0F, -8.0F, 4, 4, 8, 0.0F);
        ModelUtils.setRotateAngle(neck, -0.84334309456366F, -0.0F, 0.0F);
        this.rightLeg = new AdvancedModelRenderer(this, 2, 25);
        this.rightLeg.setRotationPoint(-1.2F, 2.2F, 2.2F);
        this.rightLeg.addBox(-1.0F, 0.4F, -6.7F, 2, 2, 7, 0.0F);
        ModelUtils.setRotateAngle(rightLeg, 0.9948376736367678F, -0.0F, 0.0F);
        this.upperJaw = new AdvancedModelRenderer(this, 28, 0);
        this.upperJaw.setRotationPoint(0.0F, -1.0F, -4.93F);
        this.upperJaw.addBox(-2.0F, -2.4F, -6.7F, 3, 3, 7, 0.0F);
        ModelUtils.setRotateAngle(upperJaw, -0.0017453292519943296F, -0.0F, 0.0F);
        this.upperBody.addChild(this.leftUpperArm);
        this.tail3.addChild(this.tailFeather2);
        this.tail1.addChild(this.tailFeather4);
        this.rightUpperArm.addChild(this.rightUpperArmFeather);
        this.tail1.addChild(this.tail2);
        this.head.addChild(this.lowerCrest);
        this.rightToeClaw1.addChild(this.rightToeClaw2);
        this.head.addChild(this.lowerJaw);
        this.rightFoot.addChild(this.rightToeClaw1);
        this.head.addChild(this.upperCrest);
        this.rightLowerArm.addChild(this.rightLowerArmFeather);
        this.neck.addChild(this.headPivot);
        this.headPivot.addChild(this.head);
        this.leftLeg.addChild(this.leftFoot);
        this.leftFoot.addChild(this.leftToeClaw1);
        this.upperBody.addChild(this.rightUpperArm);
        this.leftLowerArm.addChild(this.leftLowerArmFeather);
        this.tail2.addChild(this.tail3);
        this.leftUpperArm.addChild(this.leftUpperArmFeather);
        this.tail3.addChild(this.tailFeather1);
        this.leftToeClaw1.addChild(this.leftToeClaw2);
        this.lowerBody.addChild(this.tail1);
        this.rightLeg.addChild(this.rightFoot);
        this.rightUpperArm.addChild(this.rightLowerArm);
        this.leftThigh.addChild(this.leftLeg);
        this.lowerBody.addChild(this.upperBody);
        this.leftUpperArm.addChild(this.leftLowerArm);
        this.tail2.addChild(this.tailFeather3);
        this.upperBody.addChild(this.neck);
        this.rightThigh.addChild(this.rightLeg);
        this.head.addChild(this.upperJaw);
        this.updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.leftThigh.render(f5);
        this.lowerBody.render(f5);
        this.rightThigh.render(f5);
    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);
        blockMovement(f, f1, f2, f3, f4, f5, (Entity) entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);
        animator.setAnimation(EntityNewPrehistoric.SPEAK_ANIMATION);
        animator.startKeyframe(10);
        ModelUtils.rotate(animator, neck, 15, 0, 0);
        ModelUtils.rotate(animator, head, -20, 0, 0);
        ModelUtils.rotate(animator, lowerJaw, 24, 0, 0);;
        animator.endKeyframe();
        animator.resetKeyframe(10);
        animator.setAnimation(EntityDeinonychus.ATTACK_ANIMATION);
        animator.startKeyframe(10);
        animator.move(leftThigh, 0, 3.2F, -0.5F);
        animator.move(rightThigh, 0, 3.2F, -0.5F);
        animator.move(lowerBody, 0, 5.2F, -0.5F);
        ModelUtils.rotate(animator, lowerBody, 15, 0, 0);
        ModelUtils.rotate(animator, rightLeg, -30, 0, 0);
        ModelUtils.rotate(animator, leftLeg, -30, 0, 0);
        ModelUtils.rotate(animator, rightFoot, 30, 0, 0);
        ModelUtils.rotate(animator, leftFoot, 30, 0, 0);
        ModelUtils.rotate(animator, leftUpperArm, 0, 0, -50);
        ModelUtils.rotate(animator, rightUpperArm, 0, 0, 50);
        ModelUtils.rotate(animator, head, -20, 0, 0);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.startKeyframe(5);
        animator.move(leftThigh, 0, -6F, 0F);
        animator.move(rightThigh, 0, -6F, 0F);
        animator.move(lowerBody, 0, -10F, 0F);
        ModelUtils.rotate(animator, lowerBody, -25, 0, 0);
        ModelUtils.rotate(animator, rightThigh, -35, 0, 0);
        ModelUtils.rotate(animator, leftThigh, -35, 0, 0);
        ModelUtils.rotate(animator, rightLeg, -30, 0, 0);
        ModelUtils.rotate(animator, leftLeg, -30, 0, 0);
        ModelUtils.rotate(animator, rightFoot, -55, 0, 0);
        ModelUtils.rotate(animator, leftFoot, -55, 0, 0);
        ModelUtils.rotate(animator, leftUpperArm, 0, 0, -50);
        ModelUtils.rotate(animator, rightUpperArm, 0, 0, 50);
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(5);
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        AdvancedModelRenderer[] tailParts = {this.tail1, this.tail2, this.tail3};
        AdvancedModelRenderer[] neckParts = {this.neck, this.head};
        AdvancedModelRenderer[] leftArmParts = {this.leftUpperArm, this.leftLowerArm};
        AdvancedModelRenderer[] rightArmParts = {this.rightUpperArm, this.rightLowerArm};
		if(((EntityNewPrehistoric) entity).isSkeleton()){
			return;
		}
        ModelUtils.faceTargetMod(neck, f3, f4, 0.5F);
        ModelUtils.faceTargetMod(head, f3, f4, 0.5F);

        float speed = 0.1F;
        float speed2 = 0.7F;
        float degree = 0.5F;
        {
            float sitProgress = ((EntityNewPrehistoric) (entity)).sitProgress;
            sitAnimationRotation(rightThigh, sitProgress, -((float) Math.toRadians(75.0D)), 0, 0);
            sitAnimationRotation(leftLowerArm, sitProgress, 0, 0, 0);
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(5.22D)), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(75.0D), 0, 0);
            sitAnimationRotation(head, sitProgress, (float) Math.toRadians(40D), 0, 0);
            sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(75.0D), 0, 0);
            sitAnimationRotation(leftLeg, sitProgress, 0, 0, 0);
            sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(5.22D)), 0, 0);
            sitAnimationRotation(rightUpperArm, sitProgress, -((float) Math.toRadians(4.0D)), 0, (float) Math.toRadians(60.0D));
            sitAnimationRotation(leftThigh, sitProgress, -((float) Math.toRadians(75.0D)), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, 0, 0, 0);
            sitAnimationRotation(leftUpperArm, sitProgress, -((float) Math.toRadians(4.0D)), 0, -((float) Math.toRadians(60.0D)));
            sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(2.61D), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(11.08D), 0, 0);
            sitAnimationRotation(lowerJaw, sitProgress, -((float) Math.toRadians(3.9672555472768707D)), 0, 0);
            sitAnimationRotation(upperJaw, sitProgress, -((float) Math.toRadians(0.1D)), 0, 0);
            sitAnimationRotation(rightLowerArm, sitProgress, 0, 0, 0);
            sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(40D)), 0, 0);
            sitAnimationPos(lowerBody, sitProgress, 0F, 16.40F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
            sitAnimationPos(rightThigh, sitProgress, 0F, 19.40F - ModelUtils.getDefaultPositionY(rightThigh), 0F);
            sitAnimationPos(leftThigh, sitProgress, 0F, 19.40F - ModelUtils.getDefaultPositionY(leftThigh), 0F);
        }
        {
            float sitProgress = ((EntityNewPrehistoric) (entity)).sleepProgress;
            sitAnimationRotation(rightThigh, sitProgress, -((float) Math.toRadians(75.0D)), 0, 0);
            sitAnimationRotation(leftLowerArm, sitProgress, 0, 0, 0);
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(5.22D)), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, (float) Math.toRadians(75.0D), 0, 0);
            sitAnimationRotation(leftFoot, sitProgress, (float) Math.toRadians(75.0D), 0, 0);
            sitAnimationRotation(leftLeg, sitProgress, 0, 0, 0);
            sitAnimationRotation(tail1, sitProgress, -((float) Math.toRadians(5.22D)), 0, 0);
            sitAnimationRotation(rightUpperArm, sitProgress, -((float) Math.toRadians(4.0D)), 0, (float) Math.toRadians(60.0D));
            sitAnimationRotation(leftThigh, sitProgress, -((float) Math.toRadians(75.0D)), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, 0, 0, 0);
            sitAnimationRotation(leftUpperArm, sitProgress, -((float) Math.toRadians(4.0D)), 0, -((float) Math.toRadians(60.0D)));
            sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(2.61D), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(11.08D), 0, 0);
            sitAnimationRotation(lowerJaw, sitProgress, -((float) Math.toRadians(3.9672555472768707D)), 0, 0);
            sitAnimationRotation(upperJaw, sitProgress, -((float) Math.toRadians(0.1D)), 0, 0);
            sitAnimationRotation(rightLowerArm, sitProgress, 0, 0, 0);
            sitAnimationPos(lowerBody, sitProgress, 0F, 16.40F - ModelUtils.getDefaultPositionY(lowerBody), 0F);
            sitAnimationPos(rightThigh, sitProgress, 0F, 19.40F - ModelUtils.getDefaultPositionY(rightThigh), 0F);
            sitAnimationPos(leftThigh, sitProgress, 0F, 19.40F - ModelUtils.getDefaultPositionY(leftThigh), 0F);
            sitAnimationRotation(head, sitProgress, (float) Math.toRadians(100.22D), 0, 0);
            sitAnimationRotation(neck, sitProgress, -((float) Math.toRadians(50.65D)), (float) Math.toRadians(18.26D), 0);

        }
        {
            float sitProgress = ((EntityNewPrehistoric) (entity)).climbProgress;

            sitAnimationRotation(leftLowerArm, sitProgress, (float) Math.toRadians(40.35D), 0, 0);
            sitAnimationRotation(leftLeg, sitProgress, -(float) Math.toRadians(40.0D), 0, 0);
            sitAnimationRotation(rightFoot, sitProgress, ((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotation(upperBody, sitProgress, (float) Math.toRadians(13.13D), 0, 0);
            sitAnimationRotation(leftFoot, sitProgress, ((float) Math.toRadians(30.0D)), 0, 0);
            sitAnimationRotation(rightThigh, sitProgress, -((float) Math.toRadians(90.0D)), 0, 0);
            sitAnimationRotation(rightLowerArm, sitProgress, (float) Math.toRadians(40.35D), 0, 0);
            sitAnimationRotation(rightToeClaw1, sitProgress, ((float) Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotation(tail3, sitProgress, (float) Math.toRadians(5.22D), 0, 0);
            sitAnimationRotation(leftUpperArm, sitProgress, (float) Math.toRadians(0.39D), (float) Math.toRadians(13.0D), -((float) Math.toRadians(50.0D)));
            sitAnimationRotation(neck, sitProgress, ((float) Math.toRadians(28.7D)), 0, 0);
            sitAnimationRotation(rightUpperArm, sitProgress, (float) Math.toRadians(7.83D), -((float) Math.toRadians(13.0D)), (float) Math.toRadians(50.0D));
            sitAnimationRotation(tail2, sitProgress, -((float) Math.toRadians(2.61D)), 0, 0);
            sitAnimationRotation(leftToeClaw1, sitProgress, ((float) Math.toRadians(50.0D)), 0, 0);
            sitAnimationRotation(rightLeg, sitProgress, -(float) Math.toRadians(40.0D), 0, 0);
            sitAnimationRotation(head, sitProgress, -(float) Math.toRadians(33.91D), 0, 0);
            sitAnimationRotation(leftThigh, sitProgress, -((float) Math.toRadians(90.0D)), 0, 0);
            sitAnimationRotation(lowerBody, sitProgress, -((float) Math.toRadians(90.0D)), 0, 0);
            sitAnimationRotation(tail1, sitProgress, (float) Math.toRadians(5.22D), 0, 0);
            sitAnimationPos(lowerBody, sitProgress, 0F, 15F - ModelUtils.getDefaultPositionY(lowerBody), -0.4F);
            sitAnimationPos(rightThigh, sitProgress, 0F, 23F - ModelUtils.getDefaultPositionY(rightThigh), -6.7F);
            sitAnimationPos(leftThigh, sitProgress, 0F, 23F - ModelUtils.getDefaultPositionY(leftThigh), -6.7F);
            if (sitProgress >= 10) {
                speed2 = 0.4F;
                this.walk(leftThigh, speed2, -0.8F, false, 0F, -0.4F, entity.ticksExisted, 1);
                this.walk(leftLeg, speed2, 0.2F, true, 0F, -0.6F, entity.ticksExisted, 1);
                this.walk(leftFoot, speed2, -0.4F, true, -0.5F, -0.2F, entity.ticksExisted, 1);
                this.walk(rightThigh, speed2, -0.8F, false, 0F, -0.4F, entity.ticksExisted, 1);
                this.walk(rightLeg, speed2, 0.2F, true, 0F, -0.6F, entity.ticksExisted, 1);
                this.walk(rightFoot, speed2, -0.4F, true, -0.5F, -0.2F, entity.ticksExisted, 1);
                this.walk(rightUpperArm, speed2, 0.6F, true, -0.5F, 0F, entity.ticksExisted, 1);
                this.walk(leftUpperArm, speed2, 0.6F, true, -0.5F, 0F, entity.ticksExisted, 1);
                this.chainWave(neckParts, speed, -0.3F, 5, entity.ticksExisted, 1);
            }
        }
        this.bob(lowerBody, speed, degree * 0.7F, false, entity.ticksExisted, 1);
        this.walk(upperBody, speed, degree * 0.1F, false, 0, 0, entity.ticksExisted, 1);
        this.chainWave(tailParts, speed, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(leftArmParts, speed, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainWave(rightArmParts, speed, degree * 0.05F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed, degree * 0.15F, -3, entity.ticksExisted, 1);
        this.chainSwing(tailParts, speed2, degree * 0.25F, -3, f, f1);
        this.chainWave(neckParts, speed, degree * 0.15F, 3, entity.ticksExisted, 1);
		this.walk(leftThigh, speed2, 0.6F, false, 0F, 0.4F, f, f1);
		this.walk(leftLeg, speed2, 0.2F, false, 0F, -0.6F, f, f1);
		this.walk(leftFoot, speed2, -0.6F, true, 2.5F, -0.4F, f, f1);
		this.walk(rightThigh, speed2, 0.6F, true, 0F, -0.4F, f, f1);
		this.walk(rightLeg, speed2, 0.2F, true, 0F, 0.6F, f, f1);
		this.walk(rightFoot, speed2, -0.6F, false, 2.5F, 0.4F, f, f1);
        this.chainWave(neckParts, speed2, degree * 0.5F, 4, f, f1);
        this.chainWave(tailParts, speed2, degree * 0.3F, -4, f, f1);

        if (((EntityVelociraptor) entity).getAnimation() != EntityVelociraptor.ATTACK_ANIMATION && ((EntityVelociraptor) entity).ridingEntity != null) {
            ModelUtils.setRotateAngleAlt(lowerBody, -15, 0, 0);
            ModelUtils.setRotateAngleAlt(leftLeg, 20, 0, 0);
            ModelUtils.setRotateAngleAlt(leftFoot, -20, 0, 0);
            ModelUtils.setRotateAngleAlt(rightLeg, 20, 0, 0);
            ModelUtils.setRotateAngleAlt(rightFoot, -20, 0, 0);
            ModelUtils.setRotateAngleAlt(leftUpperArm, 0, 0, -40);
            ModelUtils.setRotateAngleAlt(rightUpperArm, 0, 0, 40);
            ModelUtils.setRotateAngleAlt(head, 40, 0, 0);
            EntityVelociraptor dino = (EntityVelociraptor) entity;
            float speed3 = 0.5F;
            this.walk(lowerJaw, speed3, -0.3F, true, 0.5F, -0.3F, entity.ticksExisted, 1);
            this.walk(neck, speed3, 0.4F, false, 0F, 0.4F, entity.ticksExisted, 1);
            this.walk(head, speed3, 0.4F, true, 0F, 0.2F, entity.ticksExisted, 1);
            this.flap(leftUpperArm, 0.8F, -0.4F, true, 0.3F, -0.2F, entity.ticksExisted, 1);
            this.flap(rightUpperArm, 0.8F, -0.4F, false, 0.3F, 0.2F, entity.ticksExisted, 1);
        }
        ((EntityNewPrehistoric) entity).chainBuffer.applyChainSwingBuffer((ModelRenderer[]) tailParts);
        // ((ChainBuffer)((EntityVelociraptor)entity).tailBuffer).applyChainSwingBuffer(tailParts);

    }

}
