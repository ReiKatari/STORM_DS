package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq4  reason: default package */
/* loaded from: classes.dex */
public final class pq4 implements defpackage.lq4 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public pq4(float r3, float r4, float r5, float r6) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r2.d = r6
            r2 = 0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            r0 = 0
            r1 = 1
            if (r3 < 0) goto L14
            r3 = r1
            goto L15
        L14:
            r3 = r0
        L15:
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L1b
            r4 = r1
            goto L1c
        L1b:
            r4 = r0
        L1c:
            r3 = r3 & r4
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 < 0) goto L23
            r4 = r1
            goto L24
        L23:
            r4 = r0
        L24:
            r3 = r3 & r4
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L2a
            r0 = r1
        L2a:
            r2 = r3 & r0
            if (r2 != 0) goto L33
            java.lang.String r2 = "Padding must be non-negative"
            defpackage.n53.a(r2)
        L33:
            return
    }

    @Override // defpackage.lq4
    public final float a() {
            r0 = this;
            float r0 = r0.d
            return r0
    }

    @Override // defpackage.lq4
    public final float b(defpackage.kk3 r2) {
            r1 = this;
            kk3 r0 = defpackage.kk3.Ltr
            if (r2 != r0) goto L7
            float r1 = r1.a
            return r1
        L7:
            float r1 = r1.c
            return r1
    }

    @Override // defpackage.lq4
    public final float c(defpackage.kk3 r2) {
            r1 = this;
            kk3 r0 = defpackage.kk3.Ltr
            if (r2 != r0) goto L7
            float r1 = r1.c
            return r1
        L7:
            float r1 = r1.a
            return r1
    }

    @Override // defpackage.lq4
    public final float d() {
            r0 = this;
            float r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.pq4
            if (r0 != 0) goto L5
            goto L31
        L5:
            pq4 r3 = (defpackage.pq4) r3
            float r0 = r3.a
            float r1 = r2.a
            boolean r0 = defpackage.om1.b(r1, r0)
            if (r0 == 0) goto L31
            float r0 = r2.b
            float r1 = r3.b
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 == 0) goto L31
            float r0 = r2.c
            float r1 = r3.c
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 == 0) goto L31
            float r2 = r2.d
            float r3 = r3.d
            boolean r2 = defpackage.om1.b(r2, r3)
            if (r2 == 0) goto L31
            r2 = 1
            return r2
        L31:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r3.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.d
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PaddingValues(start="
            r0.<init>(r1)
            float r1 = r2.a
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.b
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            float r1 = r2.c
            java.lang.String r1 = defpackage.om1.c(r1)
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r2 = r2.d
            java.lang.String r2 = defpackage.om1.c(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
