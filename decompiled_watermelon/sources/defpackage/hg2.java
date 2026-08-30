package defpackage;

import androidx.fragment.app.o;
import androidx.fragment.app.u;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg2  reason: default package */
/* loaded from: classes.dex */
public final class hg2 {
    public static final m66 b = new m66(0);
    public final /* synthetic */ u a;

    public hg2(u uVar) {
        this.a = uVar;
    }

    public static Class b(ClassLoader classLoader, String str) {
        m66 m66Var = b;
        m66 m66Var2 = (m66) m66Var.get(classLoader);
        if (m66Var2 == null) {
            m66Var2 = new m66(0);
            m66Var.put(classLoader, m66Var2);
        }
        Class cls = (Class) m66Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            m66Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new RuntimeException(wh1.A("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(wh1.A("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final o a(String str) {
        return o.instantiate(this.a.w.B, str, null);
    }
}
