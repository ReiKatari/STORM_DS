package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ dd B;

    public /* synthetic */ wc(dd ddVar, int i) {
        this.A = i;
        this.B = ddVar;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        float f = RecyclerView.B1;
        dd ddVar = this.B;
        switch (i) {
            case 0:
                Object value = ddVar.l.getValue();
                if (value == null) {
                    float h = ddVar.j.h();
                    boolean isNaN = Float.isNaN(h);
                    vs4 vs4Var = ddVar.g;
                    if (!isNaN) {
                        return ddVar.c(h, RecyclerView.B1, vs4Var.getValue());
                    }
                    return vs4Var.getValue();
                }
                return value;
            case 1:
                Object value2 = ddVar.l.getValue();
                if (value2 == null) {
                    float h2 = ddVar.j.h();
                    boolean isNaN2 = Float.isNaN(h2);
                    vs4 vs4Var2 = ddVar.g;
                    if (!isNaN2) {
                        Object value3 = vs4Var2.getValue();
                        s04 d = ddVar.d();
                        float c = d.c(value3);
                        int i2 = (c > h2 ? 1 : (c == h2 ? 0 : -1));
                        if (i2 != 0 && !Float.isNaN(c)) {
                            if (i2 < 0) {
                                Object b = d.b(h2, true);
                                if (b != null) {
                                    return b;
                                }
                            } else {
                                Object b2 = d.b(h2, false);
                                if (b2 != null) {
                                    return b2;
                                }
                            }
                        }
                        return value3;
                    }
                    return vs4Var2.getValue();
                }
                return value2;
            case 2:
                float c2 = ddVar.d().c(ddVar.g.getValue());
                float c3 = ddVar.d().c(ddVar.i.getValue()) - c2;
                float abs = Math.abs(c3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float e = (ddVar.e() - c2) / c3;
                    if (e >= 1.0E-6f) {
                        if (e <= 0.999999f) {
                            f = e;
                        }
                    }
                    return Float.valueOf(f);
                }
                f = 1.0f;
                return Float.valueOf(f);
            case 3:
                return ddVar.d();
            case 4:
                return new vr4(ddVar.d(), ddVar.h.getValue());
            case 5:
                return Float.valueOf(ddVar.e());
            default:
                Boolean bool = (Boolean) ddVar.g.getValue();
                bool.getClass();
                return bool;
        }
    }
}
