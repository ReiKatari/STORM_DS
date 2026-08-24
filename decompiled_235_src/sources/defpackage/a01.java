package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a01  reason: default package */
/* loaded from: classes.dex */
public final class a01 extends yz3 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(b01 b01Var) {
        super(25);
        this.i = b01Var;
    }

    @Override // defpackage.yz3
    public Object c(Object obj) {
        switch (this.h) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((b01) this.i).A.i0(str);
            default:
                return super.c(obj);
        }
    }

    @Override // defpackage.yz3
    public final void d(Object obj, Object obj2, Object obj3) {
        switch (this.h) {
            case 0:
                j36 j36Var = (j36) obj2;
                j36 j36Var2 = (j36) obj3;
                ((String) obj).getClass();
                j36Var.getClass();
                j36Var.close();
                return;
            default:
                we5 we5Var = (we5) obj2;
                we5 we5Var2 = (we5) obj3;
                ((rs7) ((ap3) this.i).B).g((c44) obj, we5Var.a, we5Var.b, we5Var.c);
                return;
        }
    }

    @Override // defpackage.yz3
    public int o(Object obj, Object obj2) {
        switch (this.h) {
            case 1:
                c44 c44Var = (c44) obj;
                return ((we5) obj2).c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(int i, ap3 ap3Var) {
        super(i);
        this.i = ap3Var;
    }
}
