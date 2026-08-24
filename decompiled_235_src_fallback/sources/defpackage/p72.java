package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p72  reason: default package */
/* loaded from: classes.dex */
public final class p72 {
    public final long a;
    public final long b;

    public p72(long r4, long r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 != 0) goto L10
            r3.a = r0
            r4 = 1
            r3.b = r4
            return
        L10:
            r3.a = r4
            r3.b = r6
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
