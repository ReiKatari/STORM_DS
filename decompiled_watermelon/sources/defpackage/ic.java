package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ic  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ic implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pc B;

    public /* synthetic */ ic(pc pcVar, int i) {
        this.A = i;
        this.B = pcVar;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        float f = RecyclerView.A1;
        pc pcVar = this.B;
        switch (i) {
            case 0:
                Object value = pcVar.l.getValue();
                if (value == null) {
                    float h = pcVar.j.h();
                    boolean isNaN = Float.isNaN(h);
                    tj4 tj4Var = pcVar.g;
                    if (!isNaN) {
                        return pcVar.c(h, RecyclerView.A1, tj4Var.getValue());
                    }
                    return tj4Var.getValue();
                }
                return value;
            case 1:
                Object value2 = pcVar.l.getValue();
                if (value2 == null) {
                    float h2 = pcVar.j.h();
                    boolean isNaN2 = Float.isNaN(h2);
                    tj4 tj4Var2 = pcVar.g;
                    if (!isNaN2) {
                        Object value3 = tj4Var2.getValue();
                        pt3 d = pcVar.d();
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
                    return tj4Var2.getValue();
                }
                return value2;
            case 2:
                float c2 = pcVar.d().c(pcVar.g.getValue());
                float c3 = pcVar.d().c(pcVar.i.getValue()) - c2;
                float abs = Math.abs(c3);
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float e = (pcVar.e() - c2) / c3;
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
                return pcVar.d();
            case 4:
                return new ti4(pcVar.d(), pcVar.h.getValue());
            case 5:
                return Float.valueOf(pcVar.e());
            default:
                Boolean bool = (Boolean) pcVar.g.getValue();
                bool.getClass();
                return bool;
        }
    }
}
