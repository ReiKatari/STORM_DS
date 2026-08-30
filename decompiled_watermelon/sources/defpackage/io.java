package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: io  reason: default package */
/* loaded from: classes.dex */
public final class io implements ae6 {
    public final bz6 A;
    public final tj4 B;
    public oo L;
    public long R;
    public long X;
    public boolean Y;

    public io(bz6 bz6Var, Object obj, oo ooVar, long j, long j2, boolean z) {
        oo ooVar2;
        this.A = bz6Var;
        this.B = me2.G(obj);
        if (ooVar != null) {
            ooVar2 = jv3.r(ooVar);
        } else {
            ooVar2 = (oo) bz6Var.a.n(obj);
            ooVar2.d();
        }
        this.L = ooVar2;
        this.R = j;
        this.X = j2;
        this.Y = z;
    }

    public final Object b() {
        return this.A.b.n(this.L);
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return this.B.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.B.getValue() + ", velocity=" + b() + ", isRunning=" + this.Y + ", lastFrameTimeNanos=" + this.R + ", finishedTimeNanos=" + this.X + ')';
    }

    public /* synthetic */ io(bz6 bz6Var, Object obj, oo ooVar, int i) {
        this(bz6Var, obj, (i & 4) != 0 ? null : ooVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
