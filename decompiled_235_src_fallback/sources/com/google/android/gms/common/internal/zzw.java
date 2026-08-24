package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzw extends defpackage.o28 implements com.google.android.gms.common.internal.IAccountAccessor {
    public zzw(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r2 = r2.zzB(r0, r1)
            android.os.Parcelable$Creator r0 = android.accounts.Account.CREATOR
            android.os.Parcelable r0 = defpackage.w28.a(r2, r0)
            android.accounts.Account r0 = (android.accounts.Account) r0
            r2.recycle()
            return r0
    }
}
