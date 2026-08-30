package f5;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public t f4878a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList f4879b;

    public static long a(g gVar, long j2) {
        t tVar = gVar.f4866d;
        ArrayList arrayList = gVar.f4873k;
        if (tVar instanceof k) {
            return j2;
        }
        int size = arrayList.size();
        long j10 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f4866d != tVar) {
                    j10 = Math.min(j10, a(gVar2, gVar2.f4868f + j2));
                }
            }
        }
        g gVar3 = tVar.f4898i;
        g gVar4 = tVar.f4897h;
        if (gVar == gVar3) {
            long j11 = j2 - tVar.j();
            return Math.min(Math.min(j10, a(gVar4, j11)), j11 - gVar4.f4868f);
        }
        return j10;
    }

    public static long b(g gVar, long j2) {
        t tVar = gVar.f4866d;
        ArrayList arrayList = gVar.f4873k;
        if (tVar instanceof k) {
            return j2;
        }
        int size = arrayList.size();
        long j10 = j2;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) arrayList.get(i2);
            if (dVar instanceof g) {
                g gVar2 = (g) dVar;
                if (gVar2.f4866d != tVar) {
                    j10 = Math.max(j10, b(gVar2, gVar2.f4868f + j2));
                }
            }
        }
        g gVar3 = tVar.f4897h;
        g gVar4 = tVar.f4898i;
        if (gVar == gVar3) {
            long j11 = tVar.j() + j2;
            return Math.max(Math.max(j10, b(gVar4, j11)), j11 - gVar4.f4868f);
        }
        return j10;
    }
}
