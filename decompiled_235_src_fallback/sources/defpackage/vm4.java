package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vm4  reason: default package */
/* loaded from: classes.dex */
public final class vm4 extends defpackage.ao4 {
    public static final defpackage.vm4 d = null;

    static {
            vm4 r0 = new vm4
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            defpackage.vm4.d = r0
            return
    }

    @Override // defpackage.ao4
    public final void c(defpackage.ls0 r2, defpackage.nt r3, defpackage.pk6 r4, defpackage.jb1 r5, defpackage.bo4 r6) {
            r1 = this;
            r1 = 0
            java.lang.Object r4 = r2.g(r1)
            n93 r4 = (defpackage.n93) r4
            int r4 = r4.a
            r5 = 1
            java.lang.Object r2 = r2.g(r5)
            java.util.List r2 = (java.util.List) r2
            int r5 = r2.size()
        L14:
            if (r1 >= r5) goto L25
            java.lang.Object r6 = r2.get(r1)
            int r0 = r4 + r1
            r3.c(r0, r6)
            r3.k(r0, r6)
            int r1 = r1 + 1
            goto L14
        L25:
            return
    }
}
