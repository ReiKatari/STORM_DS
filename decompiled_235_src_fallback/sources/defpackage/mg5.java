package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mg5  reason: default package */
/* loaded from: classes.dex */
public final class mg5 {
    public int a;
    public int b;
    public final java.lang.Object c;
    public java.lang.Object d;
    public final java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public final java.lang.Object h;

    public mg5(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.<init>()
            r1.h = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            r0 = 0
            r1.d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.e = r0
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f = r2
            r2 = 2
            r1.a = r2
            r1.b = r2
            return
    }

    public mg5(defpackage.gf6 r2) {
            r1 = this;
            r1.<init>()
            r1.c = r2
            rf4 r2 = defpackage.rf4.a
            vs4 r2 = defpackage.np2.Y(r2)
            r1.d = r2
            ss4 r2 = new ss4
            r0 = 0
            r2.<init>(r0)
            r1.e = r2
            qp6 r2 = defpackage.qp6.NoRequest
            r1.f = r2
            ss4 r2 = new ss4
            r2.<init>(r0)
            r1.h = r2
            return
    }

    public void a(defpackage.wg5 r6, boolean r7) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView.l(r6)
            android.view.View r0 = r6.a
            java.lang.Object r1 = r5.h
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            yg5 r2 = r1.k1
            r3 = 0
            if (r2 == 0) goto L25
            b2 r2 = r2.j()
            boolean r4 = r2 instanceof defpackage.xg5
            if (r4 == 0) goto L21
            xg5 r2 = (defpackage.xg5) r2
            java.util.WeakHashMap r2 = r2.X
            java.lang.Object r2 = r2.remove(r0)
            b2 r2 = (defpackage.b2) r2
            goto L22
        L21:
            r2 = r3
        L22:
            defpackage.ao7.n(r0, r2)
        L25:
            if (r7 == 0) goto L5c
            java.util.ArrayList r7 = r1.n0
            int r2 = r7.size()
            if (r2 > 0) goto L50
            sg5 r7 = r1.d1
            if (r7 == 0) goto L38
            rr6 r7 = r1.f0
            r7.o(r6)
        L38:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.z1
            if (r7 == 0) goto L5c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "dispatchViewRecycled: "
            r7.<init>(r1)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.d(r1, r7)
            goto L5c
        L50:
            r5 = 0
            java.lang.Object r5 = r7.get(r5)
            r5.getClass()
            defpackage.u34.a()
            return
        L5c:
            r6.s = r3
            r6.r = r3
            lg5 r5 = r5.c()
            r5.getClass()
            int r7 = r6.f
            kg5 r1 = r5.a(r7)
            java.util.ArrayList r1 = r1.a
            android.util.SparseArray r5 = r5.a
            java.lang.Object r5 = r5.get(r7)
            kg5 r5 = (defpackage.kg5) r5
            int r5 = r5.b
            int r7 = r1.size()
            if (r5 > r7) goto L83
            defpackage.bl2.n(r0)
            return
        L83:
            boolean r5 = androidx.recyclerview.widget.RecyclerView.y1
            if (r5 == 0) goto L94
            boolean r5 = r1.contains(r6)
            if (r5 != 0) goto L8e
            goto L94
        L8e:
            java.lang.String r5 = "this scrap item already exists"
            defpackage.i.h(r5)
            return
        L94:
            r6.m()
            r1.add(r6)
            return
    }

    public int b(int r5) {
            r4 = this;
            java.lang.Object r4 = r4.h
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            sg5 r0 = r4.d1
            if (r5 < 0) goto L1b
            int r1 = r0.b()
            if (r5 >= r1) goto L1b
            boolean r0 = r0.g
            if (r0 != 0) goto L13
            return r5
        L13:
            z9 r4 = r4.d0
            r0 = 0
            int r4 = r4.g(r5, r0)
            return r4
        L1b:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "invalid position "
            java.lang.String r3 = ". State item count is "
            java.lang.StringBuilder r5 = defpackage.xg6.t(r2, r5, r3)
            int r0 = r0.b()
            r5.append(r0)
            java.lang.String r4 = r4.C()
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.<init>(r4)
            throw r1
    }

    public defpackage.lg5 c() {
            r2 = this;
            java.lang.Object r0 = r2.g
            lg5 r0 = (defpackage.lg5) r0
            if (r0 != 0) goto L25
            lg5 r0 = new lg5
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.a = r1
            r1 = 0
            r0.b = r1
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.c = r1
            r2.g = r0
            r2.g()
        L25:
            java.lang.Object r2 = r2.g
            lg5 r2 = (defpackage.lg5) r2
            return r2
    }

    public defpackage.zg6 d() {
            r0 = this;
            java.lang.Object r0 = r0.d
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Object r0 = r0.getValue()
            zg6 r0 = (defpackage.zg6) r0
            return r0
    }

    public android.view.View e(int r3) {
            r2 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            wg5 r2 = r2.o(r3, r0)
            android.view.View r2 = r2.a
            return r2
    }

    public void f() {
            r6 = this;
            java.lang.Object r0 = r6.c
            gf6 r0 = (defpackage.gf6) r0
            java.util.List r0 = r0.c()
            int r1 = r0.size()
            r2 = 0
        Ld:
            r3 = 0
            if (r2 >= r1) goto L25
            java.lang.Object r4 = r0.get(r2)
            r5 = r4
            if6 r5 = (defpackage.if6) r5
            x60 r5 = r5.d()
            boolean r5 = r5.b()
            if (r5 == 0) goto L22
            goto L26
        L22:
            int r2 = r2 + 1
            goto Ld
        L25:
            r4 = r3
        L26:
            if6 r4 = (defpackage.if6) r4
            if (r4 != 0) goto L31
            java.lang.Object r0 = r6.g
            cf6 r0 = (defpackage.cf6) r0
            if (r0 != 0) goto L31
            goto L3f
        L31:
            if (r4 == 0) goto L35
            cf6 r3 = r4.h0
        L35:
            java.lang.Object r0 = r6.g
            cf6 r0 = (defpackage.cf6) r0
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 == 0) goto L40
        L3f:
            return
        L40:
            int r0 = r6.b
            int r0 = r0 + 1
            java.lang.Object r6 = r6.h
            ss4 r6 = (defpackage.ss4) r6
            r6.i(r0)
            return
    }

    public void g() {
            r2 = this;
            java.lang.Object r0 = r2.g
            lg5 r0 = (defpackage.lg5) r0
            if (r0 == 0) goto L17
            java.lang.Object r2 = r2.h
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            wf5 r1 = r2.l0
            if (r1 == 0) goto L17
            boolean r2 = r2.r0
            if (r2 == 0) goto L17
            java.util.Set r2 = r0.c
            r2.add(r1)
        L17:
            return
    }

    public void h(defpackage.wf5 r4, boolean r5) {
            r3 = this;
            java.lang.Object r3 = r3.g
            lg5 r3 = (defpackage.lg5) r3
            if (r3 == 0) goto L41
            android.util.SparseArray r0 = r3.a
            java.util.Set r3 = r3.c
            r3.remove(r4)
            int r3 = r3.size()
            if (r3 != 0) goto L41
            if (r5 != 0) goto L41
            r3 = 0
            r4 = r3
        L17:
            int r5 = r0.size()
            if (r4 >= r5) goto L41
            int r5 = r0.keyAt(r4)
            java.lang.Object r5 = r0.get(r5)
            kg5 r5 = (defpackage.kg5) r5
            java.util.ArrayList r5 = r5.a
            r1 = r3
        L2a:
            int r2 = r5.size()
            if (r1 >= r2) goto L3e
            java.lang.Object r2 = r5.get(r1)
            wg5 r2 = (defpackage.wg5) r2
            android.view.View r2 = r2.a
            defpackage.bl2.n(r2)
            int r1 = r1 + 1
            goto L2a
        L3e:
            int r4 = r4 + 1
            goto L17
        L41:
            return
    }

    public void i() {
            r8 = this;
            java.lang.Object r0 = r8.c
            gf6 r0 = (defpackage.gf6) r0
            java.lang.Object r1 = r8.e
            ss4 r1 = (defpackage.ss4) r1
            int r2 = r1.h()
            int r3 = r8.a
            r4 = 0
            if (r2 == r3) goto L7b
            int r1 = r1.h()
            r8.a = r1
            java.lang.Object r1 = r8.f
            qp6 r1 = (defpackage.qp6) r1
            int[] r2 = defpackage.ah6.a
            int r1 = r1.ordinal()
            r1 = r2[r1]
            rf4 r2 = defpackage.rf4.a
            r3 = 1
            if (r1 == r3) goto L70
            r3 = 2
            if (r1 == r3) goto L6c
            r3 = 3
            if (r1 == r3) goto L5f
            r3 = 4
            if (r1 != r3) goto L5b
            java.util.List r1 = r0.c()
            int r3 = r1.size()
            r5 = r4
        L3a:
            if (r5 >= r3) goto L52
            java.lang.Object r6 = r1.get(r5)
            if6 r6 = (defpackage.if6) r6
            cf6 r6 = r6.h0
            java.lang.Object r7 = r8.g
            cf6 r7 = (defpackage.cf6) r7
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 == 0) goto L4f
            goto L70
        L4f:
            int r5 = r5 + 1
            goto L3a
        L52:
            zg6 r1 = r8.d()
            zg6 r2 = r1.h()
            goto L70
        L5b:
            defpackage.i.d()
            return
        L5f:
            zg6 r1 = r8.d()
            java.lang.Object r2 = r8.g
            cf6 r2 = (defpackage.cf6) r2
            zg6 r2 = r1.g(r2)
            goto L70
        L6c:
            zg6 r2 = r8.d()
        L70:
            java.lang.Object r1 = r8.d
            vs4 r1 = (defpackage.vs4) r1
            r1.setValue(r2)
            qp6 r1 = defpackage.qp6.NoRequest
            r8.f = r1
        L7b:
            java.lang.Object r1 = r8.h
            ss4 r1 = (defpackage.ss4) r1
            int r2 = r1.h()
            int r3 = r8.b
            if (r2 == r3) goto Lef
            sg6 r2 = r0.b
            boolean r2 = r2.a()
            r3 = 0
            if (r2 == 0) goto Lb7
            java.util.List r0 = r0.c()
            int r2 = r0.size()
        L98:
            if (r4 >= r2) goto Laf
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            if6 r6 = (defpackage.if6) r6
            x60 r6 = r6.d()
            boolean r6 = r6.b()
            if (r6 == 0) goto Lac
            goto Lb0
        Lac:
            int r4 = r4 + 1
            goto L98
        Laf:
            r5 = r3
        Lb0:
            if6 r5 = (defpackage.if6) r5
            if (r5 == 0) goto Ldd
            cf6 r3 = r5.h0
            goto Ldd
        Lb7:
            java.util.List r0 = r0.b()
            int r2 = r0.size()
        Lbf:
            if (r4 >= r2) goto Ld6
            java.lang.Object r5 = r0.get(r4)
            r6 = r5
            if6 r6 = (defpackage.if6) r6
            x60 r6 = r6.d()
            boolean r6 = r6.b()
            if (r6 == 0) goto Ld3
            goto Ld7
        Ld3:
            int r4 = r4 + 1
            goto Lbf
        Ld6:
            r5 = r3
        Ld7:
            if6 r5 = (defpackage.if6) r5
            if (r5 == 0) goto Ldd
            cf6 r3 = r5.h0
        Ldd:
            java.lang.Object r0 = r8.g
            cf6 r0 = (defpackage.cf6) r0
            boolean r0 = defpackage.nb3.k(r3, r0)
            if (r0 != 0) goto Le9
            r8.g = r3
        Le9:
            int r0 = r1.h()
            r8.b = r0
        Lef:
            return
    }

    public void j() {
            r2 = this;
            java.lang.Object r0 = r2.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 + (-1)
        La:
            if (r1 < 0) goto L12
            r2.k(r1)
            int r1 = r1 + (-1)
            goto La
        L12:
            r0.clear()
            boolean r0 = androidx.recyclerview.widget.RecyclerView.D1
            if (r0 == 0) goto L2c
            java.lang.Object r2 = r2.h
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            ls0 r2 = r2.c1
            java.lang.Object r0 = r2.e
            int[] r0 = (int[]) r0
            if (r0 == 0) goto L29
            r1 = -1
            java.util.Arrays.fill(r0, r1)
        L29:
            r0 = 0
            r2.d = r0
        L2c:
            return
    }

    public void k(int r6) {
            r5 = this;
            java.lang.Object r0 = r5.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r1 = androidx.recyclerview.widget.RecyclerView.z1
            java.lang.String r2 = "RecyclerView"
            if (r1 == 0) goto L1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Recycling cached view at index "
            r1.<init>(r3)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1b:
            java.lang.Object r1 = r0.get(r6)
            wg5 r1 = (defpackage.wg5) r1
            boolean r3 = androidx.recyclerview.widget.RecyclerView.z1
            if (r3 == 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CachedViewHolder to be recycled: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r2, r3)
        L36:
            r2 = 1
            r5.a(r1, r2)
            r0.remove(r6)
            return
    }

    public void l(android.view.View r4) {
            r3 = this;
            java.lang.Object r0 = r3.h
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            wg5 r1 = androidx.recyclerview.widget.RecyclerView.N(r4)
            boolean r2 = r1.j()
            if (r2 == 0) goto L12
            r2 = 0
            r0.removeDetachedView(r4, r2)
        L12:
            boolean r4 = r1.i()
            if (r4 == 0) goto L1e
            mg5 r4 = r1.n
            r4.p(r1)
            goto L2a
        L1e:
            boolean r4 = r1.p()
            if (r4 == 0) goto L2a
            int r4 = r1.j
            r4 = r4 & (-33)
            r1.j = r4
        L2a:
            r3.m(r1)
            cg5 r3 = r0.L0
            if (r3 == 0) goto L3c
            boolean r3 = r1.g()
            if (r3 != 0) goto L3c
            cg5 r3 = r0.L0
            r3.d(r1)
        L3c:
            return
    }

    public void m(defpackage.wg5 r13) {
            r12 = this;
            java.lang.Object r0 = r12.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r12.h
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            ls0 r2 = r1.c1
            boolean r3 = r13.i()
            android.view.View r4 = r13.a
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L116
            android.view.ViewParent r3 = r4.getParent()
            if (r3 == 0) goto L1c
            goto L116
        L1c:
            boolean r3 = r13.j()
            if (r3 != 0) goto L104
            boolean r3 = r13.o()
            if (r3 != 0) goto Lf6
            int r3 = r13.j
            r3 = r3 & 16
            if (r3 != 0) goto L38
            java.util.WeakHashMap r3 = defpackage.ao7.a
            boolean r3 = r4.hasTransientState()
            if (r3 == 0) goto L38
            r3 = r6
            goto L39
        L38:
            r3 = r5
        L39:
            boolean r7 = androidx.recyclerview.widget.RecyclerView.y1
            if (r7 == 0) goto L56
            boolean r7 = r0.contains(r13)
            if (r7 != 0) goto L44
            goto L56
        L44:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "cached view received recycle internal? "
            r12.<init>(r0)
            r12.append(r13)
            java.lang.String r13 = r1.C()
            defpackage.i.j(r12, r13)
            return
        L56:
            boolean r7 = r13.g()
            if (r7 == 0) goto Lce
            int r7 = r12.b
            if (r7 <= 0) goto Lc4
            int r7 = r13.j
            r7 = r7 & 526(0x20e, float:7.37E-43)
            if (r7 == 0) goto L67
            goto Lc4
        L67:
            int r7 = r0.size()
            int r8 = r12.b
            if (r7 < r8) goto L76
            if (r7 <= 0) goto L76
            r12.k(r5)
            int r7 = r7 + (-1)
        L76:
            boolean r8 = androidx.recyclerview.widget.RecyclerView.D1
            if (r8 == 0) goto Lbf
            if (r7 <= 0) goto Lbf
            int r8 = r13.c
            java.lang.Object r9 = r2.e
            int[] r9 = (int[]) r9
            if (r9 == 0) goto L97
            int r9 = r2.d
            int r9 = r9 * 2
            r10 = r5
        L89:
            if (r10 >= r9) goto L97
            java.lang.Object r11 = r2.e
            int[] r11 = (int[]) r11
            r11 = r11[r10]
            if (r11 != r8) goto L94
            goto Lbf
        L94:
            int r10 = r10 + 2
            goto L89
        L97:
            int r7 = r7 + (-1)
        L99:
            if (r7 < 0) goto Lbe
            java.lang.Object r8 = r0.get(r7)
            wg5 r8 = (defpackage.wg5) r8
            int r8 = r8.c
            java.lang.Object r9 = r2.e
            int[] r9 = (int[]) r9
            if (r9 == 0) goto Lbe
            int r9 = r2.d
            int r9 = r9 * 2
            r10 = r5
        Lae:
            if (r10 >= r9) goto Lbe
            java.lang.Object r11 = r2.e
            int[] r11 = (int[]) r11
            r11 = r11[r10]
            if (r11 != r8) goto Lbb
            int r7 = r7 + (-1)
            goto L99
        Lbb:
            int r10 = r10 + 2
            goto Lae
        Lbe:
            int r7 = r7 + r6
        Lbf:
            r0.add(r7, r13)
            r0 = r6
            goto Lc5
        Lc4:
            r0 = r5
        Lc5:
            if (r0 != 0) goto Lcc
            r12.a(r13, r6)
        Lca:
            r5 = r0
            goto Le2
        Lcc:
            r6 = r5
            goto Lca
        Lce:
            boolean r12 = androidx.recyclerview.widget.RecyclerView.z1
            if (r12 == 0) goto Le1
            java.lang.String r12 = r1.C()
            java.lang.String r0 = "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists"
            java.lang.String r12 = r0.concat(r12)
            java.lang.String r0 = "RecyclerView"
            android.util.Log.d(r0, r12)
        Le1:
            r6 = r5
        Le2:
            rr6 r12 = r1.f0
            r12.o(r13)
            if (r5 != 0) goto Lf5
            if (r6 != 0) goto Lf5
            if (r3 == 0) goto Lf5
            defpackage.bl2.n(r4)
            r12 = 0
            r13.s = r12
            r13.r = r12
        Lf5:
            return
        Lf6:
            java.lang.String r12 = r1.C()
            java.lang.String r13 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
            java.lang.String r12 = r13.concat(r12)
            defpackage.i.h(r12)
            return
        L104:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
            r12.<init>(r0)
            r12.append(r13)
            java.lang.String r13 = r1.C()
            defpackage.i.j(r12, r13)
            return
        L116:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
            r0.<init>(r2)
            boolean r13 = r13.i()
            r0.append(r13)
            java.lang.String r13 = " isAttached:"
            r0.append(r13)
            android.view.ViewParent r13 = r4.getParent()
            if (r13 == 0) goto L132
            r5 = r6
        L132:
            r0.append(r5)
            java.lang.String r13 = r1.C()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
    }

    public void n(android.view.View r4) {
            r3 = this;
            java.lang.Object r0 = r3.h
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            wg5 r4 = androidx.recyclerview.widget.RecyclerView.N(r4)
            int r1 = r4.j
            r1 = r1 & 12
            if (r1 == 0) goto Lf
            goto L4a
        Lf:
            boolean r1 = r4.k()
            if (r1 == 0) goto L4a
            cg5 r1 = r0.L0
            if (r1 == 0) goto L4a
            java.util.List r2 = r4.c()
            ke1 r1 = (defpackage.ke1) r1
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4a
            boolean r1 = r1.g
            if (r1 == 0) goto L4a
            boolean r1 = r4.f()
            if (r1 == 0) goto L30
            goto L4a
        L30:
            java.lang.Object r0 = r3.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 != 0) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.d = r0
        L3d:
            r4.n = r3
            r0 = 1
            r4.o = r0
            java.lang.Object r3 = r3.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            return
        L4a:
            boolean r1 = r4.f()
            if (r1 == 0) goto L6b
            boolean r1 = r4.h()
            if (r1 != 0) goto L6b
            wf5 r1 = r0.l0
            boolean r1 = r1.b
            if (r1 == 0) goto L5d
            goto L6b
        L5d:
            java.lang.String r3 = r0.C()
            java.lang.String r4 = "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."
            java.lang.String r3 = r4.concat(r3)
            defpackage.i.h(r3)
            return
        L6b:
            r4.n = r3
            r0 = 0
            r4.o = r0
            java.lang.Object r3 = r3.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            return
    }

    public defpackage.wg5 o(int r30, long r31) {
            r29 = this;
            r0 = r29
            r1 = r30
            java.lang.Object r2 = r0.c
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r0.e
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r0.h
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            sg5 r5 = r4.d1
            if (r1 < 0) goto L663
            int r6 = r5.b()
            if (r1 >= r6) goto L663
            boolean r6 = r5.g
            r7 = 32
            r10 = 0
            if (r6 == 0) goto La0
            java.lang.Object r6 = r0.d
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 == 0) goto L95
            int r6 = r6.size()
            if (r6 != 0) goto L2f
            goto L95
        L2f:
            r11 = r10
        L30:
            if (r11 >= r6) goto L52
            java.lang.Object r12 = r0.d
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            java.lang.Object r12 = r12.get(r11)
            wg5 r12 = (defpackage.wg5) r12
            boolean r13 = r12.p()
            if (r13 != 0) goto L4f
            int r13 = r12.b()
            if (r13 != r1) goto L4f
            r12.a(r7)
            r15 = 0
            r16 = 1
            goto L99
        L4f:
            int r11 = r11 + 1
            goto L30
        L52:
            wf5 r11 = r4.l0
            boolean r11 = r11.b
            if (r11 == 0) goto L95
            z9 r11 = r4.d0
            int r11 = r11.g(r1, r10)
            if (r11 <= 0) goto L95
            wf5 r12 = r4.l0
            int r12 = r12.a()
            if (r11 >= r12) goto L95
            wf5 r12 = r4.l0
            long r11 = r12.b(r11)
            r13 = r10
        L6f:
            if (r13 >= r6) goto L95
            java.lang.Object r14 = r0.d
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            java.lang.Object r14 = r14.get(r13)
            wg5 r14 = (defpackage.wg5) r14
            boolean r15 = r14.p()
            if (r15 != 0) goto L8f
            r15 = 0
            r16 = 1
            long r8 = r14.e
            int r8 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r8 != 0) goto L92
            r14.a(r7)
            r12 = r14
            goto L99
        L8f:
            r15 = 0
            r16 = 1
        L92:
            int r13 = r13 + 1
            goto L6f
        L95:
            r15 = 0
            r16 = 1
            r12 = r15
        L99:
            if (r12 == 0) goto L9e
            r6 = r16
            goto La5
        L9e:
            r6 = r10
            goto La5
        La0:
            r15 = 0
            r16 = 1
            r6 = r10
            r12 = r15
        La5:
            java.lang.String r8 = "RecyclerView"
            if (r12 != 0) goto L269
            int r9 = r2.size()
            r11 = r10
        Lae:
            if (r11 >= r9) goto Ldd
            java.lang.Object r12 = r2.get(r11)
            wg5 r12 = (defpackage.wg5) r12
            boolean r13 = r12.p()
            if (r13 != 0) goto Lda
            int r13 = r12.b()
            if (r13 != r1) goto Lda
            boolean r13 = r12.f()
            if (r13 != 0) goto Lda
            boolean r13 = r5.g
            if (r13 != 0) goto Ld2
            boolean r13 = r12.h()
            if (r13 != 0) goto Lda
        Ld2:
            r12.a(r7)
            r17 = r15
            r15 = r12
            goto L1cb
        Lda:
            int r11 = r11 + 1
            goto Lae
        Ldd:
            dk0 r9 = r4.e0
            java.lang.Object r9 = r9.B
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r11 = r9.size()
            r12 = r10
        Le8:
            if (r12 >= r11) goto L10f
            java.lang.Object r13 = r9.get(r12)
            android.view.View r13 = (android.view.View) r13
            wg5 r14 = androidx.recyclerview.widget.RecyclerView.N(r13)
            r17 = r15
            int r15 = r14.b()
            if (r15 != r1) goto L10a
            boolean r15 = r14.f()
            if (r15 != 0) goto L10a
            boolean r14 = r14.h()
            if (r14 != 0) goto L10a
            r15 = r13
            goto L111
        L10a:
            int r12 = r12 + 1
            r15 = r17
            goto Le8
        L10f:
            r17 = r15
        L111:
            if (r15 == 0) goto L185
            wg5 r9 = androidx.recyclerview.widget.RecyclerView.N(r15)
            dk0 r11 = r4.e0
            java.lang.Object r12 = r11.X
            kk r12 = (defpackage.kk) r12
            java.lang.Object r13 = r11.R
            uf5 r13 = (defpackage.uf5) r13
            androidx.recyclerview.widget.RecyclerView r13 = r13.A
            int r13 = r13.indexOfChild(r15)
            if (r13 < 0) goto L17f
            boolean r14 = r12.d(r13)
            if (r14 == 0) goto L179
            r12.a(r13)
            r11.z(r15)
            dk0 r11 = r4.e0
            java.lang.Object r12 = r11.X
            kk r12 = (defpackage.kk) r12
            java.lang.Object r11 = r11.R
            uf5 r11 = (defpackage.uf5) r11
            androidx.recyclerview.widget.RecyclerView r11 = r11.A
            int r11 = r11.indexOfChild(r15)
            r13 = -1
            if (r11 != r13) goto L149
            goto L14f
        L149:
            boolean r14 = r12.d(r11)
            if (r14 == 0) goto L151
        L14f:
            r11 = r13
            goto L156
        L151:
            int r12 = r12.b(r11)
            int r11 = r11 - r12
        L156:
            if (r11 == r13) goto L167
            dk0 r12 = r4.e0
            r12.k(r11)
            r0.n(r15)
            r11 = 8224(0x2020, float:1.1524E-41)
            r9.a(r11)
            r15 = r9
            goto L1cb
        L167:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "layout index should not be -1 after unhiding a view:"
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = r4.C()
            defpackage.u34.r(r0, r1)
            return r17
        L179:
            java.lang.String r0 = "trying to unhide a view that was not hidden"
            defpackage.e41.p(r15, r0)
            return r17
        L17f:
            java.lang.String r0 = "view is not a child, cannot hide "
            defpackage.e41.w(r15, r0)
            return r17
        L185:
            int r9 = r3.size()
            r11 = r10
        L18a:
            if (r11 >= r9) goto L1c9
            java.lang.Object r12 = r3.get(r11)
            r15 = r12
            wg5 r15 = (defpackage.wg5) r15
            boolean r12 = r15.f()
            if (r12 != 0) goto L1c6
            int r12 = r15.b()
            if (r12 != r1) goto L1c6
            boolean r12 = r15.d()
            if (r12 != 0) goto L1c6
            r3.remove(r11)
            boolean r9 = androidx.recyclerview.widget.RecyclerView.z1
            if (r9 == 0) goto L1cb
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "getScrapOrHiddenOrCachedHolderForPosition("
            r9.<init>(r11)
            r9.append(r1)
            java.lang.String r11 = ") found match in cache: "
            r9.append(r11)
            r9.append(r15)
            java.lang.String r9 = r9.toString()
            android.util.Log.d(r8, r9)
            goto L1cb
        L1c6:
            int r11 = r11 + 1
            goto L18a
        L1c9:
            r15 = r17
        L1cb:
            if (r15 == 0) goto L267
            boolean r9 = r15.h()
            if (r9 == 0) goto L1ed
            boolean r9 = androidx.recyclerview.widget.RecyclerView.y1
            if (r9 == 0) goto L1ea
            boolean r9 = r5.g
            if (r9 == 0) goto L1dc
            goto L1ea
        L1dc:
            java.lang.String r0 = r4.C()
            java.lang.String r1 = "should not receive a removed view unless it is pre layout"
            java.lang.String r0 = r1.concat(r0)
            defpackage.i.m(r0)
            return r17
        L1ea:
            boolean r9 = r5.g
            goto L21f
        L1ed:
            int r9 = r15.c
            if (r9 < 0) goto L24c
            wf5 r11 = r4.l0
            int r11 = r11.a()
            if (r9 >= r11) goto L24c
            boolean r9 = r5.g
            if (r9 != 0) goto L20b
            wf5 r9 = r4.l0
            int r11 = r15.c
            int r9 = r9.c(r11)
            int r11 = r15.f
            if (r9 == r11) goto L20b
        L209:
            r9 = r10
            goto L21f
        L20b:
            wf5 r9 = r4.l0
            boolean r11 = r9.b
            if (r11 == 0) goto L21d
            long r11 = r15.e
            int r13 = r15.c
            long r13 = r9.b(r13)
            int r9 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r9 != 0) goto L209
        L21d:
            r9 = r16
        L21f:
            if (r9 != 0) goto L248
            r9 = 4
            r15.a(r9)
            boolean r9 = r15.i()
            if (r9 == 0) goto L236
            android.view.View r9 = r15.a
            r4.removeDetachedView(r9, r10)
            mg5 r9 = r15.n
            r9.p(r15)
            goto L242
        L236:
            boolean r9 = r15.p()
            if (r9 == 0) goto L242
            int r9 = r15.j
            r9 = r9 & (-33)
            r15.j = r9
        L242:
            r0.m(r15)
            r12 = r17
            goto L26b
        L248:
            r12 = r15
            r6 = r16
            goto L26b
        L24c:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
            r1.<init>(r2)
            r1.append(r15)
            java.lang.String r2 = r4.C()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L267:
            r12 = r15
            goto L26b
        L269:
            r17 = r15
        L26b:
            r18 = 4
            r20 = 0
            r22 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r12 != 0) goto L44b
            z9 r9 = r4.d0
            int r9 = r9.g(r1, r10)
            if (r9 < 0) goto L429
            wf5 r11 = r4.l0
            int r11 = r11.a()
            if (r9 >= r11) goto L429
            wf5 r11 = r4.l0
            int r11 = r11.c(r9)
            wf5 r15 = r4.l0
            r24 = 3
            boolean r13 = r15.b
            if (r13 == 0) goto L334
            long r12 = r15.b(r9)
            int r14 = r2.size()
            int r14 = r14 + (-1)
        L29e:
            if (r14 < 0) goto L2fa
            java.lang.Object r15 = r2.get(r14)
            wg5 r15 = (defpackage.wg5) r15
            r26 = r8
            long r7 = r15.e
            android.view.View r10 = r15.a
            int r7 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r7 != 0) goto L2f0
            boolean r7 = r15.p()
            if (r7 != 0) goto L2f0
            int r7 = r15.f
            if (r11 != r7) goto L2d3
            r7 = 32
            r15.a(r7)
            boolean r2 = r15.h()
            if (r2 == 0) goto L2d1
            boolean r2 = r5.g
            if (r2 != 0) goto L2d1
            int r2 = r15.j
            r2 = r2 & (-15)
            r2 = r2 | 2
            r15.j = r2
        L2d1:
            r7 = r15
            goto L32a
        L2d3:
            r7 = 32
            r2.remove(r14)
            r8 = 0
            r4.removeDetachedView(r10, r8)
            wg5 r10 = androidx.recyclerview.widget.RecyclerView.N(r10)
            r15 = r17
            r10.n = r15
            r10.o = r8
            int r8 = r10.j
            r8 = r8 & (-33)
            r10.j = r8
            r0.m(r10)
            goto L2f2
        L2f0:
            r7 = 32
        L2f2:
            int r14 = r14 + (-1)
            r8 = r26
            r10 = 0
            r17 = 0
            goto L29e
        L2fa:
            r26 = r8
            int r2 = r3.size()
            int r2 = r2 + (-1)
        L302:
            if (r2 < 0) goto L323
            java.lang.Object r7 = r3.get(r2)
            wg5 r7 = (defpackage.wg5) r7
            r27 = r12
            long r12 = r7.e
            int r8 = (r12 > r27 ? 1 : (r12 == r27 ? 0 : -1))
            if (r8 != 0) goto L325
            boolean r8 = r7.d()
            if (r8 != 0) goto L325
            int r8 = r7.f
            if (r11 != r8) goto L320
            r3.remove(r2)
            goto L32a
        L320:
            r0.k(r2)
        L323:
            r7 = 0
            goto L32a
        L325:
            int r2 = r2 + (-1)
            r12 = r27
            goto L302
        L32a:
            if (r7 == 0) goto L332
            r7.c = r9
            r12 = r7
            r6 = r16
            goto L336
        L332:
            r12 = r7
            goto L336
        L334:
            r26 = r8
        L336:
            if (r12 != 0) goto L395
            boolean r2 = androidx.recyclerview.widget.RecyclerView.z1
            if (r2 == 0) goto L355
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "tryGetViewHolderForPositionByDeadline("
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = ") fetching from shared pool"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r26
            android.util.Log.d(r3, r2)
            goto L357
        L355:
            r3 = r26
        L357:
            lg5 r2 = r0.c()
            android.util.SparseArray r2 = r2.a
            java.lang.Object r2 = r2.get(r11)
            kg5 r2 = (defpackage.kg5) r2
            if (r2 == 0) goto L38b
            java.util.ArrayList r2 = r2.a
            boolean r7 = r2.isEmpty()
            if (r7 != 0) goto L38b
            int r7 = r2.size()
            int r7 = r7 + (-1)
        L373:
            if (r7 < 0) goto L38b
            java.lang.Object r8 = r2.get(r7)
            wg5 r8 = (defpackage.wg5) r8
            boolean r8 = r8.d()
            if (r8 != 0) goto L388
            java.lang.Object r2 = r2.remove(r7)
            wg5 r2 = (defpackage.wg5) r2
            goto L38c
        L388:
            int r7 = r7 + (-1)
            goto L373
        L38b:
            r2 = 0
        L38c:
            if (r2 == 0) goto L393
            r2.m()
            boolean r7 = androidx.recyclerview.widget.RecyclerView.y1
        L393:
            r12 = r2
            goto L397
        L395:
            r3 = r26
        L397:
            if (r12 != 0) goto L44d
            long r7 = r4.getNanoTime()
            int r2 = (r31 > r22 ? 1 : (r31 == r22 ? 0 : -1))
            if (r2 == 0) goto L3b7
            java.lang.Object r2 = r0.g
            lg5 r2 = (defpackage.lg5) r2
            kg5 r2 = r2.a(r11)
            long r9 = r2.c
            int r2 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r2 == 0) goto L3b7
            long r9 = r9 + r7
            int r2 = (r9 > r31 ? 1 : (r9 == r31 ? 0 : -1))
            if (r2 >= 0) goto L3b5
            goto L3b7
        L3b5:
            r15 = 0
            return r15
        L3b7:
            wf5 r2 = r4.l0
            r2.getClass()
            boolean r9 = defpackage.v87.a()     // Catch: java.lang.Throwable -> L424
            if (r9 == 0) goto L3d3
            java.lang.String r9 = "RV onCreateViewHolder type=0x%X"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L424
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L424
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch: java.lang.Throwable -> L424
            android.os.Trace.beginSection(r9)     // Catch: java.lang.Throwable -> L424
        L3d3:
            wg5 r12 = r2.f(r4, r11)     // Catch: java.lang.Throwable -> L424
            android.view.View r2 = r12.a     // Catch: java.lang.Throwable -> L424
            android.view.ViewParent r9 = r2.getParent()     // Catch: java.lang.Throwable -> L424
            if (r9 != 0) goto L41c
            r12.f = r11     // Catch: java.lang.Throwable -> L424
            android.os.Trace.endSection()
            boolean r9 = androidx.recyclerview.widget.RecyclerView.D1
            if (r9 == 0) goto L3f5
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.H(r2)
            if (r2 == 0) goto L3f5
            java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
            r9.<init>(r2)
            r12.b = r9
        L3f5:
            long r9 = r4.getNanoTime()
            java.lang.Object r2 = r0.g
            lg5 r2 = (defpackage.lg5) r2
            long r9 = r9 - r7
            kg5 r2 = r2.a(r11)
            long r7 = r2.c
            int r11 = (r7 > r20 ? 1 : (r7 == r20 ? 0 : -1))
            if (r11 != 0) goto L409
            goto L410
        L409:
            long r7 = r7 / r18
            long r7 = r7 * r24
            long r9 = r9 / r18
            long r9 = r9 + r7
        L410:
            r2.c = r9
            boolean r2 = androidx.recyclerview.widget.RecyclerView.z1
            if (r2 == 0) goto L44d
            java.lang.String r2 = "tryGetViewHolderForPositionByDeadline created new ViewHolder"
            android.util.Log.d(r3, r2)
            goto L44d
        L41c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L424
            java.lang.String r1 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L424
            throw r0     // Catch: java.lang.Throwable -> L424
        L424:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L429:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "(offset:"
            java.lang.String r3 = ").state:"
            java.lang.String r6 = "Inconsistency detected. Invalid item position "
            java.lang.StringBuilder r1 = defpackage.i61.q(r1, r9, r6, r2, r3)
            int r2 = r5.b()
            r1.append(r2)
            java.lang.String r2 = r4.C()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L44b:
            r24 = 3
        L44d:
            android.view.View r2 = r12.a
            if (r6 == 0) goto L479
            boolean r3 = r5.g
            if (r3 != 0) goto L479
            int r3 = r12.j
            r7 = r3 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L479
            r3 = r3 & (-8193(0xffffffffffffdfff, float:NaN))
            r12.j = r3
            boolean r3 = r5.j
            if (r3 == 0) goto L479
            defpackage.cg5.b(r12)
            cg5 r3 = r4.L0
            r12.c()
            r3.getClass()
            dy7 r3 = new dy7
            r3.<init>()
            r3.b(r12)
            r4.a0(r12, r3)
        L479:
            boolean r3 = r5.g
            if (r3 == 0) goto L486
            boolean r3 = r12.e()
            if (r3 == 0) goto L486
            r12.g = r1
            goto L49a
        L486:
            boolean r3 = r12.e()
            if (r3 == 0) goto L49f
            int r3 = r12.j
            r3 = r3 & 2
            if (r3 == 0) goto L493
            goto L49f
        L493:
            boolean r3 = r12.f()
            if (r3 == 0) goto L49a
            goto L49f
        L49a:
            r8 = r16
            r0 = 0
            goto L635
        L49f:
            boolean r3 = androidx.recyclerview.widget.RecyclerView.y1
            if (r3 == 0) goto L4a9
            boolean r3 = r12.h()
            if (r3 != 0) goto L4ab
        L4a9:
            r15 = 0
            goto L4be
        L4ab:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = r4.C()
            defpackage.u34.r(r0, r1)
        L4bc:
            r15 = 0
            return r15
        L4be:
            z9 r3 = r4.d0
            r8 = 0
            int r3 = r3.g(r1, r8)
            r12.s = r15
            r12.r = r4
            int r7 = r12.f
            long r9 = r4.getNanoTime()
            int r11 = (r31 > r22 ? 1 : (r31 == r22 ? 0 : -1))
            if (r11 == 0) goto L4ec
            java.lang.Object r11 = r0.g
            lg5 r11 = (defpackage.lg5) r11
            kg5 r7 = r11.a(r7)
            long r13 = r7.d
            int r7 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r7 == 0) goto L4ec
            long r13 = r13 + r9
            int r7 = (r13 > r31 ? 1 : (r13 == r31 ? 0 : -1))
            if (r7 >= 0) goto L4e7
            goto L4ec
        L4e7:
            r0 = r8
            r8 = r16
            goto L635
        L4ec:
            boolean r7 = r12.j()
            if (r7 == 0) goto L500
            int r7 = r4.getChildCount()
            android.view.ViewGroup$LayoutParams r11 = r2.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView.e(r4, r2, r7, r11)
            r7 = r16
            goto L501
        L500:
            r7 = r8
        L501:
            wf5 r11 = r4.l0
            r11.getClass()
            wf5 r13 = r12.s
            if (r13 != 0) goto L50d
            r13 = r16
            goto L50e
        L50d:
            r13 = r8
        L50e:
            if (r13 == 0) goto L540
            r12.c = r3
            boolean r14 = r11.b
            r22 = r9
            if (r14 == 0) goto L51e
            long r8 = r11.b(r3)
            r12.e = r8
        L51e:
            int r8 = r12.j
            r8 = r8 & (-520(0xfffffffffffffdf8, float:NaN))
            r8 = r8 | 1
            r12.j = r8
            boolean r8 = defpackage.v87.a()
            if (r8 == 0) goto L542
            int r8 = r12.f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r9 = "RV onBindViewHolder type=0x%X"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            android.os.Trace.beginSection(r8)
            goto L542
        L540:
            r22 = r9
        L542:
            r12.s = r11
            boolean r8 = androidx.recyclerview.widget.RecyclerView.y1
            if (r8 == 0) goto L591
            android.view.ViewParent r8 = r2.getParent()
            if (r8 != 0) goto L585
            boolean r8 = r2.isAttachedToWindow()
            boolean r9 = r12.j()
            if (r8 != r9) goto L559
            goto L585
        L559:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            boolean r1 = r12.j()
            boolean r2 = r2.isAttachedToWindow()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Temp-detached state out of sync with reality. holder.isTmpDetached(): "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = ", attached to window: "
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ", holder: "
            r3.append(r1)
            r3.append(r12)
            java.lang.String r1 = r3.toString()
            r0.<init>(r1)
            throw r0
        L585:
            android.view.ViewParent r8 = r2.getParent()
            if (r8 != 0) goto L591
            boolean r8 = r2.isAttachedToWindow()
            if (r8 != 0) goto L593
        L591:
            r15 = 0
            goto L59a
        L593:
            java.lang.String r0 = "Attempting to bind attached holder with no parent (AKA temp detached): "
            defpackage.e41.y(r12, r0)
            goto L4bc
        L59a:
            r12.c()
            r11.e(r12, r3)
            if (r13 == 0) goto L5c0
            java.util.ArrayList r3 = r12.k
            if (r3 == 0) goto L5a9
            r3.clear()
        L5a9:
            int r3 = r12.j
            r3 = r3 & (-1025(0xfffffffffffffbff, float:NaN))
            r12.j = r3
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            boolean r8 = r3 instanceof defpackage.hg5
            if (r8 == 0) goto L5bd
            hg5 r3 = (defpackage.hg5) r3
            r8 = r16
            r3.c = r8
        L5bd:
            android.os.Trace.endSection()
        L5c0:
            if (r7 == 0) goto L5c5
            androidx.recyclerview.widget.RecyclerView.f(r2, r4)
        L5c5:
            long r7 = r4.getNanoTime()
            java.lang.Object r0 = r0.g
            lg5 r0 = (defpackage.lg5) r0
            int r3 = r12.f
            long r7 = r7 - r22
            kg5 r0 = r0.a(r3)
            long r9 = r0.d
            int r3 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r3 != 0) goto L5dc
            goto L5e3
        L5dc:
            long r9 = r9 / r18
            long r9 = r9 * r24
            long r7 = r7 / r18
            long r7 = r7 + r9
        L5e3:
            r0.d = r7
            android.view.accessibility.AccessibilityManager r0 = r4.A0
            if (r0 == 0) goto L62d
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L62d
            int r0 = r2.getImportantForAccessibility()
            r8 = 1
            if (r0 != 0) goto L5f9
            r2.setImportantForAccessibility(r8)
        L5f9:
            yg5 r0 = r4.k1
            if (r0 != 0) goto L5fe
            goto L62e
        L5fe:
            b2 r0 = r0.j()
            boolean r3 = r0 instanceof defpackage.xg5
            if (r3 == 0) goto L629
            r3 = r0
            xg5 r3 = (defpackage.xg5) r3
            android.view.View$AccessibilityDelegate r7 = defpackage.ao7.e(r2)
            if (r7 != 0) goto L610
            goto L620
        L610:
            boolean r9 = r7 instanceof defpackage.a2
            if (r9 == 0) goto L61a
            a2 r7 = (defpackage.a2) r7
            b2 r7 = r7.a
            r15 = r7
            goto L620
        L61a:
            b2 r9 = new b2
            r9.<init>(r7)
            r15 = r9
        L620:
            if (r15 == 0) goto L629
            if (r15 == r3) goto L629
            java.util.WeakHashMap r3 = r3.X
            r3.put(r2, r15)
        L629:
            defpackage.ao7.n(r2, r0)
            goto L62e
        L62d:
            r8 = 1
        L62e:
            boolean r0 = r5.g
            if (r0 == 0) goto L634
            r12.g = r1
        L634:
            r0 = r8
        L635:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            if (r1 != 0) goto L645
            android.view.ViewGroup$LayoutParams r1 = r4.generateDefaultLayoutParams()
            hg5 r1 = (defpackage.hg5) r1
            r2.setLayoutParams(r1)
            goto L657
        L645:
            boolean r3 = r4.checkLayoutParams(r1)
            if (r3 != 0) goto L655
            android.view.ViewGroup$LayoutParams r1 = r4.generateLayoutParams(r1)
            hg5 r1 = (defpackage.hg5) r1
            r2.setLayoutParams(r1)
            goto L657
        L655:
            hg5 r1 = (defpackage.hg5) r1
        L657:
            r1.a = r12
            if (r6 == 0) goto L65f
            if (r0 == 0) goto L65f
            r9 = r8
            goto L660
        L65f:
            r9 = 0
        L660:
            r1.d = r9
            return r12
        L663:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "("
            java.lang.String r3 = "). Item count:"
            java.lang.String r6 = "Invalid item position "
            java.lang.StringBuilder r1 = defpackage.i61.q(r1, r1, r6, r2, r3)
            int r2 = r5.b()
            r1.append(r2)
            java.lang.String r2 = r4.C()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void p(defpackage.wg5 r2) {
            r1 = this;
            boolean r0 = r2.o
            if (r0 == 0) goto Lc
            java.lang.Object r1 = r1.d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.remove(r2)
            goto L13
        Lc:
            java.lang.Object r1 = r1.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.remove(r2)
        L13:
            r1 = 0
            r2.n = r1
            r1 = 0
            r2.o = r1
            int r1 = r2.j
            r1 = r1 & (-33)
            r2.j = r1
            return
    }

    public void q() {
            r4 = this;
            java.lang.Object r0 = r4.e
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r4.h
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            gg5 r1 = r1.m0
            if (r1 == 0) goto Lf
            int r1 = r1.j
            goto L10
        Lf:
            r1 = 0
        L10:
            int r2 = r4.a
            int r2 = r2 + r1
            r4.b = r2
            int r1 = r0.size()
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L2b
            int r2 = r0.size()
            int r3 = r4.b
            if (r2 <= r3) goto L2b
            r4.k(r1)
            int r1 = r1 + (-1)
            goto L1b
        L2b:
            return
    }
}
