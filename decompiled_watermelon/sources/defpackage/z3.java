package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z3  reason: default package */
/* loaded from: classes.dex */
public final class z3 implements v50 {
    public final float b;
    public final float c;

    public z3(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.v50
    public final float a(float f, float f2, float f3) {
        float f4 = f2 + f;
        float f5 = this.b;
        int i = (f > f5 ? 1 : (f == f5 ? 0 : -1));
        float f6 = this.c;
        if (i >= 0 && f4 <= f3 - f6) {
            return RecyclerView.A1;
        }
        if (f < f5 && f4 > f3 - f6) {
            return RecyclerView.A1;
        }
        if (Math.abs(f + f5) < Math.abs(f4 - (f3 - f6))) {
            return f - f5;
        }
        return (f4 - f3) + f6;
    }
}
