package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm2  reason: default package */
/* loaded from: classes.dex */
public final class hm2 extends la7 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ jm2 e;

    public hm2(jm2 jm2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = jm2Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.la7, defpackage.da7
    public final void a(ea7 ea7Var) {
        ea7Var.D(this);
    }

    @Override // defpackage.la7, defpackage.da7
    public final void c(ea7 ea7Var) {
        jm2 jm2Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            jm2Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            jm2Var.z(obj2, this.d, null);
        }
    }
}
