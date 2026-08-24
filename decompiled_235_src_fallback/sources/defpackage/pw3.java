package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pw3  reason: default package */
/* loaded from: classes.dex */
public final class pw3 implements defpackage.gx3 {
    public java.util.ArrayList A;
    public java.util.ArrayList B;
    public final boolean L;
    public final java.util.concurrent.atomic.AtomicInteger R;
    public final defpackage.gx3 X;
    public defpackage.qb0 Y;

    public pw3(java.util.ArrayList r3, boolean r4, defpackage.uj1 r5) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r3.size()
            r0.<init>(r1)
            r2.B = r0
            r2.L = r4
            java.util.concurrent.atomic.AtomicInteger r4 = new java.util.concurrent.atomic.AtomicInteger
            int r3 = r3.size()
            r4.<init>(r3)
            r2.R = r4
            s63 r3 = new s63
            r4 = 13
            r3.<init>(r2, r4)
            tb0 r3 = defpackage.ak7.W(r3)
            r2.X = r3
            g15 r3 = new g15
            r4 = 14
            r3.<init>(r2, r4)
            uj1 r4 = defpackage.u24.j()
            r2.a(r4, r3)
            java.util.ArrayList r3 = r2.A
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L4d
            qb0 r3 = r2.Y
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.ArrayList r2 = r2.B
            r4.<init>(r2)
            r3.a(r4)
            return
        L4d:
            r3 = 0
            r4 = r3
        L4f:
            java.util.ArrayList r0 = r2.A
            int r0 = r0.size()
            if (r4 >= r0) goto L60
            java.util.ArrayList r0 = r2.B
            r1 = 0
            r0.add(r1)
            int r4 = r4 + 1
            goto L4f
        L60:
            java.util.ArrayList r4 = r2.A
        L62:
            int r0 = r4.size()
            if (r3 >= r0) goto L79
            java.lang.Object r0 = r4.get(r3)
            gx3 r0 = (defpackage.gx3) r0
            is r1 = new is
            r1.<init>(r2, r3, r0)
            r0.a(r5, r1)
            int r3 = r3 + 1
            goto L62
        L79:
            return
    }

    @Override // defpackage.gx3
    public final void a(java.util.concurrent.Executor r1, java.lang.Runnable r2) {
            r0 = this;
            gx3 r0 = r0.X
            r0.a(r1, r2)
            return
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.A
            if (r0 == 0) goto L17
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L17
            java.lang.Object r3 = r0.get(r2)
            int r2 = r2 + 1
            gx3 r3 = (defpackage.gx3) r3
            r3.cancel(r5)
            goto L9
        L17:
            gx3 r4 = r4.X
            boolean r4 = r4.cancel(r5)
            return r4
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get() {
            r6 = this;
            java.util.ArrayList r0 = r6.A
            gx3 r1 = r6.X
            if (r0 == 0) goto L2e
            boolean r2 = r1.isDone()
            if (r2 != 0) goto L2e
            int r2 = r0.size()
            r3 = 0
        L11:
            if (r3 >= r2) goto L2e
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            gx3 r4 = (defpackage.gx3) r4
        L1b:
            boolean r5 = r4.isDone()
            if (r5 != 0) goto L11
            r4.get()     // Catch: java.lang.Throwable -> L25 java.lang.InterruptedException -> L2a java.lang.Error -> L2c
            goto L1b
        L25:
            boolean r5 = r6.L
            if (r5 == 0) goto L1b
            goto L2e
        L2a:
            r6 = move-exception
            throw r6
        L2c:
            r6 = move-exception
            throw r6
        L2e:
            java.lang.Object r6 = r1.get()
            java.util.List r6 = (java.util.List) r6
            return r6
    }

    @Override // java.util.concurrent.Future
    public final java.lang.Object get(long r1, java.util.concurrent.TimeUnit r3) {
            r0 = this;
            gx3 r0 = r0.X
            java.lang.Object r0 = r0.get(r1, r3)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
            r0 = this;
            gx3 r0 = r0.X
            boolean r0 = r0.isCancelled()
            return r0
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
            r0 = this;
            gx3 r0 = r0.X
            boolean r0 = r0.isDone()
            return r0
    }
}
