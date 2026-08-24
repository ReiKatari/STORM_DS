package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e33  reason: default package */
/* loaded from: classes.dex */
public final class e33 {
    public static int k;
    public static final defpackage.x31 l = null;
    public final java.lang.String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final defpackage.dl7 f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    static {
            x31 r0 = new x31
            r1 = 10
            r0.<init>(r1)
            defpackage.e33.l = r0
            return
    }

    public e33(java.lang.String r4, float r5, float r6, float r7, float r8, defpackage.dl7 r9, long r10, int r12, boolean r13) {
            r3 = this;
            x31 r0 = defpackage.e33.l
            monitor-enter(r0)
            int r1 = defpackage.e33.k     // Catch: java.lang.Throwable -> L22
            int r2 = r1 + 1
            defpackage.e33.k = r2     // Catch: java.lang.Throwable -> L22
            monitor-exit(r0)
            r3.<init>()
            r3.a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r10
            r3.h = r12
            r3.i = r13
            r3.j = r1
            return
        L22:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L5e
        L3:
            boolean r0 = r5 instanceof defpackage.e33
            if (r0 != 0) goto L8
            goto L60
        L8:
            e33 r5 = (defpackage.e33) r5
            java.lang.String r0 = r5.a
            java.lang.String r1 = r4.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 != 0) goto L15
            goto L60
        L15:
            float r0 = r4.b
            float r1 = r5.b
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L20
            goto L60
        L20:
            float r0 = r4.c
            float r1 = r5.c
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L2b
            goto L60
        L2b:
            float r0 = r4.d
            float r1 = r5.d
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L60
            float r0 = r4.e
            float r1 = r5.e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L60
            dl7 r0 = r4.f
            dl7 r1 = r5.f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L46
            goto L60
        L46:
            long r0 = r4.g
            long r2 = r5.g
            boolean r0 = defpackage.kt0.d(r0, r2)
            if (r0 != 0) goto L51
            goto L60
        L51:
            int r0 = r4.h
            int r1 = r5.h
            if (r0 != r1) goto L60
            boolean r4 = r4.i
            boolean r5 = r5.i
            if (r4 == r5) goto L5e
            goto L60
        L5e:
            r4 = 1
            return r4
        L60:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            float r2 = r5.b
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r5.c
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r5.d
            int r0 = defpackage.xg6.a(r2, r0, r1)
            float r2 = r5.e
            int r0 = defpackage.xg6.a(r2, r0, r1)
            dl7 r2 = r5.f
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = defpackage.kt0.i
            long r3 = r5.g
            int r0 = defpackage.i61.c(r3, r2, r1)
            int r2 = r5.h
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r5 = r5.i
            int r5 = java.lang.Boolean.hashCode(r5)
            int r5 = r5 + r0
            return r5
    }
}
