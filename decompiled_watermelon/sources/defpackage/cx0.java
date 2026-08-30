package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cx0  reason: default package */
/* loaded from: classes.dex */
public final class cx0 extends us3 {
    public final /* synthetic */ int h = 1;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx0(dx0 dx0Var) {
        super(25);
        this.i = dx0Var;
    }

    @Override // defpackage.us3
    public Object c(Object obj) {
        switch (this.h) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((dx0) this.i).A.i0(str);
            default:
                return super.c(obj);
        }
    }

    @Override // defpackage.us3
    public final void d(Object obj, Object obj2, Object obj3) {
        switch (this.h) {
            case 0:
                ns5 ns5Var = (ns5) obj2;
                ns5 ns5Var2 = (ns5) obj3;
                ((String) obj).getClass();
                ns5Var.getClass();
                ns5Var.close();
                return;
            default:
                j55 j55Var = (j55) obj2;
                j55 j55Var2 = (j55) obj3;
                ((ud7) ((ci3) this.i).B).h((ow3) obj, j55Var.a, j55Var.b, j55Var.c);
                return;
        }
    }

    @Override // defpackage.us3
    public int o(Object obj, Object obj2) {
        switch (this.h) {
            case 1:
                ow3 ow3Var = (ow3) obj;
                return ((j55) obj2).c;
            default:
                return super.o(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx0(int i, ci3 ci3Var) {
        super(i);
        this.i = ci3Var;
    }
}
