package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud7  reason: default package */
/* loaded from: classes.dex */
public final class ud7 implements zc7 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ yc7 L;

    public /* synthetic */ ud7(int i, yc7 yc7Var, Object obj) {
        this.A = i;
        this.B = obj;
        this.L = yc7Var;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        int i = this.A;
        yc7 yc7Var = this.L;
        Object obj = this.B;
        switch (i) {
            case 0:
                if (ie7Var.a != ((Class) obj)) {
                    return null;
                }
                return yc7Var;
            case 1:
                Class<?> cls = ie7Var.a;
                if (!((Class) obj).isAssignableFrom(cls)) {
                    return null;
                }
                return new et0(this, cls);
            default:
                if (!ie7Var.equals((ie7) obj)) {
                    return null;
                }
                return yc7Var;
        }
    }

    public String toString() {
        int i = this.A;
        yc7 yc7Var = this.L;
        Object obj = this.B;
        switch (i) {
            case 0:
                return "Factory[type=" + ((Class) obj).getName() + ",adapter=" + yc7Var + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) obj).getName() + ",adapter=" + yc7Var + "]";
            default:
                return super.toString();
        }
    }
}
