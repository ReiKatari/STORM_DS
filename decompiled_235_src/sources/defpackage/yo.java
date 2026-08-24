package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yo  reason: default package */
/* loaded from: classes.dex */
public final class yo extends ap {
    public float a;
    public float b;
    public float c;

    public yo(float f, float f2, float f3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
    }

    @Override // defpackage.ap
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return RecyclerView.B1;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.ap
    public final int b() {
        return 3;
    }

    @Override // defpackage.ap
    public final ap c() {
        return new yo(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
    }

    @Override // defpackage.ap
    public final void d() {
        this.a = RecyclerView.B1;
        this.b = RecyclerView.B1;
        this.c = RecyclerView.B1;
    }

    @Override // defpackage.ap
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
        if (obj instanceof yo) {
            yo yoVar = (yo) obj;
            if (yoVar.a == this.a && yoVar.b == this.b && yoVar.c == this.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + xg6.a(this.b, Float.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "AnimationVector3D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c;
    }
}
