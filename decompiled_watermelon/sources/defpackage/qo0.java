package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo0  reason: default package */
/* loaded from: classes.dex */
public final class qo0 implements oo0 {
    public static final Map b;
    public final Class a;

    static {
        List c0 = l07.c0(ki2.class, mi2.class, aj2.class, bj2.class, cj2.class, dj2.class, ej2.class, fj2.class, gj2.class, hj2.class, li2.class, ni2.class, oi2.class, pi2.class, qi2.class, ri2.class, si2.class, ti2.class, ui2.class, vi2.class, xi2.class, yi2.class, zi2.class);
        ArrayList arrayList = new ArrayList(uq0.y0(c0, 10));
        int i = 0;
        for (Object obj : c0) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new ti4((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                l07.v0();
                throw null;
            }
        }
        b = zt3.q0(arrayList);
    }

    public qo0(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.oo0
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String i;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (i = w81.i(componentType.getName())) != null) {
                str = i.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String i2 = w81.i(cls.getName());
        if (i2 == null) {
            return cls.getCanonicalName();
        }
        return i2;
    }

    public final String c() {
        String E;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (cls.isLocalClass()) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                return zg6.T0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return zg6.T0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return zg6.S0('$', simpleName, simpleName);
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (E = w81.E(componentType.getName())) != null) {
                str = E.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String E2 = w81.E(cls.getName());
            if (E2 == null) {
                return cls.getSimpleName();
            }
            return E2;
        }
    }

    public final boolean d(Object obj) {
        Class cls = this.a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return l07.Z(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = ve2.A(q75.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof qo0) && ve2.A(this).equals(ve2.A((qo0) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ve2.A(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
