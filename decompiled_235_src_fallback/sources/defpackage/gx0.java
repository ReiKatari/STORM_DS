package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx0  reason: default package */
/* loaded from: classes.dex */
public abstract class gx0 {
    public final java.lang.Object a;

    public gx0(int r1) {
            r0 = this;
            switch(r1) {
                case 1: goto L25;
                case 2: goto L1a;
                case 3: goto Le;
                default: goto L3;
            }
        L3:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.a = r1
            return
        Le:
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            vs4 r1 = defpackage.np2.Y(r1)
            r0.a = r1
            return
        L1a:
            r0.<init>()
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.a = r1
            return
        L25:
            r0.<init>()
            p94 r1 = defpackage.h93.a
            p94 r1 = new p94
            r1.<init>()
            r0.a = r1
            return
    }

    public boolean a(int r8, defpackage.zq2 r9, java.lang.Object r10) {
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.b(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof defpackage.sq2
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.b(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof defpackage.zq2
            if (r6 == 0) goto L35
            r6 = r5
            zq2 r6 = (defpackage.zq2) r6
            boolean r6 = r7.a(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.b(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            defpackage.e41.h(r5, r7)
        L3a:
            return r3
    }

    public void b(int r1, defpackage.zq2 r2, java.lang.Object r3) {
            r0 = this;
            hx0 r2 = new hx0
            r3 = 0
            r2.<init>(r1, r3, r3)
            java.lang.Object r0 = r0.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r2)
            return
    }

    public abstract void c(defpackage.ob6 r1);

    public abstract void d();

    public abstract void e();

    public abstract java.lang.Object f();

    public java.util.List g(defpackage.fq3 r5, int r6, long r7) {
            r4 = this;
            java.lang.Object r4 = r4.a
            p94 r4 = (defpackage.p94) r4
            java.lang.Object r0 = r4.b(r6)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.util.List r5 = r5.b(r6)
            int r0 = r5.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            r2 = 0
        L1b:
            if (r2 >= r0) goto L2d
            java.lang.Object r3 = r5.get(r2)
            x24 r3 = (defpackage.x24) r3
            dx4 r3 = r3.y(r7)
            r1.add(r3)
            int r2 = r2 + 1
            goto L1b
        L2d:
            r4.i(r6, r1)
            return r1
    }

    public abstract java.lang.Object h();

    public void i(int r1, java.lang.Object r2, defpackage.zq2 r3, java.lang.Object r4) {
            r0 = this;
            vs0 r4 = defpackage.ox0.a
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 != 0) goto L9
            return
        L9:
            r2 = 0
            r0.b(r1, r3, r2)
            return
    }

    public abstract defpackage.qn2 j(defpackage.ob6 r1);

    public abstract void k(defpackage.ul0 r1);

    public abstract void l(java.lang.Object r1);

    public abstract void m(defpackage.ga7 r1);

    public abstract void n();
}
