package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow6  reason: default package */
/* loaded from: classes.dex */
public final class ow6 extends defpackage.z64 implements defpackage.zy4, defpackage.qh1, defpackage.yy4 {
    public java.lang.Object k0;
    public java.lang.Object l0;
    public java.lang.Object[] m0;
    public androidx.compose.ui.input.pointer.PointerInputEventHandler n0;
    public defpackage.ap6 o0;
    public defpackage.oy4 p0;
    public final defpackage.ua4 q0;
    public final defpackage.ua4 r0;
    public final defpackage.ua4 s0;
    public defpackage.oy4 t0;
    public long u0;

    public ow6(java.lang.Object r1, java.lang.Object r2, java.lang.Object[] r3, androidx.compose.ui.input.pointer.PointerInputEventHandler r4) {
            r0 = this;
            r0.<init>()
            r0.k0 = r1
            r0.l0 = r2
            r0.m0 = r3
            r0.n0 = r4
            oy4 r1 = defpackage.jw6.a
            r0.p0 = r1
            ua4 r1 = new ua4
            r2 = 16
            mw6[] r3 = new defpackage.mw6[r2]
            r1.<init>(r3)
            r0.q0 = r1
            r0.r0 = r1
            ua4 r1 = new ua4
            mw6[] r2 = new defpackage.mw6[r2]
            r1.<init>(r2)
            r0.s0 = r1
            r1 = 0
            r0.u0 = r1
            return
    }

    @Override // defpackage.yy4
    public final void I() {
            r27 = this;
            r0 = r27
            oy4 r1 = r0.t0
            if (r1 != 0) goto L7
            goto L74
        L7:
            java.util.List r1 = r1.a
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L74
            java.lang.Object r5 = r1.get(r4)
            vy4 r5 = (defpackage.vy4) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L71
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = r1.size()
            r2.<init>(r4)
            int r4 = r1.size()
        L28:
            if (r3 >= r4) goto L57
            java.lang.Object r5 = r1.get(r3)
            vy4 r5 = (defpackage.vy4) r5
            long r7 = r5.a
            long r11 = r5.c
            long r9 = r5.b
            float r14 = r5.e
            boolean r6 = r5.d
            int r5 = r5.i
            r19 = r6
            vy4 r6 = new vy4
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r13 = 0
            r22 = 0
            r15 = r9
            r17 = r11
            r20 = r19
            r21 = r5
            r6.<init>(r7, r9, r11, r13, r14, r15, r17, r19, r20, r21, r22, r24, r25)
            r2.add(r6)
            int r3 = r3 + 1
            goto L28
        L57:
            oy4 r1 = new oy4
            r3 = 0
            r1.<init>(r2, r3)
            r0.p0 = r1
            py4 r2 = defpackage.py4.Initial
            r0.S0(r1, r2)
            py4 r2 = defpackage.py4.Main
            r0.S0(r1, r2)
            py4 r2 = defpackage.py4.Final
            r0.S0(r1, r2)
            r0.t0 = r3
            return
        L71:
            int r4 = r4 + 1
            goto Lf
        L74:
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r0 = this;
            r0.T0()
            return
    }

