package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Asserts {
    private Asserts() {
            r1 = this;
            r1.<init>()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = "Uninstantiable"
            r1.<init>(r0)
            throw r1
    }

    public static void checkMainThread(java.lang.String r5) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto Lf
            return
        Lf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " IS NOT the main thread "
            java.lang.String r3 = "!"
            java.lang.String r4 = "checkMainThread: current thread "
            java.lang.String r0 = defpackage.lb1.n(r4, r0, r2, r1, r3)
            java.lang.String r1 = "Asserts"
            android.util.Log.e(r1, r0)
            defpackage.i.m(r5)
            return
    }

    public static void checkNotMainThread(java.lang.String r5) {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto Lf
            return
        Lf:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " IS the main thread "
            java.lang.String r3 = "!"
            java.lang.String r4 = "checkNotMainThread: current thread "
            java.lang.String r0 = defpackage.lb1.n(r4, r0, r2, r1, r3)
            java.lang.String r1 = "Asserts"
            android.util.Log.e(r1, r0)
            defpackage.i.m(r5)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static void checkNotNull(java.lang.Object r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.String r0 = "null reference"
            defpackage.i.h(r0)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static void checkNotNull(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkNull(java.lang.Object r0) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "non-null reference"
            defpackage.i.h(r0)
            return
    }

    public static void checkNull(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkState(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.e41.m()
            return
    }

    public static void checkState(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }
}
