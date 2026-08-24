package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbd extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd> CREATOR = null;
    public final int zba;
    public final int zbb;
    public final int zbc;
    public final int zbd;
    public final float zbe;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbe r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbe
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd.CREATOR = r0
            return
    }

    public zbd(int r1, int r2, int r3, int r4, float r5) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zba
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            r4 = 3
            int r1 = r2.zbb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 4
            int r1 = r2.zbc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 5
            int r1 = r2.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r4, r1)
            r4 = 6
            float r2 = r2.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r3, r4, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
