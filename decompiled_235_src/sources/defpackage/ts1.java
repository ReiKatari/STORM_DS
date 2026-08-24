package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ts1  reason: default package */
/* loaded from: classes.dex */
public abstract class ts1 {
    public int a;
    public final Object b;
    public final Object c;

    public ts1(gg5 gg5Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = gg5Var;
    }

    public static ts1 b(gg5 gg5Var, int i) {
        if (i != 0) {
            if (i == 1) {
                return new mo4(gg5Var, 1);
            }
            i.h("invalid orientation");
            return null;
        }
        return new mo4(gg5Var, 0);
    }

    public abstract void a(e36 e36Var);

    public abstract void c(e36 e36Var);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(e36 e36Var);

    public abstract void s(e36 e36Var);

    public abstract void t(e36 e36Var);

    public abstract void u(e36 e36Var);

    public abstract g60 v(e36 e36Var);

    public ts1(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public ts1(vs1 vs1Var) {
        this.a = 0;
        this.c = new ae1();
        this.b = vs1Var;
    }
}
