package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: df4  reason: default package */
/* loaded from: classes.dex */
public final class df4 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final h76 d;
    public final uu5 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final xq2 j;
    public final jm6 k;
    public final nj4 l;
    public final j80 m;
    public final j80 n;
    public final j80 o;

    public df4(Context context, Bitmap.Config config, ColorSpace colorSpace, h76 h76Var, uu5 uu5Var, boolean z, boolean z2, boolean z3, String str, xq2 xq2Var, jm6 jm6Var, nj4 nj4Var, j80 j80Var, j80 j80Var2, j80 j80Var3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = h76Var;
        this.e = uu5Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = xq2Var;
        this.k = jm6Var;
        this.l = nj4Var;
        this.m = j80Var;
        this.n = j80Var2;
        this.o = j80Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof df4) {
            df4 df4Var = (df4) obj;
            if (b53.x(this.a, df4Var.a) && this.b == df4Var.b) {
                if ((Build.VERSION.SDK_INT < 26 || b53.x(this.c, df4Var.c)) && b53.x(this.d, df4Var.d) && this.e == df4Var.e && this.f == df4Var.f && this.g == df4Var.g && this.h == df4Var.h && b53.x(this.i, df4Var.i) && b53.x(this.j, df4Var.j) && b53.x(this.k, df4Var.k) && b53.x(this.l, df4Var.l) && this.m == df4Var.m && this.n == df4Var.n && this.o == df4Var.o) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.c;
        int i2 = 0;
        if (colorSpace != null) {
            i = colorSpace.hashCode();
        } else {
            i = 0;
        }
        int c = ej6.c(ej6.c(ej6.c((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i) * 31)) * 31)) * 31, this.f, 31), this.g, 31), this.h, 31);
        String str = this.i;
        if (str != null) {
            i2 = str.hashCode();
        }
        int hashCode2 = this.k.a.hashCode();
        int hashCode3 = this.l.A.hashCode();
        int hashCode4 = this.m.hashCode();
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((((c + i2) * 31) + Arrays.hashCode(this.j.A)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
