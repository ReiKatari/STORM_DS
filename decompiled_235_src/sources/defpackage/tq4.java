package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq4  reason: default package */
/* loaded from: classes.dex */
public final class tq4 implements z70 {
    public final ue1 b;
    public final z70 c;
    public final kk3 d;

    public tq4(ue1 ue1Var, z70 z70Var, kk3 kk3Var) {
        this.b = ue1Var;
        this.c = z70Var;
        this.d = kk3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((r9 + r10) > r11) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r9 <= 1.0f) goto L5;
     */
    @Override // defpackage.z70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float a(float f, float f2, float f3) {
        int i;
        int p;
        int i2;
        ue1 ue1Var = this.b;
        vs4 vs4Var = ue1Var.D;
        float a = this.c.a(f, f2, f3);
        boolean z = false;
        if (f <= RecyclerView.B1) {
            float f4 = f + f2;
            of5 of5Var = vq7.a;
        }
        int i3 = (Math.abs(a) > RecyclerView.B1 ? 1 : (Math.abs(a) == RecyclerView.B1 ? 0 : -1));
        kk3 kk3Var = this.d;
        if (i3 != 0 && z) {
            if (kk3Var == kk3.Rtl && ue1Var.m().e == lo4.Horizontal) {
                i2 = ue1Var.p() + (-ue1Var.f);
            } else {
                i2 = ue1Var.f;
            }
            float f5 = i2 * (-1.0f);
            while (a > RecyclerView.B1 && f5 < a) {
                f5 += ue1Var.p();
            }
            while (a < RecyclerView.B1 && f5 > a) {
                f5 -= ue1Var.p();
            }
            return f5;
        } else if (Math.abs(ue1Var.f) < 1.0E-6d) {
            return RecyclerView.B1;
        } else {
            kk3 kk3Var2 = kk3.Rtl;
            if (kk3Var == kk3Var2 && ue1Var.m().e == lo4.Horizontal) {
                i = ue1Var.p() + (-ue1Var.f);
            } else {
                i = ue1Var.f;
            }
            float f6 = i * (-1.0f);
            if (kk3Var == kk3Var2 && ue1Var.m().e == lo4.Horizontal) {
                if (!((Boolean) vs4Var.getValue()).booleanValue()) {
                    p = ue1Var.p();
                    f6 += p;
                }
                return gi2.p(f6, -f3, f3);
            }
            if (((Boolean) vs4Var.getValue()).booleanValue()) {
                p = ue1Var.p();
                f6 += p;
            }
            return gi2.p(f6, -f3, f3);
        }
    }
}
