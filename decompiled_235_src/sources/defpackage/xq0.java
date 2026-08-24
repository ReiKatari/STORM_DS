package defpackage;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq0  reason: default package */
/* loaded from: classes.dex */
public final class xq0 implements f61 {
    public final float a;

    public xq0(float f) {
        this.a = f;
    }

    @Override // defpackage.f61
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.a;
        if (f < RecyclerView.B1) {
            return RecyclerView.B1;
        }
        if (f > min) {
            return min;
        }
        return f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof xq0) && this.a == ((xq0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
