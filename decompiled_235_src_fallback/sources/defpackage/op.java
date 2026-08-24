package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op  reason: default package */
/* loaded from: classes.dex */
public final class op {
    public final /* synthetic */ int a;
    public final java.lang.Object b;

    public op(android.os.Vibrator r1, int r2) {
            r0 = this;
            r0.a = r2
            r1.getClass()
            switch(r2) {
                case 1: goto Le;
                default: goto L8;
            }
        L8:
            r0.<init>()
            r0.b = r1
            return
        Le:
            r0.<init>()
            r0.b = r1
            return
    }

    public op(java.util.ArrayList r2) {
            r1 = this;
            r0 = 2
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public final void a() {
            r4 = this;
            int r0 = r4.a
            r1 = 2
            r2 = 1
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L1f;
                default: goto L9;
            }
        L9:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L1e
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            op r2 = (defpackage.op) r2
            r2.a()
            goto L10
        L1e:
            return
        L1f:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            long[] r0 = new long[r1]
            r0 = {x0052: FILL_ARRAY_DATA  , data: [0, 100} // fill-array
            r4.vibrate(r0, r2)
            return
        L2a:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            long[] r0 = new long[r1]
            r0 = {x005e: FILL_ARRAY_DATA  , data: [0, 100} // fill-array
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 36
            if (r1 < r3) goto L46
            android.os.VibrationEffect r0 = defpackage.k2.f(r0)
            android.os.VibrationEffect r0 = defpackage.np.c(r0)
            r0.getClass()
            defpackage.k2.B(r4, r0)
            goto L49
        L46:
            r4.vibrate(r0, r2)
        L49:
            return
    }

    public final void b() {
            r3 = this;
            int r0 = r3.a
            java.lang.Object r3 = r3.b
            switch(r0) {
                case 0: goto L23;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r3.get(r1)
            int r1 = r1 + 1
            op r2 = (defpackage.op) r2
            r2.b()
            goto Le
        L1c:
            return
        L1d:
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            r3.cancel()
            return
        L23:
            android.os.Vibrator r3 = (android.os.Vibrator) r3
            r3.cancel()
            return
    }

    public final boolean c() {
            r4 = this;
            int r0 = r4.a
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 0: goto L2f;
                case 1: goto L28;
                default: goto L7;
            }
        L7:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L11
            goto L27
        L11:
            int r0 = r4.size()
            r2 = r1
        L16:
            if (r2 >= r0) goto L27
            java.lang.Object r3 = r4.get(r2)
            int r2 = r2 + 1
            op r3 = (defpackage.op) r3
            boolean r3 = r3.c()
            if (r3 == 0) goto L16
            r1 = 1
        L27:
            return r1
        L28:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            boolean r4 = r4.hasVibrator()
            return r4
        L2f:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            boolean r4 = r4.hasVibrator()
            return r4
    }

    public final boolean d() {
            r4 = this;
            int r0 = r4.a
            java.lang.Object r4 = r4.b
            r1 = 0
            switch(r0) {
                case 0: goto L29;
                case 1: goto L28;
                default: goto L8;
            }
        L8:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L11
            goto L27
        L11:
            int r0 = r4.size()
            r2 = r1
        L16:
            if (r2 >= r0) goto L27
            java.lang.Object r3 = r4.get(r2)
            int r2 = r2 + 1
            op r3 = (defpackage.op) r3
            boolean r3 = r3.d()
            if (r3 != 0) goto L16
            goto L28
        L27:
            r1 = 1
        L28:
            return r1
        L29:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            boolean r4 = defpackage.k2.x(r4)
            return r4
    }

    public final void e(int r5, int r6) {
            r4 = this;
            int r0 = r4.a
            java.lang.Object r4 = r4.b
            switch(r0) {
                case 0: goto L24;
                case 1: goto L1d;
                default: goto L7;
            }
        L7:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            int r0 = r4.size()
            r1 = 0
        Le:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1 + 1
            op r2 = (defpackage.op) r2
            r2.e(r5, r6)
            goto Le
        L1c:
            return
        L1d:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            long r5 = (long) r5
            r4.vibrate(r5)
            return
        L24:
            android.os.Vibrator r4 = (android.os.Vibrator) r4
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            r2 = 1
            r3 = 255(0xff, float:3.57E-43)
            if (r0 < r1) goto L4e
            r0 = 35
            if (r5 > r0) goto L38
            android.os.VibrationEffect r5 = defpackage.od.e()
            goto L4a
        L38:
            r0 = 70
            if (r5 > r0) goto L41
            android.os.VibrationEffect r5 = defpackage.od.u()
            goto L4a
        L41:
            long r0 = (long) r5
            int r5 = defpackage.gi2.q(r6, r2, r3)
            android.os.VibrationEffect r5 = defpackage.k2.e(r5, r0)
        L4a:
            defpackage.k2.r(r4, r5)
            goto L5a
        L4e:
            long r0 = (long) r5
            int r5 = defpackage.gi2.q(r6, r2, r3)
            android.os.VibrationEffect r5 = defpackage.k2.e(r5, r0)
            defpackage.k2.r(r4, r5)
        L5a:
            return
    }
}
