package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy0  reason: default package */
/* loaded from: classes.dex */
public interface yy0 {
    static void r(defpackage.da4 r3, defpackage.yy0 r4, defpackage.yy0 r5, defpackage.xx r6) {
            xx r0 = defpackage.n23.w
            boolean r0 = java.util.Objects.equals(r6, r0)
            if (r0 == 0) goto L37
            r0 = 0
            java.lang.Object r1 = r5.b(r6, r0)
            el5 r1 = (defpackage.el5) r1
            java.lang.Object r4 = r4.b(r6, r0)
            el5 r4 = (defpackage.el5) r4
            xy0 r5 = r5.j(r6)
            if (r1 != 0) goto L1d
            r1 = r4
            goto L33
        L1d:
            if (r4 != 0) goto L20
            goto L33
        L20:
            cs1 r0 = r4.a
            fl5 r4 = r4.b
            cs1 r2 = r1.a
            if (r2 == 0) goto L29
            r0 = r2
        L29:
            fl5 r1 = r1.b
            if (r1 == 0) goto L2e
            r4 = r1
        L2e:
            el5 r1 = new el5
            r1.<init>(r0, r4)
        L33:
            r3.l(r6, r5, r1)
            return
        L37:
            xy0 r4 = r5.j(r6)
            java.lang.Object r5 = r5.e(r6)
            r3.l(r6, r4, r5)
            return
    }

    static defpackage.go4 t(defpackage.yy0 r3, defpackage.yy0 r4) {
            if (r3 != 0) goto L7
            if (r4 != 0) goto L7
            go4 r3 = defpackage.go4.L
            return r3
        L7:
            if (r4 == 0) goto Le
            da4 r0 = defpackage.da4.k(r4)
            goto L12
        Le:
            da4 r0 = defpackage.da4.d()
        L12:
            if (r3 == 0) goto L2c
            java.util.Set r1 = r3.c()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            xx r2 = (defpackage.xx) r2
            r(r0, r4, r3, r2)
            goto L1c
        L2c:
            go4 r3 = defpackage.go4.a(r0)
            return r3
    }

    java.lang.Object b(defpackage.xx r1, java.lang.Object r2);

    java.util.Set c();

    java.lang.Object e(defpackage.xx r1);

    java.util.Set f(defpackage.xx r1);

    java.lang.Object g(defpackage.xx r1, defpackage.xy0 r2);

    void h(defpackage.pk0 r1);

    boolean i(defpackage.xx r1);

    defpackage.xy0 j(defpackage.xx r1);
}
