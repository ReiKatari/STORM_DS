package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh1  reason: default package */
/* loaded from: classes.dex */
public final class gh1 extends ic3 implements ki2 {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ xt5 L;
    public final /* synthetic */ String R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh1(boolean z, xt5 xt5Var, String str) {
        super(0);
        this.B = z;
        this.L = xt5Var;
        this.R = str;
    }

    @Override // defpackage.ki2
    public final Object c() {
        if (this.B) {
            xt5 xt5Var = this.L;
            String str = this.R;
            zt5 zt5Var = xt5Var.a;
            synchronized (zt5Var.c) {
                wt5 wt5Var = (wt5) zt5Var.d.remove(str);
            }
        }
        return o27.a;
    }
}
