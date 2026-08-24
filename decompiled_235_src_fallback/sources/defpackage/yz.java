package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yz  reason: default package */
/* loaded from: classes.dex */
public final class yz extends defpackage.pi1 {
    public static final java.util.List b = null;

    static {
            java.lang.String r0 = "Built-in Screen"
            java.lang.String r1 = "Screen-2"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.yz.b = r0
            return
    }

    @Override // defpackage.pi1
    public final defpackage.ok3 b(android.view.Display r3, android.view.Display r4) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.util.List r1 = defpackage.yz.b
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lf
            lk3 r0 = defpackage.lk3.BUILT_IN
            goto L11
        Lf:
            lk3 r0 = defpackage.lk3.EXTERNAL
        L11:
            mk3 r3 = r2.a(r3, r0)
            if (r4 == 0) goto L2b
            java.lang.String r0 = r4.getName()
            boolean r0 = r1.contains(r0)
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
