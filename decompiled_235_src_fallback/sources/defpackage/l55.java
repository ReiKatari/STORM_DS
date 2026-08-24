package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l55  reason: default package */
/* loaded from: classes.dex */
public abstract class l55 {
    public final defpackage.yr3 a;

    public l55(defpackage.on2 r2) {
            r1 = this;
            r1.<init>()
            yr3 r0 = new yr3
            r0.<init>(r2)
            r1.a = r0
            return
    }

    public abstract defpackage.pq a(java.lang.Object r1);

    public defpackage.nk7 b() {
            r0 = this;
            yr3 r0 = r0.a
            return r0
    }

    public final defpackage.nk7 c(defpackage.pq r3, defpackage.nk7 r4) {
            r2 = this;
            boolean r2 = r4 instanceof defpackage.er1
            r0 = 0
            if (r2 == 0) goto L16
            boolean r2 = r3.d
            if (r2 == 0) goto L3d
            r0 = r4
            er1 r0 = (defpackage.er1) r0
            vs4 r2 = r0.a
            java.lang.Object r4 = r3.c()
            r2.setValue(r4)
            goto L3d
        L16:
            boolean r2 = r4 instanceof defpackage.oq6
            if (r2 == 0) goto L36
            boolean r2 = r3.c
            if (r2 != 0) goto L22
            java.lang.Object r2 = r3.b
            if (r2 == 0) goto L3d
        L22:
            boolean r2 = r3.d
            if (r2 != 0) goto L3d
            java.lang.Object r2 = r3.c()
            oq6 r4 = (defpackage.oq6) r4
            java.lang.Object r1 = r4.a
            boolean r2 = defpackage.nb3.k(r2, r1)
            if (r2 == 0) goto L3d
            r0 = r4
            goto L3d
        L36:
            boolean r2 = r4 instanceof defpackage.qy0
            if (r2 == 0) goto L3d
            r3.getClass()
        L3d:
            if (r0 != 0) goto L62
            boolean r2 = r3.d
            if (r2 == 0) goto L58
            er1 r2 = new er1
            java.lang.Object r4 = r3.b
            java.lang.Object r3 = r3.a
            im6 r3 = (defpackage.im6) r3
            if (r3 != 0) goto L4f
            xd5 r3 = defpackage.xd5.s0
        L4f:
            vs4 r0 = new vs4
            r0.<init>(r4, r3)
            r2.<init>(r0)
            return r2
        L58:
            oq6 r2 = new oq6
            java.lang.Object r3 = r3.c()
            r2.<init>(r3)
            return r2
        L62:
            return r0
    }
}
