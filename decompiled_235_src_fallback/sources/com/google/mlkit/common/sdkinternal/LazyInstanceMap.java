package com.google.mlkit.common.sdkinternal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class LazyInstanceMap<K, V> {
    private final java.util.Map zza;

    public LazyInstanceMap() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.zza = r0
            return
    }

    public abstract V create(K r1);

    public V get(K r3) {
            r2 = this;
            java.util.Map r0 = r2.zza
            monitor-enter(r0)
            java.util.Map r1 = r2.zza     // Catch: java.lang.Throwable -> L13
            boolean r1 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L15
            java.util.Map r2 = r2.zza     // Catch: java.lang.Throwable -> L13
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r2 = move-exception
            goto L20
        L15:
            java.lang.Object r1 = r2.create(r3)     // Catch: java.lang.Throwable -> L13
            java.util.Map r2 = r2.zza     // Catch: java.lang.Throwable -> L13
            r2.put(r3, r1)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }
}
