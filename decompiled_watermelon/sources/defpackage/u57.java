package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u57  reason: default package */
/* loaded from: classes.dex */
public final class u57 implements t57, m77, uw2, pe7 {
    public final /* synthetic */ int A;
    public final Object B;

    public u57(oo ooVar, float f, float f2) {
        this.A = 1;
        int b = ooVar.b();
        l92[] l92VarArr = new l92[b];
        for (int i = 0; i < b; i++) {
            l92VarArr[i] = new l92(f, f2, ooVar.a(i));
        }
        this.B = l92VarArr;
    }

    @Override // defpackage.m77, defpackage.j77
    public boolean a() {
        ((q9) this.B).getClass();
        return false;
    }

    @Override // defpackage.j77
    public long b(oo ooVar, oo ooVar2, oo ooVar3) {
        return ((q9) this.B).b(ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.uw2
    public void c() {
        ((k24) this.B).setValue(Boolean.TRUE);
    }

    public long e(long j) {
        ac1 ac1Var = (ac1) this.B;
        ac1Var.getClass();
        if (p77.b(j) <= RecyclerView.A1 || p77.c(j) <= RecyclerView.A1) {
            mz2.c("maximumVelocity should be a positive value. You specified=" + ((Object) p77.g(j)));
        }
        return nl2.n(((s77) ac1Var.B).b(p77.b(j)), ((s77) ac1Var.L).b(p77.c(j)));
    }

    public f92 f(int i) {
        int i2 = this.A;
        Object obj = this.B;
        switch (i2) {
            case 1:
                return ((l92[]) obj)[i];
            case 2:
                return (l92) obj;
            default:
                return (f92) obj;
        }
    }

    @Override // defpackage.j77
    public oo l(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        return ((q9) this.B).l(j, ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.j77
    public oo p(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        return ((q9) this.B).p(j, ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.j77
    public oo q(oo ooVar, oo ooVar2, oo ooVar3) {
        return ((q9) this.B).q(ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.uw2
    public void d() {
    }

    public u57(og7 og7Var, ee7 ee7Var, vn1 vn1Var) {
        this.A = 11;
        this.B = ee7Var;
    }

    public u57(jt5 jt5Var) {
        this.A = 9;
        this.B = new WeakReference(jt5Var);
    }

    public u57() {
        this.A = 5;
        this.B = new ac1(0);
    }

    public u57(af0 af0Var, tc0 tc0Var, z43 z43Var) {
        this.A = 0;
        this.B = af0Var;
        new il6(new t06(12, this));
    }

    public u57(float f, float f2, oo ooVar) {
        u57 u57Var;
        this.A = 4;
        int[] iArr = k77.a;
        if (ooVar != null) {
            u57Var = new u57(ooVar, f, f2);
        } else {
            u57Var = new u57(f, f2);
        }
        this.B = new q9(25, u57Var);
    }

    public /* synthetic */ u57(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    public u57(float f, float f2) {
        this.A = 2;
        this.B = new l92(f, f2, 0.01f);
    }
}
