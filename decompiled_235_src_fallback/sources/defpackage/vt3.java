package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt3  reason: default package */
/* loaded from: classes.dex */
public final class vt3 implements defpackage.gu3, defpackage.pd0 {
    public final java.lang.Object A;
    public final defpackage.hu3 B;
    public final defpackage.zi0 L;
    public boolean R;
    public defpackage.qi1 X;

    public vt3(defpackage.hu3 r2, defpackage.zi0 r3, defpackage.t16 r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r1.A = r4
            r4 = 0
            r1.R = r4
            r4 = 0
            r1.X = r4
            r1.B = r2
            r1.L = r3
            ut3 r4 = r2.getLifecycle()
            tt3 r4 = r4.b()
            tt3 r0 = defpackage.tt3.STARTED
            boolean r4 = r4.isAtLeast(r0)
            if (r4 == 0) goto L28
            r3.h()
            goto L2b
        L28:
            r3.v()
        L2b:
            ut3 r2 = r2.getLifecycle()
            r2.a(r1)
            return
    }

    @Override // defpackage.pd0
    public final defpackage.zf0 a() {
            r0 = this;
            zi0 r0 = r0.L
            x9 r0 = r0.A
            w9 r0 = r0.B
            return r0
    }

    public final void b(defpackage.qi1 r6) {
            r5 = this;
            java.lang.Object r0 = r5.A
            monitor-enter(r0)
            qi1 r1 = r5.X     // Catch: java.lang.Throwable -> La
            if (r1 != 0) goto Ld
            r5.X = r6     // Catch: java.lang.Throwable -> La
            goto L4a
        La:
            r5 = move-exception
            goto La8
        Ld:
            boolean r2 = r6.b     // Catch: java.lang.Throwable -> La
            boolean r1 = r1.b
            if (r2 == 0) goto L3b
            if (r1 == 0) goto L33
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La
            qi1 r2 = r5.X     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r2.g     // Catch: java.lang.Throwable -> La
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La
            r1.<init>(r2)     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r6.g     // Catch: java.lang.Throwable -> La
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La
            r1.addAll(r2)     // Catch: java.lang.Throwable -> La
            qi1 r2 = new qi1     // Catch: java.lang.Throwable -> La
            java.lang.Object r3 = r6.c     // Catch: java.lang.Throwable -> La
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> La
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> La
            r5.X = r2     // Catch: java.lang.Throwable -> La
            goto L4a
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = "Cannot bind use cases when a SessionConfig is already bound to this LifecycleOwner. Please unbind first"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La
            throw r5     // Catch: java.lang.Throwable -> La
        L3b:
            if (r1 != 0) goto La0
            r5.X = r6     // Catch: java.lang.Throwable -> La
            zi0 r1 = r5.L     // Catch: java.lang.Throwable -> La
            java.util.List r2 = r1.z()     // Catch: java.lang.Throwable -> La
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> La
            r1.B(r2)     // Catch: java.lang.Throwable -> La
        L4a:
            zi0 r1 = r5.L     // Catch: java.lang.Throwable -> La
            java.lang.Object r1 = r1.g0     // Catch: java.lang.Throwable -> La
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            zi0 r1 = r5.L     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r6.c     // Catch: java.lang.Throwable -> La
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r3 = r1.g0     // Catch: java.lang.Throwable -> La
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La
            r1.d0 = r2     // Catch: java.lang.Throwable -> L9a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9a
            zi0 r1 = r5.L     // Catch: java.lang.Throwable -> La
            java.lang.Object r1 = r1.g0     // Catch: java.lang.Throwable -> La
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            zi0 r1 = r5.L     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r6.d     // Catch: java.lang.Throwable -> La
            android.util.Range r2 = (android.util.Range) r2     // Catch: java.lang.Throwable -> La
            java.lang.Object r3 = r1.g0     // Catch: java.lang.Throwable -> La
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La
            r1.e0 = r2     // Catch: java.lang.Throwable -> L94
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L94
            zf0 r1 = r5.a()     // Catch: java.lang.Throwable -> La
            cg0 r1 = (defpackage.cg0) r1     // Catch: java.lang.Throwable -> La
            r1.getClass()     // Catch: java.lang.Throwable -> La
            il5 r1 = defpackage.q61.o(r1, r6)     // Catch: java.lang.Throwable -> La
            java.lang.Object r2 = r6.i     // Catch: java.lang.Throwable -> La
            ov2 r2 = (defpackage.ov2) r2     // Catch: java.lang.Throwable -> La
            mf r3 = new mf     // Catch: java.lang.Throwable -> La
            r4 = 27
            r3.<init>(r4, r1, r6)     // Catch: java.lang.Throwable -> La
            r2.execute(r3)     // Catch: java.lang.Throwable -> La
            zi0 r5 = r5.L     // Catch: java.lang.Throwable -> La
            java.lang.Object r6 = r6.g     // Catch: java.lang.Throwable -> La
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Throwable -> La
            r5.b(r6, r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        L94:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L94
            throw r5     // Catch: java.lang.Throwable -> La
        L97:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            throw r5     // Catch: java.lang.Throwable -> La
        L9a:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L9a
            throw r5     // Catch: java.lang.Throwable -> La
        L9d:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9d
            throw r5     // Catch: java.lang.Throwable -> La
        La0:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> La
            java.lang.String r6 = "Cannot bind the SessionConfig when use cases are bound to this LifecycleOwner already. Please unbind first"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La
            throw r5     // Catch: java.lang.Throwable -> La
        La8:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r5
    }

    public final defpackage.hu3 d() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            hu3 r1 = r1.B     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final java.util.List g() {
            r1 = this;
            java.lang.Object r0 = r1.A
            monitor-enter(r0)
            zi0 r1 = r1.L     // Catch: java.lang.Throwable -> Lf
            java.util.List r1 = r1.z()     // Catch: java.lang.Throwable -> Lf
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @defpackage.ql4(defpackage.st3.ON_DESTROY)
    public void onDestroy(defpackage.hu3 r2) {
            r1 = this;
            java.lang.Object r2 = r1.A
            monitor-enter(r2)
            zi0 r1 = r1.L     // Catch: java.lang.Throwable -> L10
            java.util.List r0 = r1.z()     // Catch: java.lang.Throwable -> L10
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L10
            r1.B(r0)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @defpackage.ql4(defpackage.st3.ON_PAUSE)
    public void onPause(defpackage.hu3 r1) {
            r0 = this;
            r1 = 0
            zi0 r0 = r0.L
            x9 r0 = r0.A
            r0.j(r1)
            return
    }

    @defpackage.ql4(defpackage.st3.ON_RESUME)
    public void onResume(defpackage.hu3 r1) {
            r0 = this;
            r1 = 1
            zi0 r0 = r0.L
            x9 r0 = r0.A
            r0.j(r1)
            return
    }

    @defpackage.ql4(defpackage.st3.ON_START)
    public void onStart(defpackage.hu3 r2) {
            r1 = this;
            java.lang.Object r2 = r1.A
            monitor-enter(r2)
            boolean r0 = r1.R     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            zi0 r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            r1.h()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    @defpackage.ql4(defpackage.st3.ON_STOP)
    public void onStop(defpackage.hu3 r2) {
            r1 = this;
            java.lang.Object r2 = r1.A
            monitor-enter(r2)
            boolean r0 = r1.R     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            zi0 r1 = r1.L     // Catch: java.lang.Throwable -> Ld
            r1.v()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r1 = move-exception
            goto L11
        Lf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        L11:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r1
    }

    public final void r() {
            r2 = this;
            java.lang.Object r0 = r2.A
            monitor-enter(r0)
            boolean r1 = r2.R     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r2 = move-exception
            goto L15
        Lb:
            hu3 r1 = r2.B     // Catch: java.lang.Throwable -> L9
            r2.onStop(r1)     // Catch: java.lang.Throwable -> L9
            r1 = 1
            r2.R = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r2
    }

    public final void s() {
            r6 = this;
            java.lang.Object r0 = r6.A
            monitor-enter(r0)
            zi0 r1 = r6.L     // Catch: java.lang.Throwable -> L35
            java.util.List r1 = r1.z()     // Catch: java.lang.Throwable -> L35
            zi0 r2 = r6.L     // Catch: java.lang.Throwable -> L35
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L35
            r2.B(r3)     // Catch: java.lang.Throwable -> L35
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch: java.lang.Throwable -> L35
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L35
            r3 = 0
        L18:
            if (r3 >= r2) goto L30
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L35
            int r3 = r3 + 1
            di7 r4 = (defpackage.di7) r4     // Catch: java.lang.Throwable -> L35
            boolean r5 = r4.n()     // Catch: java.lang.Throwable -> L35
            if (r5 == 0) goto L18
            java.lang.Object r4 = r4.c     // Catch: java.lang.Throwable -> L35
            monitor-enter(r4)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            goto L18
        L2d:
            r6 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L2d
            throw r6     // Catch: java.lang.Throwable -> L35
        L30:
            r1 = 0
            r6.X = r1     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r6
    }

    public final void t() {
            r3 = this;
            java.lang.Object r0 = r3.A
            monitor-enter(r0)
            boolean r1 = r3.R     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r3 = move-exception
            goto L27
        Lb:
            r1 = 0
            r3.R = r1     // Catch: java.lang.Throwable -> L9
            hu3 r1 = r3.B     // Catch: java.lang.Throwable -> L9
            ut3 r1 = r1.getLifecycle()     // Catch: java.lang.Throwable -> L9
            tt3 r1 = r1.b()     // Catch: java.lang.Throwable -> L9
            tt3 r2 = defpackage.tt3.STARTED     // Catch: java.lang.Throwable -> L9
            boolean r1 = r1.isAtLeast(r2)     // Catch: java.lang.Throwable -> L9
            if (r1 == 0) goto L25
            hu3 r1 = r3.B     // Catch: java.lang.Throwable -> L9
            r3.onStart(r1)     // Catch: java.lang.Throwable -> L9
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L27:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r3
    }
}
