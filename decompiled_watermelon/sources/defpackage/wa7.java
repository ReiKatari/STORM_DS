package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wa7  reason: default package */
/* loaded from: classes.dex */
public final class wa7 extends ya7 {
    public static wa7 c;
    public static final so1 d = new so1(27);
    public final Application b;

    public wa7(Application application) {
        this.b = application;
    }

    @Override // defpackage.ya7, defpackage.xa7
    public final ra7 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        vd6.i("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        return null;
    }

    @Override // defpackage.ya7, defpackage.xa7
    public final ra7 b(Class cls, g14 g14Var) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) g14Var.a.get(d);
        if (application != null) {
            return d(cls, application);
        }
        if (!mm.class.isAssignableFrom(cls)) {
            return yf2.n(cls);
        }
        i.i("CreationExtras must have an application by `APPLICATION_KEY`");
        return null;
    }

    public final ra7 d(Class cls, Application application) {
        if (mm.class.isAssignableFrom(cls)) {
            try {
                ra7 ra7Var = (ra7) cls.getConstructor(Application.class).newInstance(application);
                ra7Var.getClass();
                return ra7Var;
            } catch (IllegalAccessException e) {
                c44.n("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                c44.n("Cannot create an instance of ", cls, e2);
                return null;
            } catch (NoSuchMethodException e3) {
                c44.n("Cannot create an instance of ", cls, e3);
                return null;
            } catch (InvocationTargetException e4) {
                c44.n("Cannot create an instance of ", cls, e4);
                return null;
            }
        }
        return yf2.n(cls);
    }
}
