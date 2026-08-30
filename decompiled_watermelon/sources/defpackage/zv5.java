package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import defpackage.y57;
import java.util.BitSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zv5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zv5 implements ki2 {
    public final /* synthetic */ int A;

    public /* synthetic */ zv5(int i) {
        this.A = i;
    }

    @Override // defpackage.ki2
    public final Object c() {
        at5 at5Var;
        WindowLayoutComponent a;
        Object obj;
        switch (this.A) {
            case 0:
                return new fw5(0);
            case 1:
                tv0 tv0Var = cz5.a;
                return null;
            case 2:
                return new m36();
            case 3:
                return Long.valueOf(System.currentTimeMillis());
            case 4:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object invoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                    invoke.getClass();
                    str = (String) invoke;
                } catch (Exception unused) {
                }
                ip3 C = l07.C();
                for (String str2 : zg6.P0(str, new char[]{','}, 6)) {
                    try {
                        C.add(Long.valueOf(Long.parseLong(str2)));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet valueOf = BitSet.valueOf(tq0.o1(l07.t(C)));
                int size = valueOf.size();
                if (size == 0) {
                    return up1.A;
                }
                m16 m16Var = new m16(size);
                for (int i = 0; i >= 0; i = valueOf.nextSetBit(i + 1)) {
                    if (valueOf.get(i)) {
                        m16Var.add(Integer.valueOf(i));
                    }
                    if (i == Integer.MAX_VALUE) {
                        return hi2.e(m16Var);
                    }
                }
                return hi2.e(m16Var);
            case 5:
                tv0 tv0Var2 = ko6.a;
                return null;
            case ig7.b /* 6 */:
                return d17.a;
            case 7:
                return new a33(0L);
            case 8:
                return new a33(0L);
            case 9:
                return zb1.a;
            case 10:
                return Boolean.TRUE;
            case 11:
                return new c17(null, null, null, null, null, null, null, 16383);
            case mj2.L /* 12 */:
                y57.b bVar = y57.Companion;
                return new zt(as3.a, 0);
            case 13:
                return kd7.a;
            case 14:
                try {
                    ClassLoader classLoader = pe7.class.getClassLoader();
                    if (classLoader != null) {
                        at5Var = new at5(classLoader, new zz0(classLoader, 0));
                    } else {
                        at5Var = null;
                    }
                    if (at5Var == null || (a = at5Var.a()) == null) {
                        return null;
                    }
                    zz0 zz0Var = new zz0(classLoader, 0);
                    int a2 = a42.a();
                    if (a2 >= 9) {
                        obj = new x32(a, zz0Var);
                    } else if (a2 >= 6) {
                        obj = new x32(a, zz0Var);
                    } else if (a2 >= 2) {
                        obj = new x32(a, zz0Var);
                    } else if (a2 == 1) {
                        obj = new w32(a, zz0Var);
                    } else {
                        obj = new Object();
                    }
                    return obj;
                } catch (Throwable unused3) {
                    return null;
                }
            case ig7.e /* 15 */:
                return new k45(0);
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ zv5(int i, Object obj) {
        this.A = i;
    }
}
