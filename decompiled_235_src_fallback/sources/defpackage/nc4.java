package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc4  reason: default package */
/* loaded from: classes.dex */
public final class nc4 extends defpackage.jc4 {
    public final defpackage.rd4 g;
    public final java.lang.Object h;
    public final java.util.ArrayList i;

    public nc4(defpackage.rd4 r3, java.lang.Object r4, java.util.Map r5) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            java.lang.Class<qc4> r0 = defpackage.qc4.class
            java.lang.String r0 = defpackage.xk2.o(r0)
            qd4 r0 = r3.b(r0)
            r1 = 0
            r2.<init>(r0, r1, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r2.i = r5
            r2.g = r3
            r2.h = r4
            return
    }

    public final defpackage.mc4 c() {
            r16 = this;
            r0 = r16
            ic4 r1 = super.a()
            mc4 r1 = (defpackage.mc4) r1
            java.util.ArrayList r2 = r0.i
            r2.getClass()
            dk0 r3 = r1.Y
            r3.getClass()
            int r4 = r2.size()
            r6 = 0
        L17:
            r7 = 0
            if (r6 >= r4) goto L80
            java.lang.Object r8 = r2.get(r6)
            int r6 = r6 + 1
            ic4 r8 = (defpackage.ic4) r8
            if (r8 != 0) goto L25
            goto L17
        L25:
            java.lang.Object r9 = r3.X
            un6 r9 = (defpackage.un6) r9
            java.lang.Object r10 = r3.R
            mc4 r10 = (defpackage.mc4) r10
            z9 r11 = r10.B
            z9 r12 = r8.B
            int r13 = r12.a
            java.lang.Object r14 = r12.e
            java.lang.String r14 = (java.lang.String) r14
            if (r13 != 0) goto L42
            if (r14 == 0) goto L3c
            goto L42
        L3c:
            java.lang.String r0 = "Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML."
            defpackage.i.h(r0)
            return r7
        L42:
            java.lang.Object r15 = r11.e
            java.lang.String r15 = (java.lang.String) r15
            java.lang.String r5 = "Destination "
            if (r15 == 0) goto L57
            boolean r14 = defpackage.nb3.k(r14, r15)
            if (r14 != 0) goto L51
            goto L57
        L51:
            java.lang.String r0 = " cannot have the same route as graph "
            defpackage.u34.y(r5, r8, r0, r10)
            return r7
        L57:
            int r11 = r11.a
            if (r13 == r11) goto L7a
            java.lang.Object r5 = r9.c(r13)
            ic4 r5 = (defpackage.ic4) r5
            if (r5 != r8) goto L64
            goto L17
        L64:
            mc4 r11 = r8.L
            if (r11 != 0) goto L74
            if (r5 == 0) goto L6c
            r5.L = r7
        L6c:
            r8.L = r10
            int r5 = r12.a
            r9.e(r5, r8)
            goto L17
        L74:
            java.lang.String r0 = "Destination already has a parent set. Call NavGraph.remove() to remove the previous parent."
            defpackage.i.m(r0)
            return r7
        L7a:
            java.lang.String r0 = " cannot have the same id as graph "
            defpackage.u34.y(r5, r8, r0, r10)
            return r7
        L80:
            java.lang.Object r2 = r0.h
            if (r2 != 0) goto L94
            java.lang.String r0 = r0.c
            if (r0 == 0) goto L8e
            java.lang.String r0 = "You must set a start destination route"
            defpackage.i.m(r0)
            return r7
        L8e:
            java.lang.String r0 = "You must set a start destination id"
            defpackage.i.m(r0)
            return r7
        L94:
            java.lang.Class r0 = r2.getClass()
            ar0 r0 = defpackage.gh5.a(r0)
            gg3 r0 = defpackage.jx2.K(r0)
            int r4 = defpackage.np2.O(r0)
            ic4 r5 = r3.l(r4)
            if (r5 == 0) goto L120
            java.util.Map r0 = r5.c()
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r6 = r0.size()
            int r6 = defpackage.c14.k0(r6)
            r5.<init>(r6)
            java.util.Set r0 = r0.entrySet()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        Lc5:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto Le1
            java.lang.Object r6 = r0.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            rb4 r6 = (defpackage.rb4) r6
            fd4 r6 = r6.a
            r5.put(r7, r6)
            goto Lc5
        Le1:
            java.lang.String r0 = defpackage.np2.P(r2, r5)
            java.lang.Object r2 = r3.R
            mc4 r2 = (defpackage.mc4) r2
            if (r0 != 0) goto Led
            r5 = 0
            goto L10b
        Led:
            z9 r5 = r2.B
            java.lang.Object r5 = r5.e
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L116
            boolean r2 = defpackage.qs6.v0(r0)
            if (r2 != 0) goto L110
            int r2 = defpackage.ic4.X
            java.lang.String r2 = "android-app://androidx.navigation/"
            java.lang.String r2 = r2.concat(r0)
            int r5 = r2.hashCode()
        L10b:
            r3.L = r5
            r3.Y = r0
            goto L11d
        L110:
            java.lang.String r0 = "Cannot have an empty start destination route"
            defpackage.i.h(r0)
            goto L11d
        L116:
            java.lang.String r5 = "Start destination "
            java.lang.String r6 = " cannot use the same route as the graph "
            defpackage.u34.y(r5, r0, r6, r2)
        L11d:
            r3.L = r4
            return r1
        L120:
            wb6 r0 = r0.e()
            java.lang.String r0 = r0.a()
            java.lang.String r1 = " from NavGraph. Ensure the starting NavDestination was added with route from KClass."
            java.lang.String r2 = "Cannot find startDestination "
            defpackage.e41.g(r0, r1, r2)
            return r7
    }
}
