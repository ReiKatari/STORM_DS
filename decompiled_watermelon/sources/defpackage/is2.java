package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: is2  reason: default package */
/* loaded from: classes.dex */
public final class is2 implements y26 {
    public static final is2 b = new is2(0);
    public static final is2 c = new is2(1);
    public final /* synthetic */ int a;

    public /* synthetic */ is2(int i) {
        this.a = i;
    }

    @Override // defpackage.y26
    public final jk2 a(long j, sd3 sd3Var, od1 od1Var) {
        switch (this.a) {
            case 0:
                float Y = od1Var.Y(30.0f);
                return new of4(new y55(RecyclerView.A1, -Y, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) + Y));
            case 1:
                float Y2 = od1Var.Y(30.0f);
                return new of4(new y55(-Y2, RecyclerView.A1, Float.intBitsToFloat((int) (j >> 32)) + Y2, Float.intBitsToFloat((int) (j & 4294967295L))));
            default:
                return new of4(yf2.b(0L, j));
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
