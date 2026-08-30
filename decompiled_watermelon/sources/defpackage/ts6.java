package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts6  reason: default package */
/* loaded from: classes.dex */
public abstract class ts6 {
    public static final an1 a = new an1("NO_THREAD_ELEMENTS", 9);
    public static final gu5 b = new gu5(18);
    public static final gu5 c = new gu5(19);
    public static final gu5 d = new gu5(20);

    public static final void a(e31 e31Var, Object obj) {
        if (obj != a) {
            if (obj instanceof zs6) {
                zs6 zs6Var = (zs6) obj;
                us6[] us6VarArr = zs6Var.c;
                int length = us6VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    us6 us6Var = us6VarArr[length];
                    us6Var.getClass();
                    us6Var.a(zs6Var.b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object N = e31Var.N(c, null);
                N.getClass();
                ((us6) N).a(obj);
            }
        }
    }

    public static final Object b(e31 e31Var) {
        Object N = e31Var.N(b, 0);
        N.getClass();
        return N;
    }

    public static final Object c(e31 e31Var, Object obj) {
        if (obj == null) {
            obj = b(e31Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return e31Var.N(d, new zs6(((Number) obj).intValue(), e31Var));
        }
        return ((us6) obj).b();
    }
}
