package ec;

import android.os.Build;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public Method f4439a;

    /* renamed from: b  reason: collision with root package name */
    public Method f4440b;

    /* renamed from: c  reason: collision with root package name */
    public Method f4441c;

    public f(Method method, Method method2, Method method3) {
        this.f4439a = method;
        this.f4440b = method2;
        this.f4441c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
