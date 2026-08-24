package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue2  reason: default package */
/* loaded from: classes.dex */
public final class ue2 extends defpackage.hw6 implements defpackage.fo2 {
    public defpackage.dh5 X;
    public defpackage.ch5 Y;
    public int Z;
    public /* synthetic */ java.lang.Object d0;
    public /* synthetic */ java.lang.Object e0;
    public final /* synthetic */ defpackage.t4 f0;
    public final /* synthetic */ defpackage.le2 g0;

    public ue2(defpackage.t4 r1, defpackage.le2 r2, defpackage.r41 r3) {
            r0 = this;
            r0.f0 = r1
            r0.g0 = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r3, java.lang.Object r4, java.lang.Object r5) {
            r2 = this;
            w61 r3 = (defpackage.w61) r3
            ne2 r4 = (defpackage.ne2) r4
            r41 r5 = (defpackage.r41) r5
            ue2 r0 = new ue2
            t4 r1 = r2.f0
            le2 r2 = r2.g0
            r0.<init>(r1, r2, r5)
            r0.d0 = r3
            r0.e0 = r4
            jg7 r2 = defpackage.jg7.a
            java.lang.Object r2 = r0.s(r2)
            return r2
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.Z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L35
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1e
            dh5 r1 = r12.X
            java.lang.Object r5 = r12.e0
            ul0 r5 = (defpackage.ul0) r5
            java.lang.Object r6 = r12.d0
            ne2 r6 = (defpackage.ne2) r6
            defpackage.oi2.Y(r13)
        L1a:
            r7 = r6
            r6 = r5
            r5 = r1
            goto L69
        L1e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r4
        L24:
            ch5 r1 = r12.Y
            dh5 r5 = r12.X
            java.lang.Object r6 = r12.e0
            ul0 r6 = (defpackage.ul0) r6
            java.lang.Object r7 = r12.d0
            ne2 r7 = (defpackage.ne2) r7
            defpackage.oi2.Y(r13)
            goto La4
        L35:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.d0
            w61 r13 = (defpackage.w61) r13
            java.lang.Object r1 = r12.e0
            ne2 r1 = (defpackage.ne2) r1
            xd1 r5 = new xd1
            le2 r6 = r12.g0
            r7 = 17
            r5.<init>(r6, r4, r7)
            m80 r6 = defpackage.m80.SUSPEND
            a71 r7 = defpackage.a71.DEFAULT
            r8 = 4
            r9 = 0
            v80 r6 = defpackage.nb3.c(r9, r6, r4, r8)
            vt1 r8 = defpackage.vt1.A
            l61 r13 = defpackage.mb3.M(r13, r8)
            r35 r8 = new r35
            r8.<init>(r13, r6)
            r7.invoke(r5, r8, r8)
            dh5 r13 = new dh5
            r13.<init>()
            r5 = r13
            r7 = r1
            r6 = r8
        L69:
            java.lang.Object r13 = r5.A
            gr1 r1 = defpackage.fh4.c
            if (r13 == r1) goto Le7
            ch5 r1 = new ch5
            r1.<init>()
            if (r13 == 0) goto La6
            t4 r13 = r12.f0
            long r8 = r13.B
            java.lang.Long r13 = java.lang.Long.valueOf(r8)
            long r8 = r13.longValue()
            r1.A = r8
            r10 = 0
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 < 0) goto Lab
            if (r13 != 0) goto La6
            java.lang.Object r13 = r5.A
            gr1 r8 = defpackage.fh4.a
            if (r13 != r8) goto L93
            r13 = r4
        L93:
            r12.d0 = r7
            r12.e0 = r6
            r12.X = r5
            r12.Y = r1
            r12.Z = r3
            java.lang.Object r13 = r7.a(r13, r12)
            if (r13 != r0) goto La4
            goto Le6
        La4:
            r5.A = r4
        La6:
            r13 = r1
            r1 = r5
            r5 = r6
            r6 = r7
            goto Lb1
        Lab:
            java.lang.String r12 = "Debounce timeout should not be negative"
            defpackage.i.h(r12)
            return r4
        Lb1:
            v96 r7 = new v96
            l61 r8 = r12.B
            r8.getClass()
            r7.<init>(r8)
            java.lang.Object r8 = r1.A
            if (r8 == 0) goto Lca
            long r8 = r13.A
            yc r13 = new yc
            r10 = 6
            r13.<init>(r6, r1, r4, r10)
            defpackage.ii2.I(r7, r8, r13)
        Lca:
            eb r13 = r5.l()
            l5 r8 = new l5
            r8.<init>(r1, r6, r4)
            r7.h(r13, r8)
            r12.d0 = r6
            r12.e0 = r5
            r12.X = r1
            r12.Y = r4
            r12.Z = r2
            java.lang.Object r13 = r7.e(r12)
            if (r13 != r0) goto L1a
        Le6:
            return r0
        Le7:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}
