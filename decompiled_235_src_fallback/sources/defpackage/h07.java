package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h07  reason: default package */
/* loaded from: classes.dex */
public final class h07 {
    public final java.lang.CharSequence a;
    public final long b;
    public final android.view.textclassifier.TextClassification c;

    public h07(java.lang.CharSequence r1, long r2, android.view.textclassifier.TextClassification r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.h07
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h07 r8 = (defpackage.h07) r8
            java.lang.CharSequence r1 = r7.a
            java.lang.CharSequence r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.b
            long r5 = r8.b
            boolean r1 = defpackage.k47.b(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            android.view.textclassifier.TextClassification r7 = r7.c
            android.view.textclassifier.TextClassification r8 = r8.c
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L2d
            return r2
        L2d:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.CharSequence r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = defpackage.k47.c
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            android.view.textclassifier.TextClassification r4 = r4.c
            int r4 = defpackage.q66.a(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextClassificationResult(text="
            r0.<init>(r1)
            java.lang.CharSequence r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", selection="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.k47.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", textClassification="
            r0.append(r1)
            android.view.textclassifier.TextClassification r3 = r3.c
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
