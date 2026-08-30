package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r02  reason: default package */
/* loaded from: classes.dex */
public final class r02 extends ic3 implements mi2 {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ ki2 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r02(ki2 ki2Var, boolean z) {
        super(1);
        this.B = z;
        this.L = ki2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        rf5 rf5Var = (rf5) obj;
        if (!this.B && ((Boolean) this.L.c()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        rf5Var.f(z);
        return o27.a;
    }
}
