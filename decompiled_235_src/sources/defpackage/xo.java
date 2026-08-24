package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xo  reason: default package */
/* loaded from: classes.dex */
public final class xo extends ap {
    public float a;
    public float b;

    public xo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.ap
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return RecyclerView.B1;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.ap
    public final int b() {
        return 2;
    }

    @Override // defpackage.ap
    public final ap c() {
        return new xo(RecyclerView.B1, RecyclerView.B1);
    }

    @Override // defpackage.ap
    public final void d() {
        this.a = RecyclerView.B1;
        this.b = RecyclerView.B1;
    }

    @Override // defpackage.ap
    public final void e(int i, float f) {
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.b = f;
            return;
        }
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xo) {
            xo xoVar = (xo) obj;
            if (xoVar.a == this.a && xoVar.b == this.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationVector2D: v1 = " + this.a + ", v2 = " + this.b;
    }
}
