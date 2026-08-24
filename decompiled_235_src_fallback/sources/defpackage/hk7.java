package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk7  reason: default package */
/* loaded from: classes.dex */
public final class hk7 extends defpackage.oi2 {
    public final java.lang.Object e;
    public final defpackage.vl7 f;
    public final defpackage.vs0 g;

    public hk7(java.lang.Object r1, defpackage.vl7 r2, defpackage.vs0 r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.e = r1
            r0.f = r2
            r0.g = r3
            return
    }

    @Override // defpackage.oi2
    public final defpackage.oi2 U(java.lang.String r3, defpackage.qn2 r4) {
            r2 = this;
            java.lang.Object r0 = r2.e
            java.lang.Object r4 = r4.g(r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto Lf
            return r2
        Lf:
            n92 r4 = new n92
            vs0 r1 = r2.g
            vl7 r2 = r2.f
            r4.<init>(r0, r3, r1, r2)
            return r4
    }

    @Override // defpackage.oi2
    public final java.lang.Object o() {
            r0 = this;
            java.lang.Object r0 = r0.e
            return r0
    }
}
