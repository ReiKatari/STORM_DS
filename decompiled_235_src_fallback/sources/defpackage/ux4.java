package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ux4  reason: default package */
/* loaded from: classes.dex */
public final class ux4 {
    public static final defpackage.ux4 c = null;
    public final boolean a;
    public final int b;

    static {
            ux4 r0 = new ux4
            r1 = 0
            r0.<init>(r1, r1)
            defpackage.ux4.c = r0
            return
    }

    public ux4() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b = r0
            return
    }

    public ux4(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ux4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ux4 r5 = (defpackage.ux4) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r4 = r4.b
            int r5 = r5.b
            if (r4 != r5) goto L1a
            return r0
        L1a:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlatformParagraphStyle(includeFontPadding="
            r0.<init>(r1)
            boolean r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", emojiSupportMatch="
            r0.append(r1)
            int r2 = r2.b
            java.lang.String r2 = defpackage.jt1.a(r2)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
