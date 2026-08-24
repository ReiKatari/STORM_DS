package com.google.android.gms.common.util;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class DefaultClock implements com.google.android.gms.common.util.Clock {
    private static final com.google.android.gms.common.util.DefaultClock zza = null;

    static {
            com.google.android.gms.common.util.DefaultClock r0 = new com.google.android.gms.common.util.DefaultClock
            r0.<init>()
            com.google.android.gms.common.util.DefaultClock.zza = r0
            return
    }

    private DefaultClock() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.util.Clock getInstance() {
            com.google.android.gms.common.util.DefaultClock r0 = com.google.android.gms.common.util.DefaultClock.zza
            return r0
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentThreadTimeMillis() {
            r2 = this;
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            return r0
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long currentTimeMillis() {
            r2 = this;
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long elapsedRealtime() {
            r2 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            return r0
    }

    @Override // com.google.android.gms.common.util.Clock
    public final long nanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }
}
