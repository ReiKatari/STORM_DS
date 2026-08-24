package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qn3  reason: default package */
/* loaded from: classes.dex */
public final class qn3 extends defpackage.m20 {
    public final defpackage.tp6 e;
    public final defpackage.de5 f;

    public qn3(defpackage.wa3 r4, defpackage.v46 r5) {
            r3 = this;
            r4.getClass()
            r5.getClass()
            r3.<init>(r4)
            java.lang.String r0 = "selected_layout_id"
            java.lang.Object r5 = r5.a(r0)
            java.lang.String r5 = (java.lang.String) r5
            r0 = 0
            if (r5 == 0) goto L19
            java.util.UUID r5 = java.util.UUID.fromString(r5)
            goto L1a
        L19:
            r5 = r0
        L1a:
            ba6 r1 = new ba6
            aa6 r2 = defpackage.aa6.INITIAL_SELECTION
            r1.<init>(r5, r2)
            tp6 r5 = defpackage.up6.a(r1)
            r3.e = r5
            de5 r1 = new de5
            r1.<init>(r5)
            r3.f = r1
            as0 r5 = defpackage.to7.a(r3)
            xd1 r1 = new xd1
            r2 = 22
            r1.<init>(r4, r3, r0, r2)
            r3 = 3
            defpackage.hv.L(r5, r0, r0, r1, r3)
            return
    }

    @Override // defpackage.m20
    public final void e() {
            r3 = this;
            ba6 r0 = new ba6
            aa6 r1 = defpackage.aa6.SELECTED_BY_FALLBACK
            r2 = 0
            r0.<init>(r2, r1)
            tp6 r3 = r3.e
            r3.getClass()
            r3.m(r2, r0)
            return
    }

    @Override // defpackage.m20
    public final defpackage.de5 f() {
            r0 = this;
            de5 r0 = r0.f
            return r0
    }

    @Override // defpackage.m20
    public final void g(java.util.UUID r3) {
            r2 = this;
            ba6 r0 = new ba6
            aa6 r1 = defpackage.aa6.SELECTED_BY_USER
            r0.<init>(r3, r1)
            tp6 r2 = r2.e
            r2.getClass()
            r3 = 0
            r2.m(r3, r0)
            return
    }
}
