package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s74  reason: default package */
/* loaded from: classes.dex */
public final class s74 extends q0 implements c63 {
    public static final s74 B = new q0(k45.d0);

    @Override // defpackage.c63
    public final xn0 B(p63 p63Var) {
        return t74.A;
    }

    @Override // defpackage.c63
    public final n85 D() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.c63
    public final CancellationException K() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.c63
    public final eh1 R(mi2 mi2Var) {
        return t74.A;
    }

    @Override // defpackage.c63
    public final Object Z(k11 k11Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.c63
    public final boolean d() {
        return true;
    }

    @Override // defpackage.c63
    public final eh1 f0(boolean z, boolean z2, z zVar) {
        return t74.A;
    }

    @Override // defpackage.c63
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.c63
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.c63, defpackage.lj0
    public final void i(CancellationException cancellationException) {
    }
}
