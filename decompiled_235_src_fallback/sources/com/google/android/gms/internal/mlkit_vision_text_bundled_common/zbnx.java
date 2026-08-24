package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbnx extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx> CREATOR = null;
    private final int zba;
    private final int zbb;
    private final int zbc;
    private final int zbd;
    private final long zbe;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbny r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbny
            r0.<init>()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx.CREATOR = r0
            return
    }

    public zbnx(int r1, int r2, int r3, int r4, long r5) {
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
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            int r1 = r3.zba
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 2
            int r1 = r3.zbb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 3
            int r1 = r3.zbc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 4
            int r1 = r3.zbd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 5
            long r1 = r3.zbe
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final int zba() {
            r0 = this;
            int r0 = r0.zbc
            return r0
    }

    public final int zbb() {
            r0 = this;
            int r0 = r0.zba
            return r0
    }

    public final int zbc() {
            r0 = this;
            int r0 = r0.zbd
            return r0
    }

    public final int zbd() {
            r0 = this;
            int r0 = r0.zbb
            return r0
    }

    public final long zbe() {
            r2 = this;
            long r0 = r2.zbe
            return r0
    }
}
