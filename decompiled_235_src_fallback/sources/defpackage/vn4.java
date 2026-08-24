package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vn4  reason: default package */
/* loaded from: classes.dex */
public final class vn4 extends defpackage.ao4 {
    public static final defpackage.vn4 d = null;

    static {
            vn4 r0 = new vn4
            r1 = 0
            r2 = 2
            r3 = 1
            r0.<init>(r3, r1, r2)
            defpackage.vn4.d = r0
            return
    }

    @Override // defpackage.ao4
    public final void c(defpackage.ls0 r2, defpackage.nt r3, defpackage.pk6 r4, defpackage.jb1 r5, defpackage.bo4 r6) {
            r1 = this;
            r1 = 0
            int r1 = r2.f(r1)
            int r2 = r4.v
            int[] r3 = r4.b
            int r6 = r4.r(r2)
            int r3 = r4.N(r3, r6)
            int[] r6 = r4.b
            int r2 = r2 + 1
            int r2 = r4.r(r2)
            int r2 = r4.g(r6, r2)
            int r6 = r2 - r1
            int r3 = java.lang.Math.max(r3, r6)
        L23:
            if (r3 >= r2) goto L43
            java.lang.Object[] r6 = r4.c
            int r0 = r4.h(r3)
            r6 = r6[r0]
            boolean r0 = r6 instanceof defpackage.br2
            if (r0 == 0) goto L37
            br2 r6 = (defpackage.br2) r6
            r5.e(r6)
            goto L40
        L37:
            boolean r0 = r6 instanceof defpackage.cf5
            if (r0 == 0) goto L40
            cf5 r6 = (defpackage.cf5) r6
            r6.c()
        L40:
            int r3 = r3 + 1
            goto L23
        L43:
            java.lang.String r2 = "Check failed"
            if (r1 <= 0) goto L48
            goto L4b
        L48:
            defpackage.tx0.a(r2)
        L4b:
            int r3 = r4.v
            int[] r5 = r4.b
            int r6 = r4.r(r3)
            int r5 = r4.N(r5, r6)
            int[] r6 = r4.b
            int r0 = r3 + 1
            int r0 = r4.r(r0)
            int r6 = r4.g(r6, r0)
            int r6 = r6 - r1
            if (r6 < r5) goto L67
            goto L6a
        L67:
            defpackage.tx0.a(r2)
        L6a:
            r4.J(r6, r1, r3)
            int r2 = r4.i
            if (r2 < r5) goto L74
            int r2 = r2 - r1
            r4.i = r2
        L74:
            return
    }
}
