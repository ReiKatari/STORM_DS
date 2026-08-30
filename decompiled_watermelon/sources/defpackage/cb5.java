package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cb5  reason: default package */
/* loaded from: classes.dex */
public final class cb5 {
    public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
    public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    public final ka a;
    public final Method b;
    public final Annotation[] c;
    public final Annotation[][] d;
    public final Type[] e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public boolean o;
    public boolean p;
    public boolean q;
    public String r;
    public xq2 s;
    public cw3 t;
    public LinkedHashSet u;
    public cg2[] v;
    public boolean w;

    public cb5(ka kaVar, Method method) {
        this.a = kaVar;
        this.b = method;
        this.c = method.getAnnotations();
        this.e = method.getGenericParameterTypes();
        this.d = method.getParameterAnnotations();
    }

    public static Class a(Class cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }

    public final void b(String str, String str2, boolean z) {
        String str3 = this.n;
        Method method = this.b;
        if (str3 == null) {
            this.n = str;
            this.o = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = x;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw ct3.y0(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.u = linkedHashSet;
            return;
        }
        throw ct3.y0(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void c(int i, Type type) {
        if (!ct3.r0(type)) {
            return;
        }
        throw ct3.F0(this.b, i, "Parameter type must not include a type variable or wildcard: %s", type);
    }
}
