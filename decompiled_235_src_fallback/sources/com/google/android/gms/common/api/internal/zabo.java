package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.zabp zaa;

    public zabo(com.google.android.gms.common.api.internal.zabp r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.common.api.internal.zabp r2 = r2.zaa
            com.google.android.gms.common.api.internal.zabq r2 = r2.zaa
            com.google.android.gms.common.api.Api$Client r0 = com.google.android.gms.common.api.internal.zabq.zae(r2)
            com.google.android.gms.common.api.Api$Client r2 = com.google.android.gms.common.api.internal.zabq.zae(r2)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r1 = " disconnecting because it was signed out."
            java.lang.String r2 = r2.concat(r1)
            r0.disconnect(r2)
            return
    }
}
