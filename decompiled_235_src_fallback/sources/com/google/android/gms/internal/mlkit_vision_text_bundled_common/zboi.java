package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zboi extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi> CREATOR = null;
    private final java.lang.String zba;
    private final android.graphics.Rect zbb;
    private final java.util.List zbc;
    private final java.lang.String zbd;
    private final java.util.List zbe;
    private final float zbf;
    private final float zbg;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboj r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboj
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi.CREATOR = r0
            return
    }

    public zboi(java.lang.String r1, android.graphics.Rect r2, java.util.List r3, java.lang.String r4, java.util.List r5, float r6, float r7) {
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
            java.lang.String r0 = r4.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r5, r6, r0, r3)
            r6 = 5
            java.util.List r0 = r4.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r5, r6, r0, r3)
            r6 = 6
            float r0 = r4.zbf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r0)
            r6 = 7
            float r4 = r4.zbg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(r5, r6, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }

    public final android.graphics.Rect zba() {
            r0 = this;
            android.graphics.Rect r0 = r0.zbb
            return r0
    }

    public final java.lang.String zbb() {
            r0 = this;
            java.lang.String r0 = r0.zbd
            return r0
    }

    public final java.lang.String zbc() {
            r0 = this;
            java.lang.String r0 = r0.zba
            return r0
    }

    public final java.util.List zbd() {
            r0 = this;
            java.util.List r0 = r0.zbc
            return r0
    }
}
