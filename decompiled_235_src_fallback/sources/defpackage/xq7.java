package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq7  reason: default package */
/* loaded from: classes.dex */
public final class xq7 {
    public final int a;
    public final int b;
    public final int c;

    public xq7(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.xq7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xq7 r5 = (defpackage.xq7) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r4 = r4.c
            int r5 = r5.c
            if (r4 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.c
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", current="
            java.lang.String r1 = ", total="
            int r2 = r5.a
            int r3 = r5.b
            java.lang.String r4 = "VulkanCompileProgress(stageId="
            java.lang.StringBuilder r0 = defpackage.i61.q(r2, r3, r4, r0, r1)
            java.lang.String r1 = ")"
            int r5 = r5.c
            java.lang.String r5 = defpackage.lb1.o(r0, r5, r1)
            return r5
    }
}
