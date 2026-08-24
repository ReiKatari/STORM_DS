package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sc7  reason: default package */
/* loaded from: classes.dex */
public final class sc7 implements defpackage.pq1 {
    public final int a;
    public final int b;
    public final defpackage.hr1 c;

    public sc7(int r1, int r2, defpackage.hr1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public sc7(int r1, defpackage.hr1 r2, int r3) {
            r0 = this;
            r3 = r3 & 4
            if (r3 == 0) goto L6
            v71 r2 = defpackage.ir1.a
        L6:
            r3 = 0
            r0.<init>(r1, r3, r2)
            return
    }

    @Override // defpackage.to
    public final defpackage.il7 a(defpackage.wc7 r3) {
            r2 = this;
            r90 r3 = new r90
            int r0 = r2.b
            hr1 r1 = r2.c
            int r2 = r2.a
            r3.<init>(r2, r0, r1)
            return r3
    }

    @Override // defpackage.pq1, defpackage.to
    public final defpackage.kl7 a(defpackage.wc7 r3) {
            r2 = this;
            r90 r3 = new r90
            int r0 = r2.b
            hr1 r1 = r2.c
            int r2 = r2.a
            r3.<init>(r2, r0, r1)
            return r3
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.sc7
            r1 = 0
            if (r0 == 0) goto L1f
            sc7 r4 = (defpackage.sc7) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r0 != r2) goto L1f
            int r0 = r4.b
            int r2 = r3.b
            if (r0 != r2) goto L1f
            hr1 r4 = r4.c
            hr1 r3 = r3.c
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 == 0) goto L1f
            r3 = 1
            return r3
        L1f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            hr1 r1 = r2.c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r2 = r2.b
            int r1 = r1 + r2
            return r1
    }
}
