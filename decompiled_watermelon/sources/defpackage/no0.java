package defpackage;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: no0  reason: default package */
/* loaded from: classes.dex */
public final class no0 implements y21 {
    public final float a;

    public no0(float f) {
        this.a = f;
    }

    @Override // defpackage.y21
    public final float a(RectF rectF) {
        float min = Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
        float f = this.a;
        if (f < RecyclerView.A1) {
            return RecyclerView.A1;
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
        if ((obj instanceof no0) && this.a == ((no0) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
