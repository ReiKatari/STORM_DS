package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zboo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo> CREATOR = null;
    private final java.lang.String zba;
    private final android.graphics.Rect zbb;
    private final java.util.List zbc;
    private final float zbd;
    private final float zbe;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbop r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbop
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboo.CREATOR = r0
            return
    }

    public zboo(java.lang.String r1, android.graphics.Rect r2, java.util.List r3, float r4, float r5) {
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
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.zba
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r2, r0, r3)
            r0 = 2
            android.graphics.Rect r2 = r4.zbb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r2, r6, r3)
            r6 = 3
            java.util.List r0 = r4.zbc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r6, r0, r3)
            r6 = 4
            float r0 = r4.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r0)
            r6 = 5
            float r4 = r4.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
