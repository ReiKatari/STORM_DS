package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um  reason: default package */
/* loaded from: classes.dex */
public final class um implements defpackage.j61 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;
    public final java.lang.Object L;

    public um(android.view.Choreographer r2, defpackage.sm r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public um(defpackage.df5 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            s9 r2 = new s9
            r0 = 2
            r2.<init>(r0)
            r1.L = r2
            return
    }

    public um(defpackage.um r2) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.B = r2
            bk1 r2 = new bk1
            r0 = 3
            r2.<init>(r0)
            r1.L = r2
            return
    }

    @Override // defpackage.l61
    public final defpackage.l61 D(defpackage.k61 r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            l61 r1 = defpackage.jw2.w(r1, r2)
            return r1
        La:
            l61 r1 = defpackage.jw2.w(r1, r2)
            return r1
        Lf:
            l61 r1 = defpackage.jw2.w(r1, r2)
            return r1
    }

    @Override // defpackage.l61
    public final defpackage.l61 N(defpackage.l61 r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            l61 r1 = defpackage.jw2.y(r1, r2)
            return r1
        La:
            l61 r1 = defpackage.jw2.y(r1, r2)
            return r1
        Lf:
            l61 r1 = defpackage.jw2.y(r1, r2)
            return r1
    }

    @Override // defpackage.l61
    public final defpackage.j61 Z(defpackage.k61 r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            j61 r1 = defpackage.jw2.p(r1, r2)
            return r1
        La:
            j61 r1 = defpackage.jw2.p(r1, r2)
            return r1
        Lf:
            j61 r1 = defpackage.jw2.p(r1, r2)
            return r1
    }

    public final java.lang.Object a(defpackage.qn2 r8, defpackage.r41 r9) {
            r7 = this;
            int r0 = r7.A
            r1 = 1
            switch(r0) {
                case 0: goto Lc7;
                case 1: goto L96;
                default: goto L6;
            }
        L6:
            boolean r0 = r9 instanceof defpackage.lu4
            if (r0 == 0) goto L19
            r0 = r9
            lu4 r0 = (defpackage.lu4) r0
            int r2 = r0.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L19
            int r2 = r2 - r3
            r0.Z = r2
            goto L1e
        L19:
            lu4 r0 = new lu4
            r0.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r0.X
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r0.Z
            r4 = 0
            r5 = 2
            if (r3 == 0) goto L3d
            if (r3 == r1) goto L37
            if (r3 != r5) goto L30
            defpackage.oi2.Y(r9)
            goto L8f
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r9 = r4
            goto L8f
        L37:
            qn2 r8 = r0.R
            defpackage.oi2.Y(r9)
            goto L80
        L3d:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r7.L
            bk1 r9 = (defpackage.bk1) r9
            r0.R = r8
            r0.Z = r1
            java.lang.Object r3 = r9.L
            monitor-enter(r3)
            boolean r6 = r9.A     // Catch: java.lang.Throwable -> L93
            monitor-exit(r3)
            if (r6 == 0) goto L53
            jg7 r9 = defpackage.jg7.a
            goto L7d
        L53:
            rj0 r3 = new rj0
            r41 r6 = defpackage.np2.V(r0)
            r3.<init>(r1, r6)
            r3.v()
            java.lang.Object r1 = r9.L
            monitor-enter(r1)
            java.lang.Object r6 = r9.B     // Catch: java.lang.Throwable -> L90
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L90
            r6.add(r3)     // Catch: java.lang.Throwable -> L90
            monitor-exit(r1)
            r5 r1 = new r5
            r6 = 14
            r1.<init>(r6, r9, r3)
            r3.z(r1)
            java.lang.Object r9 = r3.s()
            if (r9 != r2) goto L7b
            goto L7d
        L7b:
            jg7 r9 = defpackage.jg7.a
        L7d:
            if (r9 != r2) goto L80
            goto L8e
        L80:
            java.lang.Object r7 = r7.B
            um r7 = (defpackage.um) r7
            r0.R = r4
            r0.Z = r5
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r2) goto L8f
        L8e:
            r9 = r2
        L8f:
            return r9
        L90:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        L93:
            r7 = move-exception
            monitor-exit(r3)
            throw r7
        L96:
            rj0 r0 = new rj0
            r41 r9 = defpackage.np2.V(r9)
            r0.<init>(r1, r9)
            r0.v()
            java.lang.Object r9 = r7.L
            s9 r9 = (defpackage.s9) r9
            c80 r1 = new c80
            r1.<init>()
            r1.a = r0
            r1.b = r8
            java.lang.Object r7 = r7.B
            df5 r7 = (defpackage.df5) r7
            tj0 r7 = r9.i(r1, r7)
            d80 r8 = new d80
            r9 = 0
            r8.<init>(r7, r9)
            r0.z(r8)
            java.lang.Object r7 = r0.s()
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            return r7
        Lc7:
            java.lang.Object r0 = r7.L
            sm r0 = (defpackage.sm) r0
            rj0 r2 = new rj0
            r41 r9 = defpackage.np2.V(r9)
            r2.<init>(r1, r9)
            r2.v()
            tm r9 = new tm
            r9.<init>(r2, r7, r8)
            android.view.Choreographer r8 = r0.L
            java.lang.Object r3 = r7.B
            android.view.Choreographer r3 = (android.view.Choreographer) r3
            boolean r8 = defpackage.nb3.k(r8, r3)
            if (r8 == 0) goto L10d
            java.lang.Object r7 = r0.X
            monitor-enter(r7)
            java.util.ArrayList r8 = r0.Z     // Catch: java.lang.Throwable -> Lfe
            r8.add(r9)     // Catch: java.lang.Throwable -> Lfe
            boolean r8 = r0.f0     // Catch: java.lang.Throwable -> Lfe
            if (r8 != 0) goto L100
            r0.f0 = r1     // Catch: java.lang.Throwable -> Lfe
            android.view.Choreographer r8 = r0.L     // Catch: java.lang.Throwable -> Lfe
            rm r1 = r0.g0     // Catch: java.lang.Throwable -> Lfe
            r8.postFrameCallback(r1)     // Catch: java.lang.Throwable -> Lfe
            goto L100
        Lfe:
            r8 = move-exception
            goto L10b
        L100:
            monitor-exit(r7)
            qj r7 = new qj
            r8 = 3
            r7.<init>(r8, r0, r9)
            r2.z(r7)
            goto L11d
        L10b:
            monitor-exit(r7)
            throw r8
        L10d:
            java.lang.Object r8 = r7.B
            android.view.Choreographer r8 = (android.view.Choreographer) r8
            r8.postFrameCallback(r9)
            qj r8 = new qj
            r0 = 4
            r8.<init>(r0, r7, r9)
            r2.z(r8)
        L11d:
            java.lang.Object r7 = r2.s()
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            return r7
    }

    @Override // defpackage.j61
    public defpackage.k61 getKey() {
            r0 = this;
            vs0 r0 = defpackage.vs0.i0
            return r0
    }

    @Override // defpackage.l61
    public final java.lang.Object x(defpackage.eo2 r2, java.lang.Object r3) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r2.o(r3, r1)
            return r1
        La:
            java.lang.Object r1 = r2.o(r3, r1)
            return r1
        Lf:
            java.lang.Object r1 = r2.o(r3, r1)
            return r1
    }
}
