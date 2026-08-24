package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bj6  reason: default package */
/* loaded from: classes.dex */
public final class bj6 extends defpackage.hb3 {
    public defpackage.io6 l0;
    public long m0;
    public long n0;
    public boolean o0;
    public final defpackage.vs4 p0;

    public bj6(defpackage.io6 r3) {
            r2 = this;
            r0 = 1
            r2.<init>(r0)
            r2.l0 = r3
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r2.m0 = r0
            r3 = 0
            r0 = 15
            long r0 = defpackage.s21.b(r3, r3, r3, r3, r0)
            r2.n0 = r0
            r3 = 0
            vs4 r3 = defpackage.np2.Y(r3)
            r2.p0 = r3
            return
    }

    @Override // defpackage.z64
    public final void J0() {
            r2 = this;
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r2.m0 = r0
            r0 = 0
            r2.o0 = r0
            return
    }

    @Override // defpackage.z64
    public final void L0() {
            r1 = this;
            r0 = 0
            vs4 r1 = r1.p0
            r1.setValue(r0)
            return
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r19, defpackage.x24 r20, long r21) {
            r18 = this;
            r1 = r18
            r6 = r21
            boolean r0 = r19.a0()
            r2 = 1
            if (r0 == 0) goto L15
            r1.n0 = r6
            r1.o0 = r2
            dx4 r0 = r20.y(r21)
        L13:
            r8 = r0
            goto L25
        L15:
            boolean r0 = r1.o0
            if (r0 == 0) goto L1e
            long r3 = r1.n0
        L1b:
            r0 = r20
            goto L20
        L1e:
            r3 = r6
            goto L1b
        L20:
            dx4 r0 = r0.y(r3)
            goto L13
        L25:
            int r0 = r8.A
            int r3 = r8.B
            long r4 = (long) r0
            r9 = 32
            long r4 = r4 << r9
            long r10 = (long) r3
            r12 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r12
            long r10 = r10 | r4
            boolean r0 = r19.a0()
            if (r0 == 0) goto L44
            r1.m0 = r10
            r20 = r9
            r0 = r10
            r16 = r0
            goto Lea
        L44:
            long r3 = r1.m0
            r14 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            boolean r0 = defpackage.q93.b(r3, r14)
            if (r0 != 0) goto L54
            long r3 = r1.m0
            goto L55
        L54:
            r3 = r10
        L55:
            vs4 r14 = r1.p0
            java.lang.Object r0 = r14.getValue()
            zi6 r0 = (defpackage.zi6) r0
            if (r0 == 0) goto Lb7
            gn r5 = r0.a
            java.lang.Object r15 = r5.d()
            q93 r15 = (defpackage.q93) r15
            r20 = r9
            r16 = r10
            long r9 = r15.a
            boolean r9 = defpackage.q93.b(r3, r9)
            if (r9 != 0) goto L82
            vs4 r9 = r5.d
            java.lang.Object r9 = r9.getValue()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L82
            goto L83
        L82:
            r2 = 0
        L83:
            vs4 r9 = r5.e
            java.lang.Object r9 = r9.getValue()
            q93 r9 = (defpackage.q93) r9
            long r9 = r9.a
            boolean r9 = defpackage.q93.b(r3, r9)
            if (r9 == 0) goto L98
            if (r2 == 0) goto L96
            goto L98
        L96:
            r1 = r0
            goto Lb5
        L98:
            java.lang.Object r2 = r5.d()
            q93 r2 = (defpackage.q93) r2
            long r9 = r2.a
            r0.b = r9
            w61 r9 = r1.F0()
            r1 = r0
            wk0 r0 = new wk0
            r5 = 0
            r2 = r3
            r4 = r18
            r0.<init>(r1, r2, r4, r5)
            r2 = 3
            r3 = 0
            defpackage.hv.L(r9, r3, r3, r0, r2)
        Lb5:
            r0 = r1
            goto Ld9
        Lb7:
            r2 = r3
            r20 = r9
            r16 = r10
            zi6 r0 = new zi6
            gn r1 = new gn
            q93 r4 = new q93
            r4.<init>(r2)
            wc7 r5 = defpackage.nw7.l0
            q93 r9 = new q93
            r10 = 4294967297(0x100000001, double:2.1219957915E-314)
            r9.<init>(r10)
            r10 = 8
            r1.<init>(r4, r5, r9, r10)
            r0.<init>(r1, r2)
        Ld9:
            r14.setValue(r0)
            gn r0 = r0.a
            java.lang.Object r0 = r0.d()
            q93 r0 = (defpackage.q93) r0
            long r0 = r0.a
            long r0 = defpackage.s21.d(r6, r0)
        Lea:
            long r2 = r0 >> r20
            int r4 = (int) r2
            long r0 = r0 & r12
            int r5 = (int) r0
            aj6 r0 = new aj6
            r1 = r18
            r6 = r19
            r7 = r8
            r2 = r16
            r0.<init>(r1, r2, r4, r5, r6, r7)
            zt1 r1 = defpackage.zt1.A
            f34 r0 = r6.K(r4, r5, r1, r0)
            return r0
    }
}
