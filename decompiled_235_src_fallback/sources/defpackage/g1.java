package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.Collection B;

    public /* synthetic */ g1(int r1, java.util.Collection r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            java.util.Collection r1 = r1.B
            switch(r0) {
                case 0: goto L17;
                case 1: goto L12;
                default: goto L7;
            }
        L7:
            java.util.List r2 = (java.util.List) r2
            boolean r1 = r2.retainAll(r1)
        Ld:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L12:
            boolean r1 = r1.contains(r2)
            goto Ld
        L17:
            boolean r1 = r1.contains(r2)
            goto Ld
    }
}
