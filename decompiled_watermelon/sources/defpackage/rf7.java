package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rf7  reason: default package */
/* loaded from: classes.dex */
public class rf7 {
    public static final vf7 b;
    public final vf7 a;

    static {
        if7 af7Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            af7Var = new hf7();
        } else if (i >= 35) {
            af7Var = new gf7();
        } else if (i >= 34) {
            af7Var = new ff7();
        } else if (i >= 31) {
            af7Var = new ef7();
        } else if (i >= 30) {
            af7Var = new df7();
        } else if (i >= 29) {
            af7Var = new cf7();
        } else {
            af7Var = new af7();
        }
        b = af7Var.b().a.a().a.b().a.c();
    }

    public rf7(vf7 vf7Var) {
        this.a = vf7Var;
    }

    public vf7 a() {
        return this.a;
    }

    public vf7 b() {
        return this.a;
    }

    public vf7 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf7)) {
            return false;
        }
        rf7 rf7Var = (rf7) obj;
        if (s() == rf7Var.s() && r() == rf7Var.r() && Objects.equals(m(), rf7Var.m()) && Objects.equals(k(), rf7Var.k()) && Objects.equals(g(), rf7Var.g())) {
            return true;
        }
        return false;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public ug1 g() {
        return null;
    }

    public x13 h(int i) {
        return x13.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public x13 i(int i) {
        if ((i & 8) == 0) {
            return x13.e;
        }
        i.i("Unable to query the maximum insets for IME");
        return null;
    }

    public x13 j() {
        return m();
    }

    public x13 k() {
        return x13.e;
    }

    public x13 l() {
        return m();
    }

    public x13 m() {
        return x13.e;
    }

    public x13 n() {
        return m();
    }

    public vf7 q(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return false;
    }

    public boolean t(int i) {
        return true;
    }

    public void p() {
    }

    public void A(Rect[][] rectArr) {
    }

    public void d(View view) {
    }

    public void o(View view) {
    }

    public void u(yg1 yg1Var) {
    }

    public void v(x13[] x13VarArr) {
    }

    public void w(vf7 vf7Var) {
    }

    public void x(x13 x13Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}
