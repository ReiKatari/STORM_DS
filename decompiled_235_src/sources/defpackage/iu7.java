package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu7  reason: default package */
/* loaded from: classes.dex */
public abstract class iu7 {
    public final vu7 a;
    public e83[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public iu7(vu7 vu7Var) {
        this.c = new Rect[10];
        this.d = new Rect[10];
        this.a = vu7Var;
        c(vu7Var);
    }

    public final void a() {
        e83[] e83VarArr = this.b;
        if (e83VarArr != null) {
            e83 e83Var = e83VarArr[0];
            e83 e83Var2 = e83VarArr[1];
            vu7 vu7Var = this.a;
            if (e83Var2 == null) {
                e83Var2 = vu7Var.a.h(2);
            }
            if (e83Var == null) {
                e83Var = vu7Var.a.h(1);
            }
            h(e83.a(e83Var, e83Var2));
            e83 e83Var3 = this.b[su7.a(16)];
            if (e83Var3 != null) {
                g(e83Var3);
            }
            e83 e83Var4 = this.b[su7.a(32)];
            if (e83Var4 != null) {
                e(e83Var4);
            }
            e83 e83Var5 = this.b[su7.a(64)];
            if (e83Var5 != null) {
                i(e83Var5);
            }
        }
    }

    public abstract vu7 b();

    public void c(vu7 vu7Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = vu7Var.a.e(i);
            int a = su7.a(i);
            this.c[a] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = vu7Var.a.f(i);
                this.d[a] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, e83 e83Var) {
        if (this.b == null) {
            this.b = new e83[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[su7.a(i2)] = e83Var;
            }
        }
    }

    public abstract void f(e83 e83Var);

    public abstract void h(e83 e83Var);

    public iu7() {
        this(new vu7());
    }

    public void e(e83 e83Var) {
    }

    public void g(e83 e83Var) {
    }

    public void i(e83 e83Var) {
    }
}
