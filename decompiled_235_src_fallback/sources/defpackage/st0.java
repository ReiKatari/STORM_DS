package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st0  reason: default package */
/* loaded from: classes.dex */
public final class st0 implements defpackage.e37 {
    public final long a;

    public st0(long r3) {
            r2 = this;
            r2.<init>()
            r2.a = r3
            r0 = 16
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lc
            return
        Lc:
            java.lang.String r2 = "ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead."
            defpackage.q53.a(r2)
            return
    }

    @Override // defpackage.e37
    public final float a() {
            r2 = this;
            long r0 = r2.a
            float r2 = defpackage.kt0.e(r0)
            return r2
    }

    @Override // defpackage.e37
    public final long b() {
            r2 = this;
            long r0 = r2.a
            return r0
    }

    @Override // defpackage.e37
    public final defpackage.f80 c() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.st0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            st0 r6 = (defpackage.st0) r6
            long r3 = r5.a
            long r5 = r6.a
            boolean r5 = defpackage.kt0.d(r3, r5)
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
            java.lang.String r1 = "ColorStyle(value="
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
