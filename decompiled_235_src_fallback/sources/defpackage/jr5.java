package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jr5  reason: default package */
/* loaded from: classes.dex */
public final class jr5 extends defpackage.hw6 implements defpackage.eo2 {
    public final /* synthetic */ int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.nh2 Z;

    public /* synthetic */ jr5(defpackage.nh2 r1, defpackage.r41 r2, int r3) {
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
                case 0: goto L15;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            jr5 r2 = (defpackage.jr5) r2
            r2.s(r1)
            return r1
        L15:
            r41 r2 = r2.q(r4, r3)
            jr5 r2 = (defpackage.jr5) r2
            r2.s(r1)
            return r1
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.X
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            jr5 r0 = new jr5
            nh2 r2 = r2.Z
            r1 = 1
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
        L10:
            jr5 r0 = new jr5
            nh2 r2 = r2.Z
            r1 = 0
            r0.<init>(r2, r3, r1)
            r0.Y = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.X
            jg7 r1 = defpackage.jg7.a
            nh2 r2 = r3.Z
            java.lang.Object r3 = r3.Y
            w61 r3 = (defpackage.w61) r3
            switch(r0) {
                case 0: goto L16;
                default: goto Ld;
            }
        Ld:
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            defpackage.nh2.a(r2)     // Catch: java.lang.Throwable -> L15
        L15:
            return r1
        L16:
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r4)
            defpackage.nh2.a(r2)     // Catch: java.lang.Throwable -> L1e
        L1e:
            return r1
    }
}
