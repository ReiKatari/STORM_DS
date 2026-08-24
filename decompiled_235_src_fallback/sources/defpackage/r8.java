package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r8  reason: default package */
/* loaded from: classes.dex */
public final class r8 implements defpackage.jr2 {
    public volatile defpackage.ob1 A;
    public final java.lang.Object B;
    public final android.app.Activity L;
    public final defpackage.q9 R;
    public defpackage.g60 X;

    public r8(android.app.Activity r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.B = r0
            r1.L = r2
            q9 r0 = new q9
            mv0 r2 = (defpackage.mv0) r2
            r0.<init>(r2)
            r1.R = r0
            return
    }

    public final void a() {
            r1 = this;
            g60 r1 = r1.X
            if (r1 == 0) goto L7
            r0 = 0
            r1.B = r0
        L7:
            return
    }

    public final defpackage.ob1 b() {
            r3 = this;
            android.app.Activity r0 = r3.L
            android.app.Application r1 = r0.getApplication()
            boolean r1 = r1 instanceof defpackage.jr2
            if (r1 != 0) goto L3f
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            android.app.Application r1 = r0.getApplication()
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1f
            java.lang.String r0 = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?"
            goto L35
        L1f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Found: "
            r1.<init>(r2)
            android.app.Application r0 = r0.getApplication()
            java.lang.Class r0 = r0.getClass()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L35:
            java.lang.String r1 = "Hilt Activity must be attached to an @HiltAndroidApp Application. "
            java.lang.String r0 = r1.concat(r0)
            r3.<init>(r0)
            throw r3
        L3f:
            q9 r3 = r3.R
            java.lang.Class<q8> r0 = defpackage.q8.class
            java.lang.Object r3 = defpackage.q60.B(r0, r3)
            q8 r3 = (defpackage.q8) r3
            pb1 r3 = (defpackage.pb1) r3
            sb1 r0 = r3.a
            pb1 r3 = r3.b
            ob1 r1 = new ob1
            r1.<init>(r0, r3)
            return r1
    }

    @Override // defpackage.jr2
    public final java.lang.Object c() {
            r2 = this;
            ob1 r0 = r2.A
            if (r0 != 0) goto L18
            java.lang.Object r0 = r2.B
            monitor-enter(r0)
            ob1 r1 = r2.A     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            ob1 r1 = r2.b()     // Catch: java.lang.Throwable -> L12
            r2.A = r1     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r2 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
        L18:
            ob1 r2 = r2.A
            return r2
    }

    public final void d() {
            r4 = this;
            q9 r0 = r4.R
            mv0 r1 = r0.A
            mv0 r0 = r0.B
            os0 r0 = defpackage.q9.a(r1, r0)
            java.lang.Class<o9> r1 = defpackage.o9.class
            ar0 r1 = defpackage.gh5.a(r1)
            qo7 r0 = r0.Z(r1)
            o9 r0 = (defpackage.o9) r0
            g60 r0 = r0.c
            r4.X = r0
            java.lang.Object r1 = r0.B
            m94 r1 = (defpackage.m94) r1
            if (r1 != 0) goto L36
            android.app.Activity r4 = r4.L
            mv0 r4 = (defpackage.mv0) r4
            j71 r4 = r4.getDefaultViewModelCreationExtras()
            boolean r1 = r0.A
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "setExtras should only be called for an Activity that extends ComponentActivity"
            defpackage.qo2.o(r1, r3, r2)
            m94 r4 = (defpackage.m94) r4
            r0.B = r4
        L36:
            return
    }
}
