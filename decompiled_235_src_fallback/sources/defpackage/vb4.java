package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vb4  reason: default package */
/* loaded from: classes.dex */
public final class vb4 {
    public final defpackage.q61 a;
    public final defpackage.tp6 b;
    public final defpackage.tp6 c;
    public boolean d;
    public final defpackage.de5 e;
    public final defpackage.de5 f;
    public final defpackage.qd4 g;
    public final /* synthetic */ defpackage.rc4 h;

    public vb4(defpackage.rc4 r3, defpackage.qd4 r4) {
            r2 = this;
            r2.<init>()
            r4.getClass()
            r2.h = r3
            q61 r3 = new q61
            r3.<init>()
            r2.a = r3
            yt1 r3 = defpackage.yt1.A
            tp6 r3 = defpackage.up6.a(r3)
            r2.b = r3
            du1 r0 = defpackage.du1.A
            tp6 r0 = defpackage.up6.a(r0)
            r2.c = r0
            de5 r1 = new de5
            r1.<init>(r3)
            r2.e = r1
            de5 r3 = new de5
            r3.<init>(r0)
            r2.f = r3
            r2.g = r4
            return
    }

    public final void a(defpackage.sb4 r3) {
            r2 = this;
            r3.getClass()
            q61 r0 = r2.a
            monitor-enter(r0)
            tp6 r2 = r2.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = r2.getValue()     // Catch: java.lang.Throwable -> L18
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L18
            java.util.ArrayList r3 = defpackage.gt0.U0(r3, r1)     // Catch: java.lang.Throwable -> L18
            r1 = 0
            r2.m(r1, r3)     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            return
        L18:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final defpackage.sb4 b(defpackage.ic4 r3, android.os.Bundle r4) {
            r2 = this;
            rc4 r2 = r2.h
            zb4 r2 = r2.b
            r2.getClass()
            rc4 r0 = r2.a
            rh r0 = r0.c
            tt3 r1 = r2.h()
            ac4 r2 = r2.o
            sb4 r2 = defpackage.x31.r(r0, r3, r4, r1, r2)
            return r2
    }

    public final void c(defpackage.sb4 r9) {
            r8 = this;
            r9.getClass()
            rc4 r0 = r8.h
            zb4 r0 = r0.b
            tp6 r1 = r0.h
            java.lang.String r2 = r9.Y
            java.util.LinkedHashMap r3 = r0.w
            java.lang.Object r4 = r3.get(r9)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r4 = defpackage.nb3.k(r4, r5)
            tp6 r5 = r8.c
            java.lang.Object r6 = r5.getValue()
            java.util.Set r6 = (java.util.Set) r6
            java.util.LinkedHashSet r6 = defpackage.ii2.E(r6, r9)
            r7 = 0
            r5.m(r7, r6)
            r3.remove(r9)
            pu r3 = r0.f
            boolean r5 = r3.contains(r9)
            if (r5 != 0) goto L8e
            r0.q(r9)
            uk1 r8 = r9.d0
            java.lang.Object r8 = r8.k
            ku3 r8 = (defpackage.ku3) r8
            tt3 r8 = r8.d
            tt3 r5 = defpackage.tt3.CREATED
            boolean r8 = r8.isAtLeast(r5)
            if (r8 == 0) goto L4a
            tt3 r8 = defpackage.tt3.DESTROYED
            r9.a(r8)
        L4a:
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L51
            goto L6a
        L51:
            java.util.Iterator r8 = r3.iterator()
        L55:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L6a
            java.lang.Object r9 = r8.next()
            sb4 r9 = (defpackage.sb4) r9
            java.lang.String r9 = r9.Y
            boolean r9 = defpackage.nb3.k(r9, r2)
            if (r9 == 0) goto L55
            goto L80
        L6a:
            if (r4 != 0) goto L80
            ac4 r8 = r0.o
            if (r8 == 0) goto L80
            r2.getClass()
            java.util.LinkedHashMap r8 = r8.b
            java.lang.Object r8 = r8.remove(r2)
            ap7 r8 = (defpackage.ap7) r8
            if (r8 == 0) goto L80
            r8.a()
        L80:
            r0.r()
            java.util.ArrayList r8 = r0.o()
            r1.getClass()
            r1.m(r7, r8)
            return
        L8e:
            boolean r8 = r8.d
            if (r8 != 0) goto Lac
            r0.r()
            tp6 r8 = r0.g
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            r8.getClass()
            r8.m(r7, r9)
            java.util.ArrayList r8 = r0.o()
            r1.getClass()
            r1.m(r7, r8)
        Lac:
            return
    }

    public final void d(defpackage.sb4 r6, boolean r7) {
            r5 = this;
            r6.getClass()
            rc4 r0 = r5.h
            zb4 r0 = r0.b
            ci2 r1 = new ci2
            r1.<init>(r5, r6, r7)
            r0.getClass()
            rd4 r2 = r0.s
            ic4 r3 = r6.B
            java.lang.String r3 = r3.A
            qd4 r2 = r2.b(r3)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            java.util.LinkedHashMap r4 = r0.w
            r4.put(r6, r3)
            qd4 r5 = r5.g
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L7b
            xb4 r5 = r0.v
            if (r5 == 0) goto L35
            r5.g(r6)
            r1.c()
            return
        L35:
            pu r5 = r0.f
            int r7 = r5.indexOf(r6)
            if (r7 >= 0) goto L56
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Ignoring pop of "
            r5.<init>(r7)
            r5.append(r6)
            java.lang.String r6 = " as it was not found on the current back stack"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "NavController"
            android.util.Log.i(r6, r5)
            return
        L56:
            r2 = 1
            int r7 = r7 + r2
            int r3 = r5.L
            if (r7 == r3) goto L6c
            java.lang.Object r5 = r5.get(r7)
            sb4 r5 = (defpackage.sb4) r5
            ic4 r5 = r5.B
            z9 r5 = r5.B
            int r5 = r5.a
            r7 = 0
            r0.l(r5, r2, r7)
        L6c:
            defpackage.zb4.n(r0, r6)
            r1.c()
            n10 r5 = r0.b
            r5.c()
            r0.b()
            return
        L7b:
            java.util.LinkedHashMap r5 = r0.t
            java.lang.Object r5 = r5.get(r2)
            r5.getClass()
            vb4 r5 = (defpackage.vb4) r5
            r5.d(r6, r7)
            return
    }

    public final void e(defpackage.sb4 r8, boolean r9) {
            r7 = this;
            r8.getClass()
            tp6 r0 = r7.c
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            de5 r3 = r7.e
            if (r2 == 0) goto L1b
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1b
            goto L57
        L1b:
            java.util.Iterator r1 = r1.iterator()
        L1f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()
            sb4 r2 = (defpackage.sb4) r2
            if (r2 != r8) goto L1f
            rp6 r1 = r3.A
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L43
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L43
            goto L56
        L43:
            java.util.Iterator r1 = r1.iterator()
        L47:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L56
            java.lang.Object r2 = r1.next()
            sb4 r2 = (defpackage.sb4) r2
            if (r2 != r8) goto L47
            goto L57
        L56:
            return
        L57:
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = defpackage.ii2.L(r1, r8)
            r2 = 0
            r0.m(r2, r1)
            rp6 r1 = r3.A
            rp6 r3 = r3.A
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            int r4 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r4)
        L77:
            boolean r4 = r1.hasPrevious()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r1.previous()
            r5 = r4
            sb4 r5 = (defpackage.sb4) r5
            boolean r6 = defpackage.nb3.k(r5, r8)
            if (r6 != 0) goto L77
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            int r5 = r6.lastIndexOf(r5)
            java.lang.Object r6 = r3.getValue()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.lastIndexOf(r8)
            if (r5 >= r6) goto L77
            goto La2
        La1:
            r4 = r2
        La2:
            sb4 r4 = (defpackage.sb4) r4
            if (r4 == 0) goto Lb3
            java.lang.Object r1 = r0.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.LinkedHashSet r1 = defpackage.ii2.L(r1, r4)
            r0.m(r2, r1)
        Lb3:
            r7.d(r8, r9)
            return
    }

