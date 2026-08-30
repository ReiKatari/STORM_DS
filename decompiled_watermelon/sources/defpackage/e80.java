package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e80  reason: default package */
/* loaded from: classes.dex */
public final class e80 {
    public static final e80 n = new e80(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);
    public static final e80 o;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    static {
        hm1 hm1Var = im1.B;
        om1 om1Var = om1.SECONDS;
        int i = Preference.DEFAULT_ORDER;
        long k = im1.k(b53.k0(Preference.DEFAULT_ORDER, om1Var), om1Var);
        if (k >= 0) {
            if (k <= 2147483647L) {
                i = (int) k;
            }
            o = new e80(false, false, -1, -1, false, false, false, i, -1, true, false, false, null);
            return;
        }
        i.g(wh1.h(k, "maxStale < 0: "));
    }

    public e80(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = z6;
        this.k = z7;
        this.l = z8;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            int i = this.c;
            if (i != -1) {
                sb.append("max-age=");
                sb.append(i);
                sb.append(", ");
            }
            int i2 = this.d;
            if (i2 != -1) {
                sb.append("s-maxage=");
                sb.append(i2);
                sb.append(", ");
            }
            if (this.e) {
                sb.append("private, ");
            }
            if (this.f) {
                sb.append("public, ");
            }
            if (this.g) {
                sb.append("must-revalidate, ");
            }
            int i3 = this.h;
            if (i3 != -1) {
                sb.append("max-stale=");
                sb.append(i3);
                sb.append(", ");
            }
            int i4 = this.i;
            if (i4 != -1) {
                sb.append("min-fresh=");
                sb.append(i4);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.k) {
                sb.append("no-transform, ");
            }
            if (this.l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length()).getClass();
            String sb2 = sb.toString();
            this.m = sb2;
            return sb2;
        }
        return str;
    }
}
