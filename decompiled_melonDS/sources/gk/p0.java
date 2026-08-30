package gk;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f5763x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f5764y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a  reason: collision with root package name */
    public final w.x0 f5765a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f5766b;

    /* renamed from: c  reason: collision with root package name */
    public final Annotation[] f5767c;

    /* renamed from: d  reason: collision with root package name */
    public final Annotation[][] f5768d;

    /* renamed from: e  reason: collision with root package name */
    public final Type[] f5769e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5770f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5771g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5772h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5773i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5774j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f5775k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5776l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public String f5777n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f5778o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5779p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5780q;

    /* renamed from: r  reason: collision with root package name */
    public String f5781r;

    /* renamed from: s  reason: collision with root package name */
    public pi.q f5782s;

    /* renamed from: t  reason: collision with root package name */
    public pi.t f5783t;

    /* renamed from: u  reason: collision with root package name */
    public LinkedHashSet f5784u;

    /* renamed from: v  reason: collision with root package name */
    public y0[] f5785v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f5786w;

    public p0(w.x0 x0Var, Method method) {
        this.f5765a = x0Var;
        this.f5766b = method;
        this.f5767c = method.getAnnotations();
        this.f5769e = method.getGenericParameterTypes();
        this.f5768d = method.getParameterAnnotations();
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

    public final void b(String str, String str2, boolean z10) {
        String str3 = this.f5777n;
        Method method = this.f5766b;
        if (str3 == null) {
            this.f5777n = str;
            this.f5778o = z10;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            Pattern pattern = f5763x;
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (pattern.matcher(substring).find()) {
                    throw y0.m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.f5781r = str2;
            Matcher matcher = pattern.matcher(str2);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            this.f5784u = linkedHashSet;
            return;
        }
        throw y0.m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
    }

    public final void c(int i2, Type type) {
        if (!y0.j(type)) {
            return;
        }
        throw y0.n(this.f5766b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
    }
}
