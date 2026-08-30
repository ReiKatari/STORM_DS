package a6;

import android.os.Build;
import android.view.View;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class d2 {

    /* renamed from: b  reason: collision with root package name */
    public static final i2 f450b;

    /* renamed from: a  reason: collision with root package name */
    public final i2 f451a;

    static {
        v1 q1Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            q1Var = new u1();
        } else if (i2 >= 31) {
            q1Var = new t1();
        } else if (i2 >= 30) {
            q1Var = new s1();
        } else if (i2 >= 29) {
            q1Var = new r1();
        } else {
            q1Var = new q1();
        }
        f450b = q1Var.b().f479a.a().f479a.b().f479a.c();
    }

    public d2(i2 i2Var) {
        this.f451a = i2Var;
    }

    public i2 a() {
        return this.f451a;
    }

    public i2 b() {
        return this.f451a;
    }

    public i2 c() {
        return this.f451a;
    }

    public n e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj;
        if (o() == d2Var.o() && n() == d2Var.n() && Objects.equals(k(), d2Var.k()) && Objects.equals(i(), d2Var.i()) && Objects.equals(e(), d2Var.e())) {
            return true;
        }
        return false;
    }

    public q5.b f(int i2) {
        return q5.b.f12282e;
    }

    public q5.b g(int i2) {
        if ((i2 & 8) == 0) {
            return q5.b.f12282e;
        }
        a0.j.h("Unable to query the maximum insets for IME");
        return null;
    }

    public q5.b h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), e());
    }

    public q5.b i() {
        return q5.b.f12282e;
    }

    public q5.b j() {
        return k();
    }

    public q5.b k() {
        return q5.b.f12282e;
    }

    public q5.b l() {
        return k();
    }

    public i2 m(int i2, int i10, int i11, int i12) {
        return f450b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i2) {
        return true;
    }

    public void d(View view) {
    }

    public void q(q5.b[] bVarArr) {
    }

    public void r(i2 i2Var) {
    }

    public void s(q5.b bVar) {
    }

    public void t(int i2) {
    }
}
