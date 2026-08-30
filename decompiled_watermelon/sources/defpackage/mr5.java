package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mr5  reason: default package */
/* loaded from: classes.dex */
public final class mr5 extends dt3 {
    public final m93 q0;
    public final LinkedHashMap r0;
    public final vn1 s0 = u06.a;
    public final LinkedHashMap t0 = new LinkedHashMap();
    public int u0 = -1;

    public mr5(m93 m93Var, LinkedHashMap linkedHashMap) {
        this.q0 = m93Var;
        this.r0 = linkedHashMap;
    }

    @Override // defpackage.mz1
    public final vn1 b() {
        return this.s0;
    }

    @Override // defpackage.dt3
    public final void c0(h06 h06Var, int i) {
        h06Var.getClass();
        this.u0 = i;
    }

    @Override // defpackage.dt3
    public final void d0(Object obj) {
        obj.getClass();
        r0(obj);
    }

    @Override // defpackage.mz1
    public final void g() {
        r0(null);
    }

    @Override // defpackage.mz1
    public final void l(m93 m93Var, Object obj) {
        m93Var.getClass();
        r0(obj);
    }

    public final void r0(Object obj) {
        List b0;
        String e = this.q0.e().e(this.u0);
        z44 z44Var = (z44) this.r0.get(e);
        if (z44Var != null) {
            if (z44Var instanceof qq0) {
                b0 = ((qq0) z44Var).h(obj);
            } else {
                b0 = l07.b0(z44Var.f(obj));
            }
            this.t0.put(e, b0);
            return;
        }
        c44.e(wh1.A("Cannot find NavType for argument ", e, ". Please provide NavType through typeMap."));
    }

    @Override // defpackage.dt3, defpackage.mz1
    public final mz1 x(h06 h06Var) {
        h06Var.getClass();
        if (io2.V(h06Var)) {
            this.u0 = 0;
        }
        return this;
    }
}
