package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l91  reason: default package */
/* loaded from: classes.dex */
public final class l91 implements y80 {
    public final Executor A;
    public final y80 B;

    public l91(Executor executor, y80 y80Var) {
        this.A = executor;
        this.B = y80Var;
    }

    @Override // defpackage.y80
    public final void cancel() {
        this.B.cancel();
    }

    @Override // defpackage.y80
    public final y80 clone() {
        return new l91(this.A, this.B.mo11clone());
    }

    @Override // defpackage.y80
    public final void d(e90 e90Var) {
        this.B.d(new k91((Object) this, (Object) e90Var, false));
    }

    @Override // defpackage.y80
    public final ka i() {
        return this.B.i();
    }

    @Override // defpackage.y80
    public final boolean p() {
        return this.B.p();
    }
}
