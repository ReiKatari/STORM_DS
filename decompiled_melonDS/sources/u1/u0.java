package u1;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f13443a;

    /* renamed from: b  reason: collision with root package name */
    public final l4.r0 f13444b;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13447e;

    /* renamed from: g  reason: collision with root package name */
    public final x4.c f13449g;

    /* renamed from: h  reason: collision with root package name */
    public final p4.d f13450h;

    /* renamed from: j  reason: collision with root package name */
    public a7.v f13452j;

    /* renamed from: k  reason: collision with root package name */
    public x4.m f13453k;

    /* renamed from: c  reason: collision with root package name */
    public final int f13445c = Preference.DEFAULT_ORDER;

    /* renamed from: d  reason: collision with root package name */
    public final int f13446d = 1;

    /* renamed from: f  reason: collision with root package name */
    public final int f13448f = 1;

    /* renamed from: i  reason: collision with root package name */
    public final List f13451i = zb.q.A;

    public u0(l4.h hVar, l4.r0 r0Var, boolean z10, x4.c cVar, p4.d dVar, int i2) {
        this.f13443a = hVar;
        this.f13444b = r0Var;
        this.f13447e = z10;
        this.f13449g = cVar;
        this.f13450h = dVar;
    }

    public final void a(x4.m mVar) {
        a7.v vVar = this.f13452j;
        if (vVar == null || mVar != this.f13453k || vVar.b()) {
            this.f13453k = mVar;
            vVar = new a7.v(this.f13443a, l4.i0.h(this.f13444b, mVar), this.f13451i, this.f13449g, this.f13450h);
        }
        this.f13452j = vVar;
    }
}
