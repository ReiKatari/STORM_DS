package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mu1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mu1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ac b;
    public final /* synthetic */ EmulatorActivity c;
    public final /* synthetic */ on2 d;

    public /* synthetic */ mu1(ac acVar, EmulatorActivity emulatorActivity, on2 on2Var) {
        this.b = acVar;
        this.c = emulatorActivity;
        this.d = on2Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Button h;
        int i = this.a;
        on2 on2Var = this.d;
        final EmulatorActivity emulatorActivity = this.c;
        final ac acVar = this.b;
        switch (i) {
            case 0:
                int i2 = EmulatorActivity.Z1;
                if (on2Var != null && (h = acVar.h(-2)) != null) {
                    h.setOnClickListener(new ru1(acVar, emulatorActivity, on2Var, 0));
                }
                Button h2 = acVar.h(-3);
                if (h2 != null) {
                    h2.setOnClickListener(new View.OnClickListener() { // from class: su1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i3 = r3;
                            ac acVar2 = acVar;
                            EmulatorActivity emulatorActivity2 = emulatorActivity;
                            switch (i3) {
                                case 0:
                                    int i4 = EmulatorActivity.Z1;
                                    emulatorActivity2.Q0();
                                    emulatorActivity2.T0(acVar2);
                                    return;
                                default:
                                    int i5 = EmulatorActivity.Z1;
                                    emulatorActivity2.Q0();
                                    emulatorActivity2.T0(acVar2);
                                    return;
                            }
                        }
                    });
                }
                Button h3 = acVar.h(-1);
                if (h3 != null) {
                    h3.setOnClickListener(new tu1(emulatorActivity, 0));
                }
                emulatorActivity.T0(acVar);
                return;
            default:
                int i3 = EmulatorActivity.Z1;
                Button h4 = acVar.h(-2);
                if (h4 != null) {
                    h4.setOnClickListener(new ru1(acVar, emulatorActivity, on2Var, 1));
                }
                Button h5 = acVar.h(-3);
                if (h5 != null) {
                    h5.setOnClickListener(new View.OnClickListener() { // from class: su1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i32 = r3;
                            ac acVar2 = acVar;
                            EmulatorActivity emulatorActivity2 = emulatorActivity;
                            switch (i32) {
                                case 0:
                                    int i4 = EmulatorActivity.Z1;
                                    emulatorActivity2.Q0();
                                    emulatorActivity2.T0(acVar2);
                                    return;
                                default:
                                    int i5 = EmulatorActivity.Z1;
                                    emulatorActivity2.Q0();
                                    emulatorActivity2.T0(acVar2);
                                    return;
                            }
                        }
                    });
                }
                Button h6 = acVar.h(-1);
                if (h6 != null) {
                    h6.setOnClickListener(new tu1(emulatorActivity, 2));
                }
                emulatorActivity.T0(acVar);
                return;
        }
    }

    public /* synthetic */ mu1(on2 on2Var, ac acVar, EmulatorActivity emulatorActivity) {
        this.d = on2Var;
        this.b = acVar;
        this.c = emulatorActivity;
    }
}
