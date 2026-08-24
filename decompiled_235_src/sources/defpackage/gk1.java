package defpackage;

import java.io.Closeable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk1  reason: default package */
/* loaded from: classes.dex */
public final class gk1 implements Closeable {
    public final ek1 A;
    public boolean B;
    public final /* synthetic */ lk1 L;

    public gk1(lk1 lk1Var, ek1 ek1Var) {
        this.L = lk1Var;
        this.A = ek1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.B) {
            this.B = true;
            lk1 lk1Var = this.L;
            synchronized (lk1Var) {
                ek1 ek1Var = this.A;
                int i = ek1Var.h - 1;
                ek1Var.h = i;
                if (i == 0 && ek1Var.f) {
                    xh5 xh5Var = lk1.m0;
                    lk1Var.A(ek1Var);
                }
            }
        }
    }
}
