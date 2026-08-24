package defpackage;

import android.view.Choreographer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm  reason: default package */
/* loaded from: classes.dex */
public final class tm implements Choreographer.FrameCallback {
    public final /* synthetic */ rj0 A;
    public final /* synthetic */ qn2 B;

    public tm(rj0 rj0Var, um umVar, qn2 qn2Var) {
        this.A = rj0Var;
        this.B = qn2Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object em5Var;
        try {
            em5Var = this.B.g(Long.valueOf(j));
        } catch (Throwable th) {
            em5Var = new em5(th);
        }
        this.A.i(em5Var);
    }
}
