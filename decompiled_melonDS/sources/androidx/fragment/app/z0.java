package androidx.fragment.app;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a1.w0 f1441b = new a1.w0(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g1 f1442a;

    public z0(g1 g1Var) {
        this.f1442a = g1Var;
    }

    public static Class b(ClassLoader classLoader, String str) {
        a1.w0 w0Var = f1441b;
        a1.w0 w0Var2 = (a1.w0) w0Var.get(classLoader);
        if (w0Var2 == null) {
            w0Var2 = new a1.w0(0);
            w0Var.put(classLoader, w0Var2);
        }
        Class cls = (Class) w0Var2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            w0Var2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e6) {
            throw new RuntimeException(kc.a.g("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e6);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(kc.a.g("Unable to instantiate fragment ", str, ": make sure class name exists"), e10);
        }
    }

    public final j0 a(String str) {
        return j0.instantiate(this.f1442a.f1331w.B, str, null);
    }
}
