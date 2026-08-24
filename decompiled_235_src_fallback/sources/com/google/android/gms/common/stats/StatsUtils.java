package com.google.android.gms.common.stats;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public class StatsUtils {
    public StatsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getEventKey(android.os.PowerManager.WakeLock r4, java.lang.String r5) {
            int r0 = android.os.Process.myPid()
            long r0 = (long) r0
            int r4 = java.lang.System.identityHashCode(r4)
            long r2 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r0 = r0 | r2
            java.lang.String r4 = java.lang.String.valueOf(r0)
            r0 = 1
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r0 != r1) goto L1b
            java.lang.String r5 = ""
        L1b:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r4 = r4.concat(r5)
            return r4
    }
}
