package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ga1  reason: default package */
/* loaded from: classes.dex */
public final class ga1 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ defpackage.la1 Z;
    public final /* synthetic */ me.magnum.melonds.domain.model.DSiWareTitle d0;

    public /* synthetic */ ga1(defpackage.la1 r1, me.magnum.melonds.domain.model.DSiWareTitle r2, defpackage.r41 r3, int r4) {
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
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            ga1 r2 = (defpackage.ga1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            ga1 r2 = (defpackage.ga1) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            switch(r4) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            ga1 r4 = new ga1
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r2.d0
            r1 = 1
            la1 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ga1 r4 = new ga1
            me.magnum.melonds.domain.model.DSiWareTitle r0 = r2.d0
            r1 = 0
            la1 r2 = r2.Z
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r10) {
            r9 = this;
            int r0 = r9.X
            jg7 r1 = defpackage.jg7.a
            me.magnum.melonds.domain.model.DSiWareTitle r2 = r9.d0
            la1 r3 = r9.Z
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r5 = 1
            r6 = 0
            switch(r0) {
                case 0: goto L35;
                default: goto Lf;
            }
        Lf:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            if (r7 == 0) goto L20
            if (r7 != r5) goto L1b
            defpackage.oi2.Y(r10)
            goto L34
        L1b:
            defpackage.i.m(r4)
            r1 = r6
            goto L34
        L20:
            defpackage.oi2.Y(r10)
            xe1 r10 = defpackage.xk1.a
            ga1 r4 = new ga1
            r7 = 0
            r4.<init>(r3, r2, r6, r7)
            r9.Y = r5
            java.lang.Object r9 = defpackage.hv.d0(r10, r4, r9)
            if (r9 != r0) goto L34
            r1 = r0
        L34:
            return r1
        L35:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r7 = r9.Y
            r8 = 2
            if (r7 == 0) goto L4d
            if (r7 == r5) goto L49
            if (r7 != r8) goto L44
            defpackage.oi2.Y(r10)
            goto L67
        L44:
            defpackage.i.m(r4)
            r1 = r6
            goto L76
        L49:
            defpackage.oi2.Y(r10)
            goto L5b
        L4d:
            defpackage.oi2.Y(r10)
            fg r10 = r3.b
            r9.Y = r5
            java.lang.Object r10 = r10.c(r2, r9)
            if (r10 != r0) goto L5b
            goto L65
        L5b:
            fg r10 = r3.b
            r9.Y = r8
            java.io.Serializable r10 = r10.h(r9)
            if (r10 != r0) goto L67
        L65:
            r1 = r0
            goto L76
        L67:
            java.util.List r10 = (java.util.List) r10
            tp6 r9 = r3.g
            ea1 r0 = new ea1
            r0.<init>(r10)
            r9.getClass()
            r9.m(r6, r0)
        L76:
            return r1
    }
}
