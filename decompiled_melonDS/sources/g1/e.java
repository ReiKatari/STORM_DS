package g1;

import ai.r0;
import mc.q;
import n2.m;
import n2.p1;
import n2.r;
import z2.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final p f5019a = new p();

    public static void b(e eVar, mc.p pVar, v2.c cVar, mc.a aVar, int i2) {
        if ((i2 & 8) != 0) {
            cVar = null;
        }
        eVar.f5019a.add(new v2.c(-1789283891, true, new d(pVar, eVar, cVar, aVar)));
    }

    public final void a(c cVar, m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(-798501095);
        if (rVar.f(cVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.f(this)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            p pVar = this.f5019a;
            int size = pVar.size();
            for (int i14 = 0; i14 < size; i14++) {
                ((q) pVar.get(i14)).i(cVar, rVar, Integer.valueOf(i13 & 14));
            }
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r0(this, cVar, i2, 6);
        }
    }
}
