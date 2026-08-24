package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ez1 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.Set B;

    public /* synthetic */ ez1(java.util.Set r1, int r2) {
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
            java.util.Set r2 = r2.B
            switch(r0) {
                case 0: goto L18;
                default: goto L7;
            }
        L7:
            pq5 r3 = (defpackage.pq5) r3
            android.net.Uri r3 = r3.d
            java.lang.String r3 = r3.toString()
            boolean r2 = r2.contains(r3)
        L13:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L18:
            sj4 r3 = (defpackage.sj4) r3
            r3.getClass()
            long r0 = r3.a
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            boolean r2 = r2.contains(r3)
            goto L13
    }
}
