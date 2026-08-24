package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: af1  reason: default package */
/* loaded from: classes.dex */
public final class af1 implements p76 {
    public final /* synthetic */ bf1 a;

    public af1(bf1 bf1Var) {
        this.a = bf1Var;
    }

    @Override // defpackage.p76
    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return RecyclerView.B1;
        }
        bf1 bf1Var = this.a;
        float floatValue = ((Number) bf1Var.a.g(Float.valueOf(f))).floatValue();
        vs4 vs4Var = bf1Var.e;
        boolean z2 = false;
        if (floatValue > RecyclerView.B1) {
            z = true;
        } else {
            z = false;
        }
        vs4Var.setValue(Boolean.valueOf(z));
        vs4 vs4Var2 = bf1Var.f;
        if (floatValue < RecyclerView.B1) {
            z2 = true;
        }
        vs4Var2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
