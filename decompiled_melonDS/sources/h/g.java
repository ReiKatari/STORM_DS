package h;

import java.util.ArrayList;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f5821a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f5822b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f5823c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i.a f5824d;

    public /* synthetic */ g(h hVar, String str, i.a aVar, int i2) {
        this.f5821a = i2;
        this.f5822b = hVar;
        this.f5823c = str;
        this.f5824d = aVar;
    }

    @Override // h.c
    public final void a(Object obj) {
        switch (this.f5821a) {
            case 0:
                h hVar = this.f5822b;
                ArrayList arrayList = hVar.f5828d;
                LinkedHashMap linkedHashMap = hVar.f5826b;
                String str = this.f5823c;
                Object obj2 = linkedHashMap.get(str);
                i.a aVar = this.f5824d;
                if (obj2 != null) {
                    int intValue = ((Number) obj2).intValue();
                    arrayList.add(str);
                    try {
                        hVar.b(intValue, aVar, obj);
                        return;
                    } catch (Exception e6) {
                        arrayList.remove(str);
                        throw e6;
                    }
                }
                fj.j.j("Attempting to launch an unregistered ActivityResultLauncher with contract ", aVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                h hVar2 = this.f5822b;
                ArrayList arrayList2 = hVar2.f5828d;
                LinkedHashMap linkedHashMap2 = hVar2.f5826b;
                String str2 = this.f5823c;
                Object obj3 = linkedHashMap2.get(str2);
                i.a aVar2 = this.f5824d;
                if (obj3 != null) {
                    int intValue2 = ((Number) obj3).intValue();
                    arrayList2.add(str2);
                    try {
                        hVar2.b(intValue2, aVar2, obj);
                        return;
                    } catch (Exception e10) {
                        arrayList2.remove(str2);
                        throw e10;
                    }
                }
                fj.j.j("Attempting to launch an unregistered ActivityResultLauncher with contract ", aVar2, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }

    public void b() {
        this.f5822b.f(this.f5823c);
    }
}
