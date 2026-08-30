package gk;

import java.lang.annotation.Annotation;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class y0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Type[] f5814a = new Type[0];

    /* renamed from: b  reason: collision with root package name */
    public static boolean f5815b = true;

    /* renamed from: c  reason: collision with root package name */
    public static Constructor f5816c;

    public static final Object b(e eVar, cc.c cVar) {
        zc.h hVar = new zc.h(1, pc.a.A(cVar));
        hVar.v();
        hVar.x(new v(eVar, 0));
        eVar.d(new w(hVar, 0));
        Object u4 = hVar.u();
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return u4;
    }

    public static final Object c(e eVar, cc.c cVar) {
        zc.h hVar = new zc.h(1, pc.a.A(cVar));
        hVar.v();
        hVar.x(new v(eVar, 1));
        eVar.d(new w(hVar, 1));
        Object u4 = hVar.u();
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        return u4;
    }

    public static void d(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            fj.j.b();
        }
    }

    public static boolean e(Type type, Type type2) {
        boolean z10;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z10 = false;
            } else {
                z10 = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z10 && equals && equals2) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return e(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type f(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return f(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return f(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Type g(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 >= 0 && i2 < actualTypeArguments.length) {
            Type type = actualTypeArguments[i2];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder i10 = kc.a.i("Index ", i2, " not in range [0,");
        i10.append(actualTypeArguments.length);
        i10.append(") for ");
        i10.append(parameterizedType);
        throw new IllegalArgumentException(i10.toString());
    }

    public static Class h(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            fj.j.b();
            return null;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return h(((WildcardType) type).getUpperBounds()[0]);
            }
            StringBuilder sb2 = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb2.append(type);
            fj.j.k(sb2, "> is of type ", type.getClass().getName());
            return null;
        }
    }

    public static Type i(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return p(type, cls, f(type, cls, Map.class));
        }
        fj.j.b();
        return null;
    }

    public static boolean j(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (j(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return j(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            fj.j.s("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
            return false;
        }
    }

    public static Object k(Object obj, Method method, Object[] objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor constructor = f5816c;
        if (constructor == null) {
            constructor = c3.p.C().getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            f5816c = constructor;
        }
        unreflectSpecial = c3.p.q(constructor.newInstance(ff.a.class, -1)).unreflectSpecial(method, ff.a.class);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    public static boolean l(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static IllegalArgumentException m(Method method, Exception exc, String str, Object... objArr) {
        String format = String.format(str, objArr);
        return new IllegalArgumentException(format + "\n    for method " + method.getDeclaringClass().getSimpleName() + "." + method.getName(), exc);
    }

    public static IllegalArgumentException n(Method method, int i2, String str, Object... objArr) {
        String c4 = l0.f5745b.c(method, i2);
        return m(method, null, str + " (" + c4 + ")", objArr);
    }

    public static IllegalArgumentException o(Method method, Exception exc, int i2, String str, Object... objArr) {
        String c4 = l0.f5745b.c(method, i2);
        return m(method, exc, str + " (" + c4 + ")", objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042 A[LOOP:0: B:2:0x0000->B:24:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type p(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.y0.p(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final dc.a q(java.lang.Throwable r5, cc.c r6) {
        /*
            boolean r0 = r6 instanceof gk.x
            if (r0 == 0) goto L13
            r0 = r6
            gk.x r0 = (gk.x) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X = r1
            goto L18
        L13:
            gk.x r0 = new gk.x
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
        L28:
            r5 = 0
            return r5
        L2a:
            p7.j.I(r6)
            wa.b.a()
            goto L28
        L31:
            p7.j.I(r6)
            r0.X = r3
            gd.f r6 = zc.g0.f15015a
            cc.g r2 = r0.B
            r2.getClass()
            m0.h r3 = new m0.h
            r4 = 2
            r3.<init>(r4, r0, r5)
            r6.X(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.y0.q(java.lang.Throwable, cc.c):dc.a");
    }

    public static void r(Throwable th2) {
        if (!(th2 instanceof VirtualMachineError)) {
            if (!(th2 instanceof ThreadDeath)) {
                if (!(th2 instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th2);
            }
            throw ((ThreadDeath) th2);
        }
        throw ((VirtualMachineError) th2);
    }

    public static String s(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public abstract void a(o0 o0Var, Object obj);
}
