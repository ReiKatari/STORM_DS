package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uh3  reason: default package */
/* loaded from: classes.dex */
public final class uh3 {
    public final xm6 a;
    public vh3 b;
    public ah2 c;

    public uh3(xm6 xm6Var) {
        this.a = xm6Var;
    }

    public final vh3 a() {
        vh3 vh3Var = this.b;
        if (vh3Var != null) {
            return vh3Var;
        }
        nb3.a0("keyboardActions");
        throw null;
    }

    public final boolean b(int i) {
        qn2 qn2Var;
        xm6 xm6Var;
        if (i == 7) {
            qn2Var = a().a;
        } else {
            if (i == 2) {
                a();
            } else if (i == 6) {
                a();
            } else if (i == 5) {
                a();
            } else if (i == 3) {
                a();
            } else if (i == 4) {
                a();
            } else if (i != 1 && i != 0) {
                i.m("invalid ImeAction");
                return false;
            }
            qn2Var = null;
        }
        if (qn2Var != null) {
            qn2Var.g(this);
            return true;
        } else if (i == 6) {
            ah2 ah2Var = this.c;
            if (ah2Var != null) {
                ((eh2) ah2Var).g(1, true);
                return true;
            }
            nb3.a0("focusManager");
            throw null;
        } else if (i == 5) {
            ah2 ah2Var2 = this.c;
            if (ah2Var2 != null) {
                ((eh2) ah2Var2).g(2, true);
                return true;
            }
            nb3.a0("focusManager");
            throw null;
        } else if (i != 7 || (xm6Var = this.a) == null) {
            return false;
        } else {
            ((bh1) xm6Var).a();
            return true;
        }
    }
}
