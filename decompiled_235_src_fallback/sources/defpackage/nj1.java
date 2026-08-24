package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj1  reason: default package */
/* loaded from: classes.dex */
public final class nj1 {
    public final android.content.Context a;
    public final defpackage.oj1 b;
    public android.view.VelocityTracker c;
    public float d;
    public int e;
    public int f;
    public int g;
    public final int[] h;

    public nj1(android.content.Context r3, defpackage.oj1 r4) {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.e = r0
            r2.f = r0
            r2.g = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 0
            int[] r0 = new int[]{r0, r1}
            r2.h = r0
            r2.a = r3
            r2.b = r4
            return
    }

    public final void a(android.view.MotionEvent r28, int r29) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            int r3 = r1.getSource()
            int r4 = r1.getDeviceId()
            int r5 = r0.f
            r6 = 34
            r8 = 4194304(0x400000, float:5.877472E-39)
            int[] r10 = r0.h
            if (r5 != r3) goto L28
            int r5 = r0.g
            if (r5 != r4) goto L28
            int r5 = r0.e
            if (r5 == r2) goto L21
            goto L28
        L21:
            r12 = 0
            r16 = 1
            r17 = 0
            goto Lcf
        L28:
            android.content.Context r5 = r0.a
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r5)
            int r14 = r1.getDeviceId()
            int r15 = r1.getSource()
            r16 = 1
            int r11 = android.os.Build.VERSION.SDK_INT
            r17 = 0
            java.lang.String r12 = "android"
            java.lang.String r7 = "dimen"
            r9 = -1
            if (r11 < r6) goto L4a
            java.lang.reflect.Method r19 = defpackage.go7.a
            int r14 = defpackage.c2.h(r13, r14, r2, r15)
            goto L80
        L4a:
            java.lang.reflect.Method r19 = defpackage.go7.a
            android.view.InputDevice r14 = android.view.InputDevice.getDevice(r14)
            if (r14 == 0) goto L7d
            android.view.InputDevice$MotionRange r14 = r14.getMotionRange(r2, r15)
            if (r14 == 0) goto L7d
            android.content.res.Resources r14 = r5.getResources()
            if (r15 != r8) goto L69
            r15 = 26
            if (r2 != r15) goto L69
            java.lang.String r15 = "config_viewMinRotaryEncoderFlingVelocity"
            int r15 = r14.getIdentifier(r15, r7, r12)
            goto L6a
        L69:
            r15 = r9
        L6a:
            java.util.Objects.requireNonNull(r13)
            if (r15 == r9) goto L78
            if (r15 == 0) goto L7d
            int r14 = r14.getDimensionPixelSize(r15)
            if (r14 >= 0) goto L80
            goto L7d
        L78:
            int r14 = r13.getScaledMinimumFlingVelocity()
            goto L80
        L7d:
            r14 = 2147483647(0x7fffffff, float:NaN)
        L80:
            r10[r17] = r14
            int r14 = r1.getDeviceId()
            int r15 = r1.getSource()
            if (r11 < r6) goto L91
            int r5 = defpackage.c2.g(r13, r14, r2, r15)
            goto Lc5
        L91:
            android.view.InputDevice r11 = android.view.InputDevice.getDevice(r14)
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto Lc4
            android.view.InputDevice$MotionRange r11 = r11.getMotionRange(r2, r15)
            if (r11 == 0) goto Lc4
            android.content.res.Resources r5 = r5.getResources()
            if (r15 != r8) goto Lb0
            r15 = 26
            if (r2 != r15) goto Lb0
            java.lang.String r11 = "config_viewMaxRotaryEncoderFlingVelocity"
            int r7 = r5.getIdentifier(r11, r7, r12)
            goto Lb1
        Lb0:
            r7 = r9
        Lb1:
            java.util.Objects.requireNonNull(r13)
            if (r7 == r9) goto Lbf
            if (r7 == 0) goto Lc4
            int r5 = r5.getDimensionPixelSize(r7)
            if (r5 >= 0) goto Lc5
            goto Lc4
        Lbf:
            int r5 = r13.getScaledMaximumFlingVelocity()
            goto Lc5
        Lc4:
            r5 = r14
        Lc5:
            r10[r16] = r5
            r0.f = r3
            r0.g = r4
            r0.e = r2
            r12 = r16
        Lcf:
            r3 = r10[r17]
            android.view.VelocityTracker r4 = r0.c
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r5) goto Le1
            if (r4 == 0) goto L29f
            r4.recycle()
            r1 = 0
            r0.c = r1
            return
        Le1:
            if (r4 != 0) goto Le9
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r0.c = r3
        Le9:
            android.view.VelocityTracker r3 = r0.c
            java.util.Map r4 = defpackage.sl7.a
            r3.addMovement(r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 0
            r7 = 20
            if (r4 < r6) goto Lf8
            goto L14d
        Lf8:
            int r4 = r1.getSource()
            if (r4 != r8) goto L14d
            java.util.Map r4 = defpackage.sl7.a
            boolean r8 = r4.containsKey(r3)
            if (r8 != 0) goto L10e
            tl7 r8 = new tl7
            r8.<init>()
            r4.put(r3, r8)
        L10e:
            java.lang.Object r4 = r4.get(r3)
            tl7 r4 = (defpackage.tl7) r4
            long[] r8 = r4.b
            long r13 = r1.getEventTime()
            int r9 = r4.d
            if (r9 == 0) goto L130
            int r9 = r4.e
            r19 = r8[r9]
            long r19 = r13 - r19
            r21 = 40
            int r9 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r9 <= 0) goto L130
            r9 = r17
            r4.d = r9
            r4.c = r5
        L130:
            int r9 = r4.e
            int r9 = r9 + 1
            int r9 = r9 % r7
            r4.e = r9
            int r11 = r4.d
            if (r11 == r7) goto L13f
            int r11 = r11 + 1
            r4.d = r11
        L13f:
            float[] r11 = r4.a
            r15 = 26
            float r1 = r1.getAxisValue(r15)
            r11[r9] = r1
            int r1 = r4.e
            r8[r1] = r13
        L14d:
            r1 = 1000(0x3e8, float:1.401E-42)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.computeCurrentVelocity(r1, r4)
            java.util.Map r1 = defpackage.sl7.a
            java.lang.Object r1 = r1.get(r3)
            tl7 r1 = (defpackage.tl7) r1
            if (r1 == 0) goto L246
            float[] r8 = r1.a
            long[] r9 = r1.b
            int r11 = r1.d
            r13 = 2
            if (r11 >= r13) goto L16f
        L168:
            r28 = r4
            r7 = r5
            r23 = r7
            goto L21f
        L16f:
            int r14 = r1.e
            int r15 = r14 + 20
            int r11 = r11 + (-1)
            int r15 = r15 - r11
            int r15 = r15 % r7
            r19 = r9[r14]
        L179:
            r21 = r9[r15]
            long r23 = r19 - r21
            r25 = 100
            int r11 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            int r14 = r1.d
            if (r11 <= 0) goto L18d
            int r14 = r14 + (-1)
            r1.d = r14
            int r15 = r15 + 1
            int r15 = r15 % r7
            goto L179
        L18d:
            if (r14 >= r13) goto L190
            goto L168
        L190:
            if (r14 != r13) goto L1a8
            int r15 = r15 + 1
            int r15 = r15 % r7
            r13 = r9[r15]
            int r7 = (r21 > r13 ? 1 : (r21 == r13 ? 0 : -1))
            if (r7 != 0) goto L19c
            goto L168
        L19c:
            r7 = r8[r15]
            long r13 = r13 - r21
            float r8 = (float) r13
            float r7 = r7 / r8
            r28 = r4
            r23 = r5
            goto L21f
        L1a8:
            r28 = r4
            r14 = r5
            r11 = 0
            r13 = 0
        L1ad:
            int r4 = r1.d
            int r4 = r4 + (-1)
            r18 = 1073741824(0x40000000, float:2.0)
            r19 = 1065353216(0x3f800000, float:1.0)
            r20 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r11 >= r4) goto L209
            int r4 = r11 + r15
            int r21 = r4 % 20
            r21 = r9[r21]
            int r4 = r4 + 1
            int r4 = r4 % r7
            r23 = r9[r4]
            int r23 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r23 != 0) goto L1cd
            r23 = r5
            r25 = r8
            goto L1fe
        L1cd:
            int r13 = r13 + 1
            int r23 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r23 >= 0) goto L1d5
            r19 = r20
        L1d5:
            float r20 = java.lang.Math.abs(r14)
            r23 = r5
            float r5 = r20 * r18
            r25 = r8
            double r7 = (double) r5
            double r7 = java.lang.Math.sqrt(r7)
            float r5 = (float) r7
            float r19 = r19 * r5
            r5 = r25[r4]
            r7 = r9[r4]
            long r7 = r7 - r21
            float r4 = (float) r7
            float r5 = r5 / r4
            float r4 = r5 - r19
            float r5 = java.lang.Math.abs(r5)
            float r5 = r5 * r4
            float r14 = r14 + r5
            r4 = r16
            if (r13 != r4) goto L1fe
            r4 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 * r4
        L1fe:
            int r11 = r11 + 1
            r5 = r23
            r8 = r25
            r7 = 20
            r16 = 1
            goto L1ad
        L209:
            r23 = r5
            int r4 = (r14 > r23 ? 1 : (r14 == r23 ? 0 : -1))
            if (r4 >= 0) goto L211
            r19 = r20
        L211:
            float r4 = java.lang.Math.abs(r14)
            float r4 = r4 * r18
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            float r4 = (float) r4
            float r7 = r19 * r4
        L21f:
            r4 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r4
            r1.c = r7
            float r4 = java.lang.Math.abs(r28)
            float r4 = -r4
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 >= 0) goto L235
            float r4 = java.lang.Math.abs(r28)
            float r4 = -r4
            r1.c = r4
            goto L248
        L235:
            float r4 = r1.c
            float r5 = java.lang.Math.abs(r28)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L248
            float r4 = java.lang.Math.abs(r28)
            r1.c = r4
            goto L248
        L246:
            r23 = r5
        L248:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r6) goto L251
            float r1 = defpackage.c2.c(r3, r2)
            goto L274
        L251:
            if (r2 != 0) goto L258
            float r1 = r3.getXVelocity()
            goto L274
        L258:
            r4 = 1
            if (r2 != r4) goto L260
            float r1 = r3.getYVelocity()
            goto L274
        L260:
            java.util.Map r1 = defpackage.sl7.a
            java.lang.Object r1 = r1.get(r3)
            tl7 r1 = (defpackage.tl7) r1
            if (r1 == 0) goto L272
            r15 = 26
            if (r2 == r15) goto L26f
            goto L272
        L26f:
            float r1 = r1.c
            goto L274
        L272:
            r1 = r23
        L274:
            oj1 r2 = r0.b
            float r3 = r2.g()
            float r3 = r3 * r1
            float r1 = java.lang.Math.signum(r3)
            if (r12 != 0) goto L28f
            float r4 = r0.d
            float r4 = java.lang.Math.signum(r4)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L292
            int r1 = (r1 > r23 ? 1 : (r1 == r23 ? 0 : -1))
            if (r1 == 0) goto L292
        L28f:
            r2.k()
        L292:
            float r1 = java.lang.Math.abs(r3)
            r17 = 0
            r4 = r10[r17]
            float r4 = (float) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 >= 0) goto L2a0
        L29f:
            return
        L2a0:
            r16 = 1
            r1 = r10[r16]
            int r4 = -r1
            float r4 = (float) r4
            float r1 = (float) r1
            float r1 = java.lang.Math.min(r3, r1)
            float r1 = java.lang.Math.max(r4, r1)
            boolean r2 = r2.c(r1)
            if (r2 == 0) goto L2b7
            r5 = r1
            goto L2b9
        L2b7:
            r5 = r23
        L2b9:
            r0.d = r5
            return
    }
}
