package b0;

import aj.g;
import d0.a1;
import j0.b0;
import j0.e1;
import j0.m0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p7.k;
import p7.m;
import w.y;
import x.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements e1 {

    /* renamed from: b  reason: collision with root package name */
    public final p f1733b;

    /* renamed from: a  reason: collision with root package name */
    public final Object f1732a = new Object();

    /* renamed from: d  reason: collision with root package name */
    public HashMap f1735d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public HashSet f1736e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f1737f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public int f1738g = 0;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f1734c = new ArrayList();

    public a(p pVar) {
        this.f1733b = pVar;
        try {
            a(Arrays.asList(pVar.c()));
        } catch (m0 | x.a e6) {
            g.t("Camera2CameraCoordinator", "Failed to get concurrent camera ids", e6);
        }
    }

    @Override // j0.e1
    public final void a(List list) {
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        try {
            for (Set set : this.f1733b.f14306a.y()) {
                if (list.containsAll(set)) {
                    ArrayList arrayList = new ArrayList(set);
                    if (arrayList.size() >= 2) {
                        String str = (String) arrayList.get(0);
                        String str2 = (String) arrayList.get(1);
                        try {
                            if (k.r(str, this.f1733b) && k.r(str2, this.f1733b)) {
                                hashSet.add(new HashSet(Arrays.asList(str, str2)));
                                if (!hashMap.containsKey(str)) {
                                    hashMap.put(str, new ArrayList());
                                }
                                ((List) hashMap.get(str)).add(str2);
                                if (!hashMap.containsKey(str2)) {
                                    hashMap.put(str2, new ArrayList());
                                }
                                ((List) hashMap.get(str2)).add(str);
                            }
                        } catch (a1 unused) {
                            g.o("Camera2CameraCoordinator", "Concurrent camera id pair: (" + str + ", " + str + ") is not backward compatible");
                        }
                    }
                }
            }
            synchronized (this.f1732a) {
                this.f1735d = hashMap;
                this.f1736e = hashSet;
                g.o("Camera2CameraCoordinator", "Updated concurrent camera map: " + this.f1735d);
            }
        } catch (x.a e6) {
            throw new Exception("Failed to retrieve concurrent camera id info.", e6);
        }
    }

    public final int b() {
        int i2;
        synchronized (this.f1732a) {
            i2 = this.f1738g;
        }
        return i2;
    }

    public final String c(String str) {
        synchronized (this.f1732a) {
            try {
                if (!this.f1735d.containsKey(str)) {
                    return null;
                }
                List<String> list = (List) this.f1735d.get(str);
                if (list == null) {
                    return null;
                }
                for (String str2 : list) {
                    ArrayList arrayList = this.f1737f;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        b0 g10 = ((b0) obj).g();
                        m.g("CameraInfo doesn't contain Camera2 implementation.", g10 instanceof y);
                        if (str2.equals(((y) ((y) g10).f14097c.B).f14095a)) {
                            return str2;
                        }
                    }
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
