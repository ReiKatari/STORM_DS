package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k27  reason: default package */
/* loaded from: classes.dex */
public final class k27 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ defpackage.p27 Y;

    public /* synthetic */ k27(defpackage.p27 r1, defpackage.r41 r2, int r3) {
            r0 = this;
            r0.X = r3
            r0.Y = r1
            r1 = 1
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            p27 r3 = r3.Y
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L29;
                case 1: goto L1f;
                case 2: goto L15;
                default: goto Lb;
            }
        Lb:
            k27 r0 = new k27
            r2 = 3
            r0.<init>(r3, r4, r2)
            r0.s(r1)
            return r1
        L15:
            k27 r0 = new k27
            r2 = 2
            r0.<init>(r3, r4, r2)
            r0.s(r1)
            return r1
        L1f:
            k27 r0 = new k27
            r2 = 1
            r0.<init>(r3, r4, r2)
            r0.s(r1)
            return r1
        L29:
            k27 r0 = new k27
            r2 = 0
            r0.<init>(r3, r4, r2)
            r0.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.X
            jg7 r1 = defpackage.jg7.a
            p27 r2 = r2.Y
            switch(r0) {
                case 0: goto L26;
                case 1: goto L1d;
                case 2: goto L12;
                default: goto L9;
            }
        L9:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            r2.p()
            return r1
        L12:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            boolean r3 = r2.B
            r2.d(r3)
            return r1
        L1d:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            r2.f()
            return r1
        L26:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            r3 = 0
            r2.B = r3
            return r1
    }
}
