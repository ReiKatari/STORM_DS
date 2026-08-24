package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gy  reason: default package */
/* loaded from: classes.dex */
public final class gy extends defpackage.i62 {
    public final java.lang.Object a;
    public final defpackage.b35 b;

    public gy(java.lang.Object r2, defpackage.b35 r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L13
            r1.a = r2
            if (r3 == 0) goto Ld
            r1.b = r3
            return
        Ld:
            java.lang.String r1 = "Null priority"
            defpackage.u34.x(r1)
            throw r0
        L13:
            java.lang.String r1 = "Null payload"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.i62
            r2 = 0
            if (r1 == 0) goto L22
            i62 r5 = (defpackage.i62) r5
            gy r5 = (defpackage.gy) r5
            java.lang.Object r1 = r5.a
            java.lang.Object r3 = r4.a
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L22
            b35 r4 = r4.b
            b35 r5 = r5.b
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L22
            return r0
        L22:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 1000003(0xf4243, float:1.401303E-39)
            int r1 = r0 * r0
            java.lang.Object r2 = r3.a
            int r2 = r2.hashCode()
            r1 = r1 ^ r2
            int r1 = r1 * r0
            b35 r3 = r3.b
            int r3 = r3.hashCode()
            r3 = r3 ^ r1
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Event{code=null, payload="
            r0.<init>(r1)
            java.lang.Object r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", priority="
            r0.append(r1)
            b35 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
