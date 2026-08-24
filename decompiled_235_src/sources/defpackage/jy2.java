package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jy2  reason: default package */
/* loaded from: classes.dex */
public final class jy2 implements ke6 {
    public static final jy2 b = new jy2(0);
    public static final jy2 c = new jy2(1);
    public final /* synthetic */ int a;

    public /* synthetic */ jy2(int i) {
        this.a = i;
    }

    @Override // defpackage.ke6
    public final mp2 a(long j, kk3 kk3Var, qh1 qh1Var) {
        switch (this.a) {
            case 0:
                float r0 = qh1Var.r0(30.0f);
                return new qo4(new of5(RecyclerView.B1, -r0, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + r0));
            case 1:
                float r02 = qh1Var.r0(30.0f);
                return new qo4(new of5(-r02, RecyclerView.B1, Float.intBitsToFloat((int) (j >> 32)) + r02, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new qo4(kj2.b(0L, j));
        }
    }

    public String toString() {
        switch (this.a) {
            case 2:
                return "RectangleShape";
            default:
                return super.toString();
        }
    }
}
