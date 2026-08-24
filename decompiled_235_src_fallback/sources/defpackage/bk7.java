package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bk7  reason: default package */
/* loaded from: classes.dex */
public abstract class bk7 {
    public static final /* synthetic */ int a = 0;

    static {
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset.forName(r0)
            return
    }

    public static defpackage.ni3 a(defpackage.ii3 r5) {
            ki3 r0 = defpackage.ni3.p()
            int r1 = r5.r()
            r0.c()
            pr2 r2 = r0.B
            ni3 r2 = (defpackage.ni3) r2
            defpackage.ni3.m(r2, r1)
            java.util.List r5 = r5.q()
            java.util.Iterator r5 = r5.iterator()
        L1a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r5.next()
            hi3 r1 = (defpackage.hi3) r1
            li3 r2 = defpackage.mi3.r()
            vg3 r3 = r1.q()
            java.lang.String r3 = r3.r()
            r2.c()
            pr2 r4 = r2.B
            mi3 r4 = (defpackage.mi3) r4
            defpackage.mi3.m(r4, r3)
            hh3 r3 = r1.t()
            r2.c()
            pr2 r4 = r2.B
            mi3 r4 = (defpackage.mi3) r4
            defpackage.mi3.o(r4, r3)
            jp4 r3 = r1.s()
            r2.c()
            pr2 r4 = r2.B
            mi3 r4 = (defpackage.mi3) r4
            defpackage.mi3.n(r4, r3)
            int r1 = r1.r()
            r2.c()
            pr2 r3 = r2.B
            mi3 r3 = (defpackage.mi3) r3
            defpackage.mi3.p(r3, r1)
            pr2 r1 = r2.a()
            mi3 r1 = (defpackage.mi3) r1
            r0.c()
            pr2 r2 = r0.B
            ni3 r2 = (defpackage.ni3) r2
            defpackage.ni3.n(r2, r1)
            goto L1a
        L77:
            pr2 r5 = r0.a()
            ni3 r5 = (defpackage.ni3) r5
            return r5
    }
}
