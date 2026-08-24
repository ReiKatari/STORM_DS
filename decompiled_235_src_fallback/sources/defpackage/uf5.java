package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf5  reason: default package */
/* loaded from: classes.dex */
public final class uf5 implements defpackage.oj1 {
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView A;

    public /* synthetic */ uf5(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public void a(defpackage.y9 r3) {
            r2 = this;
            int r0 = r3.a
            r1 = 1
            androidx.recyclerview.widget.RecyclerView r2 = r2.A
            if (r0 == r1) goto L30
            r1 = 2
            if (r0 == r1) goto L26
            r1 = 4
            if (r0 == r1) goto L1c
            r1 = 8
            if (r0 == r1) goto L12
            return
        L12:
            gg5 r2 = r2.m0
            int r0 = r3.b
            int r3 = r3.d
            r2.a0(r0, r3)
            return
        L1c:
            gg5 r2 = r2.m0
            int r0 = r3.b
            int r3 = r3.d
            r2.c0(r0, r3)
            return
        L26:
            gg5 r2 = r2.m0
            int r0 = r3.b
            int r3 = r3.d
            r2.b0(r0, r3)
            return
        L30:
            gg5 r2 = r2.m0
            int r0 = r3.b
            int r3 = r3.d
            r2.Y(r0, r3)
            return
    }

    public defpackage.wg5 b(int r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r6 = r6.A
            dk0 r0 = r6.e0
            int r0 = r0.t()
            r1 = 0
            r2 = 0
            r3 = r1
        Lb:
            if (r2 >= r0) goto L39
            dk0 r4 = r6.e0
            android.view.View r4 = r4.s(r2)
            wg5 r4 = androidx.recyclerview.widget.RecyclerView.N(r4)
            if (r4 == 0) goto L36
            boolean r5 = r4.h()
            if (r5 != 0) goto L36
            int r5 = r4.c
            if (r5 == r7) goto L24
            goto L36
        L24:
            dk0 r3 = r6.e0
            android.view.View r5 = r4.a
            java.lang.Object r3 = r3.B
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L34
            r3 = r4
            goto L36
        L34:
            r3 = r4
            goto L39
        L36:
            int r2 = r2 + 1
            goto Lb
        L39:
            if (r3 != 0) goto L3c
            goto L55
        L3c:
            dk0 r6 = r6.e0
            android.view.View r7 = r3.a
            java.lang.Object r6 = r6.B
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L56
            boolean r6 = androidx.recyclerview.widget.RecyclerView.z1
            if (r6 == 0) goto L55
            java.lang.String r6 = "RecyclerView"
            java.lang.String r7 = "assuming view holder cannot be find because it is hidden"
            android.util.Log.d(r6, r7)
        L55:
            return r1
        L56:
            return r3
    }

    @Override // defpackage.oj1
    public boolean c(float r4) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r3 = r3.A
            gg5 r0 = r3.m0
            boolean r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto Lf
            int r4 = (int) r4
            r0 = r4
            r4 = r1
            goto L1c
        Lf:
            gg5 r0 = r3.m0
            boolean r0 = r0.d()
            if (r0 == 0) goto L1a
            int r4 = (int) r4
            r0 = r1
            goto L1c
        L1a:
            r4 = r1
            r0 = r4
        L1c:
            if (r4 != 0) goto L21
            if (r0 != 0) goto L21
            return r1
        L21:
            r3.p0()
            r2 = 2147483647(0x7fffffff, float:NaN)
            boolean r3 = r3.J(r4, r0, r1, r2)
            return r3
    }

