package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c24  reason: default package */
/* loaded from: classes.dex */
public final class c24 {
    public float a = RecyclerView.A1;
    public float b = RecyclerView.A1;
    public float c = RecyclerView.A1;
    public float d = RecyclerView.A1;

    public final void a(float f, float f2, float f3, float f4) {
        this.a = Math.max(f, this.a);
        this.b = Math.max(f2, this.b);
        this.c = Math.min(f3, this.c);
        this.d = Math.min(f4, this.d);
    }

    public final boolean b() {
        boolean z;
        boolean z2 = false;
        if (this.a >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (this.b >= this.d) {
            z2 = true;
        }
        return z | z2;
    }

    public final void c(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        this.a += intBitsToFloat;
        this.b += intBitsToFloat2;
        this.c += intBitsToFloat;
        this.d += intBitsToFloat2;
    }

    public final String toString() {
        return "MutableRect(" + nl2.b0(this.a) + ", " + nl2.b0(this.b) + ", " + nl2.b0(this.c) + ", " + nl2.b0(this.d) + ')';
    }
}
