package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c34  reason: default package */
/* loaded from: classes.dex */
public final class c34 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.d34 L;

    public /* synthetic */ c34(defpackage.d34 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r10 = this;
            int r0 = r10.B
            jg7 r1 = defpackage.jg7.a
            d34 r10 = r10.L
            switch(r0) {
                case 0: goto L64;
                case 1: goto L58;
                default: goto L9;
            }
        L9:
            wm3 r0 = r10.Y
            eg4 r2 = r0.a()
            eg4 r2 = r2.o0
            if (r2 == 0) goto L17
            lz3 r2 = r2.h0
            if (r2 != 0) goto L23
        L17:
            sm3 r2 = r0.a
            zp4 r2 = defpackage.vm3.a(r2)
            te r2 = (defpackage.te) r2
            cx4 r2 = r2.getPlacementScope()
        L23:
            qn2 r3 = r10.C0
            if (r3 != 0) goto L40
            eg4 r0 = r0.a()
            long r3 = r10.D0
            float r10 = r10.E0
            r2.getClass()
            defpackage.cx4.b(r2, r0)
            long r5 = r0.X
            long r2 = defpackage.i93.c(r3, r5)
            r4 = 0
            r0.h0(r2, r10, r4)
            goto L57
        L40:
            eg4 r0 = r0.a()
            long r4 = r10.D0
            float r10 = r10.E0
            r2.getClass()
            defpackage.cx4.b(r2, r0)
            long r6 = r0.X
            long r4 = defpackage.i93.c(r4, r6)
            r0.h0(r4, r10, r3)
        L57:
            return r1
        L58:
            wm3 r0 = r10.Y
            eg4 r0 = r0.a()
            long r2 = r10.x0
            r0.y(r2)
            return r1
        L64:
            wm3 r0 = r10.Y
            r2 = 0
            r0.i = r2
            sm3 r3 = r0.a
            ua4 r3 = r3.z()
            java.lang.Object[] r4 = r3.A
            int r3 = r3.L
            r5 = r2
        L74:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 >= r3) goto L96
            r7 = r4[r5]
            sm3 r7 = (defpackage.sm3) r7
            wm3 r7 = r7.C0
            d34 r7 = r7.p
            int r8 = r7.e0
            r7.d0 = r8
            r7.e0 = r6
            r7.p0 = r2
            qm3 r6 = r7.h0
            qm3 r8 = defpackage.qm3.InLayoutBlock
            if (r6 != r8) goto L93
            qm3 r6 = defpackage.qm3.NotUsed
            r7.h0 = r6
        L93:
            int r5 = r5 + 1
            goto L74
        L96:
            sm3 r3 = r0.a
            sm3 r0 = r0.a
            ua4 r3 = r3.z()
            java.lang.Object[] r4 = r3.A
            int r3 = r3.L
            r5 = r2
        La3:
            if (r5 >= r3) goto Lb4
            r7 = r4[r5]
            sm3 r7 = (defpackage.sm3) r7
            wm3 r7 = r7.C0
            d34 r7 = r7.p
            tm3 r7 = r7.t0
            r7.d = r2
            int r5 = r5 + 1
            goto La3
        Lb4:
            y53 r3 = r10.f()
            boolean r3 = r3.g0
            if (r3 == 0) goto Ldd
            java.util.List r3 = r0.n()
            aa4 r3 = (defpackage.aa4) r3
            java.lang.Object r4 = r3.B
            ua4 r4 = (defpackage.ua4) r4
            int r4 = r4.L
            r5 = r2
        Lc9:
            if (r5 >= r4) goto Ldd
            java.lang.Object r7 = r3.get(r5)
            sm3 r7 = (defpackage.sm3) r7
            if0 r7 = r7.B0
            java.lang.Object r7 = r7.e
            eg4 r7 = (defpackage.eg4) r7
            r8 = 1
            r7.g0 = r8
            int r5 = r5 + 1
            goto Lc9
        Ldd:
            y53 r3 = r10.f()
            f34 r3 = r3.G0()
            r3.a()
            y53 r10 = r10.f()
            boolean r10 = r10.g0
            if (r10 == 0) goto L110
            java.util.List r10 = r0.n()
            aa4 r10 = (defpackage.aa4) r10
            java.lang.Object r3 = r10.B
            ua4 r3 = (defpackage.ua4) r3
            int r3 = r3.L
            r4 = r2
        Lfd:
            if (r4 >= r3) goto L110
            java.lang.Object r5 = r10.get(r4)
            sm3 r5 = (defpackage.sm3) r5
            if0 r5 = r5.B0
            java.lang.Object r5 = r5.e
            eg4 r5 = (defpackage.eg4) r5
            r5.g0 = r2
            int r4 = r4 + 1
            goto Lfd
        L110:
            ua4 r10 = r0.z()
            java.lang.Object[] r3 = r10.A
            int r10 = r10.L
            r4 = r2
        L119:
            if (r4 >= r10) goto L151
            r5 = r3[r4]
            sm3 r5 = (defpackage.sm3) r5
            wm3 r7 = r5.C0
            d34 r8 = r7.p
            int r8 = r8.d0
            int r9 = r5.w()
            if (r8 == r9) goto L14e
            r0.O()
            r0.C()
            int r8 = r5.w()
            if (r8 != r6) goto L14e
            boolean r8 = r7.c
            if (r8 != 0) goto L141
            boolean r5 = defpackage.bl2.J(r5)
            if (r5 == 0) goto L149
        L141:
            rz3 r5 = r7.q
            r5.getClass()
            r5.u0(r2)
        L149:
            d34 r5 = r7.p
            r5.w0()
        L14e:
            int r4 = r4 + 1
            goto L119
        L151:
            ua4 r10 = r0.z()
            java.lang.Object[] r0 = r10.A
            int r10 = r10.L
        L159:
            if (r2 >= r10) goto L16c
            r3 = r0[r2]
            sm3 r3 = (defpackage.sm3) r3
            wm3 r3 = r3.C0
            d34 r3 = r3.p
            tm3 r3 = r3.t0
            boolean r4 = r3.d
            r3.e = r4
            int r2 = r2 + 1
            goto L159
        L16c:
            return r1
    }
}
