package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m42  reason: default package */
/* loaded from: classes.dex */
public final class m42 extends s11 {
    public final cw3 a;
    public final dz4 b;

    public m42(cw3 cw3Var, dz4 dz4Var) {
        this.a = cw3Var;
        this.b = dz4Var;
    }

    @Override // defpackage.s11
    public final t11 a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, ka kaVar) {
        type.getClass();
        annotationArr2.getClass();
        dz4 dz4Var = this.b;
        return new n85(this.a, me2.P(((t63) dz4Var.A).b, type), dz4Var, 4);
    }

    @Override // defpackage.s11
    public final t11 b(Type type, Annotation[] annotationArr, ka kaVar) {
        annotationArr.getClass();
        dz4 dz4Var = this.b;
        return new k91(me2.P(((t63) dz4Var.A).b, type), dz4Var);
    }
}
