package com.google.android.gms.common.server;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FavaDiagnosticsEntity extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.FavaDiagnosticsEntity> CREATOR = null;
    final int zaa;
    public final java.lang.String zab;
    public final int zac;

    static {
            com.google.android.gms.common.server.zaa r0 = new com.google.android.gms.common.server.zaa
            r0.<init>()
            com.google.android.gms.common.server.FavaDiagnosticsEntity.CREATOR = r0
            return
    }

    public FavaDiagnosticsEntity(int r1, java.lang.String r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            return
    }

    public FavaDiagnosticsEntity(java.lang.String r2, int r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.zaa = r0
            r1.zab = r2
            r1.zac = r3
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = r3.zaa
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r1, r5)
            java.lang.String r5 = r3.zab
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r5, r1)
            r5 = 3
            int r3 = r3.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r5, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
