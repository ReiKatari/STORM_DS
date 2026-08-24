package com.google.mlkit.vision.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class PointF3D {
    public static PointF3D from(float f, float f2, float f3) {
        return new zza(f, f2, f3);
    }

    public abstract float getX();

    public abstract float getY();

    public abstract float getZ();
}
