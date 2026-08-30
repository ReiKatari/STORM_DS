package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m00  reason: default package */
/* loaded from: classes.dex */
public abstract class m00 implements j11, q31, Serializable {
    public final j11 A;

    public m00(j11 j11Var) {
        this.A = j11Var;
    }

    @Override // defpackage.q31
    public q31 g() {
        j11 j11Var = this.A;
        if (j11Var instanceof q31) {
            return (q31) j11Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.j11
    public final void k(Object obj) {
        while (true) {
            m00 m00Var = this;
            j11 j11Var = m00Var.A;
            j11Var.getClass();
            try {
                obj = m00Var.v(obj);
                if (obj == p31.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new kc5(th);
            }
            m00Var.w();
            if (j11Var instanceof m00) {
                this = j11Var;
            } else {
                j11Var.k(obj);
                return;
            }
        }
    }

    public j11 t(j11 j11Var, Object obj) {
        j11Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object u = u();
        if (u == null) {
            u = getClass().getName();
        }
        sb.append(u);
        return sb.toString();
    }

    public StackTraceElement u() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        v81 v81Var = (v81) getClass().getAnnotation(v81.class);
        String str2 = null;
        if (v81Var == null || v81Var.v() < 1) {
            return null;
        }
        int i3 = -1;
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
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            i = i2 - 1;
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            i3 = v81Var.l()[i];
        }
        ez3 ez3Var = l.j;
        ez3 ez3Var2 = l.k;
        if (ez3Var2 == null) {
            try {
                ez3 ez3Var3 = new ez3(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                l.k = ez3Var3;
                ez3Var2 = ez3Var3;
            } catch (Exception unused2) {
                l.k = ez3Var;
                ez3Var2 = ez3Var;
            }
        }
        if (ez3Var2 != ez3Var && (method = ez3Var2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = ez3Var2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = ez3Var2.c;
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
            str = v81Var.c();
        } else {
            str = str2 + '/' + v81Var.c();
        }
        return new StackTraceElement(str, v81Var.m(), v81Var.f(), i3);
    }

    public abstract Object v(Object obj);

    public void w() {
    }
}
