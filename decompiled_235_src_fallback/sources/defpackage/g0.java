package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g0  reason: default package */
/* loaded from: classes.dex */
public final class g0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.h0 Y;

    public /* synthetic */ g0(defpackage.h0 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
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
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            g0 r2 = (defpackage.g0) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            g0 r2 = (defpackage.g0) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r2, java.lang.Object r3) {
            r1 = this;
            int r3 = r1.X
            h0 r1 = r1.Y
            switch(r3) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            g0 r3 = new g0
            r0 = 1
            r3.<init>(r1, r2, r0)
            return r3
        Le:
            g0 r3 = new g0
            r0 = 0
            r3.<init>(r1, r2, r0)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.X
            jg7 r1 = defpackage.jg7.a
            r2 = 3
            r3 = 0
            h0 r7 = r7.Y
            switch(r0) {
                case 0: goto L2d;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            oy2 r8 = r7.y0
            if (r8 == 0) goto L2c
            py2 r0 = new py2
            r0.<init>(r8)
            r94 r8 = r7.m0
            if (r8 == 0) goto L2a
            w61 r4 = r7.F0()
            z r5 = new z
            r6 = 1
            r5.<init>(r8, r0, r3, r6)
            defpackage.hv.L(r4, r3, r3, r5, r2)
        L2a:
            r7.y0 = r3
        L2c:
            return r1
        L2d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r8)
            oy2 r8 = r7.y0
            if (r8 != 0) goto L4e
            oy2 r8 = new oy2
            r8.<init>()
            r94 r0 = r7.m0
            if (r0 == 0) goto L4c
            w61 r4 = r7.F0()
            z r5 = new z
            r6 = 0
            r5.<init>(r0, r8, r3, r6)
            defpackage.hv.L(r4, r3, r3, r5, r2)
        L4c:
            r7.y0 = r8
        L4e:
            return r1
    }
}
