package od;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import i3.p0;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements mc.a {
    public final /* synthetic */ int A;

    public /* synthetic */ n(int i2) {
        this.A = i2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [yb.f, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        Class<?> returnType;
        switch (this.A) {
            case 0:
                return w.f10904b;
            case DSiCameraSource.FrontCamera /* 1 */:
                return t.f10902b;
            case 2:
                return b0.f10883b;
            case 3:
                return g.f10894b;
            case 4:
                return UUID.randomUUID();
            case l1.c.f8511g /* 5 */:
                return UUID.randomUUID();
            case l1.c.f8509e /* 6 */:
                return n2.s.w(Boolean.FALSE);
            case 7:
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
            case 8:
                return new x8.e(0);
            case l1.c.f8508d /* 9 */:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case l1.c.f8510f /* 10 */:
                return n2.s.w(Boolean.FALSE);
            case 11:
                return new p0(i3.z.c(1308617531));
            case 12:
                t2 t2Var = u1.n.f13366a;
                return null;
            case 13:
                return new x4.j(0L);
            case 14:
                return new x4.j(0L);
            case l1.c.f8512h /* 15 */:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 17:
                try {
                    Method method = (Method) v7.b.R.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 18:
                t2 t2Var2 = w2.b.f14113a;
                return w2.a.A;
            case 19:
                n2.b0 b0Var = x6.a.f14372a;
                return null;
            case 20:
                return new y2.e(new LinkedHashMap());
            case 21:
                t2 t2Var3 = y2.h.f14658a;
                return null;
            default:
                return n2.s.w(Boolean.FALSE);
        }
    }
}
