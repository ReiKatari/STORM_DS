package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l55  reason: default package */
/* loaded from: classes.dex */
public abstract class l55 {
    public final yr3 a;

    public l55(on2 on2Var) {
        this.a = new yr3(on2Var);
    }

    public abstract pq a(Object obj);

    public nk7 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nk7 c(pq pqVar, nk7 nk7Var) {
        er1 er1Var = null;
        if (nk7Var instanceof er1) {
            if (pqVar.d) {
                er1Var = (er1) nk7Var;
                er1Var.a.setValue(pqVar.c());
            }
        } else if (nk7Var instanceof oq6) {
            if ((pqVar.c || pqVar.b != null) && !pqVar.d) {
                oq6 oq6Var = (oq6) nk7Var;
                if (nb3.k(pqVar.c(), oq6Var.a)) {
                    er1Var = oq6Var;
                }
            }
        } else if (nk7Var instanceof qy0) {
            pqVar.getClass();
        }
        if (er1Var == null) {
            if (pqVar.d) {
                Object obj = pqVar.b;
                im6 im6Var = (im6) pqVar.a;
                if (im6Var == null) {
                    im6Var = xd5.s0;
                }
                return new er1(new vs4(obj, im6Var));
            }
            return new oq6(pqVar.c());
        }
        return er1Var;
    }
}
