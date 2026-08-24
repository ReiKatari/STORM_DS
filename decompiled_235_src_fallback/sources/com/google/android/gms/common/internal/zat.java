package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zat extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zat> CREATOR = null;
    final int zaa;
    private final android.accounts.Account zab;
    private final int zac;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zad;

    static {
            com.google.android.gms.common.internal.zau r0 = new com.google.android.gms.common.internal.zau
            r0.<init>()
            com.google.android.gms.common.internal.zat.CREATOR = r0
            return
    }

    public zat(int r1, android.accounts.Account r2, int r3, com.google.android.gms.auth.api.signin.GoogleSignInAccount r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    public zat(android.accounts.Account r2, int r3, com.google.android.gms.auth.api.signin.GoogleSignInAccount r4) {
            r1 = this;
            r0 = 2
            r1.<init>(r0, r2, r3, r4)
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r5, int r6) {
            r4 = this;
            int r0 = r4.zaa
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r5)
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r2, r0)
            android.accounts.Account r0 = r4.zab
            r2 = 2
            r3 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r2, r0, r6, r3)
            r0 = 3
            int r2 = r4.zac
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r5, r0, r2)
            r0 = 4
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r4 = r4.zad
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r5, r0, r4, r6, r3)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r5, r1)
            return
    }
}
