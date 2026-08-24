package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zo  reason: default package */
/* loaded from: classes.dex */
public final class zo extends ap {
    public float a;
    public float b;
    public float c;
    public float d;

    public zo(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    @Override // defpackage.ap
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return RecyclerView.B1;
                    }
                    return this.d;
                }
                return this.c;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.ap
    public final int b() {
        return 4;
    }

    @Override // defpackage.ap
    public final ap c() {
        return new zo(RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1);
    }

    @Override // defpackage.ap
    public final void d() {
        this.a = RecyclerView.B1;
        this.b = RecyclerView.B1;
        this.c = RecyclerView.B1;
        this.d = RecyclerView.B1;
    }

    @Override // defpackage.ap
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
        if (obj instanceof zo) {
            zo zoVar = (zo) obj;
            if (zoVar.a == this.a && zoVar.b == this.b && zoVar.c == this.c && zoVar.d == this.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.a + ", v2 = " + this.b + ", v3 = " + this.c + ", v4 = " + this.d;
    }
}
