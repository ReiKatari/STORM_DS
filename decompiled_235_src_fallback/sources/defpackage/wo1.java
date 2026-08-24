package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo1  reason: default package */
/* loaded from: classes.dex */
public final class wo1 extends defpackage.ja2 {
    public final android.graphics.drawable.Drawable a;
    public final boolean b;
    public final defpackage.zb1 c;

    public wo1(android.graphics.drawable.Drawable r1, boolean r2, defpackage.zb1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.wo1
            if (r1 == 0) goto L21
            wo1 r4 = (defpackage.wo1) r4
            android.graphics.drawable.Drawable r1 = r4.a
            android.graphics.drawable.Drawable r2 = r3.a
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L21
            boolean r1 = r3.b
            boolean r2 = r4.b
            if (r1 != r2) goto L21
            zb1 r3 = r3.c
            zb1 r4 = r4.c
            if (r3 != r4) goto L21
            return r0
        L21:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r3 = this;
            android.graphics.drawable.Drawable r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.b
            int r0 = defpackage.xg6.e(r0, r2, r1)
            zb1 r3 = r3.c
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }
}
