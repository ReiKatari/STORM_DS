package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gz6  reason: default package */
/* loaded from: classes.dex */
public class gz6 extends dz6 {
    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        ArrayList arrayList = new ArrayList();
        o83Var.d();
        while (o83Var.J()) {
            try {
                arrayList.add(Integer.valueOf(o83Var.T()));
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        o83Var.x();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        b93Var.i();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            b93Var.R(atomicIntegerArray.get(i));
        }
        b93Var.x();
    }
}
