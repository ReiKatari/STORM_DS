package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a4  reason: default package */
/* loaded from: classes.dex */
public final class a4 implements z70 {
    public final float b;
    public final float c;

    public a4(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.z70
    public final float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        float f5 = this.b;
        int i = (f > f5 ? 1 : (f == f5 ? 0 : -1));
        float f6 = this.c;
        if (i >= 0 && f4 <= f3 - f6) {
            return RecyclerView.B1;
        }
        if (f < f5 && f4 > f3 - f6) {
            return RecyclerView.B1;
        }
        if (Math.abs(f + f5) < Math.abs(f4 - (f3 - f6))) {
            return f - f5;
        }
        return (f4 - f3) + f6;
    }
}
