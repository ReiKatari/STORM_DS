package defpackage;

import java.lang.reflect.Type;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: is0  reason: default package */
/* loaded from: classes.dex */
public final class is0 implements a90 {
    public final /* synthetic */ int A;
    public final Type B;

    public /* synthetic */ is0(int i, Type type) {
        this.A = i;
        this.B = type;
    }

    @Override // defpackage.a90
    public final Type c() {
        int i = this.A;
        return this.B;
    }

    @Override // defpackage.a90
    public final Object d(xb4 xb4Var) {
        switch (this.A) {
            case 0:
                js0 js0Var = new js0(xb4Var);
                xb4Var.d(new hs0(js0Var, 0));
                return js0Var;
            default:
                js0 js0Var2 = new js0(xb4Var);
                xb4Var.d(new hs0(js0Var2, 1));
                return js0Var2;
        }
    }
}
