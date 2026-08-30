package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements c {

    /* renamed from: a  reason: collision with root package name */
    public final int f8903a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8904b;

    /* renamed from: c  reason: collision with root package name */
    public final long f8905c;

    /* renamed from: d  reason: collision with root package name */
    public final w4.q f8906d;

    /* renamed from: e  reason: collision with root package name */
    public final y f8907e;

    /* renamed from: f  reason: collision with root package name */
    public final w4.i f8908f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8909g;

    /* renamed from: h  reason: collision with root package name */
    public final int f8910h;

    /* renamed from: i  reason: collision with root package name */
    public final w4.s f8911i;

    public v(int i2, int i10, long j2, w4.q qVar, y yVar, w4.i iVar, int i11, int i12, w4.s sVar) {
        this.f8903a = i2;
        this.f8904b = i10;
        this.f8905c = j2;
        this.f8906d = qVar;
        this.f8907e = yVar;
        this.f8908f = iVar;
        this.f8909g = i11;
        this.f8910h = i12;
        this.f8911i = sVar;
        if (!x4.o.a(j2, x4.o.f14349c) && x4.o.c(j2) < 0.0f) {
            r4.a.c("lineHeight can't be negative (" + x4.o.c(j2) + ')');
        }
    }

    public final v a(v vVar) {
        if (vVar == null) {
            return this;
        }
        return w.a(this, vVar.f8903a, vVar.f8904b, vVar.f8905c, vVar.f8906d, vVar.f8907e, vVar.f8908f, vVar.f8909g, vVar.f8910h, vVar.f8911i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v) {
                v vVar = (v) obj;
                if (this.f8903a == vVar.f8903a && this.f8904b == vVar.f8904b && x4.o.a(this.f8905c, vVar.f8905c) && nc.k.a(this.f8906d, vVar.f8906d) && nc.k.a(this.f8907e, vVar.f8907e) && nc.k.a(this.f8908f, vVar.f8908f) && this.f8909g == vVar.f8909g && this.f8910h == vVar.f8910h && nc.k.a(this.f8911i, vVar.f8911i)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int c4 = w.d.c(this.f8904b, Integer.hashCode(this.f8903a) * 31, 31);
        x4.p[] pVarArr = x4.o.f14348b;
        int f8 = w.d.f(this.f8905c, c4, 31);
        int i12 = 0;
        w4.q qVar = this.f8906d;
        if (qVar != null) {
            i2 = qVar.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (f8 + i2) * 31;
        y yVar = this.f8907e;
        if (yVar != null) {
            i10 = yVar.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (i13 + i10) * 31;
        w4.i iVar = this.f8908f;
        if (iVar != null) {
            i11 = iVar.hashCode();
        } else {
            i11 = 0;
        }
        int c10 = w.d.c(this.f8910h, w.d.c(this.f8909g, (i14 + i11) * 31, 31), 31);
        w4.s sVar = this.f8911i;
        if (sVar != null) {
            i12 = sVar.hashCode();
        }
        return c10 + i12;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) w4.k.a(this.f8903a)) + ", textDirection=" + ((Object) w4.m.a(this.f8904b)) + ", lineHeight=" + ((Object) x4.o.d(this.f8905c)) + ", textIndent=" + this.f8906d + ", platformStyle=" + this.f8907e + ", lineHeightStyle=" + this.f8908f + ", lineBreak=" + ((Object) w4.e.a(this.f8909g)) + ", hyphens=" + ((Object) w4.d.a(this.f8910h)) + ", textMotion=" + this.f8911i + ')';
    }

    public v(long j2, w4.q qVar) {
        this(0, 0, j2, qVar, null, null, 0, 0, null);
    }
}
