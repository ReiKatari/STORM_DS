package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hh2  reason: default package */
/* loaded from: classes.dex */
public final class hh2 extends ox6 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ jh2 e;

    public hh2(jh2 jh2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = jh2Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void a(ix6 ix6Var) {
        ix6Var.D(this);
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void d(ix6 ix6Var) {
        jh2 jh2Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            jh2Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            jh2Var.z(obj2, this.d, null);
        }
    }
}
