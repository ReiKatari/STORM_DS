package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rb7  reason: default package */
/* loaded from: classes.dex */
public final class rb7 {
    public final fz a;
    public final c42 b;
    public final q97 c;
    public final sb7 d;

    public rb7(fz fzVar, c42 c42Var, q97 q97Var, sb7 sb7Var) {
        this.a = fzVar;
        this.b = c42Var;
        this.c = q97Var;
        this.d = sb7Var;
    }

    public final void a(i62 i62Var) {
        if (i62Var != null) {
            q97 q97Var = this.c;
            if (q97Var != null) {
                sb7 sb7Var = this.d;
                ye1 ye1Var = sb7Var.c;
                gy gyVar = (gy) i62Var;
                b35 b35Var = gyVar.b;
                bt a = fz.a();
                fz fzVar = this.a;
                String str = fzVar.a;
                if (str != null) {
                    a.B = str;
                    if (b35Var != null) {
                        a.R = b35Var;
                        a.L = fzVar.b;
                        fz A = a.A();
                        pa paVar = new pa(4, false);
                        paVar.Z = new HashMap();
                        paVar.X = Long.valueOf(sb7Var.a.a());
                        paVar.Y = Long.valueOf(sb7Var.b.a());
                        paVar.B = "FIREBASE_ML_SDK";
                        paVar.R = new w32(this.b, (byte[]) q97Var.apply(gyVar.a));
                        paVar.L = null;
                        ye1Var.b.execute(new h15(ye1Var, A, paVar.f(), 1));
                        return;
                    }
                    u34.x("Null priority");
                    return;
                }
                u34.x("Null backendName");
                return;
            }
            u34.x("Null transformer");
            return;
        }
        u34.x("Null event");
    }
}
