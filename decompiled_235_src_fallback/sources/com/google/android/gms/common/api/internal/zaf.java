package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaf extends com.google.android.gms.common.api.internal.zad {
    public final com.google.android.gms.common.api.internal.zaci zab;

    public zaf(com.google.android.gms.common.api.internal.zaci r2, com.google.android.gms.tasks.TaskCompletionSource r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r3)
            r1.zab = r2
            return
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final boolean zaa(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zaci r0 = r0.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod r0 = r0.zaa
            boolean r0 = r0.zab()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zac
    public final com.google.android.gms.common.Feature[] zab(com.google.android.gms.common.api.internal.zabq r1) {
            r0 = this;
            com.google.android.gms.common.api.internal.zaci r0 = r0.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod r0 = r0.zaa
            com.google.android.gms.common.Feature[] r0 = r0.getRequiredFeatures()
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.zad
    public final void zac(com.google.android.gms.common.api.internal.zabq r4) {
            r3 = this;
            com.google.android.gms.common.api.internal.zaci r0 = r3.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod r0 = r0.zaa
            com.google.android.gms.common.api.Api$Client r1 = r4.zaf()
            com.google.android.gms.tasks.TaskCompletionSource r2 = r3.zaa
            r0.registerListener(r1, r2)
            com.google.android.gms.common.api.internal.zaci r0 = r3.zab
            com.google.android.gms.common.api.internal.RegisterListenerMethod r0 = r0.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            if (r0 == 0) goto L20
            java.util.Map r4 = r4.zah()
            com.google.android.gms.common.api.internal.zaci r3 = r3.zab
            r4.put(r0, r3)
        L20:
            return
    }

    @Override // com.google.android.gms.common.api.internal.zad, com.google.android.gms.common.api.internal.zai
    public final /* bridge */ /* synthetic */ void zag(com.google.android.gms.common.api.internal.zaad r1, boolean r2) {
            r0 = this;
            return
    }
}
