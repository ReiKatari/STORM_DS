package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx0  reason: default package */
/* loaded from: classes.dex */
public final class mx0 {
    public final android.view.View a;
    public final defpackage.zx0 b;
    public final defpackage.hu3 c;
    public final defpackage.g56 d;
    public final defpackage.bp7 e;
    public final defpackage.h33 f;
    public final defpackage.ml5 g;
    public final android.content.res.Configuration h;
    public final defpackage.qa4 i;
    public final defpackage.id j;
    public final defpackage.vm k;
    public final defpackage.de l;
    public final defpackage.ce m;
    public final defpackage.ji2 n;
    public final defpackage.qa4 o;
    public final defpackage.tv2 p;
    public final defpackage.xm q;
    public final defpackage.um3 r;
    public final defpackage.zr3 s;
    public final defpackage.ak0 t;
    public int u;
    public final defpackage.pj v;
    public final defpackage.lx0 w;

    public mx0(defpackage.mx0 r4, android.view.View r5, defpackage.zx0 r6, defpackage.hu3 r7, defpackage.g56 r8, defpackage.bp7 r9) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto Lc
            android.view.View r1 = r4.a
            if (r1 == 0) goto Lc
            android.content.Context r1 = r1.getContext()
            goto Ld
        Lc:
            r1 = r0
        Ld:
            android.content.Context r2 = r5.getContext()
            boolean r1 = defpackage.nb3.k(r1, r2)
            r3.<init>()
            r3.a = r5
            r3.b = r6
            r3.c = r7
            r3.d = r8
            r3.e = r9
            if (r1 == 0) goto L2a
            r4.getClass()
            h33 r6 = r4.f
            goto L2f
        L2a:
            h33 r6 = new h33
            r6.<init>()
        L2f:
            r3.f = r6
            if (r4 == 0) goto L37
            ml5 r6 = r4.g
            if (r6 != 0) goto L3c
        L37:
            ml5 r6 = new ml5
            r6.<init>()
        L3c:
            r3.g = r6
            if (r1 == 0) goto L46
            r4.getClass()
            android.content.res.Configuration r6 = r4.h
            goto L57
        L46:
            android.content.res.Configuration r6 = new android.content.res.Configuration
            android.content.Context r7 = r5.getContext()
            android.content.res.Resources r7 = r7.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            r6.<init>(r7)
        L57:
            r3.h = r6
            if (r1 == 0) goto L61
            r4.getClass()
            qa4 r6 = r4.i
            goto L6a
        L61:
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>(r6)
            vs4 r6 = defpackage.np2.Y(r7)
        L6a:
            r3.i = r6
            if (r1 == 0) goto L74
            r4.getClass()
            id r6 = r4.j
            goto L7d
        L74:
            id r6 = new id
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
        L7d:
            r3.j = r6
            if (r1 == 0) goto L87
            r4.getClass()
            vm r6 = r4.k
            goto L90
        L87:
            vm r6 = new vm
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
        L90:
            r3.k = r6
            if (r1 == 0) goto L9a
            r4.getClass()
            de r6 = r4.l
            goto La3
        L9a:
            de r6 = new de
            android.content.Context r7 = r5.getContext()
            r6.<init>(r7)
        La3:
            r3.l = r6
            if (r1 == 0) goto Lad
            r4.getClass()
            ce r6 = r4.m
            goto Lb3
        Lad:
            ce r7 = new ce
            r7.<init>(r6)
            r6 = r7
        Lb3:
            r3.m = r6
            if (r1 == 0) goto Lbd
            r4.getClass()
            ji2 r6 = r4.n
            goto Lc7
        Lbd:
            d90 r6 = new d90
            r5.getContext()
            r7 = 22
            r6.<init>(r7)
        Lc7:
            r3.n = r6
            if (r1 == 0) goto Ld1
            r4.getClass()
            qa4 r6 = r4.o
            goto Le1
        Ld1:
            android.content.Context r6 = r5.getContext()
            mi2 r6 = defpackage.oi2.q(r6)
            vs0 r7 = defpackage.vs0.s0
            vs4 r8 = new vs4
            r8.<init>(r6, r7)
            r6 = r8
        Le1:
            r3.o = r6
            if (r4 == 0) goto Le7
            android.view.View r0 = r4.a
        Le7:
            if (r5 != r0) goto Lec
            tv2 r6 = r4.p
            goto Lf1
        Lec:
            lx4 r6 = new lx4
            r6.<init>(r5)
        Lf1:
            r3.p = r6
            if (r1 == 0) goto Lfb
            r4.getClass()
            xm r5 = r4.q
            goto L109
        Lfb:
            xm r6 = new xm
            android.content.Context r5 = r5.getContext()
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            r6.<init>(r5)
            r5 = r6
        L109:
            r3.q = r5
            if (r4 == 0) goto L111
            um3 r5 = r4.r
            if (r5 != 0) goto L116
        L111:
            um3 r5 = new um3
            r5.<init>()
        L116:
            r3.r = r5
            zr3 r5 = new zr3
            r5.<init>()
            r3.s = r5
            if (r4 == 0) goto L125
            ak0 r4 = r4.t
            if (r4 != 0) goto L12a
        L125:
            ak0 r4 = new ak0
            r4.<init>()
        L12a:
            r3.t = r4
            pj r4 = new pj
            r5 = 6
            r4.<init>(r3, r5)
            r3.v = r4
            lx0 r4 = new lx0
            r4.<init>(r3)
            r3.w = r4
            return
    }

    public final void a(defpackage.te r26, defpackage.eo2 r27, defpackage.px0 r28, int r29) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r29
            r4 = r28
            xq2 r4 = (defpackage.xq2) r4
            r5 = 123858079(0x761ec9f, float:1.6996655E-34)
            r4.d0(r5)
            boolean r5 = r4.h(r1)
            if (r5 == 0) goto L1a
            r5 = 4
            goto L1b
        L1a:
            r5 = 2
        L1b:
            r5 = r5 | r3
            boolean r6 = r4.h(r2)
            if (r6 == 0) goto L25
            r6 = 32
            goto L27
        L25:
            r6 = 16
        L27:
            r5 = r5 | r6
            boolean r6 = r4.h(r0)
            if (r6 == 0) goto L31
            r6 = 256(0x100, float:3.59E-43)
            goto L33
        L31:
            r6 = 128(0x80, float:1.8E-43)
        L33:
            r5 = r5 | r6
            r6 = r5 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            r9 = 1
            if (r6 == r7) goto L3d
            r6 = r9
            goto L3e
        L3d:
            r6 = 0
        L3e:
            r5 = r5 & r9
            boolean r5 = r4.S(r5, r6)
            if (r5 == 0) goto L1f4
            r5 = 2131427636(0x7f0b0134, float:1.8476894E38)
            java.lang.Object r6 = r1.getTag(r5)
            boolean r7 = r6 instanceof java.util.Set
            r10 = 0
            if (r7 == 0) goto L5c
            boolean r7 = r6 instanceof defpackage.zf3
            if (r7 == 0) goto L59
            boolean r7 = r6 instanceof defpackage.dg3
            if (r7 == 0) goto L5c
        L59:
            java.util.Set r6 = (java.util.Set) r6
            goto L5d
        L5c:
            r6 = r10
        L5d:
            if (r6 != 0) goto L84
            android.view.ViewParent r6 = r1.getParent()
            boolean r7 = r6 instanceof android.view.View
            if (r7 == 0) goto L6a
            android.view.View r6 = (android.view.View) r6
            goto L6b
        L6a:
            r6 = r10
        L6b:
            if (r6 == 0) goto L72
            java.lang.Object r5 = r6.getTag(r5)
            goto L73
        L72:
            r5 = r10
        L73:
            boolean r6 = r5 instanceof java.util.Set
            if (r6 == 0) goto L83
            boolean r6 = r5 instanceof defpackage.zf3
            if (r6 == 0) goto L7f
            boolean r6 = r5 instanceof defpackage.dg3
            if (r6 == 0) goto L83
        L7f:
            r6 = r5
            java.util.Set r6 = (java.util.Set) r6
            goto L84
        L83:
            r6 = r10
        L84:
            if (r6 == 0) goto La7
            by0 r5 = r4.y()
            r6.add(r5)
            r4.q = r9
            r4.C = r9
            mk6 r5 = r4.c
            r5.b()
            mk6 r5 = r4.H
            r5.b()
            pk6 r5 = r4.I
            mk6 r7 = r5.a
            java.util.HashMap r11 = r7.f0
            r5.e = r11
            p94 r7 = r7.g0
            r5.f = r7
        La7:
            java.lang.Object r5 = r4.P()
            g56 r7 = r0.d
            vs0 r11 = defpackage.ox0.a
            if (r5 != r11) goto L131
            android.view.ViewParent r5 = r1.getParent()
            r5.getClass()
            android.view.View r5 = (android.view.View) r5
            r12 = 2131427507(0x7f0b00b3, float:1.8476632E38)
            java.lang.Object r12 = r5.getTag(r12)
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto Lc8
            java.lang.String r12 = (java.lang.String) r12
            goto Lc9
        Lc8:
            r12 = r10
        Lc9:
            if (r12 != 0) goto Ld3
            int r5 = r5.getId()
            java.lang.String r12 = java.lang.String.valueOf(r5)
        Ld3:
            java.lang.String r5 = "SaveableStateRegistry:"
            java.lang.String r5 = defpackage.i61.m(r5, r12)
            d56 r12 = r7.getSavedStateRegistry()
            android.os.Bundle r13 = r12.a(r5)
            if (r13 == 0) goto L109
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.Set r14 = r13.keySet()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        Lf2:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto L109
            java.lang.Object r15 = r14.next()
            java.lang.String r15 = (java.lang.String) r15
            java.util.ArrayList r8 = r13.getParcelableArrayList(r15)
            r8.getClass()
            r10.put(r15, r8)
            goto Lf2
        L109:
            ne r8 = defpackage.ne.u0
            nq6 r13 = defpackage.s46.a
            r46 r13 = new r46
            r13.<init>(r10, r8)
            c56 r8 = r12.b(r5)
            if (r8 == 0) goto L11a
        L118:
            r8 = 0
            goto L123
        L11a:
            gv0 r8 = new gv0     // Catch: java.lang.IllegalArgumentException -> L118
            r8.<init>(r13, r9)     // Catch: java.lang.IllegalArgumentException -> L118
            r12.c(r5, r8)     // Catch: java.lang.IllegalArgumentException -> L118
            r8 = r9
        L123:
            jl1 r9 = new jl1
            kl1 r10 = new kl1
            r10.<init>(r8, r12, r5)
            r9.<init>(r13, r10)
            r4.l0(r9)
            r5 = r9
        L131:
            jl1 r5 = (defpackage.jl1) r5
            boolean r8 = r4.h(r5)
            java.lang.Object r9 = r4.P()
            if (r8 != 0) goto L13f
            if (r9 != r11) goto L149
        L13f:
            mc r9 = new mc
            r8 = 10
            r9.<init>(r5, r8)
            r4.l0(r9)
        L149:
            qn2 r9 = (defpackage.qn2) r9
            jg7 r8 = defpackage.jg7.a
            defpackage.mb3.d(r8, r9, r4)
            py0 r8 = defpackage.ky0.w
            java.lang.Object r9 = r4.j(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            boolean r10 = r1.getScrollCaptureInProgress$ui()
            r9 = r9 | r10
            android.view.View r10 = r1.getView()
            boolean r10 = r4.f(r10)
            java.lang.Object r12 = r4.P()
            if (r10 != 0) goto L171
            if (r12 != r11) goto L17c
        L171:
            zp7 r12 = new zp7
            r1.getView()
            r12.<init>()
            r4.l0(r12)
        L17c:
            zp7 r12 = (defpackage.zp7) r12
            l55 r10 = defpackage.zx3.a
            hu3 r11 = r0.c
            pq r13 = r10.a(r11)
            l55 r10 = defpackage.dy3.a
            pq r14 = r10.a(r7)
            nq6 r7 = defpackage.kf.d
            h33 r10 = r0.f
            pq r15 = r7.a(r10)
            nq6 r7 = defpackage.kf.e
            ml5 r10 = r0.g
            pq r16 = r7.a(r10)
            nq6 r7 = defpackage.kf.b
            android.content.Context r10 = r1.getContext()
            pq r17 = r7.a(r10)
            nq6 r7 = defpackage.r83.a
            pq r18 = r7.a(r6)
            py0 r6 = defpackage.kf.a
            android.content.res.Configuration r7 = r1.getConfiguration()
            pq r19 = r6.a(r7)
            nq6 r6 = defpackage.s46.a
            pq r20 = r6.a(r5)
            nq6 r5 = defpackage.kf.f
            android.view.View r6 = r1.getView()
            pq r21 = r5.a(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r9)
            pq r22 = r8.a(r5)
            nq6 r5 = defpackage.ky0.t
            fo7 r6 = r1.getViewConfiguration()
            pq r23 = r5.a(r6)
            py0 r5 = defpackage.my2.a
            pq r24 = r5.a(r12)
            pq[] r5 = new defpackage.pq[]{r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            kx0 r6 = new kx0
            r6.<init>(r1, r0, r2)
            r7 = 1317454175(0x4e86c15f, float:1.1304099E9)
            zv0 r6 = defpackage.n16.I(r7, r6, r4)
            r7 = 56
            defpackage.hv.e(r5, r6, r4, r7)
            goto L1f7
        L1f4:
            r4.V()
        L1f7:
            cf5 r4 = r4.t()
            if (r4 == 0) goto L204
            kx0 r5 = new kx0
            r5.<init>(r0, r1, r2, r3)
            r4.d = r5
        L204:
            return
    }

    public final void b() {
            r3 = this;
            int r0 = r3.u
            int r0 = r0 + (-1)
            r3.u = r0
            if (r0 >= 0) goto L12
            java.lang.String r0 = "ComposeViewContext"
            java.lang.String r1 = "View count has dropped below 0"
            android.util.Log.e(r0, r1)
            r0 = 0
            r3.u = r0
        L12:
            int r0 = r3.u
            if (r0 != 0) goto L31
            android.view.View r0 = r3.a
            android.content.Context r1 = r0.getContext()
            lx0 r2 = r3.w
            r1.unregisterComponentCallbacks(r2)
            zr3 r3 = r3.s
            vs4 r1 = r3.b
            if (r1 != 0) goto L2a
            r1 = 0
            r3.a = r1
        L2a:
            android.view.ViewTreeObserver r3 = r0.getViewTreeObserver()
            r3.removeOnWindowFocusChangeListener(r2)
        L31:
            return
    }

    public final void c() {
            r5 = this;
            int r0 = r5.u
            r1 = 1
            int r0 = r0 + r1
            r5.u = r0
            if (r0 != r1) goto L45
            android.view.View r0 = r5.a
            android.content.Context r1 = r0.getContext()
            lx0 r2 = r5.w
            r1.registerComponentCallbacks(r2)
            android.content.res.Resources r1 = r0.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            r5.d(r1)
            boolean r1 = r0.hasWindowFocus()
            zr3 r3 = r5.s
            vs4 r4 = r3.c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r4.setValue(r1)
            vs4 r1 = r3.b
            pj r5 = r5.v
            if (r1 != 0) goto L35
            r3.a = r5
        L35:
            if (r1 == 0) goto L3e
            java.lang.Object r5 = r5.c()
            r1.setValue(r5)
        L3e:
            android.view.ViewTreeObserver r5 = r0.getViewTreeObserver()
            r5.addOnWindowFocusChangeListener(r2)
        L45:
            return
    }

    public final void d(android.content.res.Configuration r4) {
            r3 = this;
            android.content.res.Configuration r0 = r3.h
            int r0 = r0.updateFrom(r4)
            if (r0 == 0) goto L7a
            h33 r1 = r3.f
            java.util.HashMap r1 = r1.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3a
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r2 = r2.get()
            f33 r2 = (defpackage.f33) r2
            if (r2 == 0) goto L36
            int r2 = r2.b
            boolean r2 = android.content.res.Configuration.needNewResources(r0, r2)
            if (r2 == 0) goto L14
        L36:
            r1.remove()
            goto L14
        L3a:
            qa4 r1 = r3.i
            android.content.res.Configuration r2 = new android.content.res.Configuration
            r2.<init>(r4)
            r1.setValue(r2)
            ml5 r4 = r3.g
            monitor-enter(r4)
            p94 r1 = r4.a     // Catch: java.lang.Throwable -> L77
            r1.c()     // Catch: java.lang.Throwable -> L77
            monitor-exit(r4)
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r4 = r4 & r0
            if (r4 == 0) goto L61
            qa4 r4 = r3.o
            android.view.View r1 = r3.a
            android.content.Context r1 = r1.getContext()
            mi2 r1 = defpackage.oi2.q(r1)
            r4.setValue(r1)
        L61:
            r4 = -1342235264(0xffffffffafff1d80, float:-4.640519E-10)
            r4 = r4 & r0
            if (r4 == 0) goto L7a
            zr3 r4 = r3.s
            pj r3 = r3.v
            vs4 r4 = r4.b
            if (r4 == 0) goto L7a
            java.lang.Object r3 = r3.c()
            r4.setValue(r3)
            return
        L77:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        L7a:
            return
    }
}
