package gk;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b implements n {
    public static final b B = new b(0);
    public static final b L = new b(1);
    public static final b R = new b(2);
    public static final b X = new b(3);
    public static final b Y = new b(4);
    public static final b Z = new b(5);
    public final /* synthetic */ int A;

    public /* synthetic */ b(int i2) {
        this.A = i2;
    }

    public List a(Executor executor) {
        return Collections.singletonList(new p(executor));
    }

    public List b() {
        return Collections.EMPTY_LIST;
    }

    public String c(Method method, int i2) {
        return "parameter #" + (i2 + 1);
    }

    public Object d(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean e(Method method) {
        return false;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [fj.f, fj.e, java.lang.Object] */
    @Override // gk.n
    public Object g(Object obj) {
        switch (this.A) {
            case 0:
                return obj.toString();
            case DSiCameraSource.FrontCamera /* 1 */:
                pi.g0 g0Var = (pi.g0) obj;
                try {
                    ?? obj2 = new Object();
                    g0Var.m().W(obj2);
                    pi.f0 f0Var = new pi.f0(g0Var.i(), g0Var.d(), obj2);
                    g0Var.close();
                    return f0Var;
                } catch (Throwable th2) {
                    g0Var.close();
                    throw th2;
                }
            case 2:
                return (pi.b0) obj;
            case 3:
                return (pi.g0) obj;
            case 4:
                ((pi.g0) obj).close();
                return yb.y.f14813a;
            default:
                ((pi.g0) obj).close();
                return null;
        }
    }
}
