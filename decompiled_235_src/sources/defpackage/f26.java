package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f26  reason: default package */
/* loaded from: classes.dex */
public final class f26 extends vy7 {
    public final gg3 h0;
    public final LinkedHashMap i0;
    public final jd1 j0 = ic6.a;
    public final LinkedHashMap k0 = new LinkedHashMap();
    public int l0 = -1;

    public f26(gg3 gg3Var, LinkedHashMap linkedHashMap) {
        this.h0 = gg3Var;
        this.i0 = linkedHashMap;
    }

    @Override // defpackage.vy7
    public final void Z(wb6 wb6Var, int i) {
        wb6Var.getClass();
        this.l0 = i;
    }

    @Override // defpackage.x32
    public final jd1 b() {
        return this.j0;
    }

    @Override // defpackage.vy7
    public final void b0(Object obj) {
        obj.getClass();
        s0(obj);
    }

    @Override // defpackage.x32
    public final void f() {
        s0(null);
    }

    @Override // defpackage.x32
    public final void j(gg3 gg3Var, Object obj) {
        gg3Var.getClass();
        s0(obj);
    }

    @Override // defpackage.vy7, defpackage.x32
    public final x32 s(wb6 wb6Var) {
        wb6Var.getClass();
        if (np2.X(wb6Var)) {
            this.l0 = 0;
        }
        return this;
    }

    public final void s0(Object obj) {
        List b0;
        String g = this.h0.e().g(this.l0);
        fd4 fd4Var = (fd4) this.i0.get(g);
        if (fd4Var != null) {
            if (fd4Var instanceof dt0) {
                b0 = ((dt0) fd4Var).h(obj);
            } else {
                b0 = hf.b0(fd4Var.f(obj));
            }
            this.k0.put(g, b0);
            return;
        }
        u34.f(lb1.A("Cannot find NavType for argument ", g, ". Please provide NavType through typeMap."));
    }
}
