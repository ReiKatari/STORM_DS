package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bd7  reason: default package */
/* loaded from: classes.dex */
public class bd7 extends yc7 {
    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        ArrayList arrayList = new ArrayList();
        hf3Var.e();
        while (hf3Var.F()) {
            try {
                arrayList.add(Integer.valueOf(hf3Var.Z()));
            } catch (NumberFormatException e) {
                throw new RuntimeException(e);
            }
        }
        hf3Var.r();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        vf3Var.h();
        int length = atomicIntegerArray.length();
        for (int i = 0; i < length; i++) {
            vf3Var.X(atomicIntegerArray.get(i));
        }
        vf3Var.r();
    }
}
