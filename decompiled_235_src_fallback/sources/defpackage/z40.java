package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z40  reason: default package */
/* loaded from: classes.dex */
public final class z40 {
    public final android.graphics.ColorFilter a;
    public final long b;
    public final int c;

    public z40(int r4, long r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L16
            defpackage.od.g()
            int r0 = defpackage.hv.b0(r5)
            android.graphics.BlendMode r1 = defpackage.f04.S(r4)
            android.graphics.BlendModeColorFilter r0 = defpackage.od.c(r0, r1)
            goto L23
        L16:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r1 = defpackage.hv.b0(r5)
            android.graphics.PorterDuff$Mode r2 = defpackage.f04.T(r4)
            r0.<init>(r1, r2)
        L23:
            r3.<init>()
            r3.a = r0
            r3.b = r5
            r3.c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.z40
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            z40 r8 = (defpackage.z40) r8
            long r3 = r8.b
            long r5 = r7.b
            boolean r1 = defpackage.kt0.d(r5, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r7 = r7.c
            int r8 = r8.c
            if (r7 != r8) goto L1e
            return r0
        L1e:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = defpackage.kt0.i
            long r0 = r2.b
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            int r2 = r2.c
            int r2 = java.lang.Integer.hashCode(r2)
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlendModeColorFilter(color="
            r0.<init>(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.kt0.j(r1)
            r0.append(r1)
            java.lang.String r1 = ", blendMode="
            r0.append(r1)
            int r3 = r3.c
            java.lang.String r3 = defpackage.u24.J(r3)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