    public void d(java.lang.Object r8, int r9, int r10) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r7 = r7.A
            dk0 r0 = r7.e0
            int r0 = r0.t()
            int r10 = r10 + r9
            r1 = 0
        La:
            r2 = 2
            r3 = 1
            if (r1 >= r0) goto L58
            dk0 r4 = r7.e0
            android.view.View r4 = r4.s(r1)
            wg5 r5 = androidx.recyclerview.widget.RecyclerView.N(r4)
            if (r5 == 0) goto L55
            boolean r6 = r5.o()
            if (r6 == 0) goto L21
            goto L55
        L21:
            int r6 = r5.c
            if (r6 < r9) goto L55
            if (r6 >= r10) goto L55
            r5.a(r2)
            r2 = 1024(0x400, float:1.435E-42)
            if (r8 != 0) goto L32
            r5.a(r2)
            goto L4d
        L32:
            int r6 = r5.j
            r2 = r2 & r6
            if (r2 != 0) goto L4d
            java.util.ArrayList r2 = r5.k
            if (r2 != 0) goto L48
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.k = r2
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r5.l = r2
        L48:
            java.util.ArrayList r2 = r5.k
            r2.add(r8)
        L4d:
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            r2.c = r3
        L55:
            int r1 = r1 + 1
            goto La
        L58:
            mg5 r8 = r7.L
            java.lang.Object r0 = r8.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 - r3
        L63:
            if (r1 < 0) goto L7d
            java.lang.Object r4 = r0.get(r1)
            wg5 r4 = (defpackage.wg5) r4
            if (r4 != 0) goto L6e
            goto L7a
        L6e:
            int r5 = r4.c
            if (r5 < r9) goto L7a
            if (r5 >= r10) goto L7a
            r4.a(r2)
            r8.k(r1)
        L7a:
            int r1 = r1 + (-1)
            goto L63
        L7d:
            r7.h1 = r3
            return
    }

    public void e(int r12, int r13) {
            r11 = this;
            androidx.recyclerview.widget.RecyclerView r11 = r11.A
            dk0 r0 = r11.e0
            int r0 = r0.t()
            r1 = 0
            r2 = r1
        La:
            java.lang.String r3 = " now at position "
            java.lang.String r4 = " holder "
            java.lang.String r5 = "RecyclerView"
            r6 = 1
            if (r2 >= r0) goto L57
            dk0 r7 = r11.e0
            android.view.View r7 = r7.s(r2)
            wg5 r7 = androidx.recyclerview.widget.RecyclerView.N(r7)
            if (r7 == 0) goto L54
            boolean r8 = r7.o()
            if (r8 != 0) goto L54
            int r8 = r7.c
            if (r8 < r12) goto L54
            boolean r8 = androidx.recyclerview.widget.RecyclerView.z1
            if (r8 == 0) goto L4d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "offsetPositionRecordsForInsert attached child "
            r8.<init>(r9)
            r8.append(r2)
            r8.append(r4)
            r8.append(r7)
            r8.append(r3)
            int r3 = r7.c
            int r3 = r3 + r13
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            android.util.Log.d(r5, r3)
        L4d:
            r7.l(r13, r1)
            sg5 r3 = r11.d1
            r3.f = r6
        L54:
            int r2 = r2 + 1
            goto La
        L57:
            mg5 r0 = r11.L
            java.lang.Object r0 = r0.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r7 = r1
        L62:
            if (r7 >= r2) goto L9a
            java.lang.Object r8 = r0.get(r7)
            wg5 r8 = (defpackage.wg5) r8
            if (r8 == 0) goto L97
            int r9 = r8.c
            if (r9 < r12) goto L97
            boolean r9 = androidx.recyclerview.widget.RecyclerView.z1
            if (r9 == 0) goto L94
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "offsetPositionRecordsForInsert cached "
            r9.<init>(r10)
            r9.append(r7)
            r9.append(r4)
            r9.append(r8)
            r9.append(r3)
            int r10 = r8.c
            int r10 = r10 + r13
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r5, r9)
        L94:
            r8.l(r13, r1)
        L97:
            int r7 = r7 + 1
            goto L62
        L9a:
            r11.requestLayout()
            r11.g1 = r6
            return
    }

    public void f(int r14, int r15) {
            r13 = this;
            androidx.recyclerview.widget.RecyclerView r13 = r13.A
            dk0 r0 = r13.e0
            int r0 = r0.t()
            r1 = -1
            r2 = 1
            if (r14 >= r15) goto L10
            r3 = r14
            r4 = r15
            r5 = r1
            goto L13
        L10:
            r4 = r14
            r3 = r15
            r5 = r2
        L13:
            r6 = 0
            r7 = r6
        L15:
            java.lang.String r8 = " holder "
            java.lang.String r9 = "RecyclerView"
            if (r7 >= r0) goto L5d
            dk0 r10 = r13.e0
            android.view.View r10 = r10.s(r7)
            wg5 r10 = androidx.recyclerview.widget.RecyclerView.N(r10)
            if (r10 == 0) goto L5a
            int r11 = r10.c
            if (r11 < r3) goto L5a
            if (r11 <= r4) goto L2e
            goto L5a
        L2e:
            boolean r11 = androidx.recyclerview.widget.RecyclerView.z1
            if (r11 == 0) goto L49
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "offsetPositionRecordsForMove attached child "
            r11.<init>(r12)
            r11.append(r7)
            r11.append(r8)
            r11.append(r10)
            java.lang.String r8 = r11.toString()
            android.util.Log.d(r9, r8)
        L49:
            int r8 = r10.c
            if (r8 != r14) goto L53
            int r8 = r15 - r14
            r10.l(r8, r6)
            goto L56
        L53:
            r10.l(r5, r6)
        L56:
            sg5 r8 = r13.d1
            r8.f = r2
        L5a:
            int r7 = r7 + 1
            goto L15
        L5d:
            mg5 r0 = r13.L
            java.lang.Object r0 = r0.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r14 >= r15) goto L68
            r3 = r14
            r4 = r15
            goto L6b
        L68:
            r4 = r14
            r3 = r15
            r1 = r2
        L6b:
            int r5 = r0.size()
            r7 = r6
        L70:
            if (r7 >= r5) goto Laa
            java.lang.Object r10 = r0.get(r7)
            wg5 r10 = (defpackage.wg5) r10
            if (r10 == 0) goto La7
            int r11 = r10.c
            if (r11 < r3) goto La7
            if (r11 <= r4) goto L81
            goto La7
        L81:
            if (r11 != r14) goto L89
            int r11 = r15 - r14
            r10.l(r11, r6)
            goto L8c
        L89:
            r10.l(r1, r6)
        L8c:
            boolean r11 = androidx.recyclerview.widget.RecyclerView.z1
            if (r11 == 0) goto La7
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "offsetPositionRecordsForMove cached child "
            r11.<init>(r12)
            r11.append(r7)
            r11.append(r8)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.d(r9, r10)
        La7:
            int r7 = r7 + 1
            goto L70
        Laa:
            r13.requestLayout()
            r13.g1 = r2
            return
    }

    @Override // defpackage.oj1
    public float g() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r1.A
            gg5 r0 = r1.m0
            boolean r0 = r0.e()
            if (r0 == 0) goto Le
            float r1 = r1.Y0
        Lc:
            float r1 = -r1
            return r1
        Le:
            gg5 r0 = r1.m0
            boolean r0 = r0.d()
            if (r0 == 0) goto L19
            float r1 = r1.X0
            goto Lc
        L19:
            r1 = 0
            return r1
    }

    public void h(defpackage.wg5 r8, defpackage.dy7 r9, defpackage.dy7 r10) {
            r7 = this;
            r0 = 0
            r8.n(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.A
            cg5 r0 = r7.L0
            r1 = r0
            ke1 r1 = (defpackage.ke1) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.a
            int r5 = r10.a
            if (r3 != r5) goto L1f
            int r0 = r9.b
            int r2 = r10.b
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.b
            int r6 = r10.b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r2)
            android.view.View r8 = r2.a
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.X()
        L3d:
            return
    }

    public void i(defpackage.wg5 r8, defpackage.dy7 r9, defpackage.dy7 r10) {
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r7 = r7.A
            mg5 r0 = r7.L
            r0.p(r8)
            r7.h(r8)
            r0 = 0
            r8.n(r0)
            cg5 r0 = r7.L0
            r1 = r0
            ke1 r1 = (defpackage.ke1) r1
            r1.getClass()
            int r3 = r9.a
            int r4 = r9.b
            android.view.View r9 = r8.a
            if (r10 != 0) goto L24
            int r0 = r9.getLeft()
        L22:
            r5 = r0
            goto L27
        L24:
            int r0 = r10.a
            goto L22
        L27:
            if (r10 != 0) goto L2f
            int r10 = r9.getTop()
        L2d:
            r6 = r10
            goto L32
        L2f:
            int r10 = r10.b
            goto L2d
        L32:
            boolean r10 = r8.h()
            if (r10 != 0) goto L3d
            if (r3 != r5) goto L3f
            if (r4 == r6) goto L3d
            goto L3f
        L3d:
            r2 = r8
            goto L52
        L3f:
            int r10 = r9.getWidth()
            int r10 = r10 + r5
            int r0 = r9.getHeight()
            int r0 = r0 + r6
            r9.layout(r5, r6, r10, r0)
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L5b
        L52:
            r1.l(r2)
            java.util.ArrayList r8 = r1.h
            r8.add(r2)
            r8 = 1
        L5b:
            if (r8 == 0) goto L60
            r7.X()
        L60:
            return
    }

    public void j(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r1 = r1.A
            android.view.View r0 = r1.getChildAt(r2)
            if (r0 == 0) goto Le
            r1.r(r0)
            r0.clearAnimation()
        Le:
            r1.removeViewAt(r2)
            return
    }

    @Override // defpackage.oj1
    public void k() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            r0.p0()
            return
    }
}
