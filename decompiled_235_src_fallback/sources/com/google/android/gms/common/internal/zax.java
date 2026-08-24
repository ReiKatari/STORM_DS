package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zax extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zax> CREATOR = null;
    final int zaa;
    private final int zab;
    private final int zac;
    @java.lang.Deprecated
    private final com.google.android.gms.common.api.Scope[] zad;

    static {
            com.google.android.gms.common.internal.zay r0 = new com.google.android.gms.common.internal.zay
            r0.<init>()
            com.google.android.gms.common.internal.zax.CREATOR = r0
            return
    }

    public zax(int r1, int r2, int r3, com.google.android.gms.common.api.Scope[] r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r0 = r3.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r2, r0)
            r0 = 2
            int r2 = r3.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r2)
            r0 = 3
            int r2 = r3.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r2)
            com.google.android.gms.common.api.Scope[] r3 = r3.zad
            r0 = 0
            r2 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(r4, r2, r3, r5, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r1)
            return
    }
}
