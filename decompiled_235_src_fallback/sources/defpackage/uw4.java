package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw4  reason: default package */
/* loaded from: classes.dex */
public final class uw4 extends java.util.concurrent.FutureTask implements java.lang.Comparable {
    public final defpackage.v40 A;

    public uw4(defpackage.v40 r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.A = r2
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            uw4 r3 = (defpackage.uw4) r3
            v40 r2 = r2.A
            rw4 r0 = r2.n0
            v40 r3 = r3.A
            rw4 r1 = r3.n0
            if (r0 != r1) goto L12
            int r2 = r2.A
            int r3 = r3.A
        L10:
            int r2 = r2 - r3
            return r2
        L12:
            int r2 = r1.ordinal()
            int r3 = r0.ordinal()
            goto L10
    }
}
