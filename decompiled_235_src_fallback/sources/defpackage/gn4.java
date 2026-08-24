package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn4  reason: default package */
/* loaded from: classes.dex */
public final class gn4 extends defpackage.ao4 {
    public static final defpackage.gn4 e = null;
    public static final defpackage.gn4 f = null;
    public static final defpackage.gn4 g = null;
    public static final defpackage.gn4 h = null;
    public final /* synthetic */ int d;

    static {
            gn4 r0 = new gn4
            r1 = 2
            r2 = 0
            r3 = 1
            r0.<init>(r3, r1, r2)
            defpackage.gn4.e = r0
            gn4 r0 = new gn4
            r1 = 1
            r2 = 1
            r0.<init>(r1, r1, r2)
            defpackage.gn4.f = r0
            gn4 r0 = new gn4
            r1 = 2
            r2 = 2
            r0.<init>(r3, r1, r2)
            defpackage.gn4.g = r0
            gn4 r0 = new gn4
            r1 = 1
            r2 = 3
            r0.<init>(r1, r1, r2)
            defpackage.gn4.h = r0
            return
    }

    public /* synthetic */ gn4(int r1, int r2, int r3) {
            r0 = this;
            r0.d = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.ao4
    public final void c(defpackage.ls0 r2, defpackage.nt r3, defpackage.pk6 r4, defpackage.jb1 r5, defpackage.bo4 r6) {
            r1 = this;
            int r1 = r1.d
            r6 = 1
            r0 = 0
            switch(r1) {
                case 0: goto L99;
                case 1: goto L7d;
                case 2: goto L3e;
                default: goto L7;
            }
        L7:
            java.lang.Object r1 = r2.g(r0)
            int r2 = r2.f(r0)
            boolean r3 = r1 instanceof defpackage.br2
            if (r3 == 0) goto L24
            r3 = r1
            br2 r3 = (defpackage.br2) r3
            java.lang.Object r6 = r5.e
            ua4 r6 = (defpackage.ua4) r6
            r6.b(r3)
            java.lang.Object r6 = r5.d
            ka4 r6 = (defpackage.ka4) r6
            r6.a(r3)
        L24:
            int r3 = r4.t
            java.lang.Object r1 = r4.K(r1, r3, r2)
            boolean r2 = r1 instanceof defpackage.br2
            if (r2 == 0) goto L34
            br2 r1 = (defpackage.br2) r1
            r5.e(r1)
            goto L3d
        L34:
            boolean r2 = r1 instanceof defpackage.cf5
            if (r2 == 0) goto L3d
            cf5 r1 = (defpackage.cf5) r1
            r1.c()
        L3d:
            return
        L3e:
            java.lang.Object r1 = r2.g(r0)
            java.lang.Object r3 = r2.g(r6)
            sq2 r3 = (defpackage.sq2) r3
            int r2 = r2.f(r0)
            boolean r6 = r1 instanceof defpackage.br2
            if (r6 == 0) goto L61
            r6 = r1
            br2 r6 = (defpackage.br2) r6
            java.lang.Object r0 = r5.e
            ua4 r0 = (defpackage.ua4) r0
            r0.b(r6)
            java.lang.Object r0 = r5.d
            ka4 r0 = (defpackage.ka4) r0
            r0.a(r6)
        L61:
            int r3 = r4.c(r3)
            java.lang.Object r1 = r4.K(r1, r3, r2)
            boolean r2 = r1 instanceof defpackage.br2
            if (r2 == 0) goto L73
            br2 r1 = (defpackage.br2) r1
            r5.e(r1)
            goto L7c
        L73:
            boolean r2 = r1 instanceof defpackage.cf5
            if (r2 == 0) goto L7c
            cf5 r1 = (defpackage.cf5) r1
            r1.c()
        L7c:
            return
        L7d:
            java.lang.Object r1 = r2.g(r0)
            sq2 r1 = (defpackage.sq2) r1
            int r2 = r2.f(r0)
            r3.j()
            r1.getClass()
            int r1 = r4.c(r1)
            java.lang.Object r1 = r4.D(r1)
            r3.c(r2, r1)
            return
        L99:
            java.lang.Object r1 = r2.g(r0)
            on2 r1 = (defpackage.on2) r1
            java.lang.Object r1 = r1.c()
            java.lang.Object r5 = r2.g(r6)
            sq2 r5 = (defpackage.sq2) r5
            int r2 = r2.f(r0)
            r5.getClass()
            int r5 = r4.c(r5)
            r4.U(r5, r1)
            r3.k(r2, r1)
            r3.d(r1)
            return
    }

    @Override // defpackage.ao4
    public defpackage.sq2 d(defpackage.ls0 r2) {
            r1 = this;
            int r0 = r1.d
            switch(r0) {
                case 0: goto L12;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            sq2 r1 = super.d(r2)
            return r1
        La:
            r1 = 0
            java.lang.Object r1 = r2.g(r1)
            sq2 r1 = (defpackage.sq2) r1
            return r1
        L12:
            r1 = 1
            java.lang.Object r1 = r2.g(r1)
            sq2 r1 = (defpackage.sq2) r1
            return r1
    }
}
