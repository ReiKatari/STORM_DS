package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt  reason: default package */
/* loaded from: classes.dex */
public final class bt implements defpackage.rm6, defpackage.dx6, defpackage.ry3, defpackage.x92, defpackage.rb0, defpackage.r63, defpackage.f13 {
    public static volatile defpackage.bt X;
    public static final java.lang.Object Y = null;
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public java.lang.Object L;
    public java.lang.Object R;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.bt.Y = r0
            return
    }

    public bt(int r3) {
            r2 = this;
            r2.A = r3
            r0 = 27
            switch(r3) {
                case 4: goto L2c;
                case 15: goto L12;
                default: goto L7;
            }
        L7:
            r2.<init>()
            w31 r3 = new w31
            r3.<init>(r0)
            r2.R = r3
            return
        L12:
            r2.<init>()
            d51 r3 = new d51
            r0 = 7
            r3.<init>(r0)
            r2.B = r3
            d51 r3 = new d51
            r3.<init>(r0)
            r2.L = r3
            d51 r3 = new d51
            r3.<init>(r0)
            r2.R = r3
            return
        L2c:
            r2.<init>()
            yz3 r3 = new yz3
            r1 = 16
            r3.<init>(r1)
            r2.B = r3
            long[] r3 = defpackage.b66.a
            ja4 r3 = new ja4
            r3.<init>()
            r2.L = r3
            w31 r3 = new w31
            r3.<init>(r0)
            r2.R = r3
            return
    }

    public /* synthetic */ bt(int r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, boolean r5) {
            r0 = this;
            r0.A = r1
            r0.R = r2
            r0.B = r3
            r0.L = r4
            r0.<init>()
            return
    }

    public /* synthetic */ bt(int r1, boolean r2) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public bt(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            android.content.Context r2 = r2.getApplicationContext()
            r1.R = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.L = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.B = r2
            return
    }

    public bt(android.view.View r4) {
            r3 = this;
            r0 = 26
            r3.A = r0
            r3.<init>()
            r3.B = r4
            xr3 r0 = defpackage.xr3.NONE
            pj r1 = new pj
            r2 = 9
            r1.<init>(r3, r2)
            go3 r0 = defpackage.kj2.M(r0, r1)
            r3.L = r0
            s35 r0 = new s35
            r0.<init>(r4)
            r3.R = r0
            return
    }

    public bt(androidx.constraintlayout.widget.ConstraintLayout r1, android.widget.FrameLayout r2, androidx.appcompat.widget.Toolbar r3, android.view.View r4) {
            r0 = this;
            r1 = 2
            r0.A = r1
            r0.<init>()
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    public bt(defpackage.au3 r4) {
            r3 = this;
            r0 = 19
            r3.A = r0
            r3.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            tp6 r0 = defpackage.up6.a(r0)
            r3.B = r0
            de5 r1 = new de5
            r1.<init>(r0)
            r3.L = r1
            m80 r0 = defpackage.m80.DROP_OLDEST
            r1 = 0
            r2 = 1
            of6 r0 = defpackage.pf6.b(r1, r2, r0, r2)
            r3.R = r0
            a6 r0 = new a6
            r1 = 18
            r2 = 0
            r0.<init>(r3, r2, r1)
            r3 = 3
            defpackage.hv.L(r4, r2, r2, r0, r3)
            return
    }

    public bt(defpackage.bk1 r14) {
            r13 = this;
            r0 = 22
            r13.A = r0
            r13.<init>()
            r13.R = r14
            s62 r1 = new s62
            java.lang.Object r0 = r14.R
            v62 r0 = (defpackage.v62) r0
            rm6 r2 = r0.h()
            ui6 r3 = r2.w()
            r4 = -1
            r6 = 1
            r2 = r14
            r1.<init>(r2, r3, r4, r6)
            r13.B = r1
            t62 r7 = new t62
            rm6 r14 = r0.h()
            in6 r9 = r14.k()
            r10 = -1
            r12 = 1
            r8 = r2
            r7.<init>(r8, r9, r10, r12)
            r13.L = r7
            return
    }

    public bt(defpackage.bv1 r2, defpackage.bv1 r3) {
            r1 = this;
            r0 = 18
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.R = r2
            return
    }

    public bt(defpackage.eb r8, defpackage.x31 r9, defpackage.ae1 r10, java.util.Set r11) {
            r7 = this;
            r0 = 17
            r7.A = r0
            r7.<init>()
            r7.B = r9
            r7.L = r8
            r7.R = r10
            boolean r8 = r11.isEmpty()
            if (r8 == 0) goto L14
            goto L3d
        L14:
            java.util.Iterator r8 = r11.iterator()
        L18:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L3d
            java.lang.Object r9 = r8.next()
            int[] r9 = (int[]) r9
            java.lang.String r1 = new java.lang.String
            int r10 = r9.length
            r11 = 0
            r1.<init>(r9, r11, r10)
            gr1 r6 = new gr1
            r9 = 7
            r6.<init>(r1, r9)
            int r3 = r1.length()
            r4 = 1
            r5 = 1
            r2 = 0
            r0 = r7
            r0.Q(r1, r2, r3, r4, r5, r6)
            goto L18
        L3d:
            return
    }

    public /* synthetic */ bt(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.A = r4
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    public bt(defpackage.m21 r2) {
            r1 = this;
            r0 = 6
            r1.A = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.B = r0
            e30 r0 = new e30
            r0.<init>()
            r1.L = r0
            r1.R = r2
            return
    }

    public bt(me.magnum.melonds.ui.emulator.EmulatorActivity r3, defpackage.au3 r4, defpackage.lz0 r5) {
            r2 = this;
            r0 = 20
            r2.A = r0
            r5.getClass()
            r2.<init>()
            r2.B = r5
            bt r5 = new bt
            r5.<init>(r4)
            r2.L = r5
            java.lang.Class<android.os.Vibrator> r5 = android.os.Vibrator.class
            java.lang.Object r3 = r3.getSystemService(r5)
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            xd1 r5 = new xd1
            r0 = 7
            r1 = 0
            r5.<init>(r2, r3, r1, r0)
            r3 = 3
            defpackage.hv.L(r4, r1, r1, r5, r3)
            a6 r5 = new a6
            r0 = 17
            r5.<init>(r2, r1, r0)
            defpackage.hv.L(r4, r1, r1, r5, r3)
            return
    }

    public bt(defpackage.on2 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            ta4 r2 = new ta4
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.<init>(r0)
            r1.L = r2
            vs4 r2 = defpackage.np2.Y(r0)
            r1.R = r2
            return
    }

    public bt(defpackage.r14 r3, android.view.View r4) {
            r2 = this;
            r0 = 29
            r2.A = r0
            r2.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L13
            u14 r0 = new u14
            r0.<init>()
            goto L1e
        L13:
            r1 = 33
            if (r0 < r1) goto L1d
            s14 r0 = new s14
            r0.<init>()
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r2.B = r0
            r2.L = r3
            r2.R = r4
            return
    }

    public bt(defpackage.rm6 r2) {
            r1 = this;
            r0 = 7
            r1.A = r0
            r1.<init>()
            r1.B = r2
            in6 r0 = r2.k()
            fe5 r0 = defpackage.hi2.u(r0)
            r1.L = r0
            ui6 r2 = r2.w()
            ee5 r2 = defpackage.hi2.t(r2)
            r1.R = r2
            return
    }

    public bt(defpackage.sb1 r2, defpackage.pb1 r3) {
            r1 = this;
            r0 = 13
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public bt(defpackage.xk4 r4) {
            r3 = this;
            r0 = 28
            r3.A = r0
            pi3 r0 = new pi3
            r1 = 4
            r0.<init>(r1)
            pi3 r1 = new pi3
            r2 = 5
            r1.<init>(r2)
            r4.getClass()
            r3.<init>()
            r3.B = r4
            r3.L = r0
            r3.R = r1
            return
    }

    public bt(defpackage.zj0 r2) {
            r1 = this;
            r0 = 9
            r1.A = r0
            r1.<init>()
            r1.R = r2
            os0 r2 = new os0
            r0 = 19
            r2.<init>(r1, r0)
            r1.B = r2
            return
    }

    public static boolean C(android.text.Editable r6, android.view.KeyEvent r7, boolean r8) {
            int r7 = r7.getMetaState()
            boolean r7 = android.view.KeyEvent.metaStateHasNoModifiers(r7)
            r0 = 0
            if (r7 != 0) goto Lc
            goto L4b
        Lc:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            r2 = -1
            if (r7 == r2) goto L4b
            if (r1 == r2) goto L4b
            if (r7 == r1) goto L1c
            goto L4b
        L1c:
            java.lang.Class<se7> r2 = defpackage.se7.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            se7[] r1 = (defpackage.se7[]) r1
            if (r1 == 0) goto L4b
            int r2 = r1.length
            if (r2 <= 0) goto L4b
            int r2 = r1.length
            r3 = r0
        L2b:
            if (r3 >= r2) goto L4b
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L3b
            if (r5 == r7) goto L43
        L3b:
            if (r8 != 0) goto L3f
            if (r4 == r7) goto L43
        L3f:
            if (r7 <= r5) goto L48
            if (r7 >= r4) goto L48
        L43:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L48:
            int r3 = r3 + 1
            goto L2b
        L4b:
            return r0
    }

    public static defpackage.bt J(android.content.Context r2) {
            bt r0 = defpackage.bt.X
            if (r0 != 0) goto L19
            java.lang.Object r0 = defpackage.bt.Y
            monitor-enter(r0)
            bt r1 = defpackage.bt.X     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            bt r1 = new bt     // Catch: java.lang.Throwable -> L13
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            defpackage.bt.X = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r2 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
        L19:
            bt r2 = defpackage.bt.X
            return r2
    }

    public defpackage.fz A() {
            r3 = this;
            java.lang.Object r0 = r3.B
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L9
            java.lang.String r0 = " backendName"
            goto Lb
        L9:
            java.lang.String r0 = ""
        Lb:
            java.lang.Object r1 = r3.R
            b35 r1 = (defpackage.b35) r1
            if (r1 != 0) goto L17
            java.lang.String r1 = " priority"
            java.lang.String r0 = r0.concat(r1)
        L17:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L2f
            fz r0 = new fz
            java.lang.Object r1 = r3.B
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.L
            byte[] r2 = (byte[]) r2
            java.lang.Object r3 = r3.R
            b35 r3 = (defpackage.b35) r3
            r0.<init>(r1, r2, r3)
            return r0
        L2f:
            java.lang.String r3 = "Missing required properties:"
            java.lang.String r3 = r3.concat(r0)
            defpackage.i.m(r3)
            r3 = 0
            return r3
    }

    public boolean B(defpackage.sm3 r5) {
            r4 = this;
            sm3 r0 = r5.e0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            java.lang.Object r3 = r4.B
            d51 r3 = (defpackage.d51) r3
            java.lang.Object r3 = r3.B
            fn6 r3 = (defpackage.fn6) r3
            boolean r3 = r3.contains(r5)
            if (r3 != 0) goto L28
            java.lang.Object r4 = r4.L
            d51 r4 = (defpackage.d51) r4
            java.lang.Object r4 = r4.B
            fn6 r4 = (defpackage.fn6) r4
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L26
            goto L28
        L26:
            r4 = r1
            goto L29
        L28:
            r4 = r2
        L29:
            if (r0 != 0) goto L2e
            if (r4 == 0) goto L2e
            return r2
        L2e:
            return r1
    }

    public void D(android.os.Bundle r7) {
            r6 = this;
            java.lang.Object r0 = r6.L
            java.util.HashSet r0 = (java.util.HashSet) r0
            java.lang.Object r1 = r6.R
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131951694(0x7f13004e, float:1.953981E38)
            java.lang.String r1 = r1.getString(r2)
            if (r7 == 0) goto L60
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.ClassNotFoundException -> L59
            r2.<init>()     // Catch: java.lang.ClassNotFoundException -> L59
            java.util.Set r3 = r7.keySet()     // Catch: java.lang.ClassNotFoundException -> L59
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.ClassNotFoundException -> L59
        L1e:
            boolean r4 = r3.hasNext()     // Catch: java.lang.ClassNotFoundException -> L59
            if (r4 == 0) goto L45
            java.lang.Object r4 = r3.next()     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.ClassNotFoundException -> L59
            r5 = 0
            java.lang.String r5 = r7.getString(r4, r5)     // Catch: java.lang.ClassNotFoundException -> L59
            boolean r5 = r1.equals(r5)     // Catch: java.lang.ClassNotFoundException -> L59
            if (r5 == 0) goto L1e
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class<j53> r5 = defpackage.j53.class
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            if (r5 == 0) goto L1e
            r0.add(r4)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L1e
        L45:
            java.util.Iterator r7 = r0.iterator()     // Catch: java.lang.ClassNotFoundException -> L59
        L49:
            boolean r0 = r7.hasNext()     // Catch: java.lang.ClassNotFoundException -> L59
            if (r0 == 0) goto L60
            java.lang.Object r0 = r7.next()     // Catch: java.lang.ClassNotFoundException -> L59
            java.lang.Class r0 = (java.lang.Class) r0     // Catch: java.lang.ClassNotFoundException -> L59
            r6.F(r0, r2)     // Catch: java.lang.ClassNotFoundException -> L59
            goto L49
        L59:
            r6 = move-exception
            ug r7 = new ug
            r7.<init>(r6)
            throw r7
        L60:
            return
    }

    public void E() {
            r2 = this;
            java.lang.Object r0 = r2.R
            vs4 r0 = (defpackage.vs4) r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0.setValue(r1)
            java.lang.Object r2 = r2.L
            ta4 r2 = (defpackage.ta4) r2
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r2 = r2.c
            r2.setValue(r0)
            return
    }

    public java.lang.Object F(java.lang.Class r6, java.util.HashSet r7) {
            r5 = this;
            java.lang.Object r0 = r5.B
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.String r1 = "Cannot initialize "
            boolean r2 = defpackage.ln2.H()
            if (r2 == 0) goto L17
            java.lang.String r2 = r6.getSimpleName()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = defpackage.ln2.f0(r2)     // Catch: java.lang.Throwable -> L8e
            android.os.Trace.beginSection(r2)     // Catch: java.lang.Throwable -> L8e
        L17:
            boolean r2 = r7.contains(r6)     // Catch: java.lang.Throwable -> L8e
            if (r2 != 0) goto L73
            boolean r1 = r0.containsKey(r6)     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L6b
            r7.add(r6)     // Catch: java.lang.Throwable -> L8e
            r1 = 0
            java.lang.reflect.Constructor r2 = r6.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L64
            j53 r1 = (defpackage.j53) r1     // Catch: java.lang.Throwable -> L64
            java.util.List r2 = r1.a()     // Catch: java.lang.Throwable -> L64
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L55
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L64
        L3f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r3 == 0) goto L55
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L64
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L64
            boolean r4 = r0.containsKey(r3)     // Catch: java.lang.Throwable -> L64
            if (r4 != 0) goto L3f
            r5.F(r3, r7)     // Catch: java.lang.Throwable -> L64
            goto L3f
        L55:
            java.lang.Object r5 = r5.R     // Catch: java.lang.Throwable -> L64
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L64
            java.lang.Object r5 = r1.b(r5)     // Catch: java.lang.Throwable -> L64
            r7.remove(r6)     // Catch: java.lang.Throwable -> L64
            r0.put(r6, r5)     // Catch: java.lang.Throwable -> L64
            goto L6f
        L64:
            r5 = move-exception
            ug r6 = new ug     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8e
            throw r6     // Catch: java.lang.Throwable -> L8e
        L6b:
            java.lang.Object r5 = r0.get(r6)     // Catch: java.lang.Throwable -> L8e
        L6f:
            android.os.Trace.endSection()
            return r5
        L73:
            java.lang.String r5 = r6.getName()     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L8e
            r6.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = ". Cycle detected."
            r6.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L8e
            throw r6     // Catch: java.lang.Throwable -> L8e
        L8e:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    public defpackage.xj0 G() {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            xj0 r0 = r0.c
            return r0
    }

    public defpackage.gy3 H() {
            r7 = this;
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            java.lang.Object r1 = r7.R
            w31 r1 = (defpackage.w31) r1
            monitor-enter(r1)
            java.lang.Object r2 = r7.L     // Catch: java.lang.Throwable -> L32
            gy3 r2 = (defpackage.gy3) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L17
            java.lang.Object r3 = r7.B     // Catch: java.lang.Throwable -> L32
            android.os.LocaleList r3 = (android.os.LocaleList) r3     // Catch: java.lang.Throwable -> L32
            if (r0 != r3) goto L17
            monitor-exit(r1)
            return r2
        L17:
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L32
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L32
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L32
            r4 = 0
        L21:
            if (r4 >= r2) goto L34
            fy3 r5 = new fy3     // Catch: java.lang.Throwable -> L32
            java.util.Locale r6 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r3.add(r5)     // Catch: java.lang.Throwable -> L32
            int r4 = r4 + 1
            goto L21
        L32:
            r7 = move-exception
            goto L3f
        L34:
            gy3 r2 = new gy3     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r7.B = r0     // Catch: java.lang.Throwable -> L32
            r7.L = r2     // Catch: java.lang.Throwable -> L32
            monitor-exit(r1)
            return r2
        L3f:
            monitor-exit(r1)
            throw r7
    }

    public defpackage.qh1 I() {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            qh1 r0 = r0.a
            return r0
    }

    public defpackage.kk3 K() {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            kk3 r0 = r0.b
            return r0
    }

    public long L() {
            r2 = this;
            java.lang.Object r2 = r2.R
            zj0 r2 = (defpackage.zj0) r2
            yj0 r2 = r2.A
            long r0 = r2.d
            return r0
    }

    public boolean M() {
            r0 = this;
            java.lang.Object r0 = r0.R
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public boolean N(java.lang.CharSequence r7, int r8, int r9, defpackage.re7 r10) {
            r6 = this;
            int r0 = r10.c
            r0 = r0 & 3
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L62
            java.lang.Object r6 = r6.R
            ae1 r6 = (defpackage.ae1) r6
            p54 r0 = r10.b()
            r4 = 8
            int r4 = r0.a(r4)
            if (r4 == 0) goto L23
            java.lang.Object r5 = r0.R
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r0 = r0.A
            int r4 = r4 + r0
            r5.getShort(r4)
        L23:
            r6.getClass()
            java.lang.ThreadLocal r0 = defpackage.ae1.b
            java.lang.Object r4 = r0.get()
            if (r4 != 0) goto L36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r0.set(r4)
        L36:
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            r0.setLength(r2)
        L3f:
            if (r8 >= r9) goto L4b
            char r4 = r7.charAt(r8)
            r0.append(r4)
            int r8 = r8 + 1
            goto L3f
        L4b:
            android.text.TextPaint r6 = r6.a
            java.lang.String r7 = r0.toString()
            boolean r6 = r6.hasGlyph(r7)
            int r7 = r10.c
            r7 = r7 & 4
            if (r6 == 0) goto L5e
            r6 = r7 | 2
            goto L60
        L5e:
            r6 = r7 | 1
        L60:
            r10.c = r6
        L62:
            int r6 = r10.c
            r6 = r6 & 3
            if (r6 != r1) goto L69
            return r3
        L69:
            return r2
    }

    public boolean O() {
            r2 = this;
            java.lang.Object r0 = r2.B
            d51 r0 = (defpackage.d51) r0
            java.lang.Object r0 = r0.B
            fn6 r0 = (defpackage.fn6) r0
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.R
            d51 r0 = (defpackage.d51) r0
            java.lang.Object r0 = r0.B
            fn6 r0 = (defpackage.fn6) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2d
            java.lang.Object r2 = r2.L
            d51 r2 = (defpackage.d51) r2
            java.lang.Object r2 = r2.B
            fn6 r2 = (defpackage.fn6) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2d
            r2 = r1
            goto L2e
        L2d:
            r2 = 0
        L2e:
            r2 = r2 ^ r1
            return r2
    }

    public boolean P(int r6, defpackage.p11 r7, defpackage.l21 r8) {
            r5 = this;
            java.lang.Object r5 = r5.L
            e30 r5 = (defpackage.e30) r5
            k21[] r0 = r8.T
            int[] r1 = r8.t
            r2 = 0
            r3 = r0[r2]
            r5.a = r3
            r3 = 1
            r0 = r0[r3]
            r5.b = r0
            int r0 = r8.r()
            r5.c = r0
            int r0 = r8.l()
            r5.d = r0
            r5.i = r2
            r5.j = r6
            k21 r6 = r5.a
            k21 r0 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 != r0) goto L2a
            r6 = r3
            goto L2b
        L2a:
            r6 = r2
        L2b:
            k21 r4 = r5.b
            if (r4 != r0) goto L31
            r0 = r3
            goto L32
        L31:
            r0 = r2
        L32:
            r4 = 0
            if (r6 == 0) goto L3d
            float r6 = r8.X
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L3d
            r6 = r3
            goto L3e
        L3d:
            r6 = r2
        L3e:
            if (r0 == 0) goto L48
            float r0 = r8.X
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L48
            r0 = r3
            goto L49
        L48:
            r0 = r2
        L49:
            r4 = 4
            if (r6 == 0) goto L54
            r6 = r1[r2]
            if (r6 != r4) goto L54
            k21 r6 = defpackage.k21.FIXED
            r5.a = r6
        L54:
            if (r0 == 0) goto L5e
            r6 = r1[r3]
            if (r6 != r4) goto L5e
            k21 r6 = defpackage.k21.FIXED
            r5.b = r6
        L5e:
            r7.b(r8, r5)
            int r6 = r5.e
            r8.P(r6)
            int r6 = r5.f
            r8.M(r6)
            boolean r6 = r5.h
            r8.E = r6
            int r6 = r5.g
            r8.J(r6)
            r5.j = r2
            boolean r5 = r5.i
            return r5
    }

    public java.lang.Object Q(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21, defpackage.gt1 r22) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r22
            it1 r5 = new it1
            java.lang.Object r6 = r0.L
            eb r6 = (defpackage.eb) r6
            java.lang.Object r6 = r6.R
            r54 r6 = (defpackage.r54) r6
            r5.<init>(r6)
            int r6 = java.lang.Character.codePointAt(r17, r18)
            r7 = 0
            r8 = 1
            r9 = r6
            r10 = r7
            r11 = r8
            r6 = r18
        L22:
            r7 = r6
        L23:
            r12 = 2
            if (r6 >= r2) goto Lce
            if (r10 >= r3) goto Lce
            if (r11 == 0) goto Lce
            r54 r13 = r5.c
            android.util.SparseArray r13 = r13.a
            if (r13 != 0) goto L32
            r13 = 0
            goto L38
        L32:
            java.lang.Object r13 = r13.get(r9)
            r54 r13 = (defpackage.r54) r13
        L38:
            int r14 = r5.a
            r15 = 3
            if (r14 == r12) goto L4c
            if (r13 != 0) goto L44
            r5.a()
        L42:
            r13 = r8
            goto L8c
        L44:
            r5.a = r12
            r5.c = r13
            r5.f = r8
        L4a:
            r13 = r12
            goto L8c
        L4c:
            if (r13 == 0) goto L56
            r5.c = r13
            int r13 = r5.f
            int r13 = r13 + r8
            r5.f = r13
            goto L4a
        L56:
            r13 = 65038(0xfe0e, float:9.1138E-41)
            if (r9 != r13) goto L5f
            r5.a()
            goto L42
        L5f:
            r13 = 65039(0xfe0f, float:9.1139E-41)
            if (r9 != r13) goto L65
            goto L4a
        L65:
            r54 r13 = r5.c
            re7 r14 = r13.b
            if (r14 == 0) goto L88
            int r14 = r5.f
            if (r14 != r8) goto L82
            boolean r13 = r5.b()
            if (r13 == 0) goto L7e
            r54 r13 = r5.c
            r5.d = r13
            r5.a()
        L7c:
            r13 = r15
            goto L8c
        L7e:
            r5.a()
            goto L42
        L82:
            r5.d = r13
            r5.a()
            goto L7c
        L88:
            r5.a()
            goto L42
        L8c:
            r5.e = r9
            if (r13 == r8) goto Lbc
            if (r13 == r12) goto Lad
            if (r13 == r15) goto L95
            goto L23
        L95:
            if (r21 != 0) goto La1
            r54 r12 = r5.d
            re7 r12 = r12.b
            boolean r12 = r0.N(r1, r7, r6, r12)
            if (r12 != 0) goto L22
        La1:
            r54 r11 = r5.d
            re7 r11 = r11.b
            boolean r11 = r4.m(r1, r7, r6, r11)
            int r10 = r10 + 1
            goto L22
        Lad:
            int r12 = java.lang.Character.charCount(r9)
            int r12 = r12 + r6
            if (r12 >= r2) goto Lb9
            int r6 = java.lang.Character.codePointAt(r1, r12)
            r9 = r6
        Lb9:
            r6 = r12
            goto L23
        Lbc:
            int r6 = java.lang.Character.codePointAt(r1, r7)
            int r6 = java.lang.Character.charCount(r6)
            int r6 = r6 + r7
            if (r6 >= r2) goto L22
            int r7 = java.lang.Character.codePointAt(r1, r6)
            r9 = r7
            goto L22
        Lce:
            int r2 = r5.a
            if (r2 != r12) goto Lf9
            r54 r2 = r5.c
            re7 r2 = r2.b
            if (r2 == 0) goto Lf9
            int r2 = r5.f
            if (r2 > r8) goto Le2
            boolean r2 = r5.b()
            if (r2 == 0) goto Lf9
        Le2:
            if (r10 >= r3) goto Lf9
            if (r11 == 0) goto Lf9
            if (r21 != 0) goto Lf2
            r54 r2 = r5.c
            re7 r2 = r2.b
            boolean r0 = r0.N(r1, r7, r6, r2)
            if (r0 != 0) goto Lf9
        Lf2:
            r54 r0 = r5.c
            re7 r0 = r0.b
            r4.m(r1, r7, r6, r0)
        Lf9:
            java.lang.Object r0 = r4.d()
            return r0
    }

    public void R(java.lang.Object[] r3) {
            r2 = this;
            au6 r0 = new au6
            r0.<init>()
            java.lang.System.currentTimeMillis()
            java.lang.Object r1 = r2.L
            zt6 r1 = (defpackage.zt6) r1
            r0.a = r1
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.getName()
            r0.b = r3
            java.lang.Object r2 = r2.R
            java.util.Queue r2 = (java.util.Queue) r2
            r2.add(r0)
            return
    }

    public void S(java.lang.Object[] r4) {
            r3 = this;
            int r0 = r4.length
            r1 = 0
            if (r0 != 0) goto L5
            goto L11
        L5:
            int r0 = r4.length
            int r0 = r0 + (-1)
            r0 = r4[r0]
            boolean r2 = r0 instanceof java.lang.Throwable
            if (r2 == 0) goto L11
            r1 = r0
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L11:
            if (r1 == 0) goto L2b
            int r0 = r4.length
            if (r0 == 0) goto L25
            int r0 = r4.length
            int r0 = r0 + (-1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            if (r0 <= 0) goto L21
            r2 = 0
            java.lang.System.arraycopy(r4, r2, r1, r2, r0)
        L21:
            r3.R(r1)
            return
        L25:
            java.lang.String r3 = "non-sensical empty or null argument array"
            defpackage.i.m(r3)
            return
        L2b:
            r3.R(r4)
            return
    }

    public void T(defpackage.ex1 r2) {
            r1 = this;
            r2.getClass()
            java.lang.Object r0 = r1.R
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.remove(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L17
            java.lang.Object r1 = r1.B
            bv1 r1 = (defpackage.bv1) r1
            r1.c()
        L17:
            return
    }

    public void U(defpackage.fz r18, int r19, boolean r20) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.Object r3 = r0.L
            uy r3 = (defpackage.uy) r3
            android.content.ComponentName r4 = new android.content.ComponentName
            java.lang.Object r5 = r0.R
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Class<com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService> r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.class
            r4.<init>(r5, r6)
            java.lang.String r6 = "jobscheduler"
            java.lang.Object r6 = r5.getSystemService(r6)
            android.app.job.JobScheduler r6 = (android.app.job.JobScheduler) r6
            java.util.zip.Adler32 r7 = new java.util.zip.Adler32
            r7.<init>()
            java.lang.String r5 = r5.getPackageName()
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r9 = java.nio.charset.Charset.forName(r8)
            byte[] r5 = r5.getBytes(r9)
            r7.update(r5)
            java.lang.String r5 = r1.a
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            byte[] r8 = r5.getBytes(r8)
            r7.update(r8)
            r8 = 4
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            b35 r9 = r1.c
            int r10 = defpackage.d35.a(r9)
            java.nio.ByteBuffer r8 = r8.putInt(r10)
            byte[] r8 = r8.array()
            r7.update(r8)
            byte[] r8 = r1.b
            if (r8 == 0) goto L5d
            r7.update(r8)
        L5d:
            long r10 = r7.getValue()
            int r7 = (int) r10
            java.lang.String r10 = "JobInfoScheduler"
            java.lang.String r11 = "attemptNumber"
            if (r20 != 0) goto L92
            java.util.List r12 = r6.getAllPendingJobs()
            java.util.Iterator r12 = r12.iterator()
        L70:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L92
            java.lang.Object r13 = r12.next()
            android.app.job.JobInfo r13 = (android.app.job.JobInfo) r13
            android.os.PersistableBundle r14 = r13.getExtras()
            int r14 = r14.getInt(r11)
            int r13 = r13.getId()
            if (r13 != r7) goto L70
            if (r14 < r2) goto L92
            java.lang.String r0 = "Upload for context %s is already scheduled. Returning..."
            defpackage.nj2.l(r10, r0, r1)
            return
        L92:
            java.lang.Object r0 = r0.B
            i36 r0 = (defpackage.i36) r0
            android.database.sqlite.SQLiteDatabase r0 = r0.e()
            int r12 = defpackage.d35.a(r9)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String[] r12 = new java.lang.String[]{r5, r12}
            java.lang.String r13 = "SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?"
            android.database.Cursor r12 = r0.rawQuery(r13, r12)
            boolean r0 = r12.moveToNext()     // Catch: java.lang.Throwable -> L159
            r13 = 0
            if (r0 == 0) goto Lbc
            long r14 = r12.getLong(r13)     // Catch: java.lang.Throwable -> L159
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L159
            goto Lc2
        Lbc:
            r14 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch: java.lang.Throwable -> L159
        Lc2:
            r12.close()
            long r14 = r0.longValue()
            android.app.job.JobInfo$Builder r12 = new android.app.job.JobInfo$Builder
            r12.<init>(r7, r4)
            r4 = r6
            r16 = r7
            long r6 = r3.a(r9, r14, r2)
            r12.setMinimumLatency(r6)
            java.util.HashMap r6 = r3.b
            java.lang.Object r6 = r6.get(r9)
            vy r6 = (defpackage.vy) r6
            java.util.Set r6 = r6.c
            f66 r7 = defpackage.f66.NETWORK_UNMETERED
            boolean r7 = r6.contains(r7)
            r13 = 1
            if (r7 == 0) goto Lf0
            r7 = 2
            r12.setRequiredNetworkType(r7)
            goto Lf3
        Lf0:
            r12.setRequiredNetworkType(r13)
        Lf3:
            f66 r7 = defpackage.f66.DEVICE_CHARGING
            boolean r7 = r6.contains(r7)
            if (r7 == 0) goto Lfe
            r12.setRequiresCharging(r13)
        Lfe:
            f66 r7 = defpackage.f66.DEVICE_IDLE
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L109
            r12.setRequiresDeviceIdle(r13)
        L109:
            android.os.PersistableBundle r6 = new android.os.PersistableBundle
            r6.<init>()
            r6.putInt(r11, r2)
            java.lang.String r7 = "backendName"
            r6.putString(r7, r5)
            java.lang.String r5 = "priority"
            int r7 = defpackage.d35.a(r9)
            r6.putInt(r5, r7)
            if (r8 == 0) goto L12b
            java.lang.String r5 = "extras"
            r7 = 0
            java.lang.String r7 = android.util.Base64.encodeToString(r8, r7)
            r6.putString(r5, r7)
        L12b:
            r12.setExtras(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)
            long r6 = r3.a(r9, r14, r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r5, r3, r0, r2}
            java.lang.String r1 = "TransportRuntime."
            java.lang.String r1 = r1.concat(r10)
            java.lang.String r2 = "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            android.util.Log.d(r1, r0)
            android.app.job.JobInfo r0 = r12.build()
            r4.schedule(r0)
            return
        L159:
            r0 = move-exception
            r12.close()
            throw r0
    }

    public void V(defpackage.xj0 r1) {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            r0.c = r1
            return
    }

    public void W(defpackage.qh1 r1) {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            r0.a = r1
            return
    }

    public void X(defpackage.kk3 r1) {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            r0.b = r1
            return
    }

    public void Y(long r1) {
            r0 = this;
            java.lang.Object r0 = r0.R
            zj0 r0 = (defpackage.zj0) r0
            yj0 r0 = r0.A
            r0.d = r1
            return
    }

    public void Z(defpackage.m21 r4, int r5, int r6, int r7) {
            r3 = this;
            r4.getClass()
            int r0 = r4.c0
            int r1 = r4.d0
            r2 = 0
            r4.c0 = r2
            r4.d0 = r2
            r4.P(r6)
            r4.M(r7)
            if (r0 >= 0) goto L17
            r4.c0 = r2
            goto L19
        L17:
            r4.c0 = r0
        L19:
            if (r1 >= 0) goto L1e
            r4.d0 = r2
            goto L20
        L1e:
            r4.d0 = r1
        L20:
            java.lang.Object r3 = r3.R
            m21 r3 = (defpackage.m21) r3
            r3.w0 = r5
            r3.V()
            return
    }

    @Override // defpackage.ry3
    public void a(java.lang.Long r2, java.lang.Long r3) {
            r1 = this;
            ot3 r0 = defpackage.ot3.ERROR
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            r1.R(r2)
            return
    }

    public void a0(defpackage.m21 r9) {
            r8 = this;
            java.lang.Object r8 = r8.B
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r8.clear()
            java.util.ArrayList r0 = r9.t0
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        Lf:
            r3 = 1
            if (r2 >= r0) goto L2c
            java.util.ArrayList r4 = r9.t0
            java.lang.Object r4 = r4.get(r2)
            l21 r4 = (defpackage.l21) r4
            k21[] r5 = r4.T
            r6 = r5[r1]
            k21 r7 = defpackage.k21.MATCH_CONSTRAINT
            if (r6 == r7) goto L26
            r3 = r5[r3]
            if (r3 != r7) goto L29
        L26:
            r8.add(r4)
        L29:
            int r2 = r2 + 1
            goto Lf
        L2c:
            ai1 r8 = r9.v0
            r8.b = r3
            return
    }

    @Override // defpackage.ry3
    public void b(java.lang.Object r1, java.lang.String r2) {
            r0 = this;
            ot3 r2 = defpackage.ot3.ERROR
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.R(r1)
            return
    }

    @Override // defpackage.r63
    public android.net.Uri c() {
            r0 = this;
            java.lang.Object r0 = r0.B
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    @Override // defpackage.rm6
    public void cancel() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 7: goto L11;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.R
            bk1 r1 = (defpackage.bk1) r1
            java.lang.Object r1 = r1.R
            v62 r1 = (defpackage.v62) r1
            r1.cancel()
            return
        L11:
            java.lang.Object r1 = r1.B
            rm6 r1 = (defpackage.rm6) r1
            r1.cancel()
            return
    }

    @Override // defpackage.ry3
    public void d(java.lang.Object r1, java.io.IOException r2) {
            r0 = this;
            ot3 r2 = defpackage.ot3.ERROR
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            r0.R(r1)
            return
    }

    @Override // defpackage.ry3
    public boolean e() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.x92
    public boolean f(defpackage.rc6 r11) {
            r10 = this;
            pf0 r0 = new pf0
            ae0 r1 = new ae0
            r1.<init>()
            ou0 r2 = new ou0
            r2.<init>()
            gr1 r3 = new gr1
            java.lang.Object r4 = r10.B
            r7 = r4
            lg0 r7 = (defpackage.lg0) r7
            r4 = r7
            qc0 r4 = (defpackage.qc0) r4
            java.lang.String r4 = r4.A
            r3.<init>(r4)
            java.lang.Object r4 = r10.R
            jh0 r4 = (defpackage.jh0) r4
            uy7 r5 = new uy7
            r5.<init>()
            zf2 r6 = new zf2
            y65 r8 = r4.a()
            r6.<init>(r8)
            r8 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r3 = 1
            zt1 r6 = defpackage.zt1.A
            r1 = 0
            r4 = 0
            r5 = 0
            r7 = r6
            r2 = r11
            of0 r11 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            xd1 r0 = new xd1
            r1 = 14
            r2 = 0
            r0.<init>(r10, r11, r2, r1)
            vt1 r10 = defpackage.vt1.A
            java.lang.Object r10 = defpackage.hv.V(r10, r0)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
    }

    @Override // defpackage.r63
    public void g() {
            r0 = this;
            return
    }

    @Override // defpackage.ry3
    public java.lang.String getName() {
            r0 = this;
            java.lang.Object r0 = r0.B
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // defpackage.r63
    public android.net.Uri h() {
            r0 = this;
            java.lang.Object r0 = r0.R
            android.net.Uri r0 = (android.net.Uri) r0
            return r0
    }

    @Override // defpackage.ry3
    public void i() {
            r1 = this;
            ot3 r0 = defpackage.ot3.ERROR
            r0 = 0
            r1.R(r0)
            return
    }

    @Override // defpackage.f13
    public java.lang.Object j(java.lang.String r9, java.lang.String r10, java.lang.String r11, defpackage.s41 r12) {
            r8 = this;
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            la r1 = new la
            r6 = 0
            r7 = 5
            r3 = r8
            r2 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = defpackage.hv.d0(r0, r1, r12)
            return r8
    }

    @Override // defpackage.rm6
    public defpackage.in6 k() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 7: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.L
            t62 r1 = (defpackage.t62) r1
            return r1
        La:
            java.lang.Object r1 = r1.L
            fe5 r1 = (defpackage.fe5) r1
            return r1
    }

    @Override // defpackage.ry3
    public void l(java.lang.Object... r2) {
            r1 = this;
            ot3 r0 = defpackage.ot3.ERROR
            r1.S(r2)
            return
    }

    @Override // defpackage.r63
    public android.content.ClipDescription m() {
            r0 = this;
            java.lang.Object r0 = r0.L
            android.content.ClipDescription r0 = (android.content.ClipDescription) r0
            return r0
    }

    @Override // defpackage.dx6
    public java.lang.Object n() {
            r9 = this;
            java.lang.Object r0 = r9.B
            ye1 r0 = (defpackage.ye1) r0
            java.lang.Object r1 = r9.L
            fz r1 = (defpackage.fz) r1
            java.lang.Object r9 = r9.R
            hy r9 = (defpackage.hy) r9
            i36 r2 = r0.d
            r2.getClass()
            b35 r3 = r1.c
            java.lang.String r4 = r9.a
            java.lang.String r5 = r1.a
            java.lang.String r6 = "TransportRuntime."
            java.lang.String r7 = "SQLiteEventStore"
            java.lang.String r6 = r6.concat(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Storing event with priority="
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r3 = ", name="
            r7.append(r3)
            r7.append(r4)
            java.lang.String r3 = " for destination "
            r7.append(r3)
            r7.append(r5)
            java.lang.String r3 = r7.toString()
            android.util.Log.d(r6, r3)
            m44 r3 = new m44
            r4 = 12
            r3.<init>(r2, r1, r9, r4)
            java.lang.Object r9 = r2.k(r3)
            java.lang.Long r9 = (java.lang.Long) r9
            r9.getClass()
            bt r9 = r0.a
            r0 = 1
            r2 = 0
            r9.U(r1, r0, r2)
            r9 = 0
            return r9
    }

    @Override // defpackage.ry3
    public void o(java.lang.String r1) {
            r0 = this;
            ot3 r1 = defpackage.ot3.ERROR
            r1 = 0
            r0.R(r1)
            return
    }

    @Override // defpackage.ry3
    public void p(java.lang.Exception r1) {
            r0 = this;
            ot3 r1 = defpackage.ot3.ERROR
            r1 = 0
            r0.R(r1)
            return
    }

    @Override // defpackage.ry3
    public void q(java.lang.String r1) {
            r0 = this;
            ot3 r1 = defpackage.ot3.ERROR
            r1 = 0
            r0.R(r1)
            return
    }

    @Override // defpackage.r63
    public java.lang.Object r() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.rb0
    public java.lang.Object s(defpackage.qb0 r4) {
            r3 = this;
            g15 r0 = new g15
            r1 = 13
            r0.<init>(r3, r1)
            uj1 r1 = defpackage.u24.j()
            hl5 r2 = r4.c
            if (r2 == 0) goto L12
            r2.a(r1, r0)
        L12:
            java.lang.Object r0 = r3.R
            nv2 r0 = (defpackage.nv2) r0
            java.util.concurrent.atomic.AtomicReference r0 = r0.A
            r0.set(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "HandlerScheduledFuture-"
            r4.<init>(r0)
            java.lang.Object r3 = r3.L
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            return r3
    }

    @Override // defpackage.ry3
    public void t(java.lang.Object r2) {
            r1 = this;
            ot3 r0 = defpackage.ot3.ERROR
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.R(r2)
            return
    }

    @Override // defpackage.ry3
    public void u(java.lang.Object r2) {
            r1 = this;
            ot3 r0 = defpackage.ot3.ERROR
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            r1.R(r2)
            return
    }

    @Override // defpackage.ry3
    public void v(java.lang.String r1, java.lang.Exception r2) {
            r0 = this;
            ot3 r1 = defpackage.ot3.ERROR
            r1 = 0
            r0.R(r1)
            return
    }

    @Override // defpackage.rm6
    public defpackage.ui6 w() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 7: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.B
            s62 r1 = (defpackage.s62) r1
            return r1
        La:
            java.lang.Object r1 = r1.R
            ee5 r1 = (defpackage.ee5) r1
            return r1
    }

    @Override // defpackage.ry3
    public void x(java.lang.Object... r2) {
            r1 = this;
            ot3 r0 = defpackage.ot3.ERROR
            r1.S(r2)
            return
    }

    public void y(defpackage.sm3 r4, defpackage.wb3 r5) {
            r3 = this;
            java.lang.Object r0 = r3.B
            d51 r0 = (defpackage.d51) r0
            java.lang.Object r1 = r3.L
            d51 r1 = (defpackage.d51) r1
            java.lang.Object r3 = r3.R
            d51 r3 = (defpackage.d51) r3
            int[] r2 = defpackage.ei1.a
            int r5 = r5.ordinal()
            r5 = r2[r5]
            r2 = 1
            if (r5 == r2) goto L43
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 3
            if (r5 == r2) goto L30
            r0 = 4
            if (r5 != r0) goto L2c
            sm3 r5 = r4.e0
            if (r5 == 0) goto L28
            r3.c(r4)
            return
        L28:
            r1.c(r4)
            return
        L2c:
            defpackage.i.d()
            return
        L30:
            sm3 r5 = r4.e0
            if (r5 == 0) goto L38
            r3.c(r4)
            return
        L38:
            r0.c(r4)
            return
        L3c:
            r1.c(r4)
            r3.c(r4)
            return
        L43:
            r0.c(r4)
            r3.c(r4)
            return
    }

    public void z(defpackage.ex1 r2) {
            r1 = this;
            r2.getClass()
            java.lang.Object r0 = r1.R
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            int r2 = r0.size()
            r0 = 1
            if (r2 != r0) goto L18
            java.lang.Object r1 = r1.L
            bv1 r1 = (defpackage.bv1) r1
            r1.c()
        L18:
            return
    }
}
