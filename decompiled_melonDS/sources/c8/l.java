package c8;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f2667a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2668b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f2669c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2670d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ n f2671e;

    public l(n nVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2671e = nVar;
        this.f2667a = obj;
        this.f2668b = arrayList;
        this.f2669c = obj2;
        this.f2670d = arrayList2;
    }

    @Override // c8.u, c8.r
    public final void a(t tVar) {
        tVar.D(this);
    }

    @Override // c8.u, c8.r
    public final void f(t tVar) {
        n nVar = this.f2671e;
        Object obj = this.f2667a;
        if (obj != null) {
            nVar.z(obj, this.f2668b, null);
        }
        Object obj2 = this.f2669c;
        if (obj2 != null) {
            nVar.z(obj2, this.f2670d, null);
        }
    }
}
