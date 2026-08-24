package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd7  reason: default package */
/* loaded from: classes.dex */
public final class cd7 extends yc7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yc7 b;

    public /* synthetic */ cd7(yc7 yc7Var, int i) {
        this.a = i;
        this.b = yc7Var;
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        int i = this.a;
        yc7 yc7Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                hf3Var.e();
                while (hf3Var.F()) {
                    arrayList.add(Long.valueOf(((Number) yc7Var.b(hf3Var)).longValue()));
                }
                hf3Var.r();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                return new AtomicLong(((Number) yc7Var.b(hf3Var)).longValue());
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        int i = this.a;
        yc7 yc7Var = this.b;
        switch (i) {
            case 0:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                vf3Var.h();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    yc7Var.c(vf3Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                vf3Var.r();
                return;
            default:
                yc7Var.c(vf3Var, Long.valueOf(((AtomicLong) obj).get()));
                return;
        }
    }
}
