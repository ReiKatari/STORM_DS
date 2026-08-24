package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uy2  reason: default package */
/* loaded from: classes.dex */
public final class uy2 extends defpackage.z64 implements defpackage.yy4 {
    public defpackage.r94 k0;
    public defpackage.oy2 l0;

    public static final java.lang.Object R0(defpackage.uy2 r4, defpackage.s41 r5) {
            boolean r0 = r5 instanceof defpackage.ry2
            if (r0 == 0) goto L13
            r0 = r5
            ry2 r0 = (defpackage.ry2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ry2 r0 = new ry2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            oy2 r0 = r0.R
            defpackage.oi2.Y(r5)
            goto L4a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L30:
            defpackage.oi2.Y(r5)
            oy2 r5 = r4.l0
            if (r5 != 0) goto L4c
            oy2 r5 = new oy2
            r5.<init>()
            r94 r2 = r4.k0
            r0.R = r5
            r0.Z = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.l0 = r0
        L4c:
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public static final java.lang.Object S0(defpackage.uy2 r5, defpackage.s41 r6) {
            boolean r0 = r6 instanceof defpackage.sy2
            if (r0 == 0) goto L13
            r0 = r6
            sy2 r0 = (defpackage.sy2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            sy2 r0 = new sy2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r6)
            goto L45
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r6)
            oy2 r6 = r5.l0
            if (r6 == 0) goto L47
            py2 r2 = new py2
            r2.<init>(r6)
            r94 r6 = r5.k0
            r0.Y = r4
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5.l0 = r3
        L47:
            jg7 r5 = defpackage.jg7.a
            return r5
    }

    @Override // defpackage.yy4
    public final void I() {
            r0 = this;
            r0.T0()
            return
    }

    @Override // defpackage.z64
    public final void K0() {
            r0 = this;
            r0.T0()
            return
    }

    public final void T0() {
            r2 = this;
            oy2 r0 = r2.l0
            if (r0 == 0) goto L11
            py2 r1 = new py2
            r1.<init>(r0)
            r94 r0 = r2.k0
            r0.b(r1)
            r0 = 0
            r2.l0 = r0
        L11:
            return
    }

    @Override // defpackage.yy4
    public final void w(defpackage.oy4 r2, defpackage.py4 r3, long r4) {
            r1 = this;
            py4 r4 = defpackage.py4.Main
            if (r3 != r4) goto L29
            int r2 = r2.f
            r3 = 4
            r4 = 3
            r5 = 0
            if (r2 != r3) goto L19
            w61 r2 = r1.F0()
            ty2 r3 = new ty2
            r0 = 0
            r3.<init>(r1, r5, r0)
            defpackage.hv.L(r2, r5, r5, r3, r4)
            return
        L19:
            r3 = 5
            if (r2 != r3) goto L29
            w61 r2 = r1.F0()
            ty2 r3 = new ty2
            r0 = 1
            r3.<init>(r1, r5, r0)
            defpackage.hv.L(r2, r5, r5, r3, r4)
        L29:
            return
    }
}
