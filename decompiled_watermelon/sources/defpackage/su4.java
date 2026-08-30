package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: su4  reason: default package */
/* loaded from: classes.dex */
public final class su4 {
    public static final su4 c = new su4(RecyclerView.A1, new op0(RecyclerView.A1, RecyclerView.A1));
    public final float a;
    public final op0 b;

    public su4(float f, op0 op0Var) {
        this.a = f;
        this.b = op0Var;
        if (!Float.isNaN(f)) {
            return;
        }
        i.i("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof su4) {
            su4 su4Var = (su4) obj;
            if (this.a == su4Var.a && this.b.equals(su4Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
