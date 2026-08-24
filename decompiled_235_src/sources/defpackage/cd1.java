package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd1  reason: default package */
/* loaded from: classes.dex */
public final class cd1 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mm6 B;

    public /* synthetic */ cd1(mm6 mm6Var, int i) {
        this.A = i;
        this.B = mm6Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        mm6 mm6Var = this.B;
        switch (i) {
            case 0:
                t93 t93Var = (t93) obj;
                if (t93Var instanceof oy2) {
                    mm6Var.add(t93Var);
                } else if (t93Var instanceof py2) {
                    mm6Var.remove(((py2) t93Var).a);
                } else if (t93Var instanceof sg2) {
                    mm6Var.add(t93Var);
                } else if (t93Var instanceof tg2) {
                    mm6Var.remove(((tg2) t93Var).a);
                } else if (t93Var instanceof l25) {
                    mm6Var.add(t93Var);
                } else if (t93Var instanceof m25) {
                    mm6Var.remove(((m25) t93Var).a);
                } else if (t93Var instanceof k25) {
                    mm6Var.remove(((k25) t93Var).a);
                }
                return jg7Var;
            case 1:
                t93 t93Var2 = (t93) obj;
                if (t93Var2 instanceof l25) {
                    mm6Var.add(t93Var2);
                } else if (t93Var2 instanceof m25) {
                    mm6Var.remove(((m25) t93Var2).a);
                } else if (t93Var2 instanceof k25) {
                    mm6Var.remove(((k25) t93Var2).a);
                } else if (t93Var2 instanceof ao1) {
                    mm6Var.add(t93Var2);
                } else if (t93Var2 instanceof bo1) {
                    mm6Var.remove(((bo1) t93Var2).a);
                } else if (t93Var2 instanceof zn1) {
                    mm6Var.remove(((zn1) t93Var2).a);
                }
                return jg7Var;
            default:
                t93 t93Var3 = (t93) obj;
                if (t93Var3 instanceof l25) {
                    mm6Var.add(t93Var3);
                } else if (t93Var3 instanceof m25) {
                    mm6Var.remove(((m25) t93Var3).a);
                } else if (t93Var3 instanceof k25) {
                    mm6Var.remove(((k25) t93Var3).a);
                } else if (t93Var3 instanceof ao1) {
                    mm6Var.add(t93Var3);
                } else if (t93Var3 instanceof bo1) {
                    mm6Var.remove(((bo1) t93Var3).a);
                } else if (t93Var3 instanceof zn1) {
                    mm6Var.remove(((zn1) t93Var3).a);
                }
                return jg7Var;
        }
    }
}
