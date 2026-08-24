package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: di7  reason: default package */
/* loaded from: classes.dex */
public abstract class di7 {
    public final java.util.HashSet a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public defpackage.bi7 d;
    public defpackage.zi7 e;
    public final defpackage.zi7 f;
    public java.util.HashSet g;
    public defpackage.zi7 h;
    public defpackage.yy i;
    public defpackage.zi7 j;
    public android.graphics.Rect k;
    public android.graphics.Matrix l;
    public defpackage.eg0 m;
    public defpackage.eg0 n;
    public defpackage.rc6 o;
    public defpackage.rc6 p;

    public di7(defpackage.zi7 r2) {
            r1 = this;
            r1.<init>()
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.c = r0
            bi7 r0 = defpackage.bi7.INACTIVE
            r1.d = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.l = r0
            fa6 r0 = new fa6
            r0.<init>(r1)
            rc6 r0 = defpackage.rc6.a()
            r1.o = r0
            rc6 r0 = defpackage.rc6.a()
            r1.p = r0
            r1.f = r2
            r1.h = r2
            return
    }

    public abstract void A();

    public void B(android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r2)
            r1.l = r0
            return
    }

    public void C(android.graphics.Rect r1) {
            r0 = this;
            r0.k = r1
            return
    }

    public final void D(defpackage.eg0 r5) {
            r4 = this;
            r4.A()
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            eg0 r1 = r4.m     // Catch: java.lang.Throwable -> L13
            r2 = 0
            if (r5 != r1) goto L15
            java.util.HashSet r3 = r4.a     // Catch: java.lang.Throwable -> L13
            r3.remove(r1)     // Catch: java.lang.Throwable -> L13
            r4.m = r2     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r4 = move-exception
            goto L35
        L15:
            eg0 r1 = r4.n     // Catch: java.lang.Throwable -> L13
            if (r5 != r1) goto L20
            java.util.HashSet r5 = r4.a     // Catch: java.lang.Throwable -> L13
            r5.remove(r1)     // Catch: java.lang.Throwable -> L13
            r4.n = r2     // Catch: java.lang.Throwable -> L13
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r5 = r4.c
            monitor-enter(r5)
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            r4.i = r2
            r4.k = r2
            zi7 r5 = r4.f
            r4.h = r5
            r4.e = r2
            r4.j = r2
            return
        L32:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L32
            throw r4
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r4
    }

    public final void E(java.util.List r4) {
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L7
            goto L4e
        L7:
            r0 = 0
            java.lang.Object r0 = r4.get(r0)
            rc6 r0 = (defpackage.rc6) r0
            r3.o = r0
            int r0 = r4.size()
            r1 = 1
            if (r0 <= r1) goto L1f
            java.lang.Object r0 = r4.get(r1)
            rc6 r0 = (defpackage.rc6) r0
            r3.p = r0
        L1f:
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r4.next()
            rc6 r0 = (defpackage.rc6) r0
            java.util.List r0 = r0.b()
            java.util.Iterator r0 = r0.iterator()
        L37:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            ig1 r1 = (defpackage.ig1) r1
            java.lang.Class r2 = r1.j
            if (r2 != 0) goto L37
            java.lang.Class r2 = r3.getClass()
            r1.j = r2
            goto L37
        L4e:
            return
    }

    public final void F(defpackage.yy r1, defpackage.yy r2) {
            r0 = this;
            yy r1 = r0.z(r1, r2)
            r0.i = r1
            return
    }

    public final void a(defpackage.lc6 r5, defpackage.yy r6) {
            r4 = this;
            android.util.Range r0 = defpackage.yy.h
            android.util.Range r1 = r6.e
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L1b
            android.util.Range r4 = r6.e
            dk0 r5 = r5.b
            r5.getClass()
            xx r6 = defpackage.ek0.f
            java.lang.Object r5 = r5.X
            da4 r5 = (defpackage.da4) r5
            r5.m(r6, r4)
            return
        L1b:
            java.lang.Object r6 = r4.b
            monitor-enter(r6)
            eg0 r4 = r4.m     // Catch: java.lang.Throwable -> L69
            r4.getClass()     // Catch: java.lang.Throwable -> L69
            cg0 r4 = r4.q()     // Catch: java.lang.Throwable -> L69
            y65 r4 = r4.s()     // Catch: java.lang.Throwable -> L69
            java.lang.Class<androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk> r1 = androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk.class
            java.util.ArrayList r4 = r4.c(r1)     // Catch: java.lang.Throwable -> L69
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L69
            r2 = 0
            r3 = 1
            if (r1 > r3) goto L3a
            goto L3b
        L3a:
            r3 = r2
        L3b:
            java.lang.String r1 = "There should not have more than one AeFpsRangeQuirk."
            defpackage.np2.s(r1, r3)     // Catch: java.lang.Throwable -> L69
            boolean r1 = r4.isEmpty()     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L6b
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Throwable -> L69
            androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk r4 = (androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk) r4     // Catch: java.lang.Throwable -> L69
            androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk r4 = (androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk) r4     // Catch: java.lang.Throwable -> L69
            ex6 r4 = r4.a     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L69
            android.util.Range r4 = (android.util.Range) r4     // Catch: java.lang.Throwable -> L69
            if (r4 != 0) goto L59
            goto L5a
        L59:
            r0 = r4
        L5a:
            dk0 r4 = r5.b     // Catch: java.lang.Throwable -> L69
            r4.getClass()     // Catch: java.lang.Throwable -> L69
            xx r5 = defpackage.ek0.f     // Catch: java.lang.Throwable -> L69
            java.lang.Object r4 = r4.X     // Catch: java.lang.Throwable -> L69
            da4 r4 = (defpackage.da4) r4     // Catch: java.lang.Throwable -> L69
            r4.m(r5, r0)     // Catch: java.lang.Throwable -> L69
            goto L6b
        L69:
            r4 = move-exception
            goto L6d
        L6b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            return
        L6d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L69
            throw r4
    }

    public final void b(defpackage.eg0 r3, defpackage.eg0 r4, defpackage.zi7 r5, defpackage.zi7 r6) {
            r2 = this;
            java.lang.Object r0 = r2.b
            monitor-enter(r0)
            r2.m = r3     // Catch: java.lang.Throwable -> L31
            r2.n = r4     // Catch: java.lang.Throwable -> L31
            java.util.HashSet r1 = r2.a     // Catch: java.lang.Throwable -> L31
            r1.add(r3)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L13
            java.util.HashSet r1 = r2.a     // Catch: java.lang.Throwable -> L31
            r1.add(r4)     // Catch: java.lang.Throwable -> L31
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            r2.e = r5
            r2.j = r6
            cg0 r3 = r3.q()
            zi7 r4 = r2.e
            zi7 r5 = r2.j
            zi7 r3 = r2.p(r3, r4, r5)
            r2.h = r3
            java.lang.Object r3 = r2.c
            monitor-enter(r3)
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            r2.t()
            return
        L2e:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2e
            throw r2
        L31:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r2
    }

    public final android.util.Size c() {
            r0 = this;
            yy r0 = r0.i
            if (r0 == 0) goto L7
            android.util.Size r0 = r0.a
            return r0
        L7:
            r0 = 0
            return r0
    }

    public final defpackage.eg0 d() {
            r1 = this;
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            eg0 r1 = r1.m     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final defpackage.ve0 e() {
            r1 = this;
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            eg0 r1 = r1.m     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            ue0 r1 = defpackage.ve0.a     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L13
        Ld:
            ve0 r1 = r1.e()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public final java.lang.String f() {
            r3 = this;
            eg0 r0 = r3.d()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No camera attached to use case: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            defpackage.np2.x(r0, r3)
            cg0 r3 = r0.q()
            java.lang.String r3 = r3.d()
            return r3
    }

    public abstract defpackage.zi7 g(boolean r1, defpackage.cj7 r2);

    public final java.lang.String h() {
            r3 = this;
            zi7 r0 = r3.h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "<UnknownUseCase-"
            r1.<init>(r2)
            int r3 = r3.hashCode()
            r1.append(r3)
            java.lang.String r3 = ">"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            xx r1 = defpackage.kz6.C
            java.lang.Object r3 = r0.b(r1, r3)
            java.lang.String r3 = (java.lang.String) r3
            java.util.Objects.requireNonNull(r3)
            return r3
    }

    public final int i(defpackage.eg0 r3, boolean r4) {
            r2 = this;
            cg0 r0 = r3.q()
            zi7 r2 = r2.h
            n23 r2 = (defpackage.n23) r2
            r1 = 0
            int r2 = r2.K(r1)
            int r2 = r0.p(r2)
            boolean r3 = r3.o()
            if (r3 != 0) goto L1e
            if (r4 == 0) goto L1e
            int r2 = -r2
            int r2 = defpackage.k97.i(r2)
        L1e:
            return r2
    }

    public final defpackage.eg0 j() {
            r1 = this;
            java.lang.Object r0 = r1.b
            monitor-enter(r0)
            eg0 r1 = r1.n     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public java.util.Set k(defpackage.cg0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public java.util.Set l() {
            r0 = this;
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
    }

    public abstract defpackage.yi7 m(defpackage.yy0 r1);

    public boolean n() {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.r13
            return r0
    }

    public final boolean o(defpackage.eg0 r4) {
            r3 = this;
            zi7 r3 = r3.h
            n23 r3 = (defpackage.n23) r3
            xx r0 = defpackage.n23.r
            r1 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r3.b(r0, r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 == r1) goto L31
            if (r3 == 0) goto L31
            r0 = 1
            if (r3 == r0) goto L30
            r0 = 2
            if (r3 != r0) goto L24
            boolean r3 = r4.c()
            return r3
        L24:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r0 = "Unknown mirrorMode: "
            java.lang.String r3 = defpackage.lb1.g(r3, r0)
            r4.<init>(r3)
            throw r4
        L30:
            return r0
        L31:
            r3 = 0
            return r3
    }

    public final defpackage.zi7 p(defpackage.cg0 r11, defpackage.zi7 r12, defpackage.zi7 r13) {
            r10 = this;
            if (r13 == 0) goto Lc
            da4 r13 = defpackage.da4.k(r13)
            xx r0 = defpackage.kz6.C
            r13.n(r0)
            goto L10
        Lc:
            da4 r13 = defpackage.da4.d()
        L10:
            java.util.TreeMap r0 = r13.A
            xx r1 = defpackage.n23.o
            zi7 r2 = r10.f
            boolean r1 = r2.i(r1)
            if (r1 != 0) goto L24
            xx r1 = defpackage.n23.s
            boolean r1 = r2.i(r1)
            if (r1 == 0) goto L2f
        L24:
            xx r1 = defpackage.n23.w
            boolean r3 = r0.containsKey(r1)
            if (r3 == 0) goto L2f
            r13.n(r1)
        L2f:
            xx r1 = defpackage.n23.w
            boolean r3 = r2.i(r1)
            if (r3 == 0) goto L4c
            xx r3 = defpackage.n23.u
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L4c
            java.lang.Object r1 = r2.e(r1)
            el5 r1 = (defpackage.el5) r1
            fl5 r1 = r1.b
            if (r1 == 0) goto L4c
            r13.n(r3)
        L4c:
            java.util.Set r1 = r2.c()
            java.util.Iterator r1 = r1.iterator()
        L54:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L64
            java.lang.Object r3 = r1.next()
            xx r3 = (defpackage.xx) r3
            defpackage.yy0.r(r13, r13, r2, r3)
            goto L54
        L64:
            if (r12 == 0) goto L8b
            java.util.Set r1 = r12.c()
            java.util.Iterator r1 = r1.iterator()
        L6e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()
            xx r2 = (defpackage.xx) r2
            java.lang.String r3 = r2.a
            xx r4 = defpackage.kz6.C
            java.lang.String r4 = r4.a
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L87
            goto L6e
        L87:
            defpackage.yy0.r(r13, r13, r12, r2)
            goto L6e
        L8b:
            xx r12 = defpackage.n23.s
            boolean r12 = r0.containsKey(r12)
            if (r12 == 0) goto L9e
            xx r12 = defpackage.n23.o
            boolean r1 = r0.containsKey(r12)
            if (r1 == 0) goto L9e
            r13.n(r12)
        L9e:
            xx r12 = defpackage.n23.w
            boolean r0 = r0.containsKey(r12)
            if (r0 == 0) goto Laf
            java.lang.Object r12 = r13.e(r12)
            el5 r12 = (defpackage.el5) r12
            r12.getClass()
        Laf:
            r12 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r1 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "applyFeaturesToConfig: mFeatureGroup = "
            r4.<init>(r5)
            java.util.HashSet r5 = r10.g
            r4.append(r5)
            java.lang.String r5 = ", this = "
            r4.append(r5)
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "UseCase"
            defpackage.kj2.t(r5, r4)
            java.util.HashSet r4 = r10.g
            if (r4 != 0) goto Le1
            goto L175
        Le1:
            int r5 = defpackage.ar1.c
            android.util.Range r5 = defpackage.yy.h
            in7 r6 = defpackage.kn7.c
            java.util.Iterator r4 = r4.iterator()
            yq1 r7 = defpackage.yq1.d
        Led:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L123
            java.lang.Object r8 = r4.next()
            qu2 r8 = (defpackage.qu2) r8
            boolean r9 = r8 instanceof defpackage.ar1
            if (r9 == 0) goto L102
            ar1 r8 = (defpackage.ar1) r8
            yq1 r7 = r8.a
            goto Led
        L102:
            boolean r9 = r8 instanceof defpackage.nk2
            if (r9 == 0) goto L11a
            nk2 r8 = (defpackage.nk2) r8
            android.util.Range r5 = new android.util.Range
            int r9 = r8.a
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r8 = r8.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r5.<init>(r9, r8)
            goto Led
        L11a:
            boolean r9 = r8 instanceof defpackage.kn7
            if (r9 == 0) goto Led
            kn7 r8 = (defpackage.kn7) r8
            in7 r6 = r8.a
            goto Led
        L123:
            boolean r4 = r10 instanceof defpackage.p25
            if (r4 != 0) goto L12d
            boolean r4 = defpackage.ej2.L(r10)
            if (r4 == 0) goto L132
        L12d:
            xx r4 = defpackage.j23.n
            r13.m(r4, r7)
        L132:
            xx r4 = defpackage.zi7.N
            r13.m(r4, r5)
            int[] r4 = defpackage.ai7.a
            int r5 = r6.ordinal()
            r4 = r4[r5]
            if (r4 == r1) goto L16b
            if (r4 == r12) goto L160
            r12 = 3
            if (r4 == r12) goto L155
            r12 = 4
            if (r4 == r12) goto L14a
            goto L175
        L14a:
            xx r12 = defpackage.zi7.U
            r13.m(r12, r0)
            xx r12 = defpackage.zi7.V
            r13.m(r12, r3)
            goto L175
        L155:
            xx r12 = defpackage.zi7.U
            r13.m(r12, r3)
            xx r12 = defpackage.zi7.V
            r13.m(r12, r0)
            goto L175
        L160:
            xx r12 = defpackage.zi7.U
            r13.m(r12, r2)
            xx r12 = defpackage.zi7.V
            r13.m(r12, r2)
            goto L175
        L16b:
            xx r12 = defpackage.zi7.U
            r13.m(r12, r3)
            xx r12 = defpackage.zi7.V
            r13.m(r12, r3)
        L175:
            yi7 r12 = r10.m(r13)
            zi7 r10 = r10.v(r11, r12)
            return r10
    }

    public final void q() {
            r1 = this;
            bi7 r0 = defpackage.bi7.ACTIVE
            r1.d = r0
            r1.s()
            return
    }

    public final void r() {
            r2 = this;
            java.util.HashSet r0 = r2.a
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            ci7 r1 = (defpackage.ci7) r1
            r1.b(r2)
            goto L6
        L16:
            return
    }

    public final void s() {
            r3 = this;
            bi7 r0 = r3.d
            int r0 = r0.ordinal()
            java.util.HashSet r1 = r3.a
            if (r0 == 0) goto L22
            r2 = 1
            if (r0 == r2) goto Le
            goto L36
        Le:
            java.util.Iterator r0 = r1.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            ci7 r1 = (defpackage.ci7) r1
            r1.h(r3)
            goto L12
        L22:
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            ci7 r1 = (defpackage.ci7) r1
            r1.d(r3)
            goto L26
        L36:
            return
    }

    public void t() {
            r0 = this;
            return
    }

    public void u() {
            r0 = this;
            return
    }

    public defpackage.zi7 v(defpackage.cg0 r1, defpackage.yi7 r2) {
            r0 = this;
            zi7 r0 = r2.h()
            return r0
    }

    public void w() {
            r0 = this;
            return
    }

    public void x() {
            r0 = this;
            return
    }

    public defpackage.yy y(defpackage.yy0 r1) {
            r0 = this;
            yy r0 = r0.i
            if (r0 == 0) goto Lf
            p87 r0 = r0.b()
            r0.f = r1
            yy r0 = r0.a()
            return r0
        Lf:
            java.lang.String r0 = "Attempt to update the implementation options for a use case without attached stream specifications."
            defpackage.fa6.h(r0)
            r0 = 0
            return r0
    }

    public abstract defpackage.yy z(defpackage.yy r1, defpackage.yy r2);
}