    public final void f(defpackage.sb4 r4) {
            r3 = this;
            r4.getClass()
            rc4 r0 = r3.h
            zb4 r0 = r0.b
            r0.getClass()
            rd4 r1 = r0.s
            ic4 r2 = r4.B
            java.lang.String r2 = r2.A
            qd4 r1 = r1.b(r2)
            qd4 r2 = r3.g
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L42
            qn2 r0 = r0.u
            if (r0 == 0) goto L27
            r0.g(r4)
            r3.a(r4)
            return
        L27:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Ignoring add of destination "
            r3.<init>(r0)
            ic4 r4 = r4.B
            r3.append(r4)
            java.lang.String r4 = " outside of the call to navigate(). "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "NavController"
            android.util.Log.i(r4, r3)
            return
        L42:
            java.util.LinkedHashMap r3 = r0.t
            java.lang.Object r3 = r3.get(r1)
            if (r3 == 0) goto L50
            vb4 r3 = (defpackage.vb4) r3
            r3.f(r4)
            return
        L50:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "NavigatorBackStack for "
            r3.<init>(r0)
            ic4 r4 = r4.B
            java.lang.String r4 = r4.A
            java.lang.String r0 = " should already be created"
            java.lang.String r3 = defpackage.i61.n(r3, r4, r0)
            defpackage.u34.f(r3)
            return
    }
}
