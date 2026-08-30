package pd;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final u f11602a = new Object();

    public static final p a(Number number, String str, String str2) {
        str.getClass();
        str2.getClass();
        return d(-1, "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) n(-1, str2)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.IllegalArgumentException, pd.r] */
    public static final r b(Number number, String str) {
        str.getClass();
        return new IllegalArgumentException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) n(-1, str)));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.IllegalArgumentException, pd.r] */
    public static final r c(ld.e eVar) {
        return new IllegalArgumentException("Value of type '" + eVar.b() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + eVar.c() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [pd.p, java.lang.IllegalArgumentException] */
    public static final p d(int i2, String str) {
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new IllegalArgumentException(str);
    }

    public static final p e(int i2, String str, CharSequence charSequence) {
        charSequence.getClass();
        return d(i2, str + "\nJSON input: " + ((Object) n(i2, charSequence)));
    }

    public static final ld.e f(ld.e eVar, k0.g gVar) {
        eVar.getClass();
        gVar.getClass();
        if (nc.k.a(eVar.c(), ld.h.f9042o)) {
            a.a.u(eVar);
            return eVar;
        } else if (eVar.f()) {
            return f(eVar.j(0), gVar);
        } else {
            return eVar;
        }
    }

    public static final byte g(char c4) {
        if (c4 < '~') {
            return j.f11590b[c4];
        }
        return (byte) 0;
    }

    public static final String h(ld.e eVar, od.c cVar) {
        eVar.getClass();
        cVar.getClass();
        for (Annotation annotation : eVar.getAnnotations()) {
            if (annotation instanceof od.i) {
                return ((od.i) annotation).discriminator();
            }
        }
        return (String) cVar.f10885a.f9969f;
    }

    public static final void i(od.c cVar, n nVar, jd.a aVar, Object obj) {
        aVar.getClass();
        k0 k0Var = k0.OBJ;
        k0Var.getClass();
        new g0(new a0.l(nVar), cVar, k0Var, new g0[((zb.b) k0.getEntries()).a()]).n(aVar, obj);
    }

    public static final int j(ld.e eVar, od.c cVar, String str) {
        Object obj;
        eVar.getClass();
        cVar.getClass();
        str.getClass();
        o(eVar, cVar);
        int a10 = eVar.a(str);
        if (a10 != -3 || !cVar.f10885a.f9967d) {
            return a10;
        }
        l.i0 i0Var = cVar.f10887c;
        a3.e eVar2 = new a3.e(29, eVar, cVar);
        i0Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) i0Var.B;
        Map map = (Map) concurrentHashMap.get(eVar);
        u uVar = f11602a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(uVar);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = eVar2.b();
            Object obj3 = concurrentHashMap.get(eVar);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(eVar, obj3);
            }
            ((Map) obj3).put(uVar, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int k(ld.e eVar, od.c cVar, String str, String str2) {
        eVar.getClass();
        cVar.getClass();
        str.getClass();
        int j2 = j(eVar, cVar, str);
        if (j2 != -3) {
            return j2;
        }
        String b10 = eVar.b();
        throw new IllegalArgumentException(b10 + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean l(ld.e eVar, od.c cVar) {
        eVar.getClass();
        cVar.getClass();
        if (!cVar.f10885a.f9965b) {
            List<Annotation> annotations = eVar.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof od.q) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void m(a aVar, String str) {
        aVar.o("Trailing comma before the end of JSON ".concat(str), aVar.f11551a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence n(int i2, CharSequence charSequence) {
        String str;
        int length;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i10 = i2 - 30;
                int i11 = i2 + 30;
                if (i10 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i11 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder t5 = w.d.t(str);
                if (i10 < 0) {
                    i10 = 0;
                }
                int length2 = charSequence.length();
                if (i11 > length2) {
                    i11 = length2;
                }
                t5.append(charSequence.subSequence(i10, i11).toString());
                t5.append(str2);
                return t5.toString();
            }
        }
        return charSequence;
    }

    public static final void o(ld.e eVar, od.c cVar) {
        eVar.getClass();
        cVar.getClass();
        nc.k.a(eVar.c(), ld.j.f9044o);
    }

    public static final Object p(od.c cVar, String str, od.z zVar, jd.a aVar) {
        cVar.getClass();
        str.getClass();
        return new w(cVar, zVar, str, aVar.e()).t(aVar);
    }

    public static final k0 q(ld.e eVar, od.c cVar) {
        eVar.getClass();
        d0.d c4 = eVar.c();
        if (c4 instanceof ld.c) {
            return k0.POLY_OBJ;
        }
        if (nc.k.a(c4, ld.j.f9045p)) {
            return k0.LIST;
        }
        if (nc.k.a(c4, ld.j.f9046q)) {
            ld.e f8 = f(eVar.j(0), cVar.f10886b);
            d0.d c10 = f8.c();
            if (!(c10 instanceof ld.d) && !nc.k.a(c10, ld.i.f9043o)) {
                throw c(f8);
            }
            return k0.MAP;
        }
        return k0.OBJ;
    }

    public static final void r(a aVar, Number number) {
        a.p(aVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String s(byte b10) {
        if (b10 == 1) {
            return "quotation mark '\"'";
        }
        if (b10 == 2) {
            return "string escape sequence '\\'";
        }
        if (b10 == 4) {
            return "comma ','";
        }
        if (b10 == 5) {
            return "colon ':'";
        }
        if (b10 == 6) {
            return "start of the object '{'";
        }
        if (b10 == 7) {
            return "end of the object '}'";
        }
        if (b10 == 8) {
            return "start of the array '['";
        }
        if (b10 == 9) {
            return "end of the array ']'";
        }
        if (b10 == 10) {
            return "end of the input";
        }
        if (b10 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
