package defpackage;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r96  reason: default package */
/* loaded from: classes.dex */
public abstract class r96 {
    public static final o96 a = new o96(new byte[0], 0, 0, false, false);
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

    public static final void a(o96 o96Var) {
        int i;
        o96Var.getClass();
        if (o96Var.f == null && o96Var.g == null) {
            if (!o96Var.d) {
                AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
                o96 o96Var2 = a;
                o96 o96Var3 = (o96) atomicReference.getAndSet(o96Var2);
                if (o96Var3 == o96Var2) {
                    return;
                }
                if (o96Var3 != null) {
                    i = o96Var3.c;
                } else {
                    i = 0;
                }
                if (i >= 65536) {
                    atomicReference.set(o96Var3);
                    return;
                }
                o96Var.f = o96Var3;
                o96Var.b = 0;
                o96Var.c = i + 8192;
                atomicReference.set(o96Var);
                return;
            }
            return;
        }
        i.h("Failed requirement.");
    }

    public static final o96 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (b - 1))];
        o96 o96Var = a;
        o96 o96Var2 = (o96) atomicReference.getAndSet(o96Var);
        if (o96Var2 == o96Var) {
            return new o96();
        }
        if (o96Var2 == null) {
            atomicReference.set(null);
            return new o96();
        }
        atomicReference.set(o96Var2.f);
        o96Var2.f = null;
        o96Var2.c = 0;
        return o96Var2;
    }
}
