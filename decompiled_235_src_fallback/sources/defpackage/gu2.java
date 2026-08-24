package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu2  reason: default package */
/* loaded from: classes.dex */
public final class gu2 implements defpackage.iu2 {
    public final float a;

    public gu2(float r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0 = 0
            int r0 = defpackage.om1.a(r1, r0)
            if (r0 <= 0) goto Ld
            return
        Ld:
            java.lang.String r0 = "Provided min size should be larger than zero."
            defpackage.s53.a(r0)
            return
    }

    @Override // defpackage.iu2
    public final java.util.ArrayList a(defpackage.qh1 r2, int r3, int r4) {
            r1 = this;
            int r0 = r3 + r4
            float r1 = r1.a
            int r1 = r2.r0(r1)
            int r1 = r1 + r4
            int r0 = r0 / r1
            r1 = 1
            int r1 = java.lang.Math.max(r0, r1)
            java.util.ArrayList r1 = defpackage.hi2.q(r3, r1, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.gu2
            if (r0 == 0) goto L12
            gu2 r2 = (defpackage.gu2) r2
            float r2 = r2.a
            float r1 = r1.a
            boolean r1 = defpackage.om1.b(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }
}
