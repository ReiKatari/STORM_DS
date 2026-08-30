package gk;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5716a;

    public /* synthetic */ c(int i2) {
        this.f5716a = i2;
    }

    @Override // gk.m
    public n a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w.x0 x0Var) {
        switch (this.f5716a) {
            case 0:
                if (pi.b0.class.isAssignableFrom(y0.h(type))) {
                    return b.R;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, x0Var);
        }
    }

    @Override // gk.m
    public final n b(Type type, Annotation[] annotationArr, w.x0 x0Var) {
        switch (this.f5716a) {
            case 0:
                if (type == pi.g0.class) {
                    if (y0.l(annotationArr, ik.w.class)) {
                        return b.X;
                    }
                    return b.L;
                } else if (type == Void.class) {
                    return b.Z;
                } else {
                    if (y0.f5815b && type == yb.y.class) {
                        return b.Y;
                    }
                    return null;
                }
            default:
                if (y0.h(type) != Optional.class) {
                    return null;
                }
                return new d2.t(7, x0Var.r(y0.g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
