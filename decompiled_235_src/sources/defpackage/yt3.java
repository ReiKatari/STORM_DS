package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yt3  reason: default package */
/* loaded from: classes.dex */
public final class yt3 implements gu3 {
    public final zt3 A;
    public final hu3 B;

    public yt3(hu3 hu3Var, zt3 zt3Var) {
        this.B = hu3Var;
        this.A = zt3Var;
    }

    @ql4(st3.ON_DESTROY)
    public void onDestroy(hu3 hu3Var) {
        this.A.l(hu3Var);
    }

    @ql4(st3.ON_START)
    public void onStart(hu3 hu3Var) {
        this.A.g(hu3Var);
    }

    @ql4(st3.ON_STOP)
    public void onStop(hu3 hu3Var) {
        this.A.h(hu3Var);
    }
}
