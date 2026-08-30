package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lm4  reason: default package */
/* loaded from: classes.dex */
public final class lm4 implements z21 {
    public final float a;

    public lm4(float f) {
        this.a = f;
        if (f >= RecyclerView.A1 && f <= 100.0f) {
            return;
        }
        pz2.a("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.z21
    public final float a(long j, od1 od1Var) {
        return (this.a / 100.0f) * i76.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lm4) && Float.compare(this.a, ((lm4) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + "%)";
    }
}
