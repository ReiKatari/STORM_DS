package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements java.util.function.IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int r2) {
            r1 = this;
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 > r1) goto L6
            return r2
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "Request %,d exceeds maximum %,d"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1)
            throw r0
    }
}
