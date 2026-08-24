package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef3  reason: default package */
/* loaded from: classes.dex */
public final class ef3 extends defpackage.ee3 {
    public final java.io.Serializable A;

    public ef3(java.lang.Boolean r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.A = r1
            return
    }

    public ef3(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.A = r1
            return
    }

    public ef3(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.A = r1
            return
    }

    public static boolean h(defpackage.ef3 r1) {
            java.io.Serializable r1 = r1.A
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L1e
            java.lang.Number r1 = (java.lang.Number) r1
            boolean r0 = r1 instanceof java.math.BigInteger
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Long
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Integer
            if (r0 != 0) goto L1c
            boolean r0 = r1 instanceof java.lang.Short
            if (r0 != 0) goto L1c
            boolean r1 = r1 instanceof java.lang.Byte
            if (r1 == 0) goto L1e
        L1c:
            r1 = 1
            return r1
        L1e:
            r1 = 0
            return r1
    }

    @Override // defpackage.ee3
    public final int a() {
            r1 = this;
            java.io.Serializable r0 = r1.A
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r1 = r1.g()
            int r1 = r1.intValue()
            return r1
        Lf:
            java.lang.String r1 = r1.c()
            int r1 = java.lang.Integer.parseInt(r1)
            return r1
    }

    @Override // defpackage.ee3
    public final java.lang.String c() {
            r3 = this;
            java.io.Serializable r0 = r3.A
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L9
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L9:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L16
            java.lang.Number r3 = r3.g()
            java.lang.String r3 = r3.toString()
            return r3
        L16:
            boolean r3 = r0 instanceof java.lang.Boolean
            if (r3 == 0) goto L21
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.String r3 = r0.toString()
            return r3
        L21:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.Class r0 = r0.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected value type: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    public final java.math.BigInteger d() {
            r2 = this;
            java.io.Serializable r0 = r2.A
            boolean r1 = r0 instanceof java.math.BigInteger
            if (r1 == 0) goto L9
            java.math.BigInteger r0 = (java.math.BigInteger) r0
            return r0
        L9:
            boolean r0 = h(r2)
            if (r0 == 0) goto L1c
            java.lang.Number r2 = r2.g()
            long r0 = r2.longValue()
            java.math.BigInteger r2 = java.math.BigInteger.valueOf(r0)
            return r2
        L1c:
            java.lang.String r2 = r2.c()
            defpackage.qo2.n(r2)
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            goto La0
        L4:
            if (r4 == 0) goto La7
            java.lang.Class<ef3> r0 = defpackage.ef3.class
            java.lang.Class r1 = r4.getClass()
            if (r0 == r1) goto L10
            goto La7
        L10:
            ef3 r4 = (defpackage.ef3) r4
            java.io.Serializable r0 = r4.A
            java.io.Serializable r1 = r3.A
            if (r1 != 0) goto L1c
            if (r0 != 0) goto La7
            goto La0
        L1c:
            boolean r2 = h(r3)
            if (r2 == 0) goto L53
            boolean r2 = h(r4)
            if (r2 == 0) goto L53
            boolean r1 = r1 instanceof java.math.BigInteger
            if (r1 != 0) goto L46
            boolean r0 = r0 instanceof java.math.BigInteger
            if (r0 == 0) goto L31
            goto L46
        L31:
            java.lang.Number r3 = r3.g()
            long r0 = r3.longValue()
            java.lang.Number r3 = r4.g()
            long r3 = r3.longValue()
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto La7
            goto La0
        L46:
            java.math.BigInteger r3 = r3.d()
            java.math.BigInteger r4 = r4.d()
            boolean r3 = r3.equals(r4)
            return r3
        L53:
            boolean r2 = r1 instanceof java.lang.Number
            if (r2 == 0) goto La2
            boolean r2 = r0 instanceof java.lang.Number
            if (r2 == 0) goto La2
            boolean r2 = r1 instanceof java.math.BigDecimal
            if (r2 == 0) goto L88
            boolean r2 = r0 instanceof java.math.BigDecimal
            if (r2 == 0) goto L88
            boolean r2 = r1 instanceof java.math.BigDecimal
            if (r2 == 0) goto L6a
            java.math.BigDecimal r1 = (java.math.BigDecimal) r1
            goto L72
        L6a:
            java.lang.String r3 = r3.c()
            java.math.BigDecimal r1 = defpackage.qo2.D(r3)
        L72:
            boolean r3 = r0 instanceof java.math.BigDecimal
            if (r3 == 0) goto L79
            java.math.BigDecimal r0 = (java.math.BigDecimal) r0
            goto L81
        L79:
            java.lang.String r3 = r4.c()
            java.math.BigDecimal r0 = defpackage.qo2.D(r3)
        L81:
            int r3 = r1.compareTo(r0)
            if (r3 != 0) goto La7
            goto La0
        L88:
            double r0 = r3.f()
            double r3 = r4.f()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto La0
            boolean r0 = java.lang.Double.isNaN(r0)
            if (r0 == 0) goto La7
            boolean r3 = java.lang.Double.isNaN(r3)
            if (r3 == 0) goto La7
        La0:
            r3 = 1
            return r3
        La2:
            boolean r3 = r1.equals(r0)
            return r3
        La7:
            r3 = 0
            return r3
    }

    public final double f() {
            r2 = this;
            java.io.Serializable r0 = r2.A
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto Lf
            java.lang.Number r2 = r2.g()
            double r0 = r2.doubleValue()
            return r0
        Lf:
            java.lang.String r2 = r2.c()
            double r0 = java.lang.Double.parseDouble(r2)
            return r0
    }

    public final java.lang.Number g() {
            r1 = this;
            java.io.Serializable r1 = r1.A
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L9
            java.lang.Number r1 = (java.lang.Number) r1
            return r1
        L9:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L15
            fo3 r0 = new fo3
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
        L15:
            java.lang.String r1 = "Primitive is neither a number nor a string"
            defpackage.fa6.h(r1)
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r4 = this;
            java.io.Serializable r0 = r4.A
            if (r0 != 0) goto L7
            r4 = 31
            return r4
        L7:
            boolean r1 = h(r4)
            r2 = 32
            if (r1 == 0) goto L1c
            java.lang.Number r4 = r4.g()
            long r0 = r4.longValue()
        L17:
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r4 = (int) r0
            return r4
        L1c:
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2d
            java.lang.Number r4 = r4.g()
            double r0 = r4.doubleValue()
            long r0 = java.lang.Double.doubleToLongBits(r0)
            goto L17
        L2d:
            int r4 = r0.hashCode()
            return r4
    }
}
