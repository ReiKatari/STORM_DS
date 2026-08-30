package fj;

import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f4983a = new b0(new byte[0], 0, 0, false);

    /* renamed from: b  reason: collision with root package name */
    public static final int f4984b;

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicReference[] f4985c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4984b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference();
        }
        f4985c = atomicReferenceArr;
    }

    public static final void a(b0 b0Var) {
        int i2;
        b0Var.getClass();
        if (b0Var.f4981f == null && b0Var.f4982g == null) {
            if (!b0Var.f4979d) {
                AtomicReference atomicReference = f4985c[(int) (Thread.currentThread().getId() & (f4984b - 1))];
                b0 b0Var2 = f4983a;
                b0 b0Var3 = (b0) atomicReference.getAndSet(b0Var2);
                if (b0Var3 == b0Var2) {
                    return;
                }
                if (b0Var3 != null) {
                    i2 = b0Var3.f4978c;
                } else {
                    i2 = 0;
                }
                if (i2 >= 65536) {
                    atomicReference.set(b0Var3);
                    return;
                }
                b0Var.f4981f = b0Var3;
                b0Var.f4977b = 0;
                b0Var.f4978c = i2 + 8192;
                atomicReference.set(b0Var);
                return;
            }
            return;
        }
        a0.j.h("Failed requirement.");
    }

    public static final b0 b() {
        AtomicReference atomicReference = f4985c[(int) (Thread.currentThread().getId() & (f4984b - 1))];
        b0 b0Var = f4983a;
        b0 b0Var2 = (b0) atomicReference.getAndSet(b0Var);
        if (b0Var2 == b0Var) {
            return new b0();
        }
        if (b0Var2 == null) {
            atomicReference.set(null);
            return new b0();
        }
        atomicReference.set(b0Var2.f4981f);
        b0Var2.f4981f = null;
        b0Var2.f4978c = 0;
        return b0Var2;
    }
}
