package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: um  reason: default package */
/* loaded from: classes.dex */
public final class um {
    public final bz6 a;
    public final Object b;
    public final io c;
    public final tj4 d;
    public final tj4 e;
    public final y24 f;
    public final sc6 g;
    public final oo h;
    public final oo i;
    public final oo j;
    public final oo k;

    public um(Object obj, bz6 bz6Var, Object obj2) {
        oo ooVar;
        oo ooVar2;
        this.a = bz6Var;
        this.b = obj2;
        io ioVar = new io(bz6Var, obj, null, 60);
        this.c = ioVar;
        this.d = me2.G(Boolean.FALSE);
        this.e = me2.G(obj);
        this.f = new y24();
        this.g = new sc6(obj2);
        oo ooVar3 = ioVar.L;
        boolean z = ooVar3 instanceof ko;
        if (z) {
            ooVar = a53.e;
        } else if (ooVar3 instanceof lo) {
            ooVar = a53.f;
        } else if (ooVar3 instanceof mo) {
            ooVar = a53.g;
        } else {
            ooVar = a53.h;
        }
        this.h = ooVar;
        if (z) {
            ooVar2 = a53.a;
        } else if (ooVar3 instanceof lo) {
            ooVar2 = a53.b;
        } else if (ooVar3 instanceof mo) {
            ooVar2 = a53.c;
        } else {
            ooVar2 = a53.d;
        }
        this.i = ooVar2;
        this.j = ooVar;
        this.k = ooVar2;
    }

    public static final Object a(um umVar, Object obj) {
        bz6 bz6Var = umVar.a;
        oo ooVar = umVar.k;
        oo ooVar2 = umVar.j;
        if (!b53.x(ooVar2, umVar.h) || !b53.x(ooVar, umVar.i)) {
            oo ooVar3 = (oo) bz6Var.a.n(obj);
            int b = ooVar3.b();
            boolean z = false;
            for (int i = 0; i < b; i++) {
                if (ooVar3.a(i) < ooVar2.a(i) || ooVar3.a(i) > ooVar.a(i)) {
                    ooVar3.e(i, io2.l(ooVar3.a(i), ooVar2.a(i), ooVar.a(i)));
                    z = true;
                }
            }
            if (z) {
                return bz6Var.b.n(ooVar3);
            }
        }
        return obj;
    }

    public static final void b(um umVar) {
        io ioVar = umVar.c;
        ioVar.L.d();
        ioVar.R = Long.MIN_VALUE;
        umVar.d.setValue(Boolean.FALSE);
    }

    public static Object c(um umVar, Object obj, ho hoVar, mi2 mi2Var, j11 j11Var, int i) {
        if ((i & 2) != 0) {
            hoVar = umVar.g;
        }
        ho hoVar2 = hoVar;
        Object n = umVar.a.b.n(umVar.c.L);
        if ((i & 8) != 0) {
            mi2Var = null;
        }
        mi2 mi2Var2 = mi2Var;
        Object d = umVar.d();
        bz6 bz6Var = umVar.a;
        return y24.a(umVar.f, new rm(umVar, n, new zm6(hoVar2, bz6Var, d, obj, (oo) bz6Var.a.n(n)), umVar.c.R, mi2Var2, null), j11Var);
    }

    public final Object d() {
        return this.c.B.getValue();
    }

    public final Object e(j11 j11Var, Object obj) {
        Object a = y24.a(this.f, new sm(this, obj, null, 0), j11Var);
        if (a == p31.COROUTINE_SUSPENDED) {
            return a;
        }
        return o27.a;
    }

    public /* synthetic */ um(Object obj, bz6 bz6Var, Object obj2, int i) {
        this(obj, bz6Var, (i & 4) != 0 ? null : obj2);
    }
}
