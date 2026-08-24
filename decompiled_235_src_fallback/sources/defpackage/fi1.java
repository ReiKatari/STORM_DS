package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi1  reason: default package */
/* loaded from: classes.dex */
public final class fi1 {
    public static final defpackage.fi1 c = null;
    public final long a;
    public final long b;

    static {
            fi1 r0 = new fi1
            r1 = 0
            r0.<init>(r1, r1)
            defpackage.fi1.c = r0
            return
    }

    public fi1(long r1, long r3) {
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
            boolean r1 = r8 instanceof defpackage.fi1
            r2 = 0
            if (r1 != 0) goto La
            goto L16
        La:
            fi1 r8 = (defpackage.fi1) r8
            long r3 = r8.a
            long r5 = r7.a
            boolean r1 = defpackage.q93.b(r5, r3)
            if (r1 != 0) goto L17
        L16:
            return r2
        L17:
            long r3 = r7.b
            long r7 = r8.b
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 != 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.b
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }
}
