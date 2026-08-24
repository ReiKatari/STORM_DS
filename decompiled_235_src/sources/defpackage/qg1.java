package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qg1  reason: default package */
/* loaded from: classes.dex */
public final class qg1 implements li7 {
    public final n55 a;
    public final kj7 b;
    public volatile ri7 c;
    public final AtomicBoolean d;

    public qg1(n55 n55Var, kj7 kj7Var) {
        n55Var.getClass();
        kj7Var.getClass();
        this.a = n55Var;
        this.b = kj7Var;
        this.d = new AtomicBoolean(false);
    }

    public static final ri7 k(qg1 qg1Var) {
        if (!qg1Var.d.get()) {
            ri7 ri7Var = qg1Var.c;
            if (ri7Var != null) {
                return ri7Var;
            }
            ri7 ri7Var2 = (ri7) qg1Var.a.get();
            if (!qg1Var.d.get()) {
                qg1Var.c = ri7Var2;
                ri7Var2.getClass();
                return ri7Var2;
            }
            ri7Var2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        throw new CancellationException("UseCaseCameraRequestControl is closed");
    }

    @Override // defpackage.li7
    public final jg1 a() {
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.a();
        }
        return hv.i(this.b.f, null, null, new ng1(this, null, 2), 3);
    }

    @Override // defpackage.li7
    public final Object c(hw6 hw6Var) {
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.c(hw6Var);
        }
        return hv.d0(f04.F(this.b.e), new ng1(this, null, 0), hw6Var);
    }

    @Override // defpackage.li7
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        hv.L(this.b.f, null, null, new y3((r41) null, this, 8), 3);
    }

    @Override // defpackage.li7
    public final jg1 d(kd0 kd0Var, Map map) {
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.d(kd0Var, map);
        }
        return hv.i(this.b.f, null, null, new b0(this, (r41) null, kd0Var, map, 23), 3);
    }

    @Override // defpackage.li7
    public final jg1 e(int i) {
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.e(i);
        }
        return hv.i(this.b.f, null, null, new l7(this, null, i), 3);
    }

    @Override // defpackage.li7
    public final jg1 f(List list, ki7 ki7Var) {
        ki7Var.getClass();
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.f(list, ki7Var);
        }
        return hv.i(this.b.f, null, null, new b0(this, (r41) null, list, ki7Var, 22), 3);
    }

    @Override // defpackage.li7
    public final jg1 g(LinkedHashSet linkedHashSet, boolean z) {
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.g(linkedHashSet, z);
        }
        return hv.i(this.b.f, null, null, new pg1(this, (r41) null, z, linkedHashSet), 3);
    }

    @Override // defpackage.li7
    public final jg1 h(Map map, ki7 ki7Var, xy0 xy0Var) {
        ki7Var.getClass();
        xy0Var.getClass();
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.h(map, ki7Var, xy0Var);
        }
        return hv.i(this.b.f, null, null, new og1(this, null, map, ki7Var, xy0Var, 1), 3);
    }

    @Override // defpackage.li7
    public final jg1 i(Map map, ki7 ki7Var, xy0 xy0Var) {
        ki7Var.getClass();
        xy0Var.getClass();
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.i(map, ki7Var, xy0Var);
        }
        return hv.i(this.b.f, null, null, new og1(this, null, map, ki7Var, xy0Var, 0), 3);
    }

    @Override // defpackage.li7
    public final jg1 j() {
        ri7 ri7Var = this.c;
        if (ri7Var != null) {
            return ri7Var.j();
        }
        return hv.i(this.b.f, null, null, new ng1(this, null, 1), 3);
    }
}
