package defpackage;

import java.util.List;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class sp5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ on2 L;
    public final /* synthetic */ int R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ sp5(String str, j37 j37Var, qn2 qn2Var, on2 on2Var, int i, int i2) {
        this.A = 2;
        this.X = str;
        this.Y = j37Var;
        this.Z = qn2Var;
        this.L = on2Var;
        this.B = i;
        this.R = i2;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.A;
        int i2 = this.R;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.Z;
        Object obj4 = this.Y;
        Object obj5 = this.X;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int a0 = ii2.a0(i2 | 1);
                ge7.l((RewindWindow) obj5, (RewindSaveState) obj4, this.B, (nh2) obj3, this.L, (px0) obj, a0);
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                int a02 = ii2.a0(i2 | 1);
                yh2.e((String) obj5, (List) obj4, this.B, (qn2) obj3, this.L, (px0) obj, a02);
                return jg7Var;
            default:
                ((Integer) obj2).getClass();
                int a03 = ii2.a0(this.B | 1);
                mp2.e((String) obj5, (j37) obj4, (qn2) obj3, this.L, (px0) obj, a03, this.R);
                return jg7Var;
        }
    }

    public /* synthetic */ sp5(Object obj, Object obj2, int i, Object obj3, on2 on2Var, int i2, int i3) {
        this.A = i3;
        this.X = obj;
        this.Y = obj2;
        this.B = i;
        this.Z = obj3;
        this.L = on2Var;
        this.R = i2;
    }
}
