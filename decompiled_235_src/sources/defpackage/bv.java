package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv  reason: default package */
/* loaded from: classes.dex */
public final class bv extends yc7 {
    public static final av c = new av();
    public final Class a;
    public final lc3 b;

    public bv(su2 su2Var, yc7 yc7Var, Class cls) {
        this.b = new lc3(su2Var, yc7Var, cls, 2);
        this.a = cls;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        if (hf3Var.n0() == jf3.NULL) {
            hf3Var.j0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        hf3Var.e();
        while (hf3Var.F()) {
            arrayList.add(this.b.c.b(hf3Var));
        }
        hf3Var.r();
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

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        if (obj == null) {
            vf3Var.A();
            return;
        }
        vf3Var.h();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(vf3Var, Array.get(obj, i));
        }
        vf3Var.r();
    }
}
