package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds5  reason: default package */
/* loaded from: classes.dex */
public final class ds5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.qn2 Y;
    public final /* synthetic */ defpackage.mr5 Z;

    public /* synthetic */ ds5(defpackage.qn2 r1, defpackage.mr5 r2, defpackage.r41 r3, int r4) {
            r0 = this;
            r0.X = r4
            r0.Y = r1
            r0.Z = r2
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
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            ds5 r2 = (defpackage.ds5) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            ds5 r2 = (defpackage.ds5) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r4 = r2.X
            mr5 r0 = r2.Z
            qn2 r2 = r2.Y
            switch(r4) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            ds5 r4 = new ds5
            r1 = 1
            r4.<init>(r2, r0, r3, r1)
            return r4
        L10:
            ds5 r4 = new ds5
            r1 = 0
            r4.<init>(r2, r0, r3, r1)
            return r4
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            mr5 r2 = r3.Z
            qn2 r3 = r3.Y
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            pq5 r4 = r2.a
            r3.g(r4)
            return r1
        L16:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            pq5 r4 = r2.a
            r3.g(r4)
            return r1
    }
}
