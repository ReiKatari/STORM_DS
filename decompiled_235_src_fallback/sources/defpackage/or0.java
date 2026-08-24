package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or0  reason: default package */
/* loaded from: classes.dex */
public class or0 extends defpackage.h0 {
    public defpackage.vy4 H0;
    public defpackage.s43 I0;

    @Override // defpackage.h0, defpackage.yy4
    public final void I() {
            r1 = this;
            super.I()
            r0 = 0
            r1.g1(r0)
            return
    }

    @Override // defpackage.h0
    public final boolean d1(android.view.KeyEvent r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.h0
    public final void e1(android.view.KeyEvent r1) {
            r0 = this;
            on2 r0 = r0.s0
            r0.c()
            return
    }

    @Override // defpackage.a53
    public final void f0() {
            r1 = this;
            r0 = 1
            r1.g1(r0)
            return
    }

    public final void g1(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 == 0) goto L6
            r1.I0 = r0
            goto L8
        L6:
            r1.H0 = r0
        L8:
            r1.X0(r2)
            return
    }

    @Override // defpackage.a53
    public final void u(defpackage.ei r10, defpackage.py4 r11) {
            r9 = this;
            java.lang.Object r10 = r10.L
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            r9.b1()
            boolean r0 = r9.r0
            if (r0 == 0) goto L19
            vr2 r0 = r9.v0
            if (r0 != 0) goto L19
            vr2 r0 = new vr2
            r0.<init>(r9)
            r9.R0(r0)
            r9.v0 = r0
        L19:
            py4 r0 = defpackage.py4.Main
            r1 = 1
            r2 = 0
            if (r11 != r0) goto Lc9
            s43 r11 = r9.I0
            if (r11 != 0) goto L4b
            int r11 = r10.size()
            r0 = r2
        L28:
            if (r0 >= r11) goto Lec
            java.lang.Object r3 = r10.get(r0)
            s43 r3 = (defpackage.s43) r3
            boolean r3 = defpackage.jx2.k(r3)
            if (r3 == 0) goto L48
            java.lang.Object r10 = r10.get(r2)
            s43 r10 = (defpackage.s43) r10
            r10.i = r1
            r9.I0 = r10
            boolean r11 = r9.r0
            if (r11 == 0) goto Lec
            r9.Z0(r10)
            return
        L48:
            int r0 = r0 + 1
            goto L28
        L4b:
            int r11 = r10.size()
            r0 = r2
        L50:
            if (r0 >= r11) goto Laa
            java.lang.Object r3 = r10.get(r0)
            s43 r3 = (defpackage.s43) r3
            boolean r4 = r3.i
            if (r4 != 0) goto L67
            boolean r4 = r3.h
            if (r4 == 0) goto L67
            boolean r3 = r3.d
            if (r3 != 0) goto L67
            int r0 = r0 + 1
            goto L50
        L67:
            nq6 r11 = defpackage.ky0.t
            java.lang.Object r11 = defpackage.hf.K(r9, r11)
            fo7 r11 = (defpackage.fo7) r11
            float r11 = r11.f()
            int r0 = r10.size()
            r3 = r2
        L78:
            if (r3 >= r0) goto Lec
            java.lang.Object r4 = r10.get(r3)
            s43 r4 = (defpackage.s43) r4
            long r5 = r4.c
            s43 r7 = r9.I0
            r7.getClass()
            long r7 = r7.c
            long r5 = defpackage.jk4.e(r5, r7)
            float r5 = defpackage.jk4.d(r5)
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 <= 0) goto L9b
            r5 = r1
            goto L9c
        L9b:
            r5 = r2
        L9c:
            boolean r4 = r4.i
            if (r4 != 0) goto La6
            if (r5 == 0) goto La3
            goto La6
        La3:
            int r3 = r3 + 1
            goto L78
        La6:
            r9.g1(r1)
            return
        Laa:
            java.lang.Object r10 = r10.get(r2)
            s43 r10 = (defpackage.s43) r10
            r10.i = r1
            boolean r10 = r9.r0
            if (r10 == 0) goto Lc5
            s43 r10 = r9.I0
            r10.getClass()
            long r10 = r10.c
            r9.Y0(r10, r1)
            on2 r10 = r9.s0
            r10.c()
        Lc5:
            r10 = 0
            r9.I0 = r10
            return
        Lc9:
            py4 r0 = defpackage.py4.Final
            if (r11 != r0) goto Lec
            s43 r11 = r9.I0
            if (r11 == 0) goto Lec
            int r11 = r10.size()
        Ld5:
            if (r2 >= r11) goto Lec
            java.lang.Object r0 = r10.get(r2)
            s43 r0 = (defpackage.s43) r0
            boolean r3 = r0.i
            if (r3 == 0) goto Le9
            s43 r3 = r9.I0
            if (r0 == r3) goto Le9
            r9.g1(r1)
            return
        Le9:
            int r2 = r2 + 1
            goto Ld5
        Lec:
            return
    }

    @Override // defpackage.h0, defpackage.yy4
    public final void w(defpackage.oy4 r7, defpackage.py4 r8, long r9) {
            r6 = this;
            super.w(r7, r8, r9)
            py4 r0 = defpackage.py4.Main
            r1 = 0
            if (r8 != r0) goto L85
            vy4 r8 = r6.H0
            if (r8 != 0) goto L28
            r8 = 1
            boolean r8 = defpackage.hz6.e(r7, r8)
            if (r8 == 0) goto Lad
            java.util.List r7 = r7.a
            java.lang.Object r7 = r7.get(r1)
            vy4 r7 = (defpackage.vy4) r7
            r7.a()
            r6.H0 = r7
            boolean r8 = r6.r0
            if (r8 == 0) goto Lad
            r6.a1(r7)
            return
        L28:
            java.util.List r7 = r7.a
            int r8 = r7.size()
            r0 = r1
        L2f:
            if (r0 >= r8) goto L65
            java.lang.Object r2 = r7.get(r0)
            vy4 r2 = (defpackage.vy4) r2
            boolean r2 = defpackage.ej2.o(r2)
            if (r2 != 0) goto L62
            long r2 = r6.W0(r9)
            int r8 = r7.size()
            r0 = r1
        L46:
            if (r0 >= r8) goto Lad
            java.lang.Object r4 = r7.get(r0)
            vy4 r4 = (defpackage.vy4) r4
            boolean r5 = r4.c()
            if (r5 != 0) goto L5e
            boolean r4 = defpackage.ej2.K(r4, r9, r2)
            if (r4 == 0) goto L5b
            goto L5e
        L5b:
            int r0 = r0 + 1
            goto L46
        L5e:
            r6.g1(r1)
            return
        L62:
            int r0 = r0 + 1
            goto L2f
        L65:
            java.lang.Object r7 = r7.get(r1)
            vy4 r7 = (defpackage.vy4) r7
            r7.a()
            boolean r7 = r6.r0
            if (r7 == 0) goto L81
            vy4 r7 = r6.H0
            r7.getClass()
            long r7 = r7.c
            r6.Y0(r7, r1)
            on2 r7 = r6.s0
            r7.c()
        L81:
            r7 = 0
            r6.H0 = r7
            return
        L85:
            py4 r9 = defpackage.py4.Final
            if (r8 != r9) goto Lad
            vy4 r8 = r6.H0
            if (r8 == 0) goto Lad
            java.util.List r7 = r7.a
            int r8 = r7.size()
            r9 = r1
        L94:
            if (r9 >= r8) goto Lad
            java.lang.Object r10 = r7.get(r9)
            vy4 r10 = (defpackage.vy4) r10
            boolean r0 = r10.c()
            if (r0 == 0) goto Laa
            vy4 r0 = r6.H0
            if (r10 == r0) goto Laa
            r6.g1(r1)
            return
        Laa:
            int r9 = r9 + 1
            goto L94
        Lad:
            return
    }
}
