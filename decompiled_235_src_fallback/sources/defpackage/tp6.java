package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tp6  reason: default package */
/* loaded from: classes.dex */
public final class tp6 extends defpackage.t1 implements defpackage.le2, defpackage.ro2, defpackage.rp6, defpackage.na4 {
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Y = null;
    public static final /* synthetic */ long Z = 0;
    public int X;
    private volatile /* synthetic */ java.lang.Object _state$volatile;

    static {
            java.lang.Class<tp6> r0 = defpackage.tp6.class
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.String r2 = "_state$volatile"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r1, r2)
            defpackage.tp6.Y = r1
            sun.misc.Unsafe r1 = defpackage.v36.a
            java.lang.reflect.Field r0 = r0.getDeclaredField(r2)
            long r0 = r1.objectFieldOffset(r0)
            defpackage.tp6.Z = r0
            return
    }

    public tp6(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state$volatile = r1
            return
    }

    @Override // defpackage.na4, defpackage.ne2
    public final java.lang.Object a(java.lang.Object r1, defpackage.r41 r2) {
            r0 = this;
            r0.l(r1)
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    @Override // defpackage.le2
    public final java.lang.Object b(defpackage.ne2 r17, defpackage.r41 r18) {
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            boolean r3 = r2 instanceof defpackage.sp6
            if (r3 == 0) goto L19
            r3 = r2
            sp6 r3 = (defpackage.sp6) r3
            int r4 = r3.g0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.g0 = r4
            goto L1e
        L19:
            sp6 r3 = new sp6
            r3.<init>(r1, r2)
        L1e:
            java.lang.Object r2 = r3.e0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.g0
            r6 = 0
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 == 0) goto L66
            if (r5 == r9) goto L59
            if (r5 == r8) goto L4a
            if (r5 != r7) goto L44
            java.lang.Object r0 = r3.d0
            rc3 r1 = r3.Z
            vp6 r5 = r3.Y
            ne2 r10 = r3.X
            tp6 r11 = r3.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L40
            r2 = r1
            r1 = r11
            goto L96
        L40:
            r0 = move-exception
            r1 = r11
            goto L119
        L44:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L4a:
            java.lang.Object r0 = r3.d0
            rc3 r1 = r3.Z
            vp6 r5 = r3.Y
            ne2 r10 = r3.X
            tp6 r11 = r3.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L40
            goto Lcf
        L59:
            vp6 r5 = r3.Y
            ne2 r0 = r3.X
            tp6 r1 = r3.R
            defpackage.oi2.Y(r2)     // Catch: java.lang.Throwable -> L63
            goto L87
        L63:
            r0 = move-exception
            goto L119
        L66:
            defpackage.oi2.Y(r2)
            u1 r2 = r1.d()
            r5 = r2
            vp6 r5 = (defpackage.vp6) r5
            boolean r2 = r0 instanceof defpackage.ut6     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L87
            r2 = r0
            ut6 r2 = (defpackage.ut6) r2     // Catch: java.lang.Throwable -> L63
            r3.R = r1     // Catch: java.lang.Throwable -> L63
            r3.X = r0     // Catch: java.lang.Throwable -> L63
            r3.Y = r5     // Catch: java.lang.Throwable -> L63
            r3.g0 = r9     // Catch: java.lang.Throwable -> L63
            java.lang.Object r2 = r2.b(r3)     // Catch: java.lang.Throwable -> L63
            if (r2 != r4) goto L87
            goto L118
        L87:
            l61 r2 = r3.B     // Catch: java.lang.Throwable -> L63
            r2.getClass()     // Catch: java.lang.Throwable -> L63
            vs0 r10 = defpackage.vs0.h0     // Catch: java.lang.Throwable -> L63
            j61 r2 = r2.Z(r10)     // Catch: java.lang.Throwable -> L63
            rc3 r2 = (defpackage.rc3) r2     // Catch: java.lang.Throwable -> L63
            r10 = r0
            r0 = r6
        L96:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = defpackage.tp6.Y     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r11.get(r1)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto Laa
            boolean r12 = r2.e()     // Catch: java.lang.Throwable -> L63
            if (r12 == 0) goto La5
            goto Laa
        La5:
            java.util.concurrent.CancellationException r0 = r2.v()     // Catch: java.lang.Throwable -> L63
            throw r0     // Catch: java.lang.Throwable -> L63
        Laa:
            if (r0 == 0) goto Lb2
            boolean r12 = r0.equals(r11)     // Catch: java.lang.Throwable -> L63
            if (r12 != 0) goto Ld1
        Lb2:
            gr1 r0 = defpackage.fh4.a     // Catch: java.lang.Throwable -> L63
            if (r11 != r0) goto Lb8
            r0 = r6
            goto Lb9
        Lb8:
            r0 = r11
        Lb9:
            r3.R = r1     // Catch: java.lang.Throwable -> L63
            r3.X = r10     // Catch: java.lang.Throwable -> L63
            r3.Y = r5     // Catch: java.lang.Throwable -> L63
            r3.Z = r2     // Catch: java.lang.Throwable -> L63
            r3.d0 = r11     // Catch: java.lang.Throwable -> L63
            r3.g0 = r8     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r10.a(r0, r3)     // Catch: java.lang.Throwable -> L63
            if (r0 != r4) goto Lcc
            goto L118
        Lcc:
            r0 = r11
            r11 = r1
            r1 = r2
        Lcf:
            r2 = r1
            r1 = r11
        Ld1:
            java.util.concurrent.atomic.AtomicReference r11 = r5.a     // Catch: java.lang.Throwable -> L63
            gr1 r12 = defpackage.up6.a     // Catch: java.lang.Throwable -> L63
            java.lang.Object r11 = r11.getAndSet(r12)     // Catch: java.lang.Throwable -> L63
            r11.getClass()     // Catch: java.lang.Throwable -> L63
            gr1 r13 = defpackage.up6.b     // Catch: java.lang.Throwable -> L63
            if (r11 != r13) goto Le1
            goto L96
        Le1:
            r3.R = r1     // Catch: java.lang.Throwable -> L63
            r3.X = r10     // Catch: java.lang.Throwable -> L63
            r3.Y = r5     // Catch: java.lang.Throwable -> L63
            r3.Z = r2     // Catch: java.lang.Throwable -> L63
            r3.d0 = r0     // Catch: java.lang.Throwable -> L63
            r3.g0 = r7     // Catch: java.lang.Throwable -> L63
            jg7 r11 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L63
            rj0 r13 = new rj0     // Catch: java.lang.Throwable -> L63
            r41 r14 = defpackage.np2.V(r3)     // Catch: java.lang.Throwable -> L63
            r13.<init>(r9, r14)     // Catch: java.lang.Throwable -> L63
            r13.v()     // Catch: java.lang.Throwable -> L63
            java.util.concurrent.atomic.AtomicReference r14 = r5.a     // Catch: java.lang.Throwable -> L63
        Lfd:
            boolean r15 = r14.compareAndSet(r12, r13)     // Catch: java.lang.Throwable -> L63
            if (r15 == 0) goto L104
            goto L10d
        L104:
            java.lang.Object r15 = r14.get()     // Catch: java.lang.Throwable -> L63
            if (r15 == r12) goto Lfd
            r13.i(r11)     // Catch: java.lang.Throwable -> L63
        L10d:
            java.lang.Object r12 = r13.s()     // Catch: java.lang.Throwable -> L63
            x61 r13 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L63
            if (r12 != r13) goto L116
            r11 = r12
        L116:
            if (r11 != r4) goto L96
        L118:
            return r4
        L119:
            r1.g(r5)
            throw r0
    }

    @Override // defpackage.ro2
    public final defpackage.le2 c(defpackage.l61 r2, int r3, defpackage.m80 r4) {
            r1 = this;
            if (r3 < 0) goto L6
            r0 = 2
            if (r3 >= r0) goto L6
            goto L9
        L6:
            r0 = -2
            if (r3 != r0) goto Le
        L9:
            m80 r0 = defpackage.m80.DROP_OLDEST
            if (r4 != r0) goto Le
            goto L12
        Le:
            le2 r1 = defpackage.pf6.d(r1, r2, r3, r4)
        L12:
            return r1
    }

    @Override // defpackage.t1
    public final defpackage.u1 e() {
            r0 = this;
            vp6 r0 = new vp6
            r0.<init>()
            return r0
    }

    @Override // defpackage.t1
    public final defpackage.u1[] f() {
            r0 = this;
            r0 = 2
            vp6[] r0 = new defpackage.vp6[r0]
            return r0
    }

    @Override // defpackage.rp6
    public final java.lang.Object getValue() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.tp6.Y
            r0.getClass()
            sun.misc.Unsafe r0 = defpackage.v36.a
            long r1 = defpackage.tp6.Z
            java.lang.Object r3 = r0.getObjectVolatile(r3, r1)
            gr1 r0 = defpackage.fh4.a
            if (r3 != r0) goto L12
            r3 = 0
        L12:
            return r3
    }

    @Override // defpackage.na4
    public final void h() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "MutableStateFlow.resetReplayCache is not supported"
            r1.<init>(r0)
            throw r1
    }

    public final boolean j(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            gr1 r0 = defpackage.fh4.a
            if (r2 != 0) goto L5
            r2 = r0
        L5:
            if (r3 != 0) goto L8
            r3 = r0
        L8:
            boolean r1 = r1.m(r2, r3)
            return r1
    }

    @Override // defpackage.na4
    public final boolean k(java.lang.Object r1) {
            r0 = this;
            r0.l(r1)
            r0 = 1
            return r0
    }

    public final void l(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            gr1 r2 = defpackage.fh4.a
        L4:
            r0 = 0
            r1.m(r0, r2)
            return
    }

    public final boolean m(java.lang.Object r10, java.lang.Object r11) {
            r9 = this;
            monitor-enter(r9)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.tp6.Y     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.get(r9)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            if (r10 == 0) goto L15
            boolean r10 = defpackage.nb3.k(r1, r10)     // Catch: java.lang.Throwable -> L12
            if (r10 != 0) goto L15
            monitor-exit(r9)
            return r2
        L12:
            r10 = move-exception
            goto L8c
        L15:
            boolean r10 = defpackage.nb3.k(r1, r11)     // Catch: java.lang.Throwable -> L12
            r1 = 1
            if (r10 == 0) goto L1e
            monitor-exit(r9)
            return r1
        L1e:
            r0.set(r9, r11)     // Catch: java.lang.Throwable -> L12
            int r10 = r9.X     // Catch: java.lang.Throwable -> L12
            r11 = r10 & 1
            if (r11 != 0) goto L86
            int r10 = r10 + r1
            r9.X = r10     // Catch: java.lang.Throwable -> L12
            u1[] r11 = r9.A     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
        L2d:
            vp6[] r11 = (defpackage.vp6[]) r11
            if (r11 == 0) goto L71
            int r0 = r11.length
            r3 = r2
        L33:
            if (r3 >= r0) goto L71
            r4 = r11[r3]
            if (r4 == 0) goto L6e
            java.util.concurrent.atomic.AtomicReference r4 = r4.a
        L3b:
            java.lang.Object r5 = r4.get()
            if (r5 != 0) goto L42
            goto L6e
        L42:
            gr1 r6 = defpackage.up6.b
            if (r5 != r6) goto L47
            goto L6e
        L47:
            gr1 r7 = defpackage.up6.a
            if (r5 != r7) goto L59
        L4b:
            boolean r7 = r4.compareAndSet(r5, r6)
            if (r7 == 0) goto L52
            goto L6e
        L52:
            java.lang.Object r7 = r4.get()
            if (r7 == r5) goto L4b
            goto L3b
        L59:
            boolean r6 = r4.compareAndSet(r5, r7)
            if (r6 == 0) goto L67
            rj0 r5 = (defpackage.rj0) r5
            jg7 r4 = defpackage.jg7.a
            r5.i(r4)
            goto L6e
        L67:
            java.lang.Object r6 = r4.get()
            if (r6 == r5) goto L59
            goto L3b
        L6e:
            int r3 = r3 + 1
            goto L33
        L71:
            monitor-enter(r9)
            int r11 = r9.X     // Catch: java.lang.Throwable -> L7b
            if (r11 != r10) goto L7d
            int r10 = r10 + r1
            r9.X = r10     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)
            return r1
        L7b:
            r10 = move-exception
            goto L84
        L7d:
            u1[] r10 = r9.A     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r9)
            r8 = r11
            r11 = r10
            r10 = r8
            goto L2d
        L84:
            monitor-exit(r9)
            throw r10
        L86:
            int r10 = r10 + 2
            r9.X = r10     // Catch: java.lang.Throwable -> L12
            monitor-exit(r9)
            return r1
        L8c:
            monitor-exit(r9)
            throw r10
    }
}
