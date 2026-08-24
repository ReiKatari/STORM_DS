package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e73  reason: default package */
/* loaded from: classes.dex */
public final class e73 {
    public static final int[] k = null;
    public static final int[] l = null;
    public final defpackage.u41 a;
    public final defpackage.s03 b;
    public final defpackage.s03 c;
    public final java.util.LinkedHashMap d;
    public long e;
    public long f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;

    static {
            r0 = 6
            int[] r1 = new int[r0]
            r1 = {x0010: FILL_ARRAY_DATA  , data: [0, 15, 11, 12, 17, 18} // fill-array
            defpackage.e73.k = r1
            int[] r0 = new int[r0]
            r0 = {x0020: FILL_ARRAY_DATA  , data: [1, 16, 13, 14, 23, 22} // fill-array
            defpackage.e73.l = r0
            return
    }

    public e73(defpackage.u41 r7, defpackage.s03 r8, defpackage.s03 r9) {
            r6 = this;
            r7.getClass()
            r8.getClass()
            r9.getClass()
            r6.<init>()
            r6.a = r7
            r6.b = r8
            r6.c = r9
            java.util.ArrayList r7 = r7.b
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r9 = r7.size()
            r0 = 0
            r1 = r0
        L1f:
            if (r1 >= r9) goto L39
            java.lang.Object r2 = r7.get(r1)
            int r1 = r1 + 1
            i63 r2 = (defpackage.i63) r2
            h63 r3 = r2.b
            h63 r2 = r2.c
            h63[] r2 = new defpackage.h63[]{r3, r2}
            java.util.List r2 = defpackage.hf.c0(r2)
            defpackage.gt0.A0(r8, r2)
            goto L1f
        L39:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r9 = r8.size()
            r1 = r0
        L43:
            if (r1 >= r9) goto L69
            java.lang.Object r2 = r8.get(r1)
            int r1 = r1 + 1
            h63 r2 = (defpackage.h63) r2
            boolean r3 = r2 instanceof defpackage.e63
            r4 = 0
            if (r3 == 0) goto L55
            e63 r2 = (defpackage.e63) r2
            goto L56
        L55:
            r2 = r4
        L56:
            if (r2 == 0) goto L63
            b73 r4 = new b73
            java.lang.Integer r3 = r2.a
            int r5 = r2.b
            d63 r2 = r2.c
            r4.<init>(r3, r5, r2)
        L63:
            if (r4 == 0) goto L43
            r7.add(r4)
            goto L43
        L69:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r9 = 10
            int r9 = defpackage.ht0.v0(r7, r9)
            int r9 = defpackage.c14.k0(r9)
            r1 = 16
            if (r9 >= r1) goto L7a
            r9 = r1
        L7a:
            r8.<init>(r9)
            int r9 = r7.size()
            r1 = r0
        L82:
            if (r1 >= r9) goto L9b
            java.lang.Object r2 = r7.get(r1)
            int r1 = r1 + 1
            r3 = r2
            b73 r3 = (defpackage.b73) r3
            c73 r3 = new c73
            r3.<init>()
            r4 = 0
            r3.a = r4
            r3.b = r0
            r8.put(r2, r3)
            goto L82
        L9b:
            r6.d = r8
            return
    }

    public static float b(android.view.MotionEvent r7, int r8, int[] r9) {
            float r0 = r7.getAxisValue(r8)
            android.view.InputDevice r1 = r7.getDevice()
            if (r1 != 0) goto Lb
            goto L35
        Lb:
            int r2 = r7.getSource()
            android.view.InputDevice$MotionRange r2 = r1.getMotionRange(r8, r2)
            if (r2 != 0) goto L5f
            r2 = 16
            android.view.InputDevice$MotionRange r2 = r1.getMotionRange(r8, r2)
            if (r2 != 0) goto L5f
            r2 = 16777232(0x1000010, float:2.3509932E-38)
            android.view.InputDevice$MotionRange r2 = r1.getMotionRange(r8, r2)
            if (r2 != 0) goto L5f
            r2 = 1025(0x401, float:1.436E-42)
            android.view.InputDevice$MotionRange r2 = r1.getMotionRange(r8, r2)
            if (r2 != 0) goto L5f
            android.view.InputDevice$MotionRange r1 = r1.getMotionRange(r8)
            if (r1 == 0) goto L35
            goto L5f
        L35:
            float r1 = java.lang.Math.abs(r0)
            r2 = 953267991(0x38d1b717, float:1.0E-4)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L41
            goto L5f
        L41:
            float r1 = java.lang.Math.abs(r0)
            int r2 = r9.length
            r3 = 0
        L47:
            if (r3 >= r2) goto L5f
            r4 = r9[r3]
            if (r4 != r8) goto L4e
            goto L5c
        L4e:
            float r4 = r7.getAxisValue(r4)
            float r5 = java.lang.Math.abs(r4)
            int r6 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r6 <= 0) goto L5c
            r0 = r4
            r1 = r5
        L5c:
            int r3 = r3 + 1
            goto L47
        L5f:
            return r0
    }

    public final boolean a(android.view.MotionEvent r15) {
            r14 = this;
            u41 r0 = r14.a
            kk6 r0 = r0.a
            boolean r1 = r0.b
            int r2 = r0.d
            int r3 = r0.c
            if (r1 == 0) goto Lf
            java.lang.Integer r1 = r0.a
            goto L10
        Lf:
            r1 = 0
        L10:
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L21
            int r6 = r1.intValue()
            android.view.InputDevice r6 = android.view.InputDevice.getDevice(r6)
            if (r6 == 0) goto L1f
            goto L21
        L1f:
            r6 = r4
            goto L22
        L21:
            r6 = r5
        L22:
            if (r1 == 0) goto L31
            int r7 = r15.getDeviceId()
            int r1 = r1.intValue()
            if (r1 == r7) goto L31
            if (r6 == 0) goto L31
            return r4
        L31:
            float r1 = r0.g
            r4 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = defpackage.gi2.p(r1, r4, r6)
            int[] r7 = defpackage.e73.k
            float r7 = b(r15, r3, r7)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = defpackage.gi2.p(r7, r8, r6)
            int[] r9 = defpackage.e73.l
            float r9 = b(r15, r2, r9)
            float r6 = defpackage.gi2.p(r9, r8, r6)
            boolean r8 = r0.e
            if (r8 == 0) goto L55
            float r7 = -r7
        L55:
            boolean r0 = r0.f
            if (r0 == 0) goto L5a
            float r6 = -r6
        L5a:
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L63
            r7 = r4
        L63:
            float r0 = java.lang.Math.abs(r6)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L6c
            r6 = r4
        L6c:
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            r0.setSlot2AnalogInput(r7, r6)
            long r8 = android.os.SystemClock.uptimeMillis()
            r14.f = r8
            float r0 = java.lang.Math.abs(r7)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L87
            float r0 = java.lang.Math.abs(r6)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L10c
        L87:
            long r10 = r14.e
            long r10 = r8 - r10
            r12 = 1500(0x5dc, double:7.41E-321)
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 < 0) goto L10c
            r14.e = r8
            int r14 = r15.getDeviceId()
            int r15 = r15.getSource()
            r0 = 16
            defpackage.g04.y(r0)
            java.lang.String r15 = java.lang.Integer.toString(r15, r0)
            r15.getClass()
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Float r4 = java.lang.Float.valueOf(r7)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r7 = "%.3f"
            java.lang.String r4 = java.lang.String.format(r0, r7, r4)
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r5)
            java.lang.String r6 = java.lang.String.format(r0, r7, r6)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)
            java.lang.String r0 = java.lang.String.format(r0, r7, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r7 = "slot2AnalogInput deviceId="
            r1.<init>(r7)
            r1.append(r14)
            java.lang.String r14 = " source=0x"
            r1.append(r14)
            r1.append(r15)
            java.lang.String r14 = " axisX="
            r1.append(r14)
            java.lang.String r14 = " axisY="
            java.lang.String r15 = " x="
            defpackage.lb1.x(r1, r3, r14, r2, r15)
            java.lang.String r14 = " y="
            java.lang.String r15 = " deadzone="
            defpackage.i61.B(r1, r4, r14, r6, r15)
            r1.append(r0)
            java.lang.String r14 = r1.toString()
            java.lang.String r15 = "InputProcessor"
            android.util.Log.w(r15, r14)
        L10c:
            return r5
    }

    public final void c(defpackage.b63 r8, boolean r9, boolean r10) {
            r7 = this;
            if (r10 != 0) goto L4
            goto La0
        L4:
            int[] r10 = defpackage.d73.b
            int r8 = r8.ordinal()
            r8 = r10[r8]
            r10 = 1
            if (r8 == r10) goto L23
            r0 = 2
            if (r8 == r0) goto L20
            r0 = 3
            if (r8 == r0) goto L1d
            r0 = 4
            if (r8 == r0) goto L1a
            goto La0
        L1a:
            r7.j = r9
            goto L25
        L1d:
            r7.i = r9
            goto L25
        L20:
            r7.h = r9
            goto L25
        L23:
            r7.g = r9
        L25:
            long r8 = android.os.SystemClock.uptimeMillis()
            long r0 = r7.f
            long r0 = r8 - r0
            r2 = 150(0x96, double:7.4E-322)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L35
            goto La0
        L35:
            boolean r0 = r7.g
            boolean r1 = r7.h
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            if (r0 != r1) goto L42
            r0 = r4
            goto L47
        L42:
            if (r0 == 0) goto L46
            r0 = r3
            goto L47
        L46:
            r0 = r2
        L47:
            boolean r1 = r7.i
            boolean r5 = r7.j
            if (r1 != r5) goto L4f
            r2 = r4
            goto L52
        L4f:
            if (r1 == 0) goto L52
            r2 = r3
        L52:
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            r1.setSlot2AnalogInput(r0, r2)
            float r1 = java.lang.Math.abs(r0)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L67
            float r1 = java.lang.Math.abs(r2)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto La0
        L67:
            long r3 = r7.e
            long r3 = r8 - r3
            r5 = 1500(0x5dc, double:7.41E-321)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto La0
            r7.e = r8
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Float r8 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r10)
            java.lang.String r9 = "%.3f"
            java.lang.String r8 = java.lang.String.format(r7, r9, r8)
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r10 = java.util.Arrays.copyOf(r0, r10)
            java.lang.String r7 = java.lang.String.format(r7, r9, r10)
            java.lang.String r9 = "slot2AnalogInput source=digital-fallback x="
            java.lang.String r10 = " y="
            java.lang.String r0 = "InputProcessor"
            defpackage.lb1.w(r9, r8, r10, r7, r0)
        La0:
            return
    }
}
