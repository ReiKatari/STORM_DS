package b4;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: a  reason: collision with root package name */
    public final i4.m f1934a;

    /* renamed from: b  reason: collision with root package name */
    public final a1.y f1935b;

    public q2(i4.p pVar, a1.l lVar) {
        this.f1934a = pVar.f6770d;
        this.f1935b = new a1.y(i4.p.j(4, pVar).size());
        List j2 = i4.p.j(4, pVar);
        int size = j2.size();
        for (int i2 = 0; i2 < size; i2++) {
            i4.p pVar2 = (i4.p) j2.get(i2);
            if (lVar.a(pVar2.f6773g)) {
                this.f1935b.a(pVar2.f6773g);
            }
        }
    }
}
