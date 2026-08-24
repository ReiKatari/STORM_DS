package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gu2  reason: default package */
/* loaded from: classes.dex */
public final class gu2 implements iu2 {
    public final float a;

    public gu2(float f) {
        this.a = f;
        if (om1.a(f, RecyclerView.B1) > 0) {
            return;
        }
        s53.a("Provided min size should be larger than zero.");
    }

    @Override // defpackage.iu2
    public final ArrayList a(qh1 qh1Var, int i, int i2) {
        return hi2.q(i, Math.max((i + i2) / (qh1Var.r0(this.a) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gu2) {
            if (om1.b(this.a, ((gu2) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
