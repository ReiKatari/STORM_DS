package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bi3  reason: default package */
/* loaded from: classes.dex */
public final class bi3 {
    public final /* synthetic */ int a;
    public final qj4 b;
    public final qj4 c;
    public boolean d;
    public Object e;
    public final ij3 f;

    public bi3(int i, int i2, int i3) {
        this.a = i3;
        switch (i3) {
            case 1:
                this.b = new qj4(i);
                this.c = new qj4(i2);
                this.f = new ij3(i, 30, 100);
                return;
            default:
                this.b = new qj4(i);
                this.c = new qj4(i2);
                this.f = new ij3(i, 90, 200);
                return;
        }
    }

    public final void a(int i, int i2) {
        int i3 = this.a;
        qj4 qj4Var = this.c;
        ij3 ij3Var = this.f;
        qj4 qj4Var2 = this.b;
        switch (i3) {
            case 0:
                if (i < RecyclerView.A1) {
                    pz2.a("Index should be non-negative");
                }
                qj4Var2.i(i);
                ij3Var.b(i);
                qj4Var.i(i2);
                return;
            default:
                if (i < RecyclerView.A1) {
                    pz2.a("Index should be non-negative (" + i + ')');
                }
                qj4Var2.i(i);
                ij3Var.b(i);
                qj4Var.i(i2);
                return;
        }
    }
}
