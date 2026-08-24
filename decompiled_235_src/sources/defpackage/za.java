package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: za  reason: default package */
/* loaded from: classes.dex */
public final class za extends ln2 {
    public final /* synthetic */ int g;

    public /* synthetic */ za(bb bbVar, int i) {
        this.g = i;
    }

    @Override // defpackage.ln2
    public final c1 S(ea0 ea0Var) {
        switch (this.g) {
            case 0:
                return xa.o(ea0Var, g82.a());
            default:
                return mb.r(ea0Var, g82.a());
        }
    }

    @Override // defpackage.ln2
    public final void i0(c1 c1Var) {
        switch (this.g) {
            case 0:
                xa xaVar = (xa) c1Var;
                if (xaVar.m() >= 16) {
                    bb.c(xaVar.n());
                    return;
                } else {
                    e41.v("key_size must be at least 16 bytes");
                    return;
                }
            default:
                mb mbVar = (mb) c1Var;
                if (mbVar.o() >= 16) {
                    bb.d(mbVar.p());
                    return;
                } else {
                    e41.v("key_size must be at least 16 bytes");
                    return;
                }
        }
    }

    @Override // defpackage.ln2
    public final Object m(c1 c1Var) {
        switch (this.g) {
            case 0:
                xa xaVar = (xa) c1Var;
                ta s = ua.s();
                byte[] a = nd5.a(xaVar.m());
                ca0 c = ea0.c(a, 0, a.length);
                s.c();
                ua.o((ua) s.B, c);
                db n = xaVar.n();
                s.c();
                ua.n((ua) s.B, n);
                s.c();
                ua.m((ua) s.B);
                return (ua) s.a();
            default:
                mb mbVar = (mb) c1Var;
                ib s2 = jb.s();
                byte[] a2 = nd5.a(mbVar.o());
                ca0 c2 = ea0.c(a2, 0, a2.length);
                s2.c();
                jb.o((jb) s2.B, c2);
                pb p = mbVar.p();
                s2.c();
                jb.n((jb) s2.B, p);
                s2.c();
                jb.m((jb) s2.B);
                return (jb) s2.a();
        }
    }
}
