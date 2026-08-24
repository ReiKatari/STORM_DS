package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua7  reason: default package */
/* loaded from: classes.dex */
public final class ua7 {
    public final java.lang.String a;
    public final android.graphics.RectF b;
    public final java.lang.String c;

    public /* synthetic */ ua7(android.graphics.RectF r3) {
            r2 = this;
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r0.getClass()
            java.lang.String r1 = ""
            r2.<init>(r0, r3, r1)
            return
    }

    public ua7(java.lang.String r1, android.graphics.RectF r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static defpackage.ua7 a(defpackage.ua7 r2, android.graphics.RectF r3) {
            java.lang.String r0 = r2.a
            java.lang.String r1 = r2.c
            r2.getClass()
            r0.getClass()
            r1.getClass()
            ua7 r2 = new ua7
            r2.<init>(r0, r3, r1)
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ua7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ua7 r5 = (defpackage.ua7) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            android.graphics.RectF r1 = r4.b
            android.graphics.RectF r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r4 = r4.c
            java.lang.String r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.graphics.RectF r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TranslationRegion(id="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", rect="
            r0.append(r1)
            android.graphics.RectF r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.c
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
