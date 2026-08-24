package defpackage;

import android.database.sqlite.SQLiteDatabase;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j97  reason: default package */
/* loaded from: classes.dex */
public final class j97 implements dx6, pj7, ll7, rt7 {
    public final /* synthetic */ int A;
    public Object B;

    public j97(float f, float f2, ap apVar) {
        j97 j97Var;
        this.A = 8;
        int[] iArr = jl7.a;
        if (apVar != null) {
            j97Var = new j97(apVar, f, f2);
        } else {
            j97Var = new j97(f, f2);
        }
        this.B = new eb(j97Var, 25);
    }

    @Override // defpackage.ll7, defpackage.il7
    public boolean a() {
        ((eb) this.B).getClass();
        return false;
    }

    @Override // defpackage.il7
    public long b(ap apVar, ap apVar2, ap apVar3) {
        return ((eb) this.B).b(apVar, apVar2, apVar3);
    }

    public long c(long j) {
        bg1 bg1Var = (bg1) this.B;
        bg1Var.getClass();
        if (ol7.b(j) <= RecyclerView.B1 || ol7.c(j) <= RecyclerView.B1) {
            p53.c("maximumVelocity should be a positive value. You specified=" + ((Object) ol7.g(j)));
        }
        return qo2.k(((rl7) bg1Var.B).b(ol7.b(j)), ((rl7) bg1Var.L).b(ol7.c(j)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [hf3, rf3] */
    public Object d(ee3 ee3Var, Type type) {
        su2 su2Var = ((yb7) this.B).c;
        su2Var.getClass();
        ie7 ie7Var = new ie7(type);
        ?? hf3Var = new hf3(rf3.q0);
        hf3Var.m0 = new Object[32];
        hf3Var.n0 = 0;
        hf3Var.o0 = new String[32];
        hf3Var.p0 = new int[32];
        hf3Var.E0(ee3Var);
        return su2Var.a(hf3Var, ie7Var);
    }

    public xd2 e(int i) {
        switch (this.A) {
            case 5:
                return ((de2[]) this.B)[i];
            case 6:
                return (de2) this.B;
            default:
                return (xd2) this.B;
        }
    }

    @Override // defpackage.il7
    public ap h(long j, ap apVar, ap apVar2, ap apVar3) {
        return ((eb) this.B).h(j, apVar, apVar2, apVar3);
    }

    @Override // defpackage.dx6
    public Object n() {
        SQLiteDatabase e;
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 3:
                i36 i36Var = (i36) obj;
                long a = i36Var.B.a() - i36Var.R.d;
                e = i36Var.e();
                e.beginTransaction();
                try {
                    int delete = e.delete("events", "timestamp_ms < ?", new String[]{String.valueOf(a)});
                    e.setTransactionSuccessful();
                    e.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            default:
                eb ebVar = (eb) obj;
                e = ((i36) ebVar.L).e();
                e.beginTransaction();
                try {
                    List<fz> list = (List) i36.u(e.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), xd5.n0);
                    e.setTransactionSuccessful();
                    e.endTransaction();
                    for (fz fzVar : list) {
                        ((bt) ebVar.R).U(fzVar, 1, false);
                    }
                    return null;
                } finally {
                }
        }
    }

    @Override // defpackage.il7
    public ap q(long j, ap apVar, ap apVar2, ap apVar3) {
        return ((eb) this.B).q(j, apVar, apVar2, apVar3);
    }

    @Override // defpackage.il7
    public ap r(ap apVar, ap apVar2, ap apVar3) {
        return ((eb) this.B).r(apVar, apVar2, apVar3);
    }

    public /* synthetic */ j97(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public j97(ov7 ov7Var, gt7 gt7Var, yj7 yj7Var) {
        this.A = 14;
        this.B = gt7Var;
    }

    public j97(o46 o46Var) {
        this.A = 12;
        this.B = new WeakReference(o46Var);
    }

    public j97() {
        this.A = 9;
        this.B = new bg1(0);
    }

    public j97(jh0 jh0Var, cf0 cf0Var, lb3 lb3Var) {
        this.A = 4;
        this.B = jh0Var;
        new ex6(new t46(this, 19));
    }

    public /* synthetic */ j97(int i) {
        this.A = i;
    }

    public j97(ap apVar, float f, float f2) {
        this.A = 5;
        int b = apVar.b();
        de2[] de2VarArr = new de2[b];
        for (int i = 0; i < b; i++) {
            de2VarArr[i] = new de2(f, f2, apVar.a(i));
        }
        this.B = de2VarArr;
    }

    public j97(float f, float f2) {
        this.A = 6;
        this.B = new de2(f, f2, 0.01f);
    }
}
