package pi;

import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: n  reason: collision with root package name */
    public static final g f11711n = new g(true, false, -1, -1, false, false, false, -1, -1, false, false, false, null);

    /* renamed from: o  reason: collision with root package name */
    public static final g f11712o;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f11713a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f11714b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11715c;

    /* renamed from: d  reason: collision with root package name */
    public final int f11716d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11717e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11718f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f11719g;

    /* renamed from: h  reason: collision with root package name */
    public final int f11720h;

    /* renamed from: i  reason: collision with root package name */
    public final int f11721i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f11722j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f11723k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f11724l;
    public String m;

    static {
        l7.a aVar = wc.b.B;
        wc.e eVar = wc.e.SECONDS;
        int i2 = Preference.DEFAULT_ORDER;
        long j2 = wc.b.j(wc.j.l(Preference.DEFAULT_ORDER, eVar), eVar);
        if (j2 >= 0) {
            if (j2 <= 2147483647L) {
                i2 = (int) j2;
            }
            f11712o = new g(false, false, -1, -1, false, false, false, i2, -1, true, false, false, null);
            return;
        }
        a0.j.e(kc.a.e(j2, "maxStale < 0: "));
    }

    public g(boolean z10, boolean z11, int i2, int i10, boolean z12, boolean z13, boolean z14, int i11, int i12, boolean z15, boolean z16, boolean z17, String str) {
        this.f11713a = z10;
        this.f11714b = z11;
        this.f11715c = i2;
        this.f11716d = i10;
        this.f11717e = z12;
        this.f11718f = z13;
        this.f11719g = z14;
        this.f11720h = i11;
        this.f11721i = i12;
        this.f11722j = z15;
        this.f11723k = z16;
        this.f11724l = z17;
        this.m = str;
    }

    public final String toString() {
        String str = this.m;
        if (str == null) {
            StringBuilder sb2 = new StringBuilder();
            if (this.f11713a) {
                sb2.append("no-cache, ");
            }
            if (this.f11714b) {
                sb2.append("no-store, ");
            }
            int i2 = this.f11715c;
            if (i2 != -1) {
                sb2.append("max-age=");
                sb2.append(i2);
                sb2.append(", ");
            }
            int i10 = this.f11716d;
            if (i10 != -1) {
                sb2.append("s-maxage=");
                sb2.append(i10);
                sb2.append(", ");
            }
            if (this.f11717e) {
                sb2.append("private, ");
            }
            if (this.f11718f) {
                sb2.append("public, ");
            }
            if (this.f11719g) {
                sb2.append("must-revalidate, ");
            }
            int i11 = this.f11720h;
            if (i11 != -1) {
                sb2.append("max-stale=");
                sb2.append(i11);
                sb2.append(", ");
            }
            int i12 = this.f11721i;
            if (i12 != -1) {
                sb2.append("min-fresh=");
                sb2.append(i12);
                sb2.append(", ");
            }
            if (this.f11722j) {
                sb2.append("only-if-cached, ");
            }
            if (this.f11723k) {
                sb2.append("no-transform, ");
            }
            if (this.f11724l) {
                sb2.append("immutable, ");
            }
            if (sb2.length() == 0) {
                return "";
            }
            sb2.delete(sb2.length() - 2, sb2.length()).getClass();
            String sb3 = sb2.toString();
            this.m = sb3;
            return sb3;
        }
        return str;
    }
}
