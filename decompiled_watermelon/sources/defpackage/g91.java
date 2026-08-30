package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g91  reason: default package */
/* loaded from: classes.dex */
public final class g91 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xa6 B;

    public /* synthetic */ g91(xa6 xa6Var, int i) {
        this.A = i;
        this.B = xa6Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        xa6 xa6Var = this.B;
        switch (i) {
            case 0:
                l33 l33Var = (l33) obj;
                if (l33Var instanceof ns2) {
                    xa6Var.add(l33Var);
                } else if (l33Var instanceof os2) {
                    xa6Var.remove(((os2) l33Var).a);
                } else if (l33Var instanceof bc2) {
                    xa6Var.add(l33Var);
                } else if (l33Var instanceof cc2) {
                    xa6Var.remove(((cc2) l33Var).a);
                } else if (l33Var instanceof jt4) {
                    xa6Var.add(l33Var);
                } else if (l33Var instanceof kt4) {
                    xa6Var.remove(((kt4) l33Var).a);
                } else if (l33Var instanceof it4) {
                    xa6Var.remove(((it4) l33Var).a);
                }
                return o27Var;
            case 1:
                l33 l33Var2 = (l33) obj;
                if (l33Var2 instanceof jt4) {
                    xa6Var.add(l33Var2);
                } else if (l33Var2 instanceof kt4) {
                    xa6Var.remove(((kt4) l33Var2).a);
                } else if (l33Var2 instanceof it4) {
                    xa6Var.remove(((it4) l33Var2).a);
                } else if (l33Var2 instanceof uj1) {
                    xa6Var.add(l33Var2);
                } else if (l33Var2 instanceof vj1) {
                    xa6Var.remove(((vj1) l33Var2).a);
                } else if (l33Var2 instanceof tj1) {
                    xa6Var.remove(((tj1) l33Var2).a);
                }
                return o27Var;
            default:
                l33 l33Var3 = (l33) obj;
                if (l33Var3 instanceof jt4) {
                    xa6Var.add(l33Var3);
                } else if (l33Var3 instanceof kt4) {
                    xa6Var.remove(((kt4) l33Var3).a);
                } else if (l33Var3 instanceof it4) {
                    xa6Var.remove(((it4) l33Var3).a);
                } else if (l33Var3 instanceof uj1) {
                    xa6Var.add(l33Var3);
                } else if (l33Var3 instanceof vj1) {
                    xa6Var.remove(((vj1) l33Var3).a);
                } else if (l33Var3 instanceof tj1) {
                    xa6Var.remove(((tj1) l33Var3).a);
                }
                return o27Var;
        }
    }
}
