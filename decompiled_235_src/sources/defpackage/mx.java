package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx  reason: default package */
/* loaded from: classes.dex */
public final class mx {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long j) {
        long j2 = this.e;
        if (j < j2) {
            return RecyclerView.B1;
        }
        long j3 = this.g;
        if (j3 >= 0 && j >= j3) {
            float f = this.h;
            return (fx3.b(((float) (j - j3)) / this.i, RecyclerView.B1, 1.0f) * f) + (1.0f - f);
        }
        return fx3.b(((float) (j - j2)) / this.a, RecyclerView.B1, 1.0f) * 0.5f;
    }
}
