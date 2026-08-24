package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg  reason: default package */
/* loaded from: classes.dex */
public final class tg {
    public final android.content.Context a;
    public final defpackage.qh1 b;
    public final long c;
    public final defpackage.lq4 d;

    public tg(android.content.Context r1, defpackage.qh1 r2, long r3, defpackage.lq4 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            if (r8 == 0) goto Lb
            java.lang.Class r1 = r8.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<tg> r2 = defpackage.tg.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r8.getClass()
            tg r8 = (defpackage.tg) r8
            android.content.Context r1 = r7.a
            android.content.Context r3 = r8.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            qh1 r1 = r7.b
            qh1 r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L31
            return r2
        L31:
            long r3 = r7.c
            long r5 = r8.c
            boolean r1 = defpackage.kt0.d(r3, r5)
            if (r1 != 0) goto L3c
            return r2
        L3c:
            lq4 r7 = r7.d
            lq4 r8 = r8.d
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L47
            return r2
        L47:
            return r0
    }

    public final int hashCode() {
            r5 = this;
            android.content.Context r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            qh1 r2 = r5.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = defpackage.kt0.i
            long r3 = r5.c
            int r0 = defpackage.i61.c(r3, r2, r1)
            lq4 r5 = r5.d
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }
}
