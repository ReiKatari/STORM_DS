package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e63  reason: default package */
/* loaded from: classes.dex */
public final class e63 extends defpackage.h63 {
    public final java.lang.Integer a;
    public final int b;
    public final defpackage.d63 c;

    public e63(java.lang.Integer r1, int r2, defpackage.d63 r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.e63
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e63 r5 = (defpackage.e63) r5
            java.lang.Integer r1 = r4.a
            java.lang.Integer r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            d63 r4 = r4.c
            d63 r5 = r5.c
            if (r4 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Integer r0 = r3.a
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            d63 r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Axis(deviceId="
            r0.<init>(r1)
            java.lang.Integer r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", axisCode="
            r0.append(r1)
            int r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", direction="
            r0.append(r1)
            d63 r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
