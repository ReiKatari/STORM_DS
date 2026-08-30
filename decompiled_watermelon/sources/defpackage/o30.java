package defpackage;

import android.graphics.RenderEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o30  reason: default package */
/* loaded from: classes.dex */
public final class o30 {
    public RenderEffect a;
    public final float b;
    public final float c;
    public final int d;

    public o30(float f, float f2, int i) {
        this.b = f;
        this.c = f2;
        this.d = i;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.a;
        if (renderEffect == null) {
            float f = this.b;
            int i = (f > RecyclerView.A1 ? 1 : (f == RecyclerView.A1 ? 0 : -1));
            float f2 = this.c;
            if (i != 0 || f2 != RecyclerView.A1) {
                renderEffect = RenderEffect.createBlurEffect(f, f2, iq2.C(this.d));
            } else {
                renderEffect = RenderEffect.createOffsetEffect(RecyclerView.A1, RecyclerView.A1);
            }
            this.a = renderEffect;
        }
        return renderEffect;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o30) {
                o30 o30Var = (o30) obj;
                if (this.b == o30Var.b && this.c == o30Var.c && this.d == o30Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ej6.a(this.c, Float.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.b + ", radiusY=" + this.c + ", edgeTreatment=" + ((Object) nl2.a0(this.d)) + ')';
    }
}
