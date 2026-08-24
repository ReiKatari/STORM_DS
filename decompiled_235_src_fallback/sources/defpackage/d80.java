package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d80  reason: default package */
/* loaded from: classes.dex */
public final class d80 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.lang.Object B;

    public /* synthetic */ d80(java.lang.Object r1, int r2) {
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
            java.lang.Object r2 = r2.B
            switch(r0) {
                case 0: goto L25;
                case 1: goto L1d;
                default: goto L9;
            }
        L9:
            v24 r3 = (defpackage.v24) r3
            float[] r3 = r3.a
            jk3 r2 = (defpackage.jk3) r2
            boolean r0 = r2.t()
            if (r0 == 0) goto L1c
            jk3 r0 = defpackage.ej2.w(r2)
            r0.l(r2, r3)
        L1c:
            return r1
        L1d:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            je5 r2 = (defpackage.je5) r2
            r2.cancel()
            return r1
        L25:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            tj0 r2 = (defpackage.tj0) r2
            r2.cancel()
            return r1
    }
}
