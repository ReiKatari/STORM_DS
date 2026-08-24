package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i61  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class i61 implements defpackage.rb0 {
    public static void A(java.lang.String r1, defpackage.tu0 r2) {
            se0 r0 = new se0
            r0.<init>(r1)
            r2.v0(r0)
            return
    }

    public static void B(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            return
    }

    public static boolean C(android.os.Bundle r0, java.lang.String r1, java.lang.String r2) {
            r0.getClass()
            r1.getClass()
            boolean r0 = r0.containsKey(r2)
            return r0
    }

    public static float a(float r0, float r1, float r2, float r3) {
            float r0 = r0 - r1
            float r0 = r0 * r2
            float r0 = r0 + r3
            return r0
    }

    public static int b(int r0, java.util.List r1, int r2) {
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * r2
            return r1
    }

    public static int c(long r0, int r2, int r3) {
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 + r2
            int r0 = r0 * r3
            return r0
    }

    public static long d(long r2) {
            android.os.Trace.endSection()
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0 - r2
            return r0
    }

    public static defpackage.ug e(java.lang.String r0) {
            defpackage.p53.d(r0)
            ug r0 = new ug
            r0.<init>()
            return r0
    }

    public static defpackage.r94 f(defpackage.xq2 r1) {
            r94 r0 = new r94
            r0.<init>()
            r1.l0(r0)
            return r0
    }

    public static defpackage.qa4 g(long r1, defpackage.xq2 r3, boolean r4) {
            kt0 r0 = new kt0
            r0.<init>(r1)
            qa4 r1 = defpackage.np2.b0(r0, r3)
            r3.p(r4)
            return r1
    }

    public static defpackage.m55 h(defpackage.eb1 r2, defpackage.gb1 r3, int r4) {
            fb1 r0 = new fb1
            r1 = 0
            r0.<init>(r2, r4, r1, r3)
            m55 r2 = defpackage.em1.a(r0)
            return r2
    }

    public static java.lang.ClassCastException i(java.lang.Object r0) {
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            return r0
    }

    public static java.lang.ClassCastException j(java.util.Iterator r0) {
            java.lang.Object r0 = r0.next()
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            return r0
    }

    public static java.lang.String k(char r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r3)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String l(defpackage.xq2 r0, int r1, int r2, defpackage.xq2 r3, boolean r4) {
            r0.b0(r1)
            java.lang.String r1 = defpackage.yh2.O(r3, r2)
            r0.p(r4)
            return r1
    }

    public static java.lang.String m(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String n(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String o(java.lang.StringBuilder r0, boolean r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.String p(java.lang.Object[] r0, int r1, java.util.Locale r2, java.lang.String r3, java.lang.StringBuilder r4) {
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r0 = java.lang.String.format(r2, r3, r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
    }

    public static java.lang.StringBuilder q(int r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r2)
            r0.append(r5)
            return r0
    }

    public static java.lang.StringBuilder r(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            return r0
    }

    public static java.lang.StringBuilder t(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            return r0
    }

    public static java.lang.StringBuilder u(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            return r0
    }

    public static void v(int r0, defpackage.xq2 r1, int r2, defpackage.pn r3) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.l0(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.b(r3, r0)
            return
    }

    public static void w(int r0, defpackage.xq2 r1, defpackage.pn r2, defpackage.xq2 r3, defpackage.ne r4) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            defpackage.yh2.K(r1, r2, r0)
            defpackage.yh2.F(r3, r4)
            return
    }

    public static void x(defpackage.xq2 r1, java.lang.Integer r2, defpackage.xq2 r3, defpackage.xq2 r4, defpackage.a74 r5) {
            pn r0 = defpackage.ix0.g
            defpackage.yh2.K(r1, r0, r2)
            ne r1 = defpackage.ix0.h
            defpackage.yh2.F(r3, r1)
            pn r1 = defpackage.ix0.d
            defpackage.yh2.K(r4, r1, r5)
            return
    }

    public static void y(defpackage.xq2 r0, boolean r1, boolean r2, boolean r3) {
            r0.p(r1)
            r0.p(r2)
            r0.p(r3)
            return
    }

    public static /* synthetic */ void z(java.lang.Object r5) {
            boolean r0 = r5 instanceof java.lang.AutoCloseable
            if (r0 == 0) goto La
            java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5
            r5.close()
            return
        La:
            boolean r0 = r5 instanceof java.util.concurrent.ExecutorService
            if (r0 == 0) goto L3d
            java.util.concurrent.ExecutorService r5 = (java.util.concurrent.ExecutorService) r5
            java.util.concurrent.ForkJoinPool r0 = java.util.concurrent.ForkJoinPool.commonPool()
            if (r5 != r0) goto L17
            goto L3c
        L17:
            boolean r0 = r5.isTerminated()
            if (r0 != 0) goto L3c
            r5.shutdown()
            r1 = 0
        L21:
            if (r0 != 0) goto L33
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.InterruptedException -> L2c
            r3 = 1
            boolean r0 = r5.awaitTermination(r3, r2)     // Catch: java.lang.InterruptedException -> L2c
            goto L21
        L2c:
            if (r1 != 0) goto L21
            r5.shutdownNow()
            r1 = 1
            goto L21
        L33:
            if (r1 == 0) goto L3c
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L3c:
            return
        L3d:
            boolean r0 = r5 instanceof android.content.res.TypedArray
            if (r0 == 0) goto L47
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r5.recycle()
            return
        L47:
            boolean r0 = r5 instanceof android.media.MediaMetadataRetriever
            if (r0 == 0) goto L51
            android.media.MediaMetadataRetriever r5 = (android.media.MediaMetadataRetriever) r5
            r5.release()
            return
        L51:
            boolean r0 = r5 instanceof android.media.MediaDrm
            if (r0 == 0) goto L5b
            android.media.MediaDrm r5 = (android.media.MediaDrm) r5
            r5.release()
            return
        L5b:
            defpackage.u34.t()
            return
    }
}
