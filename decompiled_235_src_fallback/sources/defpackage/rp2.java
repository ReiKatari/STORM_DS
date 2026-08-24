package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rp2  reason: default package */
/* loaded from: classes.dex */
public final class rp2 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.rj0 B;

    public /* synthetic */ rp2(defpackage.rj0 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.A
            jg7 r1 = defpackage.jg7.a
            rj0 r2 = r2.B
            switch(r0) {
                case 0: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.i(r1)
            return r1
        Lf:
            com.google.mlkit.vision.text.Text r3 = (com.google.mlkit.vision.text.Text) r3
            java.lang.Object r0 = r2.u()
            boolean r0 = r0 instanceof defpackage.sg4
            if (r0 == 0) goto L20
            r3.getClass()
            r0 = 0
            r2.G(r3, r0)
        L20:
            return r1
    }
}
