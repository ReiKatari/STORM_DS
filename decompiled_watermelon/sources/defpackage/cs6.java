package defpackage;

import android.os.Trace;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cs6  reason: default package */
/* loaded from: classes.dex */
public final class cs6 extends yy3 implements mf3, gk1, gz5 {
    public String j0;
    public ds6 k0;
    public od2 l0;
    public int m0;
    public boolean n0;
    public int o0;
    public int p0;
    public yq0 q0;
    public HashMap r0;
    public zi4 s0;
    public ds6 t0;
    public as6 u0;
    public bs6 v0;

    @Override // defpackage.yy3
    public final boolean G0() {
        return false;
    }

    @Override // defpackage.mf3
    public final int H(fs3 fs3Var, mv3 mv3Var, int i) {
        return S0(fs3Var).a(i, fs3Var.getLayoutDirection());
    }

    public final zi4 R0() {
        ds6 ds6Var = this.t0;
        if (ds6Var == null) {
            ds6Var = this.k0;
        }
        ds6 ds6Var2 = ds6Var;
        if (this.s0 == null) {
            this.s0 = new zi4(this.j0, ds6Var2, this.l0, this.m0, this.n0, this.o0, this.p0);
        }
        zi4 zi4Var = this.s0;
        zi4Var.getClass();
        return zi4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        if (r0 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.zi4 S0(defpackage.vv3 r10) {
        /*
            r9 = this;
            r0 = 1
            boolean r0 = r9.T0(r0)
            if (r0 == 0) goto L21
            ds6 r0 = r9.t0
            if (r0 != 0) goto Ld
            ds6 r0 = r9.k0
        Ld:
            r3 = r0
            zi4 r1 = r9.R0()
            java.lang.String r2 = r9.j0
            od2 r4 = r9.l0
            int r5 = r9.m0
            boolean r6 = r9.n0
            int r7 = r9.o0
            int r8 = r9.p0
            r1.f(r2, r3, r4, r5, r6, r7, r8)
        L21:
            bs6 r0 = r9.v0
            if (r0 == 0) goto L31
            boolean r1 = r0.c
            if (r1 == 0) goto L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 == 0) goto L31
            zi4 r0 = r0.d
            if (r0 != 0) goto L35
        L31:
            zi4 r0 = r9.R0()
        L35:
            r0.d(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs6.S0(vv3):zi4");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0014, code lost:
        if (r0 != null) goto L11;
     */
    @Override // defpackage.gk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(defpackage.xf3 r11) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cs6.T(xf3):void");
    }

    public final boolean T0(int i) {
        ds6 ds6Var = this.t0;
        ds6 ds6Var2 = this.k0;
        ve2.W(this, "StyleOuterNode", new d96(22));
        this.t0 = ds6Var2;
        if (ds6Var == null) {
            return false;
        }
        return !ds6Var.equals(ds6Var2);
    }

    @Override // defpackage.mf3
    public final int Z(fs3 fs3Var, mv3 mv3Var, int i) {
        return hi2.f(S0(fs3Var).e(fs3Var.getLayoutDirection()).a());
    }

    @Override // defpackage.mf3
    public final uv3 e(vv3 vv3Var, mv3 mv3Var, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            zi4 S0 = S0(vv3Var);
            boolean b = S0.b(j, vv3Var.getLayoutDirection());
            yi4 yi4Var = S0.n;
            if (yi4Var != null) {
                yi4Var.b();
            }
            qi qiVar = S0.j;
            qiVar.getClass();
            jr6 jr6Var = qiVar.d;
            long j2 = S0.l;
            if (b) {
                l.N(this, 2).f1();
                HashMap hashMap = this.r0;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.r0 = hashMap;
                }
                hashMap.put(xb.a, Integer.valueOf(Math.round(jr6Var.d(0))));
                hashMap.put(xb.b, Integer.valueOf(Math.round(jr6Var.d(jr6Var.g - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & 4294967295L);
            yn4 c = mv3Var.c(w81.m(i, i, i2, i2));
            HashMap hashMap2 = this.r0;
            hashMap2.getClass();
            return vv3Var.s0(i, i2, hashMap2, new ru(c, 10));
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.mf3
    public final int h(fs3 fs3Var, mv3 mv3Var, int i) {
        return hi2.f(S0(fs3Var).e(fs3Var.getLayoutDirection()).c());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [as6] */
    @Override // defpackage.gz5
    public final void p0(rz5 rz5Var) {
        as6 as6Var = this.u0;
        as6 as6Var2 = as6Var;
        if (as6Var == null) {
            ?? r0 = new mi2(this) { // from class: as6
                public final /* synthetic */ cs6 B;

                {
                    this.B = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0117  */
                @Override // defpackage.mi2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object n(java.lang.Object r31) {
                    /*
                        Method dump skipped, instructions count: 294
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.as6.n(java.lang.Object):java.lang.Object");
                }
            };
            this.u0 = r0;
            as6Var2 = r0;
        }
        to toVar = new to(this.j0);
        l93[] l93VarArr = pz5.a;
        rz5Var.b(mz5.C, l07.b0(toVar));
        bs6 bs6Var = this.v0;
        if (bs6Var != null) {
            boolean z = bs6Var.c;
            qz5 qz5Var = mz5.E;
            l93[] l93VarArr2 = pz5.a;
            l93 l93Var = l93VarArr2[17];
            rz5Var.b(qz5Var, Boolean.valueOf(z));
            to toVar2 = new to(bs6Var.b);
            qz5 qz5Var2 = mz5.D;
            l93 l93Var2 = l93VarArr2[16];
            rz5Var.b(qz5Var2, toVar2);
        }
        rz5Var.b(dz5.l, new w1(null, new mi2(this) { // from class: as6
            public final /* synthetic */ cs6 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object n(java.lang.Object r31) {
                /*
                    Method dump skipped, instructions count: 294
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.as6.n(java.lang.Object):java.lang.Object");
            }
        }));
        rz5Var.b(dz5.m, new w1(null, new mi2(this) { // from class: as6
            public final /* synthetic */ cs6 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object n(java.lang.Object r31) {
                /*
                    Method dump skipped, instructions count: 294
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.as6.n(java.lang.Object):java.lang.Object");
            }
        }));
        rz5Var.b(dz5.n, new w1(null, new t06(9, this)));
        pz5.a(rz5Var, as6Var2);
    }

    @Override // defpackage.mf3
    public final int r(fs3 fs3Var, mv3 mv3Var, int i) {
        return S0(fs3Var).a(i, fs3Var.getLayoutDirection());
    }
}
