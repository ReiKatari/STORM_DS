package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd4  reason: default package */
/* loaded from: classes.dex */
public abstract class qd4 {
    public defpackage.vb4 a;
    public boolean b;

    public abstract defpackage.ic4 a();

    public final defpackage.vb4 b() {
            r0 = this;
            vb4 r0 = r0.a
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "You cannot access the Navigator's state until the Navigator is attached"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    public defpackage.ic4 c(defpackage.ic4 r1) {
            r0 = this;
            return r1
    }

    public void d(java.util.List r3, defpackage.ad4 r4) {
            r2 = this;
            ev r0 = new ev
            r1 = 1
            r0.<init>(r3, r1)
            bg2 r3 = new bg2
            r1 = 14
            r3.<init>(r1, r2, r4)
            qd2 r4 = new qd2
            r1 = 2
            r4.<init>(r0, r3, r1)
            r76 r3 = new r76
            r0 = 5
            r3.<init>(r0)
            pc2 r0 = new pc2
            r1 = 0
            r0.<init>(r4, r1, r3)
            oc2 r3 = new oc2
            r3.<init>(r0)
        L24:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L38
            java.lang.Object r4 = r3.next()
            sb4 r4 = (defpackage.sb4) r4
            vb4 r0 = r2.b()
            r0.f(r4)
            goto L24
        L38:
            return
    }

    public void e(defpackage.sb4 r4, boolean r5) {
            r3 = this;
            vb4 r0 = r3.b()
            de5 r0 = r0.e
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.contains(r4)
            if (r1 == 0) goto L3a
            int r1 = r0.size()
            java.util.ListIterator r1 = r0.listIterator(r1)
            r0 = 0
        L1d:
            boolean r2 = r3.f()
            if (r2 != 0) goto L24
            goto L30
        L24:
            java.lang.Object r0 = r1.previous()
            sb4 r0 = (defpackage.sb4) r0
            boolean r2 = defpackage.nb3.k(r0, r4)
            if (r2 == 0) goto L1d
        L30:
            if (r0 == 0) goto L39
            vb4 r3 = r3.b()
            r3.d(r0, r5)
        L39:
            return
        L3a:
            java.lang.String r3 = "popBackStack was called with "
            java.lang.String r5 = " which does not exist in back stack "
            defpackage.u34.l(r3, r4, r5, r0)
            return
    }

    public boolean f() {
            r0 = this;
            r0 = 1
            return r0
    }
}
