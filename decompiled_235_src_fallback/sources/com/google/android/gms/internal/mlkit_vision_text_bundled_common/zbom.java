package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbom extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom> CREATOR = null;
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final boolean zbd;
    private final int zbe;
    private final java.lang.String zbf;
    private final boolean zbg;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbon r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbon
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom.CREATOR = r0
            return
    }

    public zbom(java.lang.String r1, java.lang.String r2, java.lang.String r3, boolean r4, int r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbc = r3
            r0.zbf = r6
            r0.zbe = r5
            r0.zbd = r4
            r0.zbg = r7
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zba
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            r5 = 2
            java.lang.String r1 = r3.zbb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 3
            java.lang.String r1 = r3.zbc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 4
            boolean r1 = r3.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 5
            int r1 = r3.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r1)
            r5 = 6
            java.lang.String r1 = r3.zbf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r5, r1, r2)
            r5 = 7
            boolean r3 = r3.zbg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }

    public final java.lang.String zba() {
            r0 = this;
            java.lang.String r0 = r0.zba
            return r0
    }

    public final java.lang.String zbb() {
            r0 = this;
            java.lang.String r0 = r0.zbf
            return r0
    }

    public final java.lang.String zbc() {
            r0 = this;
            java.lang.String r0 = r0.zbc
            return r0
    }

    public final boolean zbd() {
            r0 = this;
            boolean r0 = r0.zbg
            return r0
    }
}
