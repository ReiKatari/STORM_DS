package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fo4  reason: default package */
/* loaded from: classes.dex */
public final class fo4 {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final wi6 d;
    public final y56 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final yw2 j;
    public final ty6 k;
    public final ps4 l;
    public final ra0 m;
    public final ra0 n;
    public final ra0 o;

    public fo4(Context context, Bitmap.Config config, ColorSpace colorSpace, wi6 wi6Var, y56 y56Var, boolean z, boolean z2, boolean z3, String str, yw2 yw2Var, ty6 ty6Var, ps4 ps4Var, ra0 ra0Var, ra0 ra0Var2, ra0 ra0Var3) {
        this.a = context;
        this.b = config;
        this.c = colorSpace;
        this.d = wi6Var;
        this.e = y56Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = str;
        this.j = yw2Var;
        this.k = ty6Var;
        this.l = ps4Var;
        this.m = ra0Var;
        this.n = ra0Var2;
        this.o = ra0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fo4) {
            fo4 fo4Var = (fo4) obj;
            if (nb3.k(this.a, fo4Var.a) && this.b == fo4Var.b) {
                if ((Build.VERSION.SDK_INT < 26 || nb3.k(this.c, fo4Var.c)) && nb3.k(this.d, fo4Var.d) && this.e == fo4Var.e && this.f == fo4Var.f && this.g == fo4Var.g && this.h == fo4Var.h && nb3.k(this.i, fo4Var.i) && nb3.k(this.j, fo4Var.j) && nb3.k(this.k, fo4Var.k) && nb3.k(this.l, fo4Var.l) && this.m == fo4Var.m && this.n == fo4Var.n && this.o == fo4Var.o) {
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
        int e = xg6.e(xg6.e(xg6.e((this.e.hashCode() + ((this.d.hashCode() + ((hashCode + i) * 31)) * 31)) * 31, this.f, 31), this.g, 31), this.h, 31);
        String str = this.i;
        if (str != null) {
            i2 = str.hashCode();
        }
        int hashCode2 = this.k.a.hashCode();
        int hashCode3 = this.l.A.hashCode();
        int hashCode4 = this.m.hashCode();
        return this.o.hashCode() + ((this.n.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((((e + i2) * 31) + Arrays.hashCode(this.j.A)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
