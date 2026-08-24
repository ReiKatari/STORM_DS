package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch3  reason: default package */
/* loaded from: classes.dex */
public final class ch3 extends defpackage.z64 implements defpackage.bh3 {
    public defpackage.qn2 k0;
    public defpackage.qn2 l0;

    @Override // defpackage.bh3
    public final boolean B(android.view.KeyEvent r2) {
            r1 = this;
            qn2 r1 = r1.k0
            if (r1 == 0) goto L14
            wg3 r0 = new wg3
            r0.<init>(r2)
            java.lang.Object r1 = r1.g(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L14:
            r1 = 0
            return r1
    }

    @Override // defpackage.bh3
    public final boolean k(android.view.KeyEvent r2) {
            r1 = this;
            qn2 r1 = r1.l0
            if (r1 == 0) goto L14
            wg3 r0 = new wg3
            r0.<init>(r2)
            java.lang.Object r1 = r1.g(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L14:
            r1 = 0
            return r1
    }
}
