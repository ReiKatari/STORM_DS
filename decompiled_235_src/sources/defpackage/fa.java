package defpackage;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa  reason: default package */
/* loaded from: classes.dex */
public final class fa implements f61 {
    public final f61 a;
    public final float b;

    public fa(float f, f61 f61Var) {
        while (f61Var instanceof fa) {
            f61Var = ((fa) f61Var).a;
            f += ((fa) f61Var).b;
        }
        this.a = f61Var;
        this.b = f;
    }

    @Override // defpackage.f61
    public final float a(RectF rectF) {
        return Math.max((float) RecyclerView.B1, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        if (this.a.equals(faVar.a) && this.b == faVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
