package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yu  reason: default package */
/* loaded from: classes.dex */
public class yu {
    public final qu d;
    public en6 a = null;
    public float b = RecyclerView.B1;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public yu(bt btVar) {
        this.d = new qu(this, btVar);
    }

    public final void a(jv3 jv3Var, int i) {
        en6 j = jv3Var.j(i);
        qu quVar = this.d;
        quVar.g(j, 1.0f);
        quVar.g(jv3Var.j(i), -1.0f);
    }

    public final void b(en6 en6Var, en6 en6Var2, en6 en6Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        qu quVar = this.d;
        if (!z) {
            quVar.g(en6Var, -1.0f);
            quVar.g(en6Var2, 1.0f);
            quVar.g(en6Var3, 1.0f);
            return;
        }
        quVar.g(en6Var, 1.0f);
        quVar.g(en6Var2, -1.0f);
        quVar.g(en6Var3, -1.0f);
    }

    public final void c(en6 en6Var, en6 en6Var2, en6 en6Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        qu quVar = this.d;
        if (!z) {
            quVar.g(en6Var, -1.0f);
            quVar.g(en6Var2, 1.0f);
            quVar.g(en6Var3, -1.0f);
            return;
        }
        quVar.g(en6Var, 1.0f);
        quVar.g(en6Var2, -1.0f);
        quVar.g(en6Var3, 1.0f);
    }

    public en6 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.a == null && this.b == RecyclerView.B1 && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final en6 f(boolean[] zArr, en6 en6Var) {
        dn6 dn6Var;
        qu quVar = this.d;
        int d = quVar.d();
        en6 en6Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float f2 = quVar.f(i);
            if (f2 < RecyclerView.B1) {
                en6 e = quVar.e(i);
                if ((zArr == null || !zArr[e.B]) && e != en6Var && (((dn6Var = e.e0) == dn6.SLACK || dn6Var == dn6.ERROR) && f2 < f)) {
                    f = f2;
                    en6Var2 = e;
                }
            }
        }
        return en6Var2;
    }

    public final void g(en6 en6Var) {
        en6 en6Var2 = this.a;
        qu quVar = this.d;
        if (en6Var2 != null) {
            quVar.g(en6Var2, -1.0f);
            this.a.L = -1;
            this.a = null;
        }
        float h = quVar.h(en6Var, true) * (-1.0f);
        this.a = en6Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = quVar.h;
        for (int i2 = 0; i != -1 && i2 < quVar.a; i2++) {
            float[] fArr = quVar.g;
            fArr[i] = fArr[i] / h;
            i = quVar.f[i];
        }
    }

    public final void h(jv3 jv3Var, en6 en6Var, boolean z) {
        if (en6Var.Y) {
            qu quVar = this.d;
            float c = quVar.c(en6Var);
            this.b = (en6Var.X * c) + this.b;
            quVar.h(en6Var, z);
            if (z) {
                en6Var.b(this);
            }
            if (quVar.d() == 0) {
                this.e = true;
                jv3Var.b = true;
            }
        }
    }

    public void i(jv3 jv3Var, yu yuVar, boolean z) {
        qu quVar = this.d;
        quVar.getClass();
        float c = quVar.c(yuVar.a);
        quVar.h(yuVar.a, z);
        qu quVar2 = yuVar.d;
        int d = quVar2.d();
        for (int i = 0; i < d; i++) {
            en6 e = quVar2.e(i);
            quVar.a(e, quVar2.c(e) * c, z);
        }
        this.b = (yuVar.b * c) + this.b;
        if (z) {
            yuVar.a.b(this);
        }
        if (this.a != null && quVar.d() == 0) {
            this.e = true;
            jv3Var.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        String str;
        boolean z;
        float f;
        int i;
        if (this.a == null) {
            str = "0";
        } else {
            str = "" + this.a;
        }
        String concat = str.concat(" = ");
        if (this.b != RecyclerView.B1) {
            StringBuilder s = lb1.s(concat);
            s.append(this.b);
            concat = s.toString();
            z = true;
        } else {
            z = false;
        }
        qu quVar = this.d;
        int d = quVar.d();
        for (int i2 = 0; i2 < d; i2++) {
            en6 e = quVar.e(i2);
            if (e != null && (quVar.f(i2)) != RecyclerView.B1) {
                String en6Var = e.toString();
                if (!z) {
                    if (f < RecyclerView.B1) {
                        concat = concat.concat("- ");
                        f *= -1.0f;
                    }
                    if (f == 1.0f) {
                        concat = concat.concat(en6Var);
                    } else {
                        concat = concat + f + " " + en6Var;
                    }
                    z = true;
                } else if (i > 0) {
                    concat = concat.concat(" + ");
                    if (f == 1.0f) {
                    }
                    z = true;
                } else {
                    concat = concat.concat(" - ");
                    f *= -1.0f;
                    if (f == 1.0f) {
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return concat.concat("0.0");
        }
        return concat;
    }
}
