package dg;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final int f4088e = 0;
    @va.b("a")

    /* renamed from: a  reason: collision with root package name */
    private final int f4089a;
    @va.b("b")

    /* renamed from: b  reason: collision with root package name */
    private final int f4090b;
    @va.b("c")

    /* renamed from: c  reason: collision with root package name */
    private final int f4091c;
    @va.b("d")

    /* renamed from: d  reason: collision with root package name */
    private final int f4092d;

    public e(int i2, int i10, int i11, int i12) {
        this.f4089a = i2;
        this.f4090b = i10;
        this.f4091c = i11;
        this.f4092d = i12;
    }

    public static /* synthetic */ e f(e eVar, int i2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i2 = eVar.f4089a;
        }
        if ((i13 & 2) != 0) {
            i10 = eVar.f4090b;
        }
        if ((i13 & 4) != 0) {
            i11 = eVar.f4091c;
        }
        if ((i13 & 8) != 0) {
            i12 = eVar.f4092d;
        }
        return eVar.e(i2, i10, i11, i12);
    }

    public final int a() {
        return this.f4089a;
    }

    public final int b() {
        return this.f4090b;
    }

    public final int c() {
        return this.f4091c;
    }

    public final int d() {
        return this.f4092d;
    }

    public final e e(int i2, int i10, int i11, int i12) {
        return new e(i2, i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f4089a == eVar.f4089a && this.f4090b == eVar.f4090b && this.f4091c == eVar.f4091c && this.f4092d == eVar.f4092d) {
            return true;
        }
        return false;
    }

    public final int g() {
        return this.f4092d;
    }

    public final int h() {
        return this.f4091c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f4092d) + w.d.c(this.f4091c, w.d.c(this.f4090b, Integer.hashCode(this.f4089a) * 31, 31), 31);
    }

    public final int i() {
        return this.f4089a;
    }

    public final int j() {
        return this.f4090b;
    }

    public String toString() {
        int i2 = this.f4089a;
        int i10 = this.f4090b;
        int i11 = this.f4091c;
        int i12 = this.f4092d;
        StringBuilder j2 = kc.a.j("Rect25(x=", i2, ", y=", i10, ", width=");
        j2.append(i11);
        j2.append(", height=");
        j2.append(i12);
        j2.append(")");
        return j2.toString();
    }
}
