package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gs1  reason: default package */
/* loaded from: classes.dex */
public final class gs1 implements defpackage.zk4 {
    public final /* synthetic */ int A;
    public int B;
    public int L;
    public int R;
    public int X;
    public final java.lang.Object Y;

    public gs1(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r3
            r1.Y = r2
            r1.L = r4
            r1.R = r5
            r1.X = r6
            return
    }

    public gs1(defpackage.fp r3, long r4) {
            r2 = this;
            r0 = 0
            r2.A = r0
            r2.<init>()
            m42 r0 = new m42
            java.lang.String r3 = r3.B
            r0.<init>()
            r0.d = r3
            r1 = -1
            r0.b = r1
            r0.c = r1
            r2.Y = r0
            int r0 = defpackage.k47.f(r4)
            r2.B = r0
            int r0 = defpackage.k47.e(r4)
            r2.L = r0
            r2.R = r1
            r2.X = r1
            int r2 = defpackage.k47.f(r4)
            int r4 = defpackage.k47.e(r4)
            r5 = 0
            java.lang.String r0 = ") offset is outside of text region "
            if (r2 < 0) goto L5e
            int r1 = r3.length()
            if (r2 > r1) goto L5e
            if (r4 < 0) goto L50
            int r1 = r3.length()
            if (r4 > r1) goto L50
            if (r2 > r4) goto L44
            return
        L44:
            java.lang.String r3 = "Do not set reversed range: "
            java.lang.String r0 = " > "
            java.lang.String r2 = defpackage.lb1.j(r3, r2, r4, r0)
            defpackage.i.h(r2)
            throw r5
        L50:
            java.lang.String r2 = "end ("
            java.lang.StringBuilder r2 = defpackage.xg6.t(r2, r4, r0)
            int r3 = r3.length()
            defpackage.u34.q(r2, r3)
            throw r5
        L5e:
            java.lang.String r4 = "start ("
            java.lang.StringBuilder r2 = defpackage.xg6.t(r4, r2, r0)
            int r3 = r3.length()
            defpackage.u34.q(r2, r3)
            throw r5
    }

    public gs1(defpackage.rg0 r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.Y = r2
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            int r2 = r2.availableProcessors()
            int r2 = r2 - r0
            r0 = 4
            int r2 = java.lang.Math.max(r0, r2)
            r1.B = r2
            r1.L = r0
            r2 = -3
            r1.R = r2
            r2 = -1
            r1.X = r2
            return
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r5, defpackage.vu7 r6) {
            r4 = this;
            java.lang.Object r5 = r4.Y
            android.view.View r5 = (android.view.View) r5
            r0 = 519(0x207, float:7.27E-43)
            ru7 r1 = r6.a
            e83 r0 = r1.h(r0)
            int r1 = r4.B
            if (r1 < 0) goto L20
            android.view.ViewGroup$LayoutParams r2 = r5.getLayoutParams()
            int r3 = r0.b
            int r1 = r1 + r3
            r2.height = r1
            android.view.ViewGroup$LayoutParams r1 = r5.getLayoutParams()
            r5.setLayoutParams(r1)
        L20:
            int r1 = r4.L
            int r2 = r0.a
            int r1 = r1 + r2
            int r2 = r4.R
            int r3 = r0.b
            int r2 = r2 + r3
            int r4 = r4.X
            int r0 = r0.c
            int r4 = r4 + r0
            int r0 = r5.getPaddingBottom()
            r5.setPadding(r1, r2, r4, r0)
            return r6
    }

    public void a(int r5, int r6) {
            r4 = this;
            long r0 = defpackage.jx2.f(r5, r6)
            java.lang.Object r2 = r4.Y
            m42 r2 = (defpackage.m42) r2
            java.lang.String r3 = ""
            r2.k(r5, r6, r3)
            int r5 = r4.B
            int r6 = r4.L
            long r5 = defpackage.jx2.f(r5, r6)
            long r5 = defpackage.hf.u0(r5, r0)
            int r2 = defpackage.k47.f(r5)
            r4.h(r2)
            int r5 = defpackage.k47.e(r5)
            r4.g(r5)
            int r5 = r4.R
            r6 = -1
            if (r5 == r6) goto L4d
            int r2 = r4.X
            long r2 = defpackage.jx2.f(r5, r2)
            long r0 = defpackage.hf.u0(r2, r0)
            boolean r5 = defpackage.k47.c(r0)
            if (r5 == 0) goto L41
            r4.R = r6
            r4.X = r6
            return
        L41:
            int r5 = defpackage.k47.f(r0)
            r4.R = r5
            int r5 = defpackage.k47.e(r0)
            r4.X = r5
        L4d:
            return
    }

