package pd;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends ec.c {
    public yb.b R;
    public bk.a X;
    public LinkedHashMap Y;
    public String Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f11555b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f11556c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ bk.a f11557d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f11558e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(bk.a aVar, ec.a aVar2) {
        super(aVar2);
        this.f11557d0 = aVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        this.f11556c0 = obj;
        this.f11558e0 |= Integer.MIN_VALUE;
        return bk.a.e(this.f11557d0, null, this);
    }
}
