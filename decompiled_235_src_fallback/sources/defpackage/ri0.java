package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ri0 implements defpackage.b31 {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ ri0(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.<init>()
            return
    }

    @Override // defpackage.b31
    public final void accept(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.a
            r1 = 1
            java.lang.Object r2 = r3.c
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L43;
                case 2: goto L1c;
                default: goto La;
            }
        La:
            xh6 r3 = (defpackage.xh6) r3
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.res.Configuration r4 = (android.content.res.Configuration) r4
            m44 r4 = r3.e
            if (r4 == 0) goto L1b
            kv7 r3 = r3.a(r2)
            r4.B(r2, r3)
        L1b:
            return
        L1c:
            mq1 r3 = (defpackage.mq1) r3
            wv6 r2 = (defpackage.wv6) r2
            az r4 = (defpackage.az) r4
            r2.close()
            java.util.LinkedHashMap r4 = r3.h
            java.lang.Object r4 = r4.remove(r2)
            android.view.Surface r4 = (android.view.Surface) r4
            if (r4 == 0) goto L42
            iq1 r3 = r3.a
            java.lang.Object r0 = r3.L
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            defpackage.bp2.d(r0, r1)
            java.lang.Object r0 = r3.X
            java.lang.Thread r0 = (java.lang.Thread) r0
            defpackage.bp2.c(r0)
            r3.s(r4, r1)
        L42:
            return
        L43:
            qf1 r3 = (defpackage.qf1) r3
            wv6 r2 = (defpackage.wv6) r2
            az r4 = (defpackage.az) r4
            r2.close()
            java.util.LinkedHashMap r4 = r3.h
            java.lang.Object r4 = r4.remove(r2)
            android.view.Surface r4 = (android.view.Surface) r4
            if (r4 == 0) goto L69
            qm4 r3 = r3.a
            java.lang.Object r0 = r3.L
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            defpackage.bp2.d(r0, r1)
            java.lang.Object r0 = r3.X
            java.lang.Thread r0 = (java.lang.Thread) r0
            defpackage.bp2.c(r0)
            r3.s(r4, r1)
        L69:
            return
        L6a:
            android.view.Surface r3 = (android.view.Surface) r3
            android.graphics.SurfaceTexture r2 = (android.graphics.SurfaceTexture) r2
            bz r4 = (defpackage.bz) r4
            r3.release()
            r2.release()
            return
    }
}
