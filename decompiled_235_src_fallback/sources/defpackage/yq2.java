package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq2  reason: default package */
/* loaded from: classes.dex */
public final class yq2 implements defpackage.by0 {
    public final defpackage.yx0 A;

    public yq2(defpackage.yx0 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.yq2
            if (r0 == 0) goto L12
            yq2 r2 = (defpackage.yq2) r2
            yx0 r2 = r2.A
            yx0 r1 = r1.A
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            yx0 r0 = r0.A
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            return r0
    }
}
