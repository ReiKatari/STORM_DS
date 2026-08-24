package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hy  reason: default package */
/* loaded from: classes.dex */
public final class hy {
    public final java.lang.String a;
    public final java.lang.Integer b;
    public final defpackage.w32 c;
    public final long d;
    public final long e;
    public final java.util.Map f;

    public hy(java.lang.String r1, java.lang.Integer r2, defpackage.w32 r3, long r4, long r6, java.util.HashMap r8) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            r0.f = r8
            return
    }

    public final java.lang.String a(java.lang.String r1) {
            r0 = this;
            java.util.Map r0 = r0.f
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lc
            java.lang.String r0 = ""
        Lc:
            return r0
    }

    public final int b(java.lang.String r1) {
            r0 = this;
            java.util.Map r0 = r0.f
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r0 = r0.intValue()
            return r0
    }

    public final defpackage.pa c() {
            r3 = this;
            pa r0 = new pa
            r1 = 4
            r2 = 0
            r0.<init>(r1, r2)
            r1 = 0
            java.lang.String r2 = r3.a
            if (r2 == 0) goto L38
            r0.B = r2
            java.lang.Integer r2 = r3.b
            r0.L = r2
            w32 r2 = r3.c
            if (r2 == 0) goto L32
            r0.R = r2
            long r1 = r3.d
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.X = r1
            long r1 = r3.e
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.Y = r1
            java.util.HashMap r1 = new java.util.HashMap
            java.util.Map r3 = r3.f
            r1.<init>(r3)
            r0.Z = r1
            return r0
        L32:
            java.lang.String r3 = "Null encodedPayload"
            defpackage.u34.x(r3)
            return r1
        L38:
            java.lang.String r3 = "Null transportName"
            defpackage.u34.x(r3)
            return r1
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.hy
            r2 = 0
            if (r1 == 0) goto L49
            hy r8 = (defpackage.hy) r8
            java.lang.String r1 = r7.a
            java.lang.String r3 = r8.a
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
            java.lang.Integer r1 = r8.b
            java.lang.Integer r3 = r7.b
            if (r3 != 0) goto L1e
            if (r1 != 0) goto L49
            goto L24
        L1e:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L49
        L24:
            w32 r1 = r7.c
            w32 r3 = r8.c
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L49
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L49
            long r3 = r7.e
            long r5 = r8.e
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L49
            java.util.Map r7 = r7.f
            java.util.Map r8 = r8.f
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L49
            return r0
        L49:
            return r2
    }

    public final int hashCode() {
            r7 = this;
            java.lang.String r0 = r7.a
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            java.lang.Integer r2 = r7.b
            if (r2 != 0) goto L11
            r2 = 0
            goto L15
        L11:
            int r2 = r2.hashCode()
        L15:
            r0 = r0 ^ r2
            int r0 = r0 * r1
            w32 r2 = r7.c
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.d
            r4 = 32
            long r5 = r2 >>> r4
            long r2 = r2 ^ r5
            int r2 = (int) r2
            r0 = r0 ^ r2
            int r0 = r0 * r1
            long r2 = r7.e
            long r4 = r2 >>> r4
            long r2 = r2 ^ r4
            int r2 = (int) r2
            r0 = r0 ^ r2
            int r0 = r0 * r1
            java.util.Map r7 = r7.f
            int r7 = r7.hashCode()
            r7 = r7 ^ r0
            return r7
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EventInternal{transportName="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            java.lang.Integer r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", encodedPayload="
            r0.append(r1)
            w32 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", eventMillis="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", autoMetadata="
            r0.append(r1)
            java.util.Map r3 = r3.f
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
