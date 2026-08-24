package defpackage;

import android.net.Uri;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc1  reason: default package */
/* loaded from: classes.dex */
public final class lc1 {
    public static final lc1 a = new Object();
    public static volatile WeakReference b = new WeakReference(null);
    public static volatile boolean c;
    public static volatile Boolean d;
    public static volatile long e;

    public static boolean a() {
        sz1 sz1Var;
        de5 de5Var;
        EmulatorActivity emulatorActivity = (EmulatorActivity) b.get();
        hy1 hy1Var = null;
        if (emulatorActivity != null) {
            sz1Var = d(emulatorActivity);
        } else {
            sz1Var = null;
        }
        if (sz1Var != null && (de5Var = sz1Var.q0) != null) {
            hy1Var = (hy1) de5Var.A.getValue();
        }
        return hy1Var instanceof dy1;
    }

    public static void b(Uri uri, String str) {
        uri.getClass();
        str.getClass();
        Boolean bool = d;
        d = null;
        Boolean bool2 = Boolean.TRUE;
        int i = 0;
        if (nb3.k(bool, bool2)) {
            c = true;
            MelonEmulator.a.pauseEmulation();
        } else if (nb3.k(bool, Boolean.FALSE)) {
            c = false;
        }
        if (nb3.k(bool, bool2)) {
            i = 1;
        } else if (!nb3.k(bool, Boolean.FALSE)) {
            if (bool == null) {
                i = -1;
            } else {
                i.d();
                return;
            }
        }
        Log.w("DebugCommand", "action=rom_ready name=" + str + " uri=" + uri + " pauseAfter=" + i);
    }

    public static boolean c() {
        sz1 d2;
        EmulatorActivity emulatorActivity = (EmulatorActivity) b.get();
        if (emulatorActivity == null || (d2 = d(emulatorActivity)) == null) {
            return false;
        }
        emulatorActivity.runOnUiThread(new n0(d2, 14));
        return true;
    }

    public static sz1 d(EmulatorActivity emulatorActivity) {
        go3 go3Var;
        Object obj;
        try {
            Field declaredField = EmulatorActivity.class.getDeclaredField("C0");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(emulatorActivity);
            if (obj2 instanceof go3) {
                go3Var = (go3) obj2;
            } else {
                go3Var = null;
            }
            if (go3Var != null) {
                obj = go3Var.getValue();
            } else {
                obj = null;
            }
            if (!(obj instanceof sz1)) {
                return null;
            }
            return (sz1) obj;
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
    */
    public final Object f(long j, s41 s41Var) {
        kc1 kc1Var;
        int i;
        kc1 kc1Var2;
        long j2;
        long j3;
        if (s41Var instanceof kc1) {
            kc1Var = (kc1) s41Var;
            int i2 = kc1Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kc1Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = kc1Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = kc1Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        j3 = kc1Var.X;
                        long j4 = kc1Var.R;
                        oi2.Y(obj);
                        kc1Var2 = kc1Var;
                        j2 = j4;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (a()) {
                        return Boolean.TRUE;
                    }
                    long nanoTime = System.nanoTime();
                    long j5 = 1;
                    if (j >= 1) {
                        j5 = j;
                    }
                    kc1Var2 = kc1Var;
                    j2 = j;
                    j3 = (j5 * 1000000) + nanoTime;
                }
                while (System.nanoTime() < j3) {
                    if (a()) {
                        return Boolean.TRUE;
                    }
                    kc1Var2.R = j2;
                    kc1Var2.X = j3;
                    kc1Var2.d0 = 1;
                    if (q60.t(100L, kc1Var2) == x61Var) {
                        return x61Var;
                    }
                }
                return Boolean.FALSE;
            }
        }
        kc1Var = new kc1(this, s41Var);
        Object obj2 = kc1Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kc1Var.d0;
        if (i == 0) {
        }
        while (System.nanoTime() < j3) {
        }
        return Boolean.FALSE;
    }
}
