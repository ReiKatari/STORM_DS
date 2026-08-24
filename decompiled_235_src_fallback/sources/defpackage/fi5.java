package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi5  reason: default package */
/* loaded from: classes.dex */
public final class fi5 extends defpackage.yh2 {
    public final defpackage.yh2 d;
    public final int e;

    public fi5(defpackage.yh2 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.d = r1
            r0.e = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.fi5
            if (r0 == 0) goto L18
            fi5 r3 = (defpackage.fi5) r3
            yh2 r0 = r3.d
            yh2 r1 = r2.d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            int r3 = r3.e
            int r2 = r2.e
            if (r3 != r2) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.e
            int r0 = r0 * 31
            yh2 r1 = r1.d
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
