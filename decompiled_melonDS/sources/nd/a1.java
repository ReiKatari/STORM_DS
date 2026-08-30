package nd;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a1 {

    /* renamed from: a  reason: collision with root package name */
    public static final ld.e[] f10266a = new ld.e[0];

    /* renamed from: b  reason: collision with root package name */
    public static final jd.a[] f10267b = new jd.a[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10268c = new Object();

    public static final g0 a(String str, jd.a aVar) {
        return new g0(str, new h0(aVar));
    }

    public static final Set b(ld.e eVar) {
        eVar.getClass();
        if (eVar instanceof l) {
            return ((l) eVar).g();
        }
        HashSet hashSet = new HashSet(eVar.d());
        int d4 = eVar.d();
        for (int i2 = 0; i2 < d4; i2++) {
            hashSet.add(eVar.e(i2));
        }
        return hashSet;
    }

    public static final ld.e[] c(List list) {
        ld.e[] eVarArr;
        list = (list == null || list.isEmpty()) ? null : null;
        if (list != null && (eVarArr = (ld.e[]) list.toArray(new ld.e[0])) != null) {
            return eVarArr;
        }
        return f10266a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(2:72|(1:78)(2:80|81)))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ad, code lost:
        if (r11 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f3, code lost:
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0191 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0176 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015e A[Catch: NoSuchFieldException -> 0x018e, TryCatch #0 {NoSuchFieldException -> 0x018e, blocks: (B:79:0x0150, B:81:0x015e, B:90:0x017b, B:92:0x0181, B:94:0x0187, B:96:0x018b, B:86:0x0173), top: B:112:0x0150 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018b A[Catch: NoSuchFieldException -> 0x018e, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x018e, blocks: (B:79:0x0150, B:81:0x015e, B:90:0x017b, B:92:0x0181, B:94:0x0187, B:96:0x018b, B:86:0x0173), top: B:112:0x0150 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jd.a d(java.lang.Class r17, jd.a... r18) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.a1.d(java.lang.Class, jd.a[]):jd.a");
    }

    public static final int e(ld.e eVar, ld.e[] eVarArr) {
        boolean z10;
        boolean z11;
        int i2;
        eVarArr.getClass();
        int hashCode = (eVar.b().hashCode() * 31) + Arrays.hashCode(eVarArr);
        int d4 = eVar.d();
        int i10 = 1;
        while (true) {
            int i11 = 0;
            if (d4 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            int i12 = d4 - 1;
            int i13 = i10 * 31;
            String b10 = eVar.j(eVar.d() - d4).b();
            if (b10 != null) {
                i11 = b10.hashCode();
            }
            i10 = i13 + i11;
            d4 = i12;
        }
        int d10 = eVar.d();
        int i14 = 1;
        while (true) {
            if (d10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                int i15 = d10 - 1;
                int i16 = i14 * 31;
                d0.d c4 = eVar.j(eVar.d() - d10).c();
                if (c4 != null) {
                    i2 = c4.hashCode();
                } else {
                    i2 = 0;
                }
                i14 = i16 + i2;
                d10 = i15;
            } else {
                return (((hashCode * 31) + i10) * 31) + i14;
            }
        }
    }

    public static final jd.a f(Object obj, jd.a... aVarArr) {
        Class[] clsArr;
        try {
            if (aVarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = aVarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = jd.a.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(aVarArr, aVarArr.length));
            if (invoke instanceof jd.a) {
                return (jd.a) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e6) {
            Throwable cause = e6.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e6.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e6;
        }
    }

    public static final boolean g(nc.e eVar) {
        eVar.getClass();
        Class a10 = eVar.a();
        a10.getClass();
        return a10.isInterface();
    }

    public static final nc.e h(tc.d dVar) {
        nc.e c4 = dVar.c();
        if (c4 instanceof nc.e) {
            return c4;
        }
        fj.j.r(c4, "Only KClass supported as classifier, got ");
        return null;
    }

    public static final String i(nc.e eVar) {
        eVar.getClass();
        String c4 = eVar.c();
        if (c4 == null) {
            c4 = "<local class name not available>";
        }
        return kc.a.g("Serializer for class '", c4, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final void j(int i2, int i10, ld.e eVar) {
        String str;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i11 = (~i2) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(eVar.e(i12));
            }
            i11 >>>= 1;
        }
        String b10 = eVar.b();
        b10.getClass();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + b10 + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + b10 + "', but they were missing";
        }
        throw new jd.b(str, null, arrayList, b10);
    }

    public static final void k(String str, nc.e eVar) {
        String sb2;
        eVar.getClass();
        String str2 = "in the polymorphic scope of '" + eVar.c() + '\'';
        if (str == null) {
            sb2 = kc.a.c('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder k10 = kc.a.k("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            w.d.B(k10, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            k10.append(eVar.c());
            k10.append("' has to be sealed and '@Serializable'.");
            sb2 = k10.toString();
        }
        throw new IllegalArgumentException(sb2);
    }

    public static final String l(ld.e eVar) {
        sc.d L = p7.j.L(0, eVar.d());
        return zb.l.Y(L, ", ", eVar.b() + '(', ")", new n1.g(1, eVar), 24);
    }
}
