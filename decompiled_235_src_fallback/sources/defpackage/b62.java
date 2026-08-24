package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b62  reason: default package */
/* loaded from: classes.dex */
public final class b62 extends defpackage.a33 {
    public final android.graphics.drawable.Drawable a;
    public final defpackage.z23 b;
    public final java.lang.Throwable c;

    public b62(android.graphics.drawable.Drawable r1, defpackage.z23 r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // defpackage.a33
    public final android.graphics.drawable.Drawable a() {
            r0 = this;
            android.graphics.drawable.Drawable r0 = r0.a
            return r0
    }

    @Override // defpackage.a33
    public final defpackage.z23 b() {
            r0 = this;
            z23 r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L27
        L3:
            boolean r0 = r3 instanceof defpackage.b62
            if (r0 == 0) goto L29
            b62 r3 = (defpackage.b62) r3
            android.graphics.drawable.Drawable r0 = r3.a
            android.graphics.drawable.Drawable r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L29
            z23 r0 = r2.b
            z23 r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L29
            java.lang.Throwable r2 = r2.c
            java.lang.Throwable r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L29
        L27:
            r2 = 1
            return r2
        L29:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.a
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r0 * 31
            z23 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Throwable r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }
}
