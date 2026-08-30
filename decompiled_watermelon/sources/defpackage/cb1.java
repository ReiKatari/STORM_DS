package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cb1  reason: default package */
/* loaded from: classes.dex */
public final class cb1 implements dw5 {
    public final /* synthetic */ db1 a;

    public cb1(db1 db1Var) {
        this.a = db1Var;
    }

    @Override // defpackage.dw5
    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return RecyclerView.A1;
        }
        db1 db1Var = this.a;
        float floatValue = ((Number) db1Var.a.n(Float.valueOf(f))).floatValue();
        tj4 tj4Var = db1Var.e;
        boolean z2 = false;
        if (floatValue > RecyclerView.A1) {
            z = true;
        } else {
            z = false;
        }
        tj4Var.setValue(Boolean.valueOf(z));
        tj4 tj4Var2 = db1Var.f;
        if (floatValue < RecyclerView.A1) {
            z2 = true;
        }
        tj4Var2.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
