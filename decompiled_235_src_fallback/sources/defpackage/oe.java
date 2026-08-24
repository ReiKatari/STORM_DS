package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe  reason: default package */
/* loaded from: classes.dex */
public final class oe extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.te L;

    public /* synthetic */ oe(defpackage.te r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.B
            jg7 r1 = defpackage.jg7.a
            te r3 = r3.L
            switch(r0) {
                case 0: goto L40;
                case 1: goto L15;
                default: goto L9;
            }
        L9:
            w61 r4 = (defpackage.w61) r4
            rj r0 = new rj
            o37 r1 = r3.getTextInputService()
            r0.<init>(r3, r1, r4)
            return r0
        L15:
            on2 r4 = (defpackage.on2) r4
            r3.getUncaughtExceptionHandler$ui()
            android.os.Handler r0 = r3.getHandler()
            if (r0 == 0) goto L25
            android.os.Looper r0 = r0.getLooper()
            goto L26
        L25:
            r0 = 0
        L26:
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r0 != r2) goto L30
            r4.c()
            goto L3f
        L30:
            android.os.Handler r3 = r3.getHandler()
            if (r3 == 0) goto L3f
            fe r0 = new fe
            r2 = 1
            r0.<init>(r2, r4)
            r3.post(r0)
        L3f:
            return r1
        L40:
            qg2 r4 = (defpackage.qg2) r4
            int r4 = r4.a
            ah2 r3 = r3.getFocusOwner()
            r0 = 0
            eh2 r3 = (defpackage.eh2) r3
            r3.g(r4, r0)
            return r1
    }
}
