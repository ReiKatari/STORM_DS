package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yv0  reason: default package */
/* loaded from: classes.dex */
public abstract class yv0 {
    public static final an1 a = new an1("CLOSED", 9);

    public static final Object a(dy5 dy5Var, long j, aj2 aj2Var) {
        while (true) {
            if (dy5Var.X >= j && !dy5Var.g()) {
                return dy5Var;
            }
            Object e = dy5Var.e();
            an1 an1Var = a;
            if (e == an1Var) {
                return an1Var;
            }
            dy5 dy5Var2 = (dy5) ((zv0) e);
            if (dy5Var2 == null) {
                dy5Var2 = (dy5) aj2Var.j(Long.valueOf(dy5Var.X + 1), dy5Var);
                if (dy5Var.j(dy5Var2)) {
                    if (dy5Var.g()) {
                        dy5Var.i();
                    }
                }
            }
            dy5Var = dy5Var2;
        }
    }
}
