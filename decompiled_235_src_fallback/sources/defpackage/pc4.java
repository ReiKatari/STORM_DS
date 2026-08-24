package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pc4 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.dh5 B;

    public /* synthetic */ pc4(int r1, defpackage.dh5 r2) {
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
            dh5 r1 = r1.B
            switch(r0) {
                case 0: goto L27;
                default: goto L7;
            }
        L7:
            ub7 r2 = (defpackage.ub7) r2
            r2.getClass()
            wb7 r2 = (defpackage.wb7) r2
            pq3 r2 = r2.k0
            java.lang.Object r0 = r1.A
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L1a
            r0.add(r2)
            goto L22
        L1a:
            pq3[] r2 = new defpackage.pq3[]{r2}
            java.util.ArrayList r0 = defpackage.hf.d0(r2)
        L22:
            r1.A = r0
            tb7 r1 = defpackage.tb7.SkipSubtreeAndContinueTraversal
            return r1
        L27:
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.Object r1 = r1.A
            if (r1 != 0) goto L31
            goto L39
        L31:
            android.os.Bundle r1 = (android.os.Bundle) r1
            boolean r1 = r1.containsKey(r2)
            if (r1 != 0) goto L3b
        L39:
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}
