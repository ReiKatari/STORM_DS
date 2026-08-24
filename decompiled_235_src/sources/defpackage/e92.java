package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e92  reason: default package */
/* loaded from: classes.dex */
public final class e92 extends a51 {
    public final n34 a;
    public final s35 b;

    public e92(n34 n34Var, s35 s35Var) {
        this.a = n34Var;
        this.b = s35Var;
    }

    @Override // defpackage.a51
    public final b51 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, pa paVar) {
        type.getClass();
        annotationArr2.getClass();
        s35 s35Var = this.b;
        return new m44(this.a, jx2.L(((id3) s35Var.A).b, type), s35Var, 15);
    }

    @Override // defpackage.a51
    public final b51 b(Type type, Annotation[] annotationArr, pa paVar) {
        annotationArr.getClass();
        s35 s35Var = this.b;
        return new yc1(jx2.L(((id3) s35Var.A).b, type), s35Var);
    }
}
