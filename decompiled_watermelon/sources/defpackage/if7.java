package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: if7  reason: default package */
/* loaded from: classes.dex */
public abstract class if7 {
    public final vf7 a;
    public x13[] b;
    public final Rect[][] c;
    public final Rect[][] d;

    public if7(vf7 vf7Var) {
        this.c = new Rect[10];
        this.d = new Rect[10];
        this.a = vf7Var;
        c(vf7Var);
    }

    public final void a() {
        x13[] x13VarArr = this.b;
        if (x13VarArr != null) {
            x13 x13Var = x13VarArr[0];
            x13 x13Var2 = x13VarArr[1];
            vf7 vf7Var = this.a;
            if (x13Var2 == null) {
                x13Var2 = vf7Var.a.h(2);
            }
            if (x13Var == null) {
                x13Var = vf7Var.a.h(1);
            }
            h(x13.a(x13Var, x13Var2));
            x13 x13Var3 = this.b[sf7.b(16)];
            if (x13Var3 != null) {
                g(x13Var3);
            }
            x13 x13Var4 = this.b[sf7.b(32)];
            if (x13Var4 != null) {
                e(x13Var4);
            }
            x13 x13Var5 = this.b[sf7.b(64)];
            if (x13Var5 != null) {
                i(x13Var5);
            }
        }
    }

    public abstract vf7 b();

    public void c(vf7 vf7Var) {
        for (int i = 1; i <= 512; i <<= 1) {
            List<Rect> e = vf7Var.a.e(i);
            int b = sf7.b(i);
            this.c[b] = (Rect[]) e.toArray(new Rect[e.size()]);
            if (i != 8) {
                List<Rect> f = vf7Var.a.f(i);
                this.d[b] = (Rect[]) f.toArray(new Rect[f.size()]);
            }
        }
    }

    public void d(int i, x13 x13Var) {
        if (this.b == null) {
            this.b = new x13[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.b[sf7.b(i2)] = x13Var;
            }
        }
    }

    public abstract void f(x13 x13Var);

    public abstract void h(x13 x13Var);

    public if7() {
        this(new vf7());
    }

    public void e(x13 x13Var) {
    }

    public void g(x13 x13Var) {
    }

    public void i(x13 x13Var) {
    }
}
