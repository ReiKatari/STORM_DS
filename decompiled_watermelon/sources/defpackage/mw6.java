package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mw6  reason: default package */
/* loaded from: classes.dex */
public final class mw6 extends w74 {
    public final q60 f;
    public kd6 g;

    public mw6(ax5 ax5Var, dt0 dt0Var, od1 od1Var) {
        super(ax5Var, dt0Var, od1Var);
        this.f = n40.f(Preference.DEFAULT_ORDER, null, null, 6);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
        if (r16.b(r0, r7) == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00df, code lost:
        if (r0.j(r3, r7) != r8) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e1, code lost:
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, n75] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.mw6 r16, defpackage.ax5 r17, defpackage.kw6 r18, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mw6.c(mw6, ax5, kw6, k11):java.lang.Object");
    }

    public static kw6 e(q60 q60Var) {
        kw6 kw6Var = null;
        c06 W = io2.W(new ue2(new c04(q60Var, 1), null, 2));
        while (W.hasNext()) {
            kw6 kw6Var2 = (kw6) W.next();
            if (kw6Var != null) {
                kw6Var2 = kw6Var.a(kw6Var2);
            }
            kw6Var = kw6Var2;
        }
        return kw6Var;
    }

    public final boolean d(kp4 kp4Var) {
        boolean z;
        boolean z2;
        boolean z3;
        q60 q60Var;
        ax5 ax5Var;
        boolean z4;
        boolean z5;
        boolean z6;
        rp4 rp4Var = (rp4) tq0.M0(kp4Var.a);
        if (rp4Var != null) {
            List list = rp4Var.m;
            if (list == null) {
                list = pp1.A;
            }
            int size = list.size();
            int i = 0;
            z3 = false;
            while (true) {
                q60Var = this.f;
                ax5Var = this.a;
                if (i >= size) {
                    break;
                }
                ur2 ur2Var = (ur2) list.get(i);
                long j = ur2Var.d ^ (-9223372034707292160L);
                if (ax5Var.i(ax5Var.e(j)) == RecyclerView.A1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (!z6) {
                    if ((q60Var.c(new kw6(j, ur2Var.a, false)) instanceof wj0) && !z3) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                }
                i++;
            }
            z = true;
            z2 = false;
            long j2 = rp4Var.l ^ (-9223372034707292160L);
            if (kp4Var.f == 12) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (ax5Var.i(ax5Var.e(j2)) == RecyclerView.A1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5 || z4) {
                if (!(q60Var.c(new kw6(j2, rp4Var.b, z4)) instanceof wj0) || z3) {
                    z3 = true;
                }
            }
            if (z3 && !this.d) {
                return z2;
            }
            return z;
        }
        z = true;
        z2 = false;
        z3 = z2;
        if (z3) {
        }
        return z;
    }
}
