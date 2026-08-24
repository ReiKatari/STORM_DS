package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ni0  reason: default package */
/* loaded from: classes.dex */
public final class ni0 implements java.lang.AutoCloseable {
    public final android.view.Surface A;
    public final int B;
    public final defpackage.sw L;
    public final /* synthetic */ defpackage.oi0 R;

    public ni0(defpackage.oi0 r1, android.view.Surface r2) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.R = r1
            r0.A = r2
            uw r1 = defpackage.oi0.d
            r1.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = defpackage.uw.b
            int r1 = r2.incrementAndGet(r1)
            r0.B = r1
            r1 = 0
            sw r1 = defpackage.g04.s(r1)
            r0.L = r1
            return
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
            r8 = this;
            sw r0 = r8.L
            boolean r0 = r0.a()
            if (r0 == 0) goto Ldc
            oi0 r0 = r8.R
            java.lang.String r1 = "Surface "
            java.lang.Object r2 = r0.a
            monitor-enter(r2)
            android.view.Surface r3 = r8.A     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap r4 = r0.b     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto Lb7
            int r8 = r4.intValue()     // Catch: java.lang.Throwable -> L38
            int r8 = r8 + (-1)
            java.util.LinkedHashMap r1 = r0.b     // Catch: java.lang.Throwable -> L38
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L38
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L38
            if (r8 != 0) goto L3b
            java.util.LinkedHashSet r8 = r0.c     // Catch: java.lang.Throwable -> L38
            java.util.List r8 = defpackage.gt0.k1(r8)     // Catch: java.lang.Throwable -> L38
            java.util.LinkedHashMap r0 = r0.b     // Catch: java.lang.Throwable -> L38
            r0.remove(r3)     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r8 = move-exception
            goto Lda
        L3b:
            r8 = 0
        L3c:
            monitor-exit(r2)
            if (r8 == 0) goto Ldc
            java.util.Iterator r8 = r8.iterator()
        L43:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto Ldc
            java.lang.Object r0 = r8.next()
            jj7 r0 = (defpackage.jj7) r0
            r0.getClass()
            java.lang.String r1 = "Error when "
            java.lang.String r2 = "SurfaceInactive "
            r3.getClass()
            java.lang.Object r4 = r0.e
            monitor-enter(r4)
            java.util.LinkedHashMap r5 = r0.g     // Catch: java.lang.Throwable -> L88
            java.lang.Object r5 = r5.remove(r3)     // Catch: java.lang.Throwable -> L88
            ig1 r5 = (defpackage.ig1) r5     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto Lb3
            java.lang.String r6 = "CXCP"
            boolean r6 = defpackage.kj2.F(r6)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L8a
            java.lang.String r6 = "CXCP"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L88
            r7.append(r5)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = " in "
            r7.append(r2)     // Catch: java.lang.Throwable -> L88
            r7.append(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L88
            android.util.Log.d(r6, r2)     // Catch: java.lang.Throwable -> L88
            goto L8a
        L88:
            r8 = move-exception
            goto Lb5
        L8a:
            c43 r2 = r0.c     // Catch: java.lang.Throwable -> L88
            r2.k(r5)     // Catch: java.lang.Throwable -> L88
            r5.b()     // Catch: java.lang.Throwable -> L88 java.lang.IllegalStateException -> L93
            goto Lb0
        L93:
            r2 = move-exception
            boolean r5 = defpackage.kj2.L()     // Catch: java.lang.Throwable -> L88
            if (r5 == 0) goto Lb0
            java.lang.String r5 = "CXCP"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L88
            r6.append(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = " going to decrease the use count."
            r6.append(r1)     // Catch: java.lang.Throwable -> L88
            java.lang.String r1 = r6.toString()     // Catch: java.lang.Throwable -> L88
            android.util.Log.w(r5, r1, r2)     // Catch: java.lang.Throwable -> L88
        Lb0:
            r0.e()     // Catch: java.lang.Throwable -> L88
        Lb3:
            monitor-exit(r4)
            goto L43
        Lb5:
            monitor-exit(r4)
            throw r8
        Lb7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L38
            r0.append(r3)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = " ("
            r0.append(r1)     // Catch: java.lang.Throwable -> L38
            r0.append(r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = ") has no use count"
            r0.append(r8)     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Throwable -> L38
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L38
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L38
            r0.<init>(r8)     // Catch: java.lang.Throwable -> L38
            throw r0     // Catch: java.lang.Throwable -> L38
        Lda:
            monitor-exit(r2)
            throw r8
        Ldc:
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SurfaceToken-"
            r0.<init>(r1)
            int r2 = r2.B
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
