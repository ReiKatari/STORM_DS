package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lo  reason: default package */
/* loaded from: classes.dex */
public final class lo extends oo {
    public float a;
    public float b;

    public lo(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    @Override // defpackage.oo
    public final float a(int i) {
        if (i != 0) {
            if (i != 1) {
                return RecyclerView.A1;
            }
            return this.b;
        }
        return this.a;
    }

    @Override // defpackage.oo
    public final int b() {
        return 2;
    }

    @Override // defpackage.oo
    public final oo c() {
        return new lo(RecyclerView.A1, RecyclerView.A1);
    }

    @Override // defpackage.oo
    public final void d() {
        this.a = RecyclerView.A1;
        this.b = RecyclerView.A1;
    }

    @Override // defpackage.oo
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
        if (obj instanceof lo) {
            lo loVar = (lo) obj;
            if (loVar.a == this.a && loVar.b == this.b) {
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
