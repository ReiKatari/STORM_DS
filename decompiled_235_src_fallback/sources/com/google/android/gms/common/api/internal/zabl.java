package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zabl implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    public zabl(com.google.android.gms.common.api.internal.GoogleApiManager r1) {
            r0 = this;
            r0.zaa = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean r3) {
            r2 = this;
            com.google.android.gms.common.api.internal.GoogleApiManager r2 = r2.zaa
            android.os.Handler r0 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r2)
            android.os.Handler r2 = com.google.android.gms.common.api.internal.GoogleApiManager.zad(r2)
            r1 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            android.os.Message r2 = r2.obtainMessage(r1, r3)
            r0.sendMessage(r2)
            return
    }
}
