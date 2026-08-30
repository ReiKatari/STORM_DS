package nd;

import java.io.IOException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements mc.a {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ x(int i2, String str, y yVar) {
        this.B = i2;
        this.L = str;
        this.R = yVar;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.A) {
            case 0:
                String str = (String) this.L;
                y yVar = (y) this.R;
                int i2 = this.B;
                ld.e[] eVarArr = new ld.e[i2];
                for (int i10 = 0; i10 < i2; i10++) {
                    eVarArr[i10] = aj.g.i(str + '.' + yVar.f10280e[i10], ld.j.f9047r, new ld.e[0]);
                }
                return eVarArr;
            default:
                wi.p pVar = (wi.p) this.L;
                int i11 = this.B;
                wi.c cVar = (wi.c) this.R;
                try {
                    cVar.getClass();
                    pVar.f14273q0.z(i11, cVar);
                } catch (IOException e6) {
                    wi.c cVar2 = wi.c.PROTOCOL_ERROR;
                    pVar.d(cVar2, cVar2, e6);
                }
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ x(wi.p pVar, int i2, wi.c cVar) {
        this.L = pVar;
        this.B = i2;
        this.R = cVar;
    }
}
