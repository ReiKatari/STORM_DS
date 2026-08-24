package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l52  reason: default package */
/* loaded from: classes.dex */
public final class l52 extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.n52 L;
    public final /* synthetic */ long R;

    public /* synthetic */ l52(defpackage.n52 r1, long r2, int r4) {
            r0 = this;
            r0.B = r4
            r0.L = r1
            r0.R = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.B
            r1 = 0
            long r3 = r12.R
            r5 = 0
            r6 = 3
            r7 = 2
            r8 = 1
            n52 r9 = r12.L
            switch(r0) {
                case 0: goto Lc8;
                case 1: goto L5e;
                default: goto Lf;
            }
        Lf:
            z42 r13 = (defpackage.z42) r13
            o52 r12 = r9.p0
            ha7 r12 = r12.a
            pj6 r12 = r12.b
            if (r12 == 0) goto L29
            qn2 r12 = r12.a
            q93 r0 = new q93
            r0.<init>(r3)
            java.lang.Object r12 = r12.g(r0)
            i93 r12 = (defpackage.i93) r12
            long r10 = r12.a
            goto L2a
        L29:
            r10 = r1
        L2a:
            z72 r12 = r9.q0
            ha7 r12 = r12.a
            pj6 r12 = r12.b
            if (r12 == 0) goto L42
            qn2 r12 = r12.a
            q93 r0 = new q93
            r0.<init>(r3)
            java.lang.Object r12 = r12.g(r0)
            i93 r12 = (defpackage.i93) r12
            long r3 = r12.a
            goto L43
        L42:
            r3 = r1
        L43:
            int[] r12 = defpackage.j52.a
            int r13 = r13.ordinal()
            r12 = r12[r13]
            if (r12 == r8) goto L58
            if (r12 == r7) goto L57
            if (r12 != r6) goto L53
            r1 = r3
            goto L58
        L53:
            defpackage.i.d()
            goto L5d
        L57:
            r1 = r10
        L58:
            i93 r5 = new i93
            r5.<init>(r1)
        L5d:
            return r5
        L5e:
            z42 r13 = (defpackage.z42) r13
            ic r0 = r9.u0
            if (r0 != 0) goto L65
            goto Lc2
        L65:
            ic r0 = r9.T0()
            if (r0 != 0) goto L6c
            goto Lc2
        L6c:
            ic r0 = r9.u0
            ic r3 = r9.T0()
            boolean r0 = defpackage.nb3.k(r0, r3)
            if (r0 == 0) goto L79
            goto Lc2
        L79:
            int[] r0 = defpackage.j52.a
            int r13 = r13.ordinal()
            r13 = r0[r13]
            if (r13 == r8) goto Lc2
            if (r13 == r7) goto Lc2
            if (r13 != r6) goto Lbe
            z72 r13 = r9.q0
            ha7 r13 = r13.a
            sl0 r13 = r13.c
            if (r13 == 0) goto Lc2
            qn2 r13 = r13.b
            q93 r0 = new q93
            long r2 = r12.R
            r0.<init>(r2)
            java.lang.Object r12 = r13.g(r0)
            q93 r12 = (defpackage.q93) r12
            long r4 = r12.a
            ic r12 = r9.T0()
            r12.getClass()
            kk3 r6 = defpackage.kk3.Ltr
            r1 = r12
            e40 r1 = (defpackage.e40) r1
            long r12 = r1.a(r2, r4, r6)
            ic r1 = r9.u0
            r1.getClass()
            long r0 = r1.a(r2, r4, r6)
            long r1 = defpackage.i93.b(r12, r0)
            goto Lc2
        Lbe:
            defpackage.i.d()
            goto Lc7
        Lc2:
            i93 r5 = new i93
            r5.<init>(r1)
        Lc7:
            return r5
        Lc8:
            z42 r13 = (defpackage.z42) r13
            int[] r12 = defpackage.j52.a
            int r13 = r13.ordinal()
            r12 = r12[r13]
            if (r12 == r8) goto L10b
            if (r12 == r7) goto Lf4
            if (r12 != r6) goto Lf0
            z72 r12 = r9.q0
            ha7 r12 = r12.a
            sl0 r12 = r12.c
            if (r12 == 0) goto L10b
            qn2 r12 = r12.b
            q93 r13 = new q93
            r13.<init>(r3)
            java.lang.Object r12 = r12.g(r13)
            q93 r12 = (defpackage.q93) r12
            long r3 = r12.a
            goto L10b
        Lf0:
            defpackage.i.d()
            goto L110
        Lf4:
            o52 r12 = r9.p0
            ha7 r12 = r12.a
            sl0 r12 = r12.c
            if (r12 == 0) goto L10b
            qn2 r12 = r12.b
            q93 r13 = new q93
            r13.<init>(r3)
            java.lang.Object r12 = r12.g(r13)
            q93 r12 = (defpackage.q93) r12
            long r3 = r12.a
        L10b:
            q93 r5 = new q93
            r5.<init>(r3)
        L110:
            return r5
    }
}
