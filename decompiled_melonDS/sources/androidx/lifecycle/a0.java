package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f1443a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f1444b = new HashMap();

    public static void a(Constructor constructor, w wVar) {
        try {
            constructor.newInstance(wVar).getClass();
            throw new ClassCastException();
        } catch (IllegalAccessException e6) {
            throw new RuntimeException(e6);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static int b(Class cls) {
        Constructor<?> constructor;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        HashMap hashMap = f1443a;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r32 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r32 != null) {
                    str = r32.getName();
                } else {
                    str = "";
                }
                str.getClass();
                if (str.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(str.length() + 1);
                }
                canonicalName.getClass();
                String concat = vc.o.T(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() != 0) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
            HashMap hashMap2 = f1444b;
            if (constructor != null) {
                hashMap2.put(cls, p7.t.x(constructor));
            } else {
                d dVar = d.f1456c;
                HashMap hashMap3 = dVar.f1458b;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                if (((h0) declaredMethods[i10].getAnnotation(h0.class)) != null) {
                                    dVar.a(cls, declaredMethods);
                                    z10 = true;
                                    break;
                                }
                                i10++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && w.class.isAssignableFrom(superclass)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        superclass.getClass();
                        if (b(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            obj.getClass();
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    interfaces.getClass();
                    int length2 = interfaces.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 < length2) {
                            Class<?> cls2 = interfaces[i11];
                            if (cls2 != null && w.class.isAssignableFrom(cls2)) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                cls2.getClass();
                                if (b(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                obj2.getClass();
                                arrayList.addAll((Collection) obj2);
                            }
                            i11++;
                        } else if (arrayList != null) {
                            hashMap2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        hashMap.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
