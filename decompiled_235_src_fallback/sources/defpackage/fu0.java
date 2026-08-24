package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fu0  reason: default package */
/* loaded from: classes.dex */
public final class fu0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.gu0 Z;

    public /* synthetic */ fu0(defpackage.gu0 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Z = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            w61 r3 = (defpackage.w61) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L21;
                case 1: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            fu0 r2 = (defpackage.fu0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            fu0 r2 = (defpackage.fu0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            fu0 r2 = (defpackage.fu0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            gu0 r1 = r1.Z
            switch(r3) {
                case 0: goto L15;
                case 1: goto Le;
                default: goto L7;
            }
        L7:
            fu0 r3 = new fu0
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            fu0 r3 = new fu0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            fu0 r3 = new fu0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            r1 = 0
            jg7 r2 = defpackage.jg7.a
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            gu0 r5 = r9.Z
            r6 = 0
            switch(r0) {
                case 0: goto L90;
                case 1: goto L40;
                default: goto Le;
            }
        Le:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.Y
            if (r1 == 0) goto L1f
            if (r1 != r4) goto L1a
            defpackage.oi2.Y(r10)
            goto L38
        L1a:
            defpackage.i.m(r3)
            r2 = r6
            goto L3f
        L1f:
            defpackage.oi2.Y(r10)
            nq6 r10 = defpackage.ky0.t
            java.lang.Object r10 = defpackage.hf.K(r5, r10)
            fo7 r10 = (defpackage.fo7) r10
            long r6 = r10.b()
            r9.Y = r4
            java.lang.Object r9 = defpackage.q60.t(r6, r9)
            if (r9 != r0) goto L38
            r2 = r0
            goto L3f
        L38:
            on2 r9 = r5.H0
            if (r9 == 0) goto L3f
            r9.c()
        L3f:
            return r2
        L40:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L51
            if (r7 != r4) goto L4c
            defpackage.oi2.Y(r10)
            goto L6a
        L4c:
            defpackage.i.m(r3)
            r2 = r6
            goto L8f
        L51:
            defpackage.oi2.Y(r10)
            nq6 r10 = defpackage.ky0.t
            java.lang.Object r10 = defpackage.hf.K(r5, r10)
            fo7 r10 = (defpackage.fo7) r10
            long r7 = r10.b()
            r9.Y = r4
            java.lang.Object r9 = defpackage.q60.t(r7, r9)
            if (r9 != r0) goto L6a
            r2 = r0
            goto L8f
        L6a:
            on2 r9 = r5.H0
            if (r9 == 0) goto L71
            r9.c()
        L71:
            boolean r9 = r5.I0
            if (r9 == 0) goto L82
            nq6 r9 = defpackage.ky0.l
            java.lang.Object r9 = defpackage.hf.K(r5, r9)
            tv2 r9 = (defpackage.tv2) r9
            lx4 r9 = (defpackage.lx4) r9
            r9.a(r1)
        L82:
            r5.W0 = r4
            ap6 r9 = r5.U0
            if (r9 == 0) goto L8b
            r9.h(r6)
        L8b:
            r5.U0 = r6
            r5.T0 = r6
        L8f:
            return r2
        L90:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto La1
            if (r7 != r4) goto L9c
            defpackage.oi2.Y(r10)
            goto Lba
        L9c:
            defpackage.i.m(r3)
            r2 = r6
            goto Ldf
        La1:
            defpackage.oi2.Y(r10)
            nq6 r10 = defpackage.ky0.t
            java.lang.Object r10 = defpackage.hf.K(r5, r10)
            fo7 r10 = (defpackage.fo7) r10
            long r7 = r10.b()
            r9.Y = r4
            java.lang.Object r9 = defpackage.q60.t(r7, r9)
            if (r9 != r0) goto Lba
            r2 = r0
            goto Ldf
        Lba:
            on2 r9 = r5.H0
            if (r9 == 0) goto Lc1
            r9.c()
        Lc1:
            boolean r9 = r5.I0
            if (r9 == 0) goto Ld2
            nq6 r9 = defpackage.ky0.l
            java.lang.Object r9 = defpackage.hf.K(r5, r9)
            tv2 r9 = (defpackage.tv2) r9
            lx4 r9 = (defpackage.lx4) r9
            r9.a(r1)
        Ld2:
            r5.P0 = r4
            ap6 r9 = r5.N0
            if (r9 == 0) goto Ldb
            r9.h(r6)
        Ldb:
            r5.N0 = r6
            r5.M0 = r6
        Ldf:
            return r2
    }
}
