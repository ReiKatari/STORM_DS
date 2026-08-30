package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vo0  reason: default package */
/* loaded from: classes.dex */
public final class vo0 {
    public static final vo0 c = new vo0();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void b(HashMap hashMap, uo0 uo0Var, pm3 pm3Var, Class cls) {
        pm3 pm3Var2 = (pm3) hashMap.get(uo0Var);
        if (pm3Var2 != null && pm3Var != pm3Var2) {
            String name = uo0Var.b.getName();
            String name2 = cls.getName();
            throw new IllegalArgumentException("Method " + name + " in " + name2 + " already declared with different @OnLifecycleEvent value: previous value " + pm3Var2 + ", new value " + pm3Var);
        } else if (pm3Var2 == null) {
            hashMap.put(uo0Var, pm3Var);
        }
    }

    public final to0 a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.a;
        if (superclass != null) {
            to0 to0Var = (to0) hashMap2.get(superclass);
            if (to0Var == null) {
                to0Var = a(superclass, null);
            }
            hashMap.putAll(to0Var.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            to0 to0Var2 = (to0) hashMap2.get(cls2);
            if (to0Var2 == null) {
                to0Var2 = a(cls2, null);
            }
            for (Map.Entry entry : to0Var2.b.entrySet()) {
                b(hashMap, (uo0) entry.getKey(), (pm3) entry.getValue(), cls);
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
            rc4 rc4Var = (rc4) method.getAnnotation(rc4.class);
            if (rc4Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (fn3.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        i.i("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i = 0;
                }
                pm3 value = rc4Var.value();
                if (parameterTypes.length > 1) {
                    if (pm3.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == pm3.ON_ANY) {
                            i = 2;
                        } else {
                            i.i("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        i.i("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new uo0(method, i), value, cls);
                    z = true;
                } else {
                    i.i("cannot have more than 2 params");
                    return null;
                }
            }
        }
        to0 to0Var3 = new to0(hashMap);
        hashMap2.put(cls, to0Var3);
        this.b.put(cls, Boolean.valueOf(z));
        return to0Var3;
    }
}
