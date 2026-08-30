package zf;

import android.content.Context;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements k {

    /* renamed from: a  reason: collision with root package name */
    public final a0.g f15069a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f15070b;

    public d(a0.g gVar, Context context) {
        this.f15069a = gVar;
        this.f15070b = context;
    }

    @Override // zf.k
    public final int a() {
        return 24;
    }

    @Override // zf.k
    public final int b() {
        return 25;
    }

    @Override // zf.k
    public final void c() {
        this.f15069a.x("rom_data.json", bg.b.class, new zb.a(2, this));
    }
}
