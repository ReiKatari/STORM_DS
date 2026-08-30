package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a83  reason: default package */
/* loaded from: classes.dex */
public abstract class a83 {
    public static final sn1 a = new sn1(29);

    public static final int a(h06 h06Var, t63 t63Var, String str) {
        Object obj;
        h06Var.getClass();
        t63Var.getClass();
        str.getClass();
        d(t63Var, h06Var);
        int a2 = h06Var.a(str);
        if (a2 != -3 || !t63Var.a.e) {
            return a2;
        }
        t71 t71Var = t63Var.c;
        jd2 jd2Var = new jd2(5, h06Var, t63Var);
        t71Var.getClass();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) t71Var.B;
        Map map = (Map) concurrentHashMap.get(h06Var);
        sn1 sn1Var = a;
        Object obj2 = null;
        if (map != null) {
            obj = map.get(sn1Var);
        } else {
            obj = null;
        }
        if (obj != null) {
            obj2 = obj;
        }
        if (obj2 == null) {
            obj2 = jd2Var.c();
            Object obj3 = concurrentHashMap.get(h06Var);
            if (obj3 == null) {
                obj3 = new ConcurrentHashMap(2);
                concurrentHashMap.put(h06Var, obj3);
            }
            ((Map) obj3).put(sn1Var, obj2);
        }
        Integer num = (Integer) ((Map) obj2).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int b(h06 h06Var, t63 t63Var, String str, String str2) {
        h06Var.getClass();
        t63Var.getClass();
        str.getClass();
        int a2 = a(h06Var, t63Var, str);
        if (a2 != -3) {
            return a2;
        }
        String b = h06Var.b();
        throw new IllegalArgumentException(b + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean c(t63 t63Var, h06 h06Var) {
        h06Var.getClass();
        t63Var.getClass();
        if (!t63Var.a.a) {
            List<Annotation> annotations = h06Var.getAnnotations();
            if (annotations == null || !annotations.isEmpty()) {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof v73) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static final void d(t63 t63Var, h06 h06Var) {
        h06Var.getClass();
        t63Var.getClass();
        b53.x(h06Var.c(), kh6.h);
    }
}
