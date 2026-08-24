package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ia7 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.ga7 B;

    public /* synthetic */ ia7(defpackage.ga7 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            ga7 r1 = r1.B
            gl1 r2 = (defpackage.gl1) r2
            switch(r0) {
                case 0: goto L10;
                default: goto L9;
            }
        L9:
            ka7 r2 = new ka7
            r0 = 1
            r2.<init>(r1, r0)
            return r2
        L10:
            ka7 r2 = new ka7
            r0 = 0
            r2.<init>(r1, r0)
            return r2
    }
}
