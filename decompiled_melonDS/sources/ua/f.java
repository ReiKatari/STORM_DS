package ua;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f13527b;

    public /* synthetic */ f(u uVar, int i2) {
        this.f13526a = i2;
        this.f13527b = uVar;
    }

    @Override // ua.u
    public final Object b(cb.a aVar) {
        switch (this.f13526a) {
            case 0:
                return new AtomicLong(((Number) this.f13527b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.F()) {
                    arrayList.add(Long.valueOf(((Number) this.f13527b.b(aVar)).longValue()));
                }
                aVar.v();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override // ua.u
    public final void c(cb.c cVar, Object obj) {
        switch (this.f13526a) {
            case 0:
                this.f13527b.c(cVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.i();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    this.f13527b.c(cVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                cVar.v();
                return;
        }
    }
}