    public char b(int r5) {
            r4 = this;
            java.lang.Object r4 = r4.Y
            m42 r4 = (defpackage.m42) r4
            java.lang.Object r0 = r4.e
            ls0 r0 = (defpackage.ls0) r0
            if (r0 != 0) goto L13
            java.lang.Object r4 = r4.d
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r5)
            return r4
        L13:
            int r1 = r4.b
            if (r5 >= r1) goto L20
            java.lang.Object r4 = r4.d
            java.lang.String r4 = (java.lang.String) r4
            char r4 = r4.charAt(r5)
            return r4
        L20:
            int r1 = r0.b
            int r2 = r0.d()
            int r1 = r1 - r2
            int r2 = r4.b
            int r3 = r1 + r2
            if (r5 >= r3) goto L40
            int r5 = r5 - r2
            int r4 = r0.c
            java.lang.Object r1 = r0.e
            char[] r1 = (char[]) r1
            if (r5 >= r4) goto L39
            char r4 = r1[r5]
            return r4
        L39:
            int r5 = r5 - r4
            int r4 = r0.d
            int r5 = r5 + r4
            char r4 = r1[r5]
            return r4
        L40:
            java.lang.Object r0 = r4.d
            java.lang.String r0 = (java.lang.String) r0
            int r4 = r4.c
            int r1 = r1 - r4
            int r1 = r1 + r2
            int r5 = r5 - r1
            char r4 = r0.charAt(r5)
            return r4
    }

    public defpackage.k47 c() {
            r2 = this;
            int r0 = r2.R
            r1 = -1
            if (r0 == r1) goto L11
            int r2 = r2.X
            long r0 = defpackage.jx2.f(r0, r2)
            k47 r2 = new k47
            r2.<init>(r0)
            return r2
        L11:
            r2 = 0
            return r2
    }

    public void d(int r4, int r5, java.lang.String r6) {
            r3 = this;
            java.lang.Object r0 = r3.Y
            m42 r0 = (defpackage.m42) r0
            java.lang.String r1 = ") offset is outside of text region "
            if (r4 < 0) goto L4b
            int r2 = r0.b()
            if (r4 > r2) goto L4b
            if (r5 < 0) goto L3d
            int r2 = r0.b()
            if (r5 > r2) goto L3d
            if (r4 > r5) goto L31
            r0.k(r4, r5, r6)
            int r5 = r6.length()
            int r5 = r5 + r4
            r3.h(r5)
            int r5 = r6.length()
            int r5 = r5 + r4
            r3.g(r5)
            r4 = -1
            r3.R = r4
            r3.X = r4
            return
        L31:
            java.lang.String r3 = "Do not set reversed range: "
            java.lang.String r6 = " > "
            java.lang.String r3 = defpackage.lb1.j(r3, r4, r5, r6)
            defpackage.i.h(r3)
            return
        L3d:
            java.lang.String r3 = "end ("
            java.lang.StringBuilder r3 = defpackage.xg6.t(r3, r5, r1)
            int r4 = r0.b()
            defpackage.u34.q(r3, r4)
            return
        L4b:
            java.lang.String r3 = "start ("
            java.lang.StringBuilder r3 = defpackage.xg6.t(r3, r4, r1)
            int r4 = r0.b()
            defpackage.u34.q(r3, r4)
            return
    }

    public void e(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.Y
            m42 r0 = (defpackage.m42) r0
            java.lang.String r1 = ") offset is outside of text region "
            if (r4 < 0) goto L37
            int r2 = r0.b()
            if (r4 > r2) goto L37
            if (r5 < 0) goto L29
            int r2 = r0.b()
            if (r5 > r2) goto L29
            if (r4 >= r5) goto L1d
            r3.R = r4
            r3.X = r5
            return
        L1d:
            java.lang.String r3 = "Do not set reversed or empty range: "
            java.lang.String r0 = " > "
            java.lang.String r3 = defpackage.lb1.j(r3, r4, r5, r0)
            defpackage.i.h(r3)
            return
        L29:
            java.lang.String r3 = "end ("
            java.lang.StringBuilder r3 = defpackage.xg6.t(r3, r5, r1)
            int r4 = r0.b()
            defpackage.u34.q(r3, r4)
            return
        L37:
            java.lang.String r3 = "start ("
            java.lang.StringBuilder r3 = defpackage.xg6.t(r3, r4, r1)
            int r4 = r0.b()
            defpackage.u34.q(r3, r4)
            return
    }

    public void f(int r4, int r5) {
            r3 = this;
            java.lang.Object r0 = r3.Y
            m42 r0 = (defpackage.m42) r0
            java.lang.String r1 = ") offset is outside of text region "
            if (r4 < 0) goto L39
            int r2 = r0.b()
            if (r4 > r2) goto L39
            if (r5 < 0) goto L2b
            int r2 = r0.b()
            if (r5 > r2) goto L2b
            if (r4 > r5) goto L1f
            r3.h(r4)
            r3.g(r5)
            return
        L1f:
            java.lang.String r3 = "Do not set reversed range: "
            java.lang.String r0 = " > "
            java.lang.String r3 = defpackage.lb1.j(r3, r4, r5, r0)
            defpackage.i.h(r3)
            return
        L2b:
            java.lang.String r3 = "end ("
            java.lang.StringBuilder r3 = defpackage.xg6.t(r3, r5, r1)
            int r4 = r0.b()
            defpackage.u34.q(r3, r4)
            return
        L39:
            java.lang.String r3 = "start ("
            java.lang.StringBuilder r3 = defpackage.xg6.t(r3, r4, r1)
            int r4 = r0.b()
            defpackage.u34.q(r3, r4)
            return
    }

    public void g(int r3) {
            r2 = this;
            if (r3 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set selectionEnd to a negative value: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.q53.a(r0)
        L18:
            r2.L = r3
            return
    }

    public void h(int r3) {
            r2 = this;
            if (r3 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot set selectionStart to a negative value: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            defpackage.q53.a(r0)
        L18:
            r2.B = r3
            return
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.Y
            m42 r1 = (defpackage.m42) r1
            java.lang.String r1 = r1.toString()
            return r1
    }
}
