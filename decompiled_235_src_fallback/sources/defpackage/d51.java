package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d51  reason: default package */
/* loaded from: classes.dex */
public final class d51 implements defpackage.zk4, defpackage.ot, defpackage.at6, defpackage.ax1, defpackage.mo2, defpackage.rb0, defpackage.aw, defpackage.so2, com.google.android.gms.tasks.OnSuccessListener {
    public final /* synthetic */ int A;
    public java.lang.Object B;

    public d51(int r2) {
            r1 = this;
            r1.A = r2
            switch(r2) {
                case 6: goto L45;
                case 7: goto L38;
                case 8: goto L2b;
                case 10: goto L17;
                case 21: goto L10;
                default: goto L5;
            }
        L5:
            r1.<init>()
            hb4 r2 = new hb4
            r2.<init>()
            r1.B = r2
            return
        L10:
            r1.<init>()
            r2 = 0
            r1.B = r2
            return
        L17:
            r1.<init>()
            y65 r2 = defpackage.si1.a
            java.lang.Class<androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk> r2 = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.class
            y65 r0 = defpackage.si1.a()
            u65 r2 = r0.b(r2)
            androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk r2 = (androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk) r2
            r1.B = r2
            return
        L2b:
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r0 = 16
            r2.<init>(r0)
            r1.B = r2
            return
        L38:
            r1.<init>()
            fn6 r2 = new fn6
            zh2 r0 = defpackage.vy7.Y
            r2.<init>(r0)
            r1.B = r2
            return
        L45:
            r1.<init>()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            android.os.Handler r2 = defpackage.uj2.u(r2)
            r1.B = r2
            return
    }

    public /* synthetic */ d51(int r1, boolean r2) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public d51(android.widget.EditText r7) {
            r6 = this;
            r0 = 15
            r6.A = r0
            r6.<init>()
            yc1 r0 = new yc1
            r0.<init>()
            r0.A = r7
            nt1 r1 = new nt1
            r1.<init>(r7)
            r0.B = r1
            r7.addTextChangedListener(r1)
            at1 r1 = defpackage.at1.b
            if (r1 != 0) goto L40
            java.lang.Object r1 = defpackage.at1.a
            monitor-enter(r1)
            at1 r2 = defpackage.at1.b     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L3c
            at1 r2 = new at1     // Catch: java.lang.Throwable -> L3a
            r2.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<at1> r4 = defpackage.at1.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch: java.lang.Throwable -> L37
            r5 = 0
            java.lang.Class r3 = java.lang.Class.forName(r3, r5, r4)     // Catch: java.lang.Throwable -> L37
            defpackage.at1.c = r3     // Catch: java.lang.Throwable -> L37
        L37:
            defpackage.at1.b = r2     // Catch: java.lang.Throwable -> L3a
            goto L3c
        L3a:
            r6 = move-exception
            goto L3e
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            goto L40
        L3e:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3a
            throw r6
        L40:
            at1 r1 = defpackage.at1.b
            r7.setEditableFactory(r1)
            r6.B = r0
            return
    }

    public d51(android.widget.TextView r2) {
            r1 = this;
            r0 = 16
            r1.A = r0
            r1.<init>()
            lt1 r0 = new lt1
            r0.<init>(r2)
            r1.B = r0
            return
    }

