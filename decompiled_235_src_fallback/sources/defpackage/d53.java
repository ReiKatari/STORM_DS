package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d53  reason: default package */
/* loaded from: classes.dex */
public final class d53 implements defpackage.to {
    public final defpackage.pq1 a;
    public final defpackage.ck5 b;

    public d53(defpackage.pq1 r1, defpackage.ck5 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            boolean r0 = r1 instanceof defpackage.sc7
            if (r0 == 0) goto L1d
            sc7 r1 = (defpackage.sc7) r1
            int r0 = r1.a
            if (r0 != 0) goto L1d
            int r0 = r1.b
            if (r0 == 0) goto L16
            goto L1d
        L16:
            java.lang.String r0 = "Animation to be infinitely repeated cannot have a 0-duration"
            defpackage.i.h(r0)
            r0 = 0
            throw r0
        L1d:
            return
    }

    @Override // defpackage.to
    public final defpackage.il7 a(defpackage.wc7 r3) {
            r2 = this;
            ml7 r0 = new ml7
            pq1 r1 = r2.a
            kl7 r3 = r1.a(r3)
            ck5 r2 = r2.b
            r0.<init>(r3, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.d53
            if (r0 == 0) goto L18
            d53 r3 = (defpackage.d53) r3
            pq1 r0 = r3.a
            pq1 r1 = r2.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            ck5 r3 = r3.b
            ck5 r2 = r2.b
            if (r3 != r2) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            pq1 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ck5 r2 = r2.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 31
            r0 = 0
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 + r2
            return r0
    }
}
