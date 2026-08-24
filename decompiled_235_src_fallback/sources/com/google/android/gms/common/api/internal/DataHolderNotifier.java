package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class DataHolderNotifier<L> implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<L> {
    private final com.google.android.gms.common.data.DataHolder zaa;

    public DataHolderNotifier(com.google.android.gms.common.data.DataHolder r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void notifyListener(L r2) {
            r1 = this;
            com.google.android.gms.common.data.DataHolder r0 = r1.zaa
            r1.notifyListener(r2, r0)
            return
    }

    public abstract void notifyListener(L r1, com.google.android.gms.common.data.DataHolder r2);

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public void onNotifyListenerFailed() {
            r0 = this;
            com.google.android.gms.common.data.DataHolder r0 = r0.zaa
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }
}
