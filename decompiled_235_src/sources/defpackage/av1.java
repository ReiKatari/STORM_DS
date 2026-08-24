package defpackage;

import android.widget.RadioGroup;
import java.util.LinkedHashMap;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class av1 implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ qn2 c;

    public /* synthetic */ av1(LinkedHashMap linkedHashMap, qn2 qn2Var, int i) {
        this.a = i;
        this.b = linkedHashMap;
        this.c = qn2Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.a;
        qn2 qn2Var = this.c;
        LinkedHashMap linkedHashMap = this.b;
        uu1 uu1Var = (uu1) qn2Var;
        switch (i2) {
            case 0:
                int i3 = EmulatorActivity.Z1;
                radioGroup.getClass();
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i));
                if (num != null) {
                    uu1Var.g(num);
                    return;
                }
                return;
            default:
                int i4 = EmulatorActivity.Z1;
                radioGroup.getClass();
                Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(i));
                if (num2 != null) {
                    uu1Var.g(num2);
                    return;
                }
                return;
        }
    }
}
