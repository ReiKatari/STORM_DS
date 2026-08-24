package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su3  reason: default package */
/* loaded from: classes.dex */
public final class su3 {
    public static final int b = 66305;
    public final int a;

    public /* synthetic */ su3(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.lang.String a(int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineBreak(strategy="
            r0.<init>(r1)
            r1 = r6 & 255(0xff, float:3.57E-43)
            r2 = 3
            java.lang.String r3 = "Invalid"
            r4 = 2
            r5 = 1
            if (r1 != r5) goto L13
            java.lang.String r1 = "Strategy.Simple"
            goto L23
        L13:
            if (r1 != r4) goto L18
            java.lang.String r1 = "Strategy.HighQuality"
            goto L23
        L18:
            if (r1 != r2) goto L1d
            java.lang.String r1 = "Strategy.Balanced"
            goto L23
        L1d:
            if (r1 != 0) goto L22
            java.lang.String r1 = "Strategy.Unspecified"
            goto L23
        L22:
            r1 = r3
        L23:
            r0.append(r1)
            java.lang.String r1 = ", strictness="
            r0.append(r1)
            int r1 = r6 >> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r5) goto L34
            java.lang.String r1 = "Strictness.None"
            goto L4a
        L34:
            if (r1 != r4) goto L39
            java.lang.String r1 = "Strictness.Loose"
            goto L4a
        L39:
            if (r1 != r2) goto L3e
            java.lang.String r1 = "Strictness.Normal"
            goto L4a
        L3e:
            r2 = 4
            if (r1 != r2) goto L44
            java.lang.String r1 = "Strictness.Strict"
            goto L4a
        L44:
            if (r1 != 0) goto L49
            java.lang.String r1 = "Strictness.Unspecified"
            goto L4a
        L49:
            r1 = r3
        L4a:
            r0.append(r1)
            java.lang.String r1 = ", wordBreak="
            r0.append(r1)
            int r6 = r6 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r6 != r5) goto L5b
            java.lang.String r3 = "WordBreak.None"
            goto L64
        L5b:
            if (r6 != r4) goto L60
            java.lang.String r3 = "WordBreak.Phrase"
            goto L64
        L60:
            if (r6 != 0) goto L64
            java.lang.String r3 = "WordBreak.Unspecified"
        L64:
            r0.append(r3)
            r6 = 41
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.su3
            if (r0 != 0) goto L5
            goto Ld
        L5:
            su3 r2 = (defpackage.su3) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            int r0 = r0.a
            java.lang.String r0 = a(r0)
            return r0
    }
}
