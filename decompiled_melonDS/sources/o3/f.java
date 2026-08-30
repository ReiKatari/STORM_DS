package o3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: k  reason: collision with root package name */
    public static int f10729k;

    /* renamed from: l  reason: collision with root package name */
    public static final k0.g f10730l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f10731a;

    /* renamed from: b  reason: collision with root package name */
    public final float f10732b;

    /* renamed from: c  reason: collision with root package name */
    public final float f10733c;

    /* renamed from: d  reason: collision with root package name */
    public final float f10734d;

    /* renamed from: e  reason: collision with root package name */
    public final float f10735e;

    /* renamed from: f  reason: collision with root package name */
    public final g0 f10736f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10737g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10738h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f10739i;

    /* renamed from: j  reason: collision with root package name */
    public final int f10740j;

    public f(String str, float f8, float f10, float f11, float f12, g0 g0Var, long j2, int i2, boolean z10) {
        int i10;
        synchronized (f10730l) {
            i10 = f10729k;
            f10729k = i10 + 1;
        }
        this.f10731a = str;
        this.f10732b = f8;
        this.f10733c = f10;
        this.f10734d = f11;
        this.f10735e = f12;
        this.f10736f = g0Var;
        this.f10737g = j2;
        this.f10738h = i2;
        this.f10739i = z10;
        this.f10740j = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (nc.k.a(this.f10731a, fVar.f10731a) && x4.f.b(this.f10732b, fVar.f10732b) && x4.f.b(this.f10733c, fVar.f10733c) && this.f10734d == fVar.f10734d && this.f10735e == fVar.f10735e && this.f10736f.equals(fVar.f10736f) && i3.s.c(this.f10737g, fVar.f10737g) && this.f10738h == fVar.f10738h && this.f10739i == fVar.f10739i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int b10 = w.d.b(this.f10735e, w.d.b(this.f10734d, w.d.b(this.f10733c, w.d.b(this.f10732b, this.f10731a.hashCode() * 31, 31), 31), 31), 31);
        int i2 = i3.s.f6688i;
        return Boolean.hashCode(this.f10739i) + w.d.c(this.f10738h, w.d.f(this.f10737g, (this.f10736f.hashCode() + b10) * 31, 31), 31);
    }
}
