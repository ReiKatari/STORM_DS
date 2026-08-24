package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii7  reason: default package */
/* loaded from: classes.dex */
public final class ii7 {
    public final ej7 a;
    public final kj7 b;
    public final li7 c;
    public final n55 d;
    public final n55 e;
    public final n55 f;
    public final int g;
    public final sw h;
    public final ex6 i;
    public final ex6 j;

    public ii7(ej7 ej7Var, kj7 kj7Var, li7 li7Var, n55 n55Var, n55 n55Var2, n55 n55Var3) {
        ej7Var.getClass();
        kj7Var.getClass();
        li7Var.getClass();
        n55Var.getClass();
        n55Var2.getClass();
        n55Var3.getClass();
        this.a = ej7Var;
        this.b = kj7Var;
        this.c = li7Var;
        this.d = n55Var;
        this.e = n55Var2;
        this.f = n55Var3;
        uw uwVar = ji7.a;
        uwVar.getClass();
        this.g = uw.b.incrementAndGet(uwVar);
        this.h = g04.s(false);
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        this.i = new ex6(new on2(this) { // from class: hi7
            public final /* synthetic */ ii7 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ii7 ii7Var = this.B;
                switch (i) {
                    case 0:
                        return (jj7) ii7Var.d.get();
                    case 1:
                        return (tc6) ii7Var.e.get();
                    default:
                        return (kk0) ii7Var.f.get();
                }
            }
        });
        this.j = new ex6(new on2(this) { // from class: hi7
            public final /* synthetic */ ii7 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ii7 ii7Var = this.B;
                switch (i) {
                    case 0:
                        return (jj7) ii7Var.d.get();
                    case 1:
                        return (tc6) ii7Var.e.get();
                    default:
                        return (kk0) ii7Var.f.get();
                }
            }
        });
        new ex6(new on2(this) { // from class: hi7
            public final /* synthetic */ ii7 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                ii7 ii7Var = this.B;
                switch (i) {
                    case 0:
                        return (jj7) ii7Var.d.get();
                    case 1:
                        return (tc6) ii7Var.e.get();
                    default:
                        return (kk0) ii7Var.f.get();
                }
            }
        });
    }

    public final String toString() {
        return "UseCaseCamera-" + this.g;
    }
}
