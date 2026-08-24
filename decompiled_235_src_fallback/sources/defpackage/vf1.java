package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf1  reason: default package */
/* loaded from: classes.dex */
public abstract class vf1 {
    public static final defpackage.g05 a = null;

    static {
            g05 r0 = new g05
            r1 = 30
            r2 = 1
            r1 = r1 & r2
            r3 = 0
            if (r1 == 0) goto Lb
            r1 = r3
            goto Lc
        Lb:
            r1 = r2
        Lc:
            y86 r4 = defpackage.y86.Inherit
            r0.<init>(r1, r4, r2, r3)
            defpackage.vf1.a = r0
            return
    }

    public static final void a(defpackage.x07 r6, defpackage.l07 r7, defpackage.px0 r8, int r9) {
            r3 = r8
            xq2 r3 = (defpackage.xq2) r3
            r8 = 1904307118(0x71816bae, float:1.2817198E30)
            r3.d0(r8)
            boolean r8 = r3.f(r6)
            r0 = 4
            if (r8 == 0) goto L12
            r8 = r0
            goto L13
        L12:
            r8 = 2
        L13:
            r8 = r8 | r9
            boolean r1 = r3.h(r7)
            if (r1 == 0) goto L1d
            r1 = 32
            goto L1f
        L1d:
            r1 = 16
        L1f:
            r8 = r8 | r1
            r1 = r8 & 19
            r2 = 18
            r4 = 1
            r5 = 0
            if (r1 == r2) goto L2a
            r1 = r4
            goto L2b
        L2a:
            r1 = r5
        L2b:
            r2 = r8 & 1
            boolean r1 = r3.S(r2, r1)
            if (r1 == 0) goto L84
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L4b
            r1 = -1009482584(0xffffffffc3d484a8, float:-425.03638)
            r3.b0(r1)
            nq6 r1 = defpackage.kf.b
            java.lang.Object r1 = r3.j(r1)
            android.content.Context r1 = (android.content.Context) r1
            r3.p(r5)
            goto L55
        L4b:
            r1 = -1009433480(0xffffffffc3d54478, float:-426.5349)
            r3.b0(r1)
            r3.p(r5)
            r1 = 0
        L55:
            boolean r2 = r3.h(r7)
            r8 = r8 & 14
            if (r8 == r0) goto L5e
            r4 = r5
        L5e:
            r8 = r2 | r4
            boolean r0 = r3.h(r1)
            r8 = r8 | r0
            java.lang.Object r0 = r3.P()
            if (r8 != 0) goto L6f
            vs0 r8 = defpackage.ox0.a
            if (r0 != r8) goto L79
        L6f:
            t00 r0 = new t00
            r8 = 8
            r0.<init>(r7, r1, r6, r8)
            r3.l0(r0)
        L79:
            r2 = r0
            qn2 r2 = (defpackage.qn2) r2
            r4 = 0
            r5 = 3
            r0 = 0
            r1 = 0
            defpackage.n41.b(r0, r1, r2, r3, r4, r5)
            goto L87
        L84:
            r3.V()
        L87:
            cf5 r8 = r3.t()
            if (r8 == 0) goto L96
            ql1 r0 = new ql1
            r1 = 11
            r0.<init>(r6, r9, r1, r7)
            r8.d = r0
        L96:
            return
    }

