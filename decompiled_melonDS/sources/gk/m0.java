package gk;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends b {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f5747b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i2) {
        super(7);
        this.f5747b0 = i2;
    }

    @Override // gk.b
    public String c(Method method, int i2) {
        Parameter[] parameters;
        boolean isNamePresent;
        String name;
        switch (this.f5747b0) {
            case DSiCameraSource.FrontCamera /* 1 */:
                parameters = method.getParameters();
                Parameter parameter = parameters[i2];
                isNamePresent = parameter.isNamePresent();
                if (isNamePresent) {
                    StringBuilder sb2 = new StringBuilder("parameter '");
                    name = parameter.getName();
                    sb2.append(name);
                    sb2.append('\'');
                    return sb2.toString();
                }
                return super.c(method, i2);
            default:
                return super.c(method, i2);
        }
    }

    @Override // gk.b
    public final Object d(Object obj, Method method, Object[] objArr) {
        switch (this.f5747b0) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return y0.k(obj, method, objArr);
                }
                m9.o.v("Calling default methods on API 24 and 25 is not supported");
                return null;
            default:
                return y0.k(obj, method, objArr);
        }
    }

    @Override // gk.b
    public final boolean e(Method method) {
        switch (this.f5747b0) {
            case 0:
                return method.isDefault();
            default:
                return method.isDefault();
        }
    }
}
