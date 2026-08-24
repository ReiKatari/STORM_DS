package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: og1  reason: default package */
/* loaded from: classes.dex */
public final class og1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.qg1 Z;
    public final /* synthetic */ java.util.Map d0;
    public final /* synthetic */ defpackage.ki7 e0;
    public final /* synthetic */ defpackage.xy0 f0;

    public /* synthetic */ og1(defpackage.qg1 r1, defpackage.r41 r2, java.util.Map r3, defpackage.ki7 r4, defpackage.xy0 r5, int r6) {
            r0 = this;
            r0.X = r6
            r0.Z = r1
            r0.d0 = r3
            r0.e0 = r4
            r0.f0 = r5
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            og1 r2 = (defpackage.og1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            og1 r2 = (defpackage.og1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r9, java.lang.Object r10) {
            r8 = this;
            int r10 = r8.X
            switch(r10) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            og1 r0 = new og1
            xy0 r5 = r8.f0
            r6 = 1
            qg1 r1 = r8.Z
            java.util.Map r3 = r8.d0
            ki7 r4 = r8.e0
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L15:
            r2 = r9
            og1 r1 = new og1
            xy0 r6 = r8.f0
            r7 = 0
            r3 = r2
            qg1 r2 = r8.Z
            java.util.Map r4 = r8.d0
            ki7 r5 = r8.e0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            xy0 r1 = r9.f0
            ki7 r2 = r9.e0
            java.util.Map r3 = r9.d0
            qg1 r4 = r9.Z
            r5 = 0
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r7 = 1
            switch(r0) {
                case 0: goto L37;
                default: goto L11;
            }
        L11:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L22
            if (r8 != r7) goto L1d
            defpackage.oi2.Y(r10)
            goto L36
        L1d:
            defpackage.i.m(r6)
            r10 = r5
            goto L36
        L22:
            defpackage.oi2.Y(r10)
            ri7 r10 = defpackage.qg1.k(r4)
            jg1 r10 = r10.h(r3, r2, r1)
            r9.Y = r7
            java.lang.Object r10 = r10.X(r9)
            if (r10 != r0) goto L36
            r10 = r0
        L36:
            return r10
        L37:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r9.Y
            if (r8 == 0) goto L48
            if (r8 != r7) goto L43
            defpackage.oi2.Y(r10)
            goto L5e
        L43:
            defpackage.i.m(r6)
            r10 = r5
            goto L5e
        L48:
            defpackage.oi2.Y(r10)
            ri7 r10 = defpackage.qg1.k(r4)
            jg1 r10 = r10.i(r3, r2, r1)
            r9.Y = r7
            tu0 r10 = (defpackage.tu0) r10
            java.lang.Object r10 = r10.q(r9)
            if (r10 != r0) goto L5e
            r10 = r0
        L5e:
            return r10
    }
}
