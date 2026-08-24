package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h80  reason: default package */
/* loaded from: classes.dex */
public final class h80 implements defpackage.e37 {
    public final defpackage.xd6 a;
    public final float b;

    public h80(defpackage.xd6 r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.e37
    public final float a() {
            r0 = this;
            float r0 = r0.b
            return r0
    }

    @Override // defpackage.e37
    public final long b() {
            r2 = this;
            int r2 = defpackage.kt0.i
            long r0 = defpackage.kt0.h
            return r0
    }

    @Override // defpackage.e37
    public final defpackage.f80 c() {
            r0 = this;
            xd6 r0 = r0.a
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.h80
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h80 r5 = (defpackage.h80) r5
            xd6 r1 = r4.a
            xd6 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            float r4 = r4.b
            float r5 = r5.b
            int r4 = java.lang.Float.compare(r4, r5)
            if (r4 == 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            xd6 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r1.b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BrushStyle(value="
            r0.<init>(r1)
            xd6 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", alpha="
            r0.append(r1)
            float r2 = r2.b
            r1 = 41
            java.lang.String r2 = defpackage.xg6.p(r0, r2, r1)
            return r2
    }
}
