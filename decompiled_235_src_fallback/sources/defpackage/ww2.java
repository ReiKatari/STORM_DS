package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ww2  reason: default package */
/* loaded from: classes.dex */
public final class ww2 {
    public final /* synthetic */ int a;
    public final java.util.ArrayList b;

    public ww2(int r2) {
            r1 = this;
            r0 = 3
            r1.a = r0
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
            r1.b = r0
            return
    }

    public ww2(int r1, byte r2) {
            r0 = this;
            r0.a = r1
            switch(r1) {
                case 1: goto L1f;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 20
            r1.<init>(r2)
            r0.b = r1
            return
        L12:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 9
            r1.<init>(r2)
            r0.b = r1
            return
        L1f:
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 32
            r1.<init>(r2)
            r0.b = r1
            return
    }

    public ww2(defpackage.w87 r11) {
            r10 = this;
            r0 = 4
            r10.a = r0
            r11.getClass()
            java.lang.String r1 = defpackage.zv7.a
            v30 r1 = new v30
            a21 r2 = r11.b
            if4 r3 = r11.d
            r4 = 0
            r1.<init>(r2, r4)
            v30 r2 = new v30
            w30 r5 = r11.c
            r2.<init>(r5)
            v30 r5 = new v30
            a21 r6 = r11.e
            r5.<init>(r6, r0)
            r6 = 3
            k11[] r7 = new defpackage.k11[r6]
            r7[r4] = r1
            r1 = 1
            r7[r1] = r2
            r2 = 2
            r7[r2] = r5
            java.util.ArrayList r5 = defpackage.hf.d0(r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 28
            if (r7 < r8) goto L4e
            android.content.Context r11 = r11.a
            r11.getClass()
            java.lang.String r0 = "connectivity"
            java.lang.Object r11 = r11.getSystemService(r0)
            r11.getClass()
            android.net.ConnectivityManager r11 = (android.net.ConnectivityManager) r11
            cf4 r0 = new cf4
            r0.<init>(r11)
            r5.add(r0)
            goto L76
        L4e:
            v30 r11 = new v30
            r3.getClass()
            r11.<init>(r3, r2)
            v30 r7 = new v30
            r7.<init>(r3, r6)
            xe4 r8 = new xe4
            r8.<init>(r3)
            we4 r9 = new we4
            r9.<init>(r3)
            c20[] r0 = new defpackage.c20[r0]
            r0[r4] = r11
            r0[r1] = r7
            r0[r2] = r8
            r0[r6] = r9
            java.util.List r11 = defpackage.hf.c0(r0)
            r5.addAll(r11)
        L76:
            r10.<init>()
            r10.b = r5
            return
    }

    public void a(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.a
            java.util.ArrayList r1 = r1.b
            switch(r0) {
                case 2: goto Lb;
                default: goto L7;
            }
        L7:
            r1.add(r2)
            return
        Lb:
            if (r2 == 0) goto L11
            r1.add(r2)
            goto L16
        L11:
            java.lang.String r1 = "Set contributions cannot be null"
            defpackage.u34.x(r1)
        L16:
            return
    }

    public void b(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            defpackage.ft7.c(r1)
            defpackage.ft7.d(r2, r1)
            defpackage.ft7.a(r0, r1, r2)
            return
    }

    public void c(java.lang.String r6) {
            r5 = this;
            r0 = 4
            r1 = 58
            r2 = 1
            int r0 = defpackage.qs6.s0(r1, r2, r0, r6)
            r3 = -1
            r4 = 0
            if (r0 == r3) goto L19
            java.lang.String r1 = r6.substring(r4, r0)
            int r0 = r0 + r2
            java.lang.String r6 = r6.substring(r0)
            defpackage.ft7.a(r5, r1, r6)
            return
        L19:
            char r0 = r6.charAt(r4)
            java.lang.String r3 = ""
            if (r0 != r1) goto L29
            java.lang.String r6 = r6.substring(r2)
            defpackage.ft7.a(r5, r3, r6)
            return
        L29:
            defpackage.ft7.a(r5, r3, r6)
            return
    }

    public void d(java.lang.Object r3) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L51
        L3:
            boolean r0 = r3 instanceof java.lang.Object[]
            java.util.ArrayList r2 = r2.b
            if (r0 == 0) goto L1b
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r0 = r3.length
            if (r0 <= 0) goto L51
            int r0 = r2.size()
            int r1 = r3.length
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Collections.addAll(r2, r3)
            return
        L1b:
            boolean r0 = r3 instanceof java.util.Collection
            if (r0 == 0) goto L25
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            return
        L25:
            boolean r0 = r3 instanceof java.lang.Iterable
            if (r0 == 0) goto L3d
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L2f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r3.next()
            r2.add(r0)
            goto L2f
        L3d:
            boolean r0 = r3 instanceof java.util.Iterator
            if (r0 == 0) goto L52
            java.util.Iterator r3 = (java.util.Iterator) r3
        L43:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r3.next()
            r2.add(r0)
            goto L43
        L51:
            return
        L52:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Don't know how to spread "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public void e(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            defpackage.ft7.c(r1)
            defpackage.ft7.a(r0, r1, r2)
            return
    }

    public defpackage.yw2 f() {
            r2 = this;
            yw2 r0 = new yw2
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.ArrayList r2 = r2.b
            java.lang.Object[] r2 = r2.toArray(r1)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0.<init>(r2)
            return r0
    }

    public void g() {
            r1 = this;
            java.util.ArrayList r1 = r1.b
            pt4 r0 = defpackage.pt4.c
            r1.add(r0)
            return
    }

    public void h(float r8, float r9, float r10, float r11, float r12, float r13) {
            r7 = this;
            qt4 r0 = new qt4
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r7 = r7.b
            r7.add(r0)
            return
    }

    public void i(float r8, float r9, float r10, float r11, float r12, float r13) {
            r7 = this;
            yt4 r0 = new yt4
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.ArrayList r7 = r7.b
            r7.add(r0)
            return
    }

    public java.lang.String j(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            java.util.ArrayList r3 = r3.b
            int r0 = r3.size()
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = defpackage.nj2.s(r0, r1, r2)
            if (r1 > r0) goto L2d
        L13:
            java.lang.Object r2 = r3.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L28
            int r0 = r0 + 1
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L28:
            if (r0 == r1) goto L2d
            int r0 = r0 + (-2)
            goto L13
        L2d:
            r3 = 0
            return r3
    }

    public void k(float r2) {
            r1 = this;
            rt4 r0 = new rt4
            r0.<init>(r2)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void l(float r2) {
            r1 = this;
            zt4 r0 = new zt4
            r0.<init>(r2)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void m(float r2, float r3) {
            r1 = this;
            st4 r0 = new st4
            r0.<init>(r2, r3)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void n(float r2, float r3) {
            r1 = this;
            au4 r0 = new au4
            r0.<init>(r2, r3)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void o(float r2, float r3) {
            r1 = this;
            tt4 r0 = new tt4
            r0.<init>(r2, r3)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void p(float r2, float r3, float r4, float r5) {
            r1 = this;
            vt4 r0 = new vt4
            r0.<init>(r2, r3, r4, r5)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void q(float r2, float r3, float r4, float r5) {
            r1 = this;
            du4 r0 = new du4
            r0.<init>(r2, r3, r4, r5)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void r(java.lang.String r4) {
            r3 = this;
            r4.getClass()
            r0 = 0
        L4:
            java.util.ArrayList r1 = r3.b
            int r2 = r1.size()
            if (r0 >= r2) goto L23
            java.lang.Object r2 = r1.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L20
            r1.remove(r0)
            r1.remove(r0)
            int r0 = r0 + (-2)
        L20:
            int r0 = r0 + 2
            goto L4
        L23:
            return
    }

    public defpackage.le2 s(defpackage.yw7 r7) {
            r6 = this;
            r7.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r6 = r6.b
            int r1 = r6.size()
            r2 = 0
            r3 = r2
        L10:
            if (r3 >= r1) goto L25
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            r5 = r4
            k11 r5 = (defpackage.k11) r5
            boolean r5 = r5.c(r7)
            if (r5 == 0) goto L10
            r0.add(r4)
            goto L10
        L25:
            java.util.ArrayList r6 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            r6.<init>(r1)
            int r1 = r0.size()
            r3 = r2
        L35:
            if (r3 >= r1) goto L49
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            k11 r4 = (defpackage.k11) r4
            p21 r5 = r7.j
            pb0 r4 = r4.b(r5)
            r6.add(r4)
            goto L35
        L49:
            java.util.List r6 = defpackage.gt0.k1(r6)
            le2[] r7 = new defpackage.le2[r2]
            java.lang.Object[] r6 = r6.toArray(r7)
            le2[] r6 = (defpackage.le2[]) r6
            j32 r7 = new j32
            r0 = 1
            r7.<init>(r6, r0)
            le2 r6 = defpackage.f04.z(r7)
            return r6
    }

    public void t(float r2) {
            r1 = this;
            gu4 r0 = new gu4
            r0.<init>(r2)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }

    public void u(float r2) {
            r1 = this;
            fu4 r0 = new fu4
            r0.<init>(r2)
            java.util.ArrayList r1 = r1.b
            r1.add(r0)
            return
    }
}
