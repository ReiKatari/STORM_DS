package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q64  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q64 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ q64(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.A = r1
            r0.L = r2
            r0.B = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            int r0 = r10.A
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L163;
                case 1: goto L152;
                case 2: goto L144;
                case 3: goto L110;
                case 4: goto Lea;
                case 5: goto Lde;
                case 6: goto Ld0;
                case 7: goto Lb9;
                case 8: goto La2;
                case 9: goto L8e;
                case 10: goto L7d;
                case 11: goto L69;
                case 12: goto L4e;
                case 13: goto L19;
                default: goto L7;
            }
        L7:
            java.lang.Object r0 = r10.L
            xx7 r0 = (defpackage.xx7) r0
            java.lang.Object r10 = r10.B
            ut3 r10 = (defpackage.ut3) r10
            boolean r1 = r0.L
            if (r1 != 0) goto L18
            r0.R = r10
            r10.a(r0)
        L18:
            return
        L19:
            java.lang.Object r0 = r10.L
            yp7 r0 = (defpackage.yp7) r0
            java.lang.Object r10 = r10.B
            android.view.View[] r10 = (android.view.View[]) r10
            int r3 = r0.p
            r4 = -1
            if (r3 == r4) goto L3c
            int r3 = r10.length
            r5 = r2
        L28:
            if (r5 >= r3) goto L3c
            r6 = r10[r5]
            int r7 = r0.p
            long r8 = java.lang.System.nanoTime()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            r6.setTag(r7, r8)
            int r5 = r5 + 1
            goto L28
        L3c:
            int r3 = r0.q
            if (r3 == r4) goto L4d
            int r3 = r10.length
        L41:
            if (r2 >= r3) goto L4d
            r4 = r10[r2]
            int r5 = r0.q
            r4.setTag(r5, r1)
            int r2 = r2 + 1
            goto L41
        L4d:
            return
        L4e:
            java.lang.Object r0 = r10.L
            kj7 r0 = (defpackage.kj7) r0
            java.lang.Object r10 = r10.B
            java.lang.Runnable r10 = (java.lang.Runnable) r10
            java.lang.ThreadLocal r0 = r0.d
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.set(r1)
            r10.run()     // Catch: java.lang.Throwable -> L64
            r0.remove()
            return
        L64:
            r10 = move-exception
            r0.remove()
            throw r10
        L69:
            java.lang.Object r0 = r10.L
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.Object r10 = r10.B
            zb6 r10 = (defpackage.zb6) r10
            r0.run()     // Catch: java.lang.Throwable -> L78
            r10.a()
            return
        L78:
            r0 = move-exception
            r10.a()
            throw r0
        L7d:
            java.lang.Object r0 = r10.L
            eb r0 = (defpackage.eb) r0
            java.lang.Object r10 = r10.B
            jp6 r10 = (defpackage.jp6) r10
            java.lang.Object r0 = r0.L
            rr6 r0 = (defpackage.rr6) r0
            r1 = 3
            r0.q(r10, r1)
            return
        L8e:
            java.lang.Object r0 = r10.L
            rk3 r0 = (defpackage.rk3) r0
            java.lang.Object r10 = r10.B
            java.util.concurrent.CountDownLatch r10 = (java.util.concurrent.CountDownLatch) r10
            r0.run()     // Catch: java.lang.Throwable -> L9d
            r10.countDown()
            return
        L9d:
            r0 = move-exception
            r10.countDown()
            throw r0
        La2:
            java.lang.Object r0 = r10.L
            dh5 r0 = (defpackage.dh5) r0
            java.lang.Object r10 = r10.B
            dh5 r10 = (defpackage.dh5) r10
            java.lang.Object r0 = r0.A
            w61 r0 = (defpackage.w61) r0
            defpackage.g04.x(r0, r1)
            java.lang.Object r10 = r10.A
            w61 r10 = (defpackage.w61) r10
            defpackage.g04.x(r10, r1)
            return
        Lb9:
            java.lang.Object r0 = r10.L
            wv6 r0 = (defpackage.wv6) r0
            java.lang.Object r10 = r10.B
            java.util.concurrent.atomic.AtomicReference r10 = (java.util.concurrent.atomic.AtomicReference) r10
            java.lang.Object r10 = r10.get()
            b31 r10 = (defpackage.b31) r10
            az r1 = new az
            r1.<init>(r0)
            r10.accept(r1)
            return
        Ld0:
            java.lang.Object r0 = r10.L
            yh6 r0 = (defpackage.yh6) r0
            java.lang.Object r10 = r10.B
            kv7 r10 = (defpackage.kv7) r10
            b31 r0 = r0.c
            r0.accept(r10)
            return
        Lde:
            java.lang.Object r0 = r10.L
            gi2 r0 = (defpackage.gi2) r0
            java.lang.Object r10 = r10.B
            android.graphics.Typeface r10 = (android.graphics.Typeface) r10
            r0.L(r10)
            return
        Lea:
            java.lang.Object r0 = r10.L
            o35 r0 = (defpackage.o35) r0
            java.lang.Object r10 = r10.B
            gw7 r10 = (defpackage.gw7) r10
            java.lang.Object r1 = r0.k
            monitor-enter(r1)
            java.util.ArrayList r0 = r0.j     // Catch: java.lang.Throwable -> L10a
            int r3 = r0.size()     // Catch: java.lang.Throwable -> L10a
            r4 = r2
        Lfc:
            if (r4 >= r3) goto L10c
            java.lang.Object r5 = r0.get(r4)     // Catch: java.lang.Throwable -> L10a
            int r4 = r4 + 1
            b72 r5 = (defpackage.b72) r5     // Catch: java.lang.Throwable -> L10a
            r5.b(r10, r2)     // Catch: java.lang.Throwable -> L10a
            goto Lfc
        L10a:
            r10 = move-exception
            goto L10e
        L10c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10a
            return
        L10e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10a
            throw r10
        L110:
            java.lang.Object r0 = r10.L
            i r0 = (defpackage.i) r0
            java.lang.Object r10 = r10.B
            bw6 r10 = (defpackage.bw6) r10
            r0.getClass()
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r2)
            android.util.Size r1 = r10.b
            int r1 = r1.getWidth()
            android.util.Size r3 = r10.b
            int r3 = r3.getHeight()
            r0.setDefaultBufferSize(r1, r3)
            r0.detachFromGLContext()
            android.view.Surface r1 = new android.view.Surface
            r1.<init>(r0)
            uj1 r3 = defpackage.u24.j()
            ri0 r4 = new ri0
            r4.<init>(r2, r1, r0)
            r10.a(r1, r3, r4)
            return
        L144:
            java.lang.Object r0 = r10.L
            v96 r0 = (defpackage.v96) r0
            java.lang.Object r10 = r10.B
            xl4 r10 = (defpackage.xl4) r10
            jg7 r1 = defpackage.jg7.a
            r0.k(r10, r1)
            return
        L152:
            java.lang.Object r0 = r10.L
            u64 r0 = (defpackage.u64) r0
            java.lang.Object r10 = r10.B
            b63 r10 = (defpackage.b63) r10
            java.util.LinkedHashSet r1 = r0.m0
            r1.add(r10)
            r0.invalidate()
            return
        L163:
            java.lang.Object r0 = r10.L
            s64 r0 = (defpackage.s64) r0
            java.lang.Object r10 = r10.B
            b63 r10 = (defpackage.b63) r10
            java.util.LinkedHashSet r1 = r0.n0
            r1.add(r10)
            r0.invalidate()
            return
    }
}
