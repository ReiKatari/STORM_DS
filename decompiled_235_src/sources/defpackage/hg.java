package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hg  reason: default package */
/* loaded from: classes.dex */
public final class hg extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ mj1 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg(mj1 mj1Var, int i) {
        super(1);
        this.B = i;
        this.L = mj1Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        mj1 mj1Var = this.L;
        switch (i) {
            case 0:
                gl1 gl1Var = (gl1) obj;
                mj1Var.show();
                return new z3(mj1Var, 2);
            default:
                dl4 dl4Var = (dl4) obj;
                if (mj1Var.Y.a) {
                    mj1Var.X.c();
                }
                return jg7.a;
        }
    }
}
