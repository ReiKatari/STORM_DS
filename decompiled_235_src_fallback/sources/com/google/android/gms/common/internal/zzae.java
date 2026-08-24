package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzae extends defpackage.o28 implements com.google.android.gms.common.internal.zzag {
    public zzae(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGoogleCertificatesApi"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zze(com.google.android.gms.common.zzo r2) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.c(r0, r2)
            r2 = 6
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.common.zzq> r2 = com.google.android.gms.common.zzq.CREATOR
            android.os.Parcelable r2 = defpackage.w28.a(r1, r2)
            com.google.android.gms.common.zzq r2 = (com.google.android.gms.common.zzq) r2
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final com.google.android.gms.common.zzq zzf(com.google.android.gms.common.zzo r2) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.c(r0, r2)
            r2 = 8
            android.os.Parcel r1 = r1.zzB(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.common.zzq> r2 = com.google.android.gms.common.zzq.CREATOR
            android.os.Parcelable r2 = defpackage.w28.a(r1, r2)
            com.google.android.gms.common.zzq r2 = (com.google.android.gms.common.zzq) r2
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzg() {
            r2 = this;
            r0 = 9
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r2 = r2.zzB(r0, r1)
            int r0 = defpackage.w28.a
            int r0 = r2.readInt()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzh(com.google.android.gms.common.zzs r2, defpackage.d13 r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            defpackage.w28.c(r0, r2)
            defpackage.w28.d(r0, r3)
            r2 = 5
            android.os.Parcel r1 = r1.zzB(r2, r0)
            int r2 = r1.readInt()
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            r1.recycle()
            return r2
    }

    @Override // com.google.android.gms.common.internal.zzag
    public final boolean zzi() {
            r2 = this;
            r0 = 7
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r2 = r2.zzB(r0, r1)
            int r0 = defpackage.w28.a
            int r0 = r2.readInt()
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r2.recycle()
            return r0
    }
}