    public final java.lang.Object R0(defpackage.eo2 r4, defpackage.r41 r5) {
            r3 = this;
            rj0 r0 = new rj0
            r41 r5 = defpackage.np2.V(r5)
            r1 = 1
            r0.<init>(r1, r5)
            r0.v()
            mw6 r5 = new mw6
            r5.<init>(r3, r0)
            ua4 r1 = r3.r0
            monitor-enter(r1)
            ua4 r3 = r3.q0     // Catch: java.lang.Throwable -> L3e
            r3.b(r5)     // Catch: java.lang.Throwable -> L3e
            n36 r3 = new n36     // Catch: java.lang.Throwable -> L3e
            r41 r4 = defpackage.np2.F(r4, r5, r5)     // Catch: java.lang.Throwable -> L3e
            r41 r4 = defpackage.np2.V(r4)     // Catch: java.lang.Throwable -> L3e
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED     // Catch: java.lang.Throwable -> L3e
            r3.<init>(r4, r2)     // Catch: java.lang.Throwable -> L3e
            jg7 r4 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L3e
            r3.i(r4)     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r1)
            mc r3 = new mc
            r4 = 27
            r3.<init>(r5, r4)
            r0.z(r3)
            java.lang.Object r3 = r0.s()
            return r3
        L3e:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }

    public final void S0(defpackage.oy4 r7, defpackage.py4 r8) {
            r6 = this;
            ua4 r0 = r6.r0
            monitor-enter(r0)
            ua4 r1 = r6.s0     // Catch: java.lang.Throwable -> L70
            ua4 r2 = r6.q0     // Catch: java.lang.Throwable -> L70
            int r3 = r1.L     // Catch: java.lang.Throwable -> L70
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L70
            monitor-exit(r0)
            int[] r0 = defpackage.nw6.a     // Catch: java.lang.Throwable -> L3f
            int r1 = r8.ordinal()     // Catch: java.lang.Throwable -> L3f
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L47
            r3 = 2
            if (r0 == r3) goto L47
            r3 = 3
            if (r0 != r3) goto L41
            ua4 r0 = r6.s0     // Catch: java.lang.Throwable -> L3f
            int r3 = r0.L     // Catch: java.lang.Throwable -> L3f
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.A     // Catch: java.lang.Throwable -> L3f
            int r2 = r0.length     // Catch: java.lang.Throwable -> L3f
            if (r3 >= r2) goto L64
        L29:
            if (r3 < 0) goto L64
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L3f
            mw6 r2 = (defpackage.mw6) r2     // Catch: java.lang.Throwable -> L3f
            py4 r4 = r2.R     // Catch: java.lang.Throwable -> L3f
            if (r8 != r4) goto L3c
            rj0 r4 = r2.L     // Catch: java.lang.Throwable -> L3f
            if (r4 == 0) goto L3c
            r2.L = r1     // Catch: java.lang.Throwable -> L3f
            r4.i(r7)     // Catch: java.lang.Throwable -> L3f
        L3c:
            int r3 = r3 + (-1)
            goto L29
        L3f:
            r7 = move-exception
            goto L6a
        L41:
            ug r7 = new ug     // Catch: java.lang.Throwable -> L3f
            r7.<init>()     // Catch: java.lang.Throwable -> L3f
            throw r7     // Catch: java.lang.Throwable -> L3f
        L47:
            ua4 r0 = r6.s0     // Catch: java.lang.Throwable -> L3f
            java.lang.Object[] r2 = r0.A     // Catch: java.lang.Throwable -> L3f
            int r0 = r0.L     // Catch: java.lang.Throwable -> L3f
            r3 = 0
        L4e:
            if (r3 >= r0) goto L64
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L3f
            mw6 r4 = (defpackage.mw6) r4     // Catch: java.lang.Throwable -> L3f
            py4 r5 = r4.R     // Catch: java.lang.Throwable -> L3f
            if (r8 != r5) goto L61
            rj0 r5 = r4.L     // Catch: java.lang.Throwable -> L3f
            if (r5 == 0) goto L61
            r4.L = r1     // Catch: java.lang.Throwable -> L3f
            r5.i(r7)     // Catch: java.lang.Throwable -> L3f
        L61:
            int r3 = r3 + 1
            goto L4e
        L64:
            ua4 r6 = r6.s0
            r6.g()
            return
        L6a:
            ua4 r6 = r6.s0
            r6.g()
            throw r7
        L70:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
    }

    public final void T0() {
            r4 = this;
            ap6 r0 = r4.o0
            if (r0 == 0) goto L12
            d74 r1 = new d74
            java.lang.String r2 = "Pointer input was reset"
            r3 = 2
            r1.<init>(r2, r3)
            r0.z(r1)
            r0 = 0
            r4.o0 = r0
        L12:
            return
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r0)
            qh1 r0 = r0.u0
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            sm3 r0 = defpackage.nc1.f0(r0)
            qh1 r0 = r0.u0
            float r0 = r0.a()
            return r0
    }

    @Override // defpackage.xg1, defpackage.yy4
    public final void d() {
            r0 = this;
            r0.T0()
            return
    }

    @Override // defpackage.yy4
    public final void w(defpackage.oy4 r4, defpackage.py4 r5, long r6) {
            r3 = this;
            r3.u0 = r6
            py4 r6 = defpackage.py4.Initial
            if (r5 != r6) goto L8
            r3.p0 = r4
        L8:
            ap6 r6 = r3.o0
            r7 = 0
            if (r6 != 0) goto L21
            w61 r6 = r3.F0()
            a71 r0 = defpackage.a71.UNDISPATCHED
            ns3 r1 = new ns3
            r2 = 12
            r1.<init>(r3, r7, r2)
            r2 = 1
            ap6 r6 = defpackage.hv.L(r6, r7, r0, r1, r2)
            r3.o0 = r6
        L21:
            r3.S0(r4, r5)
            java.util.List r5 = r4.a
            int r6 = r5.size()
            r0 = 0
        L2b:
            if (r0 >= r6) goto L3d
            java.lang.Object r1 = r5.get(r0)
            vy4 r1 = (defpackage.vy4) r1
            boolean r1 = defpackage.ej2.p(r1)
            if (r1 != 0) goto L3a
            goto L3e
        L3a:
            int r0 = r0 + 1
            goto L2b
        L3d:
            r4 = r7
        L3e:
            r3.t0 = r4
            return
    }

    @Override // defpackage.yy4
    public final void x0() {
            r0 = this;
            r0.T0()
            return
    }
}
