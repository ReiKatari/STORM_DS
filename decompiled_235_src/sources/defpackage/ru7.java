package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru7  reason: default package */
/* loaded from: classes.dex */
public class ru7 {
    public static final vu7 b;
    public final vu7 a;

    static {
        iu7 bu7Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            bu7Var = new hu7();
        } else if (i >= 35) {
            bu7Var = new gu7();
        } else if (i >= 34) {
            bu7Var = new fu7();
        } else if (i >= 31) {
            bu7Var = new eu7();
        } else if (i >= 30) {
            bu7Var = new du7();
        } else if (i >= 29) {
            bu7Var = new cu7();
        } else {
            bu7Var = new bu7();
        }
        b = bu7Var.b().a.a().a.b().a.c();
    }

    public ru7(vu7 vu7Var) {
        this.a = vu7Var;
    }

    public vu7 a() {
        return this.a;
    }

    public vu7 b() {
        return this.a;
    }

    public vu7 c() {
        return this.a;
    }

    public List<Rect> e(int i) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru7)) {
            return false;
        }
        ru7 ru7Var = (ru7) obj;
        if (s() == ru7Var.s() && r() == ru7Var.r() && Objects.equals(m(), ru7Var.m()) && Objects.equals(k(), ru7Var.k()) && Objects.equals(g(), ru7Var.g())) {
            return true;
        }
        return false;
    }

    public List<Rect> f(int i) {
        return Collections.EMPTY_LIST;
    }

    public yk1 g() {
        return null;
    }

    public e83 h(int i) {
        return e83.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(s()), Boolean.valueOf(r()), m(), k(), g());
    }

    public e83 i(int i) {
        if ((i & 8) == 0) {
            return e83.e;
        }
        i.h("Unable to query the maximum insets for IME");
        return null;
    }

    public e83 j() {
        return m();
    }

    public e83 k() {
        return e83.e;
    }

    public e83 l() {
        return m();
    }

    public e83 m() {
        return e83.e;
    }

    public e83 n() {
        return m();
    }

    public vu7 q(int i, int i2, int i3, int i4) {
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

    public void u(cl1 cl1Var) {
    }

    public void v(e83[] e83VarArr) {
    }

    public void w(vu7 vu7Var) {
    }

    public void x(e83 e83Var) {
    }

    public void y(int i) {
    }

    public void z(Rect[][] rectArr) {
    }
}
