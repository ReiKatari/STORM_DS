package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq3  reason: default package */
/* loaded from: classes.dex */
public final class bq3 {
    public final defpackage.o46 a;
    public final defpackage.f4 b;
    public final defpackage.ja4 c;

    public bq3(defpackage.o46 r1, defpackage.f4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            long[] r1 = defpackage.b66.a
            ja4 r1 = new ja4
            r1.<init>()
            r0.c = r1
            return
    }

    public final defpackage.eo2 a(int r7, java.lang.Object r8, java.lang.Object r9) {
            r6 = this;
            ja4 r0 = r6.c
            java.lang.Object r1 = r0.g(r8)
            aq3 r1 = (defpackage.aq3) r1
            r2 = 20
            r3 = 1
            r4 = 818252804(0x30c58c04, float:1.4373431E-9)
            if (r1 == 0) goto L2f
            int r5 = r1.c
            if (r5 != r7) goto L2f
            java.lang.Object r5 = r1.b
            boolean r5 = defpackage.nb3.k(r5, r9)
            if (r5 == 0) goto L2f
            zv0 r6 = r1.d
            if (r6 != 0) goto L2e
            bq3 r6 = r1.e
            ql1 r7 = new ql1
            r7.<init>(r2, r6, r1)
            zv0 r6 = new zv0
            r6.<init>(r4, r3, r7)
            r1.d = r6
        L2e:
            return r6
        L2f:
            aq3 r1 = new aq3
            r1.<init>(r6, r7, r8, r9)
            r0.m(r8, r1)
            zv0 r7 = r1.d
            if (r7 != 0) goto L48
            ql1 r7 = new ql1
            r7.<init>(r2, r6, r1)
            zv0 r6 = new zv0
            r6.<init>(r4, r3, r7)
            r1.d = r6
            return r6
        L48:
            return r7
    }

    public final java.lang.Object b(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L3
            goto L24
        L3:
            ja4 r0 = r1.c
            java.lang.Object r0 = r0.g(r2)
            aq3 r0 = (defpackage.aq3) r0
            if (r0 == 0) goto L10
            java.lang.Object r1 = r0.b
            return r1
        L10:
            f4 r1 = r1.b
            java.lang.Object r1 = r1.c()
            cq3 r1 = (defpackage.cq3) r1
            int r2 = r1.e(r2)
            r0 = -1
            if (r2 == r0) goto L24
            java.lang.Object r1 = r1.d(r2)
            return r1
        L24:
            r1 = 0
            return r1
    }
}
