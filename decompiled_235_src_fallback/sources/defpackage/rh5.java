package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh5  reason: default package */
/* loaded from: classes.dex */
public abstract class rh5 extends defpackage.yc7 {
    public final defpackage.th5 a;

    public rh5(defpackage.th5 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r5) {
            r4 = this;
            jf3 r0 = r5.n0()
            jf3 r1 = defpackage.jf3.NULL
            r2 = 0
            if (r0 != r1) goto Ld
            r5.j0()
            return r2
        Ld:
            java.lang.Object r0 = r4.d()
            th5 r1 = r4.a
            java.util.Map r1 = r1.a
            r5.h()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
        L18:
            boolean r3 = r5.F()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            if (r3 == 0) goto L34
            java.lang.String r3 = r5.c0()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            qh5 r3 = (defpackage.qh5) r3     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            if (r3 != 0) goto L30
            r5.u0()     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            goto L18
        L2e:
            r4 = move-exception
            goto L3c
        L30:
            r4.f(r0, r5, r3)     // Catch: java.lang.IllegalAccessException -> L2e java.lang.IllegalStateException -> L44
            goto L18
        L34:
            r5.u()
            java.lang.Object r4 = r4.e(r0)
            return r4
        L3c:
            uj2 r5 = defpackage.oh5.a
            java.lang.String r5 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.u34.p(r5, r4)
            return r2
        L44:
            r4 = move-exception
            ne3 r5 = new ne3
            r5.<init>(r4)
            throw r5
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r2, java.lang.Object r3) {
            r1 = this;
            if (r3 != 0) goto L6
            r2.A()
            return
        L6:
            r2.k()
            th5 r1 = r1.a     // Catch: java.lang.IllegalAccessException -> L25
            java.util.List r1 = r1.b     // Catch: java.lang.IllegalAccessException -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.IllegalAccessException -> L25
        L11:
            boolean r0 = r1.hasNext()     // Catch: java.lang.IllegalAccessException -> L25
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.next()     // Catch: java.lang.IllegalAccessException -> L25
            qh5 r0 = (defpackage.qh5) r0     // Catch: java.lang.IllegalAccessException -> L25
            r0.a(r2, r3)     // Catch: java.lang.IllegalAccessException -> L25
            goto L11
        L21:
            r2.u()
            return
        L25:
            r1 = move-exception
            uj2 r2 = defpackage.oh5.a
            java.lang.String r2 = "Unexpected IllegalAccessException occurred (Gson 2.14.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers."
            defpackage.u34.p(r2, r1)
            return
    }

    public abstract java.lang.Object d();

    public abstract java.lang.Object e(java.lang.Object r1);

    public abstract void f(java.lang.Object r1, defpackage.hf3 r2, defpackage.qh5 r3);
}
