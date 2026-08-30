package o1;

import java.util.List;
import p1.f0;
import p1.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends a3.b {

    /* renamed from: b  reason: collision with root package name */
    public final h f10521b;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f10522c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10523d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f0 f10524e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ t f10525f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f10526g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f10527h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ long f10528i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h hVar, f0 f0Var, int i2, t tVar, int i10, int i11, long j2) {
        super(2);
        this.f10524e = f0Var;
        this.f10525f = tVar;
        this.f10526g = i10;
        this.f10527h = i11;
        this.f10528i = j2;
        this.f10521b = hVar;
        this.f10522c = f0Var;
        this.f10523d = i2;
    }

    public final o j(int i2, long j2, int i10, int i11, int i12) {
        int i13;
        h hVar = this.f10521b;
        Object b10 = hVar.b(i2);
        Object j10 = hVar.f10513b.j(i2);
        List d4 = d(this.f10522c, i2, j2);
        if (x4.a.f(j2)) {
            i13 = x4.a.j(j2);
        } else {
            if (!x4.a.e(j2)) {
                k1.b.a("does not have fixed height");
            }
            i13 = x4.a.i(j2);
        }
        int i14 = i13;
        x4.m layoutDirection = this.f10524e.B.getLayoutDirection();
        w wVar = this.f10525f.m;
        return new o(i2, b10, i14, i12, layoutDirection, this.f10526g, this.f10527h, d4, this.f10528i, j10, wVar, j2, i10, i11);
    }
}
