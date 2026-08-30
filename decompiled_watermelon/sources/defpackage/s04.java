package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s04  reason: default package */
/* loaded from: classes.dex */
public final class s04 {
    public to a;
    public od2 b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public ry3 h;
    public od1 j;
    public ds6 k;
    public r9 l;
    public sd3 m;
    public lr6 n;
    public long q;
    public long i = qz2.a;
    public int o = -1;
    public int p = -1;

    public s04(to toVar, ds6 ds6Var, od2 od2Var, int i, boolean z, int i2, int i3, List list) {
        this.a = toVar;
        this.b = od2Var;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = ds6Var;
    }

    public final int a(int i, sd3 sd3Var) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long a = nz0.a(0, i, 0, Preference.DEFAULT_ORDER);
        if (this.f > 1) {
            ry3 ry3Var = this.h;
            ds6 ds6Var = this.k;
            od1 od1Var = this.j;
            od1Var.getClass();
            ry3 K = nl2.K(ry3Var, sd3Var, ds6Var, od1Var, this.b);
            this.h = K;
            a = K.a(this.f, a);
        }
        int f = hi2.f(b(a, sd3Var).e);
        int i4 = lz0.i(a);
        if (f < i4) {
            f = i4;
        }
        this.o = i;
        this.p = f;
        return f;
    }

    public final q04 b(long j, sd3 sd3Var) {
        int i;
        r9 e = e(sd3Var);
        long w = nk2.w(j, this.d, this.c, e.c());
        boolean z = this.d;
        int i2 = this.c;
        int i3 = this.e;
        if ((!z && (i2 == 2 || i2 == 4 || i2 == 5)) || i3 < 1) {
            i = 1;
        } else {
            i = i3;
        }
        return new q04(e, w, i, i2);
    }

    public final boolean c(long j, sd3 sd3Var) {
        this.q = (this.q << 2) | 3;
        if (this.f > 1) {
            ry3 ry3Var = this.h;
            ds6 ds6Var = this.k;
            od1 od1Var = this.j;
            od1Var.getClass();
            ry3 K = nl2.K(ry3Var, sd3Var, ds6Var, od1Var, this.b);
            this.h = K;
            j = K.a(this.f, j);
        }
        lr6 lr6Var = this.n;
        if (lr6Var != null) {
            q04 q04Var = lr6Var.b;
            kr6 kr6Var = lr6Var.a;
            if (!q04Var.a.b()) {
                sd3 sd3Var2 = kr6Var.h;
                long j2 = kr6Var.j;
                if (sd3Var == sd3Var2 && (lz0.b(j, j2) || (lz0.h(j) == lz0.h(j2) && lz0.j(j) == lz0.j(j2) && lz0.g(j) >= q04Var.e && !q04Var.c))) {
                    lr6 lr6Var2 = this.n;
                    lr6Var2.getClass();
                    if (lz0.b(j, lr6Var2.a.j)) {
                        return false;
                    }
                    lr6 lr6Var3 = this.n;
                    lr6Var3.getClass();
                    this.n = f(sd3Var, j, lr6Var3.b);
                    return true;
                }
            }
        }
        this.n = f(sd3Var, j, b(j, sd3Var));
        return true;
    }

    public final void d(od1 od1Var) {
        long j;
        od1 od1Var2 = this.j;
        if (od1Var != null) {
            int i = qz2.b;
            j = qz2.a(od1Var.b(), od1Var.o());
        } else {
            j = qz2.a;
        }
        if (od1Var2 == null) {
            this.j = od1Var;
            this.i = j;
        } else if (od1Var != null && this.i == j) {
        } else {
            this.j = od1Var;
            this.i = j;
            this.q = (this.q << 2) | 1;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final r9 e(sd3 sd3Var) {
        r9 r9Var = this.l;
        if (r9Var == null || sd3Var != this.m || r9Var.b()) {
            this.m = sd3Var;
            to toVar = this.a;
            ds6 T = cg2.T(this.k, sd3Var);
            od1 od1Var = this.j;
            od1Var.getClass();
            od2 od2Var = this.b;
            List list = this.g;
            if (list == null) {
                list = pp1.A;
            }
            r9Var = new r9(toVar, T, list, od1Var, od2Var);
        }
        this.l = r9Var;
        return r9Var;
    }

    public final lr6 f(sd3 sd3Var, long j, q04 q04Var) {
        float min = Math.min(q04Var.a.c(), q04Var.d);
        to toVar = this.a;
        ds6 ds6Var = this.k;
        List list = this.g;
        if (list == null) {
            list = pp1.A;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        od1 od1Var = this.j;
        od1Var.getClass();
        return new lr6(new kr6(toVar, ds6Var, list, i, z, i2, od1Var, sd3Var, this.b, j), q04Var, nz0.d(j, (hi2.f(min) << 32) | (hi2.f(q04Var.e) & 4294967295L)));
    }

    public final String toString() {
        String str;
        kr6 kr6Var;
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        if (this.n == null) {
            str = "null";
        } else {
            str = "<TextLayoutResult>";
        }
        sb.append(str);
        sb.append(", lastDensity=");
        sb.append((Object) qz2.b(this.i));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=");
        lr6 lr6Var = this.n;
        if (lr6Var != null && (kr6Var = lr6Var.a) != null) {
            obj = new lz0(kr6Var.j);
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
