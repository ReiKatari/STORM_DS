package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd5  reason: default package */
/* loaded from: classes.dex */
public abstract class kd5 {
    public static final float a = 0.0f;

    static {
            r0 = 1073741824(0x40000000, float:2.0)
            r1 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 / r0
            defpackage.kd5.a = r1
            return
    }

    public static final void a(boolean r16, defpackage.on2 r17, defpackage.a74 r18, boolean r19, defpackage.ve1 r20, defpackage.px0 r21, int r22, int r23) {
            r1 = r16
            r2 = r17
            r6 = r21
            xq2 r6 = (defpackage.xq2) r6
            r0 = 1314435585(0x4e58b201, float:9.088861E8)
            r6.d0(r0)
            boolean r0 = r6.g(r1)
            if (r0 == 0) goto L16
            r0 = 4
            goto L17
        L16:
            r0 = 2
        L17:
            r0 = r22 | r0
            r3 = r22 & 48
            if (r3 != 0) goto L29
            boolean r3 = r6.h(r2)
            if (r3 == 0) goto L26
            r3 = 32
            goto L28
        L26:
            r3 = 16
        L28:
            r0 = r0 | r3
        L29:
            r0 = r0 | 28032(0x6d80, float:3.9281E-41)
            r3 = r23 & 32
            if (r3 != 0) goto L3a
            r3 = r20
            boolean r4 = r6.f(r3)
            if (r4 == 0) goto L3c
            r4 = 131072(0x20000, float:1.83671E-40)
            goto L3e
        L3a:
            r3 = r20
        L3c:
            r4 = 65536(0x10000, float:9.1835E-41)
        L3e:
            r0 = r0 | r4
            r4 = 74899(0x12493, float:1.04956E-40)
            r4 = r4 & r0
            r5 = 74898(0x12492, float:1.04954E-40)
            r12 = 1
            r13 = 0
            if (r4 == r5) goto L4c
            r4 = r12
            goto L4d
        L4c:
            r4 = r13
        L4d:
            r0 = r0 & r12
            boolean r0 = r6.S(r0, r4)
            if (r0 == 0) goto L148
            r6.X()
            r0 = r22 & 1
            r4 = r0
            x64 r0 = defpackage.x64.a
            if (r4 == 0) goto L6f
            boolean r4 = r6.B()
            if (r4 == 0) goto L65
            goto L6f
        L65:
            r6.V()
            r9 = r18
            r12 = r19
            r14 = r3
            r7 = r6
            goto L84
        L6f:
            r4 = r23 & 32
            if (r4 == 0) goto L82
            r8 = 3072(0xc00, float:4.305E-42)
            r9 = 7
            r3 = 0
            r7 = r6
            r5 = 0
            ve1 r3 = defpackage.jx2.n(r3, r5, r7, r8, r9)
        L7f:
            r9 = r0
            r14 = r3
            goto L84
        L82:
            r7 = r6
            goto L7f
        L84:
            r7.q()
            if (r1 == 0) goto L8c
            r3 = 1086324736(0x40c00000, float:6.0)
            goto L8d
        L8c:
            r3 = 0
        L8d:
            r4 = 100
            r5 = 0
            r6 = 6
            sc7 r8 = defpackage.ge7.Y(r4, r13, r5, r6)
            r15 = 12
            r10 = 48
            pp6 r10 = defpackage.in.a(r3, r8, r7, r10, r15)
            r14.getClass()
            r3 = 1243421834(0x4a1d1c8a, float:2574114.5)
            r7.b0(r3)
            if (r12 != 0) goto Lad
            r18 = r12
            long r11 = r14.c
            goto Lb6
        Lad:
            r18 = r12
            if (r1 != 0) goto Lb4
            long r11 = r14.b
            goto Lb6
        Lb4:
            long r11 = r14.a
        Lb6:
            if (r18 == 0) goto Ld2
            r3 = -1312667467(0xffffffffb1c248b5, float:-5.654409E-9)
            r7.b0(r3)
            sc7 r5 = defpackage.ge7.Y(r4, r13, r5, r6)
            r6 = r7
            r7 = 48
            r8 = 12
            r3 = r11
            pp6 r3 = defpackage.ti6.a(r3, r5, r6, r7, r8)
            r7 = r6
            r7.p(r13)
        Ld0:
            r6 = r3
            goto Le6
        Ld2:
            r3 = r11
            r5 = -1312564764(0xffffffffb1c3d9e4, float:-5.7000182E-9)
            r7.b0(r5)
            kt0 r5 = new kt0
            r5.<init>(r3)
            qa4 r3 = defpackage.np2.b0(r5, r7)
            r7.p(r13)
            goto Ld0
        Le6:
            r7.p(r13)
            if (r2 == 0) goto L101
            r3 = 0
            r15 = 4
            kq5 r3 = defpackage.jq5.a(r15, r3, r13)
            mq5 r4 = new mq5
            r5 = 3
            r4.<init>(r5)
            r5 = r2
            r2 = r3
            r3 = r18
            a74 r2 = defpackage.g04.O(r0, r1, r2, r3, r4, r5)
            goto L104
        L101:
            r3 = r18
            r2 = r0
        L104:
            if (r17 == 0) goto L10a
            nq6 r0 = defpackage.u93.a
            m64 r0 = defpackage.m64.a
        L10a:
            a74 r0 = r9.d(r0)
            a74 r0 = r0.d(r2)
            e40 r1 = defpackage.d90.Z
            r2 = 2
            a74 r0 = defpackage.dj6.n(r0, r1, r2)
            r1 = 1073741824(0x40000000, float:2.0)
            a74 r0 = defpackage.ge7.O(r0, r1)
            a74 r0 = defpackage.dj6.g(r0)
            boolean r1 = r7.f(r6)
            boolean r2 = r7.f(r10)
            r1 = r1 | r2
            java.lang.Object r2 = r7.P()
            if (r1 != 0) goto L136
            vs0 r1 = defpackage.ox0.a
            if (r2 != r1) goto L13f
        L136:
            qk4 r2 = new qk4
            r1 = 7
            r2.<init>(r1, r6, r10)
            r7.l0(r2)
        L13f:
            qn2 r2 = (defpackage.qn2) r2
            defpackage.ak7.j(r0, r2, r7, r13)
            r4 = r3
            r3 = r9
            r5 = r14
            goto L151
        L148:
            r7 = r6
            r7.V()
            r4 = r19
            r5 = r3
            r3 = r18
        L151:
            cf5 r9 = r7.t()
            if (r9 == 0) goto L167
            jd5 r0 = new jd5
            r8 = 0
            r1 = r16
            r2 = r17
            r6 = r22
            r7 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.d = r0
        L167:
            return
    }
}
