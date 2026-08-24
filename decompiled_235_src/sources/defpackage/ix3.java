package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ix3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ix3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ AtomicBoolean B;
    public final /* synthetic */ qb0 L;
    public final /* synthetic */ on2 R;

    public /* synthetic */ ix3(AtomicBoolean atomicBoolean, qb0 qb0Var, on2 on2Var, int i) {
        this.A = i;
        this.B = atomicBoolean;
        this.L = qb0Var;
        this.R = on2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        on2 on2Var = this.R;
        qb0 qb0Var = this.L;
        AtomicBoolean atomicBoolean = this.B;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        qb0Var.a(on2Var.c());
                        return;
                    } catch (Throwable th) {
                        qb0Var.c(th);
                        return;
                    }
                }
                return;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        qb0Var.a(on2Var.c());
                        return;
                    } catch (Throwable th2) {
                        qb0Var.c(th2);
                        return;
                    }
                }
                return;
        }
    }
}
