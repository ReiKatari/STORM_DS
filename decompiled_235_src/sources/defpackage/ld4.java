package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ld4  reason: default package */
/* loaded from: classes.dex */
public abstract class ld4 {
    public eb a;
    public boolean b;

    public final void a() {
        eb ebVar = this.a;
        if (ebVar != null) {
            if (!this.b) {
                ebVar.v(this, null);
            }
            md4 md4Var = (md4) ebVar.L;
            h61 h61Var = (h61) ebVar.B;
            md4Var.getClass();
            if (equals(md4Var.h) && -1 == md4Var.g) {
                jd4 jd4Var = md4Var.f;
                if (jd4Var == null) {
                    jd4Var = md4Var.c(-1);
                }
                md4Var.f = null;
                md4Var.g = 0;
                md4Var.h = null;
                if (jd4Var == null) {
                    ((il4) h61Var.B).a.run();
                } else {
                    jd4Var.b();
                }
                tp6 tp6Var = md4Var.a;
                tp6Var.getClass();
                tp6Var.m(null, nd4.i);
            }
            this.b = false;
            return;
        }
        i.m("This input is not added to any dispatcher.");
    }

    public void b(boolean z) {
    }
}
