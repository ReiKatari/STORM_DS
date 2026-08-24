package defpackage;

import androidx.fragment.app.o;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl2  reason: default package */
/* loaded from: classes.dex */
public abstract class vl2 {
    public final gl2 a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList p;
    public ArrayList q;
    public ArrayList s;
    public final ArrayList c = new ArrayList();
    public boolean j = true;
    public boolean r = false;

    public vl2(gl2 gl2Var, ClassLoader classLoader) {
        this.a = gl2Var;
        this.b = classLoader;
    }

    public final void b(ul2 ul2Var) {
        this.c.add(ul2Var);
        ul2Var.d = this.d;
        ul2Var.e = this.e;
        ul2Var.f = this.f;
        ul2Var.g = this.g;
    }

    public final void c() {
        if (this.j) {
            this.i = true;
            this.k = null;
            return;
        }
        i.m("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public abstract void d(int i, o oVar, String str, int i2);

    public final void e(int i, o oVar, String str) {
        if (i != 0) {
            d(i, oVar, str, 2);
        } else {
            i.h("Must use non-zero containerViewId");
        }
    }
}
