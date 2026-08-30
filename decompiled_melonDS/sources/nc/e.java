package nc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements d {

    /* renamed from: b  reason: collision with root package name */
    public static final Map f10258b;

    /* renamed from: a  reason: collision with root package name */
    public final Class f10259a;

    static {
        List y10 = p7.t.y(mc.a.class, mc.l.class, mc.p.class, mc.q.class, mc.r.class, mc.s.class, mc.t.class, mc.u.class, mc.v.class, mc.w.class, mc.b.class, mc.c.class, mc.d.class, mc.e.class, mc.f.class, mc.g.class, mc.h.class, mc.i.class, mc.j.class, mc.k.class, mc.m.class, mc.n.class, mc.o.class);
        ArrayList arrayList = new ArrayList(zb.m.G(y10, 10));
        int i2 = 0;
        for (Object obj : y10) {
            int i10 = i2 + 1;
            if (i2 >= 0) {
                arrayList.add(new yb.j((Class) obj, Integer.valueOf(i2)));
                i2 = i10;
            } else {
                p7.t.F();
                throw null;
            }
        }
        f10258b = zb.v.H(arrayList);
    }

    public e(Class cls) {
        cls.getClass();
        this.f10259a = cls;
    }

    @Override // nc.d
    public final Class a() {
        return this.f10259a;
    }

    public final String b() {
        String c4;
        Class cls = this.f10259a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (c4 = w.c(componentType.getName())) != null) {
                str = c4.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String c10 = w.c(cls.getName());
        if (c10 == null) {
            return cls.getCanonicalName();
        }
        return c10;
    }

    public final String c() {
        String e6;
        Class cls = this.f10259a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return vc.h.w0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return vc.h.w0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            int g02 = vc.h.g0('$', 0, 6, simpleName);
            if (g02 == -1) {
                return simpleName;
            }
            return simpleName.substring(g02 + 1, simpleName.length());
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (e6 = w.e(componentType.getName())) != null) {
                str = e6.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String e10 = w.e(cls.getName());
            if (e10 == null) {
                return cls.getSimpleName();
            }
            return e10;
        }
    }

    public final boolean d(Object obj) {
        Class cls = this.f10259a;
        cls.getClass();
        Map map = f10258b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return w.d(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = q8.r.F(u.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof e) && q8.r.F(this).equals(q8.r.F((e) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return q8.r.F(this).hashCode();
    }

    public final String toString() {
        return this.f10259a.toString() + " (Kotlin reflection is not available)";
    }
}
