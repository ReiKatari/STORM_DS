package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ju  reason: default package */
/* loaded from: classes.dex */
public final class ju extends dz6 {
    public static final iu c = new iu();
    public final Class a;
    public final x53 b;

    public ju(qo2 qo2Var, dz6 dz6Var, Class cls) {
        this.b = new x53(qo2Var, dz6Var, cls, 2);
        this.a = cls;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        if (o83Var.n0() == q83.NULL) {
            o83Var.j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        o83Var.d();
        while (o83Var.J()) {
            arrayList.add(this.b.c.b(o83Var));
        }
        o83Var.x();
        int size = arrayList.size();
        Class cls = this.a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        if (obj == null) {
            b93Var.F();
            return;
        }
        b93Var.i();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(b93Var, Array.get(obj, i));
        }
        b93Var.x();
    }
}
