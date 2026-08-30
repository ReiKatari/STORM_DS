package defpackage;

import android.widget.RadioGroup;
import java.util.LinkedHashMap;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mq1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mq1 implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedHashMap b;
    public final /* synthetic */ mi2 c;

    public /* synthetic */ mq1(LinkedHashMap linkedHashMap, mi2 mi2Var, int i) {
        this.a = i;
        this.b = linkedHashMap;
        this.c = mi2Var;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.a;
        mi2 mi2Var = this.c;
        LinkedHashMap linkedHashMap = this.b;
        gq1 gq1Var = (gq1) mi2Var;
        switch (i2) {
            case 0:
                int i3 = EmulatorActivity.P1;
                radioGroup.getClass();
                Integer num = (Integer) linkedHashMap.get(Integer.valueOf(i));
                if (num != null) {
                    gq1Var.n(num);
                    return;
                }
                return;
            default:
                int i4 = EmulatorActivity.P1;
                radioGroup.getClass();
                Integer num2 = (Integer) linkedHashMap.get(Integer.valueOf(i));
                if (num2 != null) {
                    gq1Var.n(num2);
                    return;
                }
                return;
        }
    }
}
