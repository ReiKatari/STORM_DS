package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: no  reason: default package */
/* loaded from: classes.dex */
public final class no extends oo {
    public float a;
    public float b;
    public float c;
    public float d;

    public no(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.oo
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return RecyclerView.A1;
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.oo
    public final int b() {
        return 4;
    }

    @Override // defpackage.oo
    public final oo c() {
        return new no(RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1);
    }

    @Override // defpackage.oo
    public final void d() {
        this.a = RecyclerView.A1;
        this.b = RecyclerView.A1;
        this.c = RecyclerView.A1;
        this.d = RecyclerView.A1;
    }

    @Override // defpackage.oo
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.d = f;
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
        if (obj instanceof no) {
            no noVar = (no) obj;
            if (noVar.a == this.a && noVar.b == this.b && noVar.c == this.c && noVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
