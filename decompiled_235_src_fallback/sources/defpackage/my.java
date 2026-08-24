package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my  reason: default package */
/* loaded from: classes.dex */
public final class my {
    public final int a;
    public final defpackage.yf0 b;

    public my(int r1, defpackage.yf0 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r2 == 0) goto La
            r0.b = r2
            return
        La:
            java.lang.String r0 = "Null cameraIdentifier"
            defpackage.u34.x(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.my
            r2 = 0
            if (r1 == 0) goto L1c
            my r5 = (defpackage.my) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 != r3) goto L1c
            yf0 r4 = r4.b
            yf0 r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L1c
            return r0
        L1c:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.a
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            yf0 r2 = r2.b
            int r2 = r2.hashCode()
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Key{lifecycleOwnerHash="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", cameraIdentifier="
            r0.append(r1)
            yf0 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
