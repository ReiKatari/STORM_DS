package defpackage;

import android.graphics.RenderEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m50  reason: default package */
/* loaded from: classes.dex */
public final class m50 {
    public RenderEffect a;
    public final float b;
    public final float c;
    public final int d;

    public m50(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect == null) {
            float f = this.b;
            int i = (f > RecyclerView.B1 ? 1 : (f == RecyclerView.B1 ? 0 : -1));
            float f2 = this.c;
            if (i != 0 || f2 != RecyclerView.B1) {
                renderEffect = RenderEffect.createBlurEffect(f, f2, u24.G(this.d));
            } else {
                renderEffect = RenderEffect.createOffsetEffect(RecyclerView.B1, RecyclerView.B1);
            }
            this.a = renderEffect;
        }
        return renderEffect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m50) {
                m50 m50Var = (m50) obj;
                if (this.b == m50Var.b && this.c == m50Var.c && this.d == m50Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xg6.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) uj2.d0(this.d)) + ')';
    }
}
