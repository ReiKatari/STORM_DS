package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.AnyClient;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class UnregisterListenerMethod<A extends com.google.android.gms.common.api.Api.AnyClient, L> {
    private final com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey zaa;

    public UnregisterListenerMethod(com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public com.google.android.gms.common.api.internal.ListenerHolder.ListenerKey<L> getListenerKey() {
            r0 = this;
            com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey r0 = r0.zaa
            return r0
    }

    public abstract void unregisterListener(A r1, com.google.android.gms.tasks.TaskCompletionSource<java.lang.Boolean> r2);
}
