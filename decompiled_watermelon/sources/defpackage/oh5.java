package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oh5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oh5 implements bj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ri5 B;
    public final /* synthetic */ Map L;
    public final /* synthetic */ Map R;
    public final /* synthetic */ mi2 X;
    public final /* synthetic */ mi2 Y;
    public final /* synthetic */ mi2 Z;
    public final /* synthetic */ mi2 c0;

    public /* synthetic */ oh5(ri5 ri5Var, Map map, Map map2, mi2 mi2Var, mi2 mi2Var2, mi2 mi2Var3, mi2 mi2Var4, int i) {
        this.A = i;
        this.B = ri5Var;
        this.L = map;
        this.R = map2;
        this.X = mi2Var;
        this.Y = mi2Var2;
        this.Z = mi2Var3;
        this.c0 = mi2Var4;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        o27 o27Var = o27.a;
        boolean z = false;
        ri5 ri5Var = this.B;
        switch (i) {
            case 0:
                tu0 tu0Var = (tu0) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((th3) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z)) {
                    nk2.d(ri5Var.j, this.L, this.R, this.X, this.Y, null, RecyclerView.A1, this.Z, this.c0, sk2Var, 1572864, 32);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            default:
                tu0 tu0Var2 = (tu0) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((ni3) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z)) {
                    nk2.d(ri5Var.j, this.L, this.R, this.X, this.Y, null, RecyclerView.A1, this.Z, this.c0, sk2Var2, 0, 96);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
        }
    }
}
