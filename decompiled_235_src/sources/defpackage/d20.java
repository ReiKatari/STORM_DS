package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d20  reason: default package */
/* loaded from: classes.dex */
public abstract class d20 implements r41, y61, Serializable {
    public final r41 A;

    public d20(r41 r41Var) {
        this.A = r41Var;
    }

    @Override // defpackage.y61
    public y61 f() {
        r41 r41Var = this.A;
        if (r41Var instanceof y61) {
            return (y61) r41Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.r41
    public final void i(Object obj) {
        while (true) {
            d20 d20Var = this;
            r41 r41Var = d20Var.A;
            r41Var.getClass();
            try {
                obj = d20Var.s(obj);
                if (obj == x61.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = new em5(th);
            }
            d20Var.u();
            if (r41Var instanceof d20) {
                this = r41Var;
            } else {
                r41Var.i(obj);
                return;
            }
        }
    }

    public r41 q(r41 r41Var, Object obj) {
        r41Var.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement r() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        Integer num;
        int i2;
        mc1 mc1Var = (mc1) getClass().getAnnotation(mc1.class);
        String str2 = null;
        if (mc1Var == null || mc1Var.v() < 1) {
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
            i3 = mc1Var.l()[i];
        }
        f74 f74Var = jw2.v;
        f74 f74Var2 = jw2.w;
        if (f74Var2 == null) {
            try {
                f74 f74Var3 = new f74(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                jw2.w = f74Var3;
                f74Var2 = f74Var3;
            } catch (Exception unused2) {
                jw2.w = f74Var;
                f74Var2 = f74Var;
            }
        }
        if (f74Var2 != f74Var && (method = f74Var2.a) != null && (invoke = method.invoke(getClass(), null)) != null && (method2 = f74Var2.b) != null && (invoke2 = method2.invoke(invoke, null)) != null) {
            Method method3 = f74Var2.c;
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
            str = mc1Var.c();
        } else {
            str = str2 + '/' + mc1Var.c();
        }
        return new StackTraceElement(str, mc1Var.m(), mc1Var.f(), i3);
    }

    public abstract Object s(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object r = r();
        if (r == null) {
            r = getClass().getName();
        }
        sb.append(r);
        return sb.toString();
    }

    public void u() {
    }
}
