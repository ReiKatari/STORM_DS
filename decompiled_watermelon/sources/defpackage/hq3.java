package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hq3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ AtomicBoolean B;
    public final /* synthetic */ i90 L;
    public final /* synthetic */ ki2 R;

    public /* synthetic */ hq3(AtomicBoolean atomicBoolean, i90 i90Var, ki2 ki2Var, int i) {
        this.A = i;
        this.B = atomicBoolean;
        this.L = i90Var;
        this.R = ki2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ki2 ki2Var = this.R;
        i90 i90Var = this.L;
        AtomicBoolean atomicBoolean = this.B;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        i90Var.a(ki2Var.c());
                        return;
                    } catch (Throwable th) {
                        i90Var.c(th);
                        return;
                    }
                }
                return;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        i90Var.a(ki2Var.c());
                        return;
                    } catch (Throwable th2) {
                        i90Var.c(th2);
                        return;
                    }
                }
                return;
        }
    }
}
