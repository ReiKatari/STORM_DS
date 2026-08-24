package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbf extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf> CREATOR = null;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[] zba;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd zbb;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd zbc;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd zbd;
    public final java.lang.String zbe;
    public final float zbf;
    public final java.lang.String zbg;
    public final int zbh;
    public final boolean zbi;
    public final int zbj;
    public final int zbk;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbg r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbg
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf.CREATOR = r0
            return
    }

    public zbf(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[] r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r4, java.lang.String r5, float r6, java.lang.String r7, int r8, boolean r9, int r10, int r11) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            r0.zbf = r6
            r0.zbg = r7
            r0.zbh = r8
            r0.zbi = r9
            r0.zbj = r10
            r0.zbk = r11
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[] r0 = r4.zba
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r5, r2, r0, r6, r3)
            r0 = 3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r2 = r4.zbb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r0 = 4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r2 = r4.zbc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r0 = 5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r2 = r4.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r6 = 6
            java.lang.String r0 = r4.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 7
            float r0 = r4.zbf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r0)
            r6 = 8
            java.lang.String r0 = r4.zbg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 9
            int r0 = r4.zbh
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r0)
            r6 = 10
            boolean r0 = r4.zbi
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r0)
            r6 = 11
            int r0 = r4.zbj
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r0)
            r6 = 12
            int r4 = r4.zbk
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
