package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj1  reason: default package */
/* loaded from: classes.dex */
public final class pj1 extends defpackage.ge7 {
    public final int m;

    public pj1(int r1) {
            r0 = this;
            r0.<init>()
            r0.m = r1
            if (r1 <= 0) goto L8
            return
        L8:
            java.lang.String r0 = "px must be > 0."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            boolean r1 = r3 instanceof defpackage.pj1
            if (r1 == 0) goto L11
            pj1 r3 = (defpackage.pj1) r3
            int r3 = r3.m
            int r2 = r2.m
            if (r2 != r3) goto L11
            return r0
        L11:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.m
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.m
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
