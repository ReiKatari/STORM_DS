package com.google.android.gms.common.util.concurrent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NamedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.ThreadFactory zzb;

    public NamedThreadFactory(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzb = r0
            java.lang.String r0 = "Name must not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2, r0)
            r1.zza = r2
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public final java.lang.Thread newThread(java.lang.Runnable r3) {
            r2 = this;
            com.google.android.gms.common.util.concurrent.zza r0 = new com.google.android.gms.common.util.concurrent.zza
            r1 = 0
            r0.<init>(r3, r1)
            java.util.concurrent.ThreadFactory r3 = r2.zzb
            java.lang.Thread r3 = r3.newThread(r0)
            java.lang.String r2 = r2.zza
            r3.setName(r2)
            return r3
    }
}
