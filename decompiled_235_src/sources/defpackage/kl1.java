package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl1  reason: default package */
/* loaded from: classes.dex */
public final class kl1 extends aj3 implements on2 {
    public final /* synthetic */ boolean B;
    public final /* synthetic */ d56 L;
    public final /* synthetic */ String R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl1(boolean z, d56 d56Var, String str) {
        super(0);
        this.B = z;
        this.L = d56Var;
        this.R = str;
    }

    @Override // defpackage.on2
    public final Object c() {
        if (this.B) {
            d56 d56Var = this.L;
            String str = this.R;
            f56 f56Var = d56Var.a;
            synchronized (f56Var.c) {
                c56 c56Var = (c56) f56Var.d.remove(str);
            }
        }
        return jg7.a;
    }
}
