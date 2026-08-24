package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d0  reason: default package */
/* loaded from: classes.dex */
public final class d0 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.r94 Z;
    public final /* synthetic */ defpackage.l25 d0;

    public d0(defpackage.l25 r2, defpackage.r94 r3, defpackage.r41 r4) {
            r1 = this;
            r0 = 0
            r1.X = r0
            r1.d0 = r2
            r1.Z = r3
            r2 = 2
            r1.<init>(r2, r4)
            return
    }

    public /* synthetic */ d0(defpackage.r94 r1, defpackage.l25 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Z = r1
            r0.d0 = r2
            r1 = 2
            r0.<init>(r1, r3)
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
            d0 r2 = (defpackage.d0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            d0 r2 = (defpackage.d0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L21:
            r41 r2 = r2.q(r4, r3)
            d0 r2 = (defpackage.d0) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            l25 r0 = r2.d0
            r94 r2 = r2.Z
            switch(r4) {
                case 0: goto L17;
                case 1: goto L10;
                default: goto L9;
            }
        L9:
            d0 r4 = new d0
            r1 = 2
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            d0 r4 = new d0
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L17:
            d0 r4 = new d0
            r4.<init>(r0, r2, r3)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.X
            jg7 r1 = defpackage.jg7.a
            l25 r2 = r8.d0
            r94 r3 = r8.Z
            r4 = 0
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r6 = 1
            switch(r0) {
                case 0: goto L4b;
                case 1: goto L2d;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L20
            if (r7 != r6) goto L1b
            defpackage.oi2.Y(r9)
            goto L2c
        L1b:
            defpackage.i.m(r5)
            r1 = r4
            goto L2c
        L20:
            defpackage.oi2.Y(r9)
            r8.Y = r6
            java.lang.Object r8 = r3.a(r2, r8)
            if (r8 != r0) goto L2c
            r1 = r0
        L2c:
            return r1
        L2d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L3e
            if (r7 != r6) goto L39
            defpackage.oi2.Y(r9)
            goto L4a
        L39:
            defpackage.i.m(r5)
            r1 = r4
            goto L4a
        L3e:
            defpackage.oi2.Y(r9)
            r8.Y = r6
            java.lang.Object r8 = r3.a(r2, r8)
            if (r8 != r0) goto L4a
            r1 = r0
        L4a:
            return r1
        L4b:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r8.Y
            if (r7 == 0) goto L5c
            if (r7 != r6) goto L57
            defpackage.oi2.Y(r9)
            goto L6d
        L57:
            defpackage.i.m(r5)
            r1 = r4
            goto L6d
        L5c:
            defpackage.oi2.Y(r9)
            m25 r9 = new m25
            r9.<init>(r2)
            r8.Y = r6
            java.lang.Object r8 = r3.a(r9, r8)
            if (r8 != r0) goto L6d
            r1 = r0
        L6d:
            return r1
    }
}
