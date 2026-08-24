package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z17  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z17 implements eo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ z17(int i) {
        this.A = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i;
        int i2 = this.A;
        Integer num = null;
        jg7 jg7Var = jg7.a;
        boolean z = true;
        switch (i2) {
            case 0:
                return Integer.valueOf(((x24) obj).n(((Integer) obj2).intValue()));
            case 1:
                n46 n46Var = (n46) obj;
                i27 i27Var = (i27) obj2;
                Float valueOf = Float.valueOf(i27Var.a.h());
                if (((lo4) i27Var.f.getValue()) != lo4.Vertical) {
                    z = false;
                }
                return hf.c0(valueOf, Boolean.valueOf(z));
            case 2:
                n46 n46Var2 = (n46) obj;
                c37 c37Var = (c37) obj2;
                return hf.w(p56.a(c37Var.a, p56.a, n46Var2), p56.a(new k47(c37Var.b), p56.p, n46Var2));
            case 3:
                j61 j61Var = (j61) obj2;
                if (j61Var instanceof l57) {
                    if (obj instanceof Integer) {
                        num = (Integer) obj;
                    }
                    if (num != null) {
                        i = num.intValue();
                    } else {
                        i = 1;
                    }
                    if (i == 0) {
                        return j61Var;
                    }
                    return Integer.valueOf(i + 1);
                }
                return obj;
            case 4:
                l57 l57Var = (l57) obj;
                j61 j61Var2 = (j61) obj2;
                if (l57Var != null) {
                    return l57Var;
                }
                if (!(j61Var2 instanceof l57)) {
                    return null;
                }
                return (l57) j61Var2;
            case 5:
                q57 q57Var = (q57) obj;
                j61 j61Var3 = (j61) obj2;
                if (j61Var3 instanceof l57) {
                    l57 l57Var2 = (l57) j61Var3;
                    l61 l61Var = q57Var.a;
                    Object b = l57Var2.b();
                    Object[] objArr = q57Var.b;
                    int i3 = q57Var.d;
                    objArr[i3] = b;
                    l57[] l57VarArr = q57Var.c;
                    q57Var.d = i3 + 1;
                    l57VarArr[i3] = l57Var2;
                }
                return q57Var;
            case 6:
                jg7 jg7Var2 = (jg7) obj2;
                ((sm3) obj).d0 = true;
                return jg7Var;
            case 7:
                ((Integer) obj2).getClass();
                l.e((px0) obj, ii2.a0(1));
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                is7.d((px0) obj, ii2.a0(1));
                return jg7Var;
        }
    }

    public /* synthetic */ z17(int i, int i2) {
        this.A = i2;
    }
}
