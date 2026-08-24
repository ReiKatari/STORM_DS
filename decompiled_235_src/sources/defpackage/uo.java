package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uo  reason: default package */
/* loaded from: classes.dex */
public final class uo implements pp6 {
    public final wc7 A;
    public final vs4 B;
    public ap L;
    public long R;
    public long X;
    public boolean Y;

    public uo(wc7 wc7Var, Object obj, ap apVar, long j, long j2, boolean z) {
        ap apVar2;
        this.A = wc7Var;
        this.B = np2.Y(obj);
        if (apVar != null) {
            apVar2 = nw7.R(apVar);
        } else {
            apVar2 = (ap) wc7Var.a.g(obj);
            apVar2.d();
        }
        this.L = apVar2;
        this.R = j;
        this.X = j2;
        this.Y = z;
    }

    public final Object a() {
        return this.A.b.g(this.L);
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return this.B.getValue();
    }

    public final String toString() {
        return "AnimationState(value=" + this.B.getValue() + ", velocity=" + a() + ", isRunning=" + this.Y + ", lastFrameTimeNanos=" + this.R + ", finishedTimeNanos=" + this.X + ')';
    }

    public /* synthetic */ uo(wc7 wc7Var, Object obj, ap apVar, int i) {
        this(wc7Var, obj, (i & 4) != 0 ? null : apVar, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }
}
