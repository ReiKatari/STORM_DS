package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fy5  reason: default package */
/* loaded from: classes.dex */
public abstract class fy5 {
    public static final cy5 a = new cy5(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(cy5 cy5Var) {
        int i;
        cy5Var.getClass();
        if (cy5Var.f == null && cy5Var.g == null) {
            if (!cy5Var.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
                cy5 cy5Var2 = a;
                cy5 cy5Var3 = (cy5) atomicReference.getAndSet(cy5Var2);
                if (cy5Var3 == cy5Var2) {
                    return;
                }
                if (cy5Var3 != null) {
                    i = cy5Var3.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(cy5Var3);
                    return;
                }
                cy5Var.f = cy5Var3;
                cy5Var.b = 0;
                cy5Var.c = i + 8192;
                atomicReference.set(cy5Var);
                return;
            }
            return;
        }
        i.i("Failed requirement.");
    }

    public static final cy5 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        cy5 cy5Var = a;
        cy5 cy5Var2 = (cy5) atomicReference.getAndSet(cy5Var);
        if (cy5Var2 == cy5Var) {
            return new cy5();
        }
        if (cy5Var2 == null) {
            atomicReference.set(null);
            return new cy5();
        }
        atomicReference.set(cy5Var2.f);
        cy5Var2.f = null;
        cy5Var2.c = 0;
        return cy5Var2;
    }
}
