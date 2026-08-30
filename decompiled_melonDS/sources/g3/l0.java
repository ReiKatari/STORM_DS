package g3;

import a4.q0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 extends nc.l implements mc.l {
    public final /* synthetic */ int B;
    public final /* synthetic */ g0 L;
    public final /* synthetic */ g0 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ q0 Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(g0 g0Var, g0 g0Var2, Object obj, int i2, q0 q0Var, int i10) {
        super(1);
        this.B = i10;
        this.L = g0Var;
        this.R = g0Var2;
        this.Z = obj;
        this.X = i2;
        this.Y = q0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.B) {
            case 0:
                y3.i iVar = (y3.i) obj;
                g0 g0Var = this.R;
                if (this.L != ((p) ((b4.x) a4.l.u(g0Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean B = d.B(g0Var, (g0) this.Z, this.X, this.Y);
                Boolean valueOf = Boolean.valueOf(B);
                if (!B && iVar.a()) {
                    return null;
                }
                return valueOf;
            default:
                y3.i iVar2 = (y3.i) obj;
                g0 g0Var2 = this.R;
                if (this.L != ((p) ((b4.x) a4.l.u(g0Var2)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean A = d.A(this.X, this.Y, g0Var2, (h3.c) this.Z);
                Boolean valueOf2 = Boolean.valueOf(A);
                if (!A && iVar2.a()) {
                    return null;
                }
                return valueOf2;
        }
    }
}
