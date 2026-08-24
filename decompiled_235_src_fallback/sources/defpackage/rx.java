package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rx  reason: default package */
/* loaded from: classes.dex */
public final class rx extends defpackage.u30 {
    public final java.util.ArrayList a;

    public rx(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r2 != r1) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.u30
            if (r0 == 0) goto L15
            u30 r2 = (defpackage.u30) r2
            rx r2 = (defpackage.rx) r2
            java.util.ArrayList r2 = r2.a
            java.util.ArrayList r1 = r1.a
            boolean r1 = r1.equals(r2)
            return r1
        L15:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r1 = this;
            java.util.ArrayList r1 = r1.a
            int r1 = r1.hashCode()
            r0 = 1000003(0xf4243, float:1.401303E-39)
            r1 = r1 ^ r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BatchedLogRequest{logRequests="
            r0.<init>(r1)
            java.util.ArrayList r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = "}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
