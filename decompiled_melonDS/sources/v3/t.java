package v3;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final long f13691a;

    /* renamed from: b  reason: collision with root package name */
    public final long f13692b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13693c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13694d;

    /* renamed from: e  reason: collision with root package name */
    public final float f13695e;

    /* renamed from: f  reason: collision with root package name */
    public final long f13696f;

    /* renamed from: g  reason: collision with root package name */
    public final long f13697g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13698h;

    /* renamed from: i  reason: collision with root package name */
    public final int f13699i;

    /* renamed from: j  reason: collision with root package name */
    public final long f13700j;

    /* renamed from: k  reason: collision with root package name */
    public final ArrayList f13701k;

    /* renamed from: l  reason: collision with root package name */
    public final long f13702l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13703n;

    /* renamed from: o  reason: collision with root package name */
    public t f13704o;

    public t(long j2, long j10, long j11, boolean z10, float f8, long j12, long j13, boolean z11, boolean z12, int i2, long j14) {
        this.f13691a = j2;
        this.f13692b = j10;
        this.f13693c = j11;
        this.f13694d = z10;
        this.f13695e = f8;
        this.f13696f = j12;
        this.f13697g = j13;
        this.f13698h = z11;
        this.f13699i = i2;
        this.f13700j = j14;
        this.f13702l = 0L;
        this.m = z12;
        this.f13703n = z12;
    }

    public final void a() {
        t tVar = this.f13704o;
        if (tVar == null) {
            this.m = true;
            this.f13703n = true;
        } else if (tVar != null) {
            tVar.a();
        }
    }

    public final boolean b() {
        t tVar = this.f13704o;
        if (tVar != null) {
            return tVar.b();
        }
        if (!this.m && !this.f13703n) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PointerInputChange(id=");
        sb2.append((Object) s.i(this.f13691a));
        sb2.append(", uptimeMillis=");
        sb2.append(this.f13692b);
        sb2.append(", position=");
        sb2.append((Object) h3.b.g(this.f13693c));
        sb2.append(", pressed=");
        sb2.append(this.f13694d);
        sb2.append(", pressure=");
        sb2.append(this.f13695e);
        sb2.append(", previousUptimeMillis=");
        sb2.append(this.f13696f);
        sb2.append(", previousPosition=");
        sb2.append((Object) h3.b.g(this.f13697g));
        sb2.append(", previousPressed=");
        sb2.append(this.f13698h);
        sb2.append(", isConsumed=");
        sb2.append(b());
        sb2.append(", type=");
        sb2.append((Object) y.a(this.f13699i));
        sb2.append(", historical=");
        Object obj = this.f13701k;
        if (obj == null) {
            obj = zb.q.A;
        }
        sb2.append(obj);
        sb2.append(",scrollDelta=");
        sb2.append((Object) h3.b.g(this.f13700j));
        sb2.append(')');
        return sb2.toString();
    }

    public t(long j2, long j10, long j11, boolean z10, float f8, long j12, long j13, boolean z11, int i2, ArrayList arrayList, long j14, long j15) {
        this(j2, j10, j11, z10, f8, j12, j13, z11, false, i2, j14);
        this.f13701k = arrayList;
        this.f13702l = j15;
    }
}
