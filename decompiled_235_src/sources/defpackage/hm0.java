package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm0  reason: default package */
/* loaded from: classes.dex */
public final class hm0 extends p96 {
    public final v80 Z;
    public final /* synthetic */ AtomicReferenceArray d0;

    public hm0(long j, hm0 hm0Var, v80 v80Var, int i) {
        super(j, hm0Var, i);
        this.Z = v80Var;
        this.d0 = new AtomicReferenceArray(x80.b * 2);
    }

    @Override // defpackage.p96
    public final int l() {
        return x80.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        s(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
        if (r1 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x004d, code lost:
        r4.getClass();
        r6 = r4.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0052, code lost:
        if (r6 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0054, code lost:
        defpackage.oi2.k(r6, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0057, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    @Override // defpackage.p96
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, l61 l61Var) {
        boolean z;
        gr1 gr1Var;
        int i2 = x80.b;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i -= i2;
        }
        Object obj = this.d0.get(i * 2);
        while (true) {
            Object q = q(i);
            boolean z2 = q instanceof zr7;
            v80 v80Var = this.Z;
            if (!z2 && !(q instanceof as7)) {
                if (q == x80.j || q == x80.k) {
                    break;
                } else if (q != x80.g && q != x80.f) {
                    if (q != x80.i && q != x80.d && q != x80.l) {
                        e41.h(q, "unexpected state: ");
                        return;
                    }
                    return;
                }
            } else {
                if (z) {
                    gr1Var = x80.j;
                } else {
                    gr1Var = x80.k;
                }
                if (p(i, q, gr1Var)) {
                    s(i, null);
                    r(i, !z);
                    if (z) {
                        v80Var.getClass();
                        qn2 qn2Var = v80Var.B;
                        if (qn2Var != null) {
                            oi2.k(qn2Var, obj, l61Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final boolean p(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.d0;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object q(int i) {
        return this.d0.get((i * 2) + 1);
    }

    public final void r(int i, boolean z) {
        if (z) {
            v80 v80Var = this.Z;
            v80Var.getClass();
            v80Var.W((this.X * x80.b) + i);
        }
        n();
    }

    public final void s(int i, Object obj) {
        this.d0.set(i * 2, obj);
    }

    public final void t(int i, Object obj) {
        this.d0.set((i * 2) + 1, obj);
    }
}
