package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zah extends com.google.android.gms.common.api.internal.zad {
    public final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zab;

    public zah(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey r2, com.google.android.gms.tasks.TaskCompletionSource r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r3)
            r1.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            java.util.Map r1 = r1.zah()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.zab
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zaci r0 = (com.google.android.gms.common.api.internal.zaci) r0
            if (r0 == 0) goto L18
            com.google.android.gms.common.api.internal.RegisterListenerMethod r0 = r0.zaa
            boolean r0 = r0.zab()
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            java.util.Map r1 = r1.zah()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.zab
            java.lang.Object r0 = r1.get(r0)
            com.google.android.gms.common.api.internal.zaci r0 = (com.google.android.gms.common.api.internal.zaci) r0
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            com.google.android.gms.common.api.internal.RegisterListenerMethod r0 = r0.zaa
            com.google.android.gms.common.Feature[] r0 = r0.getRequiredFeatures()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabq r3) {
            r2 = this;
            java.util.Map r0 = r3.zah()
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r1 = r2.zab
            java.lang.Object r0 = r0.remove(r1)
            com.google.android.gms.common.api.internal.zaci r0 = (com.google.android.gms.common.api.internal.zaci) r0
            if (r0 == 0) goto L1f
            com.google.android.gms.common.api.Api$Client r3 = r3.zaf()
            com.google.android.gms.tasks.TaskCompletionSource r2 = r2.zaa
            com.google.android.gms.common.api.internal.UnregisterListenerMethod r1 = r0.zab
            r1.unregisterListener(r3, r2)
            com.google.android.gms.common.api.internal.RegisterListenerMethod r2 = r0.zaa
            r2.clearListener()
            return
        L1f:
            com.google.android.gms.tasks.TaskCompletionSource r2 = r2.zaa
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r2.trySetResult(r3)
            return
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            return
    }
}
