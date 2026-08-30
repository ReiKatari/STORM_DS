package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c80  reason: default package */
/* loaded from: classes.dex */
public final class c80 {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public void a() {
        synchronized (((d80) this.e)) {
            if (this.a) {
                return;
            }
            this.a = true;
            gk7.b((g76) this.c);
            try {
                ((xf1) this.b).a();
            } catch (IOException unused) {
            }
        }
    }

    public int b(ci3 ci3Var, ee eeVar, boolean z) {
        boolean z2;
        int i;
        int i2;
        vr2 vr2Var = (vr2) this.c;
        yr2 yr2Var = (yr2) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            k91 E = ((ka3) this.d).E(ci3Var, eeVar);
            cs3 cs3Var = (cs3) E.A;
            int j = cs3Var.j();
            for (int i3 = 0; i3 < j; i3++) {
                rp4 rp4Var = (rp4) cs3Var.k(i3);
                if (!rp4Var.d && !rp4Var.h) {
                }
                z2 = false;
                break;
            }
            z2 = true;
            int j2 = cs3Var.j();
            for (int i4 = 0; i4 < j2; i4++) {
                rp4 rp4Var2 = (rp4) cs3Var.k(i4);
                if (z2 || ve2.o(rp4Var2)) {
                    ((vf3) this.b).z(rp4Var2.c, (yr2) this.e, rp4Var2.i, true);
                    if (!yr2Var.A.h()) {
                        vr2Var.a(rp4Var2.a, yr2Var, ve2.o(rp4Var2));
                        yr2Var.clear();
                    }
                }
            }
            boolean b = vr2Var.b(E, z);
            int j3 = cs3Var.j();
            int i5 = 0;
            while (true) {
                if (i5 < j3) {
                    rp4 rp4Var3 = (rp4) cs3Var.k(i5);
                    if (!mb4.b(ve2.K(rp4Var3, true), 0L) && rp4Var3.b()) {
                        i = 1;
                        break;
                    }
                    i5++;
                } else {
                    i = 0;
                    break;
                }
            }
            int j4 = cs3Var.j();
            int i6 = 0;
            while (true) {
                if (i6 < j4) {
                    if (((rp4) cs3Var.k(i6)).b()) {
                        i2 = 1;
                        break;
                    }
                    i6++;
                } else {
                    i2 = 0;
                    break;
                }
            }
            int i7 = b | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
