package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wv2 implements z06 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wv2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.z06
    public final void a(d16 d16Var, a16 a16Var) {
        int i = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                zv2 zv2Var = (zv2) obj;
                if (zv2Var.d() != null) {
                    mm6 mm6Var = zv2Var.w;
                    mm6Var.getClass();
                    nk2.s();
                    mm6Var.R = true;
                    zv2Var.G(true);
                    jx jxVar = zv2Var.i;
                    jxVar.getClass();
                    x06 H = zv2Var.H(zv2Var.f(), (aw2) zv2Var.h, jxVar);
                    zv2Var.u = H;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj2 = new Object[]{H.c()}[0];
                    Objects.requireNonNull(obj2);
                    arrayList.add(obj2);
                    zv2Var.E(Collections.unmodifiableList(arrayList));
                    zv2Var.r();
                    mm6 mm6Var2 = zv2Var.w;
                    mm6Var2.getClass();
                    nk2.s();
                    mm6Var2.R = false;
                    mm6Var2.b();
                    return;
                }
                return;
            case 1:
                nt4 nt4Var = (nt4) obj;
                if (nt4Var.d() != null) {
                    nt4Var.H((ot4) nt4Var.h, nt4Var.i);
                    nt4Var.r();
                    return;
                }
                return;
            default:
                ArrayList arrayList2 = ((b16) obj).n;
                int size = arrayList2.size();
                while (i2 < size) {
                    Object obj3 = arrayList2.get(i2);
                    i2++;
                    ((z06) obj3).a(d16Var, a16Var);
                }
                return;
        }
    }
}
