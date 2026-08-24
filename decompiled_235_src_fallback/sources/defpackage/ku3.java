package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ku3  reason: default package */
/* loaded from: classes.dex */
public final class ku3 extends defpackage.ut3 {
    public final boolean b;
    public defpackage.r92 c;
    public defpackage.tt3 d;
    public final java.lang.ref.WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final java.util.ArrayList i;
    public final defpackage.tp6 j;

    public ku3(defpackage.hu3 r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.b = r3
            r92 r3 = new r92
            r3.<init>()
            r1.c = r3
            tt3 r3 = defpackage.tt3.INITIALIZED
            r1.d = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.i = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.e = r0
            tp6 r2 = defpackage.up6.a(r3)
            r1.j = r2
            return
    }

    @Override // defpackage.ut3
    public final void a(defpackage.gu3 r10) {
            r9 = this;
            r10.getClass()
            java.lang.String r0 = "addObserver"
            r9.e(r0)
            tt3 r0 = r9.d
            tt3 r1 = defpackage.tt3.DESTROYED
            if (r0 != r1) goto Lf
            goto L11
        Lf:
            tt3 r1 = defpackage.tt3.INITIALIZED
        L11:
            ju3 r0 = new ju3
            r1.getClass()
            r0.<init>()
            java.util.HashMap r2 = defpackage.pu3.a
            boolean r2 = r10 instanceof defpackage.fu3
            boolean r3 = r10 instanceof defpackage.qe1
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L32
            if (r3 == 0) goto L32
            se1 r2 = new se1
            r3 = r10
            qe1 r3 = (defpackage.qe1) r3
            r7 = r10
            fu3 r7 = (defpackage.fu3) r7
            r2.<init>(r3, r7)
            goto L86
        L32:
            if (r3 == 0) goto L3d
            se1 r2 = new se1
            r3 = r10
            qe1 r3 = (defpackage.qe1) r3
            r2.<init>(r3, r4)
            goto L86
        L3d:
            if (r2 == 0) goto L43
            r2 = r10
            fu3 r2 = (defpackage.fu3) r2
            goto L86
        L43:
            java.lang.Class r2 = r10.getClass()
            int r3 = defpackage.pu3.b(r2)
            r7 = 2
            if (r3 != r7) goto L81
            java.util.HashMap r3 = defpackage.pu3.b
            java.lang.Object r2 = r3.get(r2)
            r2.getClass()
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 == r6) goto L77
            int r3 = r2.size()
            hr2[] r8 = new defpackage.hr2[r3]
            if (r3 > 0) goto L6d
            mf5 r2 = new mf5
            r2.<init>(r8, r7)
            goto L86
        L6d:
            java.lang.Object r9 = r2.get(r5)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            defpackage.pu3.a(r9, r10)
            throw r4
        L77:
            java.lang.Object r9 = r2.get(r5)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            defpackage.pu3.a(r9, r10)
            throw r4
        L81:
            se1 r2 = new se1
            r2.<init>(r10)
        L86:
            r0.b = r2
            r0.a = r1
            r92 r1 = r9.c
            p36 r2 = r1.a(r10)
            if (r2 == 0) goto L95
            java.lang.Object r4 = r2.B
            goto Lb3
        L95:
            java.util.HashMap r2 = r1.X
            p36 r3 = new p36
            r3.<init>(r10, r0)
            int r7 = r1.R
            int r7 = r7 + r6
            r1.R = r7
            p36 r7 = r1.B
            if (r7 != 0) goto Laa
            r1.A = r3
            r1.B = r3
            goto Lb0
        Laa:
            r7.L = r3
            r3.R = r7
            r1.B = r3
        Lb0:
            r2.put(r10, r3)
        Lb3:
            ju3 r4 = (defpackage.ju3) r4
            if (r4 == 0) goto Lb8
            goto Lc2
        Lb8:
            java.lang.ref.WeakReference r1 = r9.e
            java.lang.Object r1 = r1.get()
            hu3 r1 = (defpackage.hu3) r1
            if (r1 != 0) goto Lc3
        Lc2:
            return
        Lc3:
            int r2 = r9.f
            if (r2 != 0) goto Lcb
            boolean r2 = r9.g
            if (r2 == 0) goto Lcc
        Lcb:
            r5 = r6
        Lcc:
            tt3 r2 = r9.d(r10)
            int r3 = r9.f
            int r3 = r3 + r6
            r9.f = r3
        Ld5:
            tt3 r3 = r0.a
            int r2 = r3.compareTo(r2)
            if (r2 >= 0) goto L113
            r92 r2 = r9.c
            java.util.HashMap r2 = r2.X
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L113
            tt3 r2 = r0.a
            java.util.ArrayList r3 = r9.i
            r3.add(r2)
            qt3 r2 = defpackage.st3.Companion
            tt3 r4 = r0.a
            r2.getClass()
            st3 r2 = defpackage.qt3.b(r4)
            if (r2 == 0) goto L10b
            r0.a(r1, r2)
            int r2 = r3.size()
            int r2 = r2 - r6
            r3.remove(r2)
            tt3 r2 = r9.d(r10)
            goto Ld5
        L10b:
            java.lang.String r9 = "no event up from "
            tt3 r10 = r0.a
            defpackage.e41.z(r10, r9)
            return
        L113:
            if (r5 != 0) goto L118
            r9.i()
        L118:
            int r10 = r9.f
            int r10 = r10 + (-1)
            r9.f = r10
            return
    }

    @Override // defpackage.ut3
    public final defpackage.tt3 b() {
            r0 = this;
            tt3 r0 = r0.d
            return r0
    }

    @Override // defpackage.ut3
    public final void c(defpackage.gu3 r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "removeObserver"
            r1.e(r0)
            r92 r1 = r1.c
            r1.b(r2)
            return
    }

    public final defpackage.tt3 d(defpackage.gu3 r4) {
            r3 = this;
            r92 r0 = r3.c
            java.util.HashMap r0 = r0.X
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r4 = r0.get(r4)
            p36 r4 = (defpackage.p36) r4
            p36 r4 = r4.R
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r4.B
            ju3 r4 = (defpackage.ju3) r4
            tt3 r4 = r4.a
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.util.ArrayList r0 = r3.i
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L34
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            tt3 r2 = (defpackage.tt3) r2
        L34:
            tt3 r3 = r3.d
            r3.getClass()
            if (r4 == 0) goto L42
            int r0 = r4.compareTo(r3)
            if (r0 >= 0) goto L42
            goto L43
        L42:
            r4 = r3
        L43:
            if (r2 == 0) goto L4c
            int r3 = r2.compareTo(r4)
            if (r3 >= 0) goto L4c
            return r2
        L4c:
            return r4
    }

    public final void e(java.lang.String r2) {
            r1 = this;
            boolean r1 = r1.b
            if (r1 == 0) goto L27
            zt r1 = defpackage.zt.l0()
            sf1 r1 = r1.e
            r1.getClass()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L1c
            return
        L1c:
            java.lang.String r1 = "Method "
            java.lang.String r0 = " must be called on the main thread"
            java.lang.String r1 = defpackage.lb1.A(r1, r2, r0)
            defpackage.u34.f(r1)
        L27:
            return
    }

    public final void f(defpackage.st3 r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "handleLifecycleEvent"
            r1.e(r0)
            tt3 r2 = r2.getTargetState()
            r1.g(r2)
            return
    }

    public final void g(defpackage.tt3 r5) {
            r4 = this;
            tt3 r0 = r4.d
            if (r0 != r5) goto L6
            goto L97
        L6:
            java.lang.ref.WeakReference r0 = r4.e
            java.lang.Object r0 = r0.get()
            hu3 r0 = (defpackage.hu3) r0
            tt3 r1 = r4.d
            r1.getClass()
            r5.getClass()
            tt3 r2 = defpackage.tt3.INITIALIZED
            if (r1 != r2) goto L49
            tt3 r2 = defpackage.tt3.DESTROYED
            if (r5 == r2) goto L1f
            goto L49
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            tt3 r1 = defpackage.tt3.CREATED
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "State must be at least '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "' to be moved to '"
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = "' in component "
            r2.append(r5)
            r2.append(r0)
            java.lang.String r5 = r2.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L49:
            tt3 r2 = defpackage.tt3.DESTROYED
            if (r1 != r2) goto L78
            if (r1 != r5) goto L50
            goto L78
        L50:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "State is '"
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r2 = "' and cannot be moved to `"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = "` in component "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L78:
            r4.d = r5
            boolean r5 = r4.g
            r0 = 1
            if (r5 != 0) goto L98
            int r5 = r4.f
            if (r5 == 0) goto L84
            goto L98
        L84:
            r4.g = r0
            r4.i()
            r5 = 0
            r4.g = r5
            tt3 r5 = r4.d
            if (r5 != r2) goto L97
            r92 r5 = new r92
            r5.<init>()
            r4.c = r5
        L97:
            return
        L98:
            r4.h = r0
            return
    }

    public final void h(defpackage.tt3 r2) {
            r1 = this;
            r2.getClass()
            java.lang.String r0 = "setCurrentState"
            r1.e(r0)
            r1.g(r2)
            return
    }

    public final void i() {
            r8 = this;
            java.lang.ref.WeakReference r0 = r8.e
            java.lang.Object r0 = r0.get()
            hu3 r0 = (defpackage.hu3) r0
            if (r0 == 0) goto L148
        La:
            r92 r1 = r8.c
            int r2 = r1.R
            r3 = 0
            if (r2 != 0) goto L12
            goto L30
        L12:
            p36 r1 = r1.A
            r1.getClass()
            java.lang.Object r1 = r1.B
            ju3 r1 = (defpackage.ju3) r1
            tt3 r1 = r1.a
            r92 r2 = r8.c
            p36 r2 = r2.B
            r2.getClass()
            java.lang.Object r2 = r2.B
            ju3 r2 = (defpackage.ju3) r2
            tt3 r2 = r2.a
            if (r1 != r2) goto L3a
            tt3 r1 = r8.d
            if (r1 != r2) goto L3a
        L30:
            r8.h = r3
            tp6 r0 = r8.j
            tt3 r8 = r8.d
            r0.l(r8)
            return
        L3a:
            r8.h = r3
            tt3 r1 = r8.d
            r92 r2 = r8.c
            p36 r2 = r2.A
            r2.getClass()
            java.lang.Object r2 = r2.B
            ju3 r2 = (defpackage.ju3) r2
            tt3 r2 = r2.a
            int r1 = r1.compareTo(r2)
            r2 = 1
            java.util.ArrayList r3 = r8.i
            if (r1 >= 0) goto Lc5
            r92 r1 = r8.c
            o36 r4 = new o36
            p36 r5 = r1.B
            p36 r6 = r1.A
            r4.<init>(r5, r6, r2)
            java.util.WeakHashMap r1 = r1.L
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.put(r4, r5)
        L66:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto Lc5
            boolean r1 = r8.h
            if (r1 != 0) goto Lc5
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            r1.getClass()
            java.lang.Object r5 = r1.getKey()
            gu3 r5 = (defpackage.gu3) r5
            java.lang.Object r1 = r1.getValue()
            ju3 r1 = (defpackage.ju3) r1
        L85:
            tt3 r6 = r1.a
            tt3 r7 = r8.d
            int r6 = r6.compareTo(r7)
            if (r6 <= 0) goto L66
            boolean r6 = r8.h
            if (r6 != 0) goto L66
            r92 r6 = r8.c
            java.util.HashMap r6 = r6.X
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L66
            qt3 r6 = defpackage.st3.Companion
            tt3 r7 = r1.a
            r6.getClass()
            st3 r6 = defpackage.qt3.a(r7)
            if (r6 == 0) goto Lbd
            tt3 r7 = r6.getTargetState()
            r3.add(r7)
            r1.a(r0, r6)
            int r6 = r3.size()
            int r6 = r6 - r2
            r3.remove(r6)
            goto L85
        Lbd:
            java.lang.String r8 = "no event down from "
            tt3 r0 = r1.a
            defpackage.e41.z(r0, r8)
            return
        Lc5:
            r92 r1 = r8.c
            p36 r1 = r1.B
            boolean r4 = r8.h
            if (r4 != 0) goto La
            if (r1 == 0) goto La
            tt3 r4 = r8.d
            java.lang.Object r1 = r1.B
            ju3 r1 = (defpackage.ju3) r1
            tt3 r1 = r1.a
            int r1 = r4.compareTo(r1)
            if (r1 <= 0) goto La
            r92 r1 = r8.c
            r1.getClass()
            q36 r4 = new q36
            r4.<init>(r1)
            java.util.WeakHashMap r1 = r1.L
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r1.put(r4, r5)
        Lee:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r8.h
            if (r1 != 0) goto La
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r5 = r1.getKey()
            gu3 r5 = (defpackage.gu3) r5
            java.lang.Object r1 = r1.getValue()
            ju3 r1 = (defpackage.ju3) r1
        L10a:
            tt3 r6 = r1.a
            tt3 r7 = r8.d
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto Lee
            boolean r6 = r8.h
            if (r6 != 0) goto Lee
            r92 r6 = r8.c
            java.util.HashMap r6 = r6.X
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto Lee
            tt3 r6 = r1.a
            r3.add(r6)
            qt3 r6 = defpackage.st3.Companion
            tt3 r7 = r1.a
            r6.getClass()
            st3 r6 = defpackage.qt3.b(r7)
            if (r6 == 0) goto L140
            r1.a(r0, r6)
            int r6 = r3.size()
            int r6 = r6 - r2
            r3.remove(r6)
            goto L10a
        L140:
            java.lang.String r8 = "no event up from "
            tt3 r0 = r1.a
            defpackage.e41.z(r0, r8)
            return
        L148:
            java.lang.String r8 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            defpackage.i.m(r8)
            return
    }
}
