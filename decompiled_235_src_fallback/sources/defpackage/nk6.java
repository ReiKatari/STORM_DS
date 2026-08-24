package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nk6  reason: default package */
/* loaded from: classes.dex */
public final class nk6 implements defpackage.by0, java.lang.Iterable, defpackage.zf3 {
    public final defpackage.mk6 A;
    public final int B;
    public final int L;

    public nk6(defpackage.mk6 r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.nk6
            if (r0 == 0) goto L1b
            nk6 r3 = (defpackage.nk6) r3
            int r0 = r3.B
            int r1 = r2.B
            if (r0 != r1) goto L1b
            int r0 = r3.L
            int r1 = r2.L
            if (r0 != r1) goto L1b
            mk6 r3 = r3.A
            mk6 r2 = r2.A
            if (r3 == r2) goto L19
            goto L1b
        L19:
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            mk6 r0 = r1.A
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.B
            int r0 = r0 + r1
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r5 = this;
            mk6 r0 = r5.A
            int r1 = r0.d0
            int r2 = r5.L
            if (r1 == r2) goto Lb
            defpackage.ok6.f()
        Lb:
            int r5 = r5.B
            r0.g(r5)
            ou2 r1 = new ou2
            int r2 = r5 + 1
            int[] r3 = r0.A
            int r4 = r5 * 5
            int r4 = r4 + 3
            r3 = r3[r4]
            int r3 = r3 + r5
            r1.<init>(r0, r2, r3)
            return r1
    }
}
