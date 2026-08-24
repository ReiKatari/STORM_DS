package com.google.android.gms.common.util.concurrent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NumberedThreadFactory implements java.util.concurrent.ThreadFactory {
    private final java.lang.String zza;
    private final java.util.concurrent.atomic.AtomicInteger zzb;
    private final java.util.concurrent.ThreadFactory zzc;

    public NumberedThreadFactory(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r1.zzb = r0
            java.util.concurrent.ThreadFactory r0 = java.util.concurrent.Executors.defaultThreadFactory()
            r1.zzc = r0
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
            java.util.concurrent.ThreadFactory r3 = r2.zzc
            java.lang.Thread r3 = r3.newThread(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r2.zzb
            int r0 = r0.getAndIncrement()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.zza
            r1.append(r2)
            java.lang.String r2 = "["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r3.setName(r2)
            return r3
    }
}
