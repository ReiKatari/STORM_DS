package defpackage;

import java.lang.reflect.Field;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c85  reason: default package */
/* loaded from: classes.dex */
public final class c85 extends b85 {
    public final y84 b;

    public c85(y84 y84Var, d85 d85Var) {
        super(d85Var);
        this.b = y84Var;
    }

    @Override // defpackage.b85
    public final Object d() {
        return this.b.d();
    }

    @Override // defpackage.b85
    public final void f(Object obj, o83 o83Var, a85 a85Var) {
        Field field = a85Var.b;
        Object b = a85Var.g.b(o83Var);
        if (b == null && a85Var.h) {
            return;
        }
        if (a85Var.d) {
            f85.b(obj, field);
        } else if (a85Var.i) {
            throw new RuntimeException("Cannot set value of 'static final' ".concat(y75.d(field, false)));
        }
        field.set(obj, b);
    }

    @Override // defpackage.b85
    public final Object e(Object obj) {
        return obj;
    }
}
