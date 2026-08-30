package e7;

import a7.k0;
import ai.v0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import m9.o;
import nc.u;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static final k f4379a = new k(5, true);

    /* renamed from: b  reason: collision with root package name */
    public static final k f4380b = new k(1, true);

    /* renamed from: c  reason: collision with root package name */
    public static final k f4381c = new k(3, false);

    /* renamed from: d  reason: collision with root package name */
    public static final k f4382d = new k(2, true);

    /* renamed from: e  reason: collision with root package name */
    public static final k f4383e = new k(4, true);

    /* renamed from: f  reason: collision with root package name */
    public static final k f4384f = new k(6, true);

    /* renamed from: g  reason: collision with root package name */
    public static final k f4385g = new k(7, false);

    /* renamed from: h  reason: collision with root package name */
    public static final c f4386h = new c(2, true);

    /* renamed from: i  reason: collision with root package name */
    public static final c f4387i = new c(3, true);

    /* renamed from: j  reason: collision with root package name */
    public static final c f4388j = new c(0, true);

    /* renamed from: k  reason: collision with root package name */
    public static final c f4389k = new c(1, true);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
        if (r8 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final a7.k0 a(ld.e r7, java.util.Map r8) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.d.a(ld.e, java.util.Map):a7.k0");
    }

    public static final int b(jd.a aVar) {
        int hashCode = aVar.e().b().hashCode();
        int d4 = aVar.e().d();
        for (int i2 = 0; i2 < d4; i2++) {
            hashCode = (hashCode * 31) + aVar.e().e(i2).hashCode();
        }
        return hashCode;
    }

    public static final String c(Object obj, LinkedHashMap linkedHashMap) {
        obj.getClass();
        jd.a Y = aj.g.Y(u.a(obj.getClass()));
        j jVar = new j(Y, linkedHashMap);
        Y.d(jVar, obj);
        Map I = v.I(jVar.f4399h);
        b9.e eVar = new b9.e(Y);
        v0 v0Var = new v0(1, I, eVar);
        int d4 = Y.e().d();
        for (int i2 = 0; i2 < d4; i2++) {
            String e6 = Y.e().e(i2);
            k0 k0Var = (k0) linkedHashMap.get(e6);
            if (k0Var != null) {
                v0Var.i(Integer.valueOf(i2), e6, k0Var);
            } else {
                o.g(kc.a.c(']', "Cannot locate NavType for argument [", e6));
                return null;
            }
        }
        return ((String) eVar.L) + ((String) eVar.R) + ((String) eVar.X);
    }

    public static final Class d(ld.e eVar) {
        String T = vc.o.T(eVar.b(), "?", "");
        try {
            return Class.forName(T);
        } catch (ClassNotFoundException unused) {
            if (vc.h.Y(T, ".", false)) {
                Pattern compile = Pattern.compile("(\\.+)(?!.*\\.)");
                compile.getClass();
                String replaceAll = compile.matcher(T).replaceAll("\\$");
                replaceAll.getClass();
                return Class.forName(replaceAll);
            }
            String str = "Cannot find class with name \"" + eVar.b() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (eVar.c() instanceof ld.i) {
                str = str.concat(".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            a0.j.h(str);
            return null;
        }
    }

    public static final boolean e(ld.e eVar) {
        eVar.getClass();
        if (nc.k.a(eVar.c(), ld.j.f9044o) && eVar.f() && eVar.d() == 1) {
            return true;
        }
        return false;
    }

    public static final e f(ld.e eVar) {
        String T = vc.o.T(eVar.b(), "?", "");
        if (nc.k.a(eVar.c(), ld.i.f9043o)) {
            if (eVar.h()) {
                return e.ENUM_NULLABLE;
            }
            return e.ENUM;
        } else if (T.equals("kotlin.Int")) {
            if (eVar.h()) {
                return e.INT_NULLABLE;
            }
            return e.INT;
        } else if (T.equals("kotlin.Boolean")) {
            if (eVar.h()) {
                return e.BOOL_NULLABLE;
            }
            return e.BOOL;
        } else if (T.equals("kotlin.Double")) {
            if (eVar.h()) {
                return e.DOUBLE_NULLABLE;
            }
            return e.DOUBLE;
        } else if (T.equals("kotlin.Float")) {
            if (eVar.h()) {
                return e.FLOAT_NULLABLE;
            }
            return e.FLOAT;
        } else if (T.equals("kotlin.Long")) {
            if (eVar.h()) {
                return e.LONG_NULLABLE;
            }
            return e.LONG;
        } else if (T.equals("kotlin.String")) {
            if (eVar.h()) {
                return e.STRING_NULLABLE;
            }
            return e.STRING;
        } else if (T.equals("kotlin.IntArray")) {
            return e.INT_ARRAY;
        } else {
            if (T.equals("kotlin.DoubleArray")) {
                return e.DOUBLE_ARRAY;
            }
            if (T.equals("kotlin.BooleanArray")) {
                return e.BOOL_ARRAY;
            }
            if (T.equals("kotlin.FloatArray")) {
                return e.FLOAT_ARRAY;
            }
            if (T.equals("kotlin.LongArray")) {
                return e.LONG_ARRAY;
            }
            if (T.equals("kotlin.Array")) {
                return e.ARRAY;
            }
            if (vc.o.V(T, "kotlin.collections.ArrayList", false)) {
                return e.LIST;
            }
            return e.UNKNOWN;
        }
    }

    public static final String g(String str, String str2, String str3, String str4) {
        StringBuilder k10 = kc.a.k("Route ", str3, " could not find any NavType for argument ", str, " of type ");
        k10.append(str2);
        k10.append(" - typeMap received was ");
        k10.append(str4);
        return k10.toString();
    }
}
