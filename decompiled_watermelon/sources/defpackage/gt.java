package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gt  reason: default package */
/* loaded from: classes.dex */
public final class gt extends jv3 {
    public final double[] p;
    public final ft[] q;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r5 == r3) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, gt] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, ft] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public gt(int[] r33, double[] r34, double[][] r35) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt.<init>(int[], double[], double[][]):void");
    }

    @Override // defpackage.jv3
    public final double C(double d) {
        ft[] ftVarArr = this.q;
        ft ftVar = ftVarArr[0];
        double d2 = ftVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (ftVar.r) {
                return (d3 * ftVarArr[0].l) + ftVar.c(d2);
            }
            ftVar.g(d2);
            return (ftVarArr[0].a() * d3) + ftVarArr[0].e();
        } else if (d > ftVarArr[ftVarArr.length - 1].d) {
            double d4 = ftVarArr[ftVarArr.length - 1].d;
            double d5 = d - d4;
            int length = ftVarArr.length - 1;
            return (d5 * ftVarArr[length].l) + ftVarArr[length].c(d4);
        } else {
            for (int i = 0; i < ftVarArr.length; i++) {
                ft ftVar2 = ftVarArr[i];
                if (d <= ftVar2.d) {
                    if (ftVar2.r) {
                        return ftVar2.c(d);
                    }
                    ftVar2.g(d);
                    return ftVarArr[i].e();
                }
            }
            return Double.NaN;
        }
    }

    @Override // defpackage.jv3
    public final void D(double d, double[] dArr) {
        ft[] ftVarArr = this.q;
        ft ftVar = ftVarArr[0];
        double d2 = ftVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (ftVar.r) {
                double c = ftVar.c(d2);
                ft ftVar2 = ftVarArr[0];
                dArr[0] = (ftVar2.l * d3) + c;
                dArr[1] = (d3 * ftVarArr[0].m) + ftVar2.d(d2);
                return;
            }
            ftVar.g(d2);
            dArr[0] = (ftVarArr[0].a() * d3) + ftVarArr[0].e();
            dArr[1] = (ftVarArr[0].b() * d3) + ftVarArr[0].f();
        } else if (d > ftVarArr[ftVarArr.length - 1].d) {
            double d4 = ftVarArr[ftVarArr.length - 1].d;
            double d5 = d - d4;
            int length = ftVarArr.length - 1;
            ft ftVar3 = ftVarArr[length];
            if (ftVar3.r) {
                double c2 = ftVar3.c(d4);
                ft ftVar4 = ftVarArr[length];
                dArr[0] = (ftVar4.l * d5) + c2;
                dArr[1] = (d5 * ftVarArr[length].m) + ftVar4.d(d4);
                return;
            }
            ftVar3.g(d);
            dArr[0] = (ftVarArr[length].a() * d5) + ftVarArr[length].e();
            dArr[1] = (ftVarArr[length].b() * d5) + ftVarArr[length].f();
        } else {
            for (int i = 0; i < ftVarArr.length; i++) {
                ft ftVar5 = ftVarArr[i];
                if (d <= ftVar5.d) {
                    if (ftVar5.r) {
                        dArr[0] = ftVar5.c(d);
                        dArr[1] = ftVarArr[i].d(d);
                        return;
                    }
                    ftVar5.g(d);
                    dArr[0] = ftVarArr[i].e();
                    dArr[1] = ftVarArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // defpackage.jv3
    public final void E(double d, float[] fArr) {
        ft[] ftVarArr = this.q;
        ft ftVar = ftVarArr[0];
        double d2 = ftVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (ftVar.r) {
                double c = ftVar.c(d2);
                ft ftVar2 = ftVarArr[0];
                fArr[0] = (float) ((ftVar2.l * d3) + c);
                fArr[1] = (float) ((d3 * ftVarArr[0].m) + ftVar2.d(d2));
                return;
            }
            ftVar.g(d2);
            fArr[0] = (float) ((ftVarArr[0].a() * d3) + ftVarArr[0].e());
            fArr[1] = (float) ((ftVarArr[0].b() * d3) + ftVarArr[0].f());
        } else if (d > ftVarArr[ftVarArr.length - 1].d) {
            double d4 = ftVarArr[ftVarArr.length - 1].d;
            double d5 = d - d4;
            int length = ftVarArr.length - 1;
            ft ftVar3 = ftVarArr[length];
            if (ftVar3.r) {
                double c2 = ftVar3.c(d4);
                ft ftVar4 = ftVarArr[length];
                fArr[0] = (float) ((ftVar4.l * d5) + c2);
                fArr[1] = (float) ((d5 * ftVarArr[length].m) + ftVar4.d(d4));
                return;
            }
            ftVar3.g(d);
            fArr[0] = (float) ftVarArr[length].e();
            fArr[1] = (float) ftVarArr[length].f();
        } else {
            for (int i = 0; i < ftVarArr.length; i++) {
                ft ftVar5 = ftVarArr[i];
                if (d <= ftVar5.d) {
                    if (ftVar5.r) {
                        fArr[0] = (float) ftVar5.c(d);
                        fArr[1] = (float) ftVarArr[i].d(d);
                        return;
                    }
                    ftVar5.g(d);
                    fArr[0] = (float) ftVarArr[i].e();
                    fArr[1] = (float) ftVarArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // defpackage.jv3
    public final void G(double d, double[] dArr) {
        ft[] ftVarArr = this.q;
        double d2 = ftVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > ftVarArr[ftVarArr.length - 1].d) {
            d = ftVarArr[ftVarArr.length - 1].d;
        }
        for (int i = 0; i < ftVarArr.length; i++) {
            ft ftVar = ftVarArr[i];
            if (d <= ftVar.d) {
                if (ftVar.r) {
                    dArr[0] = ftVar.l;
                    dArr[1] = ftVar.m;
                    return;
                }
                ftVar.g(d);
                dArr[0] = ftVarArr[i].a();
                dArr[1] = ftVarArr[i].b();
                return;
            }
        }
    }

    @Override // defpackage.jv3
    public final double[] H() {
        return this.p;
    }
}
