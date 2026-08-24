package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ib2  reason: default package */
/* loaded from: classes.dex */
public final class ib2 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.xb2 Z;

    public /* synthetic */ ib2(defpackage.xb2 r1, defpackage.r41 r2, int r3) {
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
                case 0: goto L2c;
                case 1: goto L21;
                case 2: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            ib2 r2 = (defpackage.ib2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ib2 r2 = (defpackage.ib2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            ib2 r2 = (defpackage.ib2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L2c:
            r41 r2 = r2.q(r4, r3)
            ib2 r2 = (defpackage.ib2) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            xb2 r1 = r1.Z
            switch(r3) {
                case 0: goto L1c;
                case 1: goto L15;
                case 2: goto Le;
                default: goto L7;
            }
        L7:
            ib2 r3 = new ib2
            r0 = 3
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            ib2 r3 = new ib2
            r0 = 2
            r3.<init>(r1, r2, r0)
            return r3
        L15:
            ib2 r3 = new ib2
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        L1c:
            ib2 r3 = new ib2
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            jg7 r1 = defpackage.jg7.a
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            xb2 r3 = r9.Z
            r4 = 1
            r5 = 0
            switch(r0) {
                case 0: goto Lb8;
                case 1: goto L82;
                case 2: goto L64;
                default: goto Ld;
            }
        Ld:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r9.Y
            r7 = 2
            r8 = 3
            if (r6 == 0) goto L2c
            if (r6 == r4) goto L28
            if (r6 == r7) goto L24
            if (r6 != r8) goto L1f
            defpackage.oi2.Y(r10)
            goto L63
        L1f:
            defpackage.i.m(r2)
            r1 = r5
            goto L63
        L24:
            defpackage.oi2.Y(r10)
            goto L57
        L28:
            defpackage.oi2.Y(r10)
            goto L3b
        L2c:
            defpackage.oi2.Y(r10)
            tp6 r10 = r3.l
            m06 r2 = defpackage.m06.SCANNING
            r9.Y = r4
            r10.a(r2, r9)
            if (r1 != r0) goto L3b
            goto L62
        L3b:
            r3.getClass()
            wb2 r10 = new wb2
            r10.<init>(r3, r5, r5)
            g21 r2 = new g21
            r4 = 7
            r2.<init>(r10, r4)
            hb2 r10 = new hb2
            r10.<init>(r3, r7)
            r9.Y = r7
            java.lang.Object r10 = r2.b(r10, r9)
            if (r10 != r0) goto L57
            goto L62
        L57:
            tp6 r10 = r3.l
            m06 r2 = defpackage.m06.NOT_SCANNING
            r9.Y = r8
            r10.a(r2, r9)
            if (r1 != r0) goto L63
        L62:
            r1 = r0
        L63:
            return r1
        L64:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r9.Y
            if (r6 == 0) goto L75
            if (r6 != r4) goto L70
            defpackage.oi2.Y(r10)
            goto L81
        L70:
            defpackage.i.m(r2)
            r1 = r5
            goto L81
        L75:
            defpackage.oi2.Y(r10)
            r9.Y = r4
            java.lang.Object r9 = defpackage.xb2.b(r3, r9)
            if (r9 != r0) goto L81
            r1 = r0
        L81:
            return r1
        L82:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r6 = r9.Y
            if (r6 == 0) goto L93
            if (r6 != r4) goto L8e
            defpackage.oi2.Y(r10)
            goto Lb7
        L8e:
            defpackage.i.m(r2)
            r1 = r5
            goto Lb7
        L93:
            defpackage.oi2.Y(r10)
            kd6 r10 = r3.c
            ng6 r10 = (defpackage.ng6) r10
            vf6 r2 = new vf6
            r6 = 11
            r2.<init>(r10, r6)
            java.lang.String r6 = "rom_search_dirs"
            wp0 r10 = r10.p(r6, r2)
            m5 r2 = new m5
            r6 = 14
            r2.<init>(r3, r5, r6)
            r9.Y = r4
            java.lang.Object r9 = defpackage.f04.v(r10, r2, r9)
            if (r9 != r0) goto Lb7
            r1 = r0
        Lb7:
            return r1
        Lb8:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r9.Y
            if (r1 == 0) goto Lc8
            if (r1 == r4) goto Lc4
            defpackage.i.m(r2)
            goto Le3
        Lc4:
            defpackage.oi2.Y(r10)
            goto Le0
        Lc8:
            defpackage.oi2.Y(r10)
            of6 r10 = r3.k
            hb2 r1 = new hb2
            r2 = 0
            r1.<init>(r3, r2)
            r9.Y = r4
            r10.getClass()
            x61 r9 = defpackage.of6.m(r10, r1, r9)
            if (r9 != r0) goto Le0
            r5 = r0
            goto Le3
        Le0:
            defpackage.e41.c()
        Le3:
            return r5
    }
}
