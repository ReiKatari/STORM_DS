package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fq6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fq6 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ od1 B;
    public final /* synthetic */ k24 L;

    public /* synthetic */ fq6(od1 od1Var, k24 k24Var, int i) {
        this.A = i;
        this.B = od1Var;
        this.L = k24Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        no4 no4Var;
        int i = this.A;
        k24 k24Var = this.L;
        od1 od1Var = this.B;
        switch (i) {
            case 0:
                el0 el0Var = new el0(8, (ki2) obj);
                fq6 fq6Var = new fq6(od1Var, k24Var, 1);
                if (at3.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        no4Var = no4.b;
                    } else {
                        no4Var = no4.c;
                    }
                    if (at3.a()) {
                        return new ws3(el0Var, fq6Var, no4Var);
                    }
                    return wy3.a;
                }
                vd6.i("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                ni1 ni1Var = (ni1) obj;
                int Y = od1Var.Y(ni1.b(ni1Var.a));
                k24Var.setValue(new i33((od1Var.Y(ni1.a(ni1Var.a)) & 4294967295L) | (Y << 32)));
                return o27.a;
        }
    }
}
