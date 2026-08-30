package v2;

import java.util.Set;
import n2.x1;
import n2.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements x1 {
    public final Set A;
    public final p2.b B = new p2.b(new y1[16]);

    public e(Set set) {
        this.A = set;
    }

    @Override // n2.x1
    public final void a() {
        p2.b bVar = this.B;
        Object[] objArr = bVar.A;
        int i2 = bVar.L;
        for (int i10 = 0; i10 < i2; i10++) {
            x1 x1Var = ((y1) objArr[i10]).f10083a;
            this.A.remove(x1Var);
            x1Var.a();
        }
    }

    @Override // n2.x1
    public final void b() {
    }

    @Override // n2.x1
    public final void c() {
    }
}
