package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo3  reason: default package */
/* loaded from: classes.dex */
public final class fo3 extends java.lang.Number {
    public final java.lang.String A;

    public fo3(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Number
    public final double doubleValue() {
            r2 = this;
            java.lang.String r2 = r2.A
            double r0 = java.lang.Double.parseDouble(r2)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.fo3
            if (r0 == 0) goto L13
            fo3 r2 = (defpackage.fo3) r2
            java.lang.String r1 = r1.A
            java.lang.String r2 = r2.A
            boolean r1 = r1.equals(r2)
            return r1
        L13:
            r1 = 0
            return r1
    }

    @Override // java.lang.Number
    public final float floatValue() {
            r0 = this;
            java.lang.String r0 = r0.A
            float r0 = java.lang.Float.parseFloat(r0)
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.A
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.lang.Number
    public final int intValue() {
            r2 = this;
            java.lang.String r2 = r2.A
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L7
            return r2
        L7:
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> Ld
            int r2 = (int) r0
            return r2
        Ld:
            java.math.BigDecimal r2 = defpackage.qo2.D(r2)
            int r2 = r2.intValue()
            return r2
    }

    @Override // java.lang.Number
    public final long longValue() {
            r2 = this;
            java.lang.String r2 = r2.A
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L7
            return r0
        L7:
            java.math.BigDecimal r2 = defpackage.qo2.D(r2)
            long r0 = r2.longValue()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.A
            return r0
    }
}
