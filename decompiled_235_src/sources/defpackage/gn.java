package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn  reason: default package */
/* loaded from: classes.dex */
public final class gn {
    public final wc7 a;
    public final Object b;
    public final uo c;
    public final vs4 d;
    public final vs4 e;
    public final eb4 f;
    public final io6 g;
    public final ap h;
    public final ap i;
    public final ap j;
    public final ap k;

    public gn(Object obj, wc7 wc7Var, Object obj2) {
        ap apVar;
        ap apVar2;
        this.a = wc7Var;
        this.b = obj2;
        uo uoVar = new uo(wc7Var, obj, null, 60);
        this.c = uoVar;
        this.d = np2.Y(Boolean.FALSE);
        this.e = np2.Y(obj);
        this.f = new eb4();
        this.g = new io6(obj2);
        ap apVar3 = uoVar.L;
        boolean z = apVar3 instanceof wo;
        if (z) {
            apVar = nb3.e;
        } else if (apVar3 instanceof xo) {
            apVar = nb3.f;
        } else if (apVar3 instanceof yo) {
            apVar = nb3.g;
        } else {
            apVar = nb3.h;
        }
        this.h = apVar;
        if (z) {
            apVar2 = nb3.a;
        } else if (apVar3 instanceof xo) {
            apVar2 = nb3.b;
        } else if (apVar3 instanceof yo) {
            apVar2 = nb3.c;
        } else {
            apVar2 = nb3.d;
        }
        this.i = apVar2;
        this.j = apVar;
        this.k = apVar2;
    }

    public static final Object a(gn gnVar, Object obj) {
        wc7 wc7Var = gnVar.a;
        ap apVar = gnVar.k;
        ap apVar2 = gnVar.j;
        if (!nb3.k(apVar2, gnVar.h) || !nb3.k(apVar, gnVar.i)) {
            ap apVar3 = (ap) wc7Var.a.g(obj);
            int b = apVar3.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (apVar3.a(i) < apVar2.a(i) || apVar3.a(i) > apVar.a(i)) {
                    apVar3.e(i, gi2.p(apVar3.a(i), apVar2.a(i), apVar.a(i)));
                    z = true;
                }
            }
            if (z) {
                return wc7Var.b.g(apVar3);
            }
        }
        return obj;
    }

    public static final void b(gn gnVar) {
        uo uoVar = gnVar.c;
        uoVar.L.d();
        uoVar.R = Long.MIN_VALUE;
        gnVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(gn gnVar, Object obj, to toVar, qn2 qn2Var, r41 r41Var, int i) {
        if ((i & 2) != 0) {
            toVar = gnVar.g;
        }
        to toVar2 = toVar;
        Object g = gnVar.a.b.g(gnVar.c.L);
        if ((i & 8) != 0) {
            qn2Var = null;
        }
        qn2 qn2Var2 = qn2Var;
        Object d = gnVar.d();
        wc7 wc7Var = gnVar.a;
        return eb4.a(gnVar.f, new dn(gnVar, g, new jz6(toVar2, wc7Var, d, obj, (ap) wc7Var.a.g(g)), gnVar.c.R, qn2Var2, null), r41Var);
    }

    public final Object d() {
        return this.c.B.getValue();
    }

    public final Object e(r41 r41Var, Object obj) {
        Object a = eb4.a(this.f, new en(this, obj, null, 0), r41Var);
        if (a == x61.COROUTINE_SUSPENDED) {
            return a;
        }
        return jg7.a;
    }

    public /* synthetic */ gn(Object obj, wc7 wc7Var, Object obj2, int i) {
        this(obj, wc7Var, (i & 4) != 0 ? null : obj2);
    }
}
