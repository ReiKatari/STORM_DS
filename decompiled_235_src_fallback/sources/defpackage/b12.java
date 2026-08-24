package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b12  reason: default package */
/* loaded from: classes.dex */
public final class b12 extends defpackage.hw6 implements defpackage.fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ defpackage.ne2 Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.sz1 e0;

    public /* synthetic */ b12(int r1, defpackage.r41 r2, defpackage.sz1 r3) {
            r0 = this;
            r0.X = r1
            r0.e0 = r3
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.fo2
    public final java.lang.Object e(java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            sz1 r3 = r3.e0
            ne2 r4 = (defpackage.ne2) r4
            r41 r6 = (defpackage.r41) r6
            switch(r0) {
                case 0: goto L2b;
                case 1: goto L1c;
                default: goto Ld;
            }
        Ld:
            b12 r0 = new b12
            r2 = 2
            r0.<init>(r2, r6, r3)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L1c:
            b12 r0 = new b12
            r2 = 1
            r0.<init>(r2, r6, r3)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
        L2b:
            b12 r0 = new b12
            r2 = 0
            r0.<init>(r2, r6, r3)
            r0.Z = r4
            r0.d0 = r5
            java.lang.Object r3 = r0.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.X
            r1 = 0
            jg7 r2 = defpackage.jg7.a
            sz1 r3 = r12.e0
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto Lc6;
                case 1: goto L7c;
                default: goto Le;
            }
        Le:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r12.Y
            if (r7 == 0) goto L1f
            if (r7 != r5) goto L1a
            defpackage.oi2.Y(r13)
            goto L7b
        L1a:
            defpackage.i.m(r4)
            r2 = r6
            goto L7b
        L1f:
            defpackage.oi2.Y(r13)
            ne2 r13 = r12.Z
            java.lang.Object r4 = r12.d0
            hy1 r4 = (defpackage.hy1) r4
            boolean r7 = r4 instanceof defpackage.dy1
            if (r7 == 0) goto L2f
            dy1 r4 = (defpackage.dy1) r4
            goto L30
        L2f:
            r4 = r6
        L30:
            if (r4 == 0) goto L39
            pq5 r4 = r4.a
            if (r4 == 0) goto L39
            jt5 r4 = r4.f
            goto L3a
        L39:
            r4 = r6
        L3a:
            kd6 r3 = r3.c
            if (r4 != 0) goto L43
            ng6 r3 = (defpackage.ng6) r3
            be5 r1 = r3.i
            goto L6e
        L43:
            ng6 r3 = (defpackage.ng6) r3
            r3.getClass()
            be5 r7 = r3.i
            wp0 r8 = r3.G()
            wp0 r9 = r3.F()
            wp0 r10 = r3.E()
            jg6 r11 = new jg6
            r11.<init>(r3, r4, r6)
            r3 = 4
            le2[] r3 = new defpackage.le2[r3]
            r3[r1] = r7
            r3[r5] = r8
            r1 = 2
            r3[r1] = r9
            r1 = 3
            r3[r1] = r10
            wp0 r1 = new wp0
            r4 = 5
            r1.<init>(r4, r3, r11)
        L6e:
            r12.Z = r6
            r12.d0 = r6
            r12.Y = r5
            java.lang.Object r12 = defpackage.f04.A(r13, r1, r12)
            if (r12 != r0) goto L7b
            r2 = r0
        L7b:
            return r2
        L7c:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.Y
            if (r1 == 0) goto L8d
            if (r1 != r5) goto L88
            defpackage.oi2.Y(r13)
            goto Lc5
        L88:
            defpackage.i.m(r4)
            r2 = r6
            goto Lc5
        L8d:
            defpackage.oi2.Y(r13)
            ne2 r13 = r12.Z
            java.lang.Object r1 = r12.d0
            pq5 r1 = (defpackage.pq5) r1
            if (r1 == 0) goto L9f
            jt5 r1 = r1.f
            if (r1 == 0) goto L9f
            java.util.UUID r1 = r1.c
            goto La0
        L9f:
            r1 = r6
        La0:
            if (r1 != 0) goto La7
            cm0 r1 = defpackage.sz1.s(r3)
            goto Lb8
        La7:
            wa3 r4 = r3.q
            le2 r1 = r4.e(r1)
            c12 r4 = new c12
            r4.<init>(r5, r6, r3)
            af2 r3 = new af2
            r3.<init>(r1, r4)
            r1 = r3
        Lb8:
            r12.Z = r6
            r12.d0 = r6
            r12.Y = r5
            java.lang.Object r12 = defpackage.f04.A(r13, r1, r12)
            if (r12 != r0) goto Lc5
            r2 = r0
        Lc5:
            return r2
        Lc6:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r12.Y
            if (r7 == 0) goto Ld7
            if (r7 != r5) goto Ld2
            defpackage.oi2.Y(r13)
            goto Lfd
        Ld2:
            defpackage.i.m(r4)
            r2 = r6
            goto Lfd
        Ld7:
            defpackage.oi2.Y(r13)
            ne2 r13 = r12.Z
            java.lang.Object r4 = r12.d0
            java.util.UUID r4 = (java.util.UUID) r4
            wa3 r7 = r3.q
            le2 r4 = r7.e(r4)
            c12 r7 = new c12
            r7.<init>(r1, r6, r3)
            af2 r1 = new af2
            r1.<init>(r4, r7)
            r12.Z = r6
            r12.d0 = r6
            r12.Y = r5
            java.lang.Object r12 = defpackage.f04.A(r13, r1, r12)
            if (r12 != r0) goto Lfd
            r2 = r0
        Lfd:
            return r2
    }
}
