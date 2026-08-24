package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r81  reason: default package */
/* loaded from: classes.dex */
public final class r81 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.qn2 Z;

    public /* synthetic */ r81(int r1, defpackage.r41 r2, defpackage.qn2 r3) {
            r0 = this;
            r0.X = r1
            r0.Z = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            bt4 r3 = (defpackage.bt4) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            r81 r2 = (defpackage.r81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            r81 r2 = (defpackage.r81) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            qn2 r2 = r2.Z
            switch(r0) {
                case 0: goto L10;
                default: goto L7;
            }
        L7:
            r81 r0 = new r81
            r1 = 1
            r0.<init>(r1, r3, r2)
            r0.Y = r4
            return r0
        L10:
            r81 r0 = new r81
            r1 = 0
            r0.<init>(r1, r3, r2)
            r0.Y = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.X
            qn2 r1 = r2.Z
            switch(r0) {
                case 0: goto L1e;
                default: goto L7;
            }
        L7:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            java.lang.Object r2 = r2.Y
            bt4 r2 = (defpackage.bt4) r2
            r2.getClass()
            ud5 r2 = (defpackage.ud5) r2
            e36 r2 = r2.d()
            java.lang.Object r2 = r1.g(r2)
            return r2
        L1e:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            java.lang.Object r2 = r2.Y
            bt4 r2 = (defpackage.bt4) r2
            r2.getClass()
            ud5 r2 = (defpackage.ud5) r2
            e36 r2 = r2.d()
            java.lang.Object r2 = r1.g(r2)
            return r2
    }
}
