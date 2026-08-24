package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fr0  reason: default package */
/* loaded from: classes.dex */
public final class fr0 {
    public static final fr0 c = new fr0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, er0 er0Var, st3 st3Var, Class cls) {
        st3 st3Var2 = (st3) hashMap.get(er0Var);
        if (st3Var2 != null && st3Var != st3Var2) {
            String name = er0Var.b.getName();
            String name2 = cls.getName();
            throw new IllegalArgumentException("Method " + name + " in " + name2 + " already declared with different @OnLifecycleEvent value: previous value " + st3Var2 + ", new value " + st3Var);
        } else if (st3Var2 == null) {
            hashMap.put(er0Var, st3Var);
        }
    }

    public final dr0 a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            dr0 dr0Var = (dr0) hashMap2.get(superclass);
            if (dr0Var == null) {
                dr0Var = a(superclass, null);
            }
            hashMap.putAll(dr0Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            dr0 dr0Var2 = (dr0) hashMap2.get(cls2);
            if (dr0Var2 == null) {
                dr0Var2 = a(cls2, null);
            }
            for (Map.Entry entry : dr0Var2.b.entrySet()) {
                b(hashMap, (er0) entry.getKey(), (st3) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            ql4 ql4Var = (ql4) method.getAnnotation(ql4.class);
            if (ql4Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (hu3.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        i.h("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                st3 value = ql4Var.value();
                if (parameterTypes.length > 1) {
                    if (st3.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == st3.ON_ANY) {
                            i = 2;
                        } else {
                            i.h("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        i.h("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new er0(method, i), value, cls);
                    z = true;
                } else {
                    i.h("cannot have more than 2 params");
                    return null;
                }
            }
        }
        dr0 dr0Var3 = new dr0(hashMap);
        hashMap2.put(cls, dr0Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return dr0Var3;
    }
}
