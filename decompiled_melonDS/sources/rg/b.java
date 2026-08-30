package rg;

import java.util.List;
import mc.l;
import mc.p;
import n2.s;
import p7.m;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ int A = 1;
    public final /* synthetic */ String B;
    public final /* synthetic */ int L;
    public final /* synthetic */ l R;
    public final /* synthetic */ mc.a X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ b(int i2, int i10, String str, List list, mc.a aVar, l lVar) {
        this.B = str;
        this.Z = list;
        this.L = i2;
        this.R = lVar;
        this.X = aVar;
        this.Y = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int F = s.F(this.L | 1);
                String str = this.B;
                m.c(str, (d) this.Z, this.R, this.X, (n2.m) obj, F, this.Y);
                break;
            default:
                ((Integer) obj2).getClass();
                int F2 = s.F(this.Y | 1);
                String str2 = this.B;
                ug.b.c(str2, (List) this.Z, this.L, this.R, this.X, (n2.m) obj, F2);
                break;
        }
        return y.f14813a;
    }

    public /* synthetic */ b(String str, d dVar, l lVar, mc.a aVar, int i2, int i10) {
        this.B = str;
        this.Z = dVar;
        this.R = lVar;
        this.X = aVar;
        this.L = i2;
        this.Y = i10;
    }
}
