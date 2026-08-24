package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ou0  reason: default package */
/* loaded from: classes.dex */
public final class ou0 implements defpackage.jk5 {
    public final java.util.LinkedHashMap A;
    public volatile java.util.Map B;

    public ou0() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.A = r0
            zt1 r0 = defpackage.zt1.A
            r1.B = r0
            return
    }

    @Override // defpackage.jk5
    public final void A(defpackage.yk5 r5) {
            r4 = this;
            r5.getClass()
            java.util.Map r4 = r4.B
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            jk5 r1 = (defpackage.jk5) r1
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            ku0 r2 = new ku0
            r3 = 2
            r2.<init>(r1, r5, r3)
            r0.execute(r2)
            goto Ld
        L2f:
            return
    }

    @Override // defpackage.jk5
    public final void D(defpackage.yk5 r10, long r11, defpackage.uh r13) {
            r9 = this;
            r10.getClass()
            java.util.Map r9 = r9.B
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L33
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            lu0 r2 = new lu0
            r8 = 1
            r4 = r10
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r7, r8)
            r0.execute(r2)
            goto Ld
        L33:
            return
    }

    @Override // defpackage.jk5
    public final void F(defpackage.yk5 r10, long r11, defpackage.wk5 r13) {
            r9 = this;
            java.util.Map r9 = r9.B
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            lu0 r2 = new lu0
            r8 = 0
            r4 = r10
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r7, r8)
            r0.execute(r2)
            goto La
        L30:
            return
    }

    @Override // defpackage.jk5
    public final void J(defpackage.yk5 r10, long r11, defpackage.th r13) {
            r9 = this;
            java.util.Map r9 = r9.B
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            ju0 r2 = new ju0
            r8 = 0
            r4 = r10
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r7, r8)
            r0.execute(r2)
            goto La
        L30:
            return
    }

    @Override // defpackage.jk5
    public final void N(defpackage.kk5 r5) {
            r4 = this;
            r5.getClass()
            java.util.Map r4 = r4.B
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            jk5 r1 = (defpackage.jk5) r1
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            mf r2 = new mf
            r3 = 11
            r2.<init>(r3, r1, r5)
            r0.execute(r2)
            goto Ld
        L30:
            return
    }

    public final void a(defpackage.jk5 r3, defpackage.s37 r4) {
            r2 = this;
            r4.getClass()
            java.util.Map r0 = r2.B
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L20
            java.util.LinkedHashMap r0 = r2.A
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r2.A     // Catch: java.lang.Throwable -> L1d
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L1d
            java.util.LinkedHashMap r3 = r2.A     // Catch: java.lang.Throwable -> L1d
            java.util.Map r3 = defpackage.c14.s0(r3)     // Catch: java.lang.Throwable -> L1d
            r2.B = r3     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L1d:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        L20:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            java.lang.String r3 = " was already registered!"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public final void b(defpackage.jk5 r3) {
            r2 = this;
            r3.getClass()
            java.util.LinkedHashMap r0 = r2.A
            monitor-enter(r0)
            java.util.LinkedHashMap r1 = r2.A     // Catch: java.lang.Throwable -> L15
            r1.remove(r3)     // Catch: java.lang.Throwable -> L15
            java.util.LinkedHashMap r3 = r2.A     // Catch: java.lang.Throwable -> L15
            java.util.Map r3 = defpackage.c14.s0(r3)     // Catch: java.lang.Throwable -> L15
            r2.B = r3     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            return
        L15:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    @Override // defpackage.jk5
    public final void e(defpackage.yk5 r10, long r11, int r13, int r14) {
            r9 = this;
            java.util.Map r9 = r9.B
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            mu0 r2 = new mu0
            r4 = r10
            r5 = r11
            r7 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r7, r8)
            r0.execute(r2)
            goto La
        L30:
            return
    }

    @Override // defpackage.jk5
    public final void k(defpackage.yk5 r5) {
            r4 = this;
            r5.getClass()
            java.util.Map r4 = r4.B
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            jk5 r1 = (defpackage.jk5) r1
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            ku0 r2 = new ku0
            r3 = 1
            r2.<init>(r1, r5, r3)
            r0.execute(r2)
            goto Ld
        L2f:
            return
    }

    @Override // defpackage.jk5
    public final void n(defpackage.yk5 r9, long r10) {
            r8 = this;
            r9.getClass()
            java.util.Map r8 = r8.B
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        Ld:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            zd0 r2 = new zd0
            r7 = 1
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r7)
            r0.execute(r2)
            goto Ld
        L32:
            return
    }

    @Override // defpackage.jk5
    public final void r(defpackage.yk5 r5) {
            r4 = this;
            r5.getClass()
            java.util.Map r4 = r4.B
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            jk5 r1 = (defpackage.jk5) r1
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            ku0 r2 = new ku0
            r3 = 0
            r2.<init>(r1, r5, r3)
            r0.execute(r2)
            goto Ld
        L2f:
            return
    }

    @Override // defpackage.jk5
    public final void u(defpackage.yk5 r10, long r11, long r13) {
            r9 = this;
            r10.getClass()
            java.util.Map r9 = r9.B
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Ld:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L32
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            nu0 r2 = new nu0
            r4 = r10
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r7)
            r0.execute(r2)
            goto Ld
        L32:
            return
    }

    @Override // defpackage.jk5
    public final void x(defpackage.yk5 r10, long r11, defpackage.th r13) {
            r9 = this;
            java.util.Map r9 = r9.B
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        La:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L30
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            r3 = r1
            jk5 r3 = (defpackage.jk5) r3
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            ju0 r2 = new ju0
            r8 = 1
            r4 = r10
            r5 = r11
            r7 = r13
            r2.<init>(r3, r4, r5, r7, r8)
            r0.execute(r2)
            goto La
        L30:
            return
    }
}