    public /* synthetic */ d51(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public static defpackage.ba2 j(defpackage.qu2 r7, java.util.List r8) {
            r0 = 1
            r1 = 0
            if (r8 == 0) goto Lc
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto Lc
        La:
            r2 = r1
            goto L21
        Lc:
            java.util.Iterator r2 = r8.iterator()
        L10:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La
            java.lang.Object r3 = r2.next()
            di7 r3 = (defpackage.di7) r3
            boolean r3 = r3 instanceof defpackage.d23
            if (r3 == 0) goto L10
            r2 = r0
        L21:
            if (r8 == 0) goto L2b
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L2b
        L29:
            r3 = r1
            goto L46
        L2b:
            java.util.Iterator r3 = r8.iterator()
        L2f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L29
            java.lang.Object r4 = r3.next()
            di7 r4 = (defpackage.di7) r4
            boolean r5 = r4 instanceof defpackage.p25
            if (r5 != 0) goto L45
            boolean r4 = defpackage.ej2.L(r4)
            if (r4 == 0) goto L2f
        L45:
            r3 = r0
        L46:
            if (r8 == 0) goto L50
            boolean r4 = r8.isEmpty()
            if (r4 == 0) goto L50
        L4e:
            r4 = r1
            goto L6f
        L50:
            java.util.Iterator r4 = r8.iterator()
        L54:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r4.next()
            di7 r5 = (defpackage.di7) r5
            boolean r6 = r5 instanceof defpackage.p25
            if (r6 != 0) goto L6e
            boolean r6 = r5 instanceof defpackage.r13
            if (r6 != 0) goto L6e
            boolean r5 = defpackage.ej2.L(r5)
            if (r5 == 0) goto L54
        L6e:
            r4 = r0
        L6f:
            if (r8 == 0) goto L78
            boolean r5 = r8.isEmpty()
            if (r5 == 0) goto L78
            goto L8f
        L78:
            java.util.Iterator r8 = r8.iterator()
        L7c:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L8f
            java.lang.Object r5 = r8.next()
            di7 r5 = (defpackage.di7) r5
            boolean r5 = defpackage.ej2.L(r5)
            if (r5 == 0) goto L7c
            r1 = r0
        L8f:
            da2 r8 = r7.a()
            int[] r5 = defpackage.ud1.b
            int r8 = r8.ordinal()
            r8 = r5[r8]
            r5 = 0
            if (r8 == r0) goto L133
            r2 = 2
            java.lang.String r6 = " or "
            if (r8 == r2) goto L11a
            r3 = 3
            if (r8 == r3) goto Lf9
            r3 = 4
            if (r8 == r3) goto Lbd
            r0 = 5
            if (r8 != r0) goto Lb9
            oj7 r8 = defpackage.oj7.VIDEO_CAPTURE
            java.lang.String r8 = r8.toString()
            if (r1 != 0) goto Lb6
            goto L13b
        Lb6:
            r8 = r5
            goto L13b
        Lb9:
            defpackage.i.d()
            return r5
        Lbd:
            r8 = r7
            kn7 r8 = (defpackage.kn7) r8
            in7 r8 = r8.a
            int[] r3 = defpackage.ud1.a
            int r8 = r8.ordinal()
            r8 = r3[r8]
            if (r8 == r0) goto Ld8
            if (r8 == r2) goto Lcf
            goto Lb6
        Lcf:
            oj7 r8 = defpackage.oj7.VIDEO_CAPTURE
            java.lang.String r8 = r8.toString()
            if (r1 != 0) goto Lb6
            goto L13b
        Ld8:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            oj7 r0 = defpackage.oj7.PREVIEW
            r8.append(r0)
            r8.append(r6)
            oj7 r0 = defpackage.oj7.VIDEO_CAPTURE
            r8.append(r0)
            r8.append(r6)
            oj7 r0 = defpackage.oj7.IMAGE_ANALYSIS
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            if (r4 != 0) goto Lb6
            goto L13b
        Lf9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            oj7 r0 = defpackage.oj7.PREVIEW
            r8.append(r0)
            r8.append(r6)
            oj7 r0 = defpackage.oj7.VIDEO_CAPTURE
            r8.append(r0)
            r8.append(r6)
            oj7 r0 = defpackage.oj7.IMAGE_ANALYSIS
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            if (r4 != 0) goto Lb6
            goto L13b
        L11a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            oj7 r0 = defpackage.oj7.PREVIEW
            r8.append(r0)
            r8.append(r6)
            oj7 r0 = defpackage.oj7.VIDEO_CAPTURE
            r8.append(r0)
            java.lang.String r8 = r8.toString()
            if (r3 != 0) goto Lb6
            goto L13b
        L133:
            oj7 r8 = defpackage.oj7.IMAGE_CAPTURE
            java.lang.String r8 = r8.toString()
            if (r2 != 0) goto Lb6
        L13b:
            if (r8 == 0) goto L143
            ba2 r0 = new ba2
            r0.<init>(r8, r7)
            return r0
        L143:
            return r5
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r5, defpackage.vu7 r6) {
            r4 = this;
            ru7 r5 = r6.a
            java.lang.Object r4 = r4.B
            androidx.coordinatorlayout.widget.CoordinatorLayout r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r4
            vu7 r0 = r4.m0
            boolean r0 = java.util.Objects.equals(r0, r6)
            if (r0 != 0) goto L5a
            r4.m0 = r6
            int r0 = r6.d()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L1a
            r0 = r2
            goto L1b
        L1a:
            r0 = r1
        L1b:
            r4.n0 = r0
            if (r0 != 0) goto L26
            android.graphics.drawable.Drawable r0 = r4.getBackground()
            if (r0 != 0) goto L26
            goto L27
        L26:
            r2 = r1
        L27:
            r4.setWillNotDraw(r2)
            boolean r0 = r5.r()
            if (r0 == 0) goto L31
            goto L57
        L31:
            int r0 = r4.getChildCount()
        L35:
            if (r1 >= r0) goto L57
            android.view.View r2 = r4.getChildAt(r1)
            java.util.WeakHashMap r3 = defpackage.ao7.a
            boolean r3 = r2.getFitsSystemWindows()
            if (r3 == 0) goto L54
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            h51 r2 = (defpackage.h51) r2
            e51 r2 = r2.a
            if (r2 == 0) goto L54
            boolean r2 = r5.r()
            if (r2 == 0) goto L54
            goto L57
        L54:
            int r1 = r1 + 1
            goto L35
        L57:
            r4.requestLayout()
        L5a:
            return r6
    }

    @Override // defpackage.at6
    public defpackage.d44 a(defpackage.c44 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.mo2
    public defpackage.gx3 apply(java.lang.Object r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            mo2 r0 = (defpackage.mo2) r0
            java.lang.Object r0 = r0.apply(r1)
            n33 r0 = defpackage.l.z(r0)
            return r0
    }

    @Override // defpackage.mo2
    public java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            java.lang.Object r0 = r0.B
            j9 r0 = (defpackage.j9) r0
            return r0
    }

    @Override // defpackage.at6
    public void b(int r1) {
            r0 = this;
            return
    }

    public void c(defpackage.sm3 r2) {
            r1 = this;
            boolean r0 = r2.H()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "DepthSortedSet.add called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            java.lang.Object r1 = r1.B
            fn6 r1 = (defpackage.fn6) r1
            r1.add(r2)
            return
    }

    @Override // defpackage.ax1
    public void d() {
            r0 = this;
            java.lang.Object r0 = r0.B
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            r0.finish()
            return
    }

    @Override // defpackage.ax1
    public void e(defpackage.pq5 r4) {
            r3 = this;
            r4.getClass()
            java.lang.Object r3 = r3.B
            me.magnum.melonds.ui.emulator.EmulatorActivity r3 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r3
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r3 = r3.W()
            r3.getClass()
            o41 r0 = r3.z
            u12 r1 = new u12
            r2 = 0
            r1.<init>(r3, r4, r2)
            r3 = 3
            defpackage.hv.L(r0, r2, r2, r1, r3)
            return
    }

    public defpackage.ca2 f(defpackage.qi1 r5, java.util.ArrayList r6, int r7, java.util.List r8) {
            r4 = this;
            int r0 = r6.size()
            if (r7 < r0) goto Lea
            java.lang.Object r6 = r5.e
            java.util.Set r6 = (java.util.Set) r6
            java.util.LinkedHashSet r6 = defpackage.ii2.K(r6, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getFeatureListResolvedByPriority: features = "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = ", useCases = "
            r7.append(r8)
            java.lang.Object r8 = r5.g
            java.util.List r8 = (java.util.List) r8
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "DefaultFeatureGroupResolver"
            defpackage.kj2.t(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.ht0.v0(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r6.iterator()
        L3c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r8.next()
            qu2 r0 = (defpackage.qu2) r0
            da2 r0 = r0.a()
            r7.add(r0)
            goto L3c
        L50:
            java.util.Set r7 = defpackage.gt0.o1(r7)
            java.util.List r7 = defpackage.gt0.k1(r7)
            java.util.Iterator r7 = r7.iterator()
        L5c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L90
            java.lang.Object r8 = r7.next()
            da2 r8 = (defpackage.da2) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L71:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L88
            java.lang.Object r2 = r1.next()
            r3 = r2
            qu2 r3 = (defpackage.qu2) r3
            da2 r3 = r3.a()
            if (r3 != r8) goto L71
            r0.add(r2)
            goto L71
        L88:
            int r8 = r0.size()
            r0 = 1
            if (r8 <= r0) goto L5c
            goto Le7
        L90:
            java.lang.Object r4 = r4.B
            cg0 r4 = (defpackage.cg0) r4
            il5 r7 = new il5
            r7.<init>(r6)
            java.util.Iterator r8 = r6.iterator()
        L9d:
            boolean r0 = r8.hasNext()
            java.lang.String r1 = "CameraInfoInternal"
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r8.next()
            qu2 r0 = (defpackage.qu2) r0
            boolean r2 = r0.b(r4, r5)
            if (r2 != 0) goto L9d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r5 = " is not supported."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.kj2.t(r1, r4)
            goto Le7
        Lc6:
            defpackage.oi2.V(r4, r5, r7)     // Catch: defpackage.si0 -> Ld4 java.lang.IllegalArgumentException -> Ld6
            y92 r4 = new y92
            il5 r5 = new il5
            r5.<init>(r6)
            r4.<init>(r5)
            return r4
        Ld4:
            r4 = move-exception
            goto Ld7
        Ld6:
            r4 = move-exception
        Ld7:
            java.lang.String r5 = defpackage.kj2.c0(r1)
            r6 = 3
            boolean r6 = defpackage.kj2.J(r6, r5)
            if (r6 == 0) goto Le7
            java.lang.String r6 = "CameraInfoInternal.isResolvedFeatureGroupSupported failed"
            android.util.Log.d(r5, r6, r4)
        Le7:
            z92 r4 = defpackage.z92.a
            return r4
        Lea:
            int r0 = r7 + 1
            java.lang.Object r7 = r6.get(r7)
            java.util.ArrayList r7 = defpackage.gt0.U0(r7, r8)
            ca2 r7 = r4.f(r5, r6, r0, r7)
            boolean r1 = r7 instanceof defpackage.y92
            if (r1 == 0) goto Lfd
            return r7
        Lfd:
            ca2 r4 = r4.f(r5, r6, r0, r8)
            return r4
    }

    public defpackage.pp6 g() {
            r3 = this;
            ws1 r0 = defpackage.ws1.a()
            int r1 = r0.c()
            r2 = 1
            if (r1 != r2) goto L11
            p33 r3 = new p33
            r3.<init>(r2)
            return r3
        L11:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vs4 r1 = defpackage.np2.Y(r1)
            be1 r2 = new be1
            r2.<init>(r1, r3)
            r0.h(r2)
            return r1
    }

    @Override // defpackage.at6
    public void h(defpackage.c44 r2, android.graphics.Bitmap r3, java.util.Map r4) {
            r1 = this;
            java.lang.Object r1 = r1.B
            rs7 r1 = (defpackage.rs7) r1
            int r0 = defpackage.nb3.w(r3)
            r1.g(r2, r3, r4, r0)
            return
    }

    @Override // defpackage.so2
    public void i(java.lang.Throwable r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 24: goto L15;
                case 28: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            x13 r1 = (defpackage.x13) r1
            r1.close()
            return
        Ld:
            java.lang.Object r1 = r1.B
            s23 r1 = (defpackage.s23) r1
            r1.close()
            return
        L15:
            java.lang.Object r1 = r1.B
            qb0 r1 = (defpackage.qb0) r1
            r1.c(r2)
            return
    }

    @Override // defpackage.ax1
    public void k(me.magnum.melonds.domain.model.ConsoleType r5) {
            r4 = this;
            java.lang.Object r4 = r4.B
            me.magnum.melonds.ui.emulator.EmulatorActivity r4 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r4
            int r0 = me.magnum.melonds.ui.emulator.EmulatorActivity.Z1
            sz1 r4 = r4.W()
            r4.getClass()
            as0 r0 = defpackage.to7.a(r4)
            m5 r1 = new m5
            r2 = 13
            r3 = 0
            r1.<init>(r4, r5, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    public void l() {
            r0 = this;
            java.lang.Object r0 = r0.B
            vk2 r0 = (defpackage.vk2) r0
            ll2 r0 = r0.R
            r0.P()
            return
    }

    public void m(defpackage.vc0 r2) {
            r1 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L19
            java.lang.Object r1 = r1.B
            dk0 r1 = (defpackage.dk0) r1
            java.lang.Object r0 = r1.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            monitor-enter(r0)
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L16
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L16
            r1.remove(r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            return
        L16:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L19:
            return
    }

    @Override // defpackage.ot
    public java.lang.Object n(defpackage.p76 r4, java.lang.Float r5, java.lang.Float r6, defpackage.qn2 r7, defpackage.pl6 r8) {
            r3 = this;
            float r5 = r5.floatValue()
            float r6 = r6.floatValue()
            r0 = 0
            r1 = 28
            uo r6 = defpackage.ak7.f(r0, r6, r1)
            java.lang.Object r3 = r3.B
            oc1 r3 = (defpackage.oc1) r3
            r2 = r6
            r6 = r3
            r3 = r4
            r4 = r5
            r5 = r2
            java.lang.Object r3 = defpackage.kn2.i(r3, r4, r5, r6, r7, r8)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L21
            return r3
        L21:
            qo r3 = (defpackage.qo) r3
            return r3
    }

    public boolean o(defpackage.sm3 r2) {
            r1 = this;
            boolean r0 = r2.H()
            if (r0 != 0) goto Lb
            java.lang.String r0 = "DepthSortedSet.remove called on an unattached node"
            defpackage.p53.c(r0)
        Lb:
            java.lang.Object r1 = r1.B
            fn6 r1 = (defpackage.fn6) r1
            boolean r1 = r1.remove(r2)
            return r1
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 24: goto L13;
                case 25: goto Lb;
                case 26: goto L5;
                case 27: goto L5;
                case 28: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Void r2 = (java.lang.Void) r2
            return
        L8:
            java.lang.Void r2 = (java.lang.Void) r2
            return
        Lb:
            java.lang.Object r1 = r1.B
            rp2 r1 = (defpackage.rp2) r1
            r1.g(r2)
            return
        L13:
            java.lang.Object r1 = r1.B
            qb0 r1 = (defpackage.qb0) r1
            r1.a(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r2 = move-exception
            r1.c(r2)
        L1f:
            return
    }

    @Override // defpackage.rb0
    public java.lang.Object s(defpackage.qb0 r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            to2 r2 = (defpackage.to2) r2
            qb0 r0 = r2.B
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            java.lang.String r1 = "The result can only set once!"
            defpackage.np2.A(r1, r0)
            r2.B = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "FutureChain["
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 7: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.Object r1 = r1.B
            fn6 r1 = (defpackage.fn6) r1
            java.lang.String r1 = r1.toString()
            return r1
    }
}
