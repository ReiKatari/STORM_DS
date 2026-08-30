package wa;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.c2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p, t.a, c2 {
    public final /* synthetic */ int A;

    public static /* synthetic */ void a() {
        throw new RuntimeException();
    }

    public static /* synthetic */ void c(int i2, String str) {
        throw new IllegalStateException((str + i2).toString());
    }

    public static /* synthetic */ void e(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void f(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IOException(str + obj);
    }

    @Override // t.a
    public Object apply(Object obj) {
        switch (this.A) {
            case l1.c.f8510f /* 10 */:
                Void r32 = (Void) obj;
                return x0.f.f14319b;
            default:
                List<x8.o> list = (List) obj;
                if (list != null) {
                    ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
                    for (x8.o oVar : list) {
                        arrayList.add(oVar.a());
                    }
                    return arrayList;
                }
                return null;
        }
    }

    @Override // n2.c2
    public boolean b() {
        return false;
    }

    @Override // wa.p
    public Object d() {
        switch (this.A) {
            case 0:
                return new LinkedHashMap();
            case DSiCameraSource.FrontCamera /* 1 */:
                return new TreeMap();
            case 2:
                return new ConcurrentHashMap();
            case 3:
                return new ConcurrentSkipListMap();
            case 4:
                return new ArrayList();
            case l1.c.f8511g /* 5 */:
                return new LinkedHashSet();
            case l1.c.f8509e /* 6 */:
                return new TreeSet();
            default:
                return new ArrayDeque();
        }
    }

    public /* synthetic */ b(int i2) {
        this.A = i2;
    }
}
