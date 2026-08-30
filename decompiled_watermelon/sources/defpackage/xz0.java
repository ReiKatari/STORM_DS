package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xz0  reason: default package */
/* loaded from: classes.dex */
public final class xz0 implements InvocationHandler {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public xz0(ka kaVar) {
        this.a = 1;
        this.c = kaVar;
        this.b = new Object[0];
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        bu2 bu2Var;
        switch (this.a) {
            case 0:
                v32 v32Var = (v32) this.c;
                obj.getClass();
                method.getClass();
                boolean z = false;
                if (b53.x(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    qo0 qo0Var = (qo0) this.b;
                    Object obj2 = objArr[0];
                    if (qo0Var.d(obj2)) {
                        obj2.getClass();
                        v32Var.n(obj2);
                        return o27.a;
                    }
                    throw new ClassCastException("Value cannot be cast to " + qo0Var.b());
                } else if (b53.x(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    if (obj == objArr[0]) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } else if (b53.x(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(v32Var.hashCode());
                } else {
                    if (b53.x(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                        return v32Var.toString();
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
                so1 so1Var = eo4.b;
                if (so1Var.k(method)) {
                    return so1Var.j(obj, method, objArr2);
                }
                ka kaVar = (ka) this.c;
                while (true) {
                    Object obj3 = ((ConcurrentHashMap) kaVar.B).get(method);
                    if (obj3 instanceof bu2) {
                        bu2Var = (bu2) obj3;
                    } else {
                        if (obj3 == null) {
                            Object obj4 = new Object();
                            synchronized (obj4) {
                                try {
                                    obj3 = ((ConcurrentHashMap) kaVar.B).putIfAbsent(method, obj4);
                                    if (obj3 == null) {
                                        bu2Var = bu2.b(kaVar, method);
                                        ((ConcurrentHashMap) kaVar.B).put(method, bu2Var);
                                    }
                                } finally {
                                }
                            }
                        }
                        synchronized (obj3) {
                            try {
                                Object obj5 = ((ConcurrentHashMap) kaVar.B).get(method);
                                if (obj5 != null) {
                                    bu2Var = (bu2) obj5;
                                }
                            } finally {
                            }
                        }
                    }
                }
                return bu2Var.a(new xb4(bu2Var.a, obj, objArr2, bu2Var.b, bu2Var.c), objArr2);
        }
    }

    public xz0(qo0 qo0Var, v32 v32Var) {
        this.a = 0;
        this.b = qo0Var;
        this.c = v32Var;
    }
}
