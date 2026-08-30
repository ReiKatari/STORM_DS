package defpackage;

import java.util.ArrayList;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a93  reason: default package */
/* loaded from: classes.dex */
public final class a93 extends b93 {
    public static final z83 m0 = new z83();
    public static final l83 n0 = new l83("closed");
    public final ArrayList j0;
    public String k0;
    public l73 l0;

    public a93() {
        super(m0);
        this.j0 = new ArrayList();
        this.l0 = c83.A;
    }

    @Override // defpackage.b93
    public final void B() {
        ArrayList arrayList = this.j0;
        if (!arrayList.isEmpty() && this.k0 == null) {
            if (k0() instanceof g83) {
                arrayList.remove(arrayList.size() - 1);
                return;
            } else {
                f81.o();
                return;
            }
        }
        f81.o();
    }

    @Override // defpackage.b93
    public final void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.j0.isEmpty() && this.k0 == null) {
            if (k0() instanceof g83) {
                this.k0 = str;
                return;
            } else {
                i.n("Please begin an object before writing a name.");
                return;
            }
        }
        i.n("Did not expect a name");
    }

    @Override // defpackage.b93
    public final b93 F() {
        l0(c83.A);
        return this;
    }

    @Override // defpackage.b93
    public final void Q(double d) {
        if (this.c0 == ug6.LENIENT || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            l0(new l83(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override // defpackage.b93
    public final void R(long j) {
        l0(new l83(Long.valueOf(j)));
    }

    @Override // defpackage.b93
    public final void T(Boolean bool) {
        if (bool == null) {
            l0(c83.A);
        } else {
            l0(new l83(bool));
        }
    }

    @Override // defpackage.b93
    public final void V(Number number) {
        if (number == null) {
            l0(c83.A);
            return;
        }
        if (this.c0 != ug6.LENIENT) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                f81.x(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        l0(new l83(number));
    }

    @Override // defpackage.b93
    public final void Z(String str) {
        if (str == null) {
            l0(c83.A);
        } else {
            l0(new l83(str));
        }
    }

    @Override // defpackage.b93, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.j0;
        if (arrayList.isEmpty()) {
            arrayList.add(n0);
        } else {
            f81.j("Incomplete document");
        }
    }

    @Override // defpackage.b93
    public final void f0(boolean z) {
        l0(new l83(Boolean.valueOf(z)));
    }

    @Override // defpackage.b93
    public final void i() {
        z63 z63Var = new z63();
        l0(z63Var);
        this.j0.add(z63Var);
    }

    public final l73 k0() {
        ArrayList arrayList = this.j0;
        return (l73) arrayList.get(arrayList.size() - 1);
    }

    public final void l0(l73 l73Var) {
        if (this.k0 != null) {
            if (!(l73Var instanceof c83) || this.f0) {
                ((g83) k0()).i(this.k0, l73Var);
            }
            this.k0 = null;
        } else if (this.j0.isEmpty()) {
            this.l0 = l73Var;
        } else {
            l73 k0 = k0();
            if (k0 instanceof z63) {
                ((z63) k0).A.add(l73Var);
            } else {
                f81.o();
            }
        }
    }

    @Override // defpackage.b93
    public final void p() {
        g83 g83Var = new g83();
        l0(g83Var);
        this.j0.add(g83Var);
    }

    @Override // defpackage.b93
    public final void x() {
        ArrayList arrayList = this.j0;
        if (!arrayList.isEmpty() && this.k0 == null) {
            if (k0() instanceof z63) {
                arrayList.remove(arrayList.size() - 1);
                return;
            } else {
                f81.o();
                return;
            }
        }
        f81.o();
    }

    @Override // defpackage.b93, java.io.Flushable
    public final void flush() {
    }
}
