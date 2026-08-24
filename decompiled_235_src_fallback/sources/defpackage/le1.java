package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le1  reason: default package */
/* loaded from: classes.dex */
public final class le1 extends defpackage.pi1 {
    @Override // defpackage.pi1
    public final defpackage.ok3 b(android.view.Display r3, android.view.Display r4) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = "Built-in Screen"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto Lf
            lk3 r0 = defpackage.lk3.BUILT_IN
            goto L11
        Lf:
            lk3 r0 = defpackage.lk3.EXTERNAL
        L11:
            mk3 r3 = r2.a(r3, r0)
            if (r4 == 0) goto L2b
            java.lang.String r0 = r4.getName()
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L24
            lk3 r0 = defpackage.lk3.BUILT_IN
            goto L26
        L24:
            lk3 r0 = defpackage.lk3.EXTERNAL
        L26:
            mk3 r2 = r2.a(r4, r0)
            goto L2c
        L2b:
            r2 = 0
        L2c:
            ok3 r4 = new ok3
            r4.<init>(r3, r2)
            return r4
    }
}
