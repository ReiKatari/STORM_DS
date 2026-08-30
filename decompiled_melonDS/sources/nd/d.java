package nd;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends r {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f10289b;

    /* renamed from: c  reason: collision with root package name */
    public final n0 f10290c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jd.a aVar, int i2) {
        super(aVar);
        this.f10289b = i2;
        aVar.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                super(aVar);
                ld.e e6 = aVar.e();
                e6.getClass();
                this.f10290c = new c(e6, 2);
                return;
            case 2:
                super(aVar);
                ld.e e10 = aVar.e();
                e10.getClass();
                this.f10290c = new c(e10, 3);
                return;
            default:
                ld.e e11 = aVar.e();
                e11.getClass();
                this.f10290c = new c(e11, 1);
                return;
        }
    }

    @Override // jd.a
    public final ld.e e() {
        switch (this.f10289b) {
            case 0:
                return (c) this.f10290c;
            case DSiCameraSource.FrontCamera /* 1 */:
                return (c) this.f10290c;
            default:
                return (c) this.f10290c;
        }
    }

    @Override // nd.a
    public final Object f() {
        switch (this.f10289b) {
            case 0:
                return new ArrayList();
            case DSiCameraSource.FrontCamera /* 1 */:
                return new HashSet();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // nd.a
    public final int g(Object obj) {
        switch (this.f10289b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            case DSiCameraSource.FrontCamera /* 1 */:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // nd.a
    public final Iterator h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // nd.a
    public final int i(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // nd.a
    public final Object l(Object obj) {
        switch (this.f10289b) {
            case 0:
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                throw null;
            default:
                throw null;
        }
    }

    @Override // nd.a
    public final Object m(Object obj) {
        switch (this.f10289b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            case DSiCameraSource.FrontCamera /* 1 */:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                return hashSet;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // nd.r
    public final void n(int i2, Object obj, Object obj2) {
        switch (this.f10289b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i2, obj2);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                HashSet hashSet = (HashSet) obj;
                hashSet.getClass();
                hashSet.add(obj2);
                return;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                return;
        }
    }
}
