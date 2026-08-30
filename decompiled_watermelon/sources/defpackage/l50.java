package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l50  reason: default package */
/* loaded from: classes.dex */
public final class l50 {
    public final o24 a;

    public l50(int i) {
        switch (i) {
            case 1:
                this.a = new o24(new pi3[16]);
                return;
            default:
                this.a = new o24(new g01[16]);
                return;
        }
    }

    public void a(CancellationException cancellationException) {
        o24 o24Var = this.a;
        int i = o24Var.L;
        hh0[] hh0VarArr = new hh0[i];
        for (int i2 = 0; i2 < i; i2++) {
            hh0VarArr[i2] = ((g01) o24Var.A[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            hh0VarArr[i3].r(cancellationException);
        }
        if (o24Var.L == 0) {
            return;
        }
        pz2.c("uncancelled requests present");
    }

    public void b() {
        o24 o24Var = this.a;
        d33 t0 = io2.t0(0, o24Var.L);
        int i = t0.A;
        int i2 = t0.B;
        if (i <= i2) {
            while (true) {
                ((g01) o24Var.A[i]).b.k(o27.a);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        o24Var.h();
    }
}
