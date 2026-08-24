package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hu2  reason: default package */
/* loaded from: classes.dex */
public final class hu2 implements defpackage.iu2 {
    public final int a;

    public hu2(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            if (r1 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L11
            java.lang.String r0 = "Provided count should be larger than zero"
            defpackage.s53.a(r0)
        L11:
            return
    }

    @Override // defpackage.iu2
    public final java.util.ArrayList a(defpackage.qh1 r1, int r2, int r3) {
            r0 = this;
            int r0 = r0.a
            java.util.ArrayList r0 = defpackage.hi2.q(r2, r0, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.hu2
            if (r0 == 0) goto Le
            hu2 r2 = (defpackage.hu2) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 != r2) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = -r0
            return r0
    }
}
