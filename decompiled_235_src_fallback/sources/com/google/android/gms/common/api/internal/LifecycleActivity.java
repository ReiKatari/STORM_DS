package com.google.android.gms.common.api.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LifecycleActivity {
    private final java.lang.Object zza;

    public LifecycleActivity(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "Activity must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    public LifecycleActivity(android.content.ContextWrapper r1) {
            r0 = this;
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public final android.app.Activity zza() {
            r0 = this;
            java.lang.Object r0 = r0.zza
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
    }

    public final androidx.fragment.app.p zzb() {
            r0 = this;
            java.lang.Object r0 = r0.zza
            androidx.fragment.app.p r0 = (androidx.fragment.app.p) r0
            return r0
    }

    public final boolean zzc() {
            r0 = this;
            java.lang.Object r0 = r0.zza
            boolean r0 = r0 instanceof android.app.Activity
            return r0
    }

    public final boolean zzd() {
            r0 = this;
            java.lang.Object r0 = r0.zza
            boolean r0 = r0 instanceof androidx.fragment.app.p
            return r0
    }
}
