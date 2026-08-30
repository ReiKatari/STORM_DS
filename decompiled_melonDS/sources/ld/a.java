package ld;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f9009a;

    /* renamed from: b  reason: collision with root package name */
    public List f9010b = q.A;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9011c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final HashSet f9012d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f9013e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f9014f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f9015g = new ArrayList();

    public a(String str) {
        this.f9009a = str;
    }

    public static void a(a aVar, String str, e eVar) {
        aVar.getClass();
        str.getClass();
        eVar.getClass();
        if (aVar.f9012d.add(str)) {
            aVar.f9011c.add(str);
            aVar.f9013e.add(eVar);
            aVar.f9014f.add(q.A);
            aVar.f9015g.add(false);
            return;
        }
        StringBuilder u4 = w.d.u("Element with name '", str, "' is already registered in ");
        u4.append(aVar.f9009a);
        throw new IllegalArgumentException(u4.toString().toString());
    }
}
