package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x02  reason: default package */
/* loaded from: classes.dex */
public final class x02 extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ y02 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x02(y02 y02Var, int i) {
        super(1);
        this.B = i;
        this.L = y02Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        y02 y02Var = this.L;
        switch (i) {
            case 0:
                ex6 ex6Var = (ex6) obj;
                k02 k02Var = k02.PreEnter;
                k02 k02Var2 = k02.Visible;
                Object obj2 = null;
                if (ex6Var.b(k02Var, k02Var2)) {
                    jj0 jj0Var = y02Var.o0.a.c;
                    if (jj0Var != null) {
                        obj2 = jj0Var.c;
                    }
                } else if (ex6Var.b(k02Var2, k02.PostExit)) {
                    jj0 jj0Var2 = y02Var.p0.a.c;
                    if (jj0Var2 != null) {
                        obj2 = jj0Var2.c;
                    }
                } else {
                    obj2 = t02.d;
                }
                if (obj2 == null) {
                    return t02.d;
                }
                return obj2;
            default:
                ex6 ex6Var2 = (ex6) obj;
                k02 k02Var3 = k02.PreEnter;
                k02 k02Var4 = k02.Visible;
                if (ex6Var2.b(k02Var3, k02Var4)) {
                    a86 a86Var = y02Var.o0.a.b;
                    if (a86Var != null) {
                        return a86Var.b;
                    }
                    return t02.c;
                } else if (ex6Var2.b(k02Var4, k02.PostExit)) {
                    a86 a86Var2 = y02Var.p0.a.b;
                    if (a86Var2 != null) {
                        return a86Var2.b;
                    }
                    return t02.c;
                } else {
                    return t02.c;
                }
        }
    }
}
