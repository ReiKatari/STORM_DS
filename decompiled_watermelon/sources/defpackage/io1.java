package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: io1  reason: default package */
/* loaded from: classes.dex */
public abstract class io1 {
    public int a;
    public final Object b;
    public final Object c;

    public io1(q65 q65Var) {
        this.a = Integer.MIN_VALUE;
        this.c = new Rect();
        this.b = q65Var;
    }

    public static io1 b(q65 q65Var, int i) {
        if (i != 0) {
            if (i == 1) {
                return new kf4(q65Var, 1);
            }
            i.i("invalid orientation");
            return null;
        }
        return new kf4(q65Var, 0);
    }

    public abstract void a(ls5 ls5Var);

    public abstract void c(ls5 ls5Var);

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

    public abstract void r(ls5 ls5Var);

    public abstract void s(ls5 ls5Var);

    public abstract void t(ls5 ls5Var);

    public abstract void u(ls5 ls5Var);

    public abstract i40 v(ls5 ls5Var);

    public io1(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public io1(lo1 lo1Var) {
        this.a = 0;
        this.c = new ea1();
        this.b = lo1Var;
    }
}
