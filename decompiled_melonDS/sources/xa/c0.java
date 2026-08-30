package xa;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class c0 extends ua.u {
    @Override // ua.u
    public final Object b(cb.a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.F()) {
            try {
                arrayList.add(Integer.valueOf(aVar.K()));
            } catch (NumberFormatException e6) {
                throw new RuntimeException(e6);
            }
        }
        aVar.v();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        cVar.i();
        int length = atomicIntegerArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            cVar.L(atomicIntegerArray.get(i2));
        }
        cVar.v();
    }
}
