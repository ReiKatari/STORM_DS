package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b17  reason: default package */
/* loaded from: classes.dex */
public final class b17 {
    public static final defpackage.b17 b = null;
    public static final defpackage.b17 c = null;
    public static final defpackage.b17 d = null;
    public final int a;

    static {
            b17 r0 = new b17
            r1 = 0
            r0.<init>(r1)
            defpackage.b17.b = r0
            b17 r0 = new b17
            r1 = 1
            r0.<init>(r1)
            defpackage.b17.c = r0
            b17 r0 = new b17
            r1 = 2
            r0.<init>(r1)
            defpackage.b17.d = r0
            return
    }

    public b17(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.b17
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            b17 r4 = (defpackage.b17) r4
            int r4 = r4.a
            int r3 = r3.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            int r4 = r4.a
            if (r4 != 0) goto L7
            java.lang.String r4 = "TextDecoration.None"
            return r4
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r4 & 1
            if (r1 == 0) goto L15
            java.lang.String r1 = "Underline"
            r0.add(r1)
        L15:
            r4 = r4 & 2
            if (r4 == 0) goto L1e
            java.lang.String r4 = "LineThrough"
            r0.add(r4)
        L1e:
            int r4 = r0.size()
            r1 = 1
            if (r4 != r1) goto L3b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "TextDecoration."
            r4.<init>(r1)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        L3b:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "TextDecoration["
            r4.<init>(r1)
            r1 = 0
            r2 = 62
            java.lang.String r3 = ", "
            java.lang.String r0 = defpackage.ex3.a(r2, r1, r3, r0)
            r1 = 93
            java.lang.String r4 = defpackage.lb1.q(r4, r0, r1)
            return r4
    }
}
