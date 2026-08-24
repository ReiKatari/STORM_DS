package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class BinderWrapper implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.BinderWrapper> CREATOR = null;
    private final android.os.IBinder zza;

    static {
            com.google.android.gms.common.internal.zzh r0 = new com.google.android.gms.common.internal.zzh
            r0.<init>()
            com.google.android.gms.common.internal.BinderWrapper.CREATOR = r0
            return
    }

    public BinderWrapper(android.os.IBinder r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public /* synthetic */ BinderWrapper(android.os.Parcel r1, com.google.android.gms.common.internal.zzi r2) {
            r0 = this;
            r0.<init>()
            android.os.IBinder r1 = r1.readStrongBinder()
            r0.zza = r1
            return
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.IBinder r0 = r0.zza
            r1.writeStrongBinder(r0)
            return
    }
}
