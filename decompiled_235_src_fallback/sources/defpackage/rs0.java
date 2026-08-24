package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs0  reason: default package */
/* loaded from: classes.dex */
public final class rs0 extends defpackage.j0 {
    public final defpackage.n b;

    public rs0(defpackage.n r2) {
            r1 = this;
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1.<init>(r0)
            r1.b = r2
            return
    }

    @Override // defpackage.j0
    public final java.io.InputStream a(java.lang.String r1, java.io.InputStream r2, long r3, defpackage.ps0 r5, byte[] r6, int r7) {
            r0 = this;
            n r0 = r0.b     // Catch: java.lang.AssertionError -> Lc
            r0.getClass()     // Catch: java.lang.AssertionError -> Lc
            mu r3 = defpackage.mu.a     // Catch: java.lang.AssertionError -> Lc
            java.io.InputStream r0 = r0.a(r2, r3)     // Catch: java.lang.AssertionError -> Lc
            return r0
        Lc:
            r0 = move-exception
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "BCJ filter used in "
            java.lang.String r4 = " needs XZ for Java > 1.4 - see https://commons.apache.org/proper/commons-compress/limitations.html#7Z"
            java.lang.String r1 = defpackage.lb1.A(r3, r1, r4)
            r2.<init>(r1, r0)
            throw r2
    }
}
