package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e90  reason: default package */
/* loaded from: classes.dex */
public final class e90 extends a51 {
    public final /* synthetic */ int a;

    public /* synthetic */ e90(int i) {
        this.a = i;
    }

    @Override // defpackage.a51
    public b51 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, pa paVar) {
        switch (this.a) {
            case 0:
                if (mk5.class.isAssignableFrom(ak7.c0(type))) {
                    return xd5.R;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, paVar);
        }
    }

    @Override // defpackage.a51
    public final b51 b(Type type, Annotation[] annotationArr, pa paVar) {
        switch (this.a) {
            case 0:
                if (type == yl5.class) {
                    if (ak7.l0(annotationArr, wr6.class)) {
                        return d90.p0;
                    }
                    return cs1.R;
                } else if (type == Void.class) {
                    return cs1.X;
                } else {
                    if (!ak7.i || type != jg7.class) {
                        return null;
                    }
                    return vs0.Z;
                }
            default:
                if (ak7.c0(type) != Optional.class) {
                    return null;
                }
                return new s63(paVar.t(ak7.Y(0, (ParameterizedType) type), annotationArr), 24);
        }
    }
}
