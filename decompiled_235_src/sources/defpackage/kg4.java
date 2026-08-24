package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg4  reason: default package */
/* loaded from: classes.dex */
public final class kg4 extends r0 implements rc3 {
    public static final kg4 B = new r0(vs0.h0);

    @Override // defpackage.rc3
    public final m44 U() {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.rc3
    public final il1 a0(qn2 qn2Var) {
        return lg4.A;
    }

    @Override // defpackage.rc3
    public final Object c0(s41 s41Var) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.rc3
    public final boolean e() {
        return true;
    }

    @Override // defpackage.rc3
    public final il1 e0(boolean z, boolean z2, a0 a0Var) {
        return lg4.A;
    }

    @Override // defpackage.rc3
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.rc3
    public final hq0 r(ed3 ed3Var) {
        return lg4.A;
    }

    @Override // defpackage.rc3
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.rc3
    public final CancellationException v() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.rc3
    public final void h(CancellationException cancellationException) {
    }
}
