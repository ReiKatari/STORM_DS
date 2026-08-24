package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ln6  reason: default package */
/* loaded from: classes.dex */
public final class ln6 implements defpackage.by0, java.lang.Iterable, defpackage.zf3 {
    public final defpackage.mk6 A;
    public final int B;
    public final defpackage.fi5 L;

    public ln6(defpackage.mk6 r1, int r2, defpackage.zq2 r3, defpackage.fi5 r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.ln6
            if (r0 == 0) goto L1f
            ln6 r3 = (defpackage.ln6) r3
            int r0 = r3.B
            int r1 = r2.B
            if (r0 != r1) goto L1f
            mk6 r0 = r3.A
            mk6 r1 = r2.A
            if (r0 == r1) goto L13
            goto L1f
        L13:
            fi5 r3 = r3.L
            fi5 r2 = r2.L
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1f
            r2 = 1
            return r2
        L1f:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.B
            int r0 = r0 * 31
            mk6 r1 = r2.A
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            fi5 r2 = r2.L
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            kn6 r0 = new kn6
            r1 = 0
            fi5 r2 = r4.L
            mk6 r3 = r4.A
            int r4 = r4.B
            r0.<init>(r3, r4, r1, r2)
            return r0
    }
}
