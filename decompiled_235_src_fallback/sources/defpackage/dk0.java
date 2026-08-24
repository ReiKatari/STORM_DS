package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk0  reason: default package */
/* loaded from: classes.dex */
public final class dk0 implements defpackage.dx6 {
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public int L;
    public java.lang.Object R;
    public java.lang.Object X;
    public java.lang.Object Y;

    public dk0(int r1) {
            r0 = this;
            r0.A = r1
            switch(r1) {
                case 5: goto L26;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.R = r1
            da4 r1 = defpackage.da4.d()
            r0.X = r1
            r1 = -1
            r0.L = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.B = r1
            sa4 r1 = defpackage.sa4.a()
            r0.Y = r1
            return
        L26:
            r0.<init>()
            return
    }

    public dk0(java.lang.Class r4, java.lang.Class[] r5) {
            r3 = this;
            r0 = 2
            r3.A = r0
            r3.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r3.R = r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r3.X = r1
            r1 = 0
            r3.L = r1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.Y = r2
            r0.add(r4)
            int r4 = r5.length
        L22:
            if (r1 >= r4) goto L2e
            r0 = r5[r1]
            java.lang.String r2 = "Null interface"
            defpackage.ln2.k(r0, r2)
            int r1 = r1 + 1
            goto L22
        L2e:
            java.lang.Object r3 = r3.R
            java.util.HashSet r3 = (java.util.HashSet) r3
            java.util.Collections.addAll(r3, r5)
            return
    }

    public dk0(defpackage.mc4 r2) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r1.<init>()
            r1.R = r2
            un6 r2 = new un6
            r0 = 0
            r2.<init>(r0)
            r1.X = r2
            return
    }

    public dk0(defpackage.p87 r2, defpackage.qx r3, java.lang.Iterable r4, defpackage.fz r5, int r6) {
            r1 = this;
            r0 = 6
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.X = r3
            r1.B = r4
            r1.Y = r5
            r1.L = r6
            return
    }

    public dk0(defpackage.uf5 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r0 = 0
            r1.L = r0
            r1.R = r2
            kk r2 = new kk
            r2.<init>()
            r1.X = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.B = r2
            return
    }

