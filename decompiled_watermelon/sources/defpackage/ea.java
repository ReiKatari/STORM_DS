package defpackage;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ea  reason: default package */
/* loaded from: classes.dex */
public final class ea implements y21 {
    public final y21 a;
    public final float b;

    public ea(float f, y21 y21Var) {
        while (y21Var instanceof ea) {
            y21Var = ((ea) y21Var).a;
            f += ((ea) y21Var).b;
        }
        this.a = y21Var;
        this.b = f;
    }

    @Override // defpackage.y21
    public final float a(RectF rectF) {
        return Math.max((float) RecyclerView.A1, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea)) {
            return false;
        }
        ea eaVar = (ea) obj;
        if (this.a.equals(eaVar.a) && this.b == eaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
