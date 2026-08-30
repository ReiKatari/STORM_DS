package defpackage;

import java.util.List;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vf5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vf5 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ ki2 L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ vf5(String str, uq6 uq6Var, mi2 mi2Var, ki2 ki2Var, int i, int i2) {
        this.A = 2;
        this.X = str;
        this.Y = uq6Var;
        this.Z = mi2Var;
        this.L = ki2Var;
        this.B = i;
        this.R = i2;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        int i2 = this.R;
        o27 o27Var = o27.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int I = ep2.I(i2 | 1);
                ct3.E((RewindWindow) obj5, (RewindSaveState) obj4, this.B, (wc2) obj3, this.L, (tu0) obj, I);
                return o27Var;
            case 1:
                ((Integer) obj2).getClass();
                int I2 = ep2.I(i2 | 1);
                yf2.d((String) obj5, (List) obj4, this.B, (mi2) obj3, this.L, (tu0) obj, I2);
                return o27Var;
            default:
                ((Integer) obj2).getClass();
                int I3 = ep2.I(this.B | 1);
                ep2.f((String) obj5, (uq6) obj4, (mi2) obj3, this.L, (tu0) obj, I3, this.R);
                return o27Var;
        }
    }

    public /* synthetic */ vf5(Object obj, Object obj2, int i, Object obj3, ki2 ki2Var, int i2, int i3) {
        this.A = i3;
        this.X = obj;
        this.Y = obj2;
        this.B = i;
        this.Z = obj3;
        this.L = ki2Var;
        this.R = i2;
    }
}
