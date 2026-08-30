package bi;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends j7.o {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2319b = 0;

    /* renamed from: c  reason: collision with root package name */
    public final List f2320c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2321d;

    public x(ArrayList arrayList, List list) {
        arrayList.getClass();
        list.getClass();
        this.f2320c = arrayList;
        this.f2321d = list;
    }

    @Override // j7.o
    public final boolean a(int i2, int i10) {
        switch (this.f2319b) {
            case 0:
                return nc.k.a(this.f2320c.get(i2), this.f2321d.get(i10));
            default:
                return nc.k.a(this.f2320c.get(i2), this.f2321d.get(i10));
        }
    }

    @Override // j7.o
    public final boolean b(int i2, int i10) {
        switch (this.f2319b) {
            case 0:
                return nc.k.a(((ze.a) this.f2320c.get(i2)).f15056d, ((ze.a) this.f2321d.get(i10)).f15056d);
            default:
                if (((oe.j0) this.f2320c.get(i2)).f10942a == ((oe.j0) this.f2321d.get(i10)).f10942a) {
                    return true;
                }
                return false;
        }
    }

    @Override // j7.o
    public final int g() {
        switch (this.f2319b) {
            case 0:
                return this.f2321d.size();
            default:
                return this.f2321d.size();
        }
    }

    @Override // j7.o
    public final int h() {
        switch (this.f2319b) {
            case 0:
                return this.f2320c.size();
            default:
                return this.f2320c.size();
        }
    }

    public x(List list, List list2) {
        list.getClass();
        this.f2320c = list;
        this.f2321d = list2;
    }
}
