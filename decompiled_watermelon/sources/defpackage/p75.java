package defpackage;

import android.os.Build;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p75  reason: default package */
/* loaded from: classes.dex */
public final class p75 extends so1 {
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p75(int i) {
        super(19);
        this.B = i;
    }

    @Override // defpackage.so1
    public String g(Method method, int i) {
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
                return super.g(method, i);
            default:
                return super.g(method, i);
        }
    }

    @Override // defpackage.so1
    public final Object j(Object obj, Method method, Object[] objArr) {
        switch (this.B) {
            case 0:
                if (Build.VERSION.SDK_INT >= 26) {
                    return tq5.u(obj, method, objArr);
                }
                vd6.i("Calling default methods on API 24 and 25 is not supported");
                return null;
            default:
                return tq5.u(obj, method, objArr);
        }
    }

    @Override // defpackage.so1
    public final boolean k(Method method) {
        switch (this.B) {
            case 0:
                return method.isDefault();
            default:
                return method.isDefault();
        }
    }
}
