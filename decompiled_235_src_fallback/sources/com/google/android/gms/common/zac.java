package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zac implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.app.Activity zaa;
    final /* synthetic */ int zab;
    final /* synthetic */ defpackage.d9 zac;
    final /* synthetic */ com.google.android.gms.common.GoogleApiAvailability zad;

    public zac(com.google.android.gms.common.GoogleApiAvailability r1, android.app.Activity r2, int r3, defpackage.d9 r4) {
            r0 = this;
            r0.zad = r1
            r0.zaa = r2
            r0.zab = r3
            r0.zac = r4
            r0.<init>()
            return
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface r3, int r4) {
            r2 = this;
            r3.dismiss()
            com.google.android.gms.common.GoogleApiAvailability r3 = r2.zad
            android.app.Activity r4 = r2.zaa
            int r0 = r2.zab
            r1 = 0
            android.app.PendingIntent r3 = r3.getErrorResolutionPendingIntent(r4, r0, r1)
            if (r3 != 0) goto L11
            return
        L11:
            android.content.IntentSender r3 = r3.getIntentSender()
            r3.getClass()
            s93 r4 = new s93
            r0 = 0
            r4.<init>(r3, r0, r1, r1)
            d9 r2 = r2.zac
            r2.a(r4)
            return
    }
}
