package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wj  reason: default package */
/* loaded from: classes.dex */
public final class wj extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.c05 L;

    public /* synthetic */ wj(defpackage.c05 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.B
            jg7 r1 = defpackage.jg7.a
            c05 r4 = r4.L
            switch(r0) {
                case 0: goto L41;
                case 1: goto L31;
                default: goto L9;
            }
        L9:
            on2 r5 = (defpackage.on2) r5
            android.os.Handler r0 = r4.getHandler()
            if (r0 == 0) goto L16
            android.os.Looper r0 = r0.getLooper()
            goto L17
        L16:
            r0 = 0
        L17:
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r0 != r2) goto L21
            r5.c()
            goto L30
        L21:
            android.os.Handler r4 = r4.getHandler()
            if (r4 == 0) goto L30
            fe r0 = new fe
            r2 = 5
            r0.<init>(r2, r5)
            r4.post(r0)
        L30:
            return r1
        L31:
            q93 r5 = (defpackage.q93) r5
            long r2 = r5.a
            q93 r5 = new q93
            r5.<init>(r2)
            r4.m1setPopupContentSizefhxjrPA(r5)
            r4.q()
            return r1
        L41:
            jk3 r5 = (defpackage.jk3) r5
            jk3 r5 = r5.D()
            r5.getClass()
            r4.p(r5)
            return r1
    }
}
