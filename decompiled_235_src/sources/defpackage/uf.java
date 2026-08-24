package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uf implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ float B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ uf(nh7 nh7Var, float f, qn2 qn2Var) {
        this.A = 2;
        this.L = nh7Var;
        this.B = f;
        this.R = qn2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0089, code lost:
        if (r0 > r4) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        if (r0 < r4) goto L18;
     */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        float floatValue;
        long F;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        float f = RecyclerView.B1;
        Object obj2 = this.R;
        float f2 = this.B;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                zh zhVar = (zh) obj3;
                z40 z40Var = (z40) obj2;
                um3 um3Var = (um3) obj;
                um3Var.b();
                zj0 zj0Var = um3Var.A;
                bt btVar = zj0Var.B;
                long L = btVar.L();
                btVar.G().h();
                try {
                    os0 os0Var = (os0) btVar.B;
                    os0Var.g0(f2, RecyclerView.B1);
                    os0Var.e0(45.0f, 0L);
                    zj0Var.f(zhVar, z40Var);
                    return jg7Var;
                } finally {
                    xg6.v(btVar, L);
                }
            case 1:
                ah5 ah5Var = (ah5) obj3;
                lr3 lr3Var = (lr3) obj2;
                so soVar = (so) obj;
                if (f2 > RecyclerView.B1) {
                    floatValue = ((Number) soVar.e.getValue()).floatValue();
                    break;
                } else if (f2 < RecyclerView.B1) {
                    floatValue = ((Number) soVar.e.getValue()).floatValue();
                    break;
                }
                float f3 = f - ah5Var.A;
                if (f3 != lr3Var.a(f3) || f != ((Number) soVar.e.getValue()).floatValue()) {
                    soVar.a();
                }
                ah5Var.A += f3;
                return jg7Var;
            default:
                nh7 nh7Var = (nh7) obj3;
                qn2 qn2Var = (qn2) obj2;
                long longValue = ((Long) obj).longValue();
                if (nh7Var.b == Long.MIN_VALUE) {
                    nh7Var.b = longValue;
                }
                float f4 = nh7Var.e;
                wo woVar = new wo(f4);
                int i2 = (f2 > RecyclerView.B1 ? 1 : (f2 == RecyclerView.B1 ? 0 : -1));
                wo woVar2 = nh7.f;
                if (i2 == 0) {
                    F = nh7Var.a.b(new wo(f4), woVar2, nh7Var.c);
                } else {
                    F = u24.F(((float) (longValue - nh7Var.b)) / f2);
                }
                long j = F;
                float f5 = ((wo) nh7Var.a.q(j, woVar, woVar2, nh7Var.c)).a;
                nh7Var.c = (wo) nh7Var.a.h(j, woVar, woVar2, nh7Var.c);
                nh7Var.b = longValue;
                nh7Var.e = f5;
                qn2Var.g(Float.valueOf(nh7Var.e - f5));
                return jg7Var;
        }
    }

    public /* synthetic */ uf(float f, Object obj, Object obj2, int i) {
        this.A = i;
        this.B = f;
        this.L = obj;
        this.R = obj2;
    }
}
