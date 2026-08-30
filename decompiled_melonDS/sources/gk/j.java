package gk;

import java.lang.reflect.Type;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements g {
    public final /* synthetic */ int A;
    public final Type B;

    public /* synthetic */ j(int i2, Type type) {
        this.A = i2;
        this.B = type;
    }

    @Override // gk.g
    public final Object d(a0 a0Var) {
        switch (this.A) {
            case 0:
                k kVar = new k(a0Var);
                a0Var.d(new i(kVar, 0));
                return kVar;
            default:
                k kVar2 = new k(a0Var);
                a0Var.d(new i(kVar2, 1));
                return kVar2;
        }
    }

    @Override // gk.g
    public final Type e() {
        switch (this.A) {
            case 0:
                return this.B;
            default:
                return this.B;
        }
    }
}
