package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zh0  reason: default package */
/* loaded from: classes.dex */
public final class zh0 extends defpackage.hw6 implements defpackage.qn2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ zh0(java.lang.Object r1, defpackage.r41 r2, int r3) {
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
            java.lang.Object r3 = r3.Y
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L17;
                default: goto Lb;
            }
        Lb:
            zh0 r0 = new zh0
            yk0 r3 = (defpackage.yk0) r3
            r2 = 1
            r0.<init>(r3, r4, r2)
            r0.s(r1)
            return r1
        L17:
            zh0 r0 = new zh0
            dh5 r3 = (defpackage.dh5) r3
            r2 = 0
            r0.<init>(r3, r4, r2)
            java.lang.Object r3 = r0.s(r1)
            return r3
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.X
            java.lang.Object r2 = r2.Y
            switch(r0) {
                case 0: goto L16;
                default: goto L7;
            }
        L7:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            yk0 r2 = (defpackage.yk0) r2
            java.util.concurrent.CountDownLatch r2 = r2.x
            r2.await()
            jg7 r2 = defpackage.jg7.a
            return r2
        L16:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            defpackage.oi2.Y(r3)
            java.lang.String r3 = "CXCP"
            java.lang.String r0 = "tryOpenCamera: Camera open cancelled"
            android.util.Log.d(r3, r0)
            dh5 r2 = (defpackage.dh5) r2
            r3 = 0
            r2.A = r3
            lm4 r2 = new lm4
            df0 r0 = new df0
            r1 = 13
            r0.<init>(r1)
            r1 = 1
            r2.<init>(r3, r0, r1)
            return r2
    }
}
