package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt  reason: default package */
/* loaded from: classes.dex */
public final class mt implements defpackage.jr2 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public volatile defpackage.ir2 L;
    public final java.lang.Object R;

    public mt(androidx.fragment.app.o r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.B = r0
            r1.R = r2
            return
    }

    public mt(defpackage.d51 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.B = r0
            r1.R = r2
            return
    }

    public mt(me.magnum.melonds.ui.emulator.RuntimeLayoutView r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.B = r0
            r1.R = r2
            return
    }

    public static final android.content.Context d(android.content.Context r1) {
        L0:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto Lf
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 != 0) goto Lf
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            goto L0
        Lf:
            return r1
    }

    public defpackage.qb1 a() {
            r3 = this;
            java.lang.Object r3 = r3.R
            androidx.fragment.app.o r3 = (androidx.fragment.app.o) r3
            java.lang.Object r0 = r3.getHost()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r3.getHost()
            boolean r0 = r0 instanceof defpackage.kr2
            java.lang.Object r1 = r3.getHost()
            java.lang.Class r1 = r1.getClass()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s"
            defpackage.qo2.o(r0, r2, r1)
            java.lang.Object r3 = r3.getHost()
            java.lang.Class<yk2> r0 = defpackage.yk2.class
            java.lang.Object r3 = defpackage.q60.B(r0, r3)
            yk2 r3 = (defpackage.yk2) r3
            ob1 r3 = (defpackage.ob1) r3
            sb1 r0 = r3.a
            pb1 r1 = r3.b
            ob1 r3 = r3.c
            qb1 r2 = new qb1
            r2.<init>(r0, r1, r3)
            return r2
        L3b:
            java.lang.String r3 = "Hilt Fragments must be attached before creating the component."
            defpackage.u34.x(r3)
            r3 = 0
            return r3
    }

    public defpackage.tb1 b() {
            r3 = this;
            java.lang.Object r3 = r3.R
            me.magnum.melonds.ui.emulator.RuntimeLayoutView r3 = (me.magnum.melonds.ui.emulator.RuntimeLayoutView) r3
            android.content.Context r3 = r3.getContext()
        L8:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L1b
            java.lang.Class<jr2> r0 = defpackage.jr2.class
            boolean r0 = r0.isInstance(r3)
            if (r0 != 0) goto L1b
            android.content.ContextWrapper r3 = (android.content.ContextWrapper) r3
            android.content.Context r3 = r3.getBaseContext()
            goto L8
        L1b:
            android.content.Context r0 = r3.getApplicationContext()
            android.app.Application r0 = defpackage.vy7.k0(r0)
            java.lang.Class<me.magnum.melonds.ui.emulator.RuntimeLayoutView> r1 = me.magnum.melonds.ui.emulator.RuntimeLayoutView.class
            if (r3 != r0) goto L32
            java.lang.String r3 = "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context."
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            r2 = 0
            defpackage.qo2.o(r2, r3, r0)
            r3 = 0
        L32:
            boolean r0 = r3 instanceof defpackage.jr2
            if (r0 == 0) goto L4a
            jr2 r3 = (defpackage.jr2) r3
            java.lang.Class<co7> r0 = defpackage.co7.class
            java.lang.Object r3 = defpackage.q60.B(r0, r3)
            co7 r3 = (defpackage.co7) r3
            ob1 r3 = (defpackage.ob1) r3
            sb1 r3 = r3.a
            tb1 r0 = new tb1
            r0.<init>(r3)
            return r0
        L4a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            switch(r0) {
                case 0: goto L47;
                case 1: goto L26;
                default: goto L5;
            }
        L5:
            ir2 r0 = r4.L
            tb1 r0 = (defpackage.tb1) r0
            if (r0 != 0) goto L21
            java.lang.Object r0 = r4.B
            monitor-enter(r0)
            ir2 r1 = r4.L     // Catch: java.lang.Throwable -> L1b
            tb1 r1 = (defpackage.tb1) r1     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L1d
            tb1 r1 = r4.b()     // Catch: java.lang.Throwable -> L1b
            r4.L = r1     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L1f
        L1d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L21
        L1f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r4
        L21:
            ir2 r4 = r4.L
            tb1 r4 = (defpackage.tb1) r4
            return r4
        L26:
            ir2 r0 = r4.L
            qb1 r0 = (defpackage.qb1) r0
            if (r0 != 0) goto L42
            java.lang.Object r0 = r4.B
            monitor-enter(r0)
            ir2 r1 = r4.L     // Catch: java.lang.Throwable -> L3c
            qb1 r1 = (defpackage.qb1) r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L3e
            qb1 r1 = r4.a()     // Catch: java.lang.Throwable -> L3c
            r4.L = r1     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r4 = move-exception
            goto L40
        L3e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3c
            throw r4
        L42:
            ir2 r4 = r4.L
            qb1 r4 = (defpackage.qb1) r4
            return r4
        L47:
            ir2 r0 = r4.L
            sb1 r0 = (defpackage.sb1) r0
            if (r0 != 0) goto L72
            java.lang.Object r0 = r4.B
            monitor-enter(r0)
            ir2 r1 = r4.L     // Catch: java.lang.Throwable -> L6c
            sb1 r1 = (defpackage.sb1) r1     // Catch: java.lang.Throwable -> L6c
            if (r1 != 0) goto L6e
            java.lang.Object r1 = r4.R     // Catch: java.lang.Throwable -> L6c
            d51 r1 = (defpackage.d51) r1     // Catch: java.lang.Throwable -> L6c
            rh r2 = new rh     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L6c
            me.magnum.melonds.MelonDSApplication r1 = (me.magnum.melonds.MelonDSApplication) r1     // Catch: java.lang.Throwable -> L6c
            r3 = 0
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L6c
            sb1 r1 = new sb1     // Catch: java.lang.Throwable -> L6c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            r4.L = r1     // Catch: java.lang.Throwable -> L6c
            goto L6e
        L6c:
            r4 = move-exception
            goto L70
        L6e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            goto L72
        L70:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6c
            throw r4
        L72:
            ir2 r4 = r4.L
            sb1 r4 = (defpackage.sb1) r4
            return r4
    }
}
