package nd;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i1 extends r {

    /* renamed from: b  reason: collision with root package name */
    public final nc.e f10317b;

    /* renamed from: c  reason: collision with root package name */
    public final c f10318c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(nc.e eVar, jd.a aVar) {
        super(aVar);
        aVar.getClass();
        this.f10317b = eVar;
        ld.e e6 = aVar.e();
        e6.getClass();
        this.f10318c = new c(e6, 0);
    }

    @Override // jd.a
    public final ld.e e() {
        return this.f10318c;
    }

    @Override // nd.a
    public final Object f() {
        return new ArrayList();
    }

    @Override // nd.a
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // nd.a
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new a1.z0(objArr);
    }

    @Override // nd.a
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // nd.a
    public final Object l(Object obj) {
        throw null;
    }

    @Override // nd.a
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Class cls = this.f10317b.f10259a;
        cls.getClass();
        Object newInstance = Array.newInstance(cls, arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // nd.r
    public final void n(int i2, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i2, obj2);
    }
}
