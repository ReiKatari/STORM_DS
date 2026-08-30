package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: co2  reason: default package */
/* loaded from: classes.dex */
public final class co2 implements eo2 {
    public final float a;

    public co2(float f) {
        this.a = f;
        if (ji1.a(f, RecyclerView.A1) > 0) {
            return;
        }
        pz2.a("Provided min size should be larger than zero.");
    }

    @Override // defpackage.eo2
    public final ArrayList a(od1 od1Var, int i, int i2) {
        return oo2.p(i, Math.max((i + i2) / (od1Var.Y(this.a) + i2), 1), i2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof co2) {
            if (ji1.b(this.a, ((co2) obj).a)) {
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
