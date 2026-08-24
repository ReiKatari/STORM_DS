package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fh5  reason: default package */
/* loaded from: classes.dex */
public final class fh5 extends jd1 {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh5(int i) {
        super(21);
        this.B = i;
    }

    @Override // defpackage.jd1
    public String f(Method method, int i) {
        Parameter[] parameters;
        boolean isNamePresent;
        String name;
        switch (this.B) {
            case 1:
                parameters = method.getParameters();
                Parameter parameter = parameters[i];
                isNamePresent = parameter.isNamePresent();
                if (isNamePresent) {
                    StringBuilder sb = new StringBuilder("parameter '");
                    name = parameter.getName();
                    sb.append(name);
                    sb.append('\'');
                    return sb.toString();
                }
                return super.f(method, i);
            default:
                return super.f(method, i);
        }
    }

    @Override // defpackage.jd1
    public final Object g(Method method, Object obj, Object[] objArr) {
        switch (this.B) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return l.A(method, obj, objArr);
                }
                fa6.h("Calling default methods on API 24 and 25 is not supported");
                return null;
            default:
                return l.A(method, obj, objArr);
        }
    }

    @Override // defpackage.jd1
    public final boolean h(Method method) {
        switch (this.B) {
            case 0:
                return method.isDefault();
            default:
                return method.isDefault();
        }
    }
}
