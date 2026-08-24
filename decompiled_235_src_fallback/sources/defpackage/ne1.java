package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ne1  reason: default package */
/* loaded from: classes.dex */
public final class ne1 {
    public final android.content.Context a;
    public final defpackage.c76 b;

    public ne1(android.content.Context r1, defpackage.c76 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static defpackage.z66 e(int r2, int r3, defpackage.nj3 r4) {
            me.magnum.melonds.domain.model.Rect r2 = f(r2, r3)
            j05 r3 = new j05
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 0
            r3.<init>(r2, r4, r0, r1)
            z66 r2 = new z66
            java.util.List r3 = defpackage.hf.b0(r3)
            r2.<init>(r3)
            return r2
    }

    public static me.magnum.melonds.domain.model.Rect f(int r6, int r7) {
            float r0 = (float) r6
            float r1 = (float) r7
            float r2 = r0 / r1
            r3 = 1068149419(0x3faaaaab, float:1.3333334)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = 0
            r4 = 1132462080(0x43800000, float:256.0)
            r5 = 1128267776(0x43400000, float:192.0)
            if (r2 <= 0) goto L1c
            float r1 = r1 / r5
            float r1 = r1 * r4
            int r0 = (int) r1
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r6 = r6 - r0
            int r6 = r6 / 2
            r1.<init>(r6, r3, r0, r7)
            return r1
        L1c:
            float r0 = r0 / r4
            float r0 = r0 * r5
            int r0 = (int) r0
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r7 = r7 - r0
            int r7 = r7 / 2
            r1.<init>(r3, r7, r6, r0)
            return r1
    }

    public final defpackage.z66 a(int r29, int r30, java.util.List r31, defpackage.d83 r32) {
            r28 = this;
            r0 = r32
            java.lang.Object r1 = defpackage.gt0.H0(r31)
            x66 r1 = (defpackage.x66) r1
            int r2 = r0.a
            int r3 = r0.b
            int r4 = r0.c
            int r0 = r0.d
            int r5 = r29 - r2
            int r5 = r5 - r4
            r6 = 1124859904(0x430c0000, float:140.0)
            r7 = r28
            c76 r7 = r7.b
            float r6 = r7.a(r6)
            int r6 = (int) r6
            r8 = 1112014848(0x42480000, float:50.0)
            r7.a(r8)
            r8 = 1109393408(0x42200000, float:40.0)
            float r8 = r7.a(r8)
            int r8 = (int) r8
            r9 = 1082130432(0x40800000, float:4.0)
            float r9 = r7.a(r9)
            int r9 = (int) r9
            float r10 = (float) r5
            r11 = 1068149419(0x3faaaaab, float:1.3333334)
            float r10 = r10 / r11
            int r10 = (int) r10
            me.magnum.melonds.domain.model.Rect r12 = r1.c
            int r12 = r12.getY()
            int r12 = r12 - r3
            int r0 = r30 - r0
            me.magnum.melonds.domain.model.Rect r1 = r1.c
            int r3 = r1.getBottom()
            int r3 = r0 - r3
            if (r10 > r12) goto L50
            if (r10 <= r3) goto L4d
            goto L50
        L4d:
            r3 = r5
            r5 = 0
            goto L5a
        L50:
            int r10 = java.lang.Math.min(r12, r3)
            float r3 = (float) r10
            float r3 = r3 * r11
            int r3 = (int) r3
            int r5 = r5 - r3
            int r5 = r5 / 2
        L5a:
            me.magnum.melonds.domain.model.Rect r11 = new me.magnum.melonds.domain.model.Rect
            int r5 = r5 + r2
            int r12 = r1.getY()
            int r12 = r12 - r10
            r11.<init>(r5, r12, r3, r10)
            me.magnum.melonds.domain.model.Rect r12 = new me.magnum.melonds.domain.model.Rect
            int r14 = r1.getBottom()
            r12.<init>(r5, r14, r3, r10)
            r3 = 1090519040(0x41000000, float:8.0)
            float r3 = r7.a(r3)
            int r3 = (int) r3
            me.magnum.melonds.domain.model.Rect r5 = new me.magnum.melonds.domain.model.Rect
            int r2 = r2 + r3
            int r10 = r0 - r6
            int r10 = r10 - r3
            r5.<init>(r2, r10, r6, r6)
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r4 = r29 - r4
            int r15 = r4 - r6
            int r15 = r15 - r3
            r14.<init>(r15, r10, r6, r6)
            r6 = 1113063424(0x42580000, float:54.0)
            float r6 = r7.a(r6)
            int r6 = (int) r6
            r10 = 1107296256(0x42000000, float:32.0)
            float r10 = r7.a(r10)
            int r10 = (int) r10
            r15 = 1113587712(0x42600000, float:56.0)
            float r15 = r7.a(r15)
            int r15 = (int) r15
            r13 = 1110441984(0x42300000, float:44.0)
            float r7 = r7.a(r13)
            int r7 = (int) r7
            z66 r13 = new z66
            r30 = r0
            j05 r0 = new j05
            r16 = r1
            nj3 r1 = defpackage.nj3.TOP_SCREEN
            r17 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r31 = r4
            r4 = 0
            r0.<init>(r11, r1, r3, r4)
            j05 r1 = new j05
            nj3 r11 = defpackage.nj3.BOTTOM_SCREEN
            r1.<init>(r12, r11, r3, r4)
            j05 r11 = new j05
            nj3 r12 = defpackage.nj3.DPAD
            r11.<init>(r5, r12, r3, r4)
            j05 r5 = new j05
            nj3 r12 = defpackage.nj3.BUTTONS
            r5.<init>(r14, r12, r3, r4)
            j05 r12 = new j05
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r18 = r16.getBottom()
            int r3 = r18 + r17
            r14.<init>(r2, r3, r15, r7)
            nj3 r2 = defpackage.nj3.BUTTON_L
            r3 = 1065353216(0x3f800000, float:1.0)
            r12.<init>(r14, r2, r3, r4)
            j05 r2 = new j05
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r18 = r31 - r15
            int r3 = r18 - r17
            int r18 = r16.getBottom()
            int r4 = r18 + r17
            r14.<init>(r3, r4, r15, r7)
            nj3 r3 = defpackage.nj3.BUTTON_R
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r2.<init>(r14, r3, r4, r7)
            j05 r3 = new j05
            me.magnum.melonds.domain.model.Rect r4 = new me.magnum.melonds.domain.model.Rect
            int r7 = r29 / 2
            int r14 = r7 - r6
            int r15 = r9 / 2
            int r14 = r14 - r15
            int r18 = r30 - r10
            r30 = r0
            int r0 = r18 - r17
            r4.<init>(r14, r0, r6, r10)
            nj3 r14 = defpackage.nj3.BUTTON_SELECT
            r31 = r1
            r21 = r2
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r3.<init>(r4, r14, r1, r2)
            j05 r4 = new j05
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r15 = r15 + r7
            r14.<init>(r15, r0, r6, r10)
            nj3 r0 = defpackage.nj3.BUTTON_START
            r4.<init>(r14, r0, r1, r2)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            double r14 = (double) r8
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 * r18
            r22 = r3
            double r2 = (double) r9
            r23 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r25 = r2
            double r2 = r25 * r23
            double r14 = r14 + r2
            int r6 = (int) r14
            int r6 = r7 - r6
            int r10 = r16.getBottom()
            int r10 = r10 + r17
            r1.<init>(r6, r10, r8, r8)
            nj3 r6 = defpackage.nj3.BUTTON_HINGE
            r10 = 1065353216(0x3f800000, float:1.0)
            r14 = 0
            r0.<init>(r1, r6, r10, r14)
            j05 r1 = new j05
            me.magnum.melonds.domain.model.Rect r6 = new me.magnum.melonds.domain.model.Rect
            int r15 = r7 - r8
            r28 = r11
            double r10 = r25 / r18
            int r10 = (int) r10
            int r15 = r15 - r10
            int r11 = r16.getBottom()
            int r11 = r11 + r17
            r6.<init>(r15, r11, r8, r8)
            nj3 r11 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            r15 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r6, r11, r15, r14)
            j05 r6 = new j05
            me.magnum.melonds.domain.model.Rect r11 = new me.magnum.melonds.domain.model.Rect
            int r9 = r9 + r7
            int r9 = r9 + r10
            int r10 = r16.getBottom()
            int r10 = r10 + r17
            r11.<init>(r9, r10, r8, r8)
            nj3 r9 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            r6.<init>(r11, r9, r15, r14)
            j05 r9 = new j05
            me.magnum.melonds.domain.model.Rect r10 = new me.magnum.melonds.domain.model.Rect
            int r7 = r7 + r8
            int r2 = (int) r2
            int r7 = r7 + r2
            int r2 = r16.getBottom()
            int r2 = r2 + r17
            r10.<init>(r7, r2, r8, r8)
            nj3 r2 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            r9.<init>(r10, r2, r15, r14)
            r18 = r28
            r16 = r30
            r17 = r31
            r24 = r0
            r25 = r1
            r23 = r4
            r19 = r5
            r26 = r6
            r27 = r9
            r20 = r12
            j05[] r0 = new defpackage.j05[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}
            java.util.List r0 = defpackage.hf.c0(r0)
            r13.<init>(r0)
            return r13
    }

