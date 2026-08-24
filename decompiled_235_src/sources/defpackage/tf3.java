package defpackage;

import java.util.ArrayList;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tf3  reason: default package */
/* loaded from: classes.dex */
public final class tf3 extends vf3 {
    public static final sf3 n0 = new sf3();
    public static final ef3 o0 = new ef3("closed");
    public final ArrayList k0;
    public String l0;
    public ee3 m0;

    public tf3() {
        super(n0);
        this.k0 = new ArrayList();
        this.m0 = ve3.A;
    }

    @Override // defpackage.vf3
    public final vf3 A() {
        l0(ve3.A);
        return this;
    }

    @Override // defpackage.vf3
    public final void U(double d) {
        if (this.d0 == ls6.LENIENT || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            l0(new ef3(Double.valueOf(d)));
            return;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override // defpackage.vf3
    public final void X(long j) {
        l0(new ef3(Long.valueOf(j)));
    }

    @Override // defpackage.vf3
    public final void Z(Boolean bool) {
        if (bool == null) {
            l0(ve3.A);
        } else {
            l0(new ef3(bool));
        }
    }

    @Override // defpackage.vf3
    public final void a0(Number number) {
        if (number == null) {
            l0(ve3.A);
            return;
        }
        if (this.d0 != ls6.LENIENT) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                e41.w(number, "JSON forbids NaN and infinities: ");
                return;
            }
        }
        l0(new ef3(number));
    }

    @Override // defpackage.vf3
    public final void c0(String str) {
        if (str == null) {
            l0(ve3.A);
        } else {
            l0(new ef3(str));
        }
    }

    @Override // defpackage.vf3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.k0;
        if (arrayList.isEmpty()) {
            arrayList.add(o0);
        } else {
            e41.i("Incomplete document");
        }
    }

    @Override // defpackage.vf3
    public final void e0(boolean z) {
        l0(new ef3(Boolean.valueOf(z)));
    }

    @Override // defpackage.vf3
    public final void h() {
        od3 od3Var = new od3();
        l0(od3Var);
        this.k0.add(od3Var);
    }

    @Override // defpackage.vf3
    public final void k() {
        ze3 ze3Var = new ze3();
        l0(ze3Var);
        this.k0.add(ze3Var);
    }

    public final ee3 k0() {
        ArrayList arrayList = this.k0;
        return (ee3) arrayList.get(arrayList.size() - 1);
    }

    public final void l0(ee3 ee3Var) {
        if (this.l0 != null) {
            if (!(ee3Var instanceof ve3) || this.g0) {
                ((ze3) k0()).d(this.l0, ee3Var);
            }
            this.l0 = null;
        } else if (this.k0.isEmpty()) {
            this.m0 = ee3Var;
        } else {
            ee3 k0 = k0();
            if (k0 instanceof od3) {
                ((od3) k0).A.add(ee3Var);
            } else {
                e41.m();
            }
        }
    }

    @Override // defpackage.vf3
    public final void r() {
        ArrayList arrayList = this.k0;
        if (!arrayList.isEmpty() && this.l0 == null) {
            if (k0() instanceof od3) {
                arrayList.remove(arrayList.size() - 1);
                return;
            } else {
                e41.m();
                return;
            }
        }
        e41.m();
    }

    @Override // defpackage.vf3
    public final void u() {
        ArrayList arrayList = this.k0;
        if (!arrayList.isEmpty() && this.l0 == null) {
            if (k0() instanceof ze3) {
                arrayList.remove(arrayList.size() - 1);
                return;
            } else {
                e41.m();
                return;
            }
        }
        e41.m();
    }

    @Override // defpackage.vf3
    public final void v(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!this.k0.isEmpty() && this.l0 == null) {
            if (k0() instanceof ze3) {
                this.l0 = str;
                return;
            } else {
                i.m("Please begin an object before writing a name.");
                return;
            }
        }
        i.m("Did not expect a name");
    }

    @Override // defpackage.vf3, java.io.Flushable
    public final void flush() {
    }
}
