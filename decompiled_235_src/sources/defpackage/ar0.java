package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ar0  reason: default package */
/* loaded from: classes.dex */
public final class ar0 implements yq0 {
    public static final Map b;
    public final Class a;

    static {
        List c0 = hf.c0(on2.class, qn2.class, eo2.class, fo2.class, go2.class, ho2.class, io2.class, jo2.class, ko2.class, lo2.class, pn2.class, rn2.class, sn2.class, tn2.class, un2.class, vn2.class, wn2.class, xn2.class, yn2.class, zn2.class, bo2.class, co2.class, do2.class);
        ArrayList arrayList = new ArrayList(ht0.v0(c0, 10));
        int i = 0;
        for (Object obj : c0) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new vr4((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                hf.q0();
                throw null;
            }
        }
        b = c14.r0(arrayList);
    }

    public ar0(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.yq0
    public final Class a() {
        return this.a;
    }

    public final String b() {
        String u;
        Class cls = this.a;
        cls.getClass();
        String str = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (u = f04.u(componentType.getName())) != null) {
                str = u.concat("Array");
            }
            if (str == null) {
                return "kotlin.Array";
            }
            return str;
        }
        String u2 = f04.u(cls.getName());
        if (u2 == null) {
            return cls.getCanonicalName();
        }
        return u2;
    }

    public final String c() {
        String Q;
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
                return qs6.N0(simpleName, enclosingMethod.getName() + '$', simpleName);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                return qs6.N0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            }
            return qs6.M0('$', simpleName, simpleName);
        } else if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (Q = f04.Q(componentType.getName())) != null) {
                str = Q.concat("Array");
            }
            if (str == null) {
                return "Array";
            }
            return str;
        } else {
            String Q2 = f04.Q(cls.getName());
            if (Q2 == null) {
                return cls.getSimpleName();
            }
            return Q2;
        }
    }

    public final boolean d(Object obj) {
        Class cls = this.a;
        cls.getClass();
        Map map = b;
        map.getClass();
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return ge7.I(num.intValue(), obj);
        }
        if (cls.isPrimitive()) {
            cls = kj2.z(gh5.a(cls));
        }
        return cls.isInstance(obj);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ar0) && kj2.z(this).equals(kj2.z((ar0) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return kj2.z(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
