package zf;

import java.util.ArrayList;
import java.util.List;
import u1.h1;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15071a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.g f15072b;

    public /* synthetic */ e(a0.g gVar, int i2) {
        this.f15071a = i2;
        this.f15072b = gVar;
    }

    public static dg.g d(dg.f fVar) {
        String f8 = fVar.f();
        String g10 = fVar.g();
        List<dg.d> h2 = fVar.h();
        ArrayList arrayList = new ArrayList(m.G(h2, 10));
        for (dg.d dVar : h2) {
            arrayList.add(new nf.f(new nf.g(dVar.f().i(), dVar.f().j(), dVar.f().h(), dVar.f().g()), dVar.e(), null, null));
        }
        return new dg.g(f8, g10, arrayList);
    }

    @Override // zf.k
    public final int a() {
        switch (this.f15071a) {
            case 0:
                return 25;
            default:
                return 36;
        }
    }

    @Override // zf.k
    public final int b() {
        switch (this.f15071a) {
            case 0:
                return 26;
            default:
                return 37;
        }
    }

    @Override // zf.k
    public final void c() {
        switch (this.f15071a) {
            case 0:
                this.f15072b.x("layouts.json", dg.a.class, new h1(this));
                return;
            default:
                this.f15072b.x("rom_data.json", of.b.class, new f(2));
                return;
        }
    }
}
