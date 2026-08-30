package w;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 implements j0.e1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f13912a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f13913b;

    /* renamed from: c  reason: collision with root package name */
    public final l7.a f13914c;

    /* renamed from: d  reason: collision with root package name */
    public final x.p f13915d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f13916e;

    public c0(Context context, Object obj, LinkedHashSet linkedHashSet) {
        l7.a aVar = new l7.a(19);
        this.f13912a = new Object();
        this.f13913b = new HashMap();
        this.f13914c = aVar;
        this.f13916e = context;
        if (obj instanceof x.p) {
            this.f13915d = (x.p) obj;
        } else {
            this.f13915d = x.p.a(context, k0.d.B());
        }
        try {
            a(new ArrayList(linkedHashSet));
        } catch (j0.m0 e6) {
            if (e6.getCause() instanceof d0.t) {
                throw ((d0.t) e6.getCause());
            }
            throw new Exception(e6);
        }
    }

    @Override // j0.e1
    public final void a(List list) {
        HashSet hashSet;
        HashMap hashMap = new HashMap();
        synchronized (this.f13912a) {
            hashSet = new HashSet(list);
            hashSet.removeAll(this.f13913b.keySet());
        }
        try {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                hashMap.put(str, b(str));
            }
            synchronized (this.f13912a) {
                try {
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList = (ArrayList) list;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        String str2 = (String) obj;
                        if (this.f13913b.containsKey(str2)) {
                            hashMap2.put(str2, (b1) this.f13913b.get(str2));
                        } else {
                            hashMap2.put(str2, (b1) hashMap.get(str2));
                        }
                    }
                    this.f13913b.clear();
                    this.f13913b.putAll(hashMap2);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (d0.t | RuntimeException e6) {
            throw new Exception("Failed to create SupportedSurfaceCombination", e6);
        }
    }

    public final b1 b(String str) {
        f0.b bVar;
        if (Build.VERSION.SDK_INT >= 35) {
            bVar = new v.e(this.f13916e, str, this.f13915d);
        } else {
            bVar = f0.b.f4514h;
        }
        f0.b bVar2 = bVar;
        return new b1(this.f13916e, str, this.f13915d, this.f13914c, bVar2);
    }
}
