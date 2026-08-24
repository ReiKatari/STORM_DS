package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo7  reason: default package */
/* loaded from: classes.dex */
public final class wo7 extends zo7 {
    public static wo7 c;
    public static final vo7 d = new Object();
    public final Application b;

    public wo7(Application application) {
        this.b = application;
    }

    @Override // defpackage.zo7, defpackage.yo7
    public final qo7 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        fa6.h("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.zo7, defpackage.yo7
    public final qo7 b(Class cls, m94 m94Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) m94Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!ym.class.isAssignableFrom(cls)) {
            return nj2.k(cls);
        }
        i.h("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final qo7 d(Class cls, Application application) {
        if (ym.class.isAssignableFrom(cls)) {
            try {
                qo7 qo7Var = (qo7) cls.getConstructor(Application.class).newInstance(application);
                qo7Var.getClass();
                return qo7Var;
            } catch (IllegalAccessException e) {
                u34.o("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                u34.o("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                u34.o("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                u34.o("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return nj2.k(cls);
    }
}
