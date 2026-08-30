package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k11  reason: default package */
/* loaded from: classes.dex */
public abstract class k11 extends m00 {
    public final e31 B;
    public transient j11 L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k11(defpackage.j11 r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            e31 r0 = r2.a()
            goto L8
        L7:
            r0 = 0
        L8:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k11.<init>(j11):void");
    }

    @Override // defpackage.j11
    public e31 a() {
        e31 e31Var = this.B;
        e31Var.getClass();
        return e31Var;
    }

    @Override // defpackage.m00
    public void w() {
        j11 j11Var = this.L;
        if (j11Var != null && j11Var != this) {
            c31 I = a().I(k45.Y);
            I.getClass();
            g31 g31Var = (g31) I;
            jg1 jg1Var = (jg1) j11Var;
            jg1Var.j();
            ih0 o = jg1Var.o();
            if (o != null) {
                o.p();
            }
        }
        this.L = ms0.B;
    }

    public k11(j11 j11Var, e31 e31Var) {
        super(j11Var);
        this.B = e31Var;
    }
}
