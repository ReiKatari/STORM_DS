package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: te3  reason: default package */
/* loaded from: classes.dex */
public abstract class te3 {
    public static final x31 a = new x31(1);

    public static final int a(wb6 wb6Var, id3 id3Var, String str) {
        Object obj;
        wb6Var.getClass();
        id3Var.getClass();
        str.getClass();
        d(id3Var, wb6Var);
        int d = wb6Var.d(str);
        if (d != -3 || !id3Var.a.e) {
            return d;
        }
        d51 d51Var = id3Var.c;
        ci2 ci2Var = new ci2(6, wb6Var, id3Var);
        d51Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) d51Var.B;
        Map map = (Map) concurrentHashMap.get(wb6Var);
        x31 x31Var = a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(x31Var);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = ci2Var.c();
            Object obj3 = concurrentHashMap.get(wb6Var);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(wb6Var, obj3);
            }
            ((Map) obj3).put(x31Var, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int b(wb6 wb6Var, id3 id3Var, String str, String str2) {
        wb6Var.getClass();
        id3Var.getClass();
        str.getClass();
        int a2 = a(wb6Var, id3Var, str);
        if (a2 != -3) {
            return a2;
        }
        String a3 = wb6Var.a();
        throw new IllegalArgumentException(a3 + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(id3 id3Var, wb6 wb6Var) {
        wb6Var.getClass();
        id3Var.getClass();
        if (!id3Var.a.a) {
            List<Annotation> annotations = wb6Var.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof oe3) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void d(id3 id3Var, wb6 wb6Var) {
        wb6Var.getClass();
        id3Var.getClass();
        nb3.k(wb6Var.e(), bt6.e);
    }
}
