package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface LifecycleFragment {
    void addCallback(java.lang.String r1, com.google.android.gms.common.api.internal.LifecycleCallback r2);

    <T extends com.google.android.gms.common.api.internal.LifecycleCallback> T getCallbackOrNull(java.lang.String r1, java.lang.Class<T> r2);

    android.app.Activity getLifecycleActivity();

    boolean isCreated();

    boolean isStarted();

    void startActivityForResult(android.content.Intent r1, int r2);
}