    public dk0(defpackage.xc0 r2) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.R = r2
            uw r2 = defpackage.ht2.a
            r2.getClass()
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.uw.b
            int r2 = r0.incrementAndGet(r2)
            r1.L = r2
            r2 = 0
            sw r2 = defpackage.g04.s(r2)
            r1.X = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.B = r2
            d51 r2 = new d51
            r0 = 26
            r2.<init>(r1, r0)
            r1.Y = r2
            return
    }

    public void a() {
            r10 = this;
            java.lang.Object r0 = r10.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.lang.Object r1 = r10.B     // Catch: java.lang.Throwable -> Lc5
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> Lc5
            java.util.List r1 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r2 = r10.B     // Catch: java.lang.Throwable -> Lc5
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lc5
            r2.clear()     // Catch: java.lang.Throwable -> Lc5
            monitor-exit(r0)
            java.util.Iterator r0 = r1.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9e
            java.lang.Object r1 = r0.next()
            vc0 r1 = (defpackage.vc0) r1
            java.lang.String r2 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r2)
            java.util.ArrayList r2 = r1.d
            int r2 = r2.size()
            r3 = 0
            r4 = r3
        L32:
            if (r4 >= r2) goto L5a
            java.util.ArrayList r5 = r1.d
            java.lang.Object r5 = r5.get(r4)
            yk5 r5 = (defpackage.yk5) r5
            java.util.List r6 = r1.e
            int r6 = r6.size()
            r7 = r3
        L43:
            if (r7 >= r6) goto L57
            java.util.List r8 = r1.e
            java.lang.Object r8 = r8.get(r7)
            jk5 r8 = (defpackage.jk5) r8
            kk5 r9 = r5.c0()
            r8.N(r9)
            int r7 = r7 + 1
            goto L43
        L57:
            int r4 = r4 + 1
            goto L32
        L5a:
            android.os.Trace.endSection()
            java.lang.String r2 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r2)
            java.util.ArrayList r2 = r1.d
            int r2 = r2.size()
            r4 = r3
        L69:
            if (r4 >= r2) goto L99
            java.util.ArrayList r5 = r1.d
            java.lang.Object r5 = r5.get(r4)
            yk5 r5 = (defpackage.yk5) r5
            kk5 r6 = r5.c0()
            java.util.List r6 = r6.d
            int r6 = r6.size()
            r7 = r3
        L7e:
            if (r7 >= r6) goto L96
            kk5 r8 = r5.c0()
            java.util.List r8 = r8.d
            java.lang.Object r8 = r8.get(r7)
            jk5 r8 = (defpackage.jk5) r8
            kk5 r9 = r5.c0()
            r8.N(r9)
            int r7 = r7 + 1
            goto L7e
        L96:
            int r4 = r4 + 1
            goto L69
        L99:
            android.os.Trace.endSection()
            goto L19
        L9e:
            java.lang.Object r10 = r10.R
            xc0 r10 = (defpackage.xc0) r10
            java.lang.Object r0 = r10.j
            monitor-enter(r0)
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc2
            r2.<init>()     // Catch: java.lang.Throwable -> Lc2
            r2.append(r10)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r3 = "#abortCaptures"
            r2.append(r3)     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc2
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> Lc2
            me0 r10 = r10.a     // Catch: java.lang.Throwable -> Lc2
            r10.E()     // Catch: java.lang.Throwable -> Lc2
            monitor-exit(r0)
            return
        Lc2:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        Lc5:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
    }

    public void b(defpackage.wh1 r3) {
            r2 = this;
            java.lang.Class r0 = r3.a
            java.lang.Object r1 = r2.R
            java.util.HashSet r1 = (java.util.HashSet) r1
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L14
            java.lang.Object r2 = r2.X
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.add(r3)
            return
        L14:
            java.lang.String r2 = "Components are not allowed to depend on interfaces they themselves provide."
            defpackage.i.h(r2)
            return
    }

    public void c(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()
            be0 r0 = (defpackage.be0) r0
            r1.d(r0)
            goto L4
        L14:
            return
    }

    public void d(defpackage.be0 r2) {
            r1 = this;
            java.lang.Object r1 = r1.B
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto Lb
            return
        Lb:
            r1.add(r2)
            return
    }

    public void e(defpackage.yy0 r6) {
            r5 = this;
            java.util.Set r0 = r6.c()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            xx r1 = (defpackage.xx) r1
            java.lang.Object r2 = r5.X
            da4 r2 = (defpackage.da4) r2
            r3 = 0
            r2.b(r1, r3)
            java.lang.Object r2 = r6.e(r1)
            java.lang.Object r3 = r5.X
            da4 r3 = (defpackage.da4) r3
            xy0 r4 = r6.j(r1)
            r3.l(r1, r4, r2)
            goto L8
        L2c:
            return
    }

    public void f(double r5, float r7) {
            r4 = this;
            java.lang.Object r0 = r4.R
            float[] r0 = (float[]) r0
            int r0 = r0.length
            int r0 = r0 + 1
            java.lang.Object r1 = r4.X
            double[] r1 = (double[]) r1
            int r1 = java.util.Arrays.binarySearch(r1, r5)
            if (r1 >= 0) goto L14
            int r1 = -r1
            int r1 = r1 + (-1)
        L14:
            java.lang.Object r2 = r4.X
            double[] r2 = (double[]) r2
            double[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.X = r2
            java.lang.Object r2 = r4.R
            float[] r2 = (float[]) r2
            float[] r2 = java.util.Arrays.copyOf(r2, r0)
            r4.R = r2
            double[] r2 = new double[r0]
            r4.B = r2
            java.lang.Object r2 = r4.X
            double[] r2 = (double[]) r2
            int r3 = r1 + 1
            int r0 = r0 - r1
            int r0 = r0 + (-1)
            java.lang.System.arraycopy(r2, r1, r2, r3, r0)
            java.lang.Object r0 = r4.X
            double[] r0 = (double[]) r0
            r0[r1] = r5
            java.lang.Object r4 = r4.R
            float[] r4 = (float[]) r4
            r4[r1] = r7
            return
    }

    public void g(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            java.lang.Object r0 = r2.R
            uf5 r0 = (defpackage.uf5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            if (r4 >= 0) goto Ld
            int r4 = r0.getChildCount()
            goto L11
        Ld:
            int r4 = r2.r(r4)
        L11:
            java.lang.Object r1 = r2.X
            kk r1 = (defpackage.kk) r1
            r1.f(r4, r5)
            if (r5 == 0) goto L1d
            r2.u(r3)
        L1d:
            r0.addView(r3, r4)
            androidx.recyclerview.widget.RecyclerView.N(r3)
            java.util.ArrayList r2 = r0.B0
            if (r2 == 0) goto L4c
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L2d:
            if (r2 < 0) goto L4c
            java.util.ArrayList r4 = r0.B0
            java.lang.Object r4 = r4.get(r2)
            me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2 r4 = (me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2) r4
            r4.getClass()
            r3.getClass()
            androidx.recyclerview.widget.RecyclerView r5 = r4.a
            me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment r4 = r4.b
            p20 r1 = new p20
            r1.<init>(r5, r4)
            r3.setOnFocusChangeListener(r1)
            int r2 = r2 + (-1)
            goto L2d
        L4c:
            return
    }

    public void h(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
            r2 = this;
            java.lang.Object r0 = r2.R
            uf5 r0 = (defpackage.uf5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            if (r4 >= 0) goto Ld
            int r4 = r0.getChildCount()
            goto L11
        Ld:
            int r4 = r2.r(r4)
        L11:
            java.lang.Object r1 = r2.X
            kk r1 = (defpackage.kk) r1
            r1.f(r4, r6)
            if (r6 == 0) goto L1d
            r2.u(r3)
        L1d:
            wg5 r2 = androidx.recyclerview.widget.RecyclerView.N(r3)
            if (r2 == 0) goto L60
            boolean r6 = r2.j()
            if (r6 != 0) goto L42
            boolean r6 = r2.o()
            if (r6 == 0) goto L30
            goto L42
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Called attach on a child which is not detached: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r0.C()
            defpackage.i.j(r3, r2)
            return
        L42:
            boolean r6 = androidx.recyclerview.widget.RecyclerView.z1
            if (r6 == 0) goto L59
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "reAttach "
            r6.<init>(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.d(r1, r6)
        L59:
            int r6 = r2.j
            r6 = r6 & (-257(0xfffffffffffffeff, float:NaN))
            r2.j = r6
            goto L64
        L60:
            boolean r2 = androidx.recyclerview.widget.RecyclerView.y1
            if (r2 != 0) goto L68
        L64:
            androidx.recyclerview.widget.RecyclerView.a(r0, r3, r4, r5)
            return
        L68:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "No ViewHolder found for child: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r0.C()
            java.lang.String r6 = ", index: "
            r5.append(r6)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    public defpackage.ek0 i() {
            r9 = this;
            ek0 r0 = new ek0
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r2 = r9.R
            java.util.HashSet r2 = (java.util.HashSet) r2
            r1.<init>(r2)
            java.lang.Object r2 = r9.X
            da4 r2 = (defpackage.da4) r2
            go4 r2 = defpackage.go4.a(r2)
            int r3 = r9.L
            java.util.ArrayList r4 = new java.util.ArrayList
            java.lang.Object r5 = r9.B
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.<init>(r5)
            java.lang.Object r9 = r9.Y
            sa4 r9 = (defpackage.sa4) r9
            sy6 r5 = defpackage.sy6.b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            android.util.ArrayMap r6 = r9.a
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L33:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L49
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            android.util.ArrayMap r8 = r9.a
            java.lang.Object r8 = r8.get(r7)
            r5.put(r7, r8)
            goto L33
        L49:
            sy6 r9 = new sy6
            r9.<init>(r5)
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public defpackage.bv0 j() {
            r7 = this;
            java.lang.Object r0 = r7.B
            sv0 r0 = (defpackage.sv0) r0
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto L2f
            bv0 r1 = new bv0
            java.util.HashSet r2 = new java.util.HashSet
            java.lang.Object r0 = r7.R
            java.util.HashSet r0 = (java.util.HashSet) r0
            r2.<init>(r0)
            java.util.HashSet r3 = new java.util.HashSet
            java.lang.Object r0 = r7.X
            java.util.HashSet r0 = (java.util.HashSet) r0
            r3.<init>(r0)
            int r4 = r7.L
            java.lang.Object r0 = r7.B
            r5 = r0
            sv0 r5 = (defpackage.sv0) r5
            java.lang.Object r7 = r7.Y
            r6 = r7
            java.util.HashSet r6 = (java.util.HashSet) r6
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        L2f:
            java.lang.String r7 = "Missing required property: factory."
            defpackage.i.m(r7)
            r7 = 0
            return r7
    }

    public void k(int r4) {
            r3 = this;
            int r4 = r3.r(r4)
            java.lang.Object r0 = r3.X
            kk r0 = (defpackage.kk) r0
            r0.h(r4)
            java.lang.Object r3 = r3.R
            uf5 r3 = (defpackage.uf5) r3
            androidx.recyclerview.widget.RecyclerView r3 = r3.A
            android.view.View r0 = r3.getChildAt(r4)
            if (r0 == 0) goto L59
            wg5 r0 = androidx.recyclerview.widget.RecyclerView.N(r0)
            if (r0 == 0) goto L5d
            boolean r1 = r0.j()
            if (r1 == 0) goto L3c
            boolean r1 = r0.o()
            if (r1 == 0) goto L2a
            goto L3c
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "called detach on an already detached child "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r3 = r3.C()
            defpackage.i.j(r4, r3)
            return
        L3c:
            boolean r1 = androidx.recyclerview.widget.RecyclerView.z1
            if (r1 == 0) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tmpDetach "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
        L53:
            r1 = 256(0x100, float:3.59E-43)
            r0.a(r1)
            goto L5d
        L59:
            boolean r0 = androidx.recyclerview.widget.RecyclerView.y1
            if (r0 != 0) goto L61
        L5d:
            androidx.recyclerview.widget.RecyclerView.c(r3, r4)
            return
        L61:
            java.lang.String r0 = "No view at offset "
            java.lang.String r3 = r3.C()
            defpackage.i.i(r0, r4, r3)
            return
    }

    public defpackage.ic4 l(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.R
            mc4 r0 = (defpackage.mc4) r0
            r1 = 0
            r2 = 0
            ic4 r3 = r3.o(r4, r0, r2, r1)
            return r3
    }

    public defpackage.ic4 m(java.lang.String r7, boolean r8) {
            r6 = this;
            r7.getClass()
            java.lang.Object r0 = r6.X
            un6 r0 = (defpackage.un6) r0
            r0.getClass()
            w0 r1 = new w0
            r2 = 5
            r1.<init>(r0, r2)
            qb6 r0 = defpackage.sb6.Y(r1)
            f11 r0 = (defpackage.f11) r0
            java.util.Iterator r0 = r0.iterator()
        L1a:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()
            r3 = r1
            ic4 r3 = (defpackage.ic4) r3
            z9 r4 = r3.B
            java.lang.Object r4 = r4.e
            java.lang.String r4 = (java.lang.String) r4
            r5 = 0
            boolean r4 = defpackage.xs6.Z(r4, r7, r5)
            if (r4 != 0) goto L3f
            z9 r3 = r3.B
            hc4 r3 = r3.l(r7)
            if (r3 == 0) goto L1a
            goto L3f
        L3e:
            r1 = r2
        L3f:
            ic4 r1 = (defpackage.ic4) r1
            if (r1 != 0) goto L60
            if (r8 == 0) goto L5f
            java.lang.Object r6 = r6.R
            mc4 r6 = (defpackage.mc4) r6
            mc4 r6 = r6.L
            if (r6 == 0) goto L5f
            dk0 r6 = r6.Y
            r6.getClass()
            boolean r8 = defpackage.qs6.v0(r7)
            if (r8 == 0) goto L59
            return r2
        L59:
            r8 = 1
            ic4 r6 = r6.m(r7, r8)
            return r6
        L5f:
            return r2
        L60:
            return r1
    }

    @Override // defpackage.dx6
    public java.lang.Object n() {
            r9 = this;
            java.lang.Object r0 = r9.R
            p87 r0 = (defpackage.p87) r0
            java.lang.Object r1 = r0.d
            bt r1 = (defpackage.bt) r1
            java.lang.Object r2 = r9.X
            qx r2 = (defpackage.qx) r2
            java.lang.Object r3 = r9.B
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r4 = r9.Y
            fz r4 = (defpackage.fz) r4
            int r9 = r9.L
            m00 r5 = r2.a
            m00 r6 = defpackage.m00.TRANSIENT_ERROR
            java.lang.Object r7 = r0.c
            i36 r7 = (defpackage.i36) r7
            r8 = 1
            if (r5 != r6) goto L62
            r7.getClass()
            java.util.Iterator r0 = r3.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L2f
            goto L56
        L2f:
            java.lang.String r0 = defpackage.i36.r(r3)
            java.lang.String r2 = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "
            java.lang.String r0 = r2.concat(r0)
            android.database.sqlite.SQLiteDatabase r2 = r7.e()
            r2.beginTransaction()
            android.database.sqlite.SQLiteStatement r0 = r2.compileStatement(r0)     // Catch: java.lang.Throwable -> L5d
            r0.execute()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = "DELETE FROM events WHERE num_attempts >= 16"
            android.database.sqlite.SQLiteStatement r0 = r2.compileStatement(r0)     // Catch: java.lang.Throwable -> L5d
            r0.execute()     // Catch: java.lang.Throwable -> L5d
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5d
            r2.endTransaction()
        L56:
            int r9 = r9 + r8
            r0 = 0
            r1.U(r4, r9, r0)
            goto Lda
        L5d:
            r9 = move-exception
            r2.endTransaction()
            throw r9
        L62:
            r7.getClass()
            java.util.Iterator r9 = r3.iterator()
            boolean r9 = r9.hasNext()
            if (r9 != 0) goto L70
            goto L85
        L70:
            java.lang.String r9 = defpackage.i36.r(r3)
            java.lang.String r3 = "DELETE FROM events WHERE _id in "
            java.lang.String r9 = r3.concat(r9)
            android.database.sqlite.SQLiteDatabase r3 = r7.e()
            android.database.sqlite.SQLiteStatement r9 = r3.compileStatement(r9)
            r9.execute()
        L85:
            m00 r9 = defpackage.m00.OK
            if (r5 != r9) goto L9d
            java.lang.Object r9 = r0.g
            wr0 r9 = (defpackage.wr0) r9
            long r5 = r9.a()
            long r2 = r2.b
            long r5 = r5 + r2
            kk r9 = new kk
            r0 = 3
            r9.<init>(r4, r5, r0)
            r7.k(r9)
        L9d:
            android.database.sqlite.SQLiteDatabase r9 = r7.e()
            r9.beginTransaction()
            java.lang.Long r0 = defpackage.i36.h(r9, r4)     // Catch: java.lang.Throwable -> Ldc
            if (r0 != 0) goto Lad
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> Ldc
            goto Lcb
        Lad:
            android.database.sqlite.SQLiteDatabase r2 = r7.e()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String r3 = "SELECT 1 FROM events WHERE context_id = ? LIMIT 1"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ldc
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> Ldc
            android.database.Cursor r0 = r2.rawQuery(r3, r0)     // Catch: java.lang.Throwable -> Ldc
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> Lde
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lde
            r0.close()     // Catch: java.lang.Throwable -> Ldc
            r0 = r2
        Lcb:
            r9.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Ldc
            r9.endTransaction()
            boolean r9 = r0.booleanValue()
            if (r9 == 0) goto Lda
            r1.U(r4, r8, r8)
        Lda:
            r9 = 0
            return r9
        Ldc:
            r0 = move-exception
            goto Le3
        Lde:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Ldc
            throw r1     // Catch: java.lang.Throwable -> Ldc
        Le3:
            r9.endTransaction()
            throw r0
    }

    public defpackage.ic4 o(int r6, defpackage.ic4 r7, defpackage.ic4 r8, boolean r9) {
            r5 = this;
            java.lang.Object r0 = r5.R
            mc4 r0 = (defpackage.mc4) r0
            java.lang.Object r5 = r5.X
            un6 r5 = (defpackage.un6) r5
            java.lang.Object r1 = r5.c(r6)
            ic4 r1 = (defpackage.ic4) r1
            r2 = 0
            if (r8 == 0) goto L24
            boolean r3 = defpackage.nb3.k(r1, r8)
            if (r3 == 0) goto L22
            mc4 r3 = r1.L
            mc4 r4 = r8.L
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 == 0) goto L22
            return r1
        L22:
            r1 = r2
            goto L27
        L24:
            if (r1 == 0) goto L27
            return r1
        L27:
            if (r9 == 0) goto L5e
            w0 r1 = new w0
            r3 = 5
            r1.<init>(r5, r3)
            qb6 r5 = defpackage.sb6.Y(r1)
            f11 r5 = (defpackage.f11) r5
            java.util.Iterator r5 = r5.iterator()
        L39:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5d
            java.lang.Object r1 = r5.next()
            ic4 r1 = (defpackage.ic4) r1
            boolean r3 = r1 instanceof defpackage.mc4
            if (r3 == 0) goto L59
            boolean r3 = r1.equals(r7)
            if (r3 != 0) goto L59
            mc4 r1 = (defpackage.mc4) r1
            r3 = 1
            dk0 r1 = r1.Y
            ic4 r1 = r1.o(r6, r0, r8, r3)
            goto L5a
        L59:
            r1 = r2
        L5a:
            if (r1 == 0) goto L39
            goto L5e
        L5d:
            r1 = r2
        L5e:
            if (r1 != 0) goto L77
            mc4 r5 = r0.L
            if (r5 == 0) goto L76
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L76
            mc4 r5 = r0.L
            r5.getClass()
            dk0 r5 = r5.Y
            ic4 r5 = r5.o(r6, r0, r8, r9)
            return r5
        L76:
            return r2
        L77:
            return r1
    }

    public android.view.View p(int r1) {
            r0 = this;
            int r1 = r0.r(r1)
            java.lang.Object r0 = r0.R
            uf5 r0 = (defpackage.uf5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            android.view.View r0 = r0.getChildAt(r1)
            return r0
    }

    public int q() {
            r1 = this;
            java.lang.Object r0 = r1.R
            uf5 r0 = (defpackage.uf5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            int r0 = r0.getChildCount()
            java.lang.Object r1 = r1.B
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    public int r(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.X
            kk r0 = (defpackage.kk) r0
            if (r4 >= 0) goto L7
            goto L2a
        L7:
            java.lang.Object r3 = r3.R
            uf5 r3 = (defpackage.uf5) r3
            androidx.recyclerview.widget.RecyclerView r3 = r3.A
            int r3 = r3.getChildCount()
            r1 = r4
        L12:
            if (r1 >= r3) goto L2a
            int r2 = r0.b(r1)
            int r2 = r1 - r2
            int r2 = r4 - r2
            if (r2 != 0) goto L28
        L1e:
            boolean r3 = r0.d(r1)
            if (r3 == 0) goto L27
            int r1 = r1 + 1
            goto L1e
        L27:
            return r1
        L28:
            int r1 = r1 + r2
            goto L12
        L2a:
            r3 = -1
            return r3
    }

    public android.view.View s(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.R
            uf5 r0 = (defpackage.uf5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            android.view.View r0 = r0.getChildAt(r1)
            return r0
    }

    public int t() {
            r0 = this;
            java.lang.Object r0 = r0.R
            uf5 r0 = (defpackage.uf5) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            int r0 = r0.getChildCount()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 1: goto L42;
                case 2: goto L5;
                case 3: goto L31;
                case 4: goto L5;
                case 5: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "pos ="
            r0.<init>(r1)
            java.lang.Object r1 = r2.X
            double[] r1 = (double[]) r1
            java.lang.String r1 = java.util.Arrays.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " period="
            r0.append(r1)
            java.lang.Object r2 = r2.R
            float[] r2 = (float[]) r2
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GraphRequestProcessor-"
            r0.<init>(r1)
            int r2 = r2.L
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.X
            kk r1 = (defpackage.kk) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.lang.Object r2 = r2.B
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void u(android.view.View r4) {
            r3 = this;
            java.lang.Object r0 = r3.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            java.lang.Object r3 = r3.R
            uf5 r3 = (defpackage.uf5) r3
            wg5 r4 = androidx.recyclerview.widget.RecyclerView.N(r4)
            if (r4 == 0) goto L35
            android.view.View r0 = r4.a
            androidx.recyclerview.widget.RecyclerView r3 = r3.A
            int r1 = r4.q
            r2 = -1
            if (r1 == r2) goto L1d
            r4.p = r1
            goto L23
        L1d:
            int r1 = r0.getImportantForAccessibility()
            r4.p = r1
        L23:
            boolean r1 = r3.Q()
            r2 = 4
            if (r1 == 0) goto L32
            r4.q = r2
            java.util.ArrayList r3 = r3.q1
            r3.add(r4)
            return
        L32:
            r0.setImportantForAccessibility(r2)
        L35:
            return
    }

    public defpackage.hc4 v(defpackage.hc4 r6, defpackage.m44 r7, boolean r8, defpackage.ic4 r9) {
            r5 = this;
            java.lang.Object r5 = r5.R
            mc4 r5 = (defpackage.mc4) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r5.iterator()
        Ld:
            r2 = r1
            oc4 r2 = (defpackage.oc4) r2
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L2d
            java.lang.Object r2 = r2.next()
            ic4 r2 = (defpackage.ic4) r2
            boolean r3 = defpackage.nb3.k(r2, r9)
            if (r3 != 0) goto L27
            hc4 r4 = r2.d(r7)
        L27:
            if (r4 == 0) goto Ld
            r0.add(r4)
            goto Ld
        L2d:
            java.lang.Comparable r0 = defpackage.gt0.S0(r0)
            hc4 r0 = (defpackage.hc4) r0
            mc4 r1 = r5.L
            if (r1 == 0) goto L43
            if (r8 == 0) goto L43
            boolean r8 = r1.equals(r9)
            if (r8 != 0) goto L43
            hc4 r4 = r1.f(r7, r5)
        L43:
            hc4[] r5 = new defpackage.hc4[]{r6, r0, r4}
            java.util.ArrayList r5 = defpackage.fv.C0(r5)
            java.lang.Comparable r5 = defpackage.gt0.S0(r5)
            hc4 r5 = (defpackage.hc4) r5
            return r5
    }

    public defpackage.jg7 w() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Closing "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r0)
            java.lang.Object r0 = r2.X
            sw r0 = (defpackage.sw) r0
            boolean r0 = r0.a()
            jg7 r1 = defpackage.jg7.a
            if (r0 == 0) goto L28
            java.lang.Object r2 = r2.R
            xc0 r2 = (defpackage.xc0) r2
            r2.c()
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
        L28:
            return r1
    }

    public void x() {
            r4 = this;
            java.lang.Object r4 = r4.R
            xc0 r4 = (defpackage.xc0) r4
            java.lang.Object r0 = r4.j
            monitor-enter(r0)
            java.lang.String r1 = "CXCP"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L24
            r2.<init>()     // Catch: java.lang.Throwable -> L24
            r2.append(r4)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "#stopRepeating"
            r2.append(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L24
            me0 r4 = r4.a     // Catch: java.lang.Throwable -> L24
            r4.W()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return
        L24:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
    }

    public boolean y(boolean r12, java.util.List r13, java.util.Map r14, java.util.Map r15, java.util.Map r16, java.util.List r17) {
            r11 = this;
            r14.getClass()
            r15.getClass()
            r16.getClass()
            r17.getClass()
            java.lang.Object r0 = r11.X
            sw r0 = (defpackage.sw) r0
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto L38
            java.lang.String r12 = "CXCP"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Failed to submit "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r13 = ": "
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = " is closed."
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            android.util.Log.w(r12, r11)
            return r1
        L38:
            java.lang.String r0 = "CXCP#buildCaptureSequence"
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r0 = r11.R     // Catch: java.lang.Throwable -> L4a9
            r2 = r0
            xc0 r2 = (defpackage.xc0) r2     // Catch: java.lang.Throwable -> L4a9
            java.lang.Object r0 = r11.Y     // Catch: java.lang.Throwable -> L4a9
            r8 = r0
            d51 r8 = (defpackage.d51) r8     // Catch: java.lang.Throwable -> L4a9
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r17
            vc0 r12 = r2.b(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4a9
            android.os.Trace.endSection()
            if (r12 != 0) goto L94
            boolean r12 = r13.isEmpty()
            if (r12 == 0) goto L5f
            goto L73
        L5f:
            java.util.Iterator r12 = r13.iterator()
        L63:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L73
            java.lang.Object r14 = r12.next()
            kk5 r14 = (defpackage.kk5) r14
            r14.getClass()
            goto L63
        L73:
            java.lang.String r12 = "CXCP"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Failed to submit "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r13 = ": "
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = " failed to build CaptureSequence."
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            android.util.Log.w(r12, r11)
            return r1
        L94:
            java.lang.Object r14 = r11.X
            sw r14 = (defpackage.sw) r14
            boolean r14 = r14.b()
            if (r14 == 0) goto Lbf
            java.lang.String r12 = "CXCP"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Failed to submit "
            r14.<init>(r15)
            r14.append(r13)
            java.lang.String r13 = ": "
            r14.append(r13)
            r14.append(r11)
            java.lang.String r11 = " is closed."
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            android.util.Log.w(r12, r11)
            return r1
        Lbf:
            boolean r13 = r12.b
            if (r13 != 0) goto Ld5
            java.lang.Object r13 = r11.B
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            monitor-enter(r13)
            java.lang.Object r14 = r11.B     // Catch: java.lang.Throwable -> Ld1
            java.util.ArrayList r14 = (java.util.ArrayList) r14     // Catch: java.lang.Throwable -> Ld1
            r14.add(r12)     // Catch: java.lang.Throwable -> Ld1
            monitor-exit(r13)
            goto Ld5
        Ld1:
            r0 = move-exception
            r11 = r0
            monitor-exit(r13)
            throw r11
        Ld5:
            java.lang.String r13 = "CXCP"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14.<init>()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14.append(r11)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r15 = " submitting "
            r14.append(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14.append(r12)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            android.util.Log.d(r13, r14)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r13 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.ArrayList r13 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14 = r1
        Lfa:
            if (r14 >= r13) goto L123
            java.util.ArrayList r15 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r15 = r15.get(r14)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            yk5 r15 = (defpackage.yk5) r15     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.List r0 = r12.e     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r2 = r1
        L10b:
            if (r2 >= r0) goto L120
            java.util.List r3 = r12.e     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            jk5 r3 = (defpackage.jk5) r3     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r3.k(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r2 = r2 + 1
            goto L10b
        L11b:
            r0 = move-exception
            r13 = r0
            r14 = r1
            goto L38d
        L120:
            int r14 = r14 + 1
            goto Lfa
        L123:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r13 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.ArrayList r13 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14 = r1
        L132:
            if (r14 >= r13) goto L15e
            java.util.ArrayList r15 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r15 = r15.get(r14)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            yk5 r15 = (defpackage.yk5) r15     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            kk5 r0 = r15.c0()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.List r0 = r0.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r2 = r1
        L147:
            if (r2 >= r0) goto L15b
            kk5 r3 = r15.c0()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.List r3 = r3.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            jk5 r3 = (defpackage.jk5) r3     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r3.k(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r2 = r2 + 1
            goto L147
        L15b:
            int r14 = r14 + 1
            goto L132
        L15e:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            monitor-enter(r12)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r13 = r11.X     // Catch: java.lang.Throwable -> L218
            sw r13 = (defpackage.sw) r13     // Catch: java.lang.Throwable -> L218
            boolean r13 = r13.b()     // Catch: java.lang.Throwable -> L218
            if (r13 == 0) goto L21c
            java.lang.String r13 = "CXCP"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L218
            r14.<init>()     // Catch: java.lang.Throwable -> L218
            java.lang.String r15 = "Failed to submit "
            r14.append(r15)     // Catch: java.lang.Throwable -> L218
            r14.append(r12)     // Catch: java.lang.Throwable -> L218
            java.lang.String r15 = ": "
            r14.append(r15)     // Catch: java.lang.Throwable -> L218
            r14.append(r11)     // Catch: java.lang.Throwable -> L218
            java.lang.String r15 = " is closed."
            r14.append(r15)     // Catch: java.lang.Throwable -> L218
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L218
            android.util.Log.w(r13, r14)     // Catch: java.lang.Throwable -> L218
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            boolean r13 = r12.b
            if (r13 != 0) goto L4a8
            java.lang.Object r13 = r11.B
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            monitor-enter(r13)
            java.lang.Object r11 = r11.B
            java.util.ArrayList r11 = (java.util.ArrayList) r11
            r11.remove(r12)
            monitor-exit(r13)
            java.lang.String r11 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r13 = r1
        L1ad:
            if (r13 >= r11) goto L1d5
            java.util.ArrayList r14 = r12.d
            java.lang.Object r14 = r14.get(r13)
            yk5 r14 = (defpackage.yk5) r14
            java.util.List r15 = r12.e
            int r15 = r15.size()
            r0 = r1
        L1be:
            if (r0 >= r15) goto L1d2
            java.util.List r2 = r12.e
            java.lang.Object r2 = r2.get(r0)
            jk5 r2 = (defpackage.jk5) r2
            kk5 r3 = r14.c0()
            r2.N(r3)
            int r0 = r0 + 1
            goto L1be
        L1d2:
            int r13 = r13 + 1
            goto L1ad
        L1d5:
            android.os.Trace.endSection()
            java.lang.String r11 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r13 = r1
        L1e4:
            if (r13 >= r11) goto L214
            java.util.ArrayList r14 = r12.d
            java.lang.Object r14 = r14.get(r13)
            yk5 r14 = (defpackage.yk5) r14
            kk5 r15 = r14.c0()
            java.util.List r15 = r15.d
            int r15 = r15.size()
            r0 = r1
        L1f9:
            if (r0 >= r15) goto L211
            kk5 r2 = r14.c0()
            java.util.List r2 = r2.d
            java.lang.Object r2 = r2.get(r0)
            jk5 r2 = (defpackage.jk5) r2
            kk5 r3 = r14.c0()
            r2.N(r3)
            int r0 = r0 + 1
            goto L1f9
        L211:
            int r13 = r13 + 1
            goto L1e4
        L214:
            android.os.Trace.endSection()
            return r1
        L218:
            r0 = move-exception
            r13 = r0
            goto L38b
        L21c:
            java.lang.String r13 = "CXCP#submit(CaptureSequence)"
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L231
            java.lang.Object r13 = r11.R     // Catch: java.lang.Throwable -> L231
            xc0 r13 = (defpackage.xc0) r13     // Catch: java.lang.Throwable -> L231
            java.lang.Integer r13 = r13.d(r12)     // Catch: java.lang.Throwable -> L231
            r14 = -1
            if (r13 == 0) goto L235
            int r13 = r13.intValue()     // Catch: java.lang.Throwable -> L231
            goto L236
        L231:
            r0 = move-exception
            r13 = r0
            goto L387
        L235:
            r13 = r14
        L236:
            java.lang.Integer r15 = java.lang.Integer.valueOf(r13)     // Catch: java.lang.Throwable -> L231
            r12.m = r15     // Catch: java.lang.Throwable -> L231
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L218
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            if (r13 == r14) goto L2d3
            java.lang.String r13 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.ArrayList r13 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14 = r1
        L24e:
            if (r14 >= r13) goto L272
            java.util.ArrayList r15 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r15 = r15.get(r14)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            yk5 r15 = (defpackage.yk5) r15     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.List r0 = r12.e     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r2 = r1
        L25f:
            if (r2 >= r0) goto L26f
            java.util.List r3 = r12.e     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            jk5 r3 = (defpackage.jk5) r3     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r3.A(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r2 = r2 + 1
            goto L25f
        L26f:
            int r14 = r14 + 1
            goto L24e
        L272:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r13 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r13)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.ArrayList r13 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r13 = r13.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14 = r1
        L281:
            if (r14 >= r13) goto L2ad
            java.util.ArrayList r15 = r12.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r15 = r15.get(r14)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            yk5 r15 = (defpackage.yk5) r15     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            kk5 r0 = r15.c0()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.List r0 = r0.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r2 = r1
        L296:
            if (r2 >= r0) goto L2aa
            kk5 r3 = r15.c0()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.util.List r3 = r3.d     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            jk5 r3 = (defpackage.jk5) r3     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r3.A(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            int r2 = r2 + 1
            goto L296
        L2aa:
            int r14 = r14 + 1
            goto L281
        L2ad:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r13 = 1
            java.lang.String r14 = "CXCP"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
            r15.<init>()     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
            r15.append(r11)     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
            java.lang.String r0 = " submitted "
            r15.append(r0)     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
            r15.append(r12)     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
            java.lang.String r15 = r15.toString()     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
            android.util.Log.d(r14, r15)     // Catch: java.lang.Throwable -> L2cc android.hardware.camera2.CameraAccessException -> L4a8
        L2ca:
            r14 = r13
            goto L2f8
        L2cc:
            r0 = move-exception
            r14 = r0
            r10 = r14
            r14 = r13
            r13 = r10
            goto L38d
        L2d3:
            java.lang.String r13 = "CXCP"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14.<init>()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r15 = "Failed to submit "
            r14.append(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14.append(r12)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r15 = ": "
            r14.append(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r14.append(r11)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r15 = " received -1 from submit."
            r14.append(r15)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            android.util.Log.w(r13, r14)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            r13 = r1
            goto L2ca
        L2f8:
            if (r14 != 0) goto L386
            boolean r14 = r12.b
            if (r14 != 0) goto L386
            java.lang.Object r14 = r11.B
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            monitor-enter(r14)
            java.lang.Object r11 = r11.B     // Catch: java.lang.Throwable -> L382
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch: java.lang.Throwable -> L382
            r11.remove(r12)     // Catch: java.lang.Throwable -> L382
            monitor-exit(r14)
            java.lang.String r11 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r14 = r1
        L317:
            if (r14 >= r11) goto L33f
            java.util.ArrayList r15 = r12.d
            java.lang.Object r15 = r15.get(r14)
            yk5 r15 = (defpackage.yk5) r15
            java.util.List r0 = r12.e
            int r0 = r0.size()
            r2 = r1
        L328:
            if (r2 >= r0) goto L33c
            java.util.List r3 = r12.e
            java.lang.Object r3 = r3.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            kk5 r4 = r15.c0()
            r3.N(r4)
            int r2 = r2 + 1
            goto L328
        L33c:
            int r14 = r14 + 1
            goto L317
        L33f:
            android.os.Trace.endSection()
            java.lang.String r11 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r14 = r1
        L34e:
            if (r14 >= r11) goto L37e
            java.util.ArrayList r15 = r12.d
            java.lang.Object r15 = r15.get(r14)
            yk5 r15 = (defpackage.yk5) r15
            kk5 r0 = r15.c0()
            java.util.List r0 = r0.d
            int r0 = r0.size()
            r2 = r1
        L363:
            if (r2 >= r0) goto L37b
            kk5 r3 = r15.c0()
            java.util.List r3 = r3.d
            java.lang.Object r3 = r3.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            kk5 r4 = r15.c0()
            r3.N(r4)
            int r2 = r2 + 1
            goto L363
        L37b:
            int r14 = r14 + 1
            goto L34e
        L37e:
            android.os.Trace.endSection()
            return r13
        L382:
            r0 = move-exception
            r11 = r0
            monitor-exit(r14)
            throw r11
        L386:
            return r13
        L387:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> L218
            throw r13     // Catch: java.lang.Throwable -> L218
        L38b:
            monitor-exit(r12)     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
            throw r13     // Catch: java.lang.Throwable -> L11b android.hardware.camera2.CameraAccessException -> L41c
        L38d:
            if (r14 != 0) goto L41b
            boolean r14 = r12.b
            if (r14 != 0) goto L41b
            java.lang.Object r14 = r11.B
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            monitor-enter(r14)
            java.lang.Object r11 = r11.B     // Catch: java.lang.Throwable -> L417
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch: java.lang.Throwable -> L417
            r11.remove(r12)     // Catch: java.lang.Throwable -> L417
            monitor-exit(r14)
            java.lang.String r11 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r14 = r1
        L3ac:
            if (r14 >= r11) goto L3d4
            java.util.ArrayList r15 = r12.d
            java.lang.Object r15 = r15.get(r14)
            yk5 r15 = (defpackage.yk5) r15
            java.util.List r0 = r12.e
            int r0 = r0.size()
            r2 = r1
        L3bd:
            if (r2 >= r0) goto L3d1
            java.util.List r3 = r12.e
            java.lang.Object r3 = r3.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            kk5 r4 = r15.c0()
            r3.N(r4)
            int r2 = r2 + 1
            goto L3bd
        L3d1:
            int r14 = r14 + 1
            goto L3ac
        L3d4:
            android.os.Trace.endSection()
            java.lang.String r11 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r14 = r1
        L3e3:
            if (r14 >= r11) goto L413
            java.util.ArrayList r15 = r12.d
            java.lang.Object r15 = r15.get(r14)
            yk5 r15 = (defpackage.yk5) r15
            kk5 r0 = r15.c0()
            java.util.List r0 = r0.d
            int r0 = r0.size()
            r2 = r1
        L3f8:
            if (r2 >= r0) goto L410
            kk5 r3 = r15.c0()
            java.util.List r3 = r3.d
            java.lang.Object r3 = r3.get(r2)
            jk5 r3 = (defpackage.jk5) r3
            kk5 r4 = r15.c0()
            r3.N(r4)
            int r2 = r2 + 1
            goto L3f8
        L410:
            int r14 = r14 + 1
            goto L3e3
        L413:
            android.os.Trace.endSection()
            goto L41b
        L417:
            r0 = move-exception
            r11 = r0
            monitor-exit(r14)
            throw r11
        L41b:
            throw r13
        L41c:
            boolean r13 = r12.b
            if (r13 != 0) goto L4a8
            java.lang.Object r13 = r11.B
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            monitor-enter(r13)
            java.lang.Object r11 = r11.B     // Catch: java.lang.Throwable -> L4a4
            java.util.ArrayList r11 = (java.util.ArrayList) r11     // Catch: java.lang.Throwable -> L4a4
            r11.remove(r12)     // Catch: java.lang.Throwable -> L4a4
            monitor-exit(r13)
            java.lang.String r11 = "InvokeInternalListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r13 = r1
        L439:
            if (r13 >= r11) goto L461
            java.util.ArrayList r14 = r12.d
            java.lang.Object r14 = r14.get(r13)
            yk5 r14 = (defpackage.yk5) r14
            java.util.List r15 = r12.e
            int r15 = r15.size()
            r0 = r1
        L44a:
            if (r0 >= r15) goto L45e
            java.util.List r2 = r12.e
            java.lang.Object r2 = r2.get(r0)
            jk5 r2 = (defpackage.jk5) r2
            kk5 r3 = r14.c0()
            r2.N(r3)
            int r0 = r0 + 1
            goto L44a
        L45e:
            int r13 = r13 + 1
            goto L439
        L461:
            android.os.Trace.endSection()
            java.lang.String r11 = "InvokeRequestListeners"
            android.os.Trace.beginSection(r11)
            java.util.ArrayList r11 = r12.d
            int r11 = r11.size()
            r13 = r1
        L470:
            if (r13 >= r11) goto L4a0
            java.util.ArrayList r14 = r12.d
            java.lang.Object r14 = r14.get(r13)
            yk5 r14 = (defpackage.yk5) r14
            kk5 r15 = r14.c0()
            java.util.List r15 = r15.d
            int r15 = r15.size()
            r0 = r1
        L485:
            if (r0 >= r15) goto L49d
            kk5 r2 = r14.c0()
            java.util.List r2 = r2.d
            java.lang.Object r2 = r2.get(r0)
            jk5 r2 = (defpackage.jk5) r2
            kk5 r3 = r14.c0()
            r2.N(r3)
            int r0 = r0 + 1
            goto L485
        L49d:
            int r13 = r13 + 1
            goto L470
        L4a0:
            android.os.Trace.endSection()
            goto L4a8
        L4a4:
            r0 = move-exception
            r11 = r0
            monitor-exit(r13)
            throw r11
        L4a8:
            return r1
        L4a9:
            r0 = move-exception
            r11 = r0
            android.os.Trace.endSection()
            throw r11
    }

    public void z(android.view.View r3) {
            r2 = this;
            java.lang.Object r0 = r2.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.R
            uf5 r2 = (defpackage.uf5) r2
            wg5 r3 = androidx.recyclerview.widget.RecyclerView.N(r3)
            if (r3 == 0) goto L2e
            androidx.recyclerview.widget.RecyclerView r2 = r2.A
            int r0 = r3.p
            boolean r1 = r2.Q()
            if (r1 == 0) goto L26
            r3.q = r0
            java.util.ArrayList r2 = r2.q1
            r2.add(r3)
            goto L2b
        L26:
            android.view.View r2 = r3.a
            r2.setImportantForAccessibility(r0)
        L2b:
            r2 = 0
            r3.p = r2
        L2e:
            return
    }
}
