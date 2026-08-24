package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: in4  reason: default package */
/* loaded from: classes.dex */
public final class in4 extends defpackage.ao4 {
    public static final defpackage.in4 d = null;

    static {
            in4 r0 = new in4
            r1 = 3
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            defpackage.in4.d = r0
            return
    }

    @Override // defpackage.ao4
    public final void c(defpackage.ls0 r7, defpackage.nt r8, defpackage.pk6 r9, defpackage.jb1 r10, defpackage.bo4 r11) {
            r6 = this;
            r6 = 1
            java.lang.Object r0 = r7.g(r6)
            mk6 r0 = (defpackage.mk6) r0
            r1 = 0
            java.lang.Object r2 = r7.g(r1)
            sq2 r2 = (defpackage.sq2) r2
            r3 = 2
            java.lang.Object r7 = r7.g(r3)
            ld2 r7 = (defpackage.ld2) r7
            pk6 r3 = r0.d()
            if (r11 == 0) goto L25
            ap3 r4 = new ap3     // Catch: java.lang.Throwable -> L23
            r5 = 13
            r4.<init>(r5, r11, r9)     // Catch: java.lang.Throwable -> L23
            goto L26
        L23:
            r6 = move-exception
            goto L4c
        L25:
            r4 = 0
        L26:
            co4 r11 = r7.d     // Catch: java.lang.Throwable -> L23
            boolean r11 = r11.g0()     // Catch: java.lang.Throwable -> L23
            if (r11 != 0) goto L33
            java.lang.String r11 = "FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?"
            defpackage.tx0.a(r11)     // Catch: java.lang.Throwable -> L23
        L33:
            co4 r7 = r7.c     // Catch: java.lang.Throwable -> L23
            r7.f0(r8, r3, r10, r4)     // Catch: java.lang.Throwable -> L23
            r3.e(r6)
            r9.d()
            r2.getClass()
            int r6 = r0.a(r2)
            r9.A(r0, r6)
            r9.k()
            return
        L4c:
            r3.e(r1)
            throw r6
    }
}
