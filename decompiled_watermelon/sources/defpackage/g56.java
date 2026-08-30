package defpackage;

import java.util.Collection;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g56  reason: default package */
/* loaded from: classes.dex */
public final class g56 implements ns3 {
    public final /* synthetic */ ns3 A;
    public final o31 B;
    public rd3 X;
    public rd3 Y;
    public final tj4 L = me2.G(Boolean.FALSE);
    public final dj R = new dj(17, this);
    public final xa6 Z = new xa6();
    public final za6 c0 = new za6();

    public g56(ns3 ns3Var, o31 o31Var) {
        this.A = ns3Var;
        this.B = o31Var;
    }

    public static f56 d(String str, sk2 sk2Var) {
        sk2Var.X(800730162);
        sk2Var.X(-148945892);
        boolean f = sk2Var.f(str);
        Object L = sk2Var.L();
        if (f || L == su0.a) {
            L = new f56(str);
            sk2Var.h0(L);
        }
        f56 f56Var = (f56) L;
        f56Var.b.setValue(c56.a);
        sk2Var.p(false);
        sk2Var.p(false);
        return f56Var;
    }

    public static zy3 e(g56 g56Var, zy3 zy3Var, f56 f56Var, wn wnVar) {
        e56.a.getClass();
        h56 h56Var = j56.b;
        g56Var.getClass();
        return l07.A(zy3Var, new an(f56Var, wnVar.a(), g56Var, h56Var, 1));
    }

    @Override // defpackage.ns3
    public final rd3 a(rd3 rd3Var) {
        return this.A.a(rd3Var);
    }

    public final boolean b() {
        return ((Boolean) this.L.getValue()).booleanValue();
    }

    @Override // defpackage.ns3
    public final long c(rd3 rd3Var, rd3 rd3Var2) {
        return this.A.c(rd3Var, rd3Var2);
    }

    public final void f() {
        Collection<u36> values = this.c0.e().c.values();
        boolean z = false;
        for (u36 u36Var : values) {
            if (!z && (!u36Var.a() || !u36Var.d())) {
                z = false;
            } else {
                z = true;
            }
            u36Var.e();
        }
        if (z != b()) {
            this.L.setValue(Boolean.valueOf(z));
            if (!z) {
                for (u36 u36Var2 : values) {
                    if (u36Var2.c().size() > 1) {
                        List c = u36Var2.c();
                        int i = x36.a;
                        int size = c.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            if (((w36) c.get(i2)).d().b()) {
                                break;
                            }
                        }
                    }
                    w65 w65Var = u36Var2.c;
                    w65Var.getClass();
                    w65Var.f = be6.NoRequest;
                    w65Var.a = ((qj4) w65Var.e).h();
                    ((tj4) w65Var.d).setValue(c74.a);
                }
            }
        }
    }
}
