package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed  reason: default package */
/* loaded from: classes.dex */
public final class ed extends defpackage.yh2 {
    public final int d;

    public ed(int r1) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.ed
            if (r0 == 0) goto Le
            ed r2 = (defpackage.ed) r2
            int r2 = r2.d
            int r1 = r1.d
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.d
            int r0 = r0 * 31
            return r0
    }
}
