package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 extends b1 {

    /* renamed from: c  reason: collision with root package name */
    public static z0 f1511c;

    /* renamed from: d  reason: collision with root package name */
    public static final na.f f1512d = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Application f1513b;

    public z0(Application application) {
        this.f1513b = application;
    }

    @Override // androidx.lifecycle.b1, androidx.lifecycle.a1
    public final y0 a(Class cls) {
        Application application = this.f1513b;
        if (application != null) {
            return d(cls, application);
        }
        m9.o.v("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // androidx.lifecycle.b1, androidx.lifecycle.a1
    public final y0 b(Class cls, w6.d dVar) {
        if (this.f1513b != null) {
            return a(cls);
        }
        Application application = (Application) dVar.f14161a.get(f1512d);
        if (application != null) {
            return d(cls, application);
        }
        if (!a.class.isAssignableFrom(cls)) {
            return zb.k.p(cls);
        }
        a0.j.h("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final y0 d(Class cls, Application application) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                y0 y0Var = (y0) cls.getConstructor(Application.class).newInstance(application);
                y0Var.getClass();
                return y0Var;
            } catch (IllegalAccessException e6) {
                m9.o.l("Cannot create an instance of ", cls, e6);
                return null;
            } catch (InstantiationException e10) {
                m9.o.l("Cannot create an instance of ", cls, e10);
                return null;
            } catch (NoSuchMethodException e11) {
                m9.o.l("Cannot create an instance of ", cls, e11);
                return null;
            } catch (InvocationTargetException e12) {
                m9.o.l("Cannot create an instance of ", cls, e12);
                return null;
            }
        }
        return zb.k.p(cls);
    }
}
