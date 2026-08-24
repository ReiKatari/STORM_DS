package defpackage;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gd1  reason: default package */
/* loaded from: classes.dex */
public final class gd1 implements gb0 {
    public final Executor A;
    public final gb0 B;

    public gd1(Executor executor, gb0 gb0Var) {
        this.A = executor;
        this.B = gb0Var;
    }

    @Override // defpackage.gb0
    public final void cancel() {
        this.B.cancel();
    }

    @Override // defpackage.gb0
    /* renamed from: clone */
    public final gb0 m2clone() {
        return new gd1(this.A, this.B.clone());
    }

    @Override // defpackage.gb0
    public final void h(mb0 mb0Var) {
        this.B.h(new yc1(this, mb0Var, false));
    }

    @Override // defpackage.gb0
    public final boolean r() {
        return this.B.r();
    }

    @Override // defpackage.gb0
    public final pa x() {
        return this.B.x();
    }
}
