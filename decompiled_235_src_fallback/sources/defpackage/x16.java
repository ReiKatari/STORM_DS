package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x16  reason: default package */
/* loaded from: classes.dex */
public final class x16 {
    public final int a;
    public final int b;
    public final android.graphics.Point c;

    public x16(int r2, int r3, android.graphics.Point r4) {
            r1 = this;
            int r0 = r4.x
            int r4 = r4.y
            r1.<init>()
            r1.a = r2
            r1.b = r3
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r0, r4)
            r1.c = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.x16
            r2 = 0
            if (r1 == 0) goto L22
            x16 r5 = (defpackage.x16) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L22
            int r1 = r4.b
            int r3 = r5.b
            if (r1 != r3) goto L22
            android.graphics.Point r4 = r4.c
            android.graphics.Point r5 = r5.c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L22
            return r0
        L22:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            android.graphics.Point r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RoundedCornerCompat{position="
            r0.<init>(r1)
            int r1 = r3.a
            if (r1 == 0) goto L20
            r2 = 1
            if (r1 == r2) goto L1d
            r2 = 2
            if (r1 == r2) goto L1a
            r2 = 3
            if (r1 == r2) goto L17
            java.lang.String r1 = "Invalid"
            goto L22
        L17:
            java.lang.String r1 = "BottomLeft"
            goto L22
        L1a:
            java.lang.String r1 = "BottomRight"
            goto L22
        L1d:
            java.lang.String r1 = "TopRight"
            goto L22
        L20:
            java.lang.String r1 = "TopLeft"
        L22:
            r0.append(r1)
            java.lang.String r1 = ", radius="
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", center="
            r0.append(r1)
            android.graphics.Point r3 = r3.c
            r0.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
