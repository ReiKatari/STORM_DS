package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ew4  reason: default package */
/* loaded from: classes.dex */
public abstract class ew4 {
    public final xk3 a;

    public ew4(ki2 ki2Var) {
        this.a = new xk3(ki2Var);
    }

    public abstract dq a(Object obj);

    public o67 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o67 c(dq dqVar, o67 o67Var) {
        ym1 ym1Var = null;
        if (o67Var instanceof ym1) {
            if (dqVar.d) {
                ym1Var = (ym1) o67Var;
                ym1Var.a.setValue(dqVar.c());
            }
        } else if (o67Var instanceof ze6) {
            if ((dqVar.c || dqVar.b != null) && !dqVar.d) {
                ze6 ze6Var = (ze6) o67Var;
                if (b53.x(dqVar.c(), ze6Var.a)) {
                    ym1Var = ze6Var;
                }
            }
        } else if (o67Var instanceof uv0) {
            dqVar.getClass();
        }
        if (ym1Var == null) {
            if (dqVar.d) {
                Object obj = dqVar.b;
                ta6 ta6Var = (ta6) dqVar.a;
                if (ta6Var == null) {
                    ta6Var = k45.n0;
                }
                return new ym1(new tj4(obj, ta6Var));
            }
            return new ze6(dqVar.c());
        }
        return ym1Var;
    }
}
