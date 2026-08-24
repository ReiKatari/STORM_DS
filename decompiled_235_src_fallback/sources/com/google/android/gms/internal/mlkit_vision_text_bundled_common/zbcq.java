package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbcq {
    public static final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq zba = null;
    private final java.lang.String zbb;

    static {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq
            java.lang.String r1 = "VisionKit"
            r2 = 2
            r0.<init>(r1, r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcq.zba = r0
            return
    }

    public zbcq(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = "VisionKit"
            r0.zbb = r1
            return
    }

    private final boolean zbd(int r1) {
            r0 = this;
            java.lang.String r0 = r0.zbb
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    private static final java.lang.String zbe(java.lang.Object r1, java.lang.String r2, java.lang.Object... r3) {
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L7
            java.lang.String r1 = (java.lang.String) r1
            goto L29
        L7:
            java.lang.Class r3 = r1.getClass()
            java.lang.String r3 = r3.getName()
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L19
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.String r3 = r1.getName()
        L19:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r3.split(r1)
            int r3 = r1.length
            if (r3 != 0) goto L25
            java.lang.String r1 = ""
            goto L29
        L25:
            int r3 = r3 + (-1)
            r1 = r1[r3]
        L29:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "["
            r3.<init>(r0)
            r3.append(r1)
            java.lang.String r1 = "] "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            return r1
    }

    public final void zba(java.lang.Throwable r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = this;
            r2 = 6
            boolean r2 = r0.zbd(r2)
            if (r2 == 0) goto Le
            java.lang.String r0 = r0.zbb
            java.lang.String r2 = "Error in result from JNI layer"
            android.util.Log.e(r0, r2, r1)
        Le:
            return
    }

    public final void zbb(java.lang.Object r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            r0 = 4
            boolean r0 = r1.zbd(r0)
            if (r0 == 0) goto L10
            java.lang.String r1 = r1.zbb
            java.lang.String r2 = zbe(r2, r3, r4)
            android.util.Log.i(r1, r2)
        L10:
            return
    }

    public final void zbc(java.lang.Object r2, java.lang.String r3, java.lang.Object... r4) {
            r1 = this;
            r0 = 5
            boolean r0 = r1.zbd(r0)
            if (r0 == 0) goto L10
            java.lang.String r1 = r1.zbb
            java.lang.String r2 = zbe(r2, r3, r4)
            android.util.Log.w(r1, r2)
        L10:
            return
    }
}
