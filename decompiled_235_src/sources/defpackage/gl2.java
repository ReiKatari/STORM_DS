package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gl2  reason: default package */
/* loaded from: classes.dex */
public final class gl2 {
    public static final ci6 b = new ci6(0);
    public final /* synthetic */ u a;

    public gl2(u uVar) {
        this.a = uVar;
    }

    public static Class b(String str, ClassLoader classLoader) {
        ci6 ci6Var = b;
        ci6 ci6Var2 = (ci6) ci6Var.get(classLoader);
        if (ci6Var2 == null) {
            ci6Var2 = new ci6(0);
            ci6Var.put(classLoader, ci6Var2);
        }
        Class cls = (Class) ci6Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            ci6Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(String str, ClassLoader classLoader) {
        try {
            return b(str, classLoader);
        } catch (ClassCastException e) {
            throw new RuntimeException(lb1.A("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(lb1.A("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final o a(String str) {
        return o.instantiate(this.a.w.B, str, null);
    }
}
