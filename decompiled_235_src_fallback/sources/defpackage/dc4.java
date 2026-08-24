package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dc4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ android.os.Bundle B;

    public /* synthetic */ dc4(int r1, android.os.Bundle r2) {
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
            android.os.Bundle r1 = r1.B
            java.lang.String r2 = (java.lang.String) r2
            switch(r0) {
                case 0: goto L17;
                default: goto L9;
            }
        L9:
            r2.getClass()
            boolean r1 = r1.containsKey(r2)
        L10:
            r1 = r1 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L17:
            r2.getClass()
            boolean r1 = r1.containsKey(r2)
            goto L10
    }
}
