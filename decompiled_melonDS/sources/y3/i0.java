package y3;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 implements w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14689a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f14690b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map f14691c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ mc.l f14692d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ j0 f14693e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p0 f14694f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ mc.l f14695g;

    public i0(int i2, int i10, Map map, mc.l lVar, j0 j0Var, p0 p0Var, mc.l lVar2) {
        this.f14689a = i2;
        this.f14690b = i10;
        this.f14691c = map;
        this.f14692d = lVar;
        this.f14693e = j0Var;
        this.f14694f = p0Var;
        this.f14695g = lVar2;
    }

    @Override // y3.w0
    public final int a() {
        return this.f14690b;
    }

    @Override // y3.w0
    public final void b() {
        a4.u uVar;
        a4.o0 o0Var = this.f14694f.A;
        boolean q10 = this.f14693e.q();
        mc.l lVar = this.f14695g;
        if (q10 && (uVar = o0Var.A0.f265c.O0) != null) {
            lVar.k(uVar.f363f0);
        } else {
            lVar.k(o0Var.A0.f265c.f363f0);
        }
    }

    @Override // y3.w0
    public final int c() {
        return this.f14689a;
    }

    @Override // y3.w0
    public final Map d() {
        return this.f14691c;
    }

    @Override // y3.w0
    public final mc.l e() {
        return this.f14692d;
    }
}
