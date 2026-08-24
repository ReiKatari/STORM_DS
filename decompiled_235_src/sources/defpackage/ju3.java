package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju3  reason: default package */
/* loaded from: classes.dex */
public final class ju3 {
    public tt3 a;
    public fu3 b;

    public final void a(hu3 hu3Var, st3 st3Var) {
        tt3 targetState = st3Var.getTargetState();
        tt3 tt3Var = this.a;
        tt3Var.getClass();
        if (targetState != null && targetState.compareTo(tt3Var) < 0) {
            tt3Var = targetState;
        }
        this.a = tt3Var;
        this.b.h(hu3Var, st3Var);
        this.a = targetState;
    }
}
