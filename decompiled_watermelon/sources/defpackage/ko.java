package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ko  reason: default package */
/* loaded from: classes.dex */
public final class ko extends oo {
    public float a;

    public ko(float f) {
        this.a = f;
    }

    @Override // defpackage.oo
    public final float a(int i) {
        if (i == 0) {
            return this.a;
        }
        return RecyclerView.A1;
    }

    @Override // defpackage.oo
    public final int b() {
        return 1;
    }

    @Override // defpackage.oo
    public final oo c() {
        return new ko(RecyclerView.A1);
    }

    @Override // defpackage.oo
    public final void d() {
        this.a = RecyclerView.A1;
    }

    @Override // defpackage.oo
    public final void e(int i, float f) {
        if (i == 0) {
            this.a = f;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ko) && ((ko) obj).a == this.a) {
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
