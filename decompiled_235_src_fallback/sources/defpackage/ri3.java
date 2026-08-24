package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ri3  reason: default package */
/* loaded from: classes.dex */
public final class ri3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.gb0 B;

    public /* synthetic */ ri3(defpackage.gb0 r1, int r2) {
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
            gb0 r2 = r2.B
            switch(r0) {
                case 0: goto L15;
                case 1: goto Lf;
                default: goto L9;
            }
        L9:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.cancel()
            return r1
        Lf:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.cancel()
            return r1
        L15:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.cancel()
            return r1
    }
}
