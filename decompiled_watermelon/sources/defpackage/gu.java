package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gu  reason: default package */
/* loaded from: classes.dex */
public class gu {
    public final yt d;
    public ob6 a = null;
    public float b = RecyclerView.A1;
    public final ArrayList c = new ArrayList();
    public boolean e = false;

    public gu(os osVar) {
        this.d = new yt(this, osVar);
    }

    public final void a(ho3 ho3Var, int i) {
        ob6 j = ho3Var.j(i);
        yt ytVar = this.d;
        ytVar.g(j, 1.0f);
        ytVar.g(ho3Var.j(i), -1.0f);
    }

    public final void b(ob6 ob6Var, ob6 ob6Var2, ob6 ob6Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        yt ytVar = this.d;
        if (!z) {
            ytVar.g(ob6Var, -1.0f);
            ytVar.g(ob6Var2, 1.0f);
            ytVar.g(ob6Var3, 1.0f);
            return;
        }
        ytVar.g(ob6Var, 1.0f);
        ytVar.g(ob6Var2, -1.0f);
        ytVar.g(ob6Var3, -1.0f);
    }

    public final void c(ob6 ob6Var, ob6 ob6Var2, ob6 ob6Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = i;
        }
        yt ytVar = this.d;
        if (!z) {
            ytVar.g(ob6Var, -1.0f);
            ytVar.g(ob6Var2, 1.0f);
            ytVar.g(ob6Var3, -1.0f);
            return;
        }
        ytVar.g(ob6Var, 1.0f);
        ytVar.g(ob6Var2, -1.0f);
        ytVar.g(ob6Var3, 1.0f);
    }

    public ob6 d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        if (this.a == null && this.b == RecyclerView.A1 && this.d.d() == 0) {
            return true;
        }
        return false;
    }

    public final ob6 f(boolean[] zArr, ob6 ob6Var) {
        nb6 nb6Var;
        yt ytVar = this.d;
        int d = ytVar.d();
        ob6 ob6Var2 = null;
        float f = 0.0f;
        for (int i = 0; i < d; i++) {
            float f2 = ytVar.f(i);
            if (f2 < RecyclerView.A1) {
                ob6 e = ytVar.e(i);
                if ((zArr == null || !zArr[e.B]) && e != ob6Var && (((nb6Var = e.d0) == nb6.SLACK || nb6Var == nb6.ERROR) && f2 < f)) {
                    f = f2;
                    ob6Var2 = e;
                }
            }
        }
        return ob6Var2;
    }

    public final void g(ob6 ob6Var) {
        ob6 ob6Var2 = this.a;
        yt ytVar = this.d;
        if (ob6Var2 != null) {
            ytVar.g(ob6Var2, -1.0f);
            this.a.L = -1;
            this.a = null;
        }
        float h = ytVar.h(ob6Var, true) * (-1.0f);
        this.a = ob6Var;
        if (h == 1.0f) {
            return;
        }
        this.b /= h;
        int i = ytVar.h;
        for (int i2 = 0; i != -1 && i2 < ytVar.a; i2++) {
            float[] fArr = ytVar.g;
            fArr[i] = fArr[i] / h;
            i = ytVar.f[i];
        }
    }

    public final void h(ho3 ho3Var, ob6 ob6Var, boolean z) {
        if (ob6Var.Y) {
            yt ytVar = this.d;
            float c = ytVar.c(ob6Var);
            this.b = (ob6Var.X * c) + this.b;
            ytVar.h(ob6Var, z);
            if (z) {
                ob6Var.b(this);
            }
            if (ytVar.d() == 0) {
                this.e = true;
                ho3Var.b = true;
            }
        }
    }

    public void i(ho3 ho3Var, gu guVar, boolean z) {
        yt ytVar = this.d;
        ytVar.getClass();
        float c = ytVar.c(guVar.a);
        ytVar.h(guVar.a, z);
        yt ytVar2 = guVar.d;
        int d = ytVar2.d();
        for (int i = 0; i < d; i++) {
            ob6 e = ytVar2.e(i);
            ytVar.a(e, ytVar2.c(e) * c, z);
        }
        this.b = (guVar.b * c) + this.b;
        if (z) {
            guVar.a.b(this);
        }
        if (this.a != null && ytVar.d() == 0) {
            this.e = true;
            ho3Var.b = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r10 = this;
            ob6 r0 = r10.a
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            ob6 r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = r0.concat(r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L35
            java.lang.StringBuilder r0 = defpackage.wh1.r(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r4
            goto L36
        L35:
            r1 = r3
        L36:
            yt r10 = r10.d
            int r5 = r10.d()
        L3c:
            if (r3 >= r5) goto L98
            ob6 r6 = r10.e(r3)
            if (r6 != 0) goto L45
            goto L95
        L45:
            float r7 = r10.f(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L4e
            goto L95
        L4e:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L62
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L72
            java.lang.String r1 = "- "
            java.lang.String r0 = r0.concat(r1)
        L60:
            float r7 = r7 * r9
            goto L72
        L62:
            if (r8 <= 0) goto L6b
            java.lang.String r1 = " + "
            java.lang.String r0 = r0.concat(r1)
            goto L72
        L6b:
            java.lang.String r1 = " - "
            java.lang.String r0 = r0.concat(r1)
            goto L60
        L72:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L7d
            java.lang.String r0 = r0.concat(r6)
            goto L94
        L7d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L94:
            r1 = r4
        L95:
            int r3 = r3 + 1
            goto L3c
        L98:
            if (r1 != 0) goto La1
            java.lang.String r10 = "0.0"
            java.lang.String r10 = r0.concat(r10)
            return r10
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu.toString():java.lang.String");
    }
}
