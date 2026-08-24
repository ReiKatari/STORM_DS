package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g60  reason: default package */
/* loaded from: classes.dex */
public class g60 implements defpackage.ae4, defpackage.a54 {
    public boolean A;
    public java.lang.Object B;

    public g60(android.content.Context r5, defpackage.mh0 r6) {
            r4 = this;
            r5.getClass()
            r4.<init>()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            r3 = 1
            if (r0 < r1) goto L16
            int r0 = defpackage.gi.b(r5)
            if (r0 == 0) goto L16
            r0 = r3
            goto L17
        L16:
            r0 = r2
        L17:
            r4.A = r0
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            if (r6 == 0) goto L24
            java.lang.Integer r6 = r6.b()
            goto L25
        L24:
            r6 = 0
        L25:
            java.lang.String r0 = "android.hardware.camera"
            boolean r0 = r5.hasSystemFeature(r0)
            java.lang.String r1 = "android.hardware.camera.front"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r0 == 0) goto L3d
            if (r6 == 0) goto L3b
            int r0 = r6.intValue()
            if (r0 != r3) goto L3d
        L3b:
            r0 = r3
            goto L3e
        L3d:
            r0 = r2
        L3e:
            if (r5 == 0) goto L49
            if (r6 == 0) goto L48
            int r5 = r6.intValue()
            if (r5 != 0) goto L49
        L48:
            r2 = r3
        L49:
            cj0 r5 = new cj0
            r5.<init>(r0, r2)
            r4.B = r5
            return
    }

    public /* synthetic */ g60(java.lang.Object r1) {
            r0 = this;
            r0.B = r1
            r1 = 1
            r0.A = r1
            r0.<init>()
            return
    }

    public /* synthetic */ g60(java.lang.Object r1, byte r2) {
            r0 = this;
            r0.B = r1
            r0.<init>()
            return
    }

    public g60(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            r0.B = r1
            return
    }

    public g60(defpackage.xd5 r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.A = r3
            return
    }

    public /* synthetic */ g60(boolean r1, java.lang.Object r2) {
            r0 = this;
            r0.B = r2
            r0.A = r1
            r0.<init>()
            return
    }

    public static boolean b(java.util.Set r1, defpackage.mh0 r2) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.IllegalArgumentException -> Lc
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.IllegalArgumentException -> Lc
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> Lc
            r2.c(r0)     // Catch: java.lang.IllegalArgumentException -> Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    @Override // defpackage.a54
    public boolean M(defpackage.i44 r2) {
            r1 = this;
            java.lang.Object r1 = r1.B
            i87 r1 = (defpackage.i87) r1
            android.view.Window$Callback r1 = r1.m
            r0 = 108(0x6c, float:1.51E-43)
            r1.onMenuOpened(r0, r2)
            r1 = 1
            return r1
    }

    public boolean a() {
            r0 = this;
            boolean r0 = r0.A
            return r0
    }

    public boolean c(java.util.LinkedHashSet r8, java.util.Set r9) {
            r7 = this;
            java.lang.Object r0 = r7.B
            cj0 r0 = (defpackage.cj0) r0
            boolean r7 = r7.A
            r1 = 0
            if (r7 != 0) goto La6
            boolean r7 = r0.a
            boolean r2 = r0.b
            if (r7 != 0) goto L13
            if (r2 != 0) goto L13
            goto La6
        L13:
            mh0 r7 = defpackage.mh0.c
            r7.getClass()
            boolean r7 = b(r8, r7)
            mh0 r3 = defpackage.mh0.b
            r3.getClass()
            boolean r3 = b(r8, r3)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = defpackage.ht0.v0(r9, r5)
            r4.<init>(r5)
            java.util.Iterator r9 = r9.iterator()
        L36:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r9.next()
            yf0 r5 = (defpackage.yf0) r5
            java.lang.String r5 = r5.a()
            r4.add(r5)
            goto L36
        L4a:
            java.util.Set r9 = defpackage.gt0.p1(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r8 = r8.iterator()
        L57:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L76
            java.lang.Object r5 = r8.next()
            r6 = r5
            eg0 r6 = (defpackage.eg0) r6
            cg0 r6 = r6.q()
            java.lang.String r6 = r6.d()
            boolean r6 = r9.contains(r6)
            if (r6 != 0) goto L57
            r4.add(r5)
            goto L57
        L76:
            java.util.Set r8 = defpackage.gt0.p1(r4)
            mh0 r9 = defpackage.mh0.c
            r9.getClass()
            boolean r9 = b(r8, r9)
            mh0 r4 = defpackage.mh0.b
            r4.getClass()
            boolean r8 = b(r8, r4)
            boolean r0 = r0.a
            r4 = 1
            if (r0 == 0) goto L97
            if (r7 == 0) goto L97
            if (r9 != 0) goto L97
            r7 = r4
            goto L98
        L97:
            r7 = r1
        L98:
            if (r2 == 0) goto La0
            if (r3 == 0) goto La0
            if (r8 != 0) goto La0
            r8 = r4
            goto La1
        La0:
            r8 = r1
        La1:
            if (r7 != 0) goto La5
            if (r8 == 0) goto La6
        La5:
            return r4
        La6:
            return r1
    }

    @Override // defpackage.a54
    public void d(defpackage.i44 r3, boolean r4) {
            r2 = this;
            java.lang.Object r4 = r2.B
            i87 r4 = (defpackage.i87) r4
            boolean r0 = r2.A
            if (r0 == 0) goto L9
            return
        L9:
            r0 = 1
            r2.A = r0
            l87 r0 = r4.l
            androidx.appcompat.widget.Toolbar r0 = r0.a
            androidx.appcompat.widget.ActionMenuView r0 = r0.A
            if (r0 == 0) goto L2a
            g8 r0 = r0.s0
            if (r0 == 0) goto L2a
            r0.e()
            d8 r0 = r0.p0
            if (r0 == 0) goto L2a
            boolean r1 = r0.b()
            if (r1 == 0) goto L2a
            t44 r0 = r0.i
            r0.dismiss()
        L2a:
            android.view.Window$Callback r4 = r4.m
            r0 = 108(0x6c, float:1.51E-43)
            r4.onPanelClosed(r0, r3)
            r3 = 0
            r2.A = r3
            return
    }

    public boolean e(int r7, java.lang.CharSequence r8) {
            r6 = this;
            r0 = 0
            if (r8 == 0) goto L45
            if (r7 < 0) goto L45
            int r1 = r8.length()
            int r1 = r1 - r7
            if (r1 < 0) goto L45
            java.lang.Object r1 = r6.B
            xd5 r1 = (defpackage.xd5) r1
            if (r1 != 0) goto L17
            boolean r6 = r6.a()
            return r6
        L17:
            r1 = 2
            r2 = r0
            r3 = r1
        L1a:
            r4 = 1
            if (r2 >= r7) goto L3a
            if (r3 != r1) goto L3a
            char r3 = r8.charAt(r2)
            byte r3 = java.lang.Character.getDirectionality(r3)
            g60 r5 = defpackage.f17.a
            if (r3 == 0) goto L36
            if (r3 == r4) goto L34
            if (r3 == r1) goto L34
            switch(r3) {
                case 14: goto L36;
                case 15: goto L36;
                case 16: goto L34;
                case 17: goto L34;
                default: goto L32;
            }
        L32:
            r3 = r1
            goto L37
        L34:
            r3 = r0
            goto L37
        L36:
            r3 = r4
        L37:
            int r2 = r2 + 1
            goto L1a
        L3a:
            if (r3 == 0) goto L44
            if (r3 == r4) goto L43
            boolean r6 = r6.a()
            return r6
        L43:
            return r0
        L44:
            return r4
        L45:
            defpackage.u34.t()
            return r0
    }

    public void f() {
            r1 = this;
            r0 = 0
            r1.A = r0
            return
    }

    public void g(byte r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            ja3 r2 = (defpackage.ja3) r2
            long r0 = (long) r3
            r2.writeLong(r0)
            return
    }

    public void h(char r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ja3 r0 = (defpackage.ja3) r0
            r0.d(r1)
            return
    }

    public void i(int r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            ja3 r2 = (defpackage.ja3) r2
            long r0 = (long) r3
            r2.writeLong(r0)
            return
    }

    public void j(long r1) {
            r0 = this;
            java.lang.Object r0 = r0.B
            ja3 r0 = (defpackage.ja3) r0
            r0.writeLong(r1)
            return
    }

    public void k(short r3) {
            r2 = this;
            java.lang.Object r2 = r2.B
            ja3 r2 = (defpackage.ja3) r2
            long r0 = (long) r3
            r2.writeLong(r0)
            return
    }

    public void l(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            java.lang.Object r0 = r0.B
            ja3 r0 = (defpackage.ja3) r0
            r0.e(r1)
            return
    }

    public void m() {
            r0 = this;
            return
    }

    public void n() {
            r0 = this;
            return
    }

    public void o(defpackage.kh0 r4) {
            r3 = this;
            java.lang.Object r0 = r3.B
            cj0 r0 = (defpackage.cj0) r0
            r4.getClass()
            boolean r3 = r3.A
            java.lang.String r1 = "CameraValidator"
            if (r3 == 0) goto L2c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Virtual device with "
            r3.<init>(r0)
            java.util.LinkedHashSet r4 = r4.c()
            int r4 = r4.size()
            r3.append(r4)
            java.lang.String r4 = " cameras. Skipping validation."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            defpackage.kj2.t(r1, r3)
            return
        L2c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "Verifying camera lens facing on "
            r3.<init>(r2)
            java.lang.String r2 = android.os.Build.DEVICE
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            defpackage.kj2.t(r1, r3)
            boolean r3 = r0.a
            if (r3 == 0) goto L58
            mh0 r3 = defpackage.mh0.c     // Catch: java.lang.RuntimeException -> L51
            java.util.LinkedHashSet r2 = r4.c()     // Catch: java.lang.RuntimeException -> L51
            eg0 r3 = r3.c(r2)     // Catch: java.lang.RuntimeException -> L51
            r3.getClass()     // Catch: java.lang.RuntimeException -> L51
            goto L58
        L51:
            r3 = move-exception
            java.lang.String r2 = "Camera LENS_FACING_BACK verification failed"
            defpackage.kj2.g0(r1, r2, r3)
            goto L59
        L58:
            r3 = 0
        L59:
            boolean r0 = r0.b
            if (r0 == 0) goto L74
            mh0 r0 = defpackage.mh0.b     // Catch: java.lang.RuntimeException -> L6b
            java.util.LinkedHashSet r2 = r4.c()     // Catch: java.lang.RuntimeException -> L6b
            eg0 r0 = r0.c(r2)     // Catch: java.lang.RuntimeException -> L6b
            r0.getClass()     // Catch: java.lang.RuntimeException -> L6b
            goto L74
        L6b:
            r0 = move-exception
            java.lang.String r2 = "Camera LENS_FACING_FRONT verification failed"
            defpackage.kj2.g0(r1, r2, r0)
            if (r3 != 0) goto L74
            r3 = r0
        L74:
            if (r3 != 0) goto L77
            return
        L77:
            bj0 r0 = new bj0
            java.util.LinkedHashSet r4 = r4.c()
            int r4 = r4.size()
            r0.<init>(r4, r3)
            throw r0
    }

    @Override // defpackage.ae4
    public long w0(long r1, long r3, int r5) {
            r0 = this;
            boolean r1 = r0.A
            if (r1 == 0) goto L28
            java.lang.Object r0 = r0.B
            m86 r0 = (defpackage.m86) r0
            f86 r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L11
            goto L28
        L11:
            f86 r1 = r0.a
            float r2 = r0.g(r3)
            float r2 = r0.d(r2)
            float r1 = r1.e(r2)
            float r1 = r0.d(r1)
            long r0 = r0.h(r1)
            return r0
        L28:
            r0 = 0
            return r0
    }

    @Override // defpackage.ae4
    public java.lang.Object z0(long r5, long r7, defpackage.r41 r9) {
            r4 = this;
            boolean r5 = r9 instanceof defpackage.z76
            if (r5 == 0) goto L13
            r5 = r9
            z76 r5 = (defpackage.z76) r5
            int r6 = r5.Z
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r6 & r0
            if (r1 == 0) goto L13
            int r6 = r6 - r0
            r5.Z = r6
            goto L1a
        L13:
            z76 r5 = new z76
            s41 r9 = (defpackage.s41) r9
            r5.<init>(r4, r9)
        L1a:
            java.lang.Object r6 = r5.X
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r0 = r5.Z
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            long r7 = r5.R
            defpackage.oi2.Y(r6)
            goto L4f
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L32:
            defpackage.oi2.Y(r6)
            boolean r6 = r4.A
            r2 = 0
            if (r6 == 0) goto L57
            java.lang.Object r4 = r4.B
            m86 r4 = (defpackage.m86) r4
            boolean r6 = r4.i
            if (r6 == 0) goto L44
            goto L53
        L44:
            r5.R = r7
            r5.Z = r1
            java.lang.Object r6 = r4.a(r7, r5)
            if (r6 != r9) goto L4f
            return r9
        L4f:
            ol7 r6 = (defpackage.ol7) r6
            long r2 = r6.a
        L53:
            long r2 = defpackage.ol7.d(r7, r2)
        L57:
            ol7 r4 = new ol7
            r4.<init>(r2)
            return r4
    }
}
