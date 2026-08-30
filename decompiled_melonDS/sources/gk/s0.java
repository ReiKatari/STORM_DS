package gk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5804a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f5805b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5806c;

    public s0(w.x0 x0Var) {
        this.f5804a = 0;
        this.f5806c = x0Var;
        this.f5805b = new Object[0];
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        t tVar;
        switch (this.f5804a) {
            case 0:
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr);
                }
                if (objArr == null) {
                    objArr = (Object[]) this.f5805b;
                }
                Object[] objArr2 = objArr;
                b bVar = l0.f5745b;
                if (bVar.e(method)) {
                    return bVar.d(obj, method, objArr2);
                }
                w.x0 x0Var = (w.x0) this.f5806c;
                while (true) {
                    Object obj2 = ((ConcurrentHashMap) x0Var.f14089b).get(method);
                    if (obj2 instanceof t) {
                        tVar = (t) obj2;
                    } else {
                        if (obj2 == null) {
                            Object obj3 = new Object();
                            synchronized (obj3) {
                                try {
                                    obj2 = ((ConcurrentHashMap) x0Var.f14089b).putIfAbsent(method, obj3);
                                    if (obj2 == null) {
                                        tVar = t.b(x0Var, method);
                                        ((ConcurrentHashMap) x0Var.f14089b).put(method, tVar);
                                    }
                                } finally {
                                }
                            }
                        }
                        synchronized (obj2) {
                            try {
                                Object obj4 = ((ConcurrentHashMap) x0Var.f14089b).get(method);
                                if (obj4 != null) {
                                    tVar = (t) obj4;
                                }
                            } finally {
                            }
                        }
                    }
                }
                t tVar2 = tVar;
                return tVar2.a(new a0(tVar2.f5807a, obj, objArr2, tVar2.f5808b, tVar2.f5809c), objArr2);
            default:
                l8.b bVar2 = (l8.b) this.f5806c;
                obj.getClass();
                method.getClass();
                boolean z10 = false;
                if (nc.k.a(method.getName(), "accept") && objArr != null && objArr.length == 1) {
                    nc.e eVar = (nc.e) this.f5805b;
                    Object obj5 = objArr[0];
                    if (eVar.d(obj5)) {
                        obj5.getClass();
                        bVar2.k(obj5);
                        return yb.y.f14813a;
                    }
                    throw new ClassCastException("Value cannot be cast to " + eVar.b());
                } else if (nc.k.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1) {
                    if (obj == objArr[0]) {
                        z10 = true;
                    }
                    return Boolean.valueOf(z10);
                } else if (nc.k.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null) {
                    return Integer.valueOf(bVar2.hashCode());
                } else {
                    if (nc.k.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null) {
                        return bVar2.toString();
                    }
                    throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
                }
        }
    }

    public s0(nc.e eVar, l8.b bVar) {
        this.f5804a = 1;
        this.f5805b = eVar;
        this.f5806c = bVar;
    }
}
