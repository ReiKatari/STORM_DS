package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class RegisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder zaa;
    private final com.google.android.gms.common.Feature[] zab;
    private final boolean zac;
    private final int zad;

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1, r1)
            return
    }

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> r2, com.google.android.gms.common.Feature[] r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public RegisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder<L> r1, com.google.android.gms.common.Feature[] r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            r0.zac = r3
            r0.zad = r4
            return
    }

    public void clearListener() {
            r0 = this;
            com.google.android.gms.common.api.internal.ListenerHolder r0 = r0.zaa
            r0.clear()
            return
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r0 = this;
            com.google.android.gms.common.api.internal.ListenerHolder r0 = r0.zaa
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.getListenerKey()
            return r0
    }

    public com.google.android.gms.common.Feature[] getRequiredFeatures() {
            r0 = this;
            com.google.android.gms.common.Feature[] r0 = r0.zab
            return r0
    }

    public abstract void registerListener(A r1, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2);

    public final int zaa() {
            r0 = this;
            int r0 = r0.zad
            return r0
    }

    public final boolean zab() {
            r0 = this;
            boolean r0 = r0.zac
            return r0
    }
}
