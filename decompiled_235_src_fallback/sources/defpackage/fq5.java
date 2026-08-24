package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq5  reason: default package */
/* loaded from: classes.dex */
public final class fq5 {
    public final long a;

    public fq5() {
            r2 = this;
            long r0 = defpackage.kt0.h
            r2.<init>()
            r2.a = r0
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L16
        L3:
            boolean r0 = r3 instanceof defpackage.fq5
            if (r0 != 0) goto L8
            goto L14
        L8:
            fq5 r3 = (defpackage.fq5) r3
            long r0 = r3.a
            long r2 = r2.a
            boolean r2 = defpackage.kt0.d(r2, r0)
            if (r2 != 0) goto L16
        L14:
            r2 = 0
            return r2
        L16:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = defpackage.kt0.i
            long r0 = r2.a
            int r2 = java.lang.Long.hashCode(r0)
            int r2 = r2 * 31
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RippleConfiguration(color="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r3 = defpackage.kt0.j(r1)
            r0.append(r3)
            java.lang.String r3 = ", rippleAlpha=null)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
