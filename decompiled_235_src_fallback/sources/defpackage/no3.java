package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class no3 implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qn2 B;

    public /* synthetic */ no3(int r1, defpackage.qn2 r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.A
            jg7 r1 = defpackage.jg7.a
            qn2 r2 = r2.B
            switch(r0) {
                case 0: goto L24;
                case 1: goto Lf;
                default: goto L9;
            }
        L9:
            jg7 r4 = (defpackage.jg7) r4
            r2.g(r3)
            return r1
        Lf:
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            to5 r0 = new to5
            r0.<init>(r3, r4)
            r2.g(r0)
            return r1
        L24:
            cp3 r3 = (defpackage.cp3) r3
            java.lang.Integer r4 = (java.lang.Integer) r4
            r4.getClass()
            java.lang.Object r2 = r2.g(r3)
            ju2 r2 = (defpackage.ju2) r2
            return r2
    }
}
