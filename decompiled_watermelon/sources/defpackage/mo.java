package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mo  reason: default package */
/* loaded from: classes.dex */
public final class mo extends oo {
    public float a;
    public float b;
    public float c;

    public mo(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.oo
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return RecyclerView.A1;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.oo
    public final int b() {
        return 3;
    }

    @Override // defpackage.oo
    public final oo c() {
        return new mo(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
    }

    @Override // defpackage.oo
    public final void d() {
        this.a = RecyclerView.A1;
        this.b = RecyclerView.A1;
        this.c = RecyclerView.A1;
    }

    @Override // defpackage.oo
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                this.c = f;
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mo) {
            mo moVar = (mo) obj;
            if (moVar.a == this.a && moVar.b == this.b && moVar.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ej6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
