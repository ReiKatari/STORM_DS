package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public final class zzak extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zzak> CREATOR = null;
    final int zza;

    static {
            com.google.android.gms.common.internal.zzal r0 = new com.google.android.gms.common.internal.zzal
            r0.<init>()
            com.google.android.gms.common.internal.zzak.CREATOR = r0
            return
    }

    public zzak(int r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            int r1 = r1.zza
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r2)
            r0 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r2, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r2, r3)
            return
    }
}
