package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: io6  reason: default package */
/* loaded from: classes.dex */
public final class io6 implements defpackage.rc2 {
    public final float a;
    public final float b;
    public final java.lang.Object c;

    public io6(float r1, float r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public /* synthetic */ io6(java.lang.Object r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1153138688(0x44bb8000, float:1500.0)
            r2.<init>(r0, r1, r3)
            return
    }

    @Override // defpackage.to
    public final defpackage.il7 a(defpackage.wc7 r3) {
            r2 = this;
            j97 r0 = new j97
            java.lang.Object r1 = r2.c
            if (r1 != 0) goto L8
            r3 = 0
            goto L10
        L8:
            qn2 r3 = r3.a
            java.lang.Object r3 = r3.g(r1)
            ap r3 = (defpackage.ap) r3
        L10:
            float r1 = r2.a
            float r2 = r2.b
            r0.<init>(r1, r2, r3)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof defpackage.io6
            r1 = 0
            if (r0 == 0) goto L23
            io6 r4 = (defpackage.io6) r4
            float r0 = r4.a
            float r2 = r3.a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            float r0 = r4.b
            float r2 = r3.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L23
            java.lang.Object r4 = r4.c
            java.lang.Object r3 = r3.c
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 == 0) goto L23
            r3 = 1
            return r3
        L23:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.c
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.a
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r3 = r3.b
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }
}
