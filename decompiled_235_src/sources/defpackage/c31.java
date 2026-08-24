package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c31  reason: default package */
/* loaded from: classes.dex */
public final class c31 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public c31(pa paVar) {
        this.a = 1;
        this.c = paVar;
        this.b = new Object[0];
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        c03 c03Var;
        switch (this.a) {
            case 0:
                n82 n82Var = (n82) this.c;
                obj.getClass();
                method.getClass();
                boolean z = false;
                if (nb3.k(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    ar0 ar0Var = (ar0) this.b;
                    Object obj2 = objArr[0];
                    if (ar0Var.d(obj2)) {
                        obj2.getClass();
                        n82Var.g(obj2);
                        return jg7.a;
                    }
                    throw new ClassCastException("Value cannot be cast to " + ar0Var.b());
                } else if (nb3.k(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    if (obj == objArr[0]) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } else if (nb3.k(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(n82Var.hashCode());
                } else {
                    if (nb3.k(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                        return n82Var.toString();
                    }
                    throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
                }
            default:
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = (Object[]) this.b;
                }
                Object[] objArr2 = objArr;
                jd1 jd1Var = jx4.b;
                if (jd1Var.h(method)) {
                    return jd1Var.g(method, obj, objArr2);
                }
                pa paVar = (pa) this.c;
                while (true) {
                    Object obj3 = ((ConcurrentHashMap) paVar.B).get(method);
                    if (obj3 instanceof c03) {
                        c03Var = (c03) obj3;
                    } else {
                        if (obj3 == null) {
                            Object obj4 = new Object();
                            synchronized (obj4) {
                                try {
                                    obj3 = ((ConcurrentHashMap) paVar.B).putIfAbsent(method, obj4);
                                    if (obj3 == null) {
                                        c03Var = c03.b(paVar, method);
                                        ((ConcurrentHashMap) paVar.B).put(method, c03Var);
                                    }
                                } finally {
                                }
                            }
                        }
                        synchronized (obj3) {
                            try {
                                Object obj5 = ((ConcurrentHashMap) paVar.B).get(method);
                                if (obj5 != null) {
                                    c03Var = (c03) obj5;
                                }
                            } finally {
                            }
                        }
                    }
                }
                return c03Var.a(new vk4(c03Var.a, obj, objArr2, c03Var.b, c03Var.c), objArr2);
        }
    }

    public c31(ar0 ar0Var, n82 n82Var) {
        this.a = 0;
        this.b = ar0Var;
        this.c = n82Var;
    }
}
