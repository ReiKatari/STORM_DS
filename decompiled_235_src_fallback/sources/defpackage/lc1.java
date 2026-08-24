package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc1  reason: default package */
/* loaded from: classes.dex */
public final class lc1 {
    public static final defpackage.lc1 a = null;
    public static volatile java.lang.ref.WeakReference b;
    public static volatile boolean c;
    public static volatile java.lang.Boolean d;
    public static volatile long e;

    static {
            lc1 r0 = new lc1
            r0.<init>()
            defpackage.lc1.a = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            defpackage.lc1.b = r0
            return
    }

    public static boolean a() {
            java.lang.ref.WeakReference r0 = defpackage.lc1.b
            java.lang.Object r0 = r0.get()
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            r1 = 0
            if (r0 == 0) goto L10
            sz1 r0 = d(r0)
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto L20
            de5 r0 = r0.q0
            if (r0 == 0) goto L20
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            hy1 r1 = (defpackage.hy1) r1
        L20:
            boolean r0 = r1 instanceof defpackage.dy1
            return r0
    }

    public static void b(android.net.Uri r5, java.lang.String r6) {
            r5.getClass()
            r6.getClass()
            java.lang.Boolean r0 = defpackage.lc1.d
            r1 = 0
            defpackage.lc1.d = r1
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            boolean r2 = defpackage.nb3.k(r0, r1)
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1d
            defpackage.lc1.c = r4
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            r2.pauseEmulation()
            goto L27
        L1d:
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            boolean r2 = defpackage.nb3.k(r0, r2)
            if (r2 == 0) goto L27
            defpackage.lc1.c = r3
        L27:
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L2f
            r3 = r4
            goto L3b
        L2f:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L38
            goto L3b
        L38:
            if (r0 != 0) goto L5f
            r3 = -1
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "action=rom_ready name="
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = " uri="
            r0.append(r6)
            r0.append(r5)
            java.lang.String r5 = " pauseAfter="
            r0.append(r5)
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            java.lang.String r6 = "DebugCommand"
            android.util.Log.w(r6, r5)
            return
        L5f:
            defpackage.i.d()
            return
    }

    public static boolean c() {
            java.lang.ref.WeakReference r0 = defpackage.lc1.b
            java.lang.Object r0 = r0.get()
            me.magnum.melonds.ui.emulator.EmulatorActivity r0 = (me.magnum.melonds.ui.emulator.EmulatorActivity) r0
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            sz1 r1 = d(r0)
            if (r1 != 0) goto L13
        L11:
            r0 = 0
            return r0
        L13:
            n0 r2 = new n0
            r3 = 14
            r2.<init>(r1, r3)
            r0.runOnUiThread(r2)
            r0 = 1
            return r0
    }

    public static defpackage.sz1 d(me.magnum.melonds.ui.emulator.EmulatorActivity r3) {
            r0 = 0
            java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity> r1 = me.magnum.melonds.ui.emulator.EmulatorActivity.class
            java.lang.String r2 = "C0"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.ReflectiveOperationException -> L18
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.ReflectiveOperationException -> L18
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.ReflectiveOperationException -> L18
            boolean r1 = r3 instanceof defpackage.go3     // Catch: java.lang.ReflectiveOperationException -> L18
            if (r1 == 0) goto L1a
            go3 r3 = (defpackage.go3) r3     // Catch: java.lang.ReflectiveOperationException -> L18
            goto L1b
        L18:
            r3 = move-exception
            goto L2b
        L1a:
            r3 = r0
        L1b:
            if (r3 == 0) goto L22
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.ReflectiveOperationException -> L18
            goto L23
        L22:
            r3 = r0
        L23:
            boolean r1 = r3 instanceof defpackage.sz1     // Catch: java.lang.ReflectiveOperationException -> L18
            if (r1 == 0) goto L2a
            sz1 r3 = (defpackage.sz1) r3     // Catch: java.lang.ReflectiveOperationException -> L18
            return r3
        L2a:
            return r0
        L2b:
            java.lang.String r1 = "DebugCommand"
            java.lang.String r2 = "Failed to resolve EmulatorViewModel from EmulatorActivity"
            android.util.Log.w(r1, r2, r3)
            return r0
    }

    public static void e(boolean r4) {
            defpackage.lc1.c = r4
            long r0 = defpackage.lc1.e
            r2 = 1
            long r0 = r0 + r2
            defpackage.lc1.e = r0
            return
    }

    public final java.lang.Object f(long r10, defpackage.s41 r12) {
            r9 = this;
            boolean r0 = r12 instanceof defpackage.kc1
            if (r0 == 0) goto L13
            r0 = r12
            kc1 r0 = (defpackage.kc1) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            kc1 r0 = new kc1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r9 = r0.Y
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.d0
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            long r10 = r0.X
            long r3 = r0.R
            defpackage.oi2.Y(r9)
            r9 = r0
            r0 = r3
            goto L54
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L34:
            defpackage.oi2.Y(r9)
            boolean r9 = a()
            if (r9 == 0) goto L40
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L40:
            long r3 = java.lang.System.nanoTime()
            r5 = 1
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L4b
            goto L4c
        L4b:
            r5 = r10
        L4c:
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r7
            long r5 = r5 + r3
            r9 = r0
            r0 = r10
            r10 = r5
        L54:
            long r3 = java.lang.System.nanoTime()
            int r3 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r3 >= 0) goto L74
            boolean r3 = a()
            if (r3 == 0) goto L65
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        L65:
            r9.R = r0
            r9.X = r10
            r9.d0 = r2
            r3 = 100
            java.lang.Object r3 = defpackage.q60.t(r3, r9)
            if (r3 != r12) goto L54
            return r12
        L74:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
    }
}
