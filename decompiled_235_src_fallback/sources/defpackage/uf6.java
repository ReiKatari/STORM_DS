package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uf6 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.io.File B;

    public /* synthetic */ uf6(java.io.File r1, int r2) {
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
            r1 = 0
            java.io.File r2 = r2.B
            java.lang.String r3 = (java.lang.String) r3
            switch(r0) {
                case 0: goto L1e;
                default: goto La;
            }
        La:
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 == 0) goto L1d
            java.lang.String r1 = defpackage.jc2.B0(r0)
        L1d:
            return r1
        L1e:
            r3.getClass()
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r3)
            boolean r2 = r0.isFile()
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r1
        L2e:
            if (r0 == 0) goto L34
            java.lang.String r1 = defpackage.jc2.B0(r0)
        L34:
            return r1
    }
}
