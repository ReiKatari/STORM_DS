package defpackage;

import java.lang.reflect.Field;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh5  reason: default package */
/* loaded from: classes.dex */
public final class sh5 extends rh5 {
    public final ph4 b;

    public sh5(ph4 ph4Var, th5 th5Var) {
        super(th5Var);
        this.b = ph4Var;
    }

    @Override // defpackage.rh5
    public final Object d() {
        return this.b.e();
    }

    @Override // defpackage.rh5
    public final void f(Object obj, hf3 hf3Var, qh5 qh5Var) {
        Field field = qh5Var.b;
        Object b = qh5Var.g.b(hf3Var);
        if (b == null && qh5Var.h) {
            return;
        }
        if (qh5Var.d) {
            vh5.b(obj, field);
        } else if (qh5Var.i) {
            throw new RuntimeException("Cannot set value of 'static final' ".concat(oh5.d(field, false)));
        }
        field.set(obj, b);
    }

    @Override // defpackage.rh5
    public final Object e(Object obj) {
        return obj;
    }
}
