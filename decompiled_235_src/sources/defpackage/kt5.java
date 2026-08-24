package defpackage;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.google.android.gms.common.api.CommonStatusCodes;
import defpackage.tj7;
import java.util.BitSet;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kt5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kt5 implements on2 {
    public final /* synthetic */ int A;

    public /* synthetic */ kt5(int i) {
        this.A = i;
    }

    @Override // defpackage.on2
    public final Object c() {
        x36 x36Var;
        WindowLayoutComponent a;
        Object obj;
        switch (this.A) {
            case 0:
                return new ep3(12, (byte) 0);
            case 1:
                return Integer.valueOf(((l0) vv5.getEntries()).a());
            case 2:
                return np2.Y(Boolean.FALSE);
            case 3:
                return new p46(new LinkedHashMap());
            case 4:
                nq6 nq6Var = s46.a;
                return null;
            case 5:
                nq6 nq6Var2 = v56.a;
                return null;
            case 6:
                return new s76(0);
            case 7:
                py0 py0Var = ra6.a;
                return null;
            case 8:
                return new ye6();
            case 9:
                return Long.valueOf(System.currentTimeMillis());
            case 10:
                String str = "";
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    Object invoke = cls.getMethod("get", String.class, String.class).invoke(cls, "ro.build.backported_fixes.alias_bitset.long_list", "");
                    invoke.getClass();
                    str = (String) invoke;
                } catch (Exception unused) {
                }
                kw3 I = hf.I();
                for (String str2 : qs6.J0(str, new char[]{','}, 6)) {
                    try {
                        I.add(Long.valueOf(Long.parseLong(str2)));
                    } catch (NumberFormatException unused2) {
                    }
                }
                BitSet valueOf = BitSet.valueOf(gt0.l1(hf.A(I)));
                int size = valueOf.size();
                if (size == 0) {
                    return du1.A;
                }
                ad6 ad6Var = new ad6(size);
                for (int i = 0; i >= 0; i = valueOf.nextSetBit(i + 1)) {
                    if (valueOf.get(i)) {
                        ad6Var.add(Integer.valueOf(i));
                    }
                    if (i == Integer.MAX_VALUE) {
                        return ii2.p(ad6Var);
                    }
                }
                return ii2.p(ad6Var);
            case 11:
                py0 py0Var2 = v07.a;
                return null;
            case 12:
                return ye7.a;
            case 13:
                return new i93(0L);
            case 14:
                return new i93(0L);
            case 15:
                return yf1.a;
            case 16:
                return Boolean.TRUE;
            case 17:
                return new xe7(null, null, null, null, null, null, null, null, null, null, null, 16383);
            case 18:
                tj7.b bVar = tj7.Companion;
                return new ru(fz3.a, 0);
            case 19:
                return fs7.a;
            case 20:
                try {
                    ClassLoader classLoader = rt7.class.getClassLoader();
                    if (classLoader != null) {
                        x36Var = new x36(classLoader, new e31(classLoader, 0));
                    } else {
                        x36Var = null;
                    }
                    if (x36Var == null || (a = x36Var.a()) == null) {
                        return null;
                    }
                    e31 e31Var = new e31(classLoader, 0);
                    int a2 = s82.a();
                    if (a2 >= 9) {
                        obj = new p82(a, e31Var);
                    } else if (a2 >= 6) {
                        obj = new p82(a, e31Var);
                    } else if (a2 >= 2) {
                        obj = new p82(a, e31Var);
                    } else if (a2 == 1) {
                        obj = new o82(a, e31Var);
                    } else {
                        obj = new Object();
                    }
                    return obj;
                } catch (Throwable unused3) {
                    return null;
                }
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new xd5(0);
            default:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
        }
    }

    public /* synthetic */ kt5(Object obj, int i) {
        this.A = i;
    }
}
