package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn6  reason: default package */
/* loaded from: classes.dex */
public final class cn6 extends defpackage.f80 {
    public final long a;

    public cn6(long r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.f80
    public final void a(float r3, long r4, defpackage.aj r6) {
            r2 = this;
            r4 = 1065353216(0x3f800000, float:1.0)
            r6.j(r4)
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            long r0 = r2.a
            if (r4 != 0) goto Lc
            goto L15
        Lc:
            float r2 = defpackage.kt0.e(r0)
            float r2 = r2 * r3
            long r0 = defpackage.kt0.c(r2, r0)
        L15:
            r6.l(r0)
            java.lang.Object r2 = r6.R
            android.graphics.Shader r2 = (android.graphics.Shader) r2
            if (r2 == 0) goto L22
            r2 = 0
            r6.p(r2)
        L22:
            return
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.cn6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            cn6 r6 = (defpackage.cn6) r6
            long r3 = r6.a
            long r5 = r5.a
            boolean r5 = defpackage.kt0.d(r5, r3)
            if (r5 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = defpackage.kt0.i
            long r0 = r2.a
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SolidColor(value="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r3 = defpackage.kt0.j(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
