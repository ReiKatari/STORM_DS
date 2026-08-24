package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: sj4  reason: default package */
/* loaded from: classes.dex */
public final class sj4 {
    public static final defpackage.rj4 Companion = null;
    public final long a;
    public final java.lang.String b;

    static {
            rj4 r0 = new rj4
            r0.<init>()
            defpackage.sj4.Companion = r0
            return
    }

    public sj4(long r1, java.lang.String r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r3
            return
    }

    public /* synthetic */ sj4(java.lang.String r2, int r3, long r4) {
            r1 = this;
            r1.<init>()
            r0 = r3 & 1
            if (r0 != 0) goto L9
            r4 = 0
        L9:
            r1.a = r4
            r3 = r3 & 2
            if (r3 != 0) goto L14
            java.lang.String r2 = ""
            r1.b = r2
            return
        L14:
            r1.b = r2
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.sj4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sj4 r8 = (defpackage.sj4) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r7 = r7.b
            java.lang.String r8 = r8.b
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r2 = r2.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OfflinePrefetchCacheAchievement(id="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", memoryAddress="
            r0.append(r1)
            java.lang.String r3 = r3.b
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
