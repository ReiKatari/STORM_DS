package e5;

import f5.q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class m extends g {

    /* renamed from: t0  reason: collision with root package name */
    public g[] f4367t0 = new g[4];

    /* renamed from: u0  reason: collision with root package name */
    public int f4368u0 = 0;

    public final void S(g gVar) {
        if (gVar != this && gVar != null) {
            int i2 = this.f4368u0 + 1;
            g[] gVarArr = this.f4367t0;
            if (i2 > gVarArr.length) {
                this.f4367t0 = (g[]) Arrays.copyOf(gVarArr, gVarArr.length * 2);
            }
            g[] gVarArr2 = this.f4367t0;
            int i10 = this.f4368u0;
            gVarArr2[i10] = gVar;
            this.f4368u0 = i10 + 1;
        }
    }

    public final void T(int i2, q qVar, ArrayList arrayList) {
        for (int i10 = 0; i10 < this.f4368u0; i10++) {
            g gVar = this.f4367t0[i10];
            ArrayList arrayList2 = qVar.f4884a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
        }
        for (int i11 = 0; i11 < this.f4368u0; i11++) {
            f5.i.b(this.f4367t0[i11], i2, arrayList, qVar);
        }
    }

    @Override // e5.g
    public void g(g gVar, HashMap hashMap) {
        super.g(gVar, hashMap);
        m mVar = (m) gVar;
        this.f4368u0 = 0;
        int i2 = mVar.f4368u0;
        for (int i10 = 0; i10 < i2; i10++) {
            S((g) hashMap.get(mVar.f4367t0[i10]));
        }
    }

    public void U() {
    }
}
