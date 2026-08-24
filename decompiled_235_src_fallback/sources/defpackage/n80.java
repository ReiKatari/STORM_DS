package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n80  reason: default package */
/* loaded from: classes.dex */
public final class n80 implements defpackage.zr7 {
    public java.lang.Object A;
    public defpackage.rj0 B;
    public final /* synthetic */ defpackage.v80 L;

    public n80(defpackage.v80 r1) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            gr1 r1 = defpackage.x80.p
            r0.A = r1
            return
    }

    @Override // defpackage.zr7
    public final void a(defpackage.p96 r1, int r2) {
            r0 = this;
            rj0 r0 = r0.B
            if (r0 == 0) goto L7
            r0.a(r1, r2)
        L7:
            return
    }

    public final java.lang.Object b(defpackage.s41 r16) {
            r15 = this;
            java.lang.Object r0 = r15.A
            gr1 r1 = defpackage.x80.p
            r2 = 1
            if (r0 == r1) goto Ld
            gr1 r1 = defpackage.x80.l
            if (r0 == r1) goto Ld
            goto L141
        Ld:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.v80.e0
            v80 r6 = r15.L
            java.lang.Object r0 = r0.get(r6)
            hm0 r0 = (defpackage.hm0) r0
        L17:
            boolean r1 = r6.F()
            if (r1 == 0) goto L2d
            gr1 r0 = defpackage.x80.l
            r15.A = r0
            java.lang.Throwable r0 = r6.v()
            if (r0 != 0) goto L2a
            r2 = 0
            goto L141
        L2a:
            int r1 = defpackage.to6.a
            throw r0
        L2d:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.v80.X
            long r3 = r1.getAndIncrement(r6)
            int r1 = defpackage.x80.b
            long r7 = (long) r1
            long r9 = r3 / r7
            long r7 = r3 % r7
            int r8 = (int) r7
            long r11 = r0.X
            int r1 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r1 == 0) goto L48
            hm0 r1 = r6.t(r9, r0)
            if (r1 != 0) goto L49
            goto L17
        L48:
            r1 = r0
        L49:
            r11 = 0
            r7 = r1
            r9 = r3
            java.lang.Object r0 = r6.U(r7, r8, r9, r11)
            gr1 r7 = defpackage.x80.m
            r9 = 0
            if (r0 == r7) goto L146
            gr1 r10 = defpackage.x80.o
            if (r0 != r10) goto L66
            long r7 = r6.z()
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 >= 0) goto L64
            r1.a()
        L64:
            r0 = r1
            goto L17
        L66:
            gr1 r11 = defpackage.x80.n
            if (r0 != r11) goto L13c
            v80 r0 = r15.L
            r41 r2 = defpackage.np2.V(r16)
            rj0 r11 = defpackage.n16.C(r2)
            r15.B = r11     // Catch: java.lang.Throwable -> L85
            r5 = r15
            r2 = r8
            java.lang.Object r8 = r0.U(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L85
            qn2 r12 = r0.B     // Catch: java.lang.Throwable -> L85
            if (r8 != r7) goto L88
            r15.a(r1, r2)     // Catch: java.lang.Throwable -> L85
            goto L131
        L85:
            r0 = move-exception
            goto L138
        L88:
            if (r8 != r10) goto L11f
            long r13 = r0.z()     // Catch: java.lang.Throwable -> L85
            int r2 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r2 >= 0) goto L95
            r1.a()     // Catch: java.lang.Throwable -> L85
        L95:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.v80.e0     // Catch: java.lang.Throwable -> L85
            java.lang.Object r1 = r1.get(r0)     // Catch: java.lang.Throwable -> L85
            hm0 r1 = (defpackage.hm0) r1     // Catch: java.lang.Throwable -> L85
        L9d:
            boolean r2 = r0.F()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto Lc5
            rj0 r0 = r15.B     // Catch: java.lang.Throwable -> L85
            r0.getClass()     // Catch: java.lang.Throwable -> L85
            r15.B = r9     // Catch: java.lang.Throwable -> L85
            gr1 r1 = defpackage.x80.l     // Catch: java.lang.Throwable -> L85
            r15.A = r1     // Catch: java.lang.Throwable -> L85
            java.lang.Throwable r1 = r6.v()     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto Lbb
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L85
            r0.i(r1)     // Catch: java.lang.Throwable -> L85
            goto L131
        Lbb:
            em5 r2 = new em5     // Catch: java.lang.Throwable -> L85
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L85
            r0.i(r2)     // Catch: java.lang.Throwable -> L85
            goto L131
        Lc5:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.v80.X     // Catch: java.lang.Throwable -> L85
            long r3 = r2.getAndIncrement(r0)     // Catch: java.lang.Throwable -> L85
            int r2 = defpackage.x80.b     // Catch: java.lang.Throwable -> L85
            long r13 = (long) r2     // Catch: java.lang.Throwable -> L85
            long r7 = r3 / r13
            long r13 = r3 % r13
            int r2 = (int) r13     // Catch: java.lang.Throwable -> L85
            long r13 = r1.X     // Catch: java.lang.Throwable -> L85
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 == 0) goto Le1
            hm0 r7 = r0.t(r7, r1)     // Catch: java.lang.Throwable -> L85
            if (r7 != 0) goto Le0
            goto L9d
        Le0:
            r1 = r7
        Le1:
            r5 = r15
            java.lang.Object r7 = r0.U(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L85
            gr1 r8 = defpackage.x80.m     // Catch: java.lang.Throwable -> L85
            if (r7 != r8) goto Lee
            r15.a(r1, r2)     // Catch: java.lang.Throwable -> L85
            goto L131
        Lee:
            gr1 r2 = defpackage.x80.o     // Catch: java.lang.Throwable -> L85
            if (r7 != r2) goto Lfe
            long r7 = r0.z()     // Catch: java.lang.Throwable -> L85
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r2 >= 0) goto L9d
            r1.a()     // Catch: java.lang.Throwable -> L85
            goto L9d
        Lfe:
            gr1 r0 = defpackage.x80.n     // Catch: java.lang.Throwable -> L85
            if (r7 == r0) goto L117
            r1.a()     // Catch: java.lang.Throwable -> L85
            r15.A = r7     // Catch: java.lang.Throwable -> L85
            r15.B = r9     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L85
            if (r12 == 0) goto L113
            l4 r9 = new l4     // Catch: java.lang.Throwable -> L85
            r1 = 2
            r9.<init>(r1, r12, r7)     // Catch: java.lang.Throwable -> L85
        L113:
            r11.t(r0, r9)     // Catch: java.lang.Throwable -> L85
            goto L131
        L117:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L85
            java.lang.String r1 = "unexpected"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L85
            throw r0     // Catch: java.lang.Throwable -> L85
        L11f:
            r1.a()     // Catch: java.lang.Throwable -> L85
            r15.A = r8     // Catch: java.lang.Throwable -> L85
            r15.B = r9     // Catch: java.lang.Throwable -> L85
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L85
            if (r12 == 0) goto L113
            l4 r9 = new l4     // Catch: java.lang.Throwable -> L85
            r1 = 2
            r9.<init>(r1, r12, r8)     // Catch: java.lang.Throwable -> L85
            goto L113
        L131:
            java.lang.Object r0 = r11.s()
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            return r0
        L138:
            r11.E()
            throw r0
        L13c:
            r1.a()
            r15.A = r0
        L141:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L146:
            java.lang.String r0 = "unreachable"
            defpackage.i.m(r0)
            return r9
    }

    public final java.lang.Object c() {
            r2 = this;
            java.lang.Object r0 = r2.A
            gr1 r1 = defpackage.x80.p
            if (r0 == r1) goto L16
            r2.A = r1
            gr1 r1 = defpackage.x80.l
            if (r0 == r1) goto Ld
            return r0
        Ld:
            v80 r2 = r2.L
            java.lang.Throwable r2 = r2.x()
            int r0 = defpackage.to6.a
            throw r2
        L16:
            java.lang.String r2 = "`hasNext()` has not been invoked"
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }
}
