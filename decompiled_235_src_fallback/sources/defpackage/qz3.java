package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qz3  reason: default package */
/* loaded from: classes.dex */
public final class qz3 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.rz3 L;

    public /* synthetic */ qz3(defpackage.rz3 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r9 = this;
            int r0 = r9.B
            jg7 r1 = defpackage.jg7.a
            rz3 r9 = r9.L
            switch(r0) {
                case 0: goto L65;
                case 1: goto L1c;
                default: goto L9;
            }
        L9:
            wm3 r0 = r9.Y
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            long r2 = r9.u0
            r0.y(r2)
            return r1
        L1c:
            wm3 r0 = r9.Y
            sm3 r2 = r0.a
            boolean r2 = defpackage.bl2.J(r2)
            r3 = 0
            if (r2 != 0) goto L3c
            boolean r2 = r0.c
            if (r2 != 0) goto L3c
            eg4 r2 = r0.a()
            eg4 r2 = r2.o0
            if (r2 == 0) goto L46
            mz3 r2 = r2.W0()
            if (r2 == 0) goto L46
            lz3 r3 = r2.h0
            goto L46
        L3c:
            eg4 r2 = r0.a()
            eg4 r2 = r2.o0
            if (r2 == 0) goto L46
            lz3 r3 = r2.h0
        L46:
            if (r3 != 0) goto L54
            sm3 r2 = r0.a
            zp4 r2 = defpackage.vm3.a(r2)
            te r2 = (defpackage.te) r2
            cx4 r3 = r2.getPlacementScope()
        L54:
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            long r4 = r9.k0
            defpackage.cx4.k(r3, r0, r4)
            return r1
        L65:
            wm3 r0 = r9.Y
            r2 = 0
            r0.h = r2
            sm3 r3 = r0.a
            ua4 r3 = r3.z()
            java.lang.Object[] r4 = r3.A
            int r3 = r3.L
            r5 = r2
        L75:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 >= r3) goto L98
            r7 = r4[r5]
            sm3 r7 = (defpackage.sm3) r7
            wm3 r7 = r7.C0
            rz3 r7 = r7.q
            r7.getClass()
            int r8 = r7.e0
            r7.d0 = r8
            r7.e0 = r6
            qm3 r6 = r7.f0
            qm3 r8 = defpackage.qm3.InLayoutBlock
            if (r6 != r8) goto L95
            qm3 r6 = defpackage.qm3.NotUsed
            r7.f0 = r6
        L95:
            int r5 = r5 + 1
            goto L75
        L98:
            sm3 r3 = r0.a
            sm3 r0 = r0.a
            ua4 r3 = r3.z()
            java.lang.Object[] r4 = r3.A
            int r3 = r3.L
            r5 = r2
        La5:
            if (r5 >= r3) goto Lb9
            r7 = r4[r5]
            sm3 r7 = (defpackage.sm3) r7
            wm3 r7 = r7.C0
            rz3 r7 = r7.q
            r7.getClass()
            tm3 r7 = r7.n0
            r7.d = r2
            int r5 = r5 + 1
            goto La5
        Lb9:
            y53 r3 = r9.f()
            x53 r3 = r3.Q0
            if (r3 == 0) goto Le9
            boolean r3 = r3.g0
            java.util.List r4 = r0.n()
            aa4 r4 = (defpackage.aa4) r4
            java.lang.Object r5 = r4.B
            ua4 r5 = (defpackage.ua4) r5
            int r5 = r5.L
            r7 = r2
        Ld0:
            if (r7 >= r5) goto Le9
            java.lang.Object r8 = r4.get(r7)
            sm3 r8 = (defpackage.sm3) r8
            if0 r8 = r8.B0
            java.lang.Object r8 = r8.e
            eg4 r8 = (defpackage.eg4) r8
            mz3 r8 = r8.W0()
            if (r8 == 0) goto Le6
            r8.g0 = r3
        Le6:
            int r7 = r7 + 1
            goto Ld0
        Le9:
            y53 r3 = r9.f()
            x53 r3 = r3.Q0
            r3.getClass()
            f34 r3 = r3.G0()
            r3.a()
            y53 r9 = r9.f()
            x53 r9 = r9.Q0
            if (r9 == 0) goto L127
            java.util.List r9 = r0.n()
            aa4 r9 = (defpackage.aa4) r9
            java.lang.Object r3 = r9.B
            ua4 r3 = (defpackage.ua4) r3
            int r3 = r3.L
            r4 = r2
        L10e:
            if (r4 >= r3) goto L127
            java.lang.Object r5 = r9.get(r4)
            sm3 r5 = (defpackage.sm3) r5
            if0 r5 = r5.B0
            java.lang.Object r5 = r5.e
            eg4 r5 = (defpackage.eg4) r5
            mz3 r5 = r5.W0()
            if (r5 == 0) goto L124
            r5.g0 = r2
        L124:
            int r4 = r4 + 1
            goto L10e
        L127:
            ua4 r9 = r0.z()
            java.lang.Object[] r3 = r9.A
            int r9 = r9.L
            r4 = r2
        L130:
            if (r4 >= r9) goto L14c
            r5 = r3[r4]
            sm3 r5 = (defpackage.sm3) r5
            wm3 r5 = r5.C0
            rz3 r5 = r5.q
            r5.getClass()
            int r7 = r5.d0
            int r8 = r5.e0
            if (r7 == r8) goto L149
            if (r8 != r6) goto L149
            r7 = 1
            r5.u0(r7)
        L149:
            int r4 = r4 + 1
            goto L130
        L14c:
            ua4 r9 = r0.z()
            java.lang.Object[] r0 = r9.A
            int r9 = r9.L
        L154:
            if (r2 >= r9) goto L16a
            r3 = r0[r2]
            sm3 r3 = (defpackage.sm3) r3
            wm3 r3 = r3.C0
            rz3 r3 = r3.q
            r3.getClass()
            tm3 r3 = r3.n0
            boolean r4 = r3.d
            r3.e = r4
            int r2 = r2 + 1
            goto L154
        L16a:
            return r1
    }
}
