package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm4  reason: default package */
/* loaded from: classes.dex */
public final class tm4 extends defpackage.ao4 {
    public static final defpackage.tm4 d = null;

    static {
            tm4 r0 = new tm4
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            defpackage.tm4.d = r0
            return
    }

    @Override // defpackage.ao4
    public final void c(defpackage.ls0 r3, defpackage.nt r4, defpackage.pk6 r5, defpackage.jb1 r6, defpackage.bo4 r7) {
            r2 = this;
            r2 = 0
            java.lang.Object r2 = r3.g(r2)
            sq2 r2 = (defpackage.sq2) r2
            r4 = 1
            java.lang.Object r3 = r3.g(r4)
            boolean r7 = r3 instanceof defpackage.br2
            if (r7 == 0) goto L21
            r7 = r3
            br2 r7 = (defpackage.br2) r7
            java.lang.Object r0 = r6.e
            ua4 r0 = (defpackage.ua4) r0
            r0.b(r7)
            java.lang.Object r6 = r6.d
            ka4 r6 = (defpackage.ka4) r6
            r6.a(r7)
        L21:
            int r6 = r5.n
            if (r6 != 0) goto L26
            goto L2b
        L26:
            java.lang.String r6 = "Can only append a slot if not current inserting"
            defpackage.tx0.a(r6)
        L2b:
            int r6 = r5.i
            int r7 = r5.j
            int r2 = r5.c(r2)
            int[] r0 = r5.b
            int r1 = r2 + 1
            int r1 = r5.r(r1)
            int r0 = r5.g(r0, r1)
            r5.i = r0
            r5.j = r0
            r5.x(r4, r2)
            if (r6 < r0) goto L4c
            int r6 = r6 + 1
            int r7 = r7 + 1
        L4c:
            java.lang.Object[] r2 = r5.c
            r2[r0] = r3
            r5.i = r6
            r5.j = r7
            return
    }
}
