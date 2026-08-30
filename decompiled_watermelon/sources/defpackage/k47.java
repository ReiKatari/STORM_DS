package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k47  reason: default package */
/* loaded from: classes.dex */
public final class k47 {
    public final g57 a;
    public final n57 b;
    public final n47 c;
    public final fw4 d;
    public final fw4 e;
    public final fw4 f;
    public final int g;
    public final aw h;
    public final il6 i;
    public final il6 j;

    public k47(g57 g57Var, n57 n57Var, n47 n47Var, fw4 fw4Var, fw4 fw4Var2, fw4 fw4Var3) {
        g57Var.getClass();
        n57Var.getClass();
        n47Var.getClass();
        fw4Var.getClass();
        fw4Var2.getClass();
        fw4Var3.getClass();
        this.a = g57Var;
        this.b = n57Var;
        this.c = n47Var;
        this.d = fw4Var;
        this.e = fw4Var2;
        this.f = fw4Var3;
        cw cwVar = l47.a;
        cwVar.getClass();
        this.g = cw.b.incrementAndGet(cwVar);
        this.h = w81.e(false);
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.i = new il6(new ki2(this) { // from class: j47
            public final /* synthetic */ k47 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                k47 k47Var = this.B;
                switch (i) {
                    case 0:
                        return (m57) k47Var.d.get();
                    case 1:
                        return (f16) k47Var.e.get();
                    default:
                        return (ci0) k47Var.f.get();
                }
            }
        });
        this.j = new il6(new ki2(this) { // from class: j47
            public final /* synthetic */ k47 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                k47 k47Var = this.B;
                switch (i) {
                    case 0:
                        return (m57) k47Var.d.get();
                    case 1:
                        return (f16) k47Var.e.get();
                    default:
                        return (ci0) k47Var.f.get();
                }
            }
        });
        new il6(new ki2(this) { // from class: j47
            public final /* synthetic */ k47 B;

            {
                this.B = this;
            }

            @Override // defpackage.ki2
            public final Object c() {
                int i = r2;
                k47 k47Var = this.B;
                switch (i) {
                    case 0:
                        return (m57) k47Var.d.get();
                    case 1:
                        return (f16) k47Var.e.get();
                    default:
                        return (ci0) k47Var.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
