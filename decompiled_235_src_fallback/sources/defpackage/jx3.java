package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx3  reason: default package */
/* loaded from: classes.dex */
public final class jx3 extends defpackage.mx3 {
    public final defpackage.xb1 a;

    public jx3() {
            r1 = this;
            xb1 r0 = defpackage.xb1.b
            r1.<init>(r0)
            return
    }

    public jx3(defpackage.xb1 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<jx3> r0 = defpackage.jx3.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            jx3 r3 = (defpackage.jx3) r3
            xb1 r2 = r2.a
            xb1 r3 = r3.a
            boolean r2 = r2.equals(r3)
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.lang.Class<jx3> r0 = defpackage.jx3.class
            java.lang.String r0 = r0.getName()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            xb1 r1 = r1.a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure {mOutputData="
            r0.<init>(r1)
            xb1 r2 = r2.a
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
