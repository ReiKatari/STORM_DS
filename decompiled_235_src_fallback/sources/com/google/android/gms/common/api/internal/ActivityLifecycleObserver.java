package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class ActivityLifecycleObserver {
    public ActivityLifecycleObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final com.google.android.gms.common.api.internal.ActivityLifecycleObserver of(android.app.Activity r1) {
            com.google.android.gms.common.api.internal.zab r0 = new com.google.android.gms.common.api.internal.zab
            com.google.android.gms.common.api.internal.zaa r1 = com.google.android.gms.common.api.internal.zaa.zaa(r1)
            r0.<init>(r1)
            return r0
    }

    public abstract com.google.android.gms.common.api.internal.ActivityLifecycleObserver onStopCallOnce(java.lang.Runnable r1);
}
