package com.google.android.gms.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Preconditions {
    private Preconditions() {
            r1 = this;
            r1.<init>()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r0 = "Uninstantiable"
            r1.<init>(r0)
            throw r1
    }

    public static void checkArgument(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            defpackage.u34.t()
            return
    }

    public static void checkArgument(boolean r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static void checkArgument(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static double checkArgumentInRange(double r3, double r5, double r7, java.lang.String r9) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L21
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto Lb
            return r3
        Lb:
            java.lang.Double r3 = java.lang.Double.valueOf(r5)
            java.lang.Double r4 = java.lang.Double.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3, r4}
            java.lang.String r4 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r3 = zza(r4, r3)
            defpackage.i.h(r3)
            return r1
        L21:
            java.lang.Double r3 = java.lang.Double.valueOf(r5)
            java.lang.Double r4 = java.lang.Double.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3, r4}
            java.lang.String r4 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r3 = zza(r4, r3)
            defpackage.i.h(r3)
            return r1
    }

    public static float checkArgumentInRange(float r2, float r3, float r4, java.lang.String r5) {
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L20
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto La
            return r2
        La:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too high)"
            java.lang.String r2 = zza(r3, r2)
            defpackage.i.h(r2)
            return r1
        L20:
            java.lang.Float r2 = java.lang.Float.valueOf(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r3}
            java.lang.String r3 = "%s is out of range of [%f, %f] (too low)"
            java.lang.String r2 = zza(r3, r2)
            defpackage.i.h(r2)
            return r1
    }

    public static int checkArgumentInRange(int r1, int r2, int r3, java.lang.String r4) {
            r0 = 0
            if (r1 < r2) goto L1c
            if (r1 > r3) goto L6
            return r1
        L6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1, r2}
            java.lang.String r2 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r1 = zza(r2, r1)
            defpackage.i.h(r1)
            return r0
        L1c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r1, r2}
            java.lang.String r2 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r1 = zza(r2, r1)
            defpackage.i.h(r1)
            return r0
    }

    public static long checkArgumentInRange(long r3, long r5, long r7, java.lang.String r9) {
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L21
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 > 0) goto Lb
            return r3
        Lb:
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3, r4}
            java.lang.String r4 = "%s is out of range of [%d, %d] (too high)"
            java.lang.String r3 = zza(r4, r3)
            defpackage.i.h(r3)
            return r1
        L21:
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3, r4}
            java.lang.String r4 = "%s is out of range of [%d, %d] (too low)"
            java.lang.String r3 = zza(r4, r3)
            defpackage.i.h(r3)
            return r1
    }

    public static void checkHandlerThread(android.os.Handler r4) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r4.getLooper()
            if (r0 == r1) goto L30
            if (r0 == 0) goto L15
            java.lang.Thread r0 = r0.getThread()
            java.lang.String r0 = r0.getName()
            goto L17
        L15:
            java.lang.String r0 = "null current looper"
        L17:
            android.os.Looper r4 = r4.getLooper()
            java.lang.Thread r4 = r4.getThread()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = " thread, but got "
            java.lang.String r2 = "."
            java.lang.String r3 = "Must be called on "
            java.lang.String r4 = defpackage.lb1.n(r3, r4, r1, r0, r2)
            defpackage.i.m(r4)
        L30:
            return
    }

    public static void checkHandlerThread(android.os.Handler r1, java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            defpackage.i.m(r2)
            return
    }

    public static void checkMainThread() {
            java.lang.String r0 = "Must be called on the main application thread"
            checkMainThread(r0)
            return
    }

    public static void checkMainThread(java.lang.String r1) {
            boolean r0 = com.google.android.gms.common.util.zzb.zza()
            if (r0 == 0) goto L7
            return
        L7:
            defpackage.i.m(r1)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static java.lang.String checkNotEmpty(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.String r1 = "Given String is empty or null"
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static java.lang.String checkNotEmpty(java.lang.String r1, java.lang.Object r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L7
            return r1
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            throw r1
    }

    public static void checkNotGoogleApiHandlerThread() {
            java.lang.String r0 = "Must not be called on GoogleApiHandler thread."
            checkNotGoogleApiHandlerThread(r0)
            return
    }

    public static void checkNotGoogleApiHandlerThread(java.lang.String r2) {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L1e
            java.lang.Thread r0 = r0.getThread()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "GoogleApiHandler"
            if (r0 == r1) goto L1b
            if (r0 == 0) goto L1e
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1b
            goto L1e
        L1b:
            defpackage.i.m(r2)
        L1e:
            return
    }

    public static void checkNotMainThread() {
            java.lang.String r0 = "Must not be called on the main application thread"
            checkNotMainThread(r0)
            return
    }

    public static void checkNotMainThread(java.lang.String r1) {
            boolean r0 = com.google.android.gms.common.util.zzb.zza()
            if (r0 != 0) goto L7
            return
        L7:
            defpackage.i.m(r1)
            return
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T checkNotNull(T r0) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.String r0 = "null reference"
            defpackage.u34.x(r0)
            r0 = 0
            return r0
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    public static <T> T checkNotNull(T r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static int checkNotZero(int r0) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.String r0 = "Given Integer is zero"
            defpackage.i.h(r0)
            r0 = 0
            return r0
    }

    public static int checkNotZero(int r0, java.lang.Object r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r0.<init>(r1)
            throw r0
    }

    public static long checkNotZero(long r2) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r2 = "Given Long is zero"
            defpackage.i.h(r2)
            r2 = 0
            return r2
    }

    public static long checkNotZero(long r2, java.lang.Object r4) {
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r4)
            r2.<init>(r3)
            throw r2
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

    public static void checkState(boolean r0, java.lang.String r1, java.lang.Object... r2) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.format(r1, r2)
            r0.<init>(r1)
            throw r0
    }

    public static java.lang.String zza(java.lang.String r7, java.lang.Object... r8) {
            int r0 = r7.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 48
            r1.<init>(r0)
            r0 = 0
            r2 = r0
        Ld:
            r3 = 3
            if (r0 >= r3) goto L2e
            java.lang.String r4 = "%s"
            int r4 = r7.indexOf(r4, r2)
            r5 = -1
            if (r4 != r5) goto L1a
            goto L2e
        L1a:
            java.lang.String r2 = r7.substring(r2, r4)
            r1.append(r2)
            int r2 = r0 + 1
            r0 = r8[r0]
            r1.append(r0)
            int r0 = r4 + 2
            r6 = r2
            r2 = r0
            r0 = r6
            goto Ld
        L2e:
            java.lang.String r7 = r7.substring(r2)
            r1.append(r7)
            if (r0 >= r3) goto L58
            java.lang.String r7 = " ["
            r1.append(r7)
            int r7 = r0 + 1
            r0 = r8[r0]
            r1.append(r0)
        L43:
            if (r7 >= r3) goto L53
            java.lang.String r0 = ", "
            r1.append(r0)
            int r0 = r7 + 1
            r7 = r8[r7]
            r1.append(r7)
            r7 = r0
            goto L43
        L53:
            java.lang.String r7 = "]"
            r1.append(r7)
        L58:
            java.lang.String r7 = r1.toString()
            return r7
    }
}
