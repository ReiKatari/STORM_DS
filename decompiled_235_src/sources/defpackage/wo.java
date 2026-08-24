package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wo  reason: default package */
/* loaded from: classes.dex */
public final class wo extends ap {
    public float a;

    public wo(float f) {
        this.a = f;
    }

    @Override // defpackage.ap
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return RecyclerView.B1;
    }

    @Override // defpackage.ap
    public final int b() {
        return 1;
    }

    @Override // defpackage.ap
    public final ap c() {
        return new wo(RecyclerView.B1);
    }

    @Override // defpackage.ap
    public final void d() {
        this.a = RecyclerView.B1;
    }

    @Override // defpackage.ap
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wo) && ((wo) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "AnimationVector1D: value = " + this.a;
    }
}