    public static final void b(int r20, long r21, defpackage.px0 r23, int r24) {
            r2 = r21
            r0 = r23
            xq2 r0 = (defpackage.xq2) r0
            r1 = -1240244237(0xffffffffb6135ff3, float:-2.1960557E-6)
            r0.d0(r1)
            r1 = r24 & 6
            r4 = 4
            if (r1 != 0) goto L1f
            r1 = r20
            boolean r5 = r0.d(r1)
            if (r5 == 0) goto L1b
            r5 = r4
            goto L1c
        L1b:
            r5 = 2
        L1c:
            r5 = r24 | r5
            goto L23
        L1f:
            r1 = r20
            r5 = r24
        L23:
            r6 = r24 & 48
            r7 = 32
            if (r6 != 0) goto L34
            boolean r6 = r0.e(r2)
            if (r6 == 0) goto L31
            r6 = r7
            goto L33
        L31:
            r6 = 16
        L33:
            r5 = r5 | r6
        L34:
            r6 = r5 & 19
            r8 = 18
            r9 = 1
            r10 = 0
            if (r6 == r8) goto L3e
            r6 = r9
            goto L3f
        L3e:
            r6 = r10
        L3f:
            r8 = r5 & 1
            boolean r6 = r0.S(r8, r6)
            if (r6 == 0) goto Ld0
            nq6 r6 = defpackage.kf.b
            java.lang.Object r6 = r0.j(r6)
            android.content.Context r6 = (android.content.Context) r6
            boolean r8 = r0.f(r6)
            r11 = r5 & 14
            if (r11 != r4) goto L59
            r4 = r9
            goto L5a
        L59:
            r4 = r10
        L5a:
            r4 = r4 | r8
            java.lang.Object r8 = r0.P()
            r11 = -1
            vs0 r12 = defpackage.ox0.a
            if (r4 != 0) goto L66
            if (r8 != r12) goto L79
        L66:
            int[] r4 = new int[]{r1}
            android.content.res.TypedArray r4 = r6.obtainStyledAttributes(r4)
            int r4 = r4.getResourceId(r10, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            r0.l0(r8)
        L79:
            java.lang.Number r8 = (java.lang.Number) r8
            int r4 = r8.intValue()
            if (r4 != r11) goto L92
            cf5 r6 = r0.t()
            if (r6 == 0) goto Le4
            tf1 r0 = new tf1
            r5 = 1
            r4 = r24
            r0.<init>(r1, r2, r4, r5)
        L8f:
            r6.d = r0
            return
        L92:
            sr4 r14 = defpackage.kj2.R(r0, r4)
            r1 = r5 & 112(0x70, float:1.57E-43)
            if (r1 != r7) goto L9b
            goto L9c
        L9b:
            r9 = r10
        L9c:
            java.lang.Object r1 = r0.P()
            if (r9 != 0) goto La4
            if (r1 != r12) goto Lb5
        La4:
            r4 = 16
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto Lac
            r1 = 0
            goto Lb2
        Lac:
            z40 r1 = new z40
            r4 = 5
            r1.<init>(r4, r2)
        Lb2:
            r0.l0(r1)
        Lb5:
            r18 = r1
            z40 r18 = (defpackage.z40) r18
            x64 r1 = defpackage.x64.a
            float r4 = defpackage.l41.e
            a74 r13 = defpackage.dj6.i(r1, r4)
            r17 = 0
            r19 = 22
            r15 = 0
            w31 r16 = defpackage.y31.b
            a74 r1 = defpackage.ak7.u0(r13, r14, r15, r16, r17, r18, r19)
            defpackage.h70.a(r1, r0, r10)
            goto Ld3
        Ld0:
            r0.V()
        Ld3:
            cf5 r6 = r0.t()
            if (r6 == 0) goto Le4
            tf1 r0 = new tf1
            r5 = 0
            r1 = r20
            r4 = r24
            r0.<init>(r1, r2, r4, r5)
            goto L8f
        Le4:
            return
    }

    public static final void c(defpackage.x07 r9, defpackage.m07 r10, defpackage.on2 r11, defpackage.px0 r12, int r13) {
            r4 = r12
            xq2 r4 = (defpackage.xq2) r4
            r12 = -2040393164(0xffffffff86621234, float:-4.251925E-35)
            r4.d0(r12)
            r12 = r13 & 6
            r0 = 4
            if (r12 != 0) goto L22
            r12 = r13 & 8
            if (r12 != 0) goto L17
            boolean r12 = r4.f(r9)
            goto L1b
        L17:
            boolean r12 = r4.h(r9)
        L1b:
            if (r12 == 0) goto L1f
            r12 = r0
            goto L20
        L1f:
            r12 = 2
        L20:
            r12 = r12 | r13
            goto L23
        L22:
            r12 = r13
        L23:
            r1 = r13 & 48
            r2 = 32
            if (r1 != 0) goto L3d
            r1 = r13 & 64
            if (r1 != 0) goto L32
            boolean r1 = r4.f(r10)
            goto L36
        L32:
            boolean r1 = r4.h(r10)
        L36:
            if (r1 == 0) goto L3a
            r1 = r2
            goto L3c
        L3a:
            r1 = 16
        L3c:
            r12 = r12 | r1
        L3d:
            r1 = r13 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L4d
            boolean r1 = r4.h(r11)
            if (r1 == 0) goto L4a
            r1 = 256(0x100, float:3.59E-43)
            goto L4c
        L4a:
            r1 = 128(0x80, float:1.8E-43)
        L4c:
            r12 = r12 | r1
        L4d:
            r1 = r12 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            r5 = 0
            r6 = 1
            if (r1 == r3) goto L57
            r1 = r6
            goto L58
        L57:
            r1 = r5
        L58:
            r3 = r12 & 1
            boolean r1 = r4.S(r3, r1)
            if (r1 == 0) goto Lce
            r1 = r12 & 112(0x70, float:1.57E-43)
            if (r1 == r2) goto L71
            r1 = r12 & 64
            if (r1 == 0) goto L6f
            boolean r1 = r4.f(r10)
            if (r1 == 0) goto L6f
            goto L71
        L6f:
            r1 = r5
            goto L72
        L71:
            r1 = r6
        L72:
            java.lang.Object r2 = r4.P()
            vs0 r3 = defpackage.ox0.a
            if (r1 != 0) goto L7c
            if (r2 != r3) goto L90
        L7c:
            h04 r2 = new h04
            j41 r1 = new j41
            q6 r7 = new q6
            r8 = 23
            r7.<init>(r8, r10, r11)
            r1.<init>(r7)
            r2.<init>(r1)
            r4.l0(r2)
        L90:
            h04 r2 = (defpackage.h04) r2
            r1 = r12 & 14
            if (r1 == r0) goto La0
            r12 = r12 & 8
            if (r12 == 0) goto La1
            boolean r12 = r4.h(r9)
            if (r12 == 0) goto La1
        La0:
            r5 = r6
        La1:
            java.lang.Object r12 = r4.P()
            if (r5 != 0) goto La9
            if (r12 != r3) goto Lb3
        La9:
            a5 r12 = new a5
            r0 = 24
            r12.<init>(r9, r0)
            r4.l0(r12)
        Lb3:
            r1 = r12
            on2 r1 = (defpackage.on2) r1
            ql1 r12 = new ql1
            r0 = 10
            r12.<init>(r0, r10, r9)
            r0 = 1315155414(0x4e63add6, float:9.5495514E8)
            zv0 r3 = defpackage.n16.I(r0, r12, r4)
            r5 = 3456(0xd80, float:4.843E-42)
            r6 = 0
            r0 = r2
            g05 r2 = defpackage.vf1.a
            defpackage.ak.a(r0, r1, r2, r3, r4, r5, r6)
            goto Ld1
        Lce:
            r4.V()
        Ld1:
            cf5 r12 = r4.t()
            if (r12 == 0) goto Le4
            rl r0 = new rl
            r5 = 8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            r12.d = r0
        Le4:
            return
    }

    public static final void d(defpackage.a74 r4, defpackage.zv0 r5, defpackage.px0 r6, int r7) {
            xq2 r6 = (defpackage.xq2) r6
            r0 = 1392105195(0x52f9d6eb, float:5.365263E11)
            r6.d0(r0)
            r0 = r7 & 6
            r1 = 2
            if (r0 != 0) goto L18
            boolean r0 = r6.f(r4)
            if (r0 == 0) goto L15
            r0 = 4
            goto L16
        L15:
            r0 = r1
        L16:
            r0 = r0 | r7
            goto L19
        L18:
            r0 = r7
        L19:
            r2 = r7 & 48
            if (r2 != 0) goto L29
            boolean r2 = r6.h(r5)
            if (r2 == 0) goto L26
            r2 = 32
            goto L28
        L26:
            r2 = 16
        L28:
            r0 = r0 | r2
        L29:
            r2 = r0 & 19
            r3 = 18
            if (r2 == r3) goto L31
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            r3 = r0 & 1
            boolean r2 = r6.S(r3, r2)
            if (r2 == 0) goto L49
            py0 r2 = defpackage.v07.a
            r3 = r0 & 14
            r3 = r3 | 432(0x1b0, float:6.05E-43)
            int r0 = r0 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            defpackage.nc1.v(r4, r2, r5, r6, r0)
            goto L4c
        L49:
            r6.V()
        L4c:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L59
            im r0 = new im
            r0.<init>(r4, r5, r7, r1)
            r6.d = r0
        L59:
            return
    }
}
