package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hz6  reason: default package */
/* loaded from: classes.dex */
public final class hz6 extends dz6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dz6 b;

    public /* synthetic */ hz6(dz6 dz6Var, int i) {
        this.a = i;
        this.b = dz6Var;
    }

    @Override // defpackage.dz6
    public final Object b(o83 o83Var) {
        int i = this.a;
        dz6 dz6Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                o83Var.d();
                while (o83Var.J()) {
                    arrayList.add(Long.valueOf(((Number) dz6Var.b(o83Var)).longValue()));
                }
                o83Var.x();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                return new AtomicLong(((Number) dz6Var.b(o83Var)).longValue());
        }
    }

    @Override // defpackage.dz6
    public final void c(b93 b93Var, Object obj) {
        int i = this.a;
        dz6 dz6Var = this.b;
        switch (i) {
            case 0:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                b93Var.i();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    dz6Var.c(b93Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                b93Var.x();
                return;
            default:
                dz6Var.c(b93Var, Long.valueOf(((AtomicLong) obj).get()));
                return;
        }
    }
}
