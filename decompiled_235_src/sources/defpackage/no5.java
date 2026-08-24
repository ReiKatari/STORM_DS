package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: no5  reason: default package */
/* loaded from: classes.dex */
public abstract class no5 extends qo7 {
    public final pn5 b;
    public final kd6 c;
    public final tp6 d;
    public final ex6 e;
    public final of6 f;
    public final be5 g;
    public ap6 h;

    public no5(pn5 pn5Var, kd6 kd6Var) {
        pn5Var.getClass();
        kd6Var.getClass();
        this.b = pn5Var;
        this.c = kd6Var;
        this.d = up6.a(f06.a);
        this.e = new ex6(new er2(this, 20));
        of6 b = pf6.b(0, 1, m80.DROP_OLDEST, 1);
        this.f = b;
        this.g = new be5(b);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object l(no5 no5Var, pq5 pq5Var, boolean z, s41 s41Var) {
        io5 io5Var;
        int i;
        if (s41Var instanceof io5) {
            io5Var = (io5) s41Var;
            int i2 = io5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                io5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = io5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = io5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                pn5 pn5Var = no5Var.b;
                String str = pq5Var.i;
                io5Var.Y = 1;
                Object p = ((pl) pn5Var).p(str, z, io5Var);
                if (p == x61Var) {
                    return x61Var;
                }
                return p;
            }
        }
        io5Var = new io5(no5Var, s41Var);
        Object obj2 = io5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = io5Var.Y;
        if (i == 0) {
        }
    }

    public abstract Object e(ArrayList arrayList, Map map, s41 s41Var);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ta5 ta5Var, r41 r41Var) {
        ho5 ho5Var;
        int i;
        if (r41Var instanceof ho5) {
            ho5Var = (ho5) r41Var;
            int i2 = ho5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ho5Var.Y = i2 - Integer.MIN_VALUE;
                ho5 ho5Var2 = ho5Var;
                Object obj = ho5Var2.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ho5Var2.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                long j = ta5Var.a;
                ho5Var2.Y = 1;
                Object o = ((pl) this.b).o(j, 1, 25, ho5Var2);
                if (o == x61Var) {
                    return x61Var;
                }
                return o;
            }
        }
        ho5Var = new ho5(this, r41Var);
        ho5 ho5Var22 = ho5Var;
        Object obj2 = ho5Var22.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ho5Var22.Y;
        if (i == 0) {
        }
    }

    public abstract Object g(pq5 pq5Var, s41 s41Var);

    public abstract pq5 h();

    public abstract Serializable i(s41 s41Var);

    public abstract Serializable j(s41 s41Var);

    public Object k(pq5 pq5Var, boolean z, r41 r41Var) {
        return l(this, pq5Var, z, (s41) r41Var);
    }

    public final void m() {
        ap6 ap6Var = this.h;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.h = hv.L(to7.a(this), null, null, new lo5(this, null), 3);
    }
}
