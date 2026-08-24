package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zacq implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zact zaa;

    public zacq(com.google.android.gms.common.api.internal.zact r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zact r2 = r2.zaa
            com.google.android.gms.common.api.internal.zacs r2 = com.google.android.gms.common.api.internal.zact.zac(r2)
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r1 = 4
            r0.<init>(r1)
            r2.zae(r0)
            return
    }
}
