package defpackage;

import android.net.Uri;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u81  reason: default package */
/* loaded from: classes.dex */
public final class u81 {
    public static final u81 a = new Object();
    public static volatile WeakReference b = new WeakReference(null);
    public static volatile boolean c;
    public static volatile Boolean d;
    public static volatile long e;

    public static boolean a() {
        hv1 hv1Var;
        q45 q45Var;
        EmulatorActivity emulatorActivity = (EmulatorActivity) b.get();
        wt1 wt1Var = null;
        if (emulatorActivity != null) {
            hv1Var = d(emulatorActivity);
        } else {
            hv1Var = null;
        }
        if (hv1Var != null && (q45Var = hv1Var.q0) != null) {
            wt1Var = (wt1) q45Var.A.getValue();
        }
        return wt1Var instanceof st1;
    }

    public static void b(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        Boolean bool = d;
        d = null;
        Boolean bool2 = Boolean.TRUE;
        int i = 0;
        if (b53.x(bool, bool2)) {
            c = true;
            MelonEmulator.a.pauseEmulation();
        } else if (b53.x(bool, Boolean.FALSE)) {
            c = false;
        }
        if (b53.x(bool, bool2)) {
            i = 1;
        } else if (!b53.x(bool, Boolean.FALSE)) {
            if (bool == null) {
                i = -1;
            } else {
                i.c();
                return;
            }
        }
        Log.w("DebugCommand", "action=rom_ready name=" + str + " uri=" + uri + " pauseAfter=" + i);
    }

    public static boolean c() {
        hv1 d2;
        EmulatorActivity emulatorActivity = (EmulatorActivity) b.get();
        if (emulatorActivity == null || (d2 = d(emulatorActivity)) == null) {
            return false;
        }
        emulatorActivity.runOnUiThread(new m0(14, d2));
        return true;
    }

    public static hv1 d(EmulatorActivity emulatorActivity) {
        gh3 gh3Var;
        Object obj;
        try {
            Field declaredField = EmulatorActivity.class.getDeclaredField("B0");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(emulatorActivity);
            if (obj2 instanceof gh3) {
                gh3Var = (gh3) obj2;
            } else {
                gh3Var = null;
            }
            if (gh3Var != null) {
                obj = gh3Var.getValue();
            } else {
                obj = null;
            }
            if (!(obj instanceof hv1)) {
                return null;
            }
            return (hv1) obj;
        } catch (ReflectiveOperationException e2) {
            Log.w("DebugCommand", "Failed to resolve EmulatorViewModel from EmulatorActivity", e2);
            return null;
        }
    }

    public static void e(boolean z) {
        c = z;
        e++;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(long r10, defpackage.k11 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.t81
            if (r0 == 0) goto L13
            r0 = r12
            t81 r0 = (defpackage.t81) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            t81 r0 = new t81
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r9 = r0.Y
            p31 r12 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.c0
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            long r10 = r0.X
            long r3 = r0.R
            defpackage.me2.a0(r9)
            r9 = r0
            r0 = r3
            goto L54
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            r9 = 0
            return r9
        L34:
            defpackage.me2.a0(r9)
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
            r9.c0 = r2
            r3 = 100
            java.lang.Object r3 = defpackage.dk7.q(r3, r9)
            if (r3 != r12) goto L54
            return r12
        L74:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u81.f(long, k11):java.lang.Object");
    }
}
