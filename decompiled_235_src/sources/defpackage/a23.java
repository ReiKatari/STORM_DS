package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a23  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a23 implements nc6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a23(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.nc6
    public final void a(rc6 rc6Var, oc6 oc6Var) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                d23 d23Var = (d23) obj;
                if (d23Var.d() != null) {
                    wy6 wy6Var = d23Var.w;
                    wy6Var.getClass();
                    nj2.h();
                    wy6Var.R = true;
                    d23Var.G(true);
                    yy yyVar = d23Var.i;
                    yyVar.getClass();
                    lc6 H = d23Var.H(d23Var.f(), (e23) d23Var.h, yyVar);
                    d23Var.u = H;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = new Object[]{H.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    d23Var.E(Collections.unmodifiableList(arrayList));
                    d23Var.r();
                    wy6 wy6Var2 = d23Var.w;
                    wy6Var2.getClass();
                    nj2.h();
                    wy6Var2.R = false;
                    wy6Var2.b();
                    return;
                }
                return;
            case 1:
                p25 p25Var = (p25) obj;
                if (p25Var.d() != null) {
                    p25Var.H((q25) p25Var.h, p25Var.i);
                    p25Var.r();
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((pc6) obj).n;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    ((nc6) obj3).a(rc6Var, oc6Var);
                }
                return;
        }
    }
}
