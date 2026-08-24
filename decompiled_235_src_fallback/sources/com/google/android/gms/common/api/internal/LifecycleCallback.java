package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final com.google.android.gms.common.api.internal.LifecycleFragment mLifecycleFragment;

    public LifecycleCallback(com.google.android.gms.common.api.internal.LifecycleFragment r1) {
            r0 = this;
            r0.<init>()
            r0.mLifecycleFragment = r1
            return
    }

    private static com.google.android.gms.common.api.internal.LifecycleFragment getChimeraLifecycleFragmentImpl(com.google.android.gms.common.api.internal.LifecycleActivity r1) {
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Method not available in SDK."
            r1.<init>(r0)
            throw r1
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.app.Activity r1) {
            com.google.android.gms.common.api.internal.LifecycleActivity r0 = new com.google.android.gms.common.api.internal.LifecycleActivity
            r0.<init>(r1)
            com.google.android.gms.common.api.internal.LifecycleFragment r1 = getFragment(r0)
            return r1
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(android.content.ContextWrapper r0) {
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static com.google.android.gms.common.api.internal.LifecycleFragment getFragment(com.google.android.gms.common.api.internal.LifecycleActivity r1) {
            boolean r0 = r1.zzd()
            if (r0 == 0) goto Lf
            androidx.fragment.app.p r1 = r1.zzb()
            com.google.android.gms.common.api.internal.zzd r1 = com.google.android.gms.common.api.internal.zzd.zzc(r1)
            return r1
        Lf:
            boolean r0 = r1.zzc()
            if (r0 == 0) goto L1e
            android.app.Activity r1 = r1.zza()
            com.google.android.gms.common.api.internal.zzb r1 = com.google.android.gms.common.api.internal.zzb.zzc(r1)
            return r1
        L1e:
            java.lang.String r1 = "Can't get fragment for unexpected activity."
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    public void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
            r0 = this;
            return
    }

    public android.app.Activity getActivity() {
            r0 = this;
            com.google.android.gms.common.api.internal.LifecycleFragment r0 = r0.mLifecycleFragment
            android.app.Activity r0 = r0.getLifecycleActivity()
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            return r0
    }

    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
            r0 = this;
            return
    }

    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onDestroy() {
            r0 = this;
            return
    }

    public void onResume() {
            r0 = this;
            return
    }

    public void onSaveInstanceState(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public void onStart() {
            r0 = this;
            return
    }

    public void onStop() {
            r0 = this;
            return
    }
}
