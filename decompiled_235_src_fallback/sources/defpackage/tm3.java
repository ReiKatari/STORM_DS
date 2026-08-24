package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm3  reason: default package */
/* loaded from: classes.dex */
public final class tm3 {
    public final defpackage.nc a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public defpackage.nc h;
    public final java.util.HashMap i;
    public final /* synthetic */ int j;

    public tm3(defpackage.nc r1, int r2) {
            r0 = this;
            r0.j = r2
            r0.<init>()
            r0.a = r1
            r1 = 1
            r0.b = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.i = r1
            return
    }

    public static final void a(defpackage.tm3 r9, defpackage.ey2 r10, int r11, defpackage.eg4 r12) {
            java.util.HashMap r0 = r9.i
            float r11 = (float) r11
            int r1 = java.lang.Float.floatToRawIntBits(r11)
            long r1 = (long) r1
            int r11 = java.lang.Float.floatToRawIntBits(r11)
            long r3 = (long) r11
            r11 = 32
            long r1 = r1 << r11
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
        L16:
            long r1 = r1 | r3
        L17:
            int r3 = r9.j
            switch(r3) {
                case 0: goto L3e;
                default: goto L1c;
            }
        L1c:
            mz3 r3 = r12.W0()
            r3.getClass()
            long r3 = r3.l0
            long r7 = r3 >> r11
            int r7 = (int) r7
            float r7 = (float) r7
            long r3 = r3 & r5
            int r3 = (int) r3
            float r3 = (float) r3
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r7 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r3
            long r7 = r7 << r11
            long r3 = r3 & r5
            long r3 = r3 | r7
            long r1 = defpackage.jk4.f(r3, r1)
            goto L57
        L3e:
            yp4 r3 = r12.J0
            if (r3 == 0) goto L51
            xt2 r3 = (defpackage.xt2) r3
            float[] r4 = r3.b()
            boolean r3 = r3.o0
            if (r3 == 0) goto L4d
            goto L51
        L4d:
            long r1 = defpackage.v24.b(r1, r4)
        L51:
            long r3 = r12.x0
            long r1 = defpackage.kn2.U(r1, r3)
        L57:
            eg4 r12 = r12.o0
            r12.getClass()
            nc r3 = r9.a
            y53 r3 = r3.f()
            boolean r3 = r12.equals(r3)
            if (r3 != 0) goto L86
            java.util.Map r3 = r9.b(r12)
            boolean r3 = r3.containsKey(r10)
            if (r3 == 0) goto L17
            int r1 = r9.c(r12, r10)
            float r1 = (float) r1
            int r2 = java.lang.Float.floatToRawIntBits(r1)
            long r2 = (long) r2
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r7 = (long) r1
            long r1 = r2 << r11
            long r3 = r7 & r5
            goto L16
        L86:
            boolean r9 = r10 instanceof defpackage.ey2
            if (r9 == 0) goto L92
            long r11 = r1 & r5
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
            goto L99
        L92:
            long r11 = r1 >> r11
            int r9 = (int) r11
            float r9 = java.lang.Float.intBitsToFloat(r9)
        L99:
            int r9 = java.lang.Math.round(r9)
            boolean r11 = r0.containsKey(r10)
            if (r11 == 0) goto Lc3
            java.lang.Object r11 = defpackage.c14.j0(r0, r10)
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            ey2 r12 = defpackage.lc.a
            eo2 r12 = r10.a
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r12.o(r11, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        Lc3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r10, r9)
            return
    }

    public final java.util.Map b(defpackage.eg4 r1) {
            r0 = this;
            int r0 = r0.j
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            mz3 r0 = r1.W0()
            r0.getClass()
            f34 r0 = r0.G0()
            java.util.Map r0 = r0.b()
            return r0
        L15:
            f34 r0 = r1.G0()
            java.util.Map r0 = r0.b()
            return r0
    }

    public final int c(defpackage.eg4 r1, defpackage.ey2 r2) {
            r0 = this;
            int r0 = r0.j
            switch(r0) {
                case 0: goto L11;
                default: goto L5;
            }
        L5:
            mz3 r0 = r1.W0()
            r0.getClass()
            int r0 = r0.X(r2)
            return r0
        L11:
            int r0 = r1.X(r2)
            return r0
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L13
            boolean r0 = r1.e
            if (r0 != 0) goto L13
            boolean r0 = r1.f
            if (r0 != 0) goto L13
            boolean r1 = r1.g
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final boolean e() {
            r0 = this;
            r0.h()
            nc r0 = r0.h
            if (r0 == 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final void f() {
            r3 = this;
            r0 = 1
            r3.b = r0
            nc r0 = r3.a
            nc r1 = r0.j()
            if (r1 != 0) goto Lc
            return
        Lc:
            boolean r2 = r3.c
            if (r2 == 0) goto L14
            r1.S()
            goto L1f
        L14:
            boolean r2 = r3.e
            if (r2 != 0) goto L1c
            boolean r2 = r3.d
            if (r2 == 0) goto L1f
        L1c:
            r1.requestLayout()
        L1f:
            boolean r2 = r3.f
            if (r2 == 0) goto L26
            r0.S()
        L26:
            boolean r3 = r3.g
            if (r3 == 0) goto L2d
            r0.requestLayout()
        L2d:
            tm3 r3 = r1.b()
            r3.f()
            return
    }

    public final void g() {
            r4 = this;
            java.util.HashMap r0 = r4.i
            r0.clear()
            mc r1 = new mc
            r2 = 0
            r1.<init>(r4, r2)
            nc r3 = r4.a
            r3.G(r1)
            y53 r1 = r3.f()
            java.util.Map r1 = r4.b(r1)
            r0.putAll(r1)
            r4.b = r2
            return
    }

    public final void h() {
            r2 = this;
            boolean r0 = r2.d()
            nc r1 = r2.a
            if (r0 == 0) goto L9
            goto L51
        L9:
            nc r0 = r1.j()
            if (r0 != 0) goto L10
            goto L53
        L10:
            tm3 r0 = r0.b()
            nc r1 = r0.h
            if (r1 == 0) goto L23
            tm3 r0 = r1.b()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            nc r0 = r2.h
            if (r0 == 0) goto L53
            tm3 r1 = r0.b()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            nc r1 = r0.j()
            if (r1 == 0) goto L41
            tm3 r1 = r1.b()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            nc r0 = r0.j()
            if (r0 == 0) goto L50
            tm3 r0 = r0.b()
            if (r0 == 0) goto L50
            nc r1 = r0.h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.h = r1
        L53:
            return
    }
}
