package defpackage;

import android.view.Choreographer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hm  reason: default package */
/* loaded from: classes.dex */
public final class hm implements Choreographer.FrameCallback {
    public final /* synthetic */ ih0 A;
    public final /* synthetic */ mi2 B;

    public hm(ih0 ih0Var, im imVar, mi2 mi2Var) {
        this.A = ih0Var;
        this.B = mi2Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object kc5Var;
        try {
            kc5Var = this.B.n(Long.valueOf(j));
        } catch (Throwable th) {
            kc5Var = new kc5(th);
        }
        this.A.k(kc5Var);
    }
}
