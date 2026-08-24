package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class or6 implements nc6 {
    public final /* synthetic */ pr6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zi7 d;
    public final /* synthetic */ yy e;
    public final /* synthetic */ yy f;

    public /* synthetic */ or6(pr6 pr6Var, String str, String str2, zi7 zi7Var, yy yyVar, yy yyVar2) {
        this.a = pr6Var;
        this.b = str;
        this.c = str2;
        this.d = zi7Var;
        this.e = yyVar;
        this.f = yyVar2;
    }

    @Override // defpackage.nc6
    public final void a(rc6 rc6Var, oc6 oc6Var) {
        pr6 pr6Var = this.a;
        if (pr6Var.d() != null) {
            pr6Var.G();
            pr6Var.E(pr6Var.H(this.b, this.c, this.d, this.e, this.f));
            pr6Var.r();
            mq7 mq7Var = pr6Var.r;
            mq7Var.getClass();
            nj2.h();
            Iterator it = mq7Var.A.iterator();
            while (it.hasNext()) {
                mq7Var.b((di7) it.next());
            }
        }
    }
}
