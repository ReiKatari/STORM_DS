package n1;

import androidx.preference.Preference;
import java.util.List;
import p1.f0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends a3.b {

    /* renamed from: b  reason: collision with root package name */
    public final k f9778b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f9779c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9780d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f9781e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f0 f9782f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f9783g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f9784h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ b3.f f9785i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ b3.g f9786j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f9787k;

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f9788l;
    public final /* synthetic */ long m;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ x f9789n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j2, boolean z10, k kVar, f0 f0Var, int i2, int i10, b3.f fVar, b3.g gVar, int i11, int i12, long j10, x xVar) {
        super(2);
        int i13;
        this.f9781e = z10;
        this.f9782f = f0Var;
        this.f9783g = i2;
        this.f9784h = i10;
        this.f9785i = fVar;
        this.f9786j = gVar;
        this.f9787k = i11;
        this.f9788l = i12;
        this.m = j10;
        this.f9789n = xVar;
        this.f9778b = kVar;
        this.f9779c = f0Var;
        int i14 = Preference.DEFAULT_ORDER;
        if (z10) {
            i13 = x4.a.h(j2);
        } else {
            i13 = Integer.MAX_VALUE;
        }
        this.f9780d = x4.b.b(i13, z10 ? i14 : x4.a.g(j2), 5);
    }

    public final q j(int i2, long j2) {
        int i10;
        k kVar = this.f9778b;
        Object b10 = kVar.b(i2);
        Object j10 = kVar.f9767b.j(i2);
        List d4 = d(this.f9779c, i2, j2);
        if (i2 == this.f9783g - 1) {
            i10 = 0;
        } else {
            i10 = this.f9784h;
        }
        int i11 = i10;
        return new q(i2, d4, this.f9781e, this.f9785i, this.f9786j, this.f9782f.B.getLayoutDirection(), this.f9787k, this.f9788l, i11, this.m, b10, j10, this.f9789n.f9859n, j2);
    }
}