    public final defpackage.z66 b(int r20, int r21, defpackage.d83 r22, defpackage.nj3 r23) {
            r19 = this;
            r0 = r22
            r1 = r23
            if (r1 == 0) goto L14
            boolean r2 = r1.isScreen()
            if (r2 == 0) goto Ld
            goto L14
        Ld:
            java.lang.String r0 = "When specifying a single screen component, it must be a screen component"
            defpackage.i.h(r0)
            r0 = 0
            return r0
        L14:
            int r2 = r0.a
            int r3 = r0.b
            int r4 = r0.c
            int r0 = r0.d
            int r5 = r20 - r2
            int r5 = r5 - r4
            int r6 = r21 - r3
            int r6 = r6 - r0
            r7 = 1124859904(0x430c0000, float:140.0)
            r8 = r19
            c76 r8 = r8.b
            float r7 = r8.a(r7)
            int r7 = (int) r7
            r9 = 1112014848(0x42480000, float:50.0)
            r8.a(r9)
            r9 = 1109393408(0x42200000, float:40.0)
            float r9 = r8.a(r9)
            int r9 = (int) r9
            r10 = 1082130432(0x40800000, float:4.0)
            float r10 = r8.a(r10)
            int r10 = (int) r10
            r11 = 1065353216(0x3f800000, float:1.0)
            r13 = 2
            r14 = 0
            if (r1 != 0) goto L87
            float r1 = (float) r5
            r15 = 1059648963(0x3f28f5c3, float:0.66)
            float r1 = r1 * r15
            int r1 = defpackage.u24.E(r1)
            float r15 = (float) r1
            r16 = 1068149419(0x3faaaaab, float:1.3333334)
            float r15 = r15 / r16
            int r15 = (int) r15
            if (r15 <= r6) goto L5d
            float r1 = (float) r6
            float r1 = r1 * r16
            int r1 = (int) r1
            goto L5e
        L5d:
            r6 = r15
        L5e:
            me.magnum.melonds.domain.model.Rect r15 = new me.magnum.melonds.domain.model.Rect
            r15.<init>(r2, r3, r1, r6)
            int r5 = r5 - r1
            float r6 = (float) r5
            float r6 = r6 / r16
            int r6 = (int) r6
            r19 = 1
            me.magnum.melonds.domain.model.Rect r12 = new me.magnum.melonds.domain.model.Rect
            int r1 = r1 + r2
            r12.<init>(r1, r3, r5, r6)
            j05[] r1 = new defpackage.j05[r13]
            j05 r5 = new j05
            nj3 r6 = defpackage.nj3.TOP_SCREEN
            r5.<init>(r15, r6, r11, r14)
            r1[r14] = r5
            j05 r5 = new j05
            nj3 r6 = defpackage.nj3.BOTTOM_SCREEN
            r5.<init>(r12, r6, r11, r14)
            r1[r19] = r5
            r22 = r13
            goto Lb2
        L87:
            r19 = 1
            me.magnum.melonds.domain.model.Rect r5 = f(r5, r6)
            me.magnum.melonds.domain.model.Rect r6 = new me.magnum.melonds.domain.model.Rect
            int r12 = r5.getX()
            int r12 = r12 + r2
            int r15 = r5.getY()
            int r15 = r15 + r3
            r22 = r13
            int r13 = r5.getWidth()
            int r5 = r5.getHeight()
            r6.<init>(r12, r15, r13, r5)
            r5 = r19
            j05[] r5 = new defpackage.j05[r5]
            j05 r12 = new j05
            r12.<init>(r6, r1, r11, r14)
            r5[r14] = r12
            r1 = r5
        Lb2:
            me.magnum.melonds.domain.model.Rect r5 = new me.magnum.melonds.domain.model.Rect
            int r0 = r21 - r0
            int r6 = r0 - r7
            r5.<init>(r2, r6, r7, r7)
            me.magnum.melonds.domain.model.Rect r12 = new me.magnum.melonds.domain.model.Rect
            int r4 = r20 - r4
            int r13 = r4 - r7
            r12.<init>(r13, r6, r7, r7)
            r6 = 1113063424(0x42580000, float:54.0)
            float r6 = r8.a(r6)
            int r6 = (int) r6
            r7 = 1107296256(0x42000000, float:32.0)
            float r7 = r8.a(r7)
            int r7 = (int) r7
            r13 = 1113587712(0x42600000, float:56.0)
            float r13 = r8.a(r13)
            int r13 = (int) r13
            r15 = 1110441984(0x42300000, float:44.0)
            float r8 = r8.a(r15)
            int r8 = (int) r8
            z66 r15 = new z66
            ww2 r11 = new ww2
            r14 = 11
            r11.<init>(r14)
            r11.d(r1)
            j05 r1 = new j05
            nj3 r14 = defpackage.nj3.DPAD
            r21 = r0
            r19 = r4
            r0 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r1.<init>(r5, r14, r0, r4)
            r11.a(r1)
            j05 r1 = new j05
            nj3 r5 = defpackage.nj3.BUTTONS
            r1.<init>(r12, r5, r0, r4)
            r11.a(r1)
            j05 r1 = new j05
            me.magnum.melonds.domain.model.Rect r5 = new me.magnum.melonds.domain.model.Rect
            r5.<init>(r2, r3, r13, r8)
            nj3 r2 = defpackage.nj3.BUTTON_L
            r1.<init>(r5, r2, r0, r4)
            r11.a(r1)
            j05 r1 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r5 = r19 - r13
            r2.<init>(r5, r3, r13, r8)
            nj3 r5 = defpackage.nj3.BUTTON_R
            r1.<init>(r2, r5, r0, r4)
            r11.a(r1)
            j05 r1 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r5 = r20 - r10
            int r5 = r5 / 2
            int r5 = r5 - r6
            int r8 = r21 - r7
            r2.<init>(r5, r8, r6, r7)
            nj3 r5 = defpackage.nj3.BUTTON_SELECT
            r1.<init>(r2, r5, r0, r4)
            r11.a(r1)
            j05 r1 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r5 = r20 + r10
            int r5 = r5 / 2
            r2.<init>(r5, r8, r6, r7)
            nj3 r5 = defpackage.nj3.BUTTON_START
            r1.<init>(r2, r5, r0, r4)
            r11.a(r1)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r2 = r20 / 2
            double r4 = (double) r9
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r6
            double r12 = (double) r10
            r17 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r20 = r6
            double r6 = r12 * r17
            double r4 = r4 + r6
            int r4 = (int) r4
            int r4 = r2 - r4
            r1.<init>(r4, r3, r9, r9)
            nj3 r4 = defpackage.nj3.BUTTON_HINGE
            r5 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r0.<init>(r1, r4, r5, r8)
            r11.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r4 = r2 - r9
            double r12 = r12 / r20
            int r10 = (int) r12
            int r4 = r4 - r10
            r1.<init>(r4, r3, r9, r9)
            nj3 r4 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            r0.<init>(r1, r4, r5, r8)
            r11.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r10 = r10 + r2
            r1.<init>(r10, r3, r9, r9)
            nj3 r4 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            r0.<init>(r1, r4, r5, r8)
            r11.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r2 = r2 + r9
            int r4 = (int) r6
            int r2 = r2 + r4
            r1.<init>(r2, r3, r9, r9)
            nj3 r2 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            r0.<init>(r1, r2, r5, r8)
            r11.a(r0)
            java.util.ArrayList r0 = r11.b
            int r1 = r0.size()
            j05[] r1 = new defpackage.j05[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.util.List r0 = defpackage.hf.c0(r0)
            r15.<init>(r0)
            return r15
    }

    public final defpackage.ff7 c(defpackage.jf7 r29) {
            r28 = this;
            r0 = r28
            r1 = r29
            r1.getClass()
            my4 r2 = r1.a
            int r3 = r2.a
            int r2 = r2.b
            ko4 r4 = r1.c
            java.util.List r5 = r1.d
            ok3 r6 = r1.e
            mk3 r7 = r6.a
            mk3 r6 = r6.b
            d83 r1 = r1.b
            r8 = 1
            r9 = 2
            if (r6 == 0) goto L121
            int r5 = r6.d
            int r11 = r6.c
            int r12 = r6.a
            d83 r13 = defpackage.d83.e
            if (r12 != 0) goto L2d
            int r12 = android.os.Build.VERSION.SDK_INT
            r14 = 29
            if (r12 >= r14) goto L30
        L2d:
            r29 = 0
            goto L8e
        L30:
            android.content.Context r14 = r0.a
            java.lang.Class<android.view.WindowManager> r15 = android.view.WindowManager.class
            java.lang.Object r14 = r14.getSystemService(r15)
            android.view.WindowManager r14 = (android.view.WindowManager) r14
            if (r14 != 0) goto L3d
            goto L2d
        L3d:
            r15 = 30
            if (r12 < r15) goto L6c
            android.view.WindowMetrics r12 = defpackage.m2.n(r14)
            android.view.WindowInsets r12 = defpackage.m2.l(r12)
            int r13 = defpackage.zm6.D()
            android.graphics.Insets r12 = defpackage.zm6.v(r12, r13)
            r12.getClass()
            d83 r13 = new d83
            int r14 = defpackage.yz0.a(r12)
            int r15 = defpackage.yz0.z(r12)
            r29 = 0
            int r10 = defpackage.yz0.B(r12)
            int r12 = defpackage.yz0.D(r12)
            r13.<init>(r14, r15, r10, r12)
            goto L8e
        L6c:
            r29 = 0
            android.view.Display r10 = r14.getDefaultDisplay()
            android.view.DisplayCutout r10 = defpackage.yz0.f(r10)
            if (r10 != 0) goto L79
            goto L8e
        L79:
            d83 r13 = new d83
            int r12 = defpackage.j2.x(r10)
            int r14 = defpackage.j2.b(r10)
            int r15 = defpackage.j2.C(r10)
            int r10 = defpackage.j2.B(r10)
            r13.<init>(r12, r14, r15, r10)
        L8e:
            lk3 r10 = r7.b
            lk3 r12 = defpackage.lk3.BUILT_IN
            if (r10 != r12) goto Lf7
            lk3 r6 = r6.b
            if (r6 != r12) goto Lf7
            int r6 = r7.a
            if (r6 != 0) goto Lcd
            if (r11 <= r5) goto La1
            ko4 r1 = defpackage.ko4.LANDSCAPE
            goto La3
        La1:
            ko4 r1 = defpackage.ko4.PORTRAIT
        La3:
            int[] r4 = defpackage.me1.a
            int r1 = r1.ordinal()
            r1 = r4[r1]
            if (r1 == r8) goto Lba
            if (r1 != r9) goto Lb6
            nj3 r1 = defpackage.nj3.BOTTOM_SCREEN
            z66 r0 = r0.b(r11, r5, r13, r1)
            goto Lc0
        Lb6:
            defpackage.i.d()
            return r29
        Lba:
            nj3 r1 = defpackage.nj3.BOTTOM_SCREEN
            z66 r0 = r0.d(r11, r5, r13, r1)
        Lc0:
            nj3 r1 = defpackage.nj3.TOP_SCREEN
            z66 r1 = e(r3, r2, r1)
            vr4 r2 = new vr4
            r2.<init>(r1, r0)
            goto L353
        Lcd:
            int[] r6 = defpackage.me1.a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r8) goto Le4
            if (r4 != r9) goto Le0
            nj3 r4 = defpackage.nj3.BOTTOM_SCREEN
            z66 r0 = r0.b(r3, r2, r1, r4)
            goto Lea
        Le0:
            defpackage.i.d()
            return r29
        Le4:
            nj3 r4 = defpackage.nj3.BOTTOM_SCREEN
            z66 r0 = r0.d(r3, r2, r1, r4)
        Lea:
            nj3 r1 = defpackage.nj3.TOP_SCREEN
            z66 r1 = e(r11, r5, r1)
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
            goto L353
        Lf7:
            int[] r6 = defpackage.me1.a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r8) goto L10e
            if (r4 != r9) goto L10a
            nj3 r4 = defpackage.nj3.BOTTOM_SCREEN
            z66 r0 = r0.b(r3, r2, r1, r4)
            goto L114
        L10a:
            defpackage.i.d()
            return r29
        L10e:
            nj3 r4 = defpackage.nj3.BOTTOM_SCREEN
            z66 r0 = r0.d(r3, r2, r1, r4)
        L114:
            nj3 r1 = defpackage.nj3.TOP_SCREEN
            z66 r1 = e(r11, r5, r1)
            vr4 r2 = new vr4
            r2.<init>(r0, r1)
            goto L353
        L121:
            r29 = 0
            int[] r6 = defpackage.me1.a
            int r4 = r4.ordinal()
            r4 = r6[r4]
            if (r4 == r8) goto L31e
            if (r4 != r9) goto L318
            if (r5 == 0) goto L139
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L139
            goto L2ed
        L139:
            java.util.Iterator r4 = r5.iterator()
        L13d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2ed
            java.lang.Object r6 = r4.next()
            x66 r6 = (defpackage.x66) r6
            ko4 r6 = r6.a
            ko4 r7 = defpackage.ko4.PORTRAIT
            if (r6 != r7) goto L13d
            java.lang.Object r4 = defpackage.gt0.H0(r5)
            x66 r4 = (defpackage.x66) r4
            int r5 = r1.a
            int r6 = r1.b
            int r7 = r1.c
            int r1 = r1.d
            int r8 = r2 - r6
            int r8 = r8 - r1
            r9 = 1124859904(0x430c0000, float:140.0)
            c76 r0 = r0.b
            float r9 = r0.a(r9)
            int r9 = (int) r9
            r10 = 1112014848(0x42480000, float:50.0)
            float r10 = r0.a(r10)
            int r10 = (int) r10
            r11 = 1109393408(0x42200000, float:40.0)
            float r11 = r0.a(r11)
            int r11 = (int) r11
            r12 = 1090519040(0x41000000, float:8.0)
            float r13 = r0.a(r12)
            int r13 = (int) r13
            me.magnum.melonds.domain.model.Rect r4 = r4.c
            int r14 = r4.getX()
            int r14 = r14 - r5
            float r15 = (float) r14
            r16 = 1068149419(0x3faaaaab, float:1.3333334)
            float r15 = r15 / r16
            int r15 = (int) r15
            if (r15 <= r8) goto L193
            float r14 = (float) r8
            float r14 = r14 * r16
            int r14 = (int) r14
            r15 = r8
        L193:
            int r3 = r3 - r7
            int r7 = r4.getRight()
            int r7 = r3 - r7
            float r12 = (float) r7
            float r12 = r12 / r16
            int r12 = (int) r12
            if (r12 <= r8) goto L1a5
            float r7 = (float) r8
            float r7 = r7 * r16
            int r7 = (int) r7
            r12 = r8
        L1a5:
            int r8 = r8 - r10
            int r8 = r8 - r13
            if (r15 >= r8) goto L1ae
            if (r12 >= r8) goto L1ae
            int r10 = r10 + r6
            int r10 = r10 + r13
            goto L1af
        L1ae:
            r10 = r6
        L1af:
            me.magnum.melonds.domain.model.Rect r8 = new me.magnum.melonds.domain.model.Rect
            int r16 = r4.getX()
            r17 = r1
            int r1 = r16 - r14
            r8.<init>(r1, r10, r14, r15)
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            int r14 = r4.getRight()
            r1.<init>(r14, r10, r7, r12)
            r7 = 1090519040(0x41000000, float:8.0)
            float r7 = r0.a(r7)
            int r7 = (int) r7
            me.magnum.melonds.domain.model.Rect r10 = new me.magnum.melonds.domain.model.Rect
            int r5 = r5 + r7
            int r2 = r2 - r17
            int r12 = r2 - r9
            int r12 = r12 - r7
            r10.<init>(r5, r12, r9, r9)
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r15 = r3 - r9
            int r15 = r15 - r7
            r14.<init>(r15, r12, r9, r9)
            r9 = 1113063424(0x42580000, float:54.0)
            float r9 = r0.a(r9)
            int r9 = (int) r9
            r12 = 1107296256(0x42000000, float:32.0)
            float r12 = r0.a(r12)
            int r12 = (int) r12
            r15 = 1113587712(0x42600000, float:56.0)
            float r15 = r0.a(r15)
            int r15 = (int) r15
            r28 = r2
            r2 = 1110441984(0x42300000, float:44.0)
            float r0 = r0.a(r2)
            int r0 = (int) r0
            z66 r2 = new z66
            r16 = r3
            j05 r3 = new j05
            r17 = r4
            nj3 r4 = defpackage.nj3.TOP_SCREEN
            r18 = r6
            r6 = 1065353216(0x3f800000, float:1.0)
            r19 = r7
            r7 = 0
            r3.<init>(r8, r4, r6, r7)
            j05 r4 = new j05
            nj3 r8 = defpackage.nj3.BOTTOM_SCREEN
            r4.<init>(r1, r8, r6, r7)
            j05 r1 = new j05
            nj3 r8 = defpackage.nj3.DPAD
            r1.<init>(r10, r8, r6, r7)
            j05 r8 = new j05
            nj3 r10 = defpackage.nj3.BUTTONS
            r8.<init>(r14, r10, r6, r7)
            j05 r10 = new j05
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r6 = r18 + r19
            r14.<init>(r5, r6, r15, r0)
            nj3 r5 = defpackage.nj3.BUTTON_L
            r18 = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r10.<init>(r14, r5, r1, r7)
            j05 r5 = new j05
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r16 = r16 - r15
            int r1 = r16 - r19
            r14.<init>(r1, r6, r15, r0)
            nj3 r0 = defpackage.nj3.BUTTON_R
            r1 = 1065353216(0x3f800000, float:1.0)
            r5.<init>(r14, r0, r1, r7)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            int r15 = r17.getX()
            int r15 = r15 - r9
            int r15 = r15 - r13
            int r16 = r28 - r12
            int r1 = r16 - r19
            r14.<init>(r15, r1, r9, r12)
            nj3 r15 = defpackage.nj3.BUTTON_SELECT
            r16 = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r14, r15, r3, r7)
            j05 r14 = new j05
            me.magnum.melonds.domain.model.Rect r15 = new me.magnum.melonds.domain.model.Rect
            int r19 = r17.getRight()
            int r3 = r19 + r13
            r15.<init>(r3, r1, r9, r12)
            nj3 r1 = defpackage.nj3.BUTTON_START
            r3 = 1065353216(0x3f800000, float:1.0)
            r14.<init>(r15, r1, r3, r7)
            j05 r1 = new j05
            me.magnum.melonds.domain.model.Rect r3 = new me.magnum.melonds.domain.model.Rect
            int r9 = r17.getX()
            int r12 = r11 * 2
            int r9 = r9 - r12
            int r12 = r13 * 2
            int r9 = r9 - r12
            r3.<init>(r9, r6, r11, r11)
            nj3 r9 = defpackage.nj3.BUTTON_HINGE
            r15 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r3, r9, r15, r7)
            j05 r3 = new j05
            me.magnum.melonds.domain.model.Rect r9 = new me.magnum.melonds.domain.model.Rect
            int r19 = r17.getX()
            int r19 = r19 - r11
            int r7 = r19 - r13
            r9.<init>(r7, r6, r11, r11)
            nj3 r7 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            r22 = r0
            r0 = 0
            r3.<init>(r9, r7, r15, r0)
            j05 r7 = new j05
            me.magnum.melonds.domain.model.Rect r9 = new me.magnum.melonds.domain.model.Rect
            int r19 = r17.getRight()
            int r19 = r19 + r11
            int r13 = r19 + r13
            r9.<init>(r13, r6, r11, r11)
            nj3 r13 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            r7.<init>(r9, r13, r15, r0)
            j05 r9 = new j05
            me.magnum.melonds.domain.model.Rect r13 = new me.magnum.melonds.domain.model.Rect
            int r17 = r17.getRight()
            int r12 = r17 + r12
            r13.<init>(r12, r6, r11, r11)
            nj3 r6 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            r9.<init>(r13, r6, r15, r0)
            r24 = r1
            r25 = r3
            r17 = r4
            r21 = r5
            r26 = r7
            r19 = r8
            r27 = r9
            r20 = r10
            r23 = r14
            j05[] r0 = new defpackage.j05[]{r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27}
            java.util.List r0 = defpackage.hf.c0(r0)
            r2.<init>(r0)
        L2ea:
            r4 = r29
            goto L348
        L2ed:
            if (r5 == 0) goto L2f8
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L2f8
        L2f5:
            r4 = r29
            goto L313
        L2f8:
            java.util.Iterator r4 = r5.iterator()
        L2fc:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L2f5
            java.lang.Object r6 = r4.next()
            x66 r6 = (defpackage.x66) r6
            ko4 r6 = r6.a
            ko4 r7 = defpackage.ko4.LANDSCAPE
            if (r6 != r7) goto L2fc
            z66 r2 = r0.a(r3, r2, r5, r1)
            goto L2ea
        L313:
            z66 r2 = r0.b(r3, r2, r1, r4)
            goto L348
        L318:
            r4 = r29
            defpackage.i.d()
            return r4
        L31e:
            if (r5 == 0) goto L328
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L328
        L326:
            r4 = 0
            goto L344
        L328:
            java.util.Iterator r4 = r5.iterator()
        L32c:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L326
            java.lang.Object r6 = r4.next()
            x66 r6 = (defpackage.x66) r6
            ko4 r6 = r6.a
            ko4 r7 = defpackage.ko4.LANDSCAPE
            if (r6 != r7) goto L32c
            z66 r2 = r0.a(r3, r2, r5, r1)
            r4 = 0
            goto L348
        L344:
            z66 r2 = r0.d(r3, r2, r1, r4)
        L348:
            z66 r0 = new z66
            r0.<init>(r4)
            vr4 r1 = new vr4
            r1.<init>(r2, r0)
            r2 = r1
        L353:
            java.lang.Object r0 = r2.A
            z66 r0 = (defpackage.z66) r0
            java.lang.Object r1 = r2.B
            z66 r1 = (defpackage.z66) r1
            ff7 r2 = new ff7
            r2.<init>(r0, r1)
            return r2
    }

    public final defpackage.z66 d(int r21, int r22, defpackage.d83 r23, defpackage.nj3 r24) {
            r20 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            if (r2 == 0) goto L16
            boolean r3 = r2.isScreen()
            if (r3 == 0) goto Lf
            goto L16
        Lf:
            java.lang.String r0 = "When specifying a single screen component, it must be a screen component"
            defpackage.i.h(r0)
            r0 = 0
            return r0
        L16:
            int r3 = r1.a
            int r4 = r1.b
            int r5 = r1.c
            int r1 = r1.d
            int r6 = r21 - r3
            int r6 = r6 - r5
            int r7 = r0 - r4
            int r7 = r7 - r1
            r8 = 1124859904(0x430c0000, float:140.0)
            r9 = r20
            c76 r9 = r9.b
            float r8 = r9.a(r8)
            int r8 = (int) r8
            r10 = 1112014848(0x42480000, float:50.0)
            float r10 = r9.a(r10)
            int r10 = (int) r10
            r11 = 1109393408(0x42200000, float:40.0)
            float r11 = r9.a(r11)
            int r11 = (int) r11
            r12 = 1082130432(0x40800000, float:4.0)
            float r12 = r9.a(r12)
            int r12 = (int) r12
            float r13 = (float) r6
            r14 = 1068149419(0x3faaaaab, float:1.3333334)
            float r13 = r13 / r14
            int r13 = (int) r13
            r20 = r14
            r23 = 1
            r14 = 2
            if (r2 != 0) goto L90
            int r15 = r13 * 2
            if (r15 <= r7) goto L63
            int r13 = r7 / 2
            float r7 = (float) r13
            float r7 = r7 * r20
            int r7 = (int) r7
            int r6 = r6 - r7
            int r6 = r6 / r14
            r19 = r7
            r7 = r6
            r6 = r19
            goto L64
        L63:
            r7 = 0
        L64:
            me.magnum.melonds.domain.model.Rect r15 = new me.magnum.melonds.domain.model.Rect
            int r7 = r7 + r3
            r15.<init>(r7, r4, r6, r13)
            me.magnum.melonds.domain.model.Rect r14 = new me.magnum.melonds.domain.model.Rect
            r16 = r1
            int r1 = r4 + r13
            r14.<init>(r7, r1, r6, r13)
            r1 = 2
            j05[] r6 = new defpackage.j05[r1]
            j05 r1 = new j05
            nj3 r7 = defpackage.nj3.TOP_SCREEN
            r17 = r5
            r18 = r10
            r5 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r1.<init>(r15, r7, r5, r10)
            r6[r10] = r1
            j05 r1 = new j05
            nj3 r7 = defpackage.nj3.BOTTOM_SCREEN
            r1.<init>(r14, r7, r5, r10)
            r6[r23] = r1
            goto La9
        L90:
            r16 = r1
            r17 = r5
            r18 = r10
            r5 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            me.magnum.melonds.domain.model.Rect r1 = new me.magnum.melonds.domain.model.Rect
            r1.<init>(r3, r4, r6, r13)
            r6 = r23
            j05[] r6 = new defpackage.j05[r6]
            j05 r7 = new j05
            r7.<init>(r1, r2, r5, r10)
            r6[r10] = r7
        La9:
            if (r2 != 0) goto Laf
            int r1 = r13 * 2
            int r1 = r1 + r4
            goto Lb1
        Laf:
            int r1 = r4 + r13
        Lb1:
            int r10 = r1 + r18
            int r10 = r10 + r8
            if (r10 <= r0) goto Lb8
            int r1 = r4 + r13
        Lb8:
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r0 = r0 - r16
            int r4 = r0 - r8
            r2.<init>(r3, r4, r8, r8)
            me.magnum.melonds.domain.model.Rect r5 = new me.magnum.melonds.domain.model.Rect
            int r7 = r21 - r17
            int r10 = r7 - r8
            r5.<init>(r10, r4, r8, r8)
            r4 = 1113063424(0x42580000, float:54.0)
            float r4 = r9.a(r4)
            int r4 = (int) r4
            r8 = 1107296256(0x42000000, float:32.0)
            float r8 = r9.a(r8)
            int r8 = (int) r8
            r10 = 1113587712(0x42600000, float:56.0)
            float r10 = r9.a(r10)
            int r10 = (int) r10
            r13 = 1110441984(0x42300000, float:44.0)
            float r9 = r9.a(r13)
            int r9 = (int) r9
            z66 r13 = new z66
            ww2 r14 = new ww2
            r15 = 11
            r14.<init>(r15)
            r14.d(r6)
            j05 r6 = new j05
            nj3 r15 = defpackage.nj3.DPAD
            r22 = r0
            r23 = r7
            r0 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r6.<init>(r2, r15, r0, r7)
            r14.a(r6)
            j05 r2 = new j05
            nj3 r6 = defpackage.nj3.BUTTONS
            r2.<init>(r5, r6, r0, r7)
            r14.a(r2)
            j05 r2 = new j05
            me.magnum.melonds.domain.model.Rect r5 = new me.magnum.melonds.domain.model.Rect
            r5.<init>(r3, r1, r10, r9)
            nj3 r3 = defpackage.nj3.BUTTON_L
            r2.<init>(r5, r3, r0, r7)
            r14.a(r2)
            j05 r2 = new j05
            me.magnum.melonds.domain.model.Rect r3 = new me.magnum.melonds.domain.model.Rect
            int r5 = r23 - r10
            r3.<init>(r5, r1, r10, r9)
            nj3 r5 = defpackage.nj3.BUTTON_R
            r2.<init>(r3, r5, r0, r7)
            r14.a(r2)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            r3 = 2
            int r3 = r21 / 2
            int r5 = r3 - r4
            int r6 = r12 / 2
            int r5 = r5 - r6
            int r7 = r22 - r8
            r2.<init>(r5, r7, r4, r8)
            nj3 r5 = defpackage.nj3.BUTTON_SELECT
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r0.<init>(r2, r5, r9, r10)
            r14.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r6 = r6 + r3
            r2.<init>(r6, r7, r4, r8)
            nj3 r4 = defpackage.nj3.BUTTON_START
            r0.<init>(r2, r4, r9, r10)
            r14.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            double r4 = (double) r11
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r6
            double r8 = (double) r12
            r16 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            r20 = r6
            double r6 = r8 * r16
            double r4 = r4 + r6
            int r4 = (int) r4
            int r4 = r3 - r4
            r2.<init>(r4, r1, r11, r11)
            nj3 r4 = defpackage.nj3.BUTTON_HINGE
            r5 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            r0.<init>(r2, r4, r5, r10)
            r14.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r4 = r3 - r11
            double r8 = r8 / r20
            int r8 = (int) r8
            int r4 = r4 - r8
            r2.<init>(r4, r1, r11, r11)
            nj3 r4 = defpackage.nj3.BUTTON_TOGGLE_SOFT_INPUT
            r0.<init>(r2, r4, r5, r10)
            r14.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r8 = r8 + r3
            r2.<init>(r8, r1, r11, r11)
            nj3 r4 = defpackage.nj3.BUTTON_MICROPHONE_TOGGLE
            r0.<init>(r2, r4, r5, r10)
            r14.a(r0)
            j05 r0 = new j05
            me.magnum.melonds.domain.model.Rect r2 = new me.magnum.melonds.domain.model.Rect
            int r3 = r3 + r11
            int r4 = (int) r6
            int r3 = r3 + r4
            r2.<init>(r3, r1, r11, r11)
            nj3 r1 = defpackage.nj3.BUTTON_FAST_FORWARD_TOGGLE
            r0.<init>(r2, r1, r5, r10)
            r14.a(r0)
            java.util.ArrayList r0 = r14.b
            int r1 = r0.size()
            j05[] r1 = new defpackage.j05[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.util.List r0 = defpackage.hf.c0(r0)
            r13.<init>(r0)
            return r13
    }
}
