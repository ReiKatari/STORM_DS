package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lz1  reason: default package */
/* loaded from: classes.dex */
public final class lz1 {
    public final long a;
    public final defpackage.tu0 b;

    public lz1(long r1, defpackage.tu0 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.lz1
            r2 = 0
            if (r1 != 0) goto La
            goto L14
        La:
            lz1 r8 = (defpackage.lz1) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
        L14:
            return r2
        L15:
            tu0 r7 = r7.b
            tu0 r8 = r8.b
            if (r7 == r8) goto L1c
            return r2
        L1c:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            tu0 r2 = r2.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HardcoreExitChoiceWaiter(requestId="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", deferred="
            r0.append(r1)
            tu0 r3 = r3.b
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
