package com.google.android.gms.common.stats;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class WakeLockTracker {
    private static final com.google.android.gms.common.stats.WakeLockTracker zza = null;

    static {
            com.google.android.gms.common.stats.WakeLockTracker r0 = new com.google.android.gms.common.stats.WakeLockTracker
            r0.<init>()
            com.google.android.gms.common.stats.WakeLockTracker.zza = r0
            return
    }

    public WakeLockTracker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.common.stats.WakeLockTracker getInstance() {
            com.google.android.gms.common.stats.WakeLockTracker r0 = com.google.android.gms.common.stats.WakeLockTracker.zza
            return r0
    }

    public void registerAcquireEvent(android.content.Context r1, android.content.Intent r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7) {
            r0 = this;
            return
    }

    public void registerDeadlineEvent(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, java.util.List<java.lang.String> r6, boolean r7, long r8) {
            r0 = this;
            return
    }

    public void registerEvent(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.util.List<java.lang.String> r8) {
            r0 = this;
            return
    }

    public void registerEvent(android.content.Context r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.util.List<java.lang.String> r8, long r9) {
            r0 = this;
            return
    }

    public void registerReleaseEvent(android.content.Context r1, android.content.Intent r2) {
            r0 = this;
            return
    }
}
