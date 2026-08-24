package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx  reason: default package */
/* loaded from: classes.dex */
public final class tx {
    public final int a;

    public tx(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r3 != r2) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.tx
            if (r1 == 0) goto L11
            tx r3 = (defpackage.tx) r3
            int r2 = r2.a
            int r3 = r3.a
            if (r2 != r3) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r1 = r1.a
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            int r1 = r1 * r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StateError{code="
            r0.<init>(r1)
            int r2 = r2.a
            java.lang.String r1 = ", cause=null}"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}
