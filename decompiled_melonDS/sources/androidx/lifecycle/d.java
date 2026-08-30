package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c  reason: collision with root package name */
    public static final d f1456c = new d();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f1457a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f1458b = new HashMap();

    public static void b(HashMap hashMap, c cVar, p pVar, Class cls) {
        p pVar2 = (p) hashMap.get(cVar);
        if (pVar2 != null && pVar != pVar2) {
            a0.j.k("Method ", cVar.f1449b.getName(), " in ", cls.getName(), " already declared with different @OnLifecycleEvent value: previous value ", pVar2, ", new value ", pVar);
        } else if (pVar2 == null) {
            hashMap.put(cVar, pVar);
        }
    }

    public final b a(Class cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = this.f1457a;
        if (superclass != null) {
            b bVar = (b) hashMap2.get(superclass);
            if (bVar == null) {
                bVar = a(superclass, null);
            }
            hashMap.putAll(bVar.f1446b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            b bVar2 = (b) hashMap2.get(cls2);
            if (bVar2 == null) {
                bVar2 = a(cls2, null);
            }
            for (Map.Entry entry : bVar2.f1446b.entrySet()) {
                b(hashMap, (c) entry.getKey(), (p) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e6) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e6);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            h0 h0Var = (h0) method.getAnnotation(h0.class);
            if (h0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (x.class.isAssignableFrom(parameterTypes[0])) {
                        i2 = 1;
                    } else {
                        a0.j.h("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                } else {
                    i2 = 0;
                }
                p value = h0Var.value();
                if (parameterTypes.length > 1) {
                    if (p.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == p.ON_ANY) {
                            i2 = 2;
                        } else {
                            a0.j.h("Second arg is supported only for ON_ANY value");
                            return null;
                        }
                    } else {
                        a0.j.h("invalid parameter type. second arg must be an event");
                        return null;
                    }
                }
                if (parameterTypes.length <= 2) {
                    b(hashMap, new c(method, i2), value, cls);
                    z10 = true;
                } else {
                    a0.j.h("cannot have more than 2 params");
                    return null;
                }
            }
        }
        b bVar3 = new b(hashMap);
        hashMap2.put(cls, bVar3);
        this.f1458b.put(cls, Boolean.valueOf(z10));
        return bVar3;
    }
}
