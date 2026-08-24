package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv4  reason: default package */
/* loaded from: classes.dex */
public final class qv4 implements g61 {
    public final float a;

    public qv4(float f) {
        this.a = f;
        if (f >= RecyclerView.B1 && f <= 100.0f) {
            return;
        }
        s53.a("The percent should be in the range of [0, 100]");
    }

    @Override // defpackage.g61
    public final float a(long j, qh1 qh1Var) {
        return (this.a / 100.0f) * xi6.d(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qv4) && Float.compare(this.a, ((qv4) obj).a) == 0) {
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
