package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ei5  reason: default package */
/* loaded from: classes.dex */
public final class ei5 implements f61 {
    public final float a;

    public ei5(float f) {
        this.a = f;
    }

    @Override // defpackage.f61
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ei5) && this.a == ((ei5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }

    public final String toString() {
        return lb1.o(new StringBuilder(), (int) (this.a * 100.0f), "%");
    }
}
