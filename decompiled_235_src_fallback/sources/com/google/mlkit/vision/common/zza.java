package com.google.mlkit.vision.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zza extends com.google.mlkit.vision.common.PointF3D {
    private final float zza;
    private final float zzb;
    private final float zzc;

    public zza(float r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.vision.common.PointF3D
            r2 = 0
            if (r1 == 0) goto L3c
            com.google.mlkit.vision.common.PointF3D r5 = (com.google.mlkit.vision.common.PointF3D) r5
            float r1 = r4.zza
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.getX()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L3c
            float r1 = r4.zzb
            int r1 = java.lang.Float.floatToIntBits(r1)
            float r3 = r5.getY()
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r1 != r3) goto L3c
            float r4 = r4.zzc
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = r5.getZ()
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L3c
            return r0
        L3c:
            return r2
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getX() {
            r0 = this;
            float r0 = r0.zza
            return r0
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getY() {
            r0 = this;
            float r0 = r0.zzb
            return r0
    }

    @Override // com.google.mlkit.vision.common.PointF3D
    public final float getZ() {
            r0 = this;
            float r0 = r0.zzc
            return r0
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.zza
            int r0 = java.lang.Float.floatToIntBits(r0)
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            float r2 = r3.zzb
            int r2 = java.lang.Float.floatToIntBits(r2)
            int r0 = r0 * r1
            r0 = r0 ^ r2
            float r3 = r3.zzc
            int r3 = java.lang.Float.floatToIntBits(r3)
            int r0 = r0 * r1
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r4 = this;
            float r0 = r4.zza
            float r1 = r4.zzb
            float r4 = r4.zzc
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "PointF3D{x="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", y="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", z="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = "}"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
