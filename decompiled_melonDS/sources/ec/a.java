package ec;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import yb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a implements cc.c, d, Serializable {
    public final cc.c A;

    public a(cc.c cVar) {
        this.A = cVar;
    }

    public d f() {
        cc.c cVar = this.A;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    @Override // cc.c
    public final void h(Object obj) {
        cc.c cVar = this;
        while (true) {
            a aVar = (a) cVar;
            cc.c cVar2 = aVar.A;
            cVar2.getClass();
            try {
                obj = aVar.v(obj);
                if (obj == dc.a.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th2) {
                obj = new k(th2);
            }
            aVar.w();
            if (cVar2 instanceof a) {
                cVar = cVar2;
            } else {
                cVar2.h(obj);
                return;
            }
        }
    }

    public cc.c t(cc.c cVar, Object obj) {
        cVar.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object u4 = u();
        if (u4 == null) {
            u4 = getClass().getName();
        }
        sb2.append(u4);
        return sb2.toString();
    }

    public StackTraceElement u() {
        int i2;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i10;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str2 = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        int i11 = -1;
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(this);
            if (obj2 instanceof Integer) {
                num = (Integer) obj2;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            i2 = i10 - 1;
        } catch (Exception unused) {
            i2 = -1;
        }
        if (i2 >= 0) {
            i11 = eVar.l()[i2];
        }
        f fVar = g.f4443b;
        f fVar2 = g.f4442a;
        if (fVar == null) {
            try {
                f fVar3 = new f(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                g.f4443b = fVar3;
                fVar = fVar3;
            } catch (Exception unused2) {
                g.f4443b = fVar2;
                fVar = fVar2;
            }
        }
        if (fVar != fVar2 && (method = fVar.f4439a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = fVar.f4440b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = fVar.f4441c;
            if (method3 != null) {
                obj = method3.invoke(invoke2, null);
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str2 = obj;
            }
        }
        if (str2 == null) {
            str = eVar.c();
        } else {
            str = str2 + '/' + eVar.c();
        }
        return new StackTraceElement(str, eVar.m(), eVar.f(), i11);
    }

    public abstract Object v(Object obj);

    public void w() {
    }
}
