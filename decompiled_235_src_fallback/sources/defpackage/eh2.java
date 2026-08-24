package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh2  reason: default package */
/* loaded from: classes.dex */
public final class eh2 implements defpackage.ah2 {
    public final defpackage.te a;
    public final defpackage.te b;
    public final defpackage.vh2 c;
    public final defpackage.xg2 d;
    public final defpackage.ch2 e;
    public defpackage.v94 f;
    public final defpackage.ca4 g;
    public defpackage.vh2 h;

    public eh2(defpackage.te r4, defpackage.te r5) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            vh2 r4 = new vh2
            r0 = 0
            r1 = 14
            r2 = 2
            r4.<init>(r2, r0, r1)
            r3.c = r4
            xg2 r4 = new xg2
            r4.<init>(r3, r5)
            r3.d = r4
            ch2 r4 = new ch2
            r4.<init>(r3)
            r3.e = r4
            ca4 r4 = new ca4
            r5 = 1
            r4.<init>(r5)
            r3.g = r4
            return
    }

    public final boolean a(boolean r8) {
            r7 = this;
            vh2 r8 = r7.f()
            r0 = 1
            if (r8 != 0) goto L9
            goto La6
        L9:
            vh2 r8 = r7.f()
            r1 = 0
            r7.i(r1)
            if (r8 == 0) goto La6
            sh2 r7 = defpackage.sh2.Active
            sh2 r2 = defpackage.sh2.Inactive
            r8.S0(r7, r2)
            z64 r7 = r8.A
            boolean r7 = r7.j0
            if (r7 != 0) goto L25
            java.lang.String r7 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r7)
        L25:
            z64 r7 = r8.A
            z64 r7 = r7.X
            sm3 r8 = defpackage.nc1.f0(r8)
        L2d:
            if (r8 == 0) goto La6
            if0 r2 = r8.B0
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
            int r2 = r2.R
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L95
        L3b:
            if (r7 == 0) goto L95
            int r2 = r7.L
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L92
            r2 = r7
            r3 = r1
        L45:
            if (r2 == 0) goto L92
            boolean r4 = r2 instanceof defpackage.vh2
            if (r4 == 0) goto L55
            vh2 r2 = (defpackage.vh2) r2
            sh2 r4 = defpackage.sh2.ActiveParent
            sh2 r5 = defpackage.sh2.Inactive
            r2.S0(r4, r5)
            goto L8d
        L55:
            int r4 = r2.L
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L8d
            boolean r4 = r2 instanceof defpackage.zg1
            if (r4 == 0) goto L8d
            r4 = r2
            zg1 r4 = (defpackage.zg1) r4
            z64 r4 = r4.l0
            r5 = 0
        L65:
            if (r4 == 0) goto L8a
            int r6 = r4.L
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L87
            int r5 = r5 + 1
            if (r5 != r0) goto L73
            r2 = r4
            goto L87
        L73:
            if (r3 != 0) goto L7e
            ua4 r3 = new ua4
            r6 = 16
            z64[] r6 = new defpackage.z64[r6]
            r3.<init>(r6)
        L7e:
            if (r2 == 0) goto L84
            r3.b(r2)
            r2 = r1
        L84:
            r3.b(r4)
        L87:
            z64 r4 = r4.Y
            goto L65
        L8a:
            if (r5 != r0) goto L8d
            goto L45
        L8d:
            z64 r2 = defpackage.nc1.A(r3)
            goto L45
        L92:
            z64 r7 = r7.X
            goto L3b
        L95:
            sm3 r8 = r8.v()
            if (r8 == 0) goto La4
            if0 r7 = r8.B0
            if (r7 == 0) goto La4
            java.lang.Object r7 = r7.f
            vy6 r7 = (defpackage.vy6) r7
            goto L2d
        La4:
            r7 = r1
            goto L2d
        La6:
            return r0
    }

    public final boolean b(int r4, boolean r5, boolean r6) {
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L27
            vh2 r1 = r3.c
            g81 r4 = defpackage.jx2.E(r1, r4)
            int[] r1 = defpackage.bh2.a
            int r4 = r4.ordinal()
            r4 = r1[r4]
            r1 = 0
            if (r4 == r0) goto L25
            r2 = 2
            if (r4 == r2) goto L25
            r2 = 3
            if (r4 == r2) goto L25
            r2 = 4
            if (r4 != r2) goto L21
            r3.a(r5)
            goto L2a
        L21:
            defpackage.i.d()
            return r1
        L25:
            r0 = r1
            goto L2a
        L27:
            r3.a(r5)
        L2a:
            if (r0 == 0) goto L31
            if (r6 == 0) goto L31
            r3.c()
        L31:
            return r0
    }

    public final void c() {
            r1 = this;
            te r1 = r1.a
            boolean r0 = r1.isFocused()
            if (r0 != 0) goto L22
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto Lf
            goto L22
        Lf:
            boolean r0 = r1.hasFocus()
            if (r0 == 0) goto L21
            android.view.View r0 = r1.findFocus()
            if (r0 == 0) goto L1e
            r0.clearFocus()
        L1e:
            r1.clearFocus()
        L21:
            return
        L22:
            r1.clearFocus()
            return
    }

    public final boolean d(android.view.KeyEvent r13, defpackage.on2 r14) {
            r12 = this;
            vh2 r0 = r12.c
            java.lang.String r1 = "FocusOwnerImpl:dispatchKeyEvent"
            android.os.Trace.beginSection(r1)
            xg2 r1 = r12.d     // Catch: java.lang.Throwable -> L2ee
            boolean r1 = r1.e     // Catch: java.lang.Throwable -> L2ee
            r2 = 0
            if (r1 == 0) goto L19
            java.lang.String r12 = "FocusRelatedWarning: Dispatching key event while focus system is invalidated."
            java.io.PrintStream r13 = java.lang.System.out     // Catch: java.lang.Throwable -> L2ee
            r13.println(r12)     // Catch: java.lang.Throwable -> L2ee
            android.os.Trace.endSection()
            return r2
        L19:
            boolean r12 = r12.j(r13)     // Catch: java.lang.Throwable -> L2ee
            if (r12 != 0) goto L23
            android.os.Trace.endSection()
            return r2
        L23:
            vh2 r12 = defpackage.yh2.q(r0)     // Catch: java.lang.Throwable -> L2ee
            java.lang.String r1 = "visitAncestors called on an unattached node"
            r3 = 16
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L59
            z64 r6 = r12.A     // Catch: java.lang.Throwable -> L2ee
            boolean r6 = r6.j0     // Catch: java.lang.Throwable -> L2ee
            if (r6 != 0) goto L3a
            java.lang.String r6 = "visitLocalDescendants called on an unattached node"
            defpackage.p53.c(r6)     // Catch: java.lang.Throwable -> L2ee
        L3a:
            z64 r6 = r12.A     // Catch: java.lang.Throwable -> L2ee
            int r7 = r6.R     // Catch: java.lang.Throwable -> L2ee
            r7 = r7 & 9216(0x2400, float:1.2914E-41)
            if (r7 == 0) goto L56
            z64 r6 = r6.Y     // Catch: java.lang.Throwable -> L2ee
            r7 = r4
        L45:
            if (r6 == 0) goto L57
            int r8 = r6.L     // Catch: java.lang.Throwable -> L2ee
            r9 = r8 & 9216(0x2400, float:1.2914E-41)
            if (r9 == 0) goto L53
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L52
            goto L57
        L52:
            r7 = r6
        L53:
            z64 r6 = r6.Y     // Catch: java.lang.Throwable -> L2ee
            goto L45
        L56:
            r7 = r4
        L57:
            if (r7 != 0) goto L16d
        L59:
            if (r12 == 0) goto Le3
            z64 r6 = r12.A     // Catch: java.lang.Throwable -> L2ee
            boolean r6 = r6.j0     // Catch: java.lang.Throwable -> L2ee
            if (r6 != 0) goto L64
            defpackage.p53.c(r1)     // Catch: java.lang.Throwable -> L2ee
        L64:
            z64 r6 = r12.A     // Catch: java.lang.Throwable -> L2ee
            sm3 r12 = defpackage.nc1.f0(r12)     // Catch: java.lang.Throwable -> L2ee
        L6a:
            if (r12 == 0) goto Ld8
            if0 r7 = r12.B0     // Catch: java.lang.Throwable -> L2ee
            java.lang.Object r7 = r7.g     // Catch: java.lang.Throwable -> L2ee
            z64 r7 = (defpackage.z64) r7     // Catch: java.lang.Throwable -> L2ee
            int r7 = r7.R     // Catch: java.lang.Throwable -> L2ee
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto Lc7
        L78:
            if (r6 == 0) goto Lc7
            int r7 = r6.L     // Catch: java.lang.Throwable -> L2ee
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto Lc4
            r8 = r4
            r7 = r6
        L82:
            if (r7 == 0) goto Lc4
            boolean r9 = r7 instanceof defpackage.bh3     // Catch: java.lang.Throwable -> L2ee
            if (r9 == 0) goto L89
            goto Ld9
        L89:
            int r9 = r7.L     // Catch: java.lang.Throwable -> L2ee
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto Lbf
            boolean r9 = r7 instanceof defpackage.zg1     // Catch: java.lang.Throwable -> L2ee
            if (r9 == 0) goto Lbf
            r9 = r7
            zg1 r9 = (defpackage.zg1) r9     // Catch: java.lang.Throwable -> L2ee
            z64 r9 = r9.l0     // Catch: java.lang.Throwable -> L2ee
            r10 = r2
        L99:
            if (r9 == 0) goto Lbc
            int r11 = r9.L     // Catch: java.lang.Throwable -> L2ee
            r11 = r11 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto Lb9
            int r10 = r10 + 1
            if (r10 != r5) goto La7
            r7 = r9
            goto Lb9
        La7:
            if (r8 != 0) goto Lb0
            ua4 r8 = new ua4     // Catch: java.lang.Throwable -> L2ee
            z64[] r11 = new defpackage.z64[r3]     // Catch: java.lang.Throwable -> L2ee
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2ee
        Lb0:
            if (r7 == 0) goto Lb6
            r8.b(r7)     // Catch: java.lang.Throwable -> L2ee
            r7 = r4
        Lb6:
            r8.b(r9)     // Catch: java.lang.Throwable -> L2ee
        Lb9:
            z64 r9 = r9.Y     // Catch: java.lang.Throwable -> L2ee
            goto L99
        Lbc:
            if (r10 != r5) goto Lbf
            goto L82
        Lbf:
            z64 r7 = defpackage.nc1.A(r8)     // Catch: java.lang.Throwable -> L2ee
            goto L82
        Lc4:
            z64 r6 = r6.X     // Catch: java.lang.Throwable -> L2ee
            goto L78
        Lc7:
            sm3 r12 = r12.v()     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto Ld6
            if0 r6 = r12.B0     // Catch: java.lang.Throwable -> L2ee
            if (r6 == 0) goto Ld6
            java.lang.Object r6 = r6.f     // Catch: java.lang.Throwable -> L2ee
            vy6 r6 = (defpackage.vy6) r6     // Catch: java.lang.Throwable -> L2ee
            goto L6a
        Ld6:
            r6 = r4
            goto L6a
        Ld8:
            r7 = r4
        Ld9:
            bh3 r7 = (defpackage.bh3) r7     // Catch: java.lang.Throwable -> L2ee
            if (r7 == 0) goto Le3
            z64 r7 = (defpackage.z64) r7     // Catch: java.lang.Throwable -> L2ee
            z64 r7 = r7.A     // Catch: java.lang.Throwable -> L2ee
            goto L16d
        Le3:
            z64 r12 = r0.A     // Catch: java.lang.Throwable -> L2ee
            boolean r12 = r12.j0     // Catch: java.lang.Throwable -> L2ee
            if (r12 != 0) goto Lec
            defpackage.p53.c(r1)     // Catch: java.lang.Throwable -> L2ee
        Lec:
            z64 r12 = r0.A     // Catch: java.lang.Throwable -> L2ee
            z64 r12 = r12.X     // Catch: java.lang.Throwable -> L2ee
            sm3 r0 = defpackage.nc1.f0(r0)     // Catch: java.lang.Throwable -> L2ee
        Lf4:
            if (r0 == 0) goto L162
            if0 r6 = r0.B0     // Catch: java.lang.Throwable -> L2ee
            java.lang.Object r6 = r6.g     // Catch: java.lang.Throwable -> L2ee
            z64 r6 = (defpackage.z64) r6     // Catch: java.lang.Throwable -> L2ee
            int r6 = r6.R     // Catch: java.lang.Throwable -> L2ee
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L151
        L102:
            if (r12 == 0) goto L151
            int r6 = r12.L     // Catch: java.lang.Throwable -> L2ee
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L14e
            r6 = r12
            r7 = r4
        L10c:
            if (r6 == 0) goto L14e
            boolean r8 = r6 instanceof defpackage.bh3     // Catch: java.lang.Throwable -> L2ee
            if (r8 == 0) goto L113
            goto L163
        L113:
            int r8 = r6.L     // Catch: java.lang.Throwable -> L2ee
            r8 = r8 & 8192(0x2000, float:1.148E-41)
            if (r8 == 0) goto L149
            boolean r8 = r6 instanceof defpackage.zg1     // Catch: java.lang.Throwable -> L2ee
            if (r8 == 0) goto L149
            r8 = r6
            zg1 r8 = (defpackage.zg1) r8     // Catch: java.lang.Throwable -> L2ee
            z64 r8 = r8.l0     // Catch: java.lang.Throwable -> L2ee
            r9 = r2
        L123:
            if (r8 == 0) goto L146
            int r10 = r8.L     // Catch: java.lang.Throwable -> L2ee
            r10 = r10 & 8192(0x2000, float:1.148E-41)
            if (r10 == 0) goto L143
            int r9 = r9 + 1
            if (r9 != r5) goto L131
            r6 = r8
            goto L143
        L131:
            if (r7 != 0) goto L13a
            ua4 r7 = new ua4     // Catch: java.lang.Throwable -> L2ee
            z64[] r10 = new defpackage.z64[r3]     // Catch: java.lang.Throwable -> L2ee
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L2ee
        L13a:
            if (r6 == 0) goto L140
            r7.b(r6)     // Catch: java.lang.Throwable -> L2ee
            r6 = r4
        L140:
            r7.b(r8)     // Catch: java.lang.Throwable -> L2ee
        L143:
            z64 r8 = r8.Y     // Catch: java.lang.Throwable -> L2ee
            goto L123
        L146:
            if (r9 != r5) goto L149
            goto L10c
        L149:
            z64 r6 = defpackage.nc1.A(r7)     // Catch: java.lang.Throwable -> L2ee
            goto L10c
        L14e:
            z64 r12 = r12.X     // Catch: java.lang.Throwable -> L2ee
            goto L102
        L151:
            sm3 r0 = r0.v()     // Catch: java.lang.Throwable -> L2ee
            if (r0 == 0) goto L160
            if0 r12 = r0.B0     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto L160
            java.lang.Object r12 = r12.f     // Catch: java.lang.Throwable -> L2ee
            vy6 r12 = (defpackage.vy6) r12     // Catch: java.lang.Throwable -> L2ee
            goto Lf4
        L160:
            r12 = r4
            goto Lf4
        L162:
            r6 = r4
        L163:
            bh3 r6 = (defpackage.bh3) r6     // Catch: java.lang.Throwable -> L2ee
            if (r6 == 0) goto L16c
            z64 r6 = (defpackage.z64) r6     // Catch: java.lang.Throwable -> L2ee
            z64 r7 = r6.A     // Catch: java.lang.Throwable -> L2ee
            goto L16d
        L16c:
            r7 = r4
        L16d:
            if (r7 == 0) goto L2ea
            z64 r12 = r7.A     // Catch: java.lang.Throwable -> L2ee
            boolean r12 = r12.j0     // Catch: java.lang.Throwable -> L2ee
            if (r12 != 0) goto L178
            defpackage.p53.c(r1)     // Catch: java.lang.Throwable -> L2ee
        L178:
            z64 r12 = r7.A     // Catch: java.lang.Throwable -> L2ee
            z64 r12 = r12.X     // Catch: java.lang.Throwable -> L2ee
            sm3 r0 = defpackage.nc1.f0(r7)     // Catch: java.lang.Throwable -> L2ee
            r1 = r4
        L181:
            if (r0 == 0) goto L1fd
            if0 r6 = r0.B0     // Catch: java.lang.Throwable -> L2ee
            java.lang.Object r6 = r6.g     // Catch: java.lang.Throwable -> L2ee
            z64 r6 = (defpackage.z64) r6     // Catch: java.lang.Throwable -> L2ee
            int r6 = r6.R     // Catch: java.lang.Throwable -> L2ee
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L1ec
        L18f:
            if (r12 == 0) goto L1ec
            int r6 = r12.L     // Catch: java.lang.Throwable -> L2ee
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L1e9
            r6 = r12
            r8 = r4
        L199:
            if (r6 == 0) goto L1e9
            boolean r9 = r6 instanceof defpackage.bh3     // Catch: java.lang.Throwable -> L2ee
            if (r9 == 0) goto L1ab
            if (r1 != 0) goto L1a6
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2ee
            r1.<init>()     // Catch: java.lang.Throwable -> L2ee
        L1a6:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2ee
            r9 = r2
            goto L1ac
        L1ab:
            r9 = r5
        L1ac:
            if (r9 == 0) goto L1e4
            int r9 = r6.L     // Catch: java.lang.Throwable -> L2ee
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L1e4
            boolean r9 = r6 instanceof defpackage.zg1     // Catch: java.lang.Throwable -> L2ee
            if (r9 == 0) goto L1e4
            r9 = r6
            zg1 r9 = (defpackage.zg1) r9     // Catch: java.lang.Throwable -> L2ee
            z64 r9 = r9.l0     // Catch: java.lang.Throwable -> L2ee
            r10 = r2
        L1be:
            if (r9 == 0) goto L1e1
            int r11 = r9.L     // Catch: java.lang.Throwable -> L2ee
            r11 = r11 & 8192(0x2000, float:1.148E-41)
            if (r11 == 0) goto L1de
            int r10 = r10 + 1
            if (r10 != r5) goto L1cc
            r6 = r9
            goto L1de
        L1cc:
            if (r8 != 0) goto L1d5
            ua4 r8 = new ua4     // Catch: java.lang.Throwable -> L2ee
            z64[] r11 = new defpackage.z64[r3]     // Catch: java.lang.Throwable -> L2ee
            r8.<init>(r11)     // Catch: java.lang.Throwable -> L2ee
        L1d5:
            if (r6 == 0) goto L1db
            r8.b(r6)     // Catch: java.lang.Throwable -> L2ee
            r6 = r4
        L1db:
            r8.b(r9)     // Catch: java.lang.Throwable -> L2ee
        L1de:
            z64 r9 = r9.Y     // Catch: java.lang.Throwable -> L2ee
            goto L1be
        L1e1:
            if (r10 != r5) goto L1e4
            goto L199
        L1e4:
            z64 r6 = defpackage.nc1.A(r8)     // Catch: java.lang.Throwable -> L2ee
            goto L199
        L1e9:
            z64 r12 = r12.X     // Catch: java.lang.Throwable -> L2ee
            goto L18f
        L1ec:
            sm3 r0 = r0.v()     // Catch: java.lang.Throwable -> L2ee
            if (r0 == 0) goto L1fb
            if0 r12 = r0.B0     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto L1fb
            java.lang.Object r12 = r12.f     // Catch: java.lang.Throwable -> L2ee
            vy6 r12 = (defpackage.vy6) r12     // Catch: java.lang.Throwable -> L2ee
            goto L181
        L1fb:
            r12 = r4
            goto L181
        L1fd:
            if (r1 == 0) goto L21e
            int r12 = r1.size()     // Catch: java.lang.Throwable -> L2ee
            int r12 = r12 + (-1)
            if (r12 < 0) goto L21e
        L207:
            int r0 = r12 + (-1)
            java.lang.Object r12 = r1.get(r12)     // Catch: java.lang.Throwable -> L2ee
            bh3 r12 = (defpackage.bh3) r12     // Catch: java.lang.Throwable -> L2ee
            boolean r12 = r12.k(r13)     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto L219
            android.os.Trace.endSection()
            return r5
        L219:
            if (r0 >= 0) goto L21c
            goto L21e
        L21c:
            r12 = r0
            goto L207
        L21e:
            z64 r12 = r7.A     // Catch: java.lang.Throwable -> L2ee
            r0 = r4
        L221:
            if (r12 == 0) goto L26e
            boolean r6 = r12 instanceof defpackage.bh3     // Catch: java.lang.Throwable -> L2ee
            if (r6 == 0) goto L233
            bh3 r12 = (defpackage.bh3) r12     // Catch: java.lang.Throwable -> L2ee
            boolean r12 = r12.k(r13)     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto L269
            android.os.Trace.endSection()
            return r5
        L233:
            int r6 = r12.L     // Catch: java.lang.Throwable -> L2ee
            r6 = r6 & 8192(0x2000, float:1.148E-41)
            if (r6 == 0) goto L269
            boolean r6 = r12 instanceof defpackage.zg1     // Catch: java.lang.Throwable -> L2ee
            if (r6 == 0) goto L269
            r6 = r12
            zg1 r6 = (defpackage.zg1) r6     // Catch: java.lang.Throwable -> L2ee
            z64 r6 = r6.l0     // Catch: java.lang.Throwable -> L2ee
            r8 = r2
        L243:
            if (r6 == 0) goto L266
            int r9 = r6.L     // Catch: java.lang.Throwable -> L2ee
            r9 = r9 & 8192(0x2000, float:1.148E-41)
            if (r9 == 0) goto L263
            int r8 = r8 + 1
            if (r8 != r5) goto L251
            r12 = r6
            goto L263
        L251:
            if (r0 != 0) goto L25a
            ua4 r0 = new ua4     // Catch: java.lang.Throwable -> L2ee
            z64[] r9 = new defpackage.z64[r3]     // Catch: java.lang.Throwable -> L2ee
            r0.<init>(r9)     // Catch: java.lang.Throwable -> L2ee
        L25a:
            if (r12 == 0) goto L260
            r0.b(r12)     // Catch: java.lang.Throwable -> L2ee
            r12 = r4
        L260:
            r0.b(r6)     // Catch: java.lang.Throwable -> L2ee
        L263:
            z64 r6 = r6.Y     // Catch: java.lang.Throwable -> L2ee
            goto L243
        L266:
            if (r8 != r5) goto L269
            goto L221
        L269:
            z64 r12 = defpackage.nc1.A(r0)     // Catch: java.lang.Throwable -> L2ee
            goto L221
        L26e:
            java.lang.Object r12 = r14.c()     // Catch: java.lang.Throwable -> L2ee
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.lang.Throwable -> L2ee
            boolean r12 = r12.booleanValue()     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto L27e
            android.os.Trace.endSection()
            return r5
        L27e:
            z64 r12 = r7.A     // Catch: java.lang.Throwable -> L2ee
            r14 = r4
        L281:
            if (r12 == 0) goto L2ce
            boolean r0 = r12 instanceof defpackage.bh3     // Catch: java.lang.Throwable -> L2ee
            if (r0 == 0) goto L293
            bh3 r12 = (defpackage.bh3) r12     // Catch: java.lang.Throwable -> L2ee
            boolean r12 = r12.B(r13)     // Catch: java.lang.Throwable -> L2ee
            if (r12 == 0) goto L2c9
            android.os.Trace.endSection()
            return r5
        L293:
            int r0 = r12.L     // Catch: java.lang.Throwable -> L2ee
            r0 = r0 & 8192(0x2000, float:1.148E-41)
            if (r0 == 0) goto L2c9
            boolean r0 = r12 instanceof defpackage.zg1     // Catch: java.lang.Throwable -> L2ee
            if (r0 == 0) goto L2c9
            r0 = r12
            zg1 r0 = (defpackage.zg1) r0     // Catch: java.lang.Throwable -> L2ee
            z64 r0 = r0.l0     // Catch: java.lang.Throwable -> L2ee
            r6 = r2
        L2a3:
            if (r0 == 0) goto L2c6
            int r7 = r0.L     // Catch: java.lang.Throwable -> L2ee
            r7 = r7 & 8192(0x2000, float:1.148E-41)
            if (r7 == 0) goto L2c3
            int r6 = r6 + 1
            if (r6 != r5) goto L2b1
            r12 = r0
            goto L2c3
        L2b1:
            if (r14 != 0) goto L2ba
            ua4 r14 = new ua4     // Catch: java.lang.Throwable -> L2ee
            z64[] r7 = new defpackage.z64[r3]     // Catch: java.lang.Throwable -> L2ee
            r14.<init>(r7)     // Catch: java.lang.Throwable -> L2ee
        L2ba:
            if (r12 == 0) goto L2c0
            r14.b(r12)     // Catch: java.lang.Throwable -> L2ee
            r12 = r4
        L2c0:
            r14.b(r0)     // Catch: java.lang.Throwable -> L2ee
        L2c3:
            z64 r0 = r0.Y     // Catch: java.lang.Throwable -> L2ee
            goto L2a3
        L2c6:
            if (r6 != r5) goto L2c9
            goto L281
        L2c9:
            z64 r12 = defpackage.nc1.A(r14)     // Catch: java.lang.Throwable -> L2ee
            goto L281
        L2ce:
            if (r1 == 0) goto L2ea
            int r12 = r1.size()     // Catch: java.lang.Throwable -> L2ee
            r14 = r2
        L2d5:
            if (r14 >= r12) goto L2ea
            java.lang.Object r0 = r1.get(r14)     // Catch: java.lang.Throwable -> L2ee
            bh3 r0 = (defpackage.bh3) r0     // Catch: java.lang.Throwable -> L2ee
            boolean r0 = r0.B(r13)     // Catch: java.lang.Throwable -> L2ee
            if (r0 == 0) goto L2e7
            android.os.Trace.endSection()
            return r5
        L2e7:
            int r14 = r14 + 1
            goto L2d5
        L2ea:
            android.os.Trace.endSection()
            return r2
        L2ee:
            r12 = move-exception
            android.os.Trace.endSection()
            throw r12
    }

    public final java.lang.Boolean e(int r21, defpackage.of5 r22, defpackage.qn2 r23) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            vh2 r4 = r0.c
            vh2 r5 = defpackage.yh2.q(r4)
            r6 = 8
            r7 = 4
            r8 = 3
            r9 = 6
            r10 = 5
            r11 = 2
            r12 = 7
            te r13 = r0.b
            r16 = 0
            r17 = 0
            r15 = 1
            if (r5 == 0) goto L1bf
            kk3 r18 = r13.getLayoutDirection()
            ih2 r14 = r5.T0()
            if (r1 != r15) goto L2d
            nh2 r14 = r14.b
            goto Lc1
        L2d:
            if (r1 != r11) goto L33
            nh2 r14 = r14.c
            goto Lc1
        L33:
            if (r1 != r10) goto L39
            nh2 r14 = r14.d
            goto Lc1
        L39:
            if (r1 != r9) goto L3f
            nh2 r14 = r14.e
            goto Lc1
        L3f:
            if (r1 != r8) goto L64
            int[] r19 = defpackage.xh2.a
            int r18 = r18.ordinal()
            r9 = r19[r18]
            if (r9 == r15) goto L54
            if (r9 != r11) goto L50
            nh2 r9 = r14.i
            goto L56
        L50:
            defpackage.i.d()
            return r17
        L54:
            nh2 r9 = r14.h
        L56:
            nh2 r8 = defpackage.nh2.b
            if (r9 != r8) goto L5c
            r9 = r17
        L5c:
            if (r9 != 0) goto L62
            nh2 r14 = r14.f
            goto Lc1
        L62:
            r14 = r9
            goto Lc1
        L64:
            if (r1 != r7) goto L88
            int[] r8 = defpackage.xh2.a
            int r9 = r18.ordinal()
            r8 = r8[r9]
            if (r8 == r15) goto L79
            if (r8 != r11) goto L75
            nh2 r8 = r14.h
            goto L7b
        L75:
            defpackage.i.d()
            return r17
        L79:
            nh2 r8 = r14.i
        L7b:
            nh2 r9 = defpackage.nh2.b
            if (r8 != r9) goto L81
            r8 = r17
        L81:
            if (r8 != 0) goto L86
            nh2 r14 = r14.g
            goto Lc1
        L86:
            r14 = r8
            goto Lc1
        L88:
            if (r1 != r12) goto L8b
            goto L8d
        L8b:
            if (r1 != r6) goto L1b9
        L8d:
            mj0 r8 = new mj0
            r8.<init>(r1)
            zp4 r9 = defpackage.nc1.g0(r5)
            te r9 = (defpackage.te) r9
            ah2 r9 = r9.getFocusOwner()
            eh2 r9 = (defpackage.eh2) r9
            vh2 r6 = r9.f()
            if (r1 != r12) goto Laa
            hh2 r14 = r14.j
            r14.getClass()
            goto Laf
        Laa:
            qn2 r14 = r14.k
            r14.g(r8)
        Laf:
            boolean r8 = r8.b
            if (r8 == 0) goto Lb6
            nh2 r14 = defpackage.nh2.c
            goto Lc1
        Lb6:
            vh2 r8 = r9.f()
            if (r6 == r8) goto Lbf
            nh2 r14 = defpackage.nh2.d
            goto Lc1
        Lbf:
            nh2 r14 = defpackage.nh2.b
        Lc1:
            nh2 r6 = defpackage.nh2.c
            boolean r8 = defpackage.nb3.k(r14, r6)
            if (r8 == 0) goto Lcb
            goto L218
        Lcb:
            nh2 r8 = defpackage.nh2.d
            boolean r8 = defpackage.nb3.k(r14, r8)
            if (r8 == 0) goto Le0
            vh2 r0 = defpackage.yh2.q(r4)
            if (r0 == 0) goto L218
            java.lang.Object r0 = r3.g(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            return r0
        Le0:
            nh2 r8 = defpackage.nh2.b
            boolean r9 = defpackage.nb3.k(r14, r8)
            if (r9 != 0) goto L1c1
            java.lang.String r0 = "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n"
            if (r14 == r8) goto L1b5
            if (r14 == r6) goto L1b1
            ua4 r0 = r14.a
            int r1 = r0.L
            if (r1 != 0) goto Lfd
            java.lang.String r0 = "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n"
            java.io.PrintStream r1 = java.lang.System.out
            r1.println(r0)
            goto L1ac
        Lfd:
            java.lang.Object[] r0 = r0.A
            r2 = r16
            r4 = r2
        L102:
            if (r2 >= r1) goto L1aa
            r5 = r0[r2]
            ph2 r5 = (defpackage.ph2) r5
            r6 = r5
            z64 r6 = (defpackage.z64) r6
            z64 r6 = r6.A
            boolean r6 = r6.j0
            if (r6 != 0) goto L116
            java.lang.String r6 = "visitChildren called on an unattached node"
            defpackage.p53.c(r6)
        L116:
            ua4 r6 = new ua4
            r7 = 16
            z64[] r8 = new defpackage.z64[r7]
            r6.<init>(r8)
            z64 r5 = (defpackage.z64) r5
            z64 r5 = r5.A
            z64 r7 = r5.Y
            if (r7 != 0) goto L12b
            defpackage.nc1.z(r6, r5)
            goto L12e
        L12b:
            r6.b(r7)
        L12e:
            int r5 = r6.L
            if (r5 == 0) goto L1a6
            int r5 = r5 + (-1)
            java.lang.Object r5 = r6.l(r5)
            z64 r5 = (defpackage.z64) r5
            int r7 = r5.R
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 != 0) goto L144
            defpackage.nc1.z(r6, r5)
            goto L12e
        L144:
            if (r5 == 0) goto L12e
            int r7 = r5.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L1a3
            r7 = r17
        L14e:
            if (r5 == 0) goto L12e
            boolean r8 = r5 instanceof defpackage.vh2
            if (r8 == 0) goto L164
            vh2 r5 = (defpackage.vh2) r5
            java.lang.Object r5 = r3.g(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L19e
            r4 = r15
            goto L1a6
        L164:
            int r8 = r5.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L19e
            boolean r8 = r5 instanceof defpackage.zg1
            if (r8 == 0) goto L19e
            r8 = r5
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = r16
        L175:
            if (r8 == 0) goto L19b
            int r10 = r8.L
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L198
            int r9 = r9 + 1
            if (r9 != r15) goto L183
            r5 = r8
            goto L198
        L183:
            if (r7 != 0) goto L18e
            ua4 r7 = new ua4
            r10 = 16
            z64[] r11 = new defpackage.z64[r10]
            r7.<init>(r11)
        L18e:
            if (r5 == 0) goto L195
            r7.b(r5)
            r5 = r17
        L195:
            r7.b(r8)
        L198:
            z64 r8 = r8.Y
            goto L175
        L19b:
            if (r9 != r15) goto L19e
            goto L14e
        L19e:
            z64 r5 = defpackage.nc1.A(r7)
            goto L14e
        L1a3:
            z64 r5 = r5.Y
            goto L144
        L1a6:
            int r2 = r2 + 1
            goto L102
        L1aa:
            r16 = r4
        L1ac:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L1b1:
            defpackage.i.m(r0)
            return r17
        L1b5:
            defpackage.i.m(r0)
            return r17
        L1b9:
            java.lang.String r0 = "invalid FocusDirection"
            defpackage.i.m(r0)
            return r17
        L1bf:
            r5 = r17
        L1c1:
            kk3 r6 = r13.getLayoutDirection()
            ln r8 = new ln
            r8.<init>(r5, r0, r3, r10)
            if (r1 != r15) goto L1cd
            goto L1cf
        L1cd:
            if (r1 != r11) goto L1e7
        L1cf:
            if (r1 != r15) goto L1d6
            boolean r0 = defpackage.ej2.x(r4, r8)
            goto L1dc
        L1d6:
            if (r1 != r11) goto L1e1
            boolean r0 = defpackage.ej2.i(r4, r8)
        L1dc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L1e1:
            java.lang.String r0 = "This function should only be used for 1-D focus search"
            defpackage.i.m(r0)
            return r17
        L1e7:
            r0 = 3
            if (r1 != r0) goto L1eb
            goto L1f4
        L1eb:
            if (r1 != r7) goto L1ee
            goto L1f4
        L1ee:
            if (r1 != r10) goto L1f1
            goto L1f4
        L1f1:
            r3 = 6
            if (r1 != r3) goto L1f9
        L1f4:
            java.lang.Boolean r0 = defpackage.uj2.e0(r1, r8, r4, r2)
            return r0
        L1f9:
            if (r1 != r12) goto L219
            int[] r1 = defpackage.xh2.a
            int r3 = r6.ordinal()
            r1 = r1[r3]
            if (r1 == r15) goto L20d
            if (r1 != r11) goto L209
            r7 = r0
            goto L20d
        L209:
            defpackage.i.d()
            return r17
        L20d:
            vh2 r0 = defpackage.yh2.q(r4)
            if (r0 == 0) goto L218
            java.lang.Boolean r0 = defpackage.uj2.e0(r7, r8, r0, r2)
            return r0
        L218:
            return r17
        L219:
            r0 = 8
            if (r1 != r0) goto L2db
            vh2 r0 = defpackage.yh2.q(r4)
            if (r0 == 0) goto L2c6
            z64 r1 = r0.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L22e
            java.lang.String r1 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r1)
        L22e:
            z64 r1 = r0.A
            z64 r1 = r1.X
            sm3 r0 = defpackage.nc1.f0(r0)
        L236:
            if (r0 == 0) goto L2c6
            if0 r2 = r0.B0
            java.lang.Object r2 = r2.g
            z64 r2 = (defpackage.z64) r2
            int r2 = r2.R
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L2b0
        L244:
            if (r1 == 0) goto L2b0
            int r2 = r1.L
            r2 = r2 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L2ab
            r2 = r1
            r3 = r17
        L24f:
            if (r2 == 0) goto L2ab
            boolean r5 = r2 instanceof defpackage.vh2
            if (r5 == 0) goto L265
            vh2 r2 = (defpackage.vh2) r2
            ih2 r5 = r2.T0()
            boolean r5 = r5.a
            if (r5 == 0) goto L262
            r15 = r2
            goto L2c8
        L262:
            r7 = 16
            goto L2a6
        L265:
            int r5 = r2.L
            r5 = r5 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L262
            boolean r5 = r2 instanceof defpackage.zg1
            if (r5 == 0) goto L262
            r5 = r2
            zg1 r5 = (defpackage.zg1) r5
            z64 r5 = r5.l0
            r6 = r16
        L276:
            if (r5 == 0) goto L2a1
            int r7 = r5.L
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L283
            int r6 = r6 + 1
            if (r6 != r15) goto L286
            r2 = r5
        L283:
            r7 = 16
            goto L29e
        L286:
            if (r3 != 0) goto L292
            ua4 r3 = new ua4
            r7 = 16
            z64[] r9 = new defpackage.z64[r7]
            r3.<init>(r9)
            goto L294
        L292:
            r7 = 16
        L294:
            if (r2 == 0) goto L29b
            r3.b(r2)
            r2 = r17
        L29b:
            r3.b(r5)
        L29e:
            z64 r5 = r5.Y
            goto L276
        L2a1:
            r7 = 16
            if (r6 != r15) goto L2a6
            goto L24f
        L2a6:
            z64 r2 = defpackage.nc1.A(r3)
            goto L24f
        L2ab:
            r7 = 16
            z64 r1 = r1.X
            goto L244
        L2b0:
            r7 = 16
            sm3 r0 = r0.v()
            if (r0 == 0) goto L2c2
            if0 r1 = r0.B0
            if (r1 == 0) goto L2c2
            java.lang.Object r1 = r1.f
            vy6 r1 = (defpackage.vy6) r1
            goto L236
        L2c2:
            r1 = r17
            goto L236
        L2c6:
            r15 = r17
        L2c8:
            if (r15 == 0) goto L2d6
            if (r15 == r4) goto L2d6
            java.lang.Object r0 = r8.g(r15)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r16 = r0.booleanValue()
        L2d6:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r16)
            return r0
        L2db:
            java.lang.String r0 = "Focus search invoked with invalid FocusDirection "
            java.lang.String r1 = defpackage.qg2.a(r1)
            defpackage.u34.B(r1, r0)
            return r17
    }

    public final defpackage.vh2 f() {
            r2 = this;
            vh2 r2 = r2.h
            if (r2 == 0) goto La
            boolean r0 = r2.j0
            r1 = 1
            if (r0 != r1) goto La
            return r2
        La:
            r2 = 0
            return r2
    }

    public final boolean g(int r6, boolean r7) {
            r5 = this;
            dh5 r0 = new dh5
            r0.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.A = r1
            vh2 r1 = r5.f()
            te r2 = r5.a
            of5 r2 = r2.getEmbeddedViewFocusRect()
            dh2 r3 = new dh2
            r3.<init>(r6, r0)
            java.lang.Boolean r2 = r5.e(r6, r2, r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r3 = defpackage.nb3.k(r2, r3)
            r4 = 1
            if (r3 == 0) goto L2c
            vh2 r3 = r5.f()
            if (r1 == r3) goto L2c
            goto L68
        L2c:
            r1 = 0
            if (r2 == 0) goto L69
            java.lang.Object r3 = r0.A
            if (r3 != 0) goto L34
            goto L69
        L34:
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L45
            java.lang.Object r0 = r0.A
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L45
            goto L68
        L45:
            if (r6 != r4) goto L48
            goto L4b
        L48:
            r0 = 2
            if (r6 != r0) goto L69
        L4b:
            if (r7 == 0) goto L69
            boolean r7 = r5.b(r6, r1, r1)
            if (r7 == 0) goto L69
            qe r7 = new qe
            r0 = 3
            r7.<init>(r6, r0)
            r0 = 0
            java.lang.Boolean r5 = r5.e(r6, r0, r7)
            if (r5 == 0) goto L65
            boolean r5 = r5.booleanValue()
            goto L66
        L65:
            r5 = r1
        L66:
            if (r5 == 0) goto L69
        L68:
            return r4
        L69:
            return r1
    }

    public final boolean h(int r4) {
            r3 = this;
            r0 = 0
            boolean r1 = r3.b(r4, r0, r0)
            if (r1 != 0) goto L8
            return r0
        L8:
            qe r1 = new qe
            r2 = 2
            r1.<init>(r4, r2)
            r2 = 0
            java.lang.Boolean r4 = r3.e(r4, r2, r1)
            if (r4 == 0) goto L19
            boolean r0 = r4.booleanValue()
        L19:
            if (r0 != 0) goto L1e
            r3.c()
        L1e:
            return r0
    }

    public final void i(defpackage.vh2 r5) {
            r4 = this;
            vh2 r0 = r4.h
            r4.h = r5
            ca4 r4 = r4.g
            java.lang.Object[] r1 = r4.a
            int r4 = r4.b
            r2 = 0
        Lb:
            if (r2 >= r4) goto L17
            r3 = r1[r2]
            yg2 r3 = (defpackage.yg2) r3
            r3.a(r0, r5)
            int r2 = r2 + 1
            goto Lb
        L17:
            return
    }

    public final boolean j(android.view.KeyEvent r40) {
            r39 = this;
            r0 = r39
            long r1 = defpackage.xk2.m(r40)
            int r3 = defpackage.xk2.u(r40)
            r4 = 2
            r10 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            r15 = 0
            r17 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            r19 = 254(0xfe, double:1.255E-321)
            r40 = 6
            r5 = 8
            r21 = 0
            r22 = 1
            r6 = 3
            r7 = 1
            if (r3 != r4) goto L2d4
            v94 r3 = r0.f
            if (r3 != 0) goto L2e
            v94 r3 = new v94
            r3.<init>(r6)
            r0.f = r3
        L2e:
            r4 = r3
            int r0 = java.lang.Long.hashCode(r1)
            int r0 = r0 * r10
            int r3 = r0 << 16
            r0 = r0 ^ r3
            int r3 = r0 >>> 7
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r24 = r6
            int r6 = r4.c
            r25 = r3 & r6
            r26 = r21
            r27 = 63
        L45:
            long[] r8 = r4.a
            int r28 = r25 >> 3
            r29 = r25 & 7
            r30 = 7
            int r9 = r29 << 3
            r31 = r8[r28]
            long r31 = r31 >>> r9
            int r28 = r28 + 1
            r28 = r8[r28]
            int r8 = 64 - r9
            long r28 = r28 << r8
            long r8 = (long) r9
            long r8 = -r8
            long r8 = r8 >> r27
            long r8 = r28 & r8
            long r8 = r31 | r8
            r28 = r10
            r31 = 255(0xff, double:1.26E-321)
            long r10 = (long) r0
            long r33 = r10 * r17
            r35 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r8 ^ r33
            long r33 = r13 - r17
            long r12 = ~r13
            long r12 = r33 & r12
            long r12 = r12 & r35
        L78:
            int r14 = (r12 > r15 ? 1 : (r12 == r15 ? 0 : -1))
            if (r14 == 0) goto L99
            int r14 = java.lang.Long.numberOfTrailingZeros(r12)
            int r14 = r14 >> 3
            int r14 = r25 + r14
            r14 = r14 & r6
            r33 = r15
            long[] r15 = r4.b
            r37 = r15[r14]
            int r15 = (r37 > r1 ? 1 : (r37 == r1 ? 0 : -1))
            if (r15 != 0) goto L93
            r37 = r7
            goto L2bf
        L93:
            long r14 = r12 - r22
            long r12 = r12 & r14
            r15 = r33
            goto L78
        L99:
            r33 = r15
            long r12 = ~r8
            long r12 = r12 << r40
            long r8 = r8 & r12
            long r8 = r8 & r35
            int r8 = (r8 > r33 ? 1 : (r8 == r33 ? 0 : -1))
            if (r8 == 0) goto L2c4
            int r0 = r4.b(r3)
            int r6 = r4.e
            if (r6 != 0) goto Lbe
            long[] r6 = r4.a
            int r12 = r0 >> 3
            r12 = r6[r12]
            r6 = r0 & 7
            int r6 = r6 << 3
            long r12 = r12 >> r6
            long r12 = r12 & r31
            int r6 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r6 != 0) goto Lc4
        Lbe:
            r37 = r7
            r39 = 128(0x80, double:6.3E-322)
            goto L289
        Lc4:
            int r0 = r4.c
            if (r0 <= r5) goto L206
            int r6 = r4.d
            long r12 = (long) r6
            r14 = 32
            long r12 = r12 * r14
            long r14 = (long) r0
            r16 = 25
            long r14 = r14 * r16
            r16 = -9223372036854775808
            long r12 = r12 ^ r16
            long r14 = r14 ^ r16
            int r0 = java.lang.Long.compare(r12, r14)
            if (r0 > 0) goto L206
            long[] r0 = r4.a
            int r6 = r4.c
            long[] r12 = r4.b
            int r13 = r6 + 7
            int r13 = r13 >> 3
            r14 = r21
        Leb:
            if (r14 >= r13) goto L108
            r22 = r0[r14]
            r39 = 128(0x80, double:6.3E-322)
            long r8 = r22 & r35
            r15 = r5
            r18 = r6
            long r5 = ~r8
            long r8 = r8 >>> r30
            long r5 = r5 + r8
            r8 = -72340172838076674(0xfefefefefefefefe, double:-5.3140103725178076E303)
            long r5 = r5 & r8
            r0[r14] = r5
            int r14 = r14 + 1
            r5 = r15
            r6 = r18
            goto Leb
        L108:
            r15 = r5
            r18 = r6
            r39 = 128(0x80, double:6.3E-322)
            int r5 = defpackage.fv.H0(r0)
            int r6 = r5 + (-1)
            r8 = r0[r6]
            r13 = 72057594037927935(0xffffffffffffff, double:7.291122019556397E-304)
            long r8 = r8 & r13
            r22 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r8 = r8 | r22
            r0[r6] = r8
            r8 = r0[r21]
            r0[r5] = r8
            r5 = r18
            r6 = r21
        L129:
            if (r6 == r5) goto L1f6
            int r8 = r6 >> 3
            r22 = r0[r8]
            r9 = r6 & 7
            int r9 = r9 << 3
            long r22 = r22 >> r9
            long r22 = r22 & r31
            int r18 = (r22 > r39 ? 1 : (r22 == r39 ? 0 : -1))
            if (r18 != 0) goto L13e
        L13b:
            int r6 = r6 + 1
            goto L129
        L13e:
            int r18 = (r22 > r19 ? 1 : (r22 == r19 ? 0 : -1))
            if (r18 == 0) goto L143
            goto L13b
        L143:
            r22 = r12[r6]
            int r18 = java.lang.Long.hashCode(r22)
            int r18 = r18 * r28
            int r22 = r18 << 16
            r18 = r18 ^ r22
            r22 = r13
            int r13 = r18 >>> 7
            int r14 = r4.b(r13)
            r13 = r13 & r5
            int r25 = r14 - r13
            r25 = r25 & r5
            r29 = r15
            int r15 = r25 / 8
            int r13 = r6 - r13
            r13 = r13 & r5
            int r13 = r13 / 8
            if (r15 != r13) goto L18a
            r13 = r18 & 127(0x7f, float:1.78E-43)
            long r13 = (long) r13
            r25 = r0[r8]
            r15 = r7
            r27 = r8
            long r7 = r31 << r9
            long r7 = ~r7
            long r7 = r25 & r7
            long r13 = r13 << r9
            long r7 = r7 | r13
            r0[r27] = r7
            int r7 = r0.length
            int r7 = r7 - r15
            r8 = r0[r21]
            long r8 = r8 & r22
            long r8 = r8 | r16
            r0[r7] = r8
            int r6 = r6 + 1
            r7 = r15
            r13 = r22
            r15 = r29
            goto L129
        L18a:
            r15 = r7
            r27 = r8
            int r7 = r14 >> 3
            r25 = r0[r7]
            r8 = r14 & 7
            int r8 = r8 << 3
            long r35 = r25 >> r8
            long r35 = r35 & r31
            int r13 = (r35 > r39 ? 1 : (r35 == r39 ? 0 : -1))
            if (r13 != 0) goto L1c5
            r13 = r18 & 127(0x7f, float:1.78E-43)
            r35 = r5
            r36 = r6
            long r5 = (long) r13
            r37 = r5
            long r5 = r31 << r8
            long r5 = ~r5
            long r5 = r25 & r5
            long r25 = r37 << r8
            long r5 = r5 | r25
            r0[r7] = r5
            r5 = r0[r27]
            long r7 = r31 << r9
            long r7 = ~r7
            long r5 = r5 & r7
            long r7 = r39 << r9
            long r5 = r5 | r7
            r0[r27] = r5
            r5 = r12[r36]
            r12[r14] = r5
            r12[r36] = r33
            r6 = r36
            goto L1e2
        L1c5:
            r35 = r5
            r36 = r6
            r5 = r18 & 127(0x7f, float:1.78E-43)
            long r5 = (long) r5
            r37 = r5
            long r5 = r31 << r8
            long r5 = ~r5
            long r5 = r25 & r5
            long r8 = r37 << r8
            long r5 = r5 | r8
            r0[r7] = r5
            r5 = r12[r14]
            r7 = r12[r36]
            r12[r14] = r7
            r12[r36] = r5
            int r6 = r36 + (-1)
        L1e2:
            int r5 = r0.length
            int r5 = r5 - r15
            r7 = r0[r21]
            long r7 = r7 & r22
            long r7 = r7 | r16
            r0[r5] = r7
            int r6 = r6 + r15
            r7 = r15
            r13 = r22
            r15 = r29
            r5 = r35
            goto L129
        L1f6:
            r15 = r7
            int r0 = r4.c
            int r0 = defpackage.b66.a(r0)
            int r5 = r4.d
            int r0 = r0 - r5
            r4.e = r0
        L202:
            r37 = r15
            goto L285
        L206:
            r15 = r7
            r39 = 128(0x80, double:6.3E-322)
            int r0 = r4.c
            int r0 = defpackage.b66.b(r0)
            long[] r5 = r4.a
            long[] r6 = r4.b
            int r7 = r4.c
            r4.c(r0)
            long[] r0 = r4.a
            long[] r8 = r4.b
            int r9 = r4.c
            r12 = r21
        L220:
            if (r12 >= r7) goto L202
            int r13 = r12 >> 3
            r13 = r5[r13]
            r16 = r12 & 7
            int r16 = r16 << 3
            long r13 = r13 >> r16
            long r13 = r13 & r31
            int r13 = (r13 > r39 ? 1 : (r13 == r39 ? 0 : -1))
            if (r13 >= 0) goto L272
            r13 = r6[r12]
            int r16 = java.lang.Long.hashCode(r13)
            int r16 = r16 * r28
            int r17 = r16 << 16
            r16 = r16 ^ r17
            r37 = r15
            int r15 = r16 >>> 7
            int r15 = r4.b(r15)
            r17 = r0
            r0 = r16 & 127(0x7f, float:1.78E-43)
            r16 = r5
            r18 = r6
            long r5 = (long) r0
            int r0 = r15 >> 3
            r19 = r15 & 7
            int r19 = r19 << 3
            r22 = r17[r0]
            r25 = r5
            long r5 = r31 << r19
            long r5 = ~r5
            long r5 = r22 & r5
            long r19 = r25 << r19
            long r5 = r5 | r19
            r17[r0] = r5
            int r0 = r15 + (-7)
            r0 = r0 & r9
            r19 = r9 & 7
            int r0 = r0 + r19
            int r0 = r0 >> 3
            r17[r0] = r5
            r8[r15] = r13
            goto L27a
        L272:
            r17 = r0
            r16 = r5
            r18 = r6
            r37 = r15
        L27a:
            int r12 = r12 + 1
            r5 = r16
            r0 = r17
            r6 = r18
            r15 = r37
            goto L220
        L285:
            int r0 = r4.b(r3)
        L289:
            r14 = r0
            int r0 = r4.d
            int r0 = r0 + 1
            r4.d = r0
            int r0 = r4.e
            long[] r3 = r4.a
            int r5 = r14 >> 3
            r6 = r3[r5]
            r8 = r14 & 7
            int r8 = r8 << 3
            long r12 = r6 >> r8
            long r12 = r12 & r31
            int r9 = (r12 > r39 ? 1 : (r12 == r39 ? 0 : -1))
            if (r9 != 0) goto L2a6
            r21 = r37
        L2a6:
            int r0 = r0 - r21
            r4.e = r0
            int r0 = r4.c
            long r12 = r31 << r8
            long r12 = ~r12
            long r6 = r6 & r12
            long r8 = r10 << r8
            long r6 = r6 | r8
            r3[r5] = r6
            int r5 = r14 + (-7)
            r5 = r5 & r0
            r0 = r0 & 7
            int r5 = r5 + r0
            int r0 = r5 >> 3
            r3[r0] = r6
        L2bf:
            long[] r0 = r4.b
            r0[r14] = r1
            return r37
        L2c4:
            r29 = r5
            r37 = r7
            int r26 = r26 + 8
            int r25 = r25 + r26
            r25 = r25 & r6
            r10 = r28
            r15 = r33
            goto L45
        L2d4:
            r29 = r5
            r24 = r6
            r28 = r10
            r33 = r15
            r27 = 63
            r30 = 7
            r31 = 255(0xff, double:1.26E-321)
            r35 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r15 = r7
            if (r3 != r15) goto L383
            v94 r3 = r0.f
            if (r3 == 0) goto L382
            boolean r3 = r3.a(r1)
            if (r3 != r15) goto L382
            v94 r0 = r0.f
            if (r0 == 0) goto L37a
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 * r28
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.c
            int r3 = r3 >>> 7
        L307:
            r3 = r3 & r5
            long[] r6 = r0.a
            int r7 = r3 >> 3
            r8 = r3 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r15 = 1
            int r7 = r7 + r15
            r11 = r6[r7]
            int r6 = 64 - r8
            long r6 = r11 << r6
            long r11 = (long) r8
            long r11 = -r11
            long r11 = r11 >> r27
            long r6 = r6 & r11
            long r6 = r6 | r9
            long r8 = (long) r4
            long r8 = r8 * r17
            long r8 = r8 ^ r6
            long r10 = r8 - r17
            long r8 = ~r8
            long r8 = r8 & r10
            long r8 = r8 & r35
        L32b:
            int r10 = (r8 > r33 ? 1 : (r8 == r33 ? 0 : -1))
            if (r10 == 0) goto L344
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r3
            r10 = r10 & r5
            long[] r11 = r0.b
            r12 = r11[r10]
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r11 != 0) goto L340
            goto L34f
        L340:
            long r10 = r8 - r22
            long r8 = r8 & r10
            goto L32b
        L344:
            long r8 = ~r6
            long r8 = r8 << r40
            long r6 = r6 & r8
            long r6 = r6 & r35
            int r6 = (r6 > r33 ? 1 : (r6 == r33 ? 0 : -1))
            if (r6 == 0) goto L37c
            r10 = -1
        L34f:
            if (r10 < 0) goto L37a
            int r1 = r0.d
            r15 = 1
            int r1 = r1 - r15
            r0.d = r1
            long[] r1 = r0.a
            int r0 = r0.c
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r1[r2]
            long r6 = r31 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            long r6 = r19 << r3
            long r3 = r4 | r6
            r1[r2] = r3
            int r10 = r10 + (-7)
            r2 = r10 & r0
            r0 = r0 & 7
            int r2 = r2 + r0
            int r0 = r2 >> 3
            r1[r0] = r3
            r15 = 1
            return r15
        L37a:
            r15 = 1
            goto L383
        L37c:
            r15 = 1
            int r21 = r21 + 8
            int r3 = r3 + r21
            goto L307
        L382:
            return r21
        L383:
            return r15
    }
}
