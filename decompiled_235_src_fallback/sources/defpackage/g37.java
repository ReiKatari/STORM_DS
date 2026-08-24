package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g37  reason: default package */
/* loaded from: classes.dex */
public final class g37 {
    public static final defpackage.g37 c = null;
    public final long a;
    public final long b;

    static {
            g37 r0 = new g37
            r1 = 0
            r3 = 3
            r0.<init>(r3, r1)
            defpackage.g37.c = r0
            return
    }

    public /* synthetic */ g37(int r3, long r4) {
            r2 = this;
            r3 = r3 & 1
            r0 = 0
            if (r3 == 0) goto L9
            long r4 = defpackage.hi2.E(r0)
        L9:
            long r0 = defpackage.hi2.E(r0)
            r2.<init>(r4, r0)
            return
    }

    public g37(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.g37
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g37 r8 = (defpackage.g37) r8
            long r3 = r8.a
            long r5 = r7.a
            boolean r1 = defpackage.x47.a(r5, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.b
            long r7 = r8.b
            boolean r7 = defpackage.x47.a(r3, r7)
            if (r7 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            y47[] r0 = defpackage.x47.b
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextIndent(firstLine="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.x47.d(r1)
            r0.append(r1)
            java.lang.String r1 = ", restLine="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r3 = defpackage.x47.d(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
