package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zu6  reason: default package */
/* loaded from: classes.dex */
public final class zu6 {
    public final java.util.List a;
    public final java.util.List b;
    public final int c;
    public final int d;
    public final int e;

    public zu6(java.util.List r1, java.util.List r2, int r3, int r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L36
        L3:
            boolean r0 = r3 instanceof defpackage.zu6
            if (r0 != 0) goto L8
            goto L34
        L8:
            zu6 r3 = (defpackage.zu6) r3
            java.util.List r0 = r2.a
            java.util.List r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L34
        L15:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L20
            goto L34
        L20:
            int r0 = r2.c
            int r1 = r3.c
            if (r0 == r1) goto L27
            goto L34
        L27:
            int r0 = r2.d
            int r1 = r3.d
            if (r0 == r1) goto L2e
            goto L34
        L2e:
            int r2 = r2.e
            int r3 = r3.e
            if (r2 == r3) goto L36
        L34:
            r2 = 0
            return r2
        L36:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            if (r2 != 0) goto Lf
            r2 = 0
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.e
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BestSizesAndMaxFpsForConfigs(bestSizes="
            r0.<init>(r1)
            java.util.List r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", bestSizesForStreamUseCase="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", maxFpsForBestSizes="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", maxFpsForStreamUseCase="
            r0.append(r1)
            int r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", maxFpsForAllSizes="
            r0.append(r1)
            int r2 = r2.e
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }
}
