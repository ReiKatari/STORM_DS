package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y9  reason: default package */
/* loaded from: classes.dex */
public final class y9 {
    public int a;
    public int b;
    public java.lang.Object c;
    public int d;

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            goto L4d
        L4:
            boolean r1 = r4 instanceof defpackage.y9
            if (r1 != 0) goto L9
            goto L4b
        L9:
            y9 r4 = (defpackage.y9) r4
            int r1 = r3.a
            int r2 = r4.a
            if (r1 == r2) goto L12
            goto L4b
        L12:
            r2 = 8
            if (r1 != r2) goto L2e
            int r1 = r3.d
            int r2 = r3.b
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            if (r1 != r0) goto L2e
            int r1 = r3.d
            int r2 = r4.b
            if (r1 != r2) goto L2e
            int r1 = r3.b
            int r2 = r4.d
            if (r1 != r2) goto L2e
            goto L4d
        L2e:
            int r1 = r3.d
            int r2 = r4.d
            if (r1 == r2) goto L35
            goto L4b
        L35:
            int r1 = r3.b
            int r2 = r4.b
            if (r1 == r2) goto L3c
            goto L4b
        L3c:
            java.lang.Object r3 = r3.c
            java.lang.Object r4 = r4.c
            if (r3 == 0) goto L49
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L4d
            goto L4b
        L49:
            if (r4 == 0) goto L4d
        L4b:
            r3 = 0
            return r3
        L4d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            int r0 = r0 * 31
            int r1 = r2.b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r2 = r2.d
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = java.lang.System.identityHashCode(r3)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            int r1 = r3.a
            r2 = 1
            if (r1 == r2) goto L30
            r2 = 2
            if (r1 == r2) goto L2d
            r2 = 4
            if (r1 == r2) goto L2a
            r2 = 8
            if (r1 == r2) goto L27
            java.lang.String r1 = "??"
            goto L32
        L27:
            java.lang.String r1 = "mv"
            goto L32
        L2a:
            java.lang.String r1 = "up"
            goto L32
        L2d:
            java.lang.String r1 = "rm"
            goto L32
        L30:
            java.lang.String r1 = "add"
        L32:
            r0.append(r1)
            java.lang.String r1 = ",s:"
            r0.append(r1)
            int r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = "c:"
            r0.append(r1)
            int r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ",p:"
            r0.append(r1)
            java.lang.Object r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
