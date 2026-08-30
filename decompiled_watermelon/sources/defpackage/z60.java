package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z60  reason: default package */
/* loaded from: classes.dex */
public final class z60 extends s11 {
    public final /* synthetic */ int a;

    public /* synthetic */ z60(int i) {
        this.a = i;
    }

    @Override // defpackage.s11
    public t11 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ka kaVar) {
        switch (this.a) {
            case 0:
                if (ua5.class.isAssignableFrom(ct3.n0(type))) {
                    return sn1.R;
                }
                return null;
            default:
                return super.a(type, annotationArr, annotationArr2, kaVar);
        }
    }

    @Override // defpackage.s11
    public final t11 b(Type type, Annotation[] annotationArr, ka kaVar) {
        switch (this.a) {
            case 0:
                if (type == gc5.class) {
                    if (ct3.v0(annotationArr, fg6.class)) {
                        return k45.R;
                    }
                    return iq0.Y;
                } else if (type == Void.class) {
                    return iq0.Z;
                } else {
                    if (!ct3.l0 || type != o27.class) {
                        return null;
                    }
                    return y60.o0;
                }
            default:
                if (ct3.n0(type) != Optional.class) {
                    return null;
                }
                return new ka3(21, kaVar.r(ct3.m0(0, (ParameterizedType) type), annotationArr));
        }
    }
}
