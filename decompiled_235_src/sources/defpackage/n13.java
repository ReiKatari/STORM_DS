package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n13  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n13 implements nc6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ di7 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n13(di7 di7Var, Object obj, int i) {
        this.a = i;
        this.b = di7Var;
        this.c = obj;
    }

    @Override // defpackage.nc6
    public final void a(rc6 rc6Var, oc6 oc6Var) {
        int i = this.a;
        Object obj = this.c;
        di7 di7Var = this.b;
        switch (i) {
            case 0:
                r13 r13Var = (r13) di7Var;
                t13 t13Var = (t13) obj;
                if (r13Var.d() != null) {
                    nj2.h();
                    mc6 mc6Var = r13Var.y;
                    if (mc6Var != null) {
                        mc6Var.b();
                        r13Var.y = null;
                    }
                    o33 o33Var = r13Var.x;
                    if (o33Var != null) {
                        o33Var.a();
                        r13Var.x = null;
                    }
                    t13Var.d();
                    r13Var.f();
                    yy yyVar = r13Var.i;
                    yyVar.getClass();
                    lc6 G = r13Var.G((v13) r13Var.h, yyVar);
                    r13Var.w = G;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = new Object[]{G.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    r13Var.E(Collections.unmodifiableList(arrayList));
                    r13Var.r();
                    return;
                }
                return;
            default:
                v54 v54Var = (v54) di7Var;
                rc6Var.getClass();
                oc6Var.getClass();
                v54Var.E(hf.b0(v54Var.H((Size) obj).c()));
                v54Var.r();
                return;
        }
    }
}
