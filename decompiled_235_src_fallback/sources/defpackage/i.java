package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements defpackage.hu, defpackage.zk4, defpackage.tj0, defpackage.u23, defpackage.gm1, defpackage.ph4 {
    public final /* synthetic */ int A;

    public /* synthetic */ i(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ i(defpackage.bt r1) {
            r0 = this;
            r1 = 12
            r0.A = r1
            r0.<init>()
            return
    }

    public static /* synthetic */ void d() {
            ug r0 = new ug
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void f(java.lang.Object r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void g(java.lang.Object r1, java.lang.Object r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void h(java.lang.String r1) {
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void i(java.lang.String r1, int r2, java.lang.Object r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
    }

    public static /* synthetic */ void j(java.lang.StringBuilder r0, java.lang.Object r1) {
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void k(java.lang.StringBuilder r0, java.lang.Object r1, java.lang.Object r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public static /* synthetic */ void l() {
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public static /* synthetic */ void m(java.lang.String r1) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void n() {
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
    }

    @Override // defpackage.zk4
    public defpackage.vu7 U(android.view.View r3, defpackage.vu7 r4) {
            r2 = this;
            r3.getClass()
            r2 = 647(0x287, float:9.07E-43)
            ru7 r4 = r4.a
            e83 r2 = r4.h(r2)
            r2.getClass()
            int r2 = r2.d
            int r4 = r3.getPaddingLeft()
            int r0 = r3.getPaddingTop()
            int r1 = r3.getPaddingRight()
            r3.setPadding(r4, r0, r1, r2)
            vu7 r2 = defpackage.vu7.b
            return r2
    }

    @Override // defpackage.hu
    public int a(int r2, defpackage.kk3 r3) {
            r1 = this;
            float r1 = (float) r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            kk3 r2 = defpackage.kk3.Ltr
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r2) goto Ld
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto Le
        Ld:
            r2 = r0
        Le:
            float r0 = r0 + r2
            float r0 = r0 * r1
            int r1 = java.lang.Math.round(r0)
            return r1
    }

    @Override // defpackage.u23
    public void b(defpackage.v23 r3) {
            r2 = this;
            java.lang.String r2 = "OnImageAvailableListener: mCurrentRequest ID = null, image.isNull = "
            java.lang.String r0 = "CaptureNode"
            s23 r3 = r3.a()     // Catch: java.lang.IllegalStateException -> L35
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L35
            r1.<init>(r2)     // Catch: java.lang.IllegalStateException -> L35
            if (r3 != 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            r1.append(r2)     // Catch: java.lang.IllegalStateException -> L35
            java.lang.String r2 = r1.toString()     // Catch: java.lang.IllegalStateException -> L35
            defpackage.kj2.t(r0, r2)     // Catch: java.lang.IllegalStateException -> L35
            if (r3 == 0) goto L35
            defpackage.nj2.h()     // Catch: java.lang.IllegalStateException -> L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L35
            java.lang.String r1 = "Discarding ImageProxy which was inadvertently acquired: "
            r2.<init>(r1)     // Catch: java.lang.IllegalStateException -> L35
            r2.append(r3)     // Catch: java.lang.IllegalStateException -> L35
            java.lang.String r2 = r2.toString()     // Catch: java.lang.IllegalStateException -> L35
            defpackage.kj2.f0(r0, r2)     // Catch: java.lang.IllegalStateException -> L35
            r3.close()     // Catch: java.lang.IllegalStateException -> L35
        L35:
            return
    }

    @Override // defpackage.gm1
    public double c(double r11) {
            r10 = this;
            int r10 = r10.A
            r0 = 0
            r2 = 4590241633823995264(0x3fb3d0722149b580, double:0.07739938080495357)
            r4 = 4587673935106099715(0x3faab1232f514a03, double:0.05213270142180095)
            r6 = 4606712849170623328(0x3fee54edcd0aeb60, double:0.9478672985781991)
            switch(r10) {
                case 15: goto L5c;
                case 16: goto L3a;
                case 17: goto L31;
                case 18: goto L28;
                case 19: goto L1f;
                default: goto L16;
            }
        L16:
            float[] r10 = defpackage.qt0.a
            e97 r10 = defpackage.qt0.d
            double r10 = defpackage.qt0.c(r10, r11)
            return r10
        L1f:
            float[] r10 = defpackage.qt0.a
            e97 r10 = defpackage.qt0.d
            double r10 = defpackage.qt0.d(r10, r11)
            return r10
        L28:
            float[] r10 = defpackage.qt0.a
            e97 r10 = defpackage.qt0.c
            double r10 = defpackage.qt0.a(r10, r11)
            return r10
        L31:
            float[] r10 = defpackage.qt0.a
            e97 r10 = defpackage.qt0.c
            double r10 = defpackage.qt0.b(r10, r11)
            return r10
        L3a:
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 >= 0) goto L40
            double r0 = -r11
            goto L41
        L40:
            r0 = r11
        L41:
            r8 = 4585990280393462802(0x3fa4b5dcc63f1412, double:0.04045)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 < 0) goto L56
            double r6 = r6 * r0
            double r6 = r6 + r4
            r0 = 4612586738352862003(0x4003333333333333, double:2.4)
            double r0 = java.lang.Math.pow(r6, r0)
            goto L57
        L56:
            double r0 = r0 * r2
        L57:
            double r10 = java.lang.Math.copySign(r0, r11)
            return r10
        L5c:
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 >= 0) goto L62
            double r0 = -r11
            goto L63
        L62:
            r0 = r11
        L63:
            r8 = 4569365567241691235(0x3f69a5c61c57a063, double:0.0031308049535603718)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r10 < 0) goto L78
            r2 = 4601177619296856747(0x3fdaaaaaaaaaaaab, double:0.4166666666666667)
            double r0 = java.lang.Math.pow(r0, r2)
            double r0 = r0 - r4
            double r0 = r0 / r6
            goto L79
        L78:
            double r0 = r0 / r2
        L79:
            double r10 = java.lang.Math.copySign(r0, r11)
            return r10
    }

    @Override // defpackage.tj0
    public void cancel() {
            r0 = this;
            return
    }

    @Override // defpackage.ph4
    public java.lang.Object e() {
            r1 = this;
            int r1 = r1.A
            switch(r1) {
                case 21: goto L36;
                case 22: goto L30;
                case 23: goto L2a;
                case 24: goto L24;
                case 25: goto L1e;
                case 26: goto L18;
                case 27: goto L11;
                case 28: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            return r1
        Lb:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            return r1
        L11:
            aw3 r1 = new aw3
            r0 = 1
            r1.<init>(r0)
            return r1
        L18:
            java.util.ArrayDeque r1 = new java.util.ArrayDeque
            r1.<init>()
            return r1
        L1e:
            java.util.TreeSet r1 = new java.util.TreeSet
            r1.<init>()
            return r1
        L24:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            return r1
        L2a:
            java.util.concurrent.ConcurrentSkipListMap r1 = new java.util.concurrent.ConcurrentSkipListMap
            r1.<init>()
            return r1
        L30:
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            return r1
        L36:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
    }
}
