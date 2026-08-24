package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbj extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj> CREATOR = null;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[] zba;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd zbb;
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd zbc;
    public final java.lang.String zbd;
    public final float zbe;
    public final java.lang.String zbf;
    public final boolean zbg;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbk r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbk
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj.CREATOR = r0
            return
    }

    public zbj(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[] r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r3, java.lang.String r4, float r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbd = r4
            r0.zbe = r5
            r0.zbf = r6
            r0.zbg = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[] r0 = r4.zba
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
            r6 = 5
            java.lang.String r0 = r4.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 6
            float r0 = r4.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r0)
            r6 = 7
            java.lang.String r0 = r4.zbf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 8
            boolean r4 = r4.zbg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
