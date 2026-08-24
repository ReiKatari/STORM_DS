package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ty  reason: default package */
/* loaded from: classes.dex */
public final class ty {
    public final long a;
    public final defpackage.fz b;
    public final defpackage.hy c;

    public ty(long r1, defpackage.fz r3, defpackage.hy r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r5 != r4) goto L3
            goto L25
        L3:
            boolean r0 = r5 instanceof defpackage.ty
            if (r0 == 0) goto L27
            ty r5 = (defpackage.ty) r5
            long r0 = r4.a
            long r2 = r5.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L27
            fz r0 = r4.b
            fz r1 = r5.b
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L27
            hy r4 = r4.c
            hy r5 = r5.c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L27
        L25:
            r4 = 1
            return r4
        L27:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            r0 = 32
            long r1 = r5.a
            long r3 = r1 >>> r0
            long r0 = r3 ^ r1
            int r0 = (int) r0
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            int r0 = r0 * r1
            fz r2 = r5.b
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            int r0 = r0 * r1
            hy r5 = r5.c
            int r5 = r5.hashCode()
            r5 = r5 ^ r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PersistedEvent{id="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", transportContext="
            r0.append(r1)
            fz r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", event="
            r0.append(r1)
            hy r3 = r3.c
            r0.append(r3)
            java.lang.String r3 = "}"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
