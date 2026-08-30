package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nw  reason: default package */
/* loaded from: classes.dex */
public final class nw {
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
            return RecyclerView.A1;
        }
        long j3 = this.g;
        if (j3 >= 0 && j >= j3) {
            float f = this.h;
            return (eq3.b(((float) (j - j3)) / this.i, RecyclerView.A1, 1.0f) * f) + (1.0f - f);
        }
        return eq3.b(((float) (j - j2)) / this.a, RecyclerView.A1, 1.0f) * 0.5f;
    }
}
