package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tp6  reason: default package */
/* loaded from: classes.dex */
public final class tp6 implements sw5 {
    public final /* synthetic */ sw5 a;
    public final ee1 b;
    public final ee1 c;

    public tp6(sw5 sw5Var, final up6 up6Var) {
        this.a = sw5Var;
        this.b = me2.q(new ki2() { // from class: sp6
            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                boolean z = false;
                up6 up6Var2 = up6Var;
                switch (i) {
                    case 0:
                        if (up6Var2.a.h() < up6Var2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (up6Var2.a.h() > RecyclerView.A1) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        this.c = me2.q(new ki2() { // from class: sp6
            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                boolean z = false;
                up6 up6Var2 = up6Var;
                switch (i) {
                    case 0:
                        if (up6Var2.a.h() < up6Var2.b.h()) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                    default:
                        if (up6Var2.a.h() > RecyclerView.A1) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.sw5
    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.sw5
    public final boolean c() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final float d(float f) {
        return this.a.d(f);
    }

    @Override // defpackage.sw5
    public final Object e(r24 r24Var, aj2 aj2Var, j11 j11Var) {
        return this.a.e(r24Var, aj2Var, j11Var);
    }
}
