package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ua  reason: default package */
/* loaded from: classes.dex */
public final class ua extends hk2 {
    public final /* synthetic */ int e;

    public /* synthetic */ ua(wa waVar, int i) {
        this.e = i;
    }

    @Override // defpackage.hk2
    public final b1 K(x70 x70Var) {
        switch (this.e) {
            case 0:
                return sa.o(x70Var, o32.a());
            default:
                return gb.r(x70Var, o32.a());
        }
    }

    @Override // defpackage.hk2
    public final void V(b1 b1Var) {
        switch (this.e) {
            case 0:
                sa saVar = (sa) b1Var;
                if (saVar.m() >= 16) {
                    wa.c(saVar.n());
                    return;
                } else {
                    f81.u("key_size must be at least 16 bytes");
                    return;
                }
            default:
                gb gbVar = (gb) b1Var;
                if (gbVar.o() >= 16) {
                    wa.d(gbVar.p());
                    return;
                } else {
                    f81.u("key_size must be at least 16 bytes");
                    return;
                }
        }
    }

    @Override // defpackage.hk2
    public final Object o(b1 b1Var) {
        switch (this.e) {
            case 0:
                sa saVar = (sa) b1Var;
                oa s = pa.s();
                byte[] a = d45.a(saVar.m());
                v70 d = x70.d(a, 0, a.length);
                s.c();
                pa.o((pa) s.B, d);
                ya n = saVar.n();
                s.c();
                pa.n((pa) s.B, n);
                s.c();
                pa.m((pa) s.B);
                return (pa) s.a();
            default:
                gb gbVar = (gb) b1Var;
                cb s2 = db.s();
                byte[] a2 = d45.a(gbVar.o());
                v70 d2 = x70.d(a2, 0, a2.length);
                s2.c();
                db.o((db) s2.B, d2);
                jb p = gbVar.p();
                s2.c();
                db.n((db) s2.B, p);
                s2.c();
                db.m((db) s2.B);
                return (db) s2.a();
        }
    }
}
