package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z36  reason: default package */
/* loaded from: classes.dex */
public final class z36 implements eh1 {
    public final c46 A;
    public final long B;
    public final Object L;
    public final ih0 R;

    public z36(c46 c46Var, long j, Object obj, ih0 ih0Var) {
        this.A = c46Var;
        this.B = j;
        this.L = obj;
        this.R = ih0Var;
    }

    @Override // defpackage.eh1
    public final void dispose() {
        c46 c46Var = this.A;
        synchronized (c46Var) {
            if (this.B < c46Var.q()) {
                return;
            }
            Object[] objArr = c46Var.c0;
            objArr.getClass();
            long j = this.B;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            d46.c(objArr, j, d46.a);
            c46Var.k();
        }
    }
}
