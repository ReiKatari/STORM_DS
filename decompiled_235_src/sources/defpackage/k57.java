package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k57  reason: default package */
/* loaded from: classes.dex */
public abstract class k57 {
    public static final gr1 a = new gr1("NO_THREAD_ELEMENTS", 9);
    public static final z17 b = new z17(3);
    public static final z17 c = new z17(4);
    public static final z17 d = new z17(5);

    public static final void a(l61 l61Var, Object obj) {
        if (obj != a) {
            if (obj instanceof q57) {
                q57 q57Var = (q57) obj;
                l57[] l57VarArr = q57Var.c;
                int length = l57VarArr.length - 1;
                if (length < 0) {
                    return;
                }
                while (true) {
                    int i = length - 1;
                    l57 l57Var = l57VarArr[length];
                    l57Var.getClass();
                    l57Var.a(q57Var.b[length]);
                    if (i >= 0) {
                        length = i;
                    } else {
                        return;
                    }
                }
            } else {
                Object x = l61Var.x(c, null);
                x.getClass();
                ((l57) x).a(obj);
            }
        }
    }

    public static final Object b(l61 l61Var) {
        Object x = l61Var.x(b, 0);
        x.getClass();
        return x;
    }

    public static final Object c(l61 l61Var, Object obj) {
        if (obj == null) {
            obj = b(l61Var);
        }
        if (obj == 0) {
            return a;
        }
        if (obj instanceof Integer) {
            return l61Var.x(d, new q57(((Number) obj).intValue(), l61Var));
        }
        return ((l57) obj).b();
    }
}
