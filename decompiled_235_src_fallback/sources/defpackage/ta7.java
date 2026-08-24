package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ta7  reason: default package */
/* loaded from: classes.dex */
public final class ta7 {
    public final java.lang.String a;
    public java.lang.String b;
    public final android.graphics.RectF c;
    public final int d;
    public final int e;

    public ta7(java.lang.String r1, java.lang.String r2, android.graphics.RectF r3, int r4, int r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public static defpackage.ta7 a(defpackage.ta7 r6, java.lang.String r7, android.graphics.RectF r8, int r9) {
            r9 = r9 & 1
            if (r9 == 0) goto L6
            java.lang.String r7 = r6.a
        L6:
            r1 = r7
            java.lang.String r2 = r6.b
            int r4 = r6.d
            int r5 = r6.e
            r1.getClass()
            r2.getClass()
            ta7 r0 = new ta7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ta7
            if (r1 != 0) goto L9
            goto L39
        L9:
            ta7 r4 = (defpackage.ta7) r4
            java.lang.String r1 = r3.a
            java.lang.String r2 = r4.a
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L16
            goto L39
        L16:
            java.lang.String r1 = r3.b
            java.lang.String r2 = r4.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L21
            goto L39
        L21:
            android.graphics.RectF r1 = r3.c
            android.graphics.RectF r2 = r4.c
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L2c
            goto L39
        L2c:
            int r1 = r3.d
            int r2 = r4.d
            if (r1 == r2) goto L33
            goto L39
        L33:
            int r3 = r3.e
            int r4 = r4.e
            if (r3 == r4) goto L3b
        L39:
            r3 = 0
            return r3
        L3b:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            android.graphics.RectF r2 = r3.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r3.d
            int r0 = defpackage.lb1.a(r0, r2, r1)
            int r3 = r3.e
            int r3 = defpackage.lb1.a(r3, r0, r1)
            r0 = 0
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.b
            java.lang.String r1 = ", translatedText="
            java.lang.String r2 = ", boundingBox="
            java.lang.String r3 = "TranslatedTextBlock(originalText="
            java.lang.String r4 = r5.a
            java.lang.StringBuilder r0 = defpackage.i61.u(r3, r4, r1, r0, r2)
            android.graphics.RectF r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ", backgroundColor="
            r0.append(r1)
            int r1 = r5.d
            r0.append(r1)
            java.lang.String r1 = ", textColor="
            r0.append(r1)
            java.lang.String r1 = ", isShowingOriginal=false)"
            int r5 = r5.e
            java.lang.String r5 = defpackage.lb1.o(r0, r5, r1)
            return r5
    }
}
