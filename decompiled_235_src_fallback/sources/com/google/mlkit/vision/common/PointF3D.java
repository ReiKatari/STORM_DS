package com.google.mlkit.vision.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class PointF3D {
    public PointF3D() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.vision.common.PointF3D from(float r1, float r2, float r3) {
            com.google.mlkit.vision.common.zza r0 = new com.google.mlkit.vision.common.zza
            r0.<init>(r1, r2, r3)
            return r0
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
