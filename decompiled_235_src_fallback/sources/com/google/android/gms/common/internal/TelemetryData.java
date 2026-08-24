package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class TelemetryData extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.TelemetryData> CREATOR = null;
    private final int zaa;
    private java.util.List zab;

    static {
            com.google.android.gms.common.internal.zaab r0 = new com.google.android.gms.common.internal.zaab
            r0.<init>()
            com.google.android.gms.common.internal.TelemetryData.CREATOR = r0
            return
    }

    public TelemetryData(int r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r0 = 1
            int r1 = r2.zaa
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r1)
            java.util.List r2 = r2.zab
            r0 = 0
            r1 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(r3, r1, r2, r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }

    public final int zaa() {
            r0 = this;
            int r0 = r0.zaa
            return r0
    }

    public final java.util.List zab() {
            r0 = this;
            java.util.List r0 = r0.zab
            return r0
    }

    public final void zac(com.google.android.gms.common.internal.MethodInvocation r2) {
            r1 = this;
            java.util.List r0 = r1.zab
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.zab = r0
        Lb:
            java.util.List r1 = r1.zab
            r1.add(r2)
            return
    }
}
