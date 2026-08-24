package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w32  reason: default package */
/* loaded from: classes.dex */
public final class w32 {
    public final defpackage.c42 a;
    public final byte[] b;

    public w32(defpackage.c42 r2, byte[] r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L13
            if (r3 == 0) goto Ld
            r1.a = r2
            r1.b = r3
            return
        Ld:
            java.lang.String r1 = "bytes is null"
            defpackage.u34.x(r1)
            throw r0
        L13:
            java.lang.String r1 = "encoding is null"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r4 instanceof defpackage.w32
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            w32 r4 = (defpackage.w32) r4
            c42 r0 = r3.a
            c42 r2 = r4.a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L17
            return r1
        L17:
            byte[] r3 = r3.b
            byte[] r4 = r4.b
            boolean r3 = java.util.Arrays.equals(r3, r4)
            return r3
    }

    public final int hashCode() {
            r2 = this;
            c42 r0 = r2.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            byte[] r2 = r2.b
            int r2 = java.util.Arrays.hashCode(r2)
            r2 = r2 ^ r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EncodedPayload{encoding="
            r0.<init>(r1)
            c42 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ", bytes=[...]}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
